/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.homeunix.wap.ldapi;

import org.homeunix.wap.table.symbol.*;
import org.homeunix.wap.table.tainted.ListVulners;
import org.homeunix.wap.table.tainted.MethodTaintedTable;
import org.homeunix.wap.table.tainted.TaintedTable;
import org.homeunix.wap.table.tainted.UntaintedTable;
import org.homeunix.wap.utils.LinesToCorrect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author iberiam
 */
public class GlobalDataLDAPi {
    // user input
    private final static String UserInputs[] = {"_GET", "_POST", "_COOKIE", "_REQUEST", "HTTP_GET_VARS", "HTTP_POST_VARS", "HTTP_COOKIE_VARS", "HTTP_REQUEST_VARS"};
    public static List<String> UserInput = Arrays.asList(UserInputs);

    // functions where can occur LDAPi (that receive a filter and/or a dn)
    private final static String TaintFunctions[] = {"ldap_search", "ldap_add", "ldap_compare", "ldap_delete", "ldap_list", "ldap_mod_add",
                                "ldap_mod_del", "ldap_mod_replace", "ldap_modify_batch", "ldap_modify", "ldap_read", "ldap_rename", "ldap_bind", "ldap_sasl_bind"};
    public static List<String> LDAPIFunctions = Arrays.asList(TaintFunctions);

    // functions that make secure the user input
    private final static String SecureFunctions[] = {"ldap_escape"};
    public static List<String> LDAPSecFunctions = Arrays.asList(SecureFunctions);

    // functions to connect to service
    private final static String ConnectFunctions[] = {"ldap_connect"};
    public static List<String> LDAPConnectFunctions = Arrays.asList(ConnectFunctions);

    // functions to perform bind
    private final static String SelectDbFunctions[] = {};
    public static List<String> LDAPSelectDbFunctions = Arrays.asList(SelectDbFunctions);
    
    // ldap keywords (Not used)
    private final static String clausules[] = {"(&", "(|" };
    public static List<String> LDAPKeywords = Arrays.asList(clausules);

    // create main Tables
    public static Map <String, SymbolTable> MainSymbolTable = new LinkedHashMap<String, SymbolTable>();
    public static Map <String, SymbolTable> MainIncludeFilesTable = new LinkedHashMap<String, SymbolTable>();
    public static Map <String, MethodTable> MainFunctionsTable = new LinkedHashMap<String, MethodTable>();
    public static Map <String, MethodTableCalls> MainFunctionsCallsTable = new LinkedHashMap<String, MethodTableCalls>();
    public static Map <String, ClassTable> MainClassesTable = new LinkedHashMap<String, ClassTable>();
    public static Map <String, InstanceTable> MainInstancesTable = new LinkedHashMap<String, InstanceTable>();
    public static Map <String, TaintedTable> MainTaintedTable = new LinkedHashMap<String, TaintedTable>();
    public static Map <String, MethodTaintedTable> MainFunctionsTaintedTable = new LinkedHashMap<String, MethodTaintedTable>();
    public static UntaintedTable mus = new UntaintedTable();
    public static Map <String, LinesToCorrect> MainLinesToCorrect = new LinkedHashMap<String, LinesToCorrect>();
    public static Map <String, Integer> MainNumVul = new LinkedHashMap<String, Integer>();
    public static Map <String, ListVulners> MainListVulners = new LinkedHashMap<String, ListVulners>();
    public static VulnerLDAPI currentVulner = null;
    public static Map <String, Integer> MainNumFP = new LinkedHashMap<String, Integer>();

    /*
     * Verify if symbol name contain tainted input
     */
    public static String containsInput(String f){
        //Verificar se f tem UserInput
        String found = "";
        for (String aux : GlobalDataLDAPi.UserInput){
                if (f.contains(aux) == true){
                    return aux;
                }
        }
        return found;
    }

}
