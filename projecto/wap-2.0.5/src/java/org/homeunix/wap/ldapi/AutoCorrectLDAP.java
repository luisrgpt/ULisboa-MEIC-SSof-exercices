/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.homeunix.wap.ldapi;

import org.homeunix.wap.utils.LinesToCorrect;
import org.homeunix.wap.utils.ManageFiles;

import java.util.Map;

/**
 *
 * @author iberiam
 */
public class AutoCorrectLDAP {
    VulnerLDAPI vv;

    // *** CONSTRUCTOR
    public AutoCorrectLDAP(VulnerLDAPI vul) {
        this.vv = vul;
    }

    // *** METHODS
    
    // Cria a string para a correcao automatica
    public void buildCorrectLDAP(Map MainLinesToCorrect) {
        String ldap_final = "";
        LinesToCorrect ltc = getLinesToCorrect(vv.getFileOfLineToSanitize(), MainLinesToCorrect);
        ManageFiles fff = new ManageFiles (vv.getFileOfLineToSanitize());
        
        if (vv.getLdapFunc().equals("myldapi_execute") == true){
                if (vv.getLineLdapiBindParam() > 0){
                    // Linha de myldapi_bind_param passar para myldapi_stmt_bind_param
                    // buscar linha do ficheiro
                    String cLine = fff.getLineOfCode(vv.getLineLdapiBindParam());
                    cLine = cLine.replace("myldapi_bind_param", "myldapi_stmt_bind_param");
                    ltc.getMapLinesToCorrect().put(vv.getLineLdapiBindParam(), cLine);
                }
               vv.setCorrectedCode(vv.getVulCode());
        }
      
        String codeLine = fff.getLineOfCode(vv.getLineToSanitize());
        String cod_antes = codeLine.toString();
        codeLine = codeLine.replace(vv.getVulCode(), vv.getCorrectedCode());
        if (vv.getDecreptedLdapFuncToSubst().equals("") == false)
            codeLine = codeLine.replace(vv.getLdapFunc(), vv.getDecreptedLdapFuncToSubst());
       
        if (cod_antes.equals(vv.getVulCode()) == false)
            ltc.getMapLinesToCorrect().put(vv.getLineToSanitize(), codeLine);
        else
            ltc.getMapLinesToCorrect().put(vv.getLineToSanitize(), vv.getCorrectedCode()); 
    }
   
    private LinesToCorrect getLinesToCorrect(String filename, Map MainLinesToCorrect){
        if (MainLinesToCorrect.containsKey(filename))
            return (LinesToCorrect) MainLinesToCorrect.get(filename);
        else{
            LinesToCorrect l = new LinesToCorrect(filename);
            MainLinesToCorrect.put(filename, l);
            return l;
        }
    }

}
