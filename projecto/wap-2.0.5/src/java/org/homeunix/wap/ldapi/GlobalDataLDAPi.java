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

    // functions where can occur LDAPI
    // functions deprecated: myldap_db_query, myldapi_execute, myldapi_master_query
    private final static String TaintFunctions[] = {"ldap_search"};
    /* "myldapi_stmt_execute", "execute" */
    public static List<String> LDAPIFunctions = Arrays.asList(TaintFunctions);

    // functions that make secure the user input
    // functions deprecated: myldapi_bind_param, myldap_escape_string, myldapi_escape_string
    private final static String SecureFunctions[] = {"myldap_escape_string", "myldap_real_escape_string", "myldapi_escape_string", "myldapi_real_escape_string",
                                "myldapi_stmt_bind_param", "escape_string", "real_escape_string", "bind_param",
                                "db2_escape_string", "pg_escape_string", "pg_escape_bytea", "pg_escape_literal", "san_ldapi"};
    //private final static String SecureFunctions[] = {};    
    public static List<String> LDAPSecFunctions = Arrays.asList(SecureFunctions);

    // functions to connect to db
    private final static String ConnectFunctions[] = {"ldap_connect"};
    public static List<String> LDAPConnectFunctions = Arrays.asList(ConnectFunctions);

    // functions to select db
    private final static String SelectDbFunctions[] = {"ldap_connect"};
    public static List<String> LDAPSelectDbFunctions = Arrays.asList(SelectDbFunctions);
    
    // Myldap keywords
    private final static String clausules[] = {"SELECT", "INSERT INTO", "UPDATE", "ALTER TABLE", "DELETE FROM", "CREATE TABLE", "DROP TABLE",
                                "CREATE DATABASE", "DROP DATABASE", "FROM", "WHERE", "ORDER BY", "GROUP BY", "HAVING", "(&"};
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
