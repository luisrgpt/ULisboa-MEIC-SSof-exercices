/*
 * This class will represent method or user defined function category.
 */

package org.homeunix.wap.ldapi;

import org.homeunix.wap.table.symbol.*;
import org.homeunix.wap.table.tainted.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Iberia Medeiros
 */
public class MethodSymbolLDAPi extends MethodSymbol{
 
    
    // ****** CONSTRUCTORS ***********
     public MethodSymbolLDAPi(MethodSymbol mtsym) {
        super (mtsym.getFunctionName(), mtsym.getCodeLine(), mtsym.getTainted(), mtsym.getScope(), mtsym.getFileSymbol());
    } 
    
     
    // *** METHODS ********
    //public String analyseMethodLdapi(int line, Scope scp, TaintedTable mts_princ, UntaintedTable mus_princ, String filename, Map mift, Map mft, Map mst, Map mftt, Map MainLinesToCorrect, Instance inst, Map mct){
    public int analyseMethodLdapi(MethodSymbol meth_sym,int line, Scope scp, TaintedTable mts_princ, UntaintedTable mus_princ, String filename, String file_methClass, Instance inst, Map mct, String typeMeth, Map varsDB) throws IOException{
        //SymbolTable t = null;
        SymbolTable t = GlobalDataLDAPi.MainSymbolTable.get(scp.getScopeSymbol().getFileSymbol());
        TaintedTable tt = null;
        UntaintedTable ut = null;
        InstanceTable instTable = GlobalDataLDAPi.MainInstancesTable.get(scp.getScopeSymbol().getFileSymbol());
        SymbolTable st = GlobalDataLDAPi.MainSymbolTable.get(scp.getScopeSymbol().getFileSymbol());
        
        if (t == null){
            t = GlobalDataLDAPi.MainSymbolTable.get(filename);
            st = GlobalDataLDAPi.MainSymbolTable.get(filename);
        }
            
        filename=scp.getScopeSymbol().getFileSymbol();
        
        if (inst != null){
            t = inst.getInstanceAttributes();
            tt = inst.getMtsInstanceAttributes();
            ut = inst.getMusInstanceAttributes();
            st = GlobalDataLDAPi.MainSymbolTable.get(inst.getFileInstance());
            instTable = GlobalDataLDAPi.MainInstancesTable.get(inst.getFileInstance());
        }
        
        String methodName = meth_sym.getFunctionName();

        // copiar as instrucoes do metodo
        MethodSymbol meth_sym_aux = meth_sym.copyMethodSymbol(meth_sym, methodName, line, null, filename);

        // criar mtt_aux e mus_aux para a analise da chamada do construtor ou do metodo
        MethodSymbolTainted mstt = new MethodSymbolTainted(methodName, line, file_methClass);
        if (inst != null)
            inst.getMethodTaintedInstance().getListTaintedMembers().add(mstt);
        else{
            t.getMethodTaintedInstance().define(mstt);
        }
        TaintedTable mts_aux = mstt.getFunctionTaintedTable();
	UntaintedTable mus_aux = new UntaintedTable();

        // criar mtc_aux para a analise da chamada da funcao
        // resultado sera a SymbolTable navegada
        MethodSymbolCall mtsc = null;
        if (typeMeth.equals("constructor") == true)
            mtsc = new MethodSymbolCall(methodName, line, false, file_methClass);
        else
            mtsc = new MethodSymbolCall(methodName, line, true, file_methClass);
        
        if (inst != null)
            inst.getMethodCallInstance().getListMethodsMembers().add(mtsc);
        else{
            t.getMethodCallInstance().define(mtsc);
        }
        mtsc.getCallFunctionSymbols().addAll(meth_sym_aux.getMembers());

        // atribuir aos parametros de entrada da funcao as callFunctionArgs e os tainted values
        RootTaintedSymbol Rrt = null;
	Iterator <Symbol> it;
	Iterator <ArgFunctionSymbol> it1;
	Symbol sym1;
	int i = 1;
	ArgFunctionSymbol afs;
        for(it = scp.getMembers().iterator(); it.hasNext();){
            sym1 = it.next();
            
            // ver se o arg e' um objecto
            String instanceName = sym1.getName();
            if (st.getAliases().containsKey(instanceName) == true){
                instanceName = st.getInstanceNameFromAliases(instanceName, instTable);
            }           
            if (instTable != null && instTable.containsInstance(instanceName) == true){
                Instance inst1 = (Instance) instTable.getInstanceOfListInstances(instanceName);
                mtsc.getObjectsOfMethod().define(inst1);
            }

            // ver se e' chamada de um metodo
            if (sym1.getIsClassInstruction() == true){
                Scope scp_aux = (Scope) sym1;
                Symbol sy = (Symbol) scp_aux.getMembers().get(0);
                if (sy.getIsClassMethod() == true){
                    //FuncAndIncLDAPI css1 = new FuncAndIncLDAPI(scp_aux);
                    //css1.resolveSymbolLDAPI(scp_aux, mts_princ, mus_princ, mift, filename, mft, mst, varsDB, mftt, MainLinesToCorrect, mct, mobjt);
                    //scp_aux.resolveSymbol(scp_aux, sym, mts, mus, filename);
                }
            }
            
            for(it1 = meth_sym_aux.getArgsFunction().values().iterator(); it1.hasNext();){
                afs = it1.next();
                if (afs.getPositionParam() == i){
                    afs.setCallFunctionArg(sym1.getName().toString());
                    if (mts_princ.getTaintedMembers().containsKey(sym1.getName()) == true || sym1.getTainted() == 1){
                        if (afs.getType().equals("equal") == false){
                            afs.setTaintedValueCallFunctionArg(1);
                            if (mts_princ.getTaintedMembers().containsKey(sym1.getName())){
                                Rrt = (RootTaintedSymbol) mts_princ.getTaintedMembers().get(sym1.getName());
                                String s = (String) Rrt.getFilesList().get(Rrt.getFilesList().size()-1);
                                Integer l = (Integer) Rrt.getLinesList().get(Rrt.getLinesList().size()-1);
                                Rrt = new RootTaintedSymbol(sym1.getName().toString(), l, 1, false, s);
                            }
                            else{
                                if (sym1.getTainted() == 1)
                                    Rrt = new RootTaintedSymbol(sym1.getName().toString(), sym1.getCodeLine(), 1, false, sym1.getFileSymbol());
                            }
                            if (inst != null)
                                tt.define(Rrt);
                            mts_aux.define(Rrt);
                        }
                    }
                    break;
                }
            }
            i++;
	}
        // Fim

        // atribuir 'as vars globais os tainted values
	it = meth_sym_aux.getGlobalVarsOfFunction().values().iterator();
	for(; it.hasNext();){
            sym1 = it.next();
            if (mts_princ.getTaintedMembers().containsKey(sym1.getName()) == true && mus_princ.getUntaintedMembers().containsKey(sym1.getName()) == false){
                sym1.setTainted(1);
                Rrt = (RootTaintedSymbol) mts_princ.getTaintedMembers().get(sym1.getName());
                String s = (String) Rrt.getFilesList().get(Rrt.getFilesList().size()-1);
                Integer l = (Integer) Rrt.getLinesList().get(Rrt.getLinesList().size()-1);
                Rrt = new RootTaintedSymbol(sym1.getName(), l, 1, false, s);
                if (inst != null)
                    tt.define(Rrt);
                mts_aux.define(Rrt);
            }
            else
                sym1.setTainted(0);
	}
        // Fim

        // *** fazer a analise (ResolveSymbol) das instrucoes do constructor
	it = meth_sym_aux.getMembers().iterator();
        int taints_returns = 0;
	Scope cs;
        Boolean isClassInstruct;
	for(; it.hasNext();){
            cs = (Scope) it.next();
            if (!cs.getMembers().isEmpty()){
                isClassInstruct = false;
                if (cs.getScopeSymbol().getIsClassInstruction() == true || t.containsSymbol(cs.getScopeName()) == true){
                    isClassInstruct = true;
                    FuncAndIncLDAPI css = new FuncAndIncLDAPI(cs);
                    css.resolveSymbolClassLdapi(meth_sym_aux, cs, mts_aux, mus_aux, filename, mtsc, inst, mct, true, null, null, typeMeth, isClassInstruct, varsDB);
                }
                else{
                    // include
                    if (cs.getScopeName().equals("include") == true){
                        FuncAndIncLDAPI css = new FuncAndIncLDAPI(cs);
                        css.resolveSymbolIncludeLDAPI(cs, mts_aux, mus_aux, GlobalDataLDAPi.MainIncludeFilesTable, filename,
                                                    GlobalDataLDAPi.MainFunctionsTable, GlobalDataLDAPi.MainSymbolTable, varsDB,
                                                    GlobalDataLDAPi.MainFunctionsTaintedTable, GlobalDataLDAPi.MainLinesToCorrect);

                    }
                    else{
                        // instrucao normal
                        FuncAndIncLDAPI css = new FuncAndIncLDAPI(cs);
                        css.resolveSymbolFunctionLDAPI(meth_sym_aux, cs, mts_aux, mus_aux, GlobalDataLDAPi.MainIncludeFilesTable,
                                                    filename, GlobalDataLDAPi.MainFunctionsTable, GlobalDataLDAPi.MainSymbolTable,
                                                    varsDB, GlobalDataLDAPi.MainFunctionsTaintedTable, GlobalDataLDAPi.MainLinesToCorrect);
                    }
                }

		// caso o return seja tainted incrementar os returns tainted
		Scope cs_aux = cs.getScopeSymbol().getRootScope();

                if (cs_aux.getScopeName().equals("return") == true){
                    if (cs_aux.getScopeSymbol().getTainted() == 1)
                        taints_returns++;
		}
            }
        }
        // Fim

	// caso o return seja tainted copiar mts_aux para mts
	if (taints_returns > 0){
            scp.getScopeSymbol().setTainted(1);
	}
	else{
            if (inst != null && (typeMeth.equals("constructor") == true || scp.getScopeSymbol().getName().equals(inst.getInstanceName()) == true))
                scp.getScopeSymbol().setTainted(inst.getTainted());
	}

        if (inst != null){
            tt.copyGlobalsToMTS(mts_princ, mus_princ, ut, meth_sym_aux);
            ut.copyGlobalsToMUS(mts_princ, mus_princ, meth_sym_aux);
            ut.cleanAll();
        }
	meth_sym_aux.cleanAll();

        return scp.getScopeSymbol().getTainted();
    }


  public String analyseUserFunctionLdapi(MethodSymbol meth_sym, int line, Scope scp, TaintedTable mts_princ, UntaintedTable mus_princ, String filename, String file_meth, Map mift, Map mft, Map mst, Map mftt, Map MainLinesToCorrect) throws IOException{
        String FunctionName = meth_sym.getFunctionName();
        String valueFinal = "";
        MethodSymbol meth_sym_aux = meth_sym.copyMethodSymbol(meth_sym, FunctionName, line, null, filename);
        // criar mtt_aux e mus_aux para a analise da chamada da funcao
        MethodTaintedTable mtt = null;

        if (mftt.containsKey(filename) == true)
            mtt = (MethodTaintedTable) mftt.get(filename);
        else{
            mtt = new MethodTaintedTable(filename);
            mftt.put(filename, mtt);
        }

        MethodSymbolTainted mstt = new MethodSymbolTainted(FunctionName, line, file_meth);
        mtt.getListTaintedMembers().add(mstt);
        TaintedTable mts_aux = mstt.getFunctionTaintedTable();
	UntaintedTable mus_aux = new UntaintedTable();

        // criar mtc_aux para a analise da chamada da funcao
        // resultado sera a SymbolTable navegada
        MethodTableCalls mtc = null;
        if (GlobalDataLDAPi.MainFunctionsCallsTable.containsKey(filename) == true)
            mtc = GlobalDataLDAPi.MainFunctionsCallsTable.get(filename);
        else{
            mtc = new MethodTableCalls(filename);
            GlobalDataLDAPi.MainFunctionsCallsTable.put(filename, mtc);
        }

        MethodSymbolCall mtsc = new MethodSymbolCall(FunctionName, line, false, file_meth);
        mtc.getListMethodsMembers().add(mtsc);
        // coloca a lista de symbols percorridos (SymbolTable) em MethodSymbolCall
        mtsc.getCallFunctionSymbols().addAll(meth_sym_aux.getMembers());

	// atribuir aos parametros de entrada da funcao as callFunctionArgs e os tainted values
        RootTaintedSymbol Rrt = null;
	Iterator <Symbol> it = scp.getMembers().iterator();
	Iterator <ArgFunctionSymbol> it1;
	Symbol sym1;
	int i = 1;
	ArgFunctionSymbol afs;
        for(; it.hasNext();){
            sym1 = it.next();
            for(it1 = meth_sym_aux.getArgsFunction().values().iterator(); it1.hasNext();){
                afs = it1.next();
                if (afs.getPositionParam() == i){
                    afs.setCallFunctionArg(sym1.getName().toString());
                    // taint analysis of arguments
                    if (sym1.getRootScope() == null){
                        resolveParam(sym1, mts_princ, mus_princ, scp);
                    }
                    else{
                        Scope scp_aux = (Scope) sym1;
                        resolveSymbolParam(mts_princ, mus_princ, scp_aux, scp_aux);
                    }


                    if (mts_princ.getTaintedMembers().containsKey(sym1.getName()) == true || sym1.getTainted() == 1
                        || GlobalDataLDAPi.UserInput.contains(sym1.getName())){
                        if (afs.getType().equals("equal") == false){
                            afs.setTaintedValueCallFunctionArg(1);
                            if (mts_princ.getTaintedMembers().containsKey(sym1.getName())){
                                Rrt = (RootTaintedSymbol) mts_princ.getTaintedMembers().get(sym1.getName());
                                String s = (String) Rrt.getFilesList().get(Rrt.getFilesList().size()-1);
                                Integer l = (Integer) Rrt.getLinesList().get(Rrt.getLinesList().size()-1);
                                Rrt = new RootTaintedSymbol(sym1.getName().toString(), l, 1, false, s);
                            }
                            else{
                                if (sym1.getTainted() == 1)
                                    Rrt = new RootTaintedSymbol(sym1.getName().toString(), sym1.getCodeLine(), 1, false, sym1.getFileSymbol());
                            }
                            mts_aux.define(Rrt);
                        }
                    }
                    break;
                }
            }
            i++;
	}


	// atribuir 'as vars globais os tainted values
	it = meth_sym_aux.getGlobalVarsOfFunction().values().iterator();
	for(; it.hasNext();){
            sym1 = it.next();
            if (mts_princ.getTaintedMembers().containsKey(sym1.getName()) == true && mus_princ.getUntaintedMembers().containsKey(sym1.getName()) == false){
                sym1.setTainted(1);
                Rrt = (RootTaintedSymbol) mts_princ.getTaintedMembers().get(sym1.getName());
                String s = (String) Rrt.getFilesList().get(Rrt.getFilesList().size()-1);
                Integer l = (Integer) Rrt.getLinesList().get(Rrt.getLinesList().size()-1);
                Rrt = new RootTaintedSymbol(sym1.getName(), l, 1, false, s);
                mts_aux.define(Rrt);
            }
            else
                sym1.setTainted(0);
	}


	// *** fazer a analise (ResolveSymbol) das instrucoes da funcao
	int taints_returns = 0;
        // mapa que contem as vars da conexao e db do myldap
        Map <String, String> varsDB = new HashMap <String, String>();
        varsDB.put("connectionDB", "");
        varsDB.put("selectDB", "");
        varsDB.put("lineLdapiBindParam", "-1");

	it = meth_sym_aux.getMembers().iterator();
	Scope cs;
	for(; it.hasNext();){
            cs = (Scope) it.next();
            if (!cs.getMembers().isEmpty()){
                FuncAndIncLDAPI css = new FuncAndIncLDAPI(cs);
                //try{
		css.resolveSymbolFunctionLDAPI(meth_sym_aux, cs, mts_aux, mus_aux, mift, filename, mft, mst, varsDB, mftt, MainLinesToCorrect);
		// caso o return seja tainted incrementar os returns tainted
		Scope cs_aux = cs.getScopeSymbol().getRootScope();

                if (cs_aux.getScopeName().equals("return") == true){
                    if (cs_aux.getScopeSymbol().getTainted() == 1)
                        taints_returns++;

                    Symbol aa;
                    for(Iterator it2 = cs_aux.getMembers().iterator(); it2.hasNext();){
                        aa = (Symbol) it2.next();
                        String a = aa.getName();
                        if (a.equals(varsDB.get("connectionDB"))){
                            valueFinal = "connectionDB";
                            break;
                        }
                        else
                            if (a.equals(varsDB.get("selectDB"))){
                                valueFinal = "selectDB";
                                break;
                            }
                    }
		}

            }
	}
	// caso o return seja tainted copiar mts_aux para mts
	if (taints_returns > 0){
            scp.getScopeSymbol().setTainted(1);
	}
	else{
            scp.getScopeSymbol().setTainted(0);
	}
        mts_aux.copyGlobalsToMTS(mts_princ, mus_princ, mus_aux, meth_sym_aux);
        mus_aux.copyGlobalsToMUS(mts_princ, mus_princ, meth_sym_aux);
	mus_aux.cleanAll();

	meth_sym_aux.cleanAll();

        return valueFinal;
    }

     /*
      * Resolve symbol of arguments of userfunctios ou class methods
      */
     private void resolveSymbolParam(TaintedTable mts, UntaintedTable mus, Scope sc, Scope sc_princ){
        if (sc.getScopeSymbol().getTainted() == 0){       
            if (!sc.getMembers().isEmpty()){
               Symbol sym;
               for(Iterator <Symbol> itt = sc.getMembers().iterator(); itt.hasNext();){
                   sym = itt.next();
                   if (sym.getRootScope() != null){
                       Scope scc = (Scope) sym;
                       resolveSymbolParam(mts, mus, scc, sc_princ);
                   }
                   else{
                       resolveParam(sym, mts, mus, sc);
                       if (sym.getTainted() == 1)
                           sc_princ.getScopeSymbol().setTainted(1);                       
                   }
               }
            }
            else{
                resolveParam(sc.getScopeSymbol(), mts, mus, sc);
                if (sc.getScopeSymbol().getTainted() == 1)
                    sc_princ.getScopeSymbol().setTainted(1);                
            }
        }
     }     
  
    
    /*
     * Resolve taintedness of userfunction arguments when it is called
     */
    private void resolveParam(Symbol symb, TaintedTable mts, UntaintedTable mus, Scope sc){
        if (symb.getTainted() == 0){
            String nam = symb.getName();
            // Caso o symbol seja uma var ja tainted e pertenca a tabela das vars tainteds
            if (mts.getTaintedMembers().containsKey(nam) == true && mus.existSymbol(nam) == false) {
                symb.setTainted(1);
            }

        // Caso o symbol seja um alfanumeric e contenha uma var tainted da tabela das vars tainteds
        if (symb.getAlfanumeric() == true) {
            Boolean existe = false;
            Iterator <Symbol> itt = mts.getTaintedMembers().values().iterator();
            for(;itt.hasNext(); ){
                String s = itt.next().getName();
                if (nam.contains("$"+s) == true && mus.existSymbol(s) == false){
                    symb.setTainted(1);
                }
            }
        }

        // colocar scope parent tainted
        if (symb.getTainted() == 1)
            sc.getScopeSymbol().setTainted(1);
        }
        
        sc.resolveSymbol(sc, symb, mts, mus, symb.getFileSymbol());
        mts.removeDuplicates(symb);
        
    }
  
  
  
}
