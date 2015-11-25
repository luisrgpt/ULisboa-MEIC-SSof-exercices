/*
 * Class that build the AST and make walker tree to LDAPI
 */

package org.homeunix.wap.ldapi;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.homeunix.wap.php.parser.Ldapi;
import org.homeunix.wap.table.tainted.UntaintedTable;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iberia Medeiros
 */
public class buildWalkerTree_ldapi {
       
    // *** CONSTRUCTORS
    public buildWalkerTree_ldapi(CommonTreeNodeStream nodes, String filename, Map mst, Map mift, Map mft, Map mftt, Map mtt, UntaintedTable mus, Map mlct, Map mct, Map mobjt, List files) throws IOException, RecognitionException {
        try {           
            // Navegate into AST by walker tree
            Ldapi def = new Ldapi(nodes, mst, mift, mft, mftt, mtt, mus, mlct, mct, mobjt, filename, files);
            Ldapi.prog_return prog = def.prog();
        } catch (RecognitionException ex) {
            Logger.getLogger(buildWalkerTree_ldapi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {}

    }

}
