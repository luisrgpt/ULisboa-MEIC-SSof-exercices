package org.homeunix.wap.utils;

import java.io.File;
import java.io.IOException;
import net.sf.javaml.classification.Classifier;
import net.sf.javaml.core.Dataset;
import net.sf.javaml.tools.data.FileHandler;
import net.sf.javaml.tools.weka.WekaClassifier;
import weka.classifiers.functions.Logistic;
import weka.classifiers.trees.RandomTree;
import weka.classifiers.rules.JRip;
//import weka.filters.supervised.instance.SMOTE;
import weka.classifiers.functions.SMO;
import weka.classifiers.functions.supportVector.PolyKernel;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class with global variables of the application
 * 
 * @author iberiam
 */
public class GlobalDataApp {
    /**
     * args Flags
     * index 0: presence of -a
     *          analysis without automatic correction
     * index 1: presence of -p
     *          analysis of a project
     * index 2: presence of files
     *          analysis of one or more php files
     * index 3: presence of -sqli
     *          SQLI analysis
     * index 4: presence of -out
     *          stdout forward to output file
     * index 5: presence of -s
     *          show only global summary
     * index 6: presence of -ci
     *          RFI/LFI/DT SCD, OS, Eval analysis 
     * index 7: presence of -xss
     *          XSS Reflected, Store and DOM??
     * index 8: presence of --dbms <dbms>
     *          select DBMS: db2, PostgreSQL, MySQL. If not specify any, MySQL is selected
     *          -dbms mysql; -dbms bd2; -dbms pg
     * index 9: presence of -all
     *          presence of all types of detection
     * index 10: presence of -ldapi
     *          LDAP analysis
     */
    public static int args_flags[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static int numAnalysis = 0;
    public static String dbms = "mysql";
    public static Classifier cf_lr;
    public static Boolean isWindows = false;

    /*
     * Load dataset and build classifier to data mining
     */
    public static Classifier loadClassifier(String nameClassifier) throws IOException{
       // PARA MODIFICAR DEPOIS =================
        
        Classifier javaml = null;
        
        /* Load the data set */
        // VERSAO FINAL
        Dataset data;
        if (nameClassifier.equals("svm") == true)
            data = FileHandler.loadDataset(new File("data" + File.separator + "dataset_balanced.data"), 15, ",");
        else
            data = FileHandler.loadDataset(new File("data" + File.separator + "dataset.data"), 15, ",");
        
        
        //Dataset data = FileHandler.loadDataset(new File(".." + File.separator + "data" + File.separator + "dataset.data"), 15, ",");
               
        // Create Weka classifier
        if (nameClassifier.equals("lr") == true){
            Logistic lr = new weka.classifiers.functions.Logistic();
            lr.setDebug(false);
            lr.setMaxIts(-1);
            lr.setRidge(1.0E-8);

            // Wrap Weka classifier in bridge 
            Classifier javaml_lr = new WekaClassifier(lr);
            
            // Build the classifier         
            javaml_lr.buildClassifier(data);
            javaml = javaml_lr;
        }
        

        
        return javaml;
    }
}
