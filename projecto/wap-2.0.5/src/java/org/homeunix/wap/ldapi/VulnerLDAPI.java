/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.homeunix.wap.ldapi;

import org.homeunix.wap.table.tainted.Vulner;

/**
 *
 * @author iberiam
 */
public class VulnerLDAPI extends Vulner{
    // Para correcao
    String ldapFunc;
    int indiceLdapEscapeFunc;
    String decreptedLdapFuncToSubst;
    int lineLdapiBindParam;

    
    /* CONSTRUCTOR */
    public VulnerLDAPI(int l, String f, String myf, int bp){
        super(l, f, true, "LDAPI");
        ldapFunc = myf;
        decreptedLdapFuncToSubst = "";
        indiceLdapEscapeFunc = -1;
        lineLdapiBindParam = bp;
    }

    /* METHODS */

    /*
     * Give the mysql function reached by tainted entry point
     */
    public String getLdapFunc (){
        return ldapFunc;
    }


    /*
     * Give the mysql function that will be substitute the decrepted function
     */
    public String getDecreptedLdapFuncToSubst (){
        return decreptedLdapFuncToSubst;
    }

    /*
     * set the mysql function that will be substitute the decrepted function
     */
    public void setDecreptedLdapFuncToSubst (String a){
        decreptedLdapFuncToSubst = a;
    }    
       
    /*
     * Give the indice of LdapEscapeFunc to get the san_sqli function that to ne applyed
     */
    public int getIndiceLdapEscapeFunc (){
        return indiceLdapEscapeFunc;
    }    

    /*
     * Set indiceLdapEscapeFunc
     */
    public void setIndiceLdapEscapeFunc (int a){
        indiceLdapEscapeFunc = a;
    }     

    /*
     * Give if the lineLdapiBindParam
     */
    public int getLineLdapiBindParam (){
        return lineLdapiBindParam;
    }    
}
