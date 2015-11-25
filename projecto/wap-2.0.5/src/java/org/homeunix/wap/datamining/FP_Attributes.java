/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.homeunix.wap.datamining;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sf.javaml.core.*;
import net.sf.javaml.core.DenseInstance;
import org.homeunix.wap.sqli.GlobalDataSqli;
import org.homeunix.wap.table.tainted.Vulner;
import org.homeunix.wap.utils.GlobalDataApp;

/**
 *
 * @author iberiam
 */
public class FP_Attributes {
    /*
     * Slice: trecho de código que começa no entry point e acaba na sensitive sink
     * Caminho: subsequência de um slide só com as instruções que propagam a taintedness
     *
     * ** Attributos **
     * == SQL ==
     * 00 AgregatedFunction: avg, count, max, min, sum
     * 01 From
     * 02 IsNum
     * 03 ComplexSQL

     *
     * == String Manipulation ==
     * 04 Substring
     * 05 Concatenation
     * 06 AddChar    
     * 07 SubstringReplace
     * 07 ReplaceStr
     * 08 ErrorFunction    
     * 09 TrimFunction
     *    String_split      // nao implementada
     *    String_suffle     // nao implementada
     *
     * == Validation ==
     * 10 TypeChecking: is_string, is_int, is_float, is_numeric
     * 11 IsSet    
     * 12 PatternControl
     * 13 WhiteList
     * 14 BlackList
     * 
     * == Class ==
     * Yes: False Positive 
     * No: Real Vulnerability
     * 
     */
     
    double[] attributes;
    //String[] classe = {"FP", "Real VV"};
    
    /* CONSTRUCTOR */
    public FP_Attributes(Boolean IsSQLI){
        if (IsSQLI == true)
            this.attributes = new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        else
            this.attributes = new double[] {2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    /* METHODS */
    private double getValueOfAttribute(int index){
        return this.attributes[index];
    }
 
    private void setValueOfAttribute(int index){
        this.attributes[index] = 1;
    }

    public double[] getAttributes(){
        return this.attributes;
    }

    public void collectAttributes(String codeline, int lineCodeline, String fileCodeline, Boolean IsSQLI, Vulner vul){
        int i = 0, j = 0, k = 0;
        List <String> inp = this.getInputsOfCodeline(fileCodeline, lineCodeline, vul);
        
        if (IsSQLI == true)
            i = this.haveSQL(codeline, inp);
        
        j = this.haveStringManipulation(codeline, inp);
        k = this.haveValidation(codeline, inp);
        
        if (i+j+k > 0){
            vul.getLinesOfFP().add(lineCodeline);
        }
    }
    
    private int haveSQL(String codeline, List inp){
        int found = 0;
        boolean is_num = false;
        String upper = codeline.toUpperCase();
        String sql_key;
        int i, index, j = 0, ind_where = -1, ind_from = -1, ii;
        Iterator <String> it = GlobalDataSqli.SQLKeywords.listIterator();
        for (;it.hasNext();){
            sql_key = it.next();
            if (upper.contains(sql_key) == true){
                if (sql_key.equals("WHERE") == true)
                    ind_where = upper.indexOf(sql_key);
                if (sql_key.equals("FROM") == true)
                    ind_from = upper.indexOf(sql_key);
                j++;
            }
        }
        
        if (j > 1){ // Para index 0, 1 e 2
            // Para index 0 e 1
            for (Map.Entry<String, Integer> sql_att : GlobalDataDatamining.SQLAttributes.entrySet()){
                if (upper.contains(sql_att.getKey()) == true){
                    j = upper.indexOf(sql_att.getKey()) + sql_att.getKey().length();
                    i = -1;
                    for (ii = 0; ii < inp.size(); ii++){
                        i = codeline.indexOf((String)inp.get(ii));
                        if (i > j){
                            if (i < ind_from && sql_att.getKey().equals("FROM") == false){ // aggregated functions
                                index = sql_att.getValue();
                                this.setValueOfAttribute(index);
                                found = 1;
                            }
                            
                            // FROM
                            if (sql_att.getKey().equals("FROM") == true && (i < ind_where || ind_where == -1)){
                                index = sql_att.getValue();
                                this.setValueOfAttribute(index);
                                found = 1;                            
                            }
                                
                        }
                        
                    }
                }
            }
            
            // Para index 2            
            if (ind_where > -1){
                i = -1;
                int iii = -1;
                String input;
                for (ii = 0; ii < inp.size(); ii++){
                    input = (String)inp.get(ii);
                    i = codeline.indexOf(input);

                    if (i > ind_where){
                        iii = i + input.length();
                        try{
                            // ver nas substrings de 6 chars antes e apos o input
                            String substr_before = codeline.substring(i-6, i-1);
                            String substr_after = codeline.substring(iii+1, iii+6);
                            it = GlobalDataDatamining.SQLOperators_aritm.listIterator();
                            for (;it.hasNext();){
                                sql_key = it.next();
                                if (substr_before.contains(sql_key) == true || substr_after.contains(sql_key) == true){
                                    this.setValueOfAttribute(2);
                                    found = 1;
                                    is_num = true;
                                    break;
                                }
                            }
                            
                            it = GlobalDataDatamining.SQLOperators_comp.listIterator();
                            for (;it.hasNext();){
                                sql_key = it.next();
                                if (substr_before.contains(sql_key) == true || substr_after.contains(sql_key) == true){
                                    this.setValueOfAttribute(2);
                                    found = 1;
                                    is_num = true;
                                    break;
                                }
                            }                            
                        }catch (Exception e){}
                    }
                    
                    if (is_num == true)
                        break;
                }
            }
            
            
            
        }
            // Para index 3
            if (codeline.length() > 250){
                this.setValueOfAttribute(3);
                found = 1;
            }
        
        return found;
    }

    private int haveStringManipulation(String codeline, List inp){       
        int found = 0;        
        int i, j, k, open_square_brace, index, ii;
        char chars[];
        String aux;
        
        // Para index 4 a 9 sem concatenation
        for (Map.Entry<String, Integer> str_att : GlobalDataDatamining.StringAttributes.entrySet()){          
            if (codeline.contains(str_att.getKey()) == true){
                j = codeline.indexOf(str_att.getKey());
                aux = codeline.substring(j);
                j = str_att.getKey().length()+1;
                k = 0;
                chars = aux.substring(j).toCharArray();
                open_square_brace = 1;
                while (open_square_brace != 0){
                    if (chars[k] == '(')
                        open_square_brace++;
                    if (chars[k] == ')')
                        open_square_brace--;
                    k++;
                }                                
                i = -1;
                String a;
                for (ii = 0; ii < inp.size(); ii++){
                    i = aux.indexOf((String) inp.get(ii));                     
                    if (i >= j && i < j+k){
                        index = str_att.getValue();                        
                        this.setValueOfAttribute(index);
                        found = 1;
                    }
                }
            }
        }
        
        // Para a concatenacao
        if (codeline.contains(".") == true){
            this.setValueOfAttribute(5);
            found = 1;        
        }
        
        return found;
    }    
    
    private int haveValidation(String codeline, List inp){
        int found = 0;
        int i, j, k, open_square_brace, index, ii;
        char chars[];
        String aux;
        
        // Para index 10 a 12
        for (Map.Entry<String, Integer> val_att : GlobalDataDatamining.ValidationAttributes.entrySet()){
            if (codeline.contains(val_att.getKey()) == true){
                j = codeline.indexOf(val_att.getKey());
                aux = codeline.substring(j);
                j = val_att.getKey().length()+1;
                k = 0;
                chars = aux.substring(j).toCharArray();
                open_square_brace = 1;
                while (open_square_brace != 0){
                    if (chars[k] == '(')
                        open_square_brace++;
                    if (chars[k] == ')')
                        open_square_brace--;
                    k++;
                }                

                i = -1;
                for (ii = 0; ii < inp.size(); ii++){
                    i = aux.indexOf((String)inp.get(ii));
                    if (i >= j && i < j+k){
                        index = val_att.getValue();
                        this.setValueOfAttribute(index);
                        found = 1;
                    }
                }
            }
        }
        
       
        return found;
    }    
    
    private List getInputsOfCodeline (String fileCodeline, int lineCodeLine, Vulner vul){
        List <String> inp = new ArrayList<String>();
        int i, j = 0, v;
        Integer k;
        String a;
        
        for (i = 0; i < vul.getFileTaintedinputs().size(); i++){
            a = (String) vul.getFileTaintedinputs().get(i);
            k = (Integer) vul.getLineTaintedinputs().get(i);
            v = k.intValue();
            if (a.equals(fileCodeline) == true && lineCodeLine == v){
                inp.add((String) vul.getTaintedinputs().get(i));
            }    
        }
        
        return inp;
    }
    
    private int getSumOfAttributes(){
        int sum = 0;
        for (int i = 0; i < this.attributes.length; i++){
            sum += attributes[i];
        }
              
        return sum;
    }    
    
    public int predictFalsePositive(Boolean IsSQLI) throws IOException{
        int fp;       
        int sum_att = this.getSumOfAttributes();
        
        if (IsSQLI == true){
            if (sum_att == 0)
                return 0; // is a real vv           
        }
        else{
            if (sum_att == 8)
                return 0; // is a real vv
        }

        
        /* predict fp with machine learning
         * 1. Logistic Regression
         */
        
        /* Create the instance to classify */
        Instance instance = new DenseInstance(this.attributes);
        
        int result_fp = 0;
        fp = this.applyClassifier("lr", instance);
        if (fp == 1)
            return 1;
        else
            return 0;
    }
    
    private int applyClassifier(String nameClassifier, Instance inst) throws IOException{
        int classe;
        
        /* Create the instance to classify */
        //Instance instance = new DenseInstance(this.attributes);
        
        // Classify the instance 
        Object predictedClassValue = "No";
        if (nameClassifier.equals("lr") == true)
            predictedClassValue = GlobalDataApp.cf_lr.classify(inst);
                
        if (predictedClassValue.equals("Yes"))
            classe = 1;
        else
            classe = 0;
        
        return classe;
    
    }


}
