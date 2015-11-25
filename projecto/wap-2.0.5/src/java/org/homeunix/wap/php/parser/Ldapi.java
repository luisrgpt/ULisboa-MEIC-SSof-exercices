// $ANTLR 3.5.2 ./Ldapi.g 2015-11-25 15:37:54

    package org.homeunix.wap.php.parser;
    import org.homeunix.wap.table.symbol.*;
    import org.homeunix.wap.table.tainted.*;
    import org.homeunix.wap.ldapi.*;
    import org.homeunix.wap.utils.*;
    import java.util.Iterator;
    import java.io.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class Ldapi extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMPERSAND", "ARRAY_ASSIGN", 
		"ASTERISK", "AccessModifier", "Apply", "Array", "ArrayWord", "AssignmentOperator", 
		"BANG", "BREAK", "Block", "BodyString", "Boolean", "CASE", "CATCH", "CLASS", 
		"CLASS_MEMBER", "CLONE", "CLOSE_BRACE", "CLOSE_CURLY_BRACE", "CLOSE_SQUARE_BRACE", 
		"COLON", "COMMA", "COMMENT", "CONST", "CONTINUE", "Cast", "ComparisionOperator", 
		"ConcatAssigmentOperator", "DEFAULT", "DIE", "DNum", "DO", "DOLLAR", "DOT", 
		"Decimal", "Digits", "DoubleQuotedString", "ECHO", "ELSE", "ELSE_IF", 
		"EQUALS", "EqualityOperator", "EscapeCharector", "Exponent_DNum", "Extends", 
		"FOR", "FORWARD_SLASH", "FOR_EACH", "FUNCTION", "Field", "FirstBodyString", 
		"ForeachVar", "GLOBAL", "HEX_DIGIT", "HereDoc", "HereDocContents", "Hexadecimal", 
		"IF", "INSTANCE_MEMBER", "INSTANCE_OF", "IfExpression", "IgnoreConditions", 
		"IgnoreStmContents", "IgnoreStmDeclare", "IgnoreStmImplements", "IgnoreStmInterface", 
		"IncrementOperator", "Integer", "LOGICAL_AND", "LOGICAL_OR", "List", "ListAssign", 
		"MINUS", "Method", "Modifiers", "NEW", "OCTAL_ESC", "OPEN_BRACE", "OPEN_CURLY_BRACE", 
		"OPEN_SQUARE_BRACE", "Octal", "PERCENT", "PIPE", "PLUS", "PRINT", "PRINTF", 
		"Params", "PhpStatement", "Postfix", "Prefix", "QUESTION_MARK", "RETURN", 
		"Real", "RequireOperator", "SEMICOLON", "SUPPRESS_WARNINGS", "SWITCH", 
		"ShiftOperator", "SingleQuotedString", "THROW", "TILDE", "TRY", "UNICODE_ESC", 
		"USE", "UnquotedString", "VAR", "WHILE", "WhiteSpace", "'AND'", "'OR'", 
		"'XOR'", "'and'", "'final'", "'list'", "'null'", "'or'", "'static'", "'xor'"
	};
	public static final int EOF=-1;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int ABSTRACT=4;
	public static final int AMPERSAND=5;
	public static final int ARRAY_ASSIGN=6;
	public static final int ASTERISK=7;
	public static final int AccessModifier=8;
	public static final int Apply=9;
	public static final int Array=10;
	public static final int ArrayWord=11;
	public static final int AssignmentOperator=12;
	public static final int BANG=13;
	public static final int BREAK=14;
	public static final int Block=15;
	public static final int BodyString=16;
	public static final int Boolean=17;
	public static final int CASE=18;
	public static final int CATCH=19;
	public static final int CLASS=20;
	public static final int CLASS_MEMBER=21;
	public static final int CLONE=22;
	public static final int CLOSE_BRACE=23;
	public static final int CLOSE_CURLY_BRACE=24;
	public static final int CLOSE_SQUARE_BRACE=25;
	public static final int COLON=26;
	public static final int COMMA=27;
	public static final int COMMENT=28;
	public static final int CONST=29;
	public static final int CONTINUE=30;
	public static final int Cast=31;
	public static final int ComparisionOperator=32;
	public static final int ConcatAssigmentOperator=33;
	public static final int DEFAULT=34;
	public static final int DIE=35;
	public static final int DNum=36;
	public static final int DO=37;
	public static final int DOLLAR=38;
	public static final int DOT=39;
	public static final int Decimal=40;
	public static final int Digits=41;
	public static final int DoubleQuotedString=42;
	public static final int ECHO=43;
	public static final int ELSE=44;
	public static final int ELSE_IF=45;
	public static final int EQUALS=46;
	public static final int EqualityOperator=47;
	public static final int EscapeCharector=48;
	public static final int Exponent_DNum=49;
	public static final int Extends=50;
	public static final int FOR=51;
	public static final int FORWARD_SLASH=52;
	public static final int FOR_EACH=53;
	public static final int FUNCTION=54;
	public static final int Field=55;
	public static final int FirstBodyString=56;
	public static final int ForeachVar=57;
	public static final int GLOBAL=58;
	public static final int HEX_DIGIT=59;
	public static final int HereDoc=60;
	public static final int HereDocContents=61;
	public static final int Hexadecimal=62;
	public static final int IF=63;
	public static final int INSTANCE_MEMBER=64;
	public static final int INSTANCE_OF=65;
	public static final int IfExpression=66;
	public static final int IgnoreConditions=67;
	public static final int IgnoreStmContents=68;
	public static final int IgnoreStmDeclare=69;
	public static final int IgnoreStmImplements=70;
	public static final int IgnoreStmInterface=71;
	public static final int IncrementOperator=72;
	public static final int Integer=73;
	public static final int LOGICAL_AND=74;
	public static final int LOGICAL_OR=75;
	public static final int List=76;
	public static final int ListAssign=77;
	public static final int MINUS=78;
	public static final int Method=79;
	public static final int Modifiers=80;
	public static final int NEW=81;
	public static final int OCTAL_ESC=82;
	public static final int OPEN_BRACE=83;
	public static final int OPEN_CURLY_BRACE=84;
	public static final int OPEN_SQUARE_BRACE=85;
	public static final int Octal=86;
	public static final int PERCENT=87;
	public static final int PIPE=88;
	public static final int PLUS=89;
	public static final int PRINT=90;
	public static final int PRINTF=91;
	public static final int Params=92;
	public static final int PhpStatement=93;
	public static final int Postfix=94;
	public static final int Prefix=95;
	public static final int QUESTION_MARK=96;
	public static final int RETURN=97;
	public static final int Real=98;
	public static final int RequireOperator=99;
	public static final int SEMICOLON=100;
	public static final int SUPPRESS_WARNINGS=101;
	public static final int SWITCH=102;
	public static final int ShiftOperator=103;
	public static final int SingleQuotedString=104;
	public static final int THROW=105;
	public static final int TILDE=106;
	public static final int TRY=107;
	public static final int UNICODE_ESC=108;
	public static final int USE=109;
	public static final int UnquotedString=110;
	public static final int VAR=111;
	public static final int WHILE=112;
	public static final int WhiteSpace=113;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public Ldapi(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public Ldapi(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[175+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return Ldapi.tokenNames; }
	@Override public String getGrammarFileName() { return "./Ldapi.g"; }


		/** Override this method to change where error messages go */
		@Override
		public void emitErrorMessage(String msg) {
		}
		
		@Override
		protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
			RecognitionException e = null;
			// if next token is what we are looking for then "delete" this token
			if ( mismatchIsUnwantedToken(input, ttype) ) {
				e = new UnwantedTokenException(ttype, input);
				beginResync();
				input.consume(); // simply delete extra token
				endResync();
				reportError(e); // report after consuming so AW sees the token in the exception
				// we want to return the token we're actually matching
				Object matchedSymbol = getCurrentInputSymbol(input);
				input.consume(); // move past ttype token as if all were ok
				return matchedSymbol;
			}
			// can't recover with single token deletion, try insertion
			if ( mismatchIsMissingToken(input, follow) ) {
				Object inserted = getMissingSymbol(input, e, ttype, follow);
				e = new MissingTokenException(ttype, input, inserted);
				reportError(e); // report after inserting so AW sees the token in the exception
				return inserted;
			}
				// even that didn't work; must throw the exception
				e = new MismatchedTokenException(ttype, input);
				throw e;
		}
		
		@Override
		public void reportError(RecognitionException e) {
			// if we've already reported an error and have not matched a token
			// yet successfully, don't report any errors.
			if ( state.errorRecovery ) {
				return;
			}
			state.syntaxErrors++; // don't count spurious
			state.errorRecovery = true;

			//displayRecognitionError(this.getTokenNames(), e);
		}


		
		
	    SymbolTable currentSymbolTable, st_BeforeDefFunction;    
	    MethodTable methtab_functions;
	    ClassTable class_table;
	    ClassSymbol currentClass;
	    InstanceTable instances_table;
	    Instance currentInstance;
	    MethodSymbol currentMethod, progenitorMethod, mss_final;
	    Scope currentScope, scp_BeforeDefFunction, scp_array_left;
	    String currentFile, connectionDB, selectDB, mss_final_file = "";
	    TaintedTable mts;
	    UntaintedTable mus;
	    List list_files;
	    Map mst, mift, mft, mftt, mtt, mlct, mct, mobjt;
	    
	    String type_increq;			// identifica se foi static ou uma variavel o file a incluir
	    int linha;					// numero da linha em analise
	    String texto;				// texto (token) em analise
	    String instanceName = "";		// objecto que esta a ser acedido ou criado
	    int posParmDefFunc;			// posicao do parametro na definicao de funcoes pelo utilizador (primeiro, segundo, ...)
	    List<Integer> indexArrayAccess = new ArrayList<Integer>();		// posicao no scope do inicio do acesso a um elemento de array
	    int lineMysqliBindParam = -1;		// linha onde e' chamada a funcao mysqli_bind_param
	    int nVul;					// numero de vulnerabilidades encontradas na analise
	    List<Integer> numElemIfBegin = new ArrayList<Integer>();	// Numero de elementos do scope antes da expressao do if,
	    									// para depois eliminar os elementos do scope da experessao
	    int indexIf = 0, ind_scope = -1;
	    int isLeftMemberArray = 0;    
	    int isAloneMemberArray = 0;
	    int echo_print; 
	    int ind_keyValuePair = 0;
	    int accessInstance = 0; 
	    String attribName;     
	    

	    // flags to scan what is need
		/*
		** index 00: assign_flag			// flag de atribuicao
		** index 01: callFunction_flag		// flag de chamada de funcao
		** index 02: call_mysql_flag		// flag de chamada da funcao SQLIFunctions (mysql_query ou mysqli_query ou ...)
		** index 03: call_mysqlsec_flag	// flag de chamada da funcao SQLSecFunctions (mysql_real_escape_string ou ...)
		** index 04: increq_flag			// flag de include, includeonce, require, requireonce
		** index 05: return_flag	 		// flag da presenca da instrucao de return em include ou function
		** index 06: defFunction_flag		// flag de definicao de funcao pelo programador
		** index 07: defArgFunction_flag	// flag de dedinição de um argumento de uma funcao definida pelo programador
		** index 08: concatenation_flag		// flag de operador de concatenacao
		** index 09: globalVarFunction_flag	// flag de presenca de var globais em funcoes definidas pelo programador
		** index 10: call_UserFunction_flag	// flag de chamada de funcao previamente definida pelo programador
		** index 11: call_connectionDB_flag	// flag de chamada das funcoes mysql_connect, mysqli_connect ou outros connect de SGBDs
		** index 12: arrayAccess_flag		// flag de acesso a um array
		** index 13: call_selectDB_flag	// flag de chamada das funcoes mysql_select_db, mysqli_select_db ou outros connect de SGBDs
		** index 14: if_presence_flag		// flag que indica que estamos num if ou elseif
		** index 16: list_flag			// flag de definicao de list
		** index 17: case_flag			// flag de definicao de um case de um switch	
		** index 18: defFunction_class	// flag de definicao de uma classe
		** index 19: defAttribute_class	// flag de definicao de um atributo da classe
		** index 20: createObject_class	// flag de criacao de um obj da classe
		** index 21: call_MethodClass_flag	// flag de chamada de metodo da class para o objecto
		** index 22: createClone_flag		// flag de criacao de um clone de um objecto
		** index 23: workOnInstance_flag	// flag de trabalho sobre uma instancia (alterar attributos, chamar metodo)
		** index 24: attribOnInstance_flag	// flag de atribuicao de um valor a um atributo de uma instancia
		** index 25: instanceMember_flag	// flag de instance member operator
		** index 26: noClass_instMember_flag	// flag de instance member operator, mas que nao e' de classe
		** index 27: obj_func_return_flag	// flag de presenca de obj de retorno de um metodo	
		** index 28: obj_array_param_flag	// flag de passagem de array em param de func em obj
		** index 29: defArrayEntry_flag		// flag de definicao de emenentos num array
		*/

	    // flag to scan what isn't need
		/*
		** index 15: garbage_flag		// flag de presenca de instrucao que nao interessa analisar
		*/
	    int Flags[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	        

	    public Ldapi(TreeNodeStream input, Map mst, Map mift, Map mft, Map mftt, Map mtt, UntaintedTable mus, Map mlct, Map mct, Map mobjt, String file, List files){
		this(input);
		SymbolTable st = new SymbolTable(file);
	     mst.put(file, st);		
		this.currentSymbolTable = st;
		this.currentScope = st;

		TaintedTable mts_aux = new TaintedTable(file);
	    mtt.put(file, mts_aux);
		this.mts = mts_aux;
			
		mus.getUntaintedMembers().clear();
		this.mus = mus;
		this.currentFile = file;
		this.list_files = files;
		this.mst = mst;
		this.mift = mift;
		this.mft = mft;
		this.mftt = mftt;	
		this.mtt = mtt;
		this.mlct = mlct;
		this.mct = mct;
		this.mobjt = mobjt;
		connectionDB="";
		selectDB = "";
	    }

		private void initInstanceOperations(){
			if (Flags[18] == 0 && Flags[6] == 0 && Flags[27] == 0){
				if (instanceName.equals(currentScope.getScopeName()) == true){
					// ver se a instancia e' um clone
					if (currentSymbolTable.getAliases().containsKey(instanceName) == true){
						String instanceNameClone = instanceName;
						instanceName = currentSymbolTable.getInstanceNameFromAliases(instanceName, instances_table);
					}
				}		
			
				if (instances_table != null && instances_table.containsInstance(instanceName) == true){			
					Flags[26] = 0;
					// obter instancia
					if (instanceName.equals("this") == false && currentScope.getScopeSymbol().getIsClassMethod() == false){	
						// obter instancia
						currentInstance = (Instance) instances_table.getInstanceOfListInstances(instanceName);

						// obter classe
						String s = currentInstance.getFileOfClass();
						class_table = (ClassTable) mct.get(s);
						s = currentInstance.getInstanceClass();
						currentClass = (ClassSymbol) class_table.getClassOfListClasses(s);			
					}
				}
				else{
					Flags[26] = 1; //noClass_instMember_flag
					currentScope.getScopeSymbol().setIsClassInstruction(false);			
					// ver se a instancia e' connectionDB
					if (currentScope.getScopeName().equals(connectionDB) == true)
						instanceName = connectionDB;
				}	
			}
		 	
		 	if (Flags[6] == 1 || Flags[18] == 1){
				Flags[26] = 1;
			}
	    }



	public static class prog_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// ./Ldapi.g:229:1: prog : ( statement )* ;
	public final Ldapi.prog_return prog() throws RecognitionException {
		Ldapi.prog_return retval = new Ldapi.prog_return();
		retval.start = input.LT(1);
		int prog_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope statement1 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// ./Ldapi.g:230:5: ( ( statement )* )
			// ./Ldapi.g:230:7: ( statement )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// ./Ldapi.g:230:7: ( statement )*
			loop1:
			while (true) {
				int alt1=2;
				alt1 = dfa1.predict(input);
				switch (alt1) {
				case 1 :
					// ./Ldapi.g:230:7: statement
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_prog85);
					statement1=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, statement1.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					break loop1;
				}
			}

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class statement_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// ./Ldapi.g:232:1: statement : ( ignoreStatement | BodyString | ^( Block ( statement )* ) | classDefinition | complexStatement | simpleStatement );
	public final Ldapi.statement_return statement() throws RecognitionException {
		Ldapi.statement_return retval = new Ldapi.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree BodyString3=null;
		CommonTree Block4=null;
		TreeRuleReturnScope ignoreStatement2 =null;
		TreeRuleReturnScope statement5 =null;
		TreeRuleReturnScope classDefinition6 =null;
		TreeRuleReturnScope complexStatement7 =null;
		TreeRuleReturnScope simpleStatement8 =null;

		CommonTree BodyString3_tree=null;
		CommonTree Block4_tree=null;

		Flags[14] = 0;
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// ./Ldapi.g:234:5: ( ignoreStatement | BodyString | ^( Block ( statement )* ) | classDefinition | complexStatement | simpleStatement )
			int alt3=6;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// ./Ldapi.g:234:7: ignoreStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_ignoreStatement_in_statement102);
					ignoreStatement2=ignoreStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, ignoreStatement2.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:235:7: BodyString
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					BodyString3=(CommonTree)match(input,BodyString,FOLLOW_BodyString_in_statement110); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BodyString3_tree = (CommonTree)adaptor.dupNode(BodyString3);


					adaptor.addChild(root_0, BodyString3_tree);
					}

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// ./Ldapi.g:236:7: ^( Block ( statement )* )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					Block4=(CommonTree)match(input,Block,FOLLOW_Block_in_statement121); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Block4_tree = (CommonTree)adaptor.dupNode(Block4);


					root_1 = (CommonTree)adaptor.becomeRoot(Block4_tree, root_1);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// ./Ldapi.g:236:15: ( statement )*
						loop2:
						while (true) {
							int alt2=2;
							alt2 = dfa2.predict(input);
							switch (alt2) {
							case 1 :
								// ./Ldapi.g:236:15: statement
								{
								_last = (CommonTree)input.LT(1);
								pushFollow(FOLLOW_statement_in_statement123);
								statement5=statement();
								state._fsp--;
								if (state.failed) return retval;
								if ( state.backtracking==0 ) 
								adaptor.addChild(root_1, statement5.getTree());

								if ( state.backtracking==0 ) {
								}

								}
								break;

							default :
								break loop2;
							}
						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// ./Ldapi.g:237:7: classDefinition
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_classDefinition_in_statement133);
					classDefinition6=classDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, classDefinition6.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 5 :
					// ./Ldapi.g:238:7: complexStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_complexStatement_in_statement141);
					complexStatement7=complexStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, complexStatement7.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 6 :
					// ./Ldapi.g:239:7: simpleStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_simpleStatement_in_statement149);
					simpleStatement8=simpleStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, simpleStatement8.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class classDefinition_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classDefinition"
	// ./Ldapi.g:242:1: classDefinition : ^( CLASS ^( Modifiers ( classModifier )? ) className ( extendsclass )? ( classImplements )? ( classMember )* ) ;
	public final Ldapi.classDefinition_return classDefinition() throws RecognitionException {
		Ldapi.classDefinition_return retval = new Ldapi.classDefinition_return();
		retval.start = input.LT(1);
		int classDefinition_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree CLASS9=null;
		CommonTree Modifiers10=null;
		TreeRuleReturnScope classModifier11 =null;
		TreeRuleReturnScope className12 =null;
		TreeRuleReturnScope extendsclass13 =null;
		TreeRuleReturnScope classImplements14 =null;
		TreeRuleReturnScope classMember15 =null;

		CommonTree CLASS9_tree=null;
		CommonTree Modifiers10_tree=null;


			  try{
			     Flags[18] = 1;
				currentClass = new ClassSymbol("class", currentFile, null);
				st_BeforeDefFunction = currentSymbolTable;
				scp_BeforeDefFunction = currentScope;
				
				if (currentSymbolTable.getHaveClasses() == false){
					currentSymbolTable.setHaveClasses();
					class_table = new ClassTable(currentFile);
					mct.put(currentFile, class_table);
				}
				else {
					class_table = (ClassTable)mct.get(currentFile);
				}
				} catch (Exception e){
					
				}
			
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// ./Ldapi.g:273:5: ( ^( CLASS ^( Modifiers ( classModifier )? ) className ( extendsclass )? ( classImplements )? ( classMember )* ) )
			// ./Ldapi.g:273:7: ^( CLASS ^( Modifiers ( classModifier )? ) className ( extendsclass )? ( classImplements )? ( classMember )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			CLASS9=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_classDefinition179); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CLASS9_tree = (CommonTree)adaptor.dupNode(CLASS9);


			root_1 = (CommonTree)adaptor.becomeRoot(CLASS9_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_2 = _last;
			CommonTree _first_2 = null;
			CommonTree root_2 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			Modifiers10=(CommonTree)match(input,Modifiers,FOLLOW_Modifiers_in_classDefinition182); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Modifiers10_tree = (CommonTree)adaptor.dupNode(Modifiers10);


			root_2 = (CommonTree)adaptor.becomeRoot(Modifiers10_tree, root_2);
			}

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// ./Ldapi.g:273:27: ( classModifier )?
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ABSTRACT) ) {
					alt4=1;
				}
				switch (alt4) {
					case 1 :
						// ./Ldapi.g:273:27: classModifier
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_classModifier_in_classDefinition184);
						classModifier11=classModifier();
						state._fsp--;
						if (state.failed) return retval;
						if ( state.backtracking==0 ) 
						adaptor.addChild(root_2, classModifier11.getTree());

						if ( state.backtracking==0 ) {
						}

						}
						break;

				}

				match(input, Token.UP, null); if (state.failed) return retval;
			}
			adaptor.addChild(root_1, root_2);
			_last = _save_last_2;
			}


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_className_in_classDefinition188);
			className12=className();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, className12.getTree());

			// ./Ldapi.g:273:53: ( extendsclass )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Extends) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// ./Ldapi.g:273:53: extendsclass
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_extendsclass_in_classDefinition190);
					extendsclass13=extendsclass();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, extendsclass13.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			// ./Ldapi.g:273:67: ( classImplements )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==PhpStatement) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// ./Ldapi.g:273:67: classImplements
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_classImplements_in_classDefinition193);
					classImplements14=classImplements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, classImplements14.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			// ./Ldapi.g:273:84: ( classMember )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==CONST||LA7_0==Field||LA7_0==Method||LA7_0==VAR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ./Ldapi.g:273:84: classMember
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_classMember_in_classDefinition196);
					classMember15=classMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, classMember15.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					break loop7;
				}
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

			if ( state.backtracking==0 ) {
				  try{
					class_table.define(currentClass);
					currentSymbolTable = st_BeforeDefFunction;
					currentScope = scp_BeforeDefFunction;
					Flags[18] = 0;		
					} catch (Exception e){
						
					}		
				}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, classDefinition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classDefinition"


	public static class className_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "className"
	// ./Ldapi.g:276:1: className : UnquotedString ;
	public final Ldapi.className_return className() throws RecognitionException {
		Ldapi.className_return retval = new Ldapi.className_return();
		retval.start = input.LT(1);
		int className_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree UnquotedString16=null;

		CommonTree UnquotedString16_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// ./Ldapi.g:277:5: ( UnquotedString )
			// ./Ldapi.g:277:7: UnquotedString
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			UnquotedString16=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_className215); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			UnquotedString16_tree = (CommonTree)adaptor.dupNode(UnquotedString16);


			adaptor.addChild(root_0, UnquotedString16_tree);
			}

			if ( state.backtracking==0 ) {
			      	currentClass.setClassName((UnquotedString16!=null?UnquotedString16.getText():null));
			      }
			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, className_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "className"


	public static class extendsclass_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "extendsclass"
	// ./Ldapi.g:283:1: extendsclass : ^( Extends UnquotedString ) ;
	public final Ldapi.extendsclass_return extendsclass() throws RecognitionException {
		Ldapi.extendsclass_return retval = new Ldapi.extendsclass_return();
		retval.start = input.LT(1);
		int extendsclass_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree Extends17=null;
		CommonTree UnquotedString18=null;

		CommonTree Extends17_tree=null;
		CommonTree UnquotedString18_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// ./Ldapi.g:284:5: ( ^( Extends UnquotedString ) )
			// ./Ldapi.g:284:7: ^( Extends UnquotedString )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			Extends17=(CommonTree)match(input,Extends,FOLLOW_Extends_in_extendsclass242); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Extends17_tree = (CommonTree)adaptor.dupNode(Extends17);


			root_1 = (CommonTree)adaptor.becomeRoot(Extends17_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			UnquotedString18=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_extendsclass244); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			UnquotedString18_tree = (CommonTree)adaptor.dupNode(UnquotedString18);


			adaptor.addChild(root_1, UnquotedString18_tree);
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			      	currentClass.setExtendedNameClass((UnquotedString18!=null?UnquotedString18.getText():null), currentFile, mct);
			      }
			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, extendsclass_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "extendsclass"


	public static class classImplements_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classImplements"
	// ./Ldapi.g:290:1: classImplements : ignoreStatement ;
	public final Ldapi.classImplements_return classImplements() throws RecognitionException {
		Ldapi.classImplements_return retval = new Ldapi.classImplements_return();
		retval.start = input.LT(1);
		int classImplements_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope ignoreStatement19 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// ./Ldapi.g:291:5: ( ignoreStatement )
			// ./Ldapi.g:291:7: ignoreStatement
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_ignoreStatement_in_classImplements275);
			ignoreStatement19=ignoreStatement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_0, ignoreStatement19.getTree());

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, classImplements_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classImplements"


	public static class classMember_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classMember"
	// ./Ldapi.g:294:1: classMember : ( ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString ^( Params ( paramDef )* ) ( ^( Block ( statement )* ) )? ) | definitionAttribute );
	public final Ldapi.classMember_return classMember() throws RecognitionException {
		Ldapi.classMember_return retval = new Ldapi.classMember_return();
		retval.start = input.LT(1);
		int classMember_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree Method20=null;
		CommonTree Modifiers21=null;
		CommonTree UnquotedString23=null;
		CommonTree Params24=null;
		CommonTree Block26=null;
		TreeRuleReturnScope fieldModifier22 =null;
		TreeRuleReturnScope paramDef25 =null;
		TreeRuleReturnScope statement27 =null;
		TreeRuleReturnScope definitionAttribute28 =null;

		CommonTree Method20_tree=null;
		CommonTree Modifiers21_tree=null;
		CommonTree UnquotedString23_tree=null;
		CommonTree Params24_tree=null;
		CommonTree Block26_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// ./Ldapi.g:295:2: ( ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString ^( Params ( paramDef )* ) ( ^( Block ( statement )* ) )? ) | definitionAttribute )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Method) ) {
				alt12=1;
			}
			else if ( (LA12_0==CONST||LA12_0==Field||LA12_0==VAR) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// ./Ldapi.g:295:4: ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString ^( Params ( paramDef )* ) ( ^( Block ( statement )* ) )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
							try{
							Flags[6] = 1; /*defFunction_flag = 1;*/
							methtab_functions = currentClass.getMembersMethods();

							// o nome da funcao e o id da linha somente sao inseridos no fim da def da funcao
							currentMethod = new MethodSymbol("MethodClass", -1, 0, null, currentFile);
							currentScope = (Scope)currentMethod;
							posParmDefFunc = 1;
						  	} catch (Exception e){
								
							}
						}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					Method20=(CommonTree)match(input,Method,FOLLOW_Method_in_classMember299); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Method20_tree = (CommonTree)adaptor.dupNode(Method20);


					root_1 = (CommonTree)adaptor.becomeRoot(Method20_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					CommonTree root_2 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					Modifiers21=(CommonTree)match(input,Modifiers,FOLLOW_Modifiers_in_classMember302); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Modifiers21_tree = (CommonTree)adaptor.dupNode(Modifiers21);


					root_2 = (CommonTree)adaptor.becomeRoot(Modifiers21_tree, root_2);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// ./Ldapi.g:308:27: ( fieldModifier )*
						loop8:
						while (true) {
							int alt8=2;
							int LA8_0 = input.LA(1);
							if ( (LA8_0==ABSTRACT||LA8_0==AccessModifier||LA8_0==118||LA8_0==122) ) {
								alt8=1;
							}

							switch (alt8) {
							case 1 :
								// ./Ldapi.g:308:27: fieldModifier
								{
								_last = (CommonTree)input.LT(1);
								pushFollow(FOLLOW_fieldModifier_in_classMember304);
								fieldModifier22=fieldModifier();
								state._fsp--;
								if (state.failed) return retval;
								if ( state.backtracking==0 ) 
								adaptor.addChild(root_2, fieldModifier22.getTree());

								if ( state.backtracking==0 ) {
								}

								}
								break;

							default :
								break loop8;
							}
						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (CommonTree)input.LT(1);
					UnquotedString23=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember308); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString23_tree = (CommonTree)adaptor.dupNode(UnquotedString23);


					adaptor.addChild(root_1, UnquotedString23_tree);
					}

					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					CommonTree root_2 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					Params24=(CommonTree)match(input,Params,FOLLOW_Params_in_classMember311); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Params24_tree = (CommonTree)adaptor.dupNode(Params24);


					root_2 = (CommonTree)adaptor.becomeRoot(Params24_tree, root_2);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// ./Ldapi.g:308:67: ( paramDef )*
						loop9:
						while (true) {
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==AMPERSAND||LA9_0==ArrayWord||LA9_0==DOLLAR||LA9_0==EQUALS||LA9_0==UnquotedString) ) {
								alt9=1;
							}

							switch (alt9) {
							case 1 :
								// ./Ldapi.g:308:67: paramDef
								{
								_last = (CommonTree)input.LT(1);
								pushFollow(FOLLOW_paramDef_in_classMember313);
								paramDef25=paramDef();
								state._fsp--;
								if (state.failed) return retval;
								if ( state.backtracking==0 ) 
								adaptor.addChild(root_2, paramDef25.getTree());

								if ( state.backtracking==0 ) {
								}

								}
								break;

							default :
								break loop9;
							}
						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					// ./Ldapi.g:308:78: ( ^( Block ( statement )* ) )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==Block) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// ./Ldapi.g:308:79: ^( Block ( statement )* )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_2 = _last;
							CommonTree _first_2 = null;
							CommonTree root_2 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							Block26=(CommonTree)match(input,Block,FOLLOW_Block_in_classMember319); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Block26_tree = (CommonTree)adaptor.dupNode(Block26);


							root_2 = (CommonTree)adaptor.becomeRoot(Block26_tree, root_2);
							}

							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); if (state.failed) return retval;
								// ./Ldapi.g:308:87: ( statement )*
								loop10:
								while (true) {
									int alt10=2;
									alt10 = dfa10.predict(input);
									switch (alt10) {
									case 1 :
										// ./Ldapi.g:308:87: statement
										{
										_last = (CommonTree)input.LT(1);
										pushFollow(FOLLOW_statement_in_classMember321);
										statement27=statement();
										state._fsp--;
										if (state.failed) return retval;
										if ( state.backtracking==0 ) 
										adaptor.addChild(root_2, statement27.getTree());

										if ( state.backtracking==0 ) {
										}

										}
										break;

									default :
										break loop10;
									}
								}

								match(input, Token.UP, null); if (state.failed) return retval;
							}
							adaptor.addChild(root_1, root_2);
							_last = _save_last_2;
							}


							if ( state.backtracking==0 ) {
							}

							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						  try{	
							currentMethod.setFunctionName((UnquotedString23!=null?UnquotedString23.getText():null));
							currentMethod.setCodeLine((UnquotedString23!=null?UnquotedString23.getLine():0));
							methtab_functions.define(currentMethod, currentMethod, false);

							Flags[6] = 0; /*defFunction_flag = 0;*/	
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:320:7: definitionAttribute
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_definitionAttribute_in_classMember337);
					definitionAttribute28=definitionAttribute();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, definitionAttribute28.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, classMember_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classMember"


	public static class definitionAttribute_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "definitionAttribute"
	// ./Ldapi.g:323:1: definitionAttribute : ( ^( VAR ^( DOLLAR UnquotedString ) ( value )? ) | ^( CONST UnquotedString ( value )? ) | ^( Field ^( Modifiers ( fieldModifier )* ) ^( DOLLAR UnquotedString ) ( value )? ) );
	public final Ldapi.definitionAttribute_return definitionAttribute() throws RecognitionException {
		Ldapi.definitionAttribute_return retval = new Ldapi.definitionAttribute_return();
		retval.start = input.LT(1);
		int definitionAttribute_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree VAR29=null;
		CommonTree DOLLAR30=null;
		CommonTree UnquotedString31=null;
		CommonTree CONST33=null;
		CommonTree UnquotedString34=null;
		CommonTree Field36=null;
		CommonTree Modifiers37=null;
		CommonTree DOLLAR39=null;
		CommonTree UnquotedString40=null;
		TreeRuleReturnScope value32 =null;
		TreeRuleReturnScope value35 =null;
		TreeRuleReturnScope fieldModifier38 =null;
		TreeRuleReturnScope value41 =null;

		CommonTree VAR29_tree=null;
		CommonTree DOLLAR30_tree=null;
		CommonTree UnquotedString31_tree=null;
		CommonTree CONST33_tree=null;
		CommonTree UnquotedString34_tree=null;
		CommonTree Field36_tree=null;
		CommonTree Modifiers37_tree=null;
		CommonTree DOLLAR39_tree=null;
		CommonTree UnquotedString40_tree=null;


			  try{
				Flags[19] = 1; //defAttribute_class
				currentScope = currentClass.getAttributes();
		     	CallSymbol ms = new CallSymbol("attrib", -1, currentScope, 0, currentFile);
		     	currentScope.define(ms, ms, false);
		     	currentScope = ms;
		     	attribName = null;
				} catch (Exception e){
					
				}
			
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// ./Ldapi.g:347:5: ( ^( VAR ^( DOLLAR UnquotedString ) ( value )? ) | ^( CONST UnquotedString ( value )? ) | ^( Field ^( Modifiers ( fieldModifier )* ) ^( DOLLAR UnquotedString ) ( value )? ) )
			int alt17=3;
			switch ( input.LA(1) ) {
			case VAR:
				{
				alt17=1;
				}
				break;
			case CONST:
				{
				alt17=2;
				}
				break;
			case Field:
				{
				alt17=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// ./Ldapi.g:347:7: ^( VAR ^( DOLLAR UnquotedString ) ( value )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					VAR29=(CommonTree)match(input,VAR,FOLLOW_VAR_in_definitionAttribute371); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VAR29_tree = (CommonTree)adaptor.dupNode(VAR29);


					root_1 = (CommonTree)adaptor.becomeRoot(VAR29_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					CommonTree root_2 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DOLLAR30=(CommonTree)match(input,DOLLAR,FOLLOW_DOLLAR_in_definitionAttribute374); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOLLAR30_tree = (CommonTree)adaptor.dupNode(DOLLAR30);


					root_2 = (CommonTree)adaptor.becomeRoot(DOLLAR30_tree, root_2);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					UnquotedString31=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_definitionAttribute376); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString31_tree = (CommonTree)adaptor.dupNode(UnquotedString31);


					adaptor.addChild(root_2, UnquotedString31_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					// ./Ldapi.g:347:38: ( value )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==Array||LA13_0==Boolean||LA13_0==DoubleQuotedString||LA13_0==HereDoc||LA13_0==Integer||LA13_0==List||LA13_0==Real||LA13_0==SingleQuotedString||LA13_0==UnquotedString||LA13_0==120) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// ./Ldapi.g:347:38: value
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_value_in_definitionAttribute379);
							value32=value();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, value32.getTree());

							if ( state.backtracking==0 ) {
							}

							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) { attribName =  (UnquotedString31!=null?UnquotedString31.getText():null); linha = (UnquotedString31!=null?UnquotedString31.getLine():0);}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:349:7: ^( CONST UnquotedString ( value )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					CONST33=(CommonTree)match(input,CONST,FOLLOW_CONST_in_definitionAttribute398); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CONST33_tree = (CommonTree)adaptor.dupNode(CONST33);


					root_1 = (CommonTree)adaptor.becomeRoot(CONST33_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					UnquotedString34=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_definitionAttribute400); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString34_tree = (CommonTree)adaptor.dupNode(UnquotedString34);


					adaptor.addChild(root_1, UnquotedString34_tree);
					}

					// ./Ldapi.g:349:30: ( value )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==Array||LA14_0==Boolean||LA14_0==DoubleQuotedString||LA14_0==HereDoc||LA14_0==Integer||LA14_0==List||LA14_0==Real||LA14_0==SingleQuotedString||LA14_0==UnquotedString||LA14_0==120) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// ./Ldapi.g:349:30: value
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_value_in_definitionAttribute402);
							value35=value();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, value35.getTree());

							if ( state.backtracking==0 ) {
							}

							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) { attribName =  (UnquotedString34!=null?UnquotedString34.getText():null); linha = (UnquotedString34!=null?UnquotedString34.getLine():0);}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// ./Ldapi.g:351:7: ^( Field ^( Modifiers ( fieldModifier )* ) ^( DOLLAR UnquotedString ) ( value )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					Field36=(CommonTree)match(input,Field,FOLLOW_Field_in_definitionAttribute421); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Field36_tree = (CommonTree)adaptor.dupNode(Field36);


					root_1 = (CommonTree)adaptor.becomeRoot(Field36_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					CommonTree root_2 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					Modifiers37=(CommonTree)match(input,Modifiers,FOLLOW_Modifiers_in_definitionAttribute424); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Modifiers37_tree = (CommonTree)adaptor.dupNode(Modifiers37);


					root_2 = (CommonTree)adaptor.becomeRoot(Modifiers37_tree, root_2);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// ./Ldapi.g:351:27: ( fieldModifier )*
						loop15:
						while (true) {
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( (LA15_0==ABSTRACT||LA15_0==AccessModifier||LA15_0==118||LA15_0==122) ) {
								alt15=1;
							}

							switch (alt15) {
							case 1 :
								// ./Ldapi.g:351:27: fieldModifier
								{
								_last = (CommonTree)input.LT(1);
								pushFollow(FOLLOW_fieldModifier_in_definitionAttribute426);
								fieldModifier38=fieldModifier();
								state._fsp--;
								if (state.failed) return retval;
								if ( state.backtracking==0 ) 
								adaptor.addChild(root_2, fieldModifier38.getTree());

								if ( state.backtracking==0 ) {
								}

								}
								break;

							default :
								break loop15;
							}
						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					CommonTree root_2 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DOLLAR39=(CommonTree)match(input,DOLLAR,FOLLOW_DOLLAR_in_definitionAttribute431); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOLLAR39_tree = (CommonTree)adaptor.dupNode(DOLLAR39);


					root_2 = (CommonTree)adaptor.becomeRoot(DOLLAR39_tree, root_2);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					UnquotedString40=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_definitionAttribute433); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString40_tree = (CommonTree)adaptor.dupNode(UnquotedString40);


					adaptor.addChild(root_2, UnquotedString40_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					// ./Ldapi.g:351:68: ( value )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==Array||LA16_0==Boolean||LA16_0==DoubleQuotedString||LA16_0==HereDoc||LA16_0==Integer||LA16_0==List||LA16_0==Real||LA16_0==SingleQuotedString||LA16_0==UnquotedString||LA16_0==120) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// ./Ldapi.g:351:68: value
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_value_in_definitionAttribute436);
							value41=value();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, value41.getTree());

							if ( state.backtracking==0 ) {
							}

							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) { attribName =  (UnquotedString40!=null?UnquotedString40.getText():null); linha = (UnquotedString40!=null?UnquotedString40.getLine():0);}
					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

			if ( state.backtracking==0 ) {
				  try{
					Flags[19] = 0;
					currentScope.getScopeSymbol().setCodeLine(linha);
					currentScope.getScopeSymbol().setName(attribName);
					currentScope = currentScope.getEnclosingScope();	
					} catch (Exception e){
						
					}	
				}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, definitionAttribute_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "definitionAttribute"


	public static class classModifier_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classModifier"
	// ./Ldapi.g:355:1: classModifier : 'abstract' ;
	public final Ldapi.classModifier_return classModifier() throws RecognitionException {
		Ldapi.classModifier_return retval = new Ldapi.classModifier_return();
		retval.start = input.LT(1);
		int classModifier_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal42=null;

		CommonTree string_literal42_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// ./Ldapi.g:356:5: ( 'abstract' )
			// ./Ldapi.g:356:7: 'abstract'
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			string_literal42=(CommonTree)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_classModifier463); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal42_tree = (CommonTree)adaptor.dupNode(string_literal42);


			adaptor.addChild(root_0, string_literal42_tree);
			}

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, classModifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classModifier"


	public static class fieldModifier_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fieldModifier"
	// ./Ldapi.g:359:1: fieldModifier : ( AccessModifier | 'abstract' | 'static' | 'final' );
	public final Ldapi.fieldModifier_return fieldModifier() throws RecognitionException {
		Ldapi.fieldModifier_return retval = new Ldapi.fieldModifier_return();
		retval.start = input.LT(1);
		int fieldModifier_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set43=null;

		CommonTree set43_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// ./Ldapi.g:360:5: ( AccessModifier | 'abstract' | 'static' | 'final' )
			// ./Ldapi.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set43=(CommonTree)input.LT(1);
			if ( input.LA(1)==ABSTRACT||input.LA(1)==AccessModifier||input.LA(1)==118||input.LA(1)==122 ) {
				input.consume();
				if ( state.backtracking==0 ) {
				set43_tree = (CommonTree)adaptor.dupNode(set43);


				adaptor.addChild(root_0, set43_tree);
				}

				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			if ( state.backtracking==0 ) {
			}
			 

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, fieldModifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "fieldModifier"


	public static class value_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "value"
	// ./Ldapi.g:363:1: value : ( 'null' | UnquotedString | atom );
	public final Ldapi.value_return value() throws RecognitionException {
		Ldapi.value_return retval = new Ldapi.value_return();
		retval.start = input.LT(1);
		int value_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal44=null;
		CommonTree UnquotedString45=null;
		TreeRuleReturnScope atom46 =null;

		CommonTree string_literal44_tree=null;
		CommonTree UnquotedString45_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// ./Ldapi.g:364:5: ( 'null' | UnquotedString | atom )
			int alt18=3;
			switch ( input.LA(1) ) {
			case 120:
				{
				int LA18_1 = input.LA(2);
				if ( (synpred26_Ldapi()) ) {
					alt18=1;
				}
				else if ( (true) ) {
					alt18=3;
				}

				}
				break;
			case UnquotedString:
				{
				alt18=2;
				}
				break;
			case Array:
			case Boolean:
			case DoubleQuotedString:
			case HereDoc:
			case Integer:
			case List:
			case Real:
			case SingleQuotedString:
				{
				alt18=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// ./Ldapi.g:364:7: 'null'
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					string_literal44=(CommonTree)match(input,120,FOLLOW_120_in_value513); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal44_tree = (CommonTree)adaptor.dupNode(string_literal44);


					adaptor.addChild(root_0, string_literal44_tree);
					}

					if ( state.backtracking==0 ) {
							VariableSymbol vs = new VariableSymbol("null", 0, linha, true, currentFile);
					   		currentScope.define(vs, null, true);      
					      }
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:369:4: UnquotedString
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					UnquotedString45=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_value526); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString45_tree = (CommonTree)adaptor.dupNode(UnquotedString45);


					adaptor.addChild(root_0, UnquotedString45_tree);
					}

					if ( state.backtracking==0 ) {
						   try{
						    if (Flags[15] == 0 && Flags[17] == 0){
							texto = (UnquotedString45!=null?UnquotedString45.getText():null);
							linha = (UnquotedString45!=null?UnquotedString45.getLine():0);
							if (Flags[7] == 0 ){
								VariableSymbol vs = new VariableSymbol(texto, 0, linha, true, currentFile);
						   		currentScope.define(vs, null, true);
							}
						    }
						    else
						    	Flags[17] = 0;
							} catch (Exception e){
								
							}
						 }
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// ./Ldapi.g:386:7: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atom_in_value538);
					atom46=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, atom46.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, value_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "value"


	public static class complexStatement_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "complexStatement"
	// ./Ldapi.g:389:1: complexStatement : ( ifStatement | ^( FOR forHeader statement ) | ^( FOR_EACH forHeader statement ) | ^( WHILE whileCondition statement ) | ^( DO statement whileCondition ) | ^( SWITCH expression cases ) | functionDefinition | ^( TRY statement catchStatement ) );
	public final Ldapi.complexStatement_return complexStatement() throws RecognitionException {
		Ldapi.complexStatement_return retval = new Ldapi.complexStatement_return();
		retval.start = input.LT(1);
		int complexStatement_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree FOR48=null;
		CommonTree FOR_EACH51=null;
		CommonTree WHILE54=null;
		CommonTree DO57=null;
		CommonTree SWITCH60=null;
		CommonTree TRY64=null;
		TreeRuleReturnScope ifStatement47 =null;
		TreeRuleReturnScope forHeader49 =null;
		TreeRuleReturnScope statement50 =null;
		TreeRuleReturnScope forHeader52 =null;
		TreeRuleReturnScope statement53 =null;
		TreeRuleReturnScope whileCondition55 =null;
		TreeRuleReturnScope statement56 =null;
		TreeRuleReturnScope statement58 =null;
		TreeRuleReturnScope whileCondition59 =null;
		TreeRuleReturnScope expression61 =null;
		TreeRuleReturnScope cases62 =null;
		TreeRuleReturnScope functionDefinition63 =null;
		TreeRuleReturnScope statement65 =null;
		TreeRuleReturnScope catchStatement66 =null;

		CommonTree FOR48_tree=null;
		CommonTree FOR_EACH51_tree=null;
		CommonTree WHILE54_tree=null;
		CommonTree DO57_tree=null;
		CommonTree SWITCH60_tree=null;
		CommonTree TRY64_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// ./Ldapi.g:390:5: ( ifStatement | ^( FOR forHeader statement ) | ^( FOR_EACH forHeader statement ) | ^( WHILE whileCondition statement ) | ^( DO statement whileCondition ) | ^( SWITCH expression cases ) | functionDefinition | ^( TRY statement catchStatement ) )
			int alt19=8;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt19=1;
				}
				break;
			case FOR:
				{
				alt19=2;
				}
				break;
			case FOR_EACH:
				{
				alt19=3;
				}
				break;
			case WHILE:
				{
				alt19=4;
				}
				break;
			case DO:
				{
				alt19=5;
				}
				break;
			case SWITCH:
				{
				alt19=6;
				}
				break;
			case FUNCTION:
				{
				alt19=7;
				}
				break;
			case TRY:
				{
				alt19=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// ./Ldapi.g:390:7: ifStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_ifStatement_in_complexStatement555);
					ifStatement47=ifStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, ifStatement47.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:391:7: ^( FOR forHeader statement )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					FOR48=(CommonTree)match(input,FOR,FOLLOW_FOR_in_complexStatement569); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FOR48_tree = (CommonTree)adaptor.dupNode(FOR48);


					root_1 = (CommonTree)adaptor.becomeRoot(FOR48_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_forHeader_in_complexStatement571);
					forHeader49=forHeader();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, forHeader49.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_complexStatement573);
					statement50=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, statement50.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// ./Ldapi.g:392:7: ^( FOR_EACH forHeader statement )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					FOR_EACH51=(CommonTree)match(input,FOR_EACH,FOLLOW_FOR_EACH_in_complexStatement583); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FOR_EACH51_tree = (CommonTree)adaptor.dupNode(FOR_EACH51);


					root_1 = (CommonTree)adaptor.becomeRoot(FOR_EACH51_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_forHeader_in_complexStatement585);
					forHeader52=forHeader();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, forHeader52.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_complexStatement587);
					statement53=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, statement53.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// ./Ldapi.g:393:7: ^( WHILE whileCondition statement )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					WHILE54=(CommonTree)match(input,WHILE,FOLLOW_WHILE_in_complexStatement597); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WHILE54_tree = (CommonTree)adaptor.dupNode(WHILE54);


					root_1 = (CommonTree)adaptor.becomeRoot(WHILE54_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_whileCondition_in_complexStatement599);
					whileCondition55=whileCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, whileCondition55.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_complexStatement601);
					statement56=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, statement56.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 5 :
					// ./Ldapi.g:394:7: ^( DO statement whileCondition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DO57=(CommonTree)match(input,DO,FOLLOW_DO_in_complexStatement611); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DO57_tree = (CommonTree)adaptor.dupNode(DO57);


					root_1 = (CommonTree)adaptor.becomeRoot(DO57_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_complexStatement613);
					statement58=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, statement58.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_whileCondition_in_complexStatement615);
					whileCondition59=whileCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, whileCondition59.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 6 :
					// ./Ldapi.g:395:7: ^( SWITCH expression cases )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					SWITCH60=(CommonTree)match(input,SWITCH,FOLLOW_SWITCH_in_complexStatement625); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SWITCH60_tree = (CommonTree)adaptor.dupNode(SWITCH60);


					root_1 = (CommonTree)adaptor.becomeRoot(SWITCH60_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_complexStatement627);
					expression61=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression61.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_cases_in_complexStatement629);
					cases62=cases();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, cases62.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 7 :
					// ./Ldapi.g:396:7: functionDefinition
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
						  try{
						   if (Flags[15] == 0){
							int subfunc = 0;
							String s = "";
							// Se for verdadeiro estamos na presenca de uma definicao de uma UserSubFunction
							if (Flags[6] == 1){ /*defFunction_flag = 1;*/
								currentMethod.setHaveSubFunctions();
								subfunc = 1;
								s = currentMethod.getFunctionName();
								progenitorMethod = currentMethod;
							}
							else{
								Flags[6] = 1; /*defFunction_flag = 1;*/
								st_BeforeDefFunction = currentSymbolTable;
								scp_BeforeDefFunction = currentScope;
							}

							if (currentSymbolTable.getHaveFunctions() == false){
								currentSymbolTable.setHaveFunctions();
								methtab_functions = new MethodTable(currentFile);
								mft.put(currentFile, methtab_functions);
							}
							else {
								methtab_functions = (MethodTable)mft.get(currentFile);
							}
							// o nome da funcao e o id da linha somente sao inseridos no fim da def da funcao
							currentMethod = new MethodSymbol("UserFunction", -1, 0, null, currentFile);
							if (subfunc == 1)
								currentMethod.setProgenitorFunction(s);
							currentScope = (Scope)currentMethod;
							posParmDefFunc = 1;
						   }
						  	} catch (Exception e){
								
							}	   
						}
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_functionDefinition_in_complexStatement641);
					functionDefinition63=functionDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, functionDefinition63.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 8 :
					// ./Ldapi.g:434:4: ^( TRY statement catchStatement )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					TRY64=(CommonTree)match(input,TRY,FOLLOW_TRY_in_complexStatement648); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TRY64_tree = (CommonTree)adaptor.dupNode(TRY64);


					root_1 = (CommonTree)adaptor.becomeRoot(TRY64_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_complexStatement650);
					statement65=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, statement65.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_catchStatement_in_complexStatement652);
					catchStatement66=catchStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, catchStatement66.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, complexStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "complexStatement"


	public static class catchStatement_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "catchStatement"
	// ./Ldapi.g:437:1: catchStatement : ^( CATCH whileCondition statement ) ;
	public final Ldapi.catchStatement_return catchStatement() throws RecognitionException {
		Ldapi.catchStatement_return retval = new Ldapi.catchStatement_return();
		retval.start = input.LT(1);
		int catchStatement_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree CATCH67=null;
		TreeRuleReturnScope whileCondition68 =null;
		TreeRuleReturnScope statement69 =null;

		CommonTree CATCH67_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// ./Ldapi.g:438:2: ( ^( CATCH whileCondition statement ) )
			// ./Ldapi.g:438:4: ^( CATCH whileCondition statement )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			CATCH67=(CommonTree)match(input,CATCH,FOLLOW_CATCH_in_catchStatement668); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CATCH67_tree = (CommonTree)adaptor.dupNode(CATCH67);


			root_1 = (CommonTree)adaptor.becomeRoot(CATCH67_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_whileCondition_in_catchStatement670);
			whileCondition68=whileCondition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, whileCondition68.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_statement_in_catchStatement672);
			statement69=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, statement69.getTree());

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, catchStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "catchStatement"


	public static class simpleStatement_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleStatement"
	// ./Ldapi.g:441:1: simpleStatement : ( ^( GLOBAL ( name )+ ) | ^( RETURN ( expression )? ) | simpleRequire | expression | outputFunctions | ignoreOthers );
	public final Ldapi.simpleStatement_return simpleStatement() throws RecognitionException {
		Ldapi.simpleStatement_return retval = new Ldapi.simpleStatement_return();
		retval.start = input.LT(1);
		int simpleStatement_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree GLOBAL70=null;
		CommonTree RETURN72=null;
		TreeRuleReturnScope name71 =null;
		TreeRuleReturnScope expression73 =null;
		TreeRuleReturnScope simpleRequire74 =null;
		TreeRuleReturnScope expression75 =null;
		TreeRuleReturnScope outputFunctions76 =null;
		TreeRuleReturnScope ignoreOthers77 =null;

		CommonTree GLOBAL70_tree=null;
		CommonTree RETURN72_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// ./Ldapi.g:442:5: ( ^( GLOBAL ( name )+ ) | ^( RETURN ( expression )? ) | simpleRequire | expression | outputFunctions | ignoreOthers )
			int alt22=6;
			alt22 = dfa22.predict(input);
			switch (alt22) {
				case 1 :
					// ./Ldapi.g:442:7: ^( GLOBAL ( name )+ )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
							Flags[9] = 1; /*globalVarFunction_flag = 1;*/
						}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					GLOBAL70=(CommonTree)match(input,GLOBAL,FOLLOW_GLOBAL_in_simpleStatement696); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GLOBAL70_tree = (CommonTree)adaptor.dupNode(GLOBAL70);


					root_1 = (CommonTree)adaptor.becomeRoot(GLOBAL70_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// ./Ldapi.g:445:16: ( name )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==CLASS_MEMBER||LA20_0==DOLLAR||LA20_0==INSTANCE_MEMBER||LA20_0==OPEN_SQUARE_BRACE||LA20_0==UnquotedString) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// ./Ldapi.g:445:16: name
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_name_in_simpleStatement698);
							name71=name();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, name71.getTree());

							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						   try{
							Flags[9] = 0; /*globalVarFunction_flag = 0;*/
									Iterator <Symbol> it;
									if (Flags[6] == 1)
										it = currentMethod.getGlobalVarsOfFunction().values().iterator();
									else
										it = currentSymbolTable.getGlobalVarsOfSymbolTable().values().iterator();
									Symbol sym1;
									for(; it.hasNext();){
							   			sym1 = it.next();	
									}
						  	} catch (Exception e){
								
							}
						 	
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:463:8: ^( RETURN ( expression )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
						  try{
						   if (Flags[15] == 0){
							// o id da linha somente e' inserido no fim do return
							CallSymbol ms = new CallSymbol("return", -1, currentScope, 0, currentFile);
							currentScope.define(ms, ms, false);
							currentScope = ms;
							
							// se o return somente retorna avaliacao de condicoes estamos perante a avaliacao de condicoes do if 
							Flags[14] = 1; /*if_presence_flag=1 */
							indexIf++;
							numElemIfBegin.add(currentScope.getMembers().size());
						   }
							} catch (Exception e){
								
							}
						}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					RETURN72=(CommonTree)match(input,RETURN,FOLLOW_RETURN_in_simpleStatement718); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RETURN72_tree = (CommonTree)adaptor.dupNode(RETURN72);


					root_1 = (CommonTree)adaptor.becomeRoot(RETURN72_tree, root_1);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// ./Ldapi.g:480:12: ( expression )?
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==AMPERSAND||LA21_0==ASTERISK||(LA21_0 >= Apply && LA21_0 <= Array)||(LA21_0 >= AssignmentOperator && LA21_0 <= BANG)||LA21_0==Boolean||(LA21_0 >= CLASS_MEMBER && LA21_0 <= CLONE)||(LA21_0 >= Cast && LA21_0 <= ConcatAssigmentOperator)||LA21_0==DIE||(LA21_0 >= DOLLAR && LA21_0 <= DOT)||(LA21_0 >= DoubleQuotedString && LA21_0 <= ECHO)||(LA21_0 >= EQUALS && LA21_0 <= EqualityOperator)||LA21_0==FORWARD_SLASH||LA21_0==HereDoc||(LA21_0 >= INSTANCE_MEMBER && LA21_0 <= IfExpression)||(LA21_0 >= Integer && LA21_0 <= List)||LA21_0==MINUS||LA21_0==NEW||LA21_0==OPEN_SQUARE_BRACE||(LA21_0 >= PERCENT && LA21_0 <= PRINTF)||(LA21_0 >= Postfix && LA21_0 <= Prefix)||LA21_0==Real||LA21_0==SUPPRESS_WARNINGS||(LA21_0 >= ShiftOperator && LA21_0 <= SingleQuotedString)||LA21_0==TILDE||LA21_0==UnquotedString||(LA21_0 >= 114 && LA21_0 <= 117)||(LA21_0 >= 120 && LA21_0 <= 121)||LA21_0==123) ) {
							alt21=1;
						}
						switch (alt21) {
							case 1 :
								// ./Ldapi.g:480:12: expression
								{
								_last = (CommonTree)input.LT(1);
								pushFollow(FOLLOW_expression_in_simpleStatement720);
								expression73=expression();
								state._fsp--;
								if (state.failed) return retval;
								if ( state.backtracking==0 ) 
								adaptor.addChild(root_1, expression73.getTree());

								if ( state.backtracking==0 ) {
								}

								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						  try{
						   if (Flags[15] == 0){
							currentScope.getScopeSymbol().setCodeLine(linha); // atribuicao da linha ao symbol do return
						
							// Ver se o return e' uma instrucao de classe
							// Primeiro ve se e' um acesso, senao ve se e' um resultado de uma operacao de classe
							if (Flags[25] == 1){ // instanceMember_flag = 1
								Flags[25] = 0;
								currentScope.getScopeSymbol().setIsClassInstruction(true);
							}
							else{
								if (Flags[18] == 1){ // defFunction_class = 1
									Scope sc = currentScope.getEnclosingScope();				
									Symbol sy = (Symbol) currentScope.getMembers().get(0);
									
									Iterator <Symbol> it = sc.getMembers().iterator();
							   		Symbol sym1;
							   		Boolean is = false;
							  		for(; it.hasNext();){
										sym1 = it.next();
										if (sym1.getName().equals(sy.getName()) == true){
											if (sym1.getIsClassInstruction() == true)
												is = true;
											else
												is = false;
										}
							   		}
									currentScope.getScopeSymbol().setIsClassInstruction(is);				
								}
							}
							// Fim
							
							currentScope = currentScope.getEnclosingScope();		
							
							// se o return somente retorna avaliacao de condicoes estamos perante a avaliacao de condicoes do if 
							Flags[14] = 0;
							numElemIfBegin.remove(indexIf-1);
							indexIf--; 
						   }
						  	} catch (Exception e){
								
							}
						 }
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// ./Ldapi.g:525:7: simpleRequire
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_simpleRequire_in_simpleStatement735);
					simpleRequire74=simpleRequire();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, simpleRequire74.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// ./Ldapi.g:526:7: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_simpleStatement743);
					expression75=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, expression75.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 5 :
					// ./Ldapi.g:527:7: outputFunctions
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_outputFunctions_in_simpleStatement752);
					outputFunctions76=outputFunctions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, outputFunctions76.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 6 :
					// ./Ldapi.g:528:7: ignoreOthers
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_ignoreOthers_in_simpleStatement760);
					ignoreOthers77=ignoreOthers();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, ignoreOthers77.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, simpleStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "simpleStatement"


	public static class simpleRequire_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleRequire"
	// ./Ldapi.g:531:1: simpleRequire : ^( RequireOperator expression ) ;
	public final Ldapi.simpleRequire_return simpleRequire() throws RecognitionException {
		Ldapi.simpleRequire_return retval = new Ldapi.simpleRequire_return();
		retval.start = input.LT(1);
		int simpleRequire_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree RequireOperator78=null;
		TreeRuleReturnScope expression79 =null;

		CommonTree RequireOperator78_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// ./Ldapi.g:532:5: ( ^( RequireOperator expression ) )
			// ./Ldapi.g:532:7: ^( RequireOperator expression )
			{
			root_0 = (CommonTree)adaptor.nil();


			if ( state.backtracking==0 ) {
				   try{
				    if (Flags[15] == 0){
					// o id da linha somente e' inserido no fim do include, require
					Flags[4] = 1; /*increq_flag = 1;*/
					CallSymbol ms = new CallSymbol("include", -1, currentScope, 0, currentFile);
					currentScope.define(ms, ms, false);
					currentScope = ms;
				    }
					} catch (Exception e){
						
					}
				 }
			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			RequireOperator78=(CommonTree)match(input,RequireOperator,FOLLOW_RequireOperator_in_simpleRequire786); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RequireOperator78_tree = (CommonTree)adaptor.dupNode(RequireOperator78);


			root_1 = (CommonTree)adaptor.becomeRoot(RequireOperator78_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expression_in_simpleRequire788);
			expression79=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, expression79.getTree());

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
				   try{
				    if (Flags[15] == 0){
				   	currentScope.getScopeSymbol().setCodeLine(linha); // atribuicao da linha ao symbol do include
				   	Scope scp_aux, scp_aux1;
				   	SymbolTable st_aux, st_aux1;
				   	String ss, f;

			 	   	// ver se "var texto" existe no currentScope, para resolver o conteudo da "var texto"
				   	// se assim acontecer "var texto" passa a ser igual ao conteudo da var encontrada e type_increq passa a static
				   	scp_aux = currentScope;
					f = scp_aux.resolveVarInclude(scp_aux, currentSymbolTable);
				   	type_increq = "static";
				   	texto = "\"" +f+ "\"";

				   	//Verificar se f tem _GET. Se sim entao não pode analisar fich
					int t = 0;
					for (String aux : GlobalDataLDAPi.UserInput){
						if (f.contains(aux) == true){
							t = 1;
							break;
						}
					}
					
					if(t == 0){
						st_aux = currentSymbolTable; // para precaver que apos analise do file include volta ao mesmo symbolTable
						scp_aux = scp_aux.getEnclosingScope(); // para precaver que apos analise do file include volta ao scope antes do scope includeF
						f = currentFile; // para precaver que apos analise do file include volta ao mesmo file
						if (type_increq.equals("static")){
							String x = "";
							if (texto.startsWith("\"") || texto.startsWith("\'"))
								x = texto.substring(1,texto.length()-1);
							else
								x = texto;
							ManageFiles ff = new ManageFiles(x);
							ManageFiles fff = new ManageFiles(f);
							String xx = "";
							try{
								xx = ff.composePathFile(x, fff.getBaseDir());				
							} catch (Exception e){}
							
							if (xx.equals("") == false){
								 if (xx.contains(".") == true){
									if (ff.validExtension(xx, 0) == true){
										Symbol sym = (Symbol) currentScope.getMembers().get(0);
										sym.setName(xx);
															   
										if (st_aux.getIncludeFiles().contains(xx) == false)
											st_aux.getIncludeFiles().add(xx);
										try{
											st_aux.mvIncludeFiles(list_files, xx);
										} catch (Exception e) {}
									}
								 }			
							}
						}
						currentSymbolTable = st_aux;
						currentScope = scp_aux;			
						currentFile = f;
					}
					else{
						int k = currentSymbolTable.getMembers().size();
						currentScope = currentScope.getEnclosingScope();
					   	currentScope.getMembers().remove(k-1);
					}
					Flags[4] = 0;
				    }
				  	} catch (Exception e){
						
					}
				}
			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, simpleRequire_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "simpleRequire"


	public static class ifStatement_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// ./Ldapi.g:620:1: ifStatement options {backtrack=true; } : ^( IF expression statement ( conditional )? ) ;
	public final Ldapi.ifStatement_return ifStatement() throws RecognitionException {
		Ldapi.ifStatement_return retval = new Ldapi.ifStatement_return();
		retval.start = input.LT(1);
		int ifStatement_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree IF80=null;
		TreeRuleReturnScope expression81 =null;
		TreeRuleReturnScope statement82 =null;
		TreeRuleReturnScope conditional83 =null;

		CommonTree IF80_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// ./Ldapi.g:622:5: ( ^( IF expression statement ( conditional )? ) )
			// ./Ldapi.g:622:7: ^( IF expression statement ( conditional )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			if ( state.backtracking==0 ) {
					try{
			    	  Flags[14] = 1; /*if_presence_flag=1 */
			    	  indexIf++;
			    	  numElemIfBegin.add(currentScope.getMembers().size());  
					} catch (Exception e){
						
					}  	  
			      }
			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			IF80=(CommonTree)match(input,IF,FOLLOW_IF_in_ifStatement831); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF80_tree = (CommonTree)adaptor.dupNode(IF80);


			root_1 = (CommonTree)adaptor.becomeRoot(IF80_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expression_in_ifStatement833);
			expression81=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, expression81.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_statement_in_ifStatement835);
			statement82=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, statement82.getTree());

			// ./Ldapi.g:631:32: ( conditional )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ELSE||LA23_0==IF) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// ./Ldapi.g:631:32: conditional
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_conditional_in_ifStatement837);
					conditional83=conditional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, conditional83.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
					try{
			         Flags[14] = 0;
			         numElemIfBegin.remove(indexIf-1);
			         indexIf--;  
					} catch (Exception e){
						
					}       
			      }
			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, ifStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ifStatement"


	public static class conditional_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conditional"
	// ./Ldapi.g:645:1: conditional : ( ^( ELSE statement ) | ^( IF expression statement ( conditional )? ) );
	public final Ldapi.conditional_return conditional() throws RecognitionException {
		Ldapi.conditional_return retval = new Ldapi.conditional_return();
		retval.start = input.LT(1);
		int conditional_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ELSE84=null;
		CommonTree IF86=null;
		TreeRuleReturnScope statement85 =null;
		TreeRuleReturnScope expression87 =null;
		TreeRuleReturnScope statement88 =null;
		TreeRuleReturnScope conditional89 =null;

		CommonTree ELSE84_tree=null;
		CommonTree IF86_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// ./Ldapi.g:646:5: ( ^( ELSE statement ) | ^( IF expression statement ( conditional )? ) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==ELSE) ) {
				alt25=1;
			}
			else if ( (LA25_0==IF) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// ./Ldapi.g:646:7: ^( ELSE statement )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ELSE84=(CommonTree)match(input,ELSE,FOLLOW_ELSE_in_conditional868); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELSE84_tree = (CommonTree)adaptor.dupNode(ELSE84);


					root_1 = (CommonTree)adaptor.becomeRoot(ELSE84_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_conditional870);
					statement85=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, statement85.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:647:7: ^( IF expression statement ( conditional )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
							try{
					    	  Flags[14] = 1;
					    	  indexIf++;
					    	  numElemIfBegin.add(currentScope.getMembers().size());
							} catch (Exception e){
								
							}   	  
					      }
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IF86=(CommonTree)match(input,IF,FOLLOW_IF_in_conditional889); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IF86_tree = (CommonTree)adaptor.dupNode(IF86);


					root_1 = (CommonTree)adaptor.becomeRoot(IF86_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_conditional891);
					expression87=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression87.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_conditional893);
					statement88=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, statement88.getTree());

					// ./Ldapi.g:656:34: ( conditional )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ELSE||LA24_0==IF) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// ./Ldapi.g:656:34: conditional
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_conditional_in_conditional895);
							conditional89=conditional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, conditional89.getTree());

							if ( state.backtracking==0 ) {
							}

							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							try{
					         Flags[14] = 0;
					         numElemIfBegin.remove(indexIf-1);
					         indexIf--;
							} catch (Exception e){
								
							}         
					      }
					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, conditional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "conditional"


	public static class forHeader_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forHeader"
	// ./Ldapi.g:668:1: forHeader : ignoreStatement ;
	public final Ldapi.forHeader_return forHeader() throws RecognitionException {
		Ldapi.forHeader_return retval = new Ldapi.forHeader_return();
		retval.start = input.LT(1);
		int forHeader_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope ignoreStatement90 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// ./Ldapi.g:669:5: ( ignoreStatement )
			// ./Ldapi.g:669:7: ignoreStatement
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_ignoreStatement_in_forHeader922);
			ignoreStatement90=ignoreStatement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_0, ignoreStatement90.getTree());

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, forHeader_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forHeader"


	public static class whileCondition_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whileCondition"
	// ./Ldapi.g:672:1: whileCondition : ignoreStatement ;
	public final Ldapi.whileCondition_return whileCondition() throws RecognitionException {
		Ldapi.whileCondition_return retval = new Ldapi.whileCondition_return();
		retval.start = input.LT(1);
		int whileCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope ignoreStatement91 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// ./Ldapi.g:673:5: ( ignoreStatement )
			// ./Ldapi.g:673:7: ignoreStatement
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_ignoreStatement_in_whileCondition939);
			ignoreStatement91=ignoreStatement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_0, ignoreStatement91.getTree());

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, whileCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "whileCondition"


	public static class ignoreOthers_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ignoreOthers"
	// ./Ldapi.g:676:1: ignoreOthers : ignoreStatement ;
	public final Ldapi.ignoreOthers_return ignoreOthers() throws RecognitionException {
		Ldapi.ignoreOthers_return retval = new Ldapi.ignoreOthers_return();
		retval.start = input.LT(1);
		int ignoreOthers_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope ignoreStatement92 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// ./Ldapi.g:677:5: ( ignoreStatement )
			// ./Ldapi.g:677:7: ignoreStatement
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_ignoreStatement_in_ignoreOthers956);
			ignoreStatement92=ignoreStatement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_0, ignoreStatement92.getTree());

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, ignoreOthers_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ignoreOthers"


	public static class cases_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cases"
	// ./Ldapi.g:680:1: cases : ( casestatement )* ( defaultcase )? ;
	public final Ldapi.cases_return cases() throws RecognitionException {
		Ldapi.cases_return retval = new Ldapi.cases_return();
		retval.start = input.LT(1);
		int cases_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope casestatement93 =null;
		TreeRuleReturnScope defaultcase94 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// ./Ldapi.g:681:5: ( ( casestatement )* ( defaultcase )? )
			// ./Ldapi.g:681:7: ( casestatement )* ( defaultcase )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// ./Ldapi.g:681:7: ( casestatement )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==CASE) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// ./Ldapi.g:681:7: casestatement
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_casestatement_in_cases974);
					casestatement93=casestatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, casestatement93.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					break loop26;
				}
			}

			// ./Ldapi.g:681:22: ( defaultcase )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==DEFAULT) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// ./Ldapi.g:681:22: defaultcase
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_defaultcase_in_cases977);
					defaultcase94=defaultcase();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, defaultcase94.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, cases_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cases"


	public static class casestatement_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "casestatement"
	// ./Ldapi.g:684:1: casestatement : ^( CASE expression ( statement )* ) ;
	public final Ldapi.casestatement_return casestatement() throws RecognitionException {
		Ldapi.casestatement_return retval = new Ldapi.casestatement_return();
		retval.start = input.LT(1);
		int casestatement_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree CASE95=null;
		TreeRuleReturnScope expression96 =null;
		TreeRuleReturnScope statement97 =null;

		CommonTree CASE95_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// ./Ldapi.g:685:5: ( ^( CASE expression ( statement )* ) )
			// ./Ldapi.g:685:7: ^( CASE expression ( statement )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			if ( state.backtracking==0 ) {
				  Flags[17] = 1; /*case_flag = 1;*/
			      }
			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			CASE95=(CommonTree)match(input,CASE,FOLLOW_CASE_in_casestatement1003); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE95_tree = (CommonTree)adaptor.dupNode(CASE95);


			root_1 = (CommonTree)adaptor.becomeRoot(CASE95_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expression_in_casestatement1005);
			expression96=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, expression96.getTree());

			// ./Ldapi.g:688:24: ( statement )*
			loop28:
			while (true) {
				int alt28=2;
				alt28 = dfa28.predict(input);
				switch (alt28) {
				case 1 :
					// ./Ldapi.g:688:24: statement
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_casestatement1007);
					statement97=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, statement97.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					break loop28;
				}
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, casestatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "casestatement"


	public static class defaultcase_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "defaultcase"
	// ./Ldapi.g:691:1: defaultcase : ^( DEFAULT ( statement )* ) ;
	public final Ldapi.defaultcase_return defaultcase() throws RecognitionException {
		Ldapi.defaultcase_return retval = new Ldapi.defaultcase_return();
		retval.start = input.LT(1);
		int defaultcase_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DEFAULT98=null;
		TreeRuleReturnScope statement99 =null;

		CommonTree DEFAULT98_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// ./Ldapi.g:692:5: ( ^( DEFAULT ( statement )* ) )
			// ./Ldapi.g:692:7: ^( DEFAULT ( statement )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			DEFAULT98=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultcase1028); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEFAULT98_tree = (CommonTree)adaptor.dupNode(DEFAULT98);


			root_1 = (CommonTree)adaptor.becomeRoot(DEFAULT98_tree, root_1);
			}

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// ./Ldapi.g:692:17: ( statement )*
				loop29:
				while (true) {
					int alt29=2;
					alt29 = dfa29.predict(input);
					switch (alt29) {
					case 1 :
						// ./Ldapi.g:692:17: statement
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_statement_in_defaultcase1030);
						statement99=statement();
						state._fsp--;
						if (state.failed) return retval;
						if ( state.backtracking==0 ) 
						adaptor.addChild(root_1, statement99.getTree());

						if ( state.backtracking==0 ) {
						}

						}
						break;

					default :
						break loop29;
					}
				}

				match(input, Token.UP, null); if (state.failed) return retval;
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, defaultcase_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultcase"


	public static class functionDefinition_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "functionDefinition"
	// ./Ldapi.g:695:1: functionDefinition : ^( FUNCTION UnquotedString ^( Params ( paramDef )* ) ^( Block ( statement )* ) ) ;
	public final Ldapi.functionDefinition_return functionDefinition() throws RecognitionException {
		Ldapi.functionDefinition_return retval = new Ldapi.functionDefinition_return();
		retval.start = input.LT(1);
		int functionDefinition_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree FUNCTION100=null;
		CommonTree UnquotedString101=null;
		CommonTree Params102=null;
		CommonTree Block104=null;
		TreeRuleReturnScope paramDef103 =null;
		TreeRuleReturnScope statement105 =null;

		CommonTree FUNCTION100_tree=null;
		CommonTree UnquotedString101_tree=null;
		CommonTree Params102_tree=null;
		CommonTree Block104_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// ./Ldapi.g:696:5: ( ^( FUNCTION UnquotedString ^( Params ( paramDef )* ) ^( Block ( statement )* ) ) )
			// ./Ldapi.g:696:7: ^( FUNCTION UnquotedString ^( Params ( paramDef )* ) ^( Block ( statement )* ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			FUNCTION100=(CommonTree)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDefinition1051); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FUNCTION100_tree = (CommonTree)adaptor.dupNode(FUNCTION100);


			root_1 = (CommonTree)adaptor.becomeRoot(FUNCTION100_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			UnquotedString101=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_functionDefinition1053); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			UnquotedString101_tree = (CommonTree)adaptor.dupNode(UnquotedString101);


			adaptor.addChild(root_1, UnquotedString101_tree);
			}

			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_2 = _last;
			CommonTree _first_2 = null;
			CommonTree root_2 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			Params102=(CommonTree)match(input,Params,FOLLOW_Params_in_functionDefinition1056); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Params102_tree = (CommonTree)adaptor.dupNode(Params102);


			root_2 = (CommonTree)adaptor.becomeRoot(Params102_tree, root_2);
			}

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// ./Ldapi.g:696:42: ( paramDef )*
				loop30:
				while (true) {
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==AMPERSAND||LA30_0==ArrayWord||LA30_0==DOLLAR||LA30_0==EQUALS||LA30_0==UnquotedString) ) {
						alt30=1;
					}

					switch (alt30) {
					case 1 :
						// ./Ldapi.g:696:42: paramDef
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_paramDef_in_functionDefinition1058);
						paramDef103=paramDef();
						state._fsp--;
						if (state.failed) return retval;
						if ( state.backtracking==0 ) 
						adaptor.addChild(root_2, paramDef103.getTree());

						if ( state.backtracking==0 ) {
						}

						}
						break;

					default :
						break loop30;
					}
				}

				match(input, Token.UP, null); if (state.failed) return retval;
			}
			adaptor.addChild(root_1, root_2);
			_last = _save_last_2;
			}


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_2 = _last;
			CommonTree _first_2 = null;
			CommonTree root_2 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			Block104=(CommonTree)match(input,Block,FOLLOW_Block_in_functionDefinition1063); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Block104_tree = (CommonTree)adaptor.dupNode(Block104);


			root_2 = (CommonTree)adaptor.becomeRoot(Block104_tree, root_2);
			}

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// ./Ldapi.g:696:61: ( statement )*
				loop31:
				while (true) {
					int alt31=2;
					alt31 = dfa31.predict(input);
					switch (alt31) {
					case 1 :
						// ./Ldapi.g:696:61: statement
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_statement_in_functionDefinition1065);
						statement105=statement();
						state._fsp--;
						if (state.failed) return retval;
						if ( state.backtracking==0 ) 
						adaptor.addChild(root_2, statement105.getTree());

						if ( state.backtracking==0 ) {
						}

						}
						break;

					default :
						break loop31;
					}
				}

				match(input, Token.UP, null); if (state.failed) return retval;
			}
			adaptor.addChild(root_1, root_2);
			_last = _save_last_2;
			}


			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
				  try{	
				   if (Flags[15] == 0){
					currentMethod.setFunctionName((UnquotedString101!=null?UnquotedString101.getText():null));
					currentMethod.setCodeLine((UnquotedString101!=null?UnquotedString101.getLine():0));
					methtab_functions.define(currentMethod, currentMethod, false);

					/* Para ver se e' o final da definicao de uma subfunction, se sim entao sera falso */
					if (currentMethod.getProgenitorFunction().equals("") == true){
						Flags[6] = 0; /*defFunction_flag = 0;*/	
						currentSymbolTable = st_BeforeDefFunction;
						currentScope = scp_BeforeDefFunction;
					}
					else{ //estou em subFunction
						currentMethod = progenitorMethod;
						currentScope = (Scope)currentMethod;
					}

				   }
				  	} catch (Exception e){
						
					}
				}
			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, functionDefinition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionDefinition"


	public static class paramDef_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "paramDef"
	// ./Ldapi.g:723:1: paramDef : ( ^( EQUALS ( UnquotedString | ArrayWord )? paramName atomOrReference ) | ( UnquotedString | ArrayWord )? paramName );
	public final Ldapi.paramDef_return paramDef() throws RecognitionException {
		Ldapi.paramDef_return retval = new Ldapi.paramDef_return();
		retval.start = input.LT(1);
		int paramDef_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree EQUALS106=null;
		CommonTree set107=null;
		CommonTree set110=null;
		TreeRuleReturnScope paramName108 =null;
		TreeRuleReturnScope atomOrReference109 =null;
		TreeRuleReturnScope paramName111 =null;

		CommonTree EQUALS106_tree=null;
		CommonTree set107_tree=null;
		CommonTree set110_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// ./Ldapi.g:724:5: ( ^( EQUALS ( UnquotedString | ArrayWord )? paramName atomOrReference ) | ( UnquotedString | ArrayWord )? paramName )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EQUALS) ) {
				alt34=1;
			}
			else if ( (LA34_0==AMPERSAND||LA34_0==ArrayWord||LA34_0==DOLLAR||LA34_0==UnquotedString) ) {
				alt34=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// ./Ldapi.g:724:7: ^( EQUALS ( UnquotedString | ArrayWord )? paramName atomOrReference )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
							Flags[7] = 1; /*defArgFunction_flag = 1;*/
						}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					EQUALS106=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_paramDef1099); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQUALS106_tree = (CommonTree)adaptor.dupNode(EQUALS106);


					root_1 = (CommonTree)adaptor.becomeRoot(EQUALS106_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// ./Ldapi.g:727:11: ( UnquotedString | ArrayWord )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==ArrayWord||LA32_0==UnquotedString) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// ./Ldapi.g:
							{
							_last = (CommonTree)input.LT(1);
							set107=(CommonTree)input.LT(1);
							if ( input.LA(1)==ArrayWord||input.LA(1)==UnquotedString ) {
								input.consume();
								if ( state.backtracking==0 ) {
								set107_tree = (CommonTree)adaptor.dupNode(set107);


								adaptor.addChild(root_1, set107_tree);
								}

								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}

							}
							break;

					}

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_paramName_in_paramDef1110);
					paramName108=paramName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, paramName108.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomOrReference_in_paramDef1112);
					atomOrReference109=atomOrReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, atomOrReference109.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0){
							ArgFunctionSymbol afs = (ArgFunctionSymbol)((currentMethod.getArgsFunction()).get((paramName108!=null?((Ldapi.paramName_return)paramName108).nomeArg:null)));
							afs.setType("equal");
							afs.setEqual(texto);
						    }
							Flags[7] = 0; /*defArgFunction_flag = 0;*/
						  	} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:740:7: ( UnquotedString | ArrayWord )? paramName
					{
					root_0 = (CommonTree)adaptor.nil();


					// ./Ldapi.g:740:7: ( UnquotedString | ArrayWord )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==ArrayWord||LA33_0==UnquotedString) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// ./Ldapi.g:
							{
							_last = (CommonTree)input.LT(1);
							set110=(CommonTree)input.LT(1);
							if ( input.LA(1)==ArrayWord||input.LA(1)==UnquotedString ) {
								input.consume();
								if ( state.backtracking==0 ) {
								set110_tree = (CommonTree)adaptor.dupNode(set110);


								adaptor.addChild(root_0, set110_tree);
								}

								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}

							}
							break;

					}

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_paramName_in_paramDef1134);
					paramName111=paramName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, paramName111.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, paramDef_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDef"


	public static class paramName_return extends TreeRuleReturnScope {
		public String nomeArg;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "paramName"
	// ./Ldapi.g:743:1: paramName returns [String nomeArg] : ( ^( DOLLAR UnquotedString ) | ^( AMPERSAND ^( DOLLAR UnquotedString ) ) );
	public final Ldapi.paramName_return paramName() throws RecognitionException {
		Ldapi.paramName_return retval = new Ldapi.paramName_return();
		retval.start = input.LT(1);
		int paramName_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DOLLAR112=null;
		CommonTree UnquotedString113=null;
		CommonTree AMPERSAND114=null;
		CommonTree DOLLAR115=null;
		CommonTree UnquotedString116=null;

		CommonTree DOLLAR112_tree=null;
		CommonTree UnquotedString113_tree=null;
		CommonTree AMPERSAND114_tree=null;
		CommonTree DOLLAR115_tree=null;
		CommonTree UnquotedString116_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// ./Ldapi.g:744:5: ( ^( DOLLAR UnquotedString ) | ^( AMPERSAND ^( DOLLAR UnquotedString ) ) )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==DOLLAR) ) {
				alt35=1;
			}
			else if ( (LA35_0==AMPERSAND) ) {
				alt35=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// ./Ldapi.g:744:7: ^( DOLLAR UnquotedString )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DOLLAR112=(CommonTree)match(input,DOLLAR,FOLLOW_DOLLAR_in_paramName1156); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOLLAR112_tree = (CommonTree)adaptor.dupNode(DOLLAR112);


					root_1 = (CommonTree)adaptor.becomeRoot(DOLLAR112_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					UnquotedString113=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName1158); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString113_tree = (CommonTree)adaptor.dupNode(UnquotedString113);


					adaptor.addChild(root_1, UnquotedString113_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0){
							retval.nomeArg = (UnquotedString113!=null?UnquotedString113.getText():null);
							ArgFunctionSymbol afs = new ArgFunctionSymbol((UnquotedString113!=null?UnquotedString113.getText():null), (UnquotedString113!=null?UnquotedString113.getLine():0), "var", null, posParmDefFunc);
							currentMethod.setArgFunction((UnquotedString113!=null?UnquotedString113.getText():null), afs);
							posParmDefFunc++;
						    }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:757:7: ^( AMPERSAND ^( DOLLAR UnquotedString ) )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					AMPERSAND114=(CommonTree)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_paramName1171); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AMPERSAND114_tree = (CommonTree)adaptor.dupNode(AMPERSAND114);


					root_1 = (CommonTree)adaptor.becomeRoot(AMPERSAND114_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					CommonTree root_2 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DOLLAR115=(CommonTree)match(input,DOLLAR,FOLLOW_DOLLAR_in_paramName1174); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOLLAR115_tree = (CommonTree)adaptor.dupNode(DOLLAR115);


					root_2 = (CommonTree)adaptor.becomeRoot(DOLLAR115_tree, root_2);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					UnquotedString116=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName1176); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString116_tree = (CommonTree)adaptor.dupNode(UnquotedString116);


					adaptor.addChild(root_2, UnquotedString116_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0){
							retval.nomeArg = (UnquotedString116!=null?UnquotedString116.getText():null);
							ArgFunctionSymbol afs = new ArgFunctionSymbol((UnquotedString116!=null?UnquotedString116.getText():null), (UnquotedString116!=null?UnquotedString116.getLine():0), "pointer", null, posParmDefFunc);
							currentMethod.setArgFunction((UnquotedString116!=null?UnquotedString116.getText():null), afs);
							posParmDefFunc++;
						    }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, paramName_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramName"


	public static class outputFunctions_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "outputFunctions"
	// ./Ldapi.g:772:1: outputFunctions : ( ^( ECHO ( expression )+ ) | ^( PRINT ( expression )+ ) | ^( PRINTF ( expression )+ ) | ^( DIE ( expression )+ ) );
	public final Ldapi.outputFunctions_return outputFunctions() throws RecognitionException {
		Ldapi.outputFunctions_return retval = new Ldapi.outputFunctions_return();
		retval.start = input.LT(1);
		int outputFunctions_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ECHO117=null;
		CommonTree PRINT119=null;
		CommonTree PRINTF121=null;
		CommonTree DIE123=null;
		TreeRuleReturnScope expression118 =null;
		TreeRuleReturnScope expression120 =null;
		TreeRuleReturnScope expression122 =null;
		TreeRuleReturnScope expression124 =null;

		CommonTree ECHO117_tree=null;
		CommonTree PRINT119_tree=null;
		CommonTree PRINTF121_tree=null;
		CommonTree DIE123_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// ./Ldapi.g:781:5: ( ^( ECHO ( expression )+ ) | ^( PRINT ( expression )+ ) | ^( PRINTF ( expression )+ ) | ^( DIE ( expression )+ ) )
			int alt40=4;
			switch ( input.LA(1) ) {
			case ECHO:
				{
				alt40=1;
				}
				break;
			case PRINT:
				{
				alt40=2;
				}
				break;
			case PRINTF:
				{
				alt40=3;
				}
				break;
			case DIE:
				{
				alt40=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// ./Ldapi.g:782:2: ^( ECHO ( expression )+ )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
						   try{
							CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
							currentScope.define(ms, ms, false);
							echo_print = currentScope.getMembers().lastIndexOf(ms);	
							currentScope = ms;
							} catch (Exception e){
								
							}
						}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ECHO117=(CommonTree)match(input,ECHO,FOLLOW_ECHO_in_outputFunctions1218); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ECHO117_tree = (CommonTree)adaptor.dupNode(ECHO117);


					root_1 = (CommonTree)adaptor.becomeRoot(ECHO117_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// ./Ldapi.g:792:14: ( expression )+
					int cnt36=0;
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==AMPERSAND||LA36_0==ASTERISK||(LA36_0 >= Apply && LA36_0 <= Array)||(LA36_0 >= AssignmentOperator && LA36_0 <= BANG)||LA36_0==Boolean||(LA36_0 >= CLASS_MEMBER && LA36_0 <= CLONE)||(LA36_0 >= Cast && LA36_0 <= ConcatAssigmentOperator)||LA36_0==DIE||(LA36_0 >= DOLLAR && LA36_0 <= DOT)||(LA36_0 >= DoubleQuotedString && LA36_0 <= ECHO)||(LA36_0 >= EQUALS && LA36_0 <= EqualityOperator)||LA36_0==FORWARD_SLASH||LA36_0==HereDoc||(LA36_0 >= INSTANCE_MEMBER && LA36_0 <= IfExpression)||(LA36_0 >= Integer && LA36_0 <= List)||LA36_0==MINUS||LA36_0==NEW||LA36_0==OPEN_SQUARE_BRACE||(LA36_0 >= PERCENT && LA36_0 <= PRINTF)||(LA36_0 >= Postfix && LA36_0 <= Prefix)||LA36_0==Real||LA36_0==SUPPRESS_WARNINGS||(LA36_0 >= ShiftOperator && LA36_0 <= SingleQuotedString)||LA36_0==TILDE||LA36_0==UnquotedString||(LA36_0 >= 114 && LA36_0 <= 117)||(LA36_0 >= 120 && LA36_0 <= 121)||LA36_0==123) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// ./Ldapi.g:792:14: expression
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expression_in_outputFunctions1220);
							expression118=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, expression118.getTree());

							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt36 >= 1 ) break loop36;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(36, input);
							throw eee;
						}
						cnt36++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:794:2: ^( PRINT ( expression )+ )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
						   try{
							CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
							currentScope.define(ms, ms, false);
							echo_print = currentScope.getMembers().lastIndexOf(ms);	
							currentScope = ms;
							} catch (Exception e){
								
							}
						}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PRINT119=(CommonTree)match(input,PRINT,FOLLOW_PRINT_in_outputFunctions1245); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PRINT119_tree = (CommonTree)adaptor.dupNode(PRINT119);


					root_1 = (CommonTree)adaptor.becomeRoot(PRINT119_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// ./Ldapi.g:804:15: ( expression )+
					int cnt37=0;
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==AMPERSAND||LA37_0==ASTERISK||(LA37_0 >= Apply && LA37_0 <= Array)||(LA37_0 >= AssignmentOperator && LA37_0 <= BANG)||LA37_0==Boolean||(LA37_0 >= CLASS_MEMBER && LA37_0 <= CLONE)||(LA37_0 >= Cast && LA37_0 <= ConcatAssigmentOperator)||LA37_0==DIE||(LA37_0 >= DOLLAR && LA37_0 <= DOT)||(LA37_0 >= DoubleQuotedString && LA37_0 <= ECHO)||(LA37_0 >= EQUALS && LA37_0 <= EqualityOperator)||LA37_0==FORWARD_SLASH||LA37_0==HereDoc||(LA37_0 >= INSTANCE_MEMBER && LA37_0 <= IfExpression)||(LA37_0 >= Integer && LA37_0 <= List)||LA37_0==MINUS||LA37_0==NEW||LA37_0==OPEN_SQUARE_BRACE||(LA37_0 >= PERCENT && LA37_0 <= PRINTF)||(LA37_0 >= Postfix && LA37_0 <= Prefix)||LA37_0==Real||LA37_0==SUPPRESS_WARNINGS||(LA37_0 >= ShiftOperator && LA37_0 <= SingleQuotedString)||LA37_0==TILDE||LA37_0==UnquotedString||(LA37_0 >= 114 && LA37_0 <= 117)||(LA37_0 >= 120 && LA37_0 <= 121)||LA37_0==123) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// ./Ldapi.g:804:15: expression
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expression_in_outputFunctions1247);
							expression120=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, expression120.getTree());

							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt37 >= 1 ) break loop37;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(37, input);
							throw eee;
						}
						cnt37++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// ./Ldapi.g:806:2: ^( PRINTF ( expression )+ )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
						   try{
							CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
							currentScope.define(ms, ms, false);
							echo_print = currentScope.getMembers().lastIndexOf(ms);	
							currentScope = ms;
							} catch (Exception e){
								
							}
						}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PRINTF121=(CommonTree)match(input,PRINTF,FOLLOW_PRINTF_in_outputFunctions1272); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PRINTF121_tree = (CommonTree)adaptor.dupNode(PRINTF121);


					root_1 = (CommonTree)adaptor.becomeRoot(PRINTF121_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// ./Ldapi.g:816:16: ( expression )+
					int cnt38=0;
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==AMPERSAND||LA38_0==ASTERISK||(LA38_0 >= Apply && LA38_0 <= Array)||(LA38_0 >= AssignmentOperator && LA38_0 <= BANG)||LA38_0==Boolean||(LA38_0 >= CLASS_MEMBER && LA38_0 <= CLONE)||(LA38_0 >= Cast && LA38_0 <= ConcatAssigmentOperator)||LA38_0==DIE||(LA38_0 >= DOLLAR && LA38_0 <= DOT)||(LA38_0 >= DoubleQuotedString && LA38_0 <= ECHO)||(LA38_0 >= EQUALS && LA38_0 <= EqualityOperator)||LA38_0==FORWARD_SLASH||LA38_0==HereDoc||(LA38_0 >= INSTANCE_MEMBER && LA38_0 <= IfExpression)||(LA38_0 >= Integer && LA38_0 <= List)||LA38_0==MINUS||LA38_0==NEW||LA38_0==OPEN_SQUARE_BRACE||(LA38_0 >= PERCENT && LA38_0 <= PRINTF)||(LA38_0 >= Postfix && LA38_0 <= Prefix)||LA38_0==Real||LA38_0==SUPPRESS_WARNINGS||(LA38_0 >= ShiftOperator && LA38_0 <= SingleQuotedString)||LA38_0==TILDE||LA38_0==UnquotedString||(LA38_0 >= 114 && LA38_0 <= 117)||(LA38_0 >= 120 && LA38_0 <= 121)||LA38_0==123) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// ./Ldapi.g:816:16: expression
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expression_in_outputFunctions1274);
							expression122=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, expression122.getTree());

							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt38 >= 1 ) break loop38;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(38, input);
							throw eee;
						}
						cnt38++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// ./Ldapi.g:818:2: ^( DIE ( expression )+ )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
						   try{
							CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
							currentScope.define(ms, ms, false);
							echo_print = currentScope.getMembers().lastIndexOf(ms);	
							currentScope = ms;
							} catch (Exception e){
								
							}
						}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DIE123=(CommonTree)match(input,DIE,FOLLOW_DIE_in_outputFunctions1299); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DIE123_tree = (CommonTree)adaptor.dupNode(DIE123);


					root_1 = (CommonTree)adaptor.becomeRoot(DIE123_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// ./Ldapi.g:828:13: ( expression )+
					int cnt39=0;
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==AMPERSAND||LA39_0==ASTERISK||(LA39_0 >= Apply && LA39_0 <= Array)||(LA39_0 >= AssignmentOperator && LA39_0 <= BANG)||LA39_0==Boolean||(LA39_0 >= CLASS_MEMBER && LA39_0 <= CLONE)||(LA39_0 >= Cast && LA39_0 <= ConcatAssigmentOperator)||LA39_0==DIE||(LA39_0 >= DOLLAR && LA39_0 <= DOT)||(LA39_0 >= DoubleQuotedString && LA39_0 <= ECHO)||(LA39_0 >= EQUALS && LA39_0 <= EqualityOperator)||LA39_0==FORWARD_SLASH||LA39_0==HereDoc||(LA39_0 >= INSTANCE_MEMBER && LA39_0 <= IfExpression)||(LA39_0 >= Integer && LA39_0 <= List)||LA39_0==MINUS||LA39_0==NEW||LA39_0==OPEN_SQUARE_BRACE||(LA39_0 >= PERCENT && LA39_0 <= PRINTF)||(LA39_0 >= Postfix && LA39_0 <= Prefix)||LA39_0==Real||LA39_0==SUPPRESS_WARNINGS||(LA39_0 >= ShiftOperator && LA39_0 <= SingleQuotedString)||LA39_0==TILDE||LA39_0==UnquotedString||(LA39_0 >= 114 && LA39_0 <= 117)||(LA39_0 >= 120 && LA39_0 <= 121)||LA39_0==123) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// ./Ldapi.g:828:13: expression
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expression_in_outputFunctions1301);
							expression124=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, expression124.getTree());

							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt39 >= 1 ) break loop39;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(39, input);
							throw eee;
						}
						cnt39++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

			if ( state.backtracking==0 ) {
				  try{	
					currentScope = currentScope.getEnclosingScope();	
			        	currentScope.getMembers().remove(echo_print);       	
			 		} catch (Exception e){
						
					}       	     	
				}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, outputFunctions_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "outputFunctions"


	public static class expression_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// ./Ldapi.g:831:1: expression : ( ^( 'or' expression expression ) | ^( 'OR' expression expression ) | ^( 'xor' expression expression ) | ^( 'XOR' expression expression ) | ^( 'and' expression expression ) | ^( 'AND' expression expression ) | ^( EQUALS expression simpleRequire ) | ^( EQUALS expression expression ) | ^( ConcatAssigmentOperator expression expression ) | ^( AssignmentOperator expression expression ) | ^( IfExpression expression expression expression ) | ^( LOGICAL_OR expression expression ) | ^( LOGICAL_AND expression expression ) | ^( PIPE expression expression ) | ^( AMPERSAND expression expression ) | ^( EqualityOperator expression expression ) | ^( ComparisionOperator expression expression ) | ^( ShiftOperator expression expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( DOT expression expression ) | ^( ASTERISK expression expression ) | ^( FORWARD_SLASH expression expression ) | ^( PERCENT expression expression ) | ^( BANG expression ) | ^( INSTANCE_OF expression expression ) | ^( TILDE expression ) | ^( MINUS expression ) | ^( SUPPRESS_WARNINGS expression ) | ^( Cast UnquotedString expression ) | ^( Prefix IncrementOperator name ) | ^( Postfix IncrementOperator name ) | ^( NEW nameOrFunctionCall ) | ^( CLONE name ) | atomOrReference | outputFunctions );
	public final Ldapi.expression_return expression() throws RecognitionException {
		Ldapi.expression_return retval = new Ldapi.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal125=null;
		CommonTree string_literal128=null;
		CommonTree string_literal131=null;
		CommonTree string_literal134=null;
		CommonTree string_literal137=null;
		CommonTree string_literal140=null;
		CommonTree EQUALS143=null;
		CommonTree EQUALS146=null;
		CommonTree ConcatAssigmentOperator149=null;
		CommonTree AssignmentOperator152=null;
		CommonTree IfExpression155=null;
		CommonTree LOGICAL_OR159=null;
		CommonTree LOGICAL_AND162=null;
		CommonTree PIPE165=null;
		CommonTree AMPERSAND168=null;
		CommonTree EqualityOperator171=null;
		CommonTree ComparisionOperator174=null;
		CommonTree ShiftOperator177=null;
		CommonTree PLUS180=null;
		CommonTree MINUS183=null;
		CommonTree DOT186=null;
		CommonTree ASTERISK189=null;
		CommonTree FORWARD_SLASH192=null;
		CommonTree PERCENT195=null;
		CommonTree BANG198=null;
		CommonTree INSTANCE_OF200=null;
		CommonTree TILDE203=null;
		CommonTree MINUS205=null;
		CommonTree SUPPRESS_WARNINGS207=null;
		CommonTree Cast209=null;
		CommonTree UnquotedString210=null;
		CommonTree Prefix212=null;
		CommonTree IncrementOperator213=null;
		CommonTree Postfix215=null;
		CommonTree IncrementOperator216=null;
		CommonTree NEW218=null;
		CommonTree CLONE220=null;
		TreeRuleReturnScope expression126 =null;
		TreeRuleReturnScope expression127 =null;
		TreeRuleReturnScope expression129 =null;
		TreeRuleReturnScope expression130 =null;
		TreeRuleReturnScope expression132 =null;
		TreeRuleReturnScope expression133 =null;
		TreeRuleReturnScope expression135 =null;
		TreeRuleReturnScope expression136 =null;
		TreeRuleReturnScope expression138 =null;
		TreeRuleReturnScope expression139 =null;
		TreeRuleReturnScope expression141 =null;
		TreeRuleReturnScope expression142 =null;
		TreeRuleReturnScope expression144 =null;
		TreeRuleReturnScope simpleRequire145 =null;
		TreeRuleReturnScope expression147 =null;
		TreeRuleReturnScope expression148 =null;
		TreeRuleReturnScope expression150 =null;
		TreeRuleReturnScope expression151 =null;
		TreeRuleReturnScope expression153 =null;
		TreeRuleReturnScope expression154 =null;
		TreeRuleReturnScope expression156 =null;
		TreeRuleReturnScope expression157 =null;
		TreeRuleReturnScope expression158 =null;
		TreeRuleReturnScope expression160 =null;
		TreeRuleReturnScope expression161 =null;
		TreeRuleReturnScope expression163 =null;
		TreeRuleReturnScope expression164 =null;
		TreeRuleReturnScope expression166 =null;
		TreeRuleReturnScope expression167 =null;
		TreeRuleReturnScope expression169 =null;
		TreeRuleReturnScope expression170 =null;
		TreeRuleReturnScope expression172 =null;
		TreeRuleReturnScope expression173 =null;
		TreeRuleReturnScope expression175 =null;
		TreeRuleReturnScope expression176 =null;
		TreeRuleReturnScope expression178 =null;
		TreeRuleReturnScope expression179 =null;
		TreeRuleReturnScope expression181 =null;
		TreeRuleReturnScope expression182 =null;
		TreeRuleReturnScope expression184 =null;
		TreeRuleReturnScope expression185 =null;
		TreeRuleReturnScope expression187 =null;
		TreeRuleReturnScope expression188 =null;
		TreeRuleReturnScope expression190 =null;
		TreeRuleReturnScope expression191 =null;
		TreeRuleReturnScope expression193 =null;
		TreeRuleReturnScope expression194 =null;
		TreeRuleReturnScope expression196 =null;
		TreeRuleReturnScope expression197 =null;
		TreeRuleReturnScope expression199 =null;
		TreeRuleReturnScope expression201 =null;
		TreeRuleReturnScope expression202 =null;
		TreeRuleReturnScope expression204 =null;
		TreeRuleReturnScope expression206 =null;
		TreeRuleReturnScope expression208 =null;
		TreeRuleReturnScope expression211 =null;
		TreeRuleReturnScope name214 =null;
		TreeRuleReturnScope name217 =null;
		TreeRuleReturnScope nameOrFunctionCall219 =null;
		TreeRuleReturnScope name221 =null;
		TreeRuleReturnScope atomOrReference222 =null;
		TreeRuleReturnScope outputFunctions223 =null;

		CommonTree string_literal125_tree=null;
		CommonTree string_literal128_tree=null;
		CommonTree string_literal131_tree=null;
		CommonTree string_literal134_tree=null;
		CommonTree string_literal137_tree=null;
		CommonTree string_literal140_tree=null;
		CommonTree EQUALS143_tree=null;
		CommonTree EQUALS146_tree=null;
		CommonTree ConcatAssigmentOperator149_tree=null;
		CommonTree AssignmentOperator152_tree=null;
		CommonTree IfExpression155_tree=null;
		CommonTree LOGICAL_OR159_tree=null;
		CommonTree LOGICAL_AND162_tree=null;
		CommonTree PIPE165_tree=null;
		CommonTree AMPERSAND168_tree=null;
		CommonTree EqualityOperator171_tree=null;
		CommonTree ComparisionOperator174_tree=null;
		CommonTree ShiftOperator177_tree=null;
		CommonTree PLUS180_tree=null;
		CommonTree MINUS183_tree=null;
		CommonTree DOT186_tree=null;
		CommonTree ASTERISK189_tree=null;
		CommonTree FORWARD_SLASH192_tree=null;
		CommonTree PERCENT195_tree=null;
		CommonTree BANG198_tree=null;
		CommonTree INSTANCE_OF200_tree=null;
		CommonTree TILDE203_tree=null;
		CommonTree MINUS205_tree=null;
		CommonTree SUPPRESS_WARNINGS207_tree=null;
		CommonTree Cast209_tree=null;
		CommonTree UnquotedString210_tree=null;
		CommonTree Prefix212_tree=null;
		CommonTree IncrementOperator213_tree=null;
		CommonTree Postfix215_tree=null;
		CommonTree IncrementOperator216_tree=null;
		CommonTree NEW218_tree=null;
		CommonTree CLONE220_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// ./Ldapi.g:832:5: ( ^( 'or' expression expression ) | ^( 'OR' expression expression ) | ^( 'xor' expression expression ) | ^( 'XOR' expression expression ) | ^( 'and' expression expression ) | ^( 'AND' expression expression ) | ^( EQUALS expression simpleRequire ) | ^( EQUALS expression expression ) | ^( ConcatAssigmentOperator expression expression ) | ^( AssignmentOperator expression expression ) | ^( IfExpression expression expression expression ) | ^( LOGICAL_OR expression expression ) | ^( LOGICAL_AND expression expression ) | ^( PIPE expression expression ) | ^( AMPERSAND expression expression ) | ^( EqualityOperator expression expression ) | ^( ComparisionOperator expression expression ) | ^( ShiftOperator expression expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( DOT expression expression ) | ^( ASTERISK expression expression ) | ^( FORWARD_SLASH expression expression ) | ^( PERCENT expression expression ) | ^( BANG expression ) | ^( INSTANCE_OF expression expression ) | ^( TILDE expression ) | ^( MINUS expression ) | ^( SUPPRESS_WARNINGS expression ) | ^( Cast UnquotedString expression ) | ^( Prefix IncrementOperator name ) | ^( Postfix IncrementOperator name ) | ^( NEW nameOrFunctionCall ) | ^( CLONE name ) | atomOrReference | outputFunctions )
			int alt41=36;
			alt41 = dfa41.predict(input);
			switch (alt41) {
				case 1 :
					// ./Ldapi.g:833:5: ^( 'or' expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal125=(CommonTree)match(input,121,FOLLOW_121_in_expression1332); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal125_tree = (CommonTree)adaptor.dupNode(string_literal125);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal125_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1334);
					expression126=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression126.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1336);
					expression127=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression127.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{   	
					    	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:847:7: ^( 'OR' expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal128=(CommonTree)match(input,115,FOLLOW_115_in_expression1355); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal128_tree = (CommonTree)adaptor.dupNode(string_literal128);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal128_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1357);
					expression129=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression129.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1359);
					expression130=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression130.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{   	
					    	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// ./Ldapi.g:861:7: ^( 'xor' expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal131=(CommonTree)match(input,123,FOLLOW_123_in_expression1378); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal131_tree = (CommonTree)adaptor.dupNode(string_literal131);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal131_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1380);
					expression132=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression132.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1382);
					expression133=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression133.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{   	
					    	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// ./Ldapi.g:875:7: ^( 'XOR' expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal134=(CommonTree)match(input,116,FOLLOW_116_in_expression1399); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal134_tree = (CommonTree)adaptor.dupNode(string_literal134);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal134_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1401);
					expression135=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression135.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1403);
					expression136=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression136.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{   	
					    	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 5 :
					// ./Ldapi.g:889:7: ^( 'and' expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal137=(CommonTree)match(input,117,FOLLOW_117_in_expression1423); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal137_tree = (CommonTree)adaptor.dupNode(string_literal137);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal137_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1425);
					expression138=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression138.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1427);
					expression139=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression139.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{   	
					    	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 6 :
					// ./Ldapi.g:903:7: ^( 'AND' expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal140=(CommonTree)match(input,114,FOLLOW_114_in_expression1444); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal140_tree = (CommonTree)adaptor.dupNode(string_literal140);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal140_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1446);
					expression141=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression141.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1448);
					expression142=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression142.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{   	
					    	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 7 :
					// ./Ldapi.g:917:7: ^( EQUALS expression simpleRequire )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					EQUALS143=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_expression1466); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQUALS143_tree = (CommonTree)adaptor.dupNode(EQUALS143);


					root_1 = (CommonTree)adaptor.becomeRoot(EQUALS143_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1468);
					expression144=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression144.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_simpleRequire_in_expression1470);
					simpleRequire145=simpleRequire();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, simpleRequire145.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0){
							if (Flags[6] == 0){ /*defFunction_flag = 0 para somente na definicao da funcao e nao na sua chamada*/
								// colocar os return tainteds como symbols do currentScope. Caso nao haja colocar symbol vazio
								Iterator <Symbol> it = currentScope.getMembers().iterator();
							   	Boolean encontrei = false;
							   	Symbol sym1;
							     for(; it.hasNext();){
									sym1 = it.next();
									if (sym1.getName().equals("return") && sym1.getTainted() == 1){
										currentScope.define(sym1, null, false);
										encontrei = true;
									}
								}
								if (encontrei == false){
									VariableSymbol vs = new VariableSymbol("", 0, -1, "");
									currentScope.define(vs, null, false);
								}	   	
							}   	
						    }
							} catch (Exception e){
								
							}    	
					    	}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 8 :
					// ./Ldapi.g:943:7: ^( EQUALS expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {Flags[0] = 1; /*assign_flag = 1;*/ }
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					EQUALS146=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_expression1493); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQUALS146_tree = (CommonTree)adaptor.dupNode(EQUALS146);


					root_1 = (CommonTree)adaptor.becomeRoot(EQUALS146_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1495);
					expression147=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression147.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1497);
					expression148=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression148.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							 try{       
						    if (Flags[15] == 0){
					     	if (Flags[20] == 1){ // createInstance_flag = 1
								Flags[20] = 0;
								currentScope.getScopeSymbol().setIsInstance(true);
								currentScope.getScopeSymbol().setIsClassInstruction(true);
							}
							if (Flags[22] == 1){ // createClone_flag = 1
								Flags[22] = 0;
								currentScope.getScopeSymbol().setIsClone(true);
								currentScope.getScopeSymbol().setIsClassInstruction(true);
							}
							if (Flags[25] == 1){ // instanceMember_flag = 1
								Flags[25] = 0;
								currentScope.getScopeSymbol().setIsClassInstruction(true);	
							}
							
							// instrucao attrib = var
							if (Flags[18] == 1 && Flags[6] == 1){
								SymbolTable t = currentClass.getAttributes();
								if (t.containsSymbol(currentScope.getScopeName()) == true)
									currentScope.getScopeSymbol().setIsClassInstruction(true);
							}
							
							Iterator <Symbol> it;
							Symbol sym1 = null, sym2 = null;
							Boolean isAliase = false;
							// Caso em que o lado direito da atribuicao é um obj
							if (currentScope.getMembers().size() > 0){
								//Symbol sym1, sym2;
								sym1 = (Symbol) currentScope.getMembers().get(0);
								if (sym1.getRootScope() == null){
									it = currentSymbolTable.getMembers().iterator();
									for(; it.hasNext();){
								   		sym2 = it.next();
							 			if (sym1.getName().equals(sym2.getName()) == true && sym2.getIsClassInstruction() == true){
							 				currentScope.getScopeSymbol().setIsClassInstruction(true);
							 				currentScope.getScopeSymbol().setIsClone(true);
							 				isAliase = true;
							 				break;
							 			}
								   	}
							   	}
						   	}
						    
							if (Flags[6] == 0 && ind_keyValuePair == 1){ /*defFunction_flag = 0 para somente na definicao da funcao e nao na sua chamada*/
																/*ind_keyValuePair indice dos keyValue Pair na definicao de arrays*/	
								if (Flags[11] == 1){
									connectionDB = currentScope.getScopeName();
									Flags[11] = 0; //call_connectionDB_flag = 0;
								}
								if (Flags[13] == 1){
									selectDB = currentScope.getScopeName();
									Flags[13] = 0; //call_selectDB_flag = 0;
								}
							}
					     		currentScope = currentScope.getEnclosingScope();    		
					     	
					     	if (ind_keyValuePair == 1 && currentScope.getMembers().size() > ind_scope){
					     		currentScope.getMembers().remove(ind_scope);
								ind_scope = -1;
								ind_keyValuePair = 0;
					     	}     	
					    		
						    } 
							} catch (Exception e){
								
							}  	    	    
					        }
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 9 :
					// ./Ldapi.g:1014:7: ^( ConcatAssigmentOperator expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {Flags[0] = 1; /*assign_flag = 1;*/}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ConcatAssigmentOperator149=(CommonTree)match(input,ConcatAssigmentOperator,FOLLOW_ConcatAssigmentOperator_in_expression1526); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ConcatAssigmentOperator149_tree = (CommonTree)adaptor.dupNode(ConcatAssigmentOperator149);


					root_1 = (CommonTree)adaptor.becomeRoot(ConcatAssigmentOperator149_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1528);
					expression150=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression150.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1530);
					expression151=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression151.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0){		
							if (Flags[6] == 0){ /*defFunction_flag = 0 para somente na chamada da funcao e nao na sua definicao*/
								Symbol sy = currentScope.getScopeSymbol();
								VariableSymbol vs = new VariableSymbol(sy.getName(), sy.getTainted(), sy.getCodeLine(), currentFile);
								currentScope.define(vs, null, true);
								
								CallSymbol ms_aux = new CallSymbol("concatenation", linha, currentScope, 0, currentFile);	
								for(int i=0; i<currentScope.getMembers().size(); i++){
									sy = (Symbol) currentScope.getMembers().get(i);		
									ms_aux.define(sy, null, true);
									currentScope.getMembers().remove(i);
									i--;
								}
								currentScope.define(ms_aux, ms_aux, false);
							}
						   	currentScope = currentScope.getEnclosingScope();   	
						    }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 10 :
					// ./Ldapi.g:1038:7: ^( AssignmentOperator expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					AssignmentOperator152=(CommonTree)match(input,AssignmentOperator,FOLLOW_AssignmentOperator_in_expression1544); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AssignmentOperator152_tree = (CommonTree)adaptor.dupNode(AssignmentOperator152);


					root_1 = (CommonTree)adaptor.becomeRoot(AssignmentOperator152_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1546);
					expression153=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression153.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1548);
					expression154=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression154.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {Flags[15] = 0;}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 11 :
					// ./Ldapi.g:1039:7: ^( IfExpression expression expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
							try{
					    	  Flags[14] = 1; /*if_presence_flag=1 */
					    	  indexIf++;
					    	  numElemIfBegin.add(currentScope.getMembers().size()); 
							} catch (Exception e){
								
							}   	  
					      }
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IfExpression155=(CommonTree)match(input,IfExpression,FOLLOW_IfExpression_in_expression1571); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IfExpression155_tree = (CommonTree)adaptor.dupNode(IfExpression155);


					root_1 = (CommonTree)adaptor.becomeRoot(IfExpression155_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1573);
					expression156=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression156.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1575);
					expression157=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression157.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1577);
					expression158=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression158.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							try{
					         Flags[14] = 0;
					         numElemIfBegin.remove(indexIf-1);
					         indexIf--;
							} catch (Exception e){
								
							}         
					      }
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 12 :
					// ./Ldapi.g:1058:7: ^( LOGICAL_OR expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LOGICAL_OR159=(CommonTree)match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expression1601); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LOGICAL_OR159_tree = (CommonTree)adaptor.dupNode(LOGICAL_OR159);


					root_1 = (CommonTree)adaptor.becomeRoot(LOGICAL_OR159_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1603);
					expression160=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression160.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1605);
					expression161=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression161.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{   	
					    	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 13 :
					// ./Ldapi.g:1072:7: ^( LOGICAL_AND expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LOGICAL_AND162=(CommonTree)match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expression1626); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LOGICAL_AND162_tree = (CommonTree)adaptor.dupNode(LOGICAL_AND162);


					root_1 = (CommonTree)adaptor.becomeRoot(LOGICAL_AND162_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1628);
					expression163=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression163.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1630);
					expression164=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression164.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{   	
					    	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 14 :
					// ./Ldapi.g:1086:7: ^( PIPE expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {Flags[15] = 0;}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PIPE165=(CommonTree)match(input,PIPE,FOLLOW_PIPE_in_expression1653); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PIPE165_tree = (CommonTree)adaptor.dupNode(PIPE165);


					root_1 = (CommonTree)adaptor.becomeRoot(PIPE165_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1655);
					expression166=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression166.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1657);
					expression167=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression167.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						  try{ 
					  	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
						   else{
							if (Flags[1] == 0){
								Scope aux = currentScope.getEnclosingScope();
								aux.getMembers().remove(currentScope);
								currentScope = aux;	
							}
						   }

							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 15 :
					// ./Ldapi.g:1108:7: ^( AMPERSAND expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {Flags[15] = 1;}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					AMPERSAND168=(CommonTree)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_expression1680); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AMPERSAND168_tree = (CommonTree)adaptor.dupNode(AMPERSAND168);


					root_1 = (CommonTree)adaptor.becomeRoot(AMPERSAND168_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1682);
					expression169=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression169.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1684);
					expression170=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression170.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{   	
					    	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 16 :
					// ./Ldapi.g:1122:7: ^( EqualityOperator expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					EqualityOperator171=(CommonTree)match(input,EqualityOperator,FOLLOW_EqualityOperator_in_expression1705); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EqualityOperator171_tree = (CommonTree)adaptor.dupNode(EqualityOperator171);


					root_1 = (CommonTree)adaptor.becomeRoot(EqualityOperator171_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1707);
					expression172=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression172.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1709);
					expression173=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression173.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{   	
					    	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 17 :
					// ./Ldapi.g:1136:7: ^( ComparisionOperator expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ComparisionOperator174=(CommonTree)match(input,ComparisionOperator,FOLLOW_ComparisionOperator_in_expression1729); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ComparisionOperator174_tree = (CommonTree)adaptor.dupNode(ComparisionOperator174);


					root_1 = (CommonTree)adaptor.becomeRoot(ComparisionOperator174_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1731);
					expression175=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression175.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1733);
					expression176=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression176.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{   	
					    	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 18 :
					// ./Ldapi.g:1150:7: ^( ShiftOperator expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {Flags[15] = 1;}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ShiftOperator177=(CommonTree)match(input,ShiftOperator,FOLLOW_ShiftOperator_in_expression1756); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ShiftOperator177_tree = (CommonTree)adaptor.dupNode(ShiftOperator177);


					root_1 = (CommonTree)adaptor.becomeRoot(ShiftOperator177_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1758);
					expression178=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression178.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1760);
					expression179=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression179.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {Flags[15] = 0;}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 19 :
					// ./Ldapi.g:1151:7: ^( PLUS expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PLUS180=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression1772); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS180_tree = (CommonTree)adaptor.dupNode(PLUS180);


					root_1 = (CommonTree)adaptor.becomeRoot(PLUS180_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1774);
					expression181=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression181.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1776);
					expression182=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression182.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 20 :
					// ./Ldapi.g:1152:7: ^( MINUS expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MINUS183=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression1786); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS183_tree = (CommonTree)adaptor.dupNode(MINUS183);


					root_1 = (CommonTree)adaptor.becomeRoot(MINUS183_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1788);
					expression184=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression184.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1790);
					expression185=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression185.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 21 :
					// ./Ldapi.g:1153:7: ^( DOT expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
							 try{
						    if (Flags[15] == 0){
								Flags[8] = 1; /*concatenation_flag = 1;*/
								// o id da linha somente e' inserido no fim da concatenation
								CallSymbol ms = new CallSymbol("concatenation", -1, currentScope, 0, currentFile);
								currentScope.define(ms, ms, false);
								currentScope = ms;
						    }
							} catch (Exception e){
								
							}
						}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DOT186=(CommonTree)match(input,DOT,FOLLOW_DOT_in_expression1804); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT186_tree = (CommonTree)adaptor.dupNode(DOT186);


					root_1 = (CommonTree)adaptor.becomeRoot(DOT186_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1806);
					expression187=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression187.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1808);
					expression188=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression188.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0){	    
							currentScope.getScopeSymbol().setCodeLine(linha); // atribuicao da linha ao symbol da concatenacao
							Symbol sym;
							if(Flags[4] == 1){
								Scope scp_aux = currentScope;
								String f = scp_aux.resolveVarInclude(scp_aux, currentSymbolTable);
								f = "\"" +f+ "\"";
							   	sym = scp_aux.getScopeSymbol();
							   	sym.setName(f);
								sym.setAlfanumeric(true);
							}
							currentScope = currentScope.getEnclosingScope();	
							Flags[8] = 0;
						    }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 22 :
					// ./Ldapi.g:1187:7: ^( ASTERISK expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ASTERISK189=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_expression1822); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASTERISK189_tree = (CommonTree)adaptor.dupNode(ASTERISK189);


					root_1 = (CommonTree)adaptor.becomeRoot(ASTERISK189_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1824);
					expression190=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression190.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1826);
					expression191=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression191.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 23 :
					// ./Ldapi.g:1188:7: ^( FORWARD_SLASH expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					FORWARD_SLASH192=(CommonTree)match(input,FORWARD_SLASH,FOLLOW_FORWARD_SLASH_in_expression1836); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FORWARD_SLASH192_tree = (CommonTree)adaptor.dupNode(FORWARD_SLASH192);


					root_1 = (CommonTree)adaptor.becomeRoot(FORWARD_SLASH192_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1838);
					expression193=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression193.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1840);
					expression194=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression194.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 24 :
					// ./Ldapi.g:1189:7: ^( PERCENT expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PERCENT195=(CommonTree)match(input,PERCENT,FOLLOW_PERCENT_in_expression1850); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PERCENT195_tree = (CommonTree)adaptor.dupNode(PERCENT195);


					root_1 = (CommonTree)adaptor.becomeRoot(PERCENT195_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1852);
					expression196=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression196.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1854);
					expression197=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression197.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 25 :
					// ./Ldapi.g:1190:7: ^( BANG expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					BANG198=(CommonTree)match(input,BANG,FOLLOW_BANG_in_expression1864); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BANG198_tree = (CommonTree)adaptor.dupNode(BANG198);


					root_1 = (CommonTree)adaptor.becomeRoot(BANG198_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1866);
					expression199=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression199.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{   	
					    	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 26 :
					// ./Ldapi.g:1204:7: ^( INSTANCE_OF expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					INSTANCE_OF200=(CommonTree)match(input,INSTANCE_OF,FOLLOW_INSTANCE_OF_in_expression1892); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INSTANCE_OF200_tree = (CommonTree)adaptor.dupNode(INSTANCE_OF200);


					root_1 = (CommonTree)adaptor.becomeRoot(INSTANCE_OF200_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1894);
					expression201=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression201.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1896);
					expression202=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression202.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 27 :
					// ./Ldapi.g:1205:7: ^( TILDE expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {Flags[15] = 1;}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					TILDE203=(CommonTree)match(input,TILDE,FOLLOW_TILDE_in_expression1908); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TILDE203_tree = (CommonTree)adaptor.dupNode(TILDE203);


					root_1 = (CommonTree)adaptor.becomeRoot(TILDE203_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1910);
					expression204=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression204.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{   	
					    	   if (indexIf != 0){
							   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
							   for (int j=0; j<i;j++){
							   	int k = currentScope.getMembers().size();
							   	currentScope.getMembers().remove(k-1);
							   }
						   }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 28 :
					// ./Ldapi.g:1219:7: ^( MINUS expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {Flags[15] = 1;}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MINUS205=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression1933); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS205_tree = (CommonTree)adaptor.dupNode(MINUS205);


					root_1 = (CommonTree)adaptor.becomeRoot(MINUS205_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1935);
					expression206=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression206.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {Flags[15] = 0;}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 29 :
					// ./Ldapi.g:1220:7: ^( SUPPRESS_WARNINGS expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					SUPPRESS_WARNINGS207=(CommonTree)match(input,SUPPRESS_WARNINGS,FOLLOW_SUPPRESS_WARNINGS_in_expression1947); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SUPPRESS_WARNINGS207_tree = (CommonTree)adaptor.dupNode(SUPPRESS_WARNINGS207);


					root_1 = (CommonTree)adaptor.becomeRoot(SUPPRESS_WARNINGS207_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1949);
					expression208=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression208.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 30 :
					// ./Ldapi.g:1221:7: ^( Cast UnquotedString expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					Cast209=(CommonTree)match(input,Cast,FOLLOW_Cast_in_expression1959); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Cast209_tree = (CommonTree)adaptor.dupNode(Cast209);


					root_1 = (CommonTree)adaptor.becomeRoot(Cast209_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					UnquotedString210=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_expression1961); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString210_tree = (CommonTree)adaptor.dupNode(UnquotedString210);


					adaptor.addChild(root_1, UnquotedString210_tree);
					}

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression1963);
					expression211=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression211.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 31 :
					// ./Ldapi.g:1222:7: ^( Prefix IncrementOperator name )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {Flags[15] = 1;}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					Prefix212=(CommonTree)match(input,Prefix,FOLLOW_Prefix_in_expression1979); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Prefix212_tree = (CommonTree)adaptor.dupNode(Prefix212);


					root_1 = (CommonTree)adaptor.becomeRoot(Prefix212_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					IncrementOperator213=(CommonTree)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_expression1981); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IncrementOperator213_tree = (CommonTree)adaptor.dupNode(IncrementOperator213);


					adaptor.addChild(root_1, IncrementOperator213_tree);
					}

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_name_in_expression1983);
					name214=name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, name214.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {Flags[15] = 0;}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 32 :
					// ./Ldapi.g:1223:7: ^( Postfix IncrementOperator name )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {Flags[15] = 1;}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					Postfix215=(CommonTree)match(input,Postfix,FOLLOW_Postfix_in_expression1997); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Postfix215_tree = (CommonTree)adaptor.dupNode(Postfix215);


					root_1 = (CommonTree)adaptor.becomeRoot(Postfix215_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					IncrementOperator216=(CommonTree)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_expression1999); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IncrementOperator216_tree = (CommonTree)adaptor.dupNode(IncrementOperator216);


					adaptor.addChild(root_1, IncrementOperator216_tree);
					}

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_name_in_expression2001);
					name217=name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, name217.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {Flags[15] = 0;}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 33 :
					// ./Ldapi.g:1224:7: ^( NEW nameOrFunctionCall )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {Flags[20] = 1; /* createObject_class = 1 */}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					NEW218=(CommonTree)match(input,NEW,FOLLOW_NEW_in_expression2018); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NEW218_tree = (CommonTree)adaptor.dupNode(NEW218);


					root_1 = (CommonTree)adaptor.becomeRoot(NEW218_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_nameOrFunctionCall_in_expression2020);
					nameOrFunctionCall219=nameOrFunctionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, nameOrFunctionCall219.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							
							if (Flags[21] == 2){ //call_MethodClass_flag = 2, se construtor encontrado	
								Flags[21] = 0; //call_UserFunction_flag = 0;
							}
							Flags[20] = 1;
					      }
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 34 :
					// ./Ldapi.g:1232:7: ^( CLONE name )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {Flags[22] = 1; /* createClone_flag = 1 */}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					CLONE220=(CommonTree)match(input,CLONE,FOLLOW_CLONE_in_expression2040); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CLONE220_tree = (CommonTree)adaptor.dupNode(CLONE220);


					root_1 = (CommonTree)adaptor.becomeRoot(CLONE220_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_name_in_expression2042);
					name221=name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, name221.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							  try{
					    	  	if (Flags[18] == 0 && Flags[6] == 0){ //defMethodClass_flag = 1
					    	  		Symbol sy_ali = currentScope.getScopeSymbol();
					    	  		Symbol sy_obj = (Symbol) currentScope.getMembers().get(0);
					    	  		currentSymbolTable.getAliases().put(sy_ali.getName(), sy_obj); 
					    	  	}
							} catch (Exception e){
								
							}
					    	  }
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 35 :
					// ./Ldapi.g:1245:7: atomOrReference
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomOrReference_in_expression2060);
					atomOrReference222=atomOrReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, atomOrReference222.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 36 :
					// ./Ldapi.g:1246:7: outputFunctions
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_outputFunctions_in_expression2068);
					outputFunctions223=outputFunctions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, outputFunctions223.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class atomOrReference_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atomOrReference"
	// ./Ldapi.g:1250:1: atomOrReference : ( atom | reference );
	public final Ldapi.atomOrReference_return atomOrReference() throws RecognitionException {
		Ldapi.atomOrReference_return retval = new Ldapi.atomOrReference_return();
		retval.start = input.LT(1);
		int atomOrReference_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope atom224 =null;
		TreeRuleReturnScope reference225 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// ./Ldapi.g:1251:5: ( atom | reference )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==Array||LA42_0==Boolean||LA42_0==DoubleQuotedString||LA42_0==HereDoc||LA42_0==Integer||LA42_0==List||LA42_0==Real||LA42_0==SingleQuotedString||LA42_0==120) ) {
				alt42=1;
			}
			else if ( (LA42_0==AMPERSAND||LA42_0==Apply||LA42_0==CLASS_MEMBER||LA42_0==DOLLAR||LA42_0==INSTANCE_MEMBER||LA42_0==OPEN_SQUARE_BRACE||LA42_0==UnquotedString) ) {
				alt42=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// ./Ldapi.g:1251:7: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atom_in_atomOrReference2086);
					atom224=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, atom224.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:1252:7: reference
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_reference_in_atomOrReference2094);
					reference225=reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, reference225.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, atomOrReference_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atomOrReference"


	public static class arrayDeclaration_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arrayDeclaration"
	// ./Ldapi.g:1255:1: arrayDeclaration : ^( Array ( arrayEntry )* ) ;
	public final Ldapi.arrayDeclaration_return arrayDeclaration() throws RecognitionException {
		Ldapi.arrayDeclaration_return retval = new Ldapi.arrayDeclaration_return();
		retval.start = input.LT(1);
		int arrayDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree Array226=null;
		TreeRuleReturnScope arrayEntry227 =null;

		CommonTree Array226_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// ./Ldapi.g:1256:5: ( ^( Array ( arrayEntry )* ) )
			// ./Ldapi.g:1256:7: ^( Array ( arrayEntry )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			if ( state.backtracking==0 ) {
				    try{
						Flags[29] = 1;    		
						ind_keyValuePair = 0;
			    		Scope aux = currentScope.getEnclosingScope();  		
			    		ind_scope = aux.getMembers().size()-1;
					} catch (Exception e){
						
					}
			    	}
			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			Array226=(CommonTree)match(input,Array,FOLLOW_Array_in_arrayDeclaration2118); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Array226_tree = (CommonTree)adaptor.dupNode(Array226);


			root_1 = (CommonTree)adaptor.becomeRoot(Array226_tree, root_1);
			}

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// ./Ldapi.g:1266:13: ( arrayEntry )*
				loop43:
				while (true) {
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( ((LA43_0 >= AMPERSAND && LA43_0 <= ASTERISK)||(LA43_0 >= Apply && LA43_0 <= Array)||(LA43_0 >= AssignmentOperator && LA43_0 <= BANG)||LA43_0==Boolean||(LA43_0 >= CLASS_MEMBER && LA43_0 <= CLONE)||(LA43_0 >= Cast && LA43_0 <= ConcatAssigmentOperator)||LA43_0==DIE||(LA43_0 >= DOLLAR && LA43_0 <= DOT)||(LA43_0 >= DoubleQuotedString && LA43_0 <= ECHO)||(LA43_0 >= EQUALS && LA43_0 <= EqualityOperator)||LA43_0==FORWARD_SLASH||LA43_0==HereDoc||(LA43_0 >= INSTANCE_MEMBER && LA43_0 <= IfExpression)||(LA43_0 >= Integer && LA43_0 <= List)||LA43_0==MINUS||LA43_0==NEW||LA43_0==OPEN_SQUARE_BRACE||(LA43_0 >= PERCENT && LA43_0 <= PRINTF)||(LA43_0 >= Postfix && LA43_0 <= Prefix)||LA43_0==Real||LA43_0==SUPPRESS_WARNINGS||(LA43_0 >= ShiftOperator && LA43_0 <= SingleQuotedString)||LA43_0==TILDE||LA43_0==UnquotedString||(LA43_0 >= 114 && LA43_0 <= 117)||(LA43_0 >= 120 && LA43_0 <= 121)||LA43_0==123) ) {
						alt43=1;
					}

					switch (alt43) {
					case 1 :
						// ./Ldapi.g:1266:13: arrayEntry
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration2120);
						arrayEntry227=arrayEntry();
						state._fsp--;
						if (state.failed) return retval;
						if ( state.backtracking==0 ) 
						adaptor.addChild(root_1, arrayEntry227.getTree());

						if ( state.backtracking==0 ) {
						}

						}
						break;

					default :
						break loop43;
					}
				}

				match(input, Token.UP, null); if (state.failed) return retval;
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
					try{
			       	if (currentScope.getScopeSymbol().getIsFunction() == false){    	
			      		if (ind_scope > 0)
			       			ind_keyValuePair = 1;
			       	}
			       	Flags[29] = 0;
					} catch (Exception e){
						
					}
			       }
			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, arrayDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayDeclaration"


	public static class arrayEntry_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arrayEntry"
	// ./Ldapi.g:1280:1: arrayEntry : ( keyValuePair | expression );
	public final Ldapi.arrayEntry_return arrayEntry() throws RecognitionException {
		Ldapi.arrayEntry_return retval = new Ldapi.arrayEntry_return();
		retval.start = input.LT(1);
		int arrayEntry_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope keyValuePair228 =null;
		TreeRuleReturnScope expression229 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// ./Ldapi.g:1281:5: ( keyValuePair | expression )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==ARRAY_ASSIGN) ) {
				alt44=1;
			}
			else if ( (LA44_0==AMPERSAND||LA44_0==ASTERISK||(LA44_0 >= Apply && LA44_0 <= Array)||(LA44_0 >= AssignmentOperator && LA44_0 <= BANG)||LA44_0==Boolean||(LA44_0 >= CLASS_MEMBER && LA44_0 <= CLONE)||(LA44_0 >= Cast && LA44_0 <= ConcatAssigmentOperator)||LA44_0==DIE||(LA44_0 >= DOLLAR && LA44_0 <= DOT)||(LA44_0 >= DoubleQuotedString && LA44_0 <= ECHO)||(LA44_0 >= EQUALS && LA44_0 <= EqualityOperator)||LA44_0==FORWARD_SLASH||LA44_0==HereDoc||(LA44_0 >= INSTANCE_MEMBER && LA44_0 <= IfExpression)||(LA44_0 >= Integer && LA44_0 <= List)||LA44_0==MINUS||LA44_0==NEW||LA44_0==OPEN_SQUARE_BRACE||(LA44_0 >= PERCENT && LA44_0 <= PRINTF)||(LA44_0 >= Postfix && LA44_0 <= Prefix)||LA44_0==Real||LA44_0==SUPPRESS_WARNINGS||(LA44_0 >= ShiftOperator && LA44_0 <= SingleQuotedString)||LA44_0==TILDE||LA44_0==UnquotedString||(LA44_0 >= 114 && LA44_0 <= 117)||(LA44_0 >= 120 && LA44_0 <= 121)||LA44_0==123) ) {
				alt44=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// ./Ldapi.g:1281:7: keyValuePair
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_keyValuePair_in_arrayEntry2148);
					keyValuePair228=keyValuePair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, keyValuePair228.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:1282:7: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_arrayEntry2156);
					expression229=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, expression229.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, arrayEntry_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayEntry"


	public static class keyValuePair_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "keyValuePair"
	// ./Ldapi.g:1285:1: keyValuePair : ^( ARRAY_ASSIGN ( expression )+ ) ;
	public final Ldapi.keyValuePair_return keyValuePair() throws RecognitionException {
		Ldapi.keyValuePair_return retval = new Ldapi.keyValuePair_return();
		retval.start = input.LT(1);
		int keyValuePair_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ARRAY_ASSIGN230=null;
		TreeRuleReturnScope expression231 =null;

		CommonTree ARRAY_ASSIGN230_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// ./Ldapi.g:1286:5: ( ^( ARRAY_ASSIGN ( expression )+ ) )
			// ./Ldapi.g:1286:7: ^( ARRAY_ASSIGN ( expression )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			ARRAY_ASSIGN230=(CommonTree)match(input,ARRAY_ASSIGN,FOLLOW_ARRAY_ASSIGN_in_keyValuePair2175); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ARRAY_ASSIGN230_tree = (CommonTree)adaptor.dupNode(ARRAY_ASSIGN230);


			root_1 = (CommonTree)adaptor.becomeRoot(ARRAY_ASSIGN230_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// ./Ldapi.g:1286:22: ( expression )+
			int cnt45=0;
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==AMPERSAND||LA45_0==ASTERISK||(LA45_0 >= Apply && LA45_0 <= Array)||(LA45_0 >= AssignmentOperator && LA45_0 <= BANG)||LA45_0==Boolean||(LA45_0 >= CLASS_MEMBER && LA45_0 <= CLONE)||(LA45_0 >= Cast && LA45_0 <= ConcatAssigmentOperator)||LA45_0==DIE||(LA45_0 >= DOLLAR && LA45_0 <= DOT)||(LA45_0 >= DoubleQuotedString && LA45_0 <= ECHO)||(LA45_0 >= EQUALS && LA45_0 <= EqualityOperator)||LA45_0==FORWARD_SLASH||LA45_0==HereDoc||(LA45_0 >= INSTANCE_MEMBER && LA45_0 <= IfExpression)||(LA45_0 >= Integer && LA45_0 <= List)||LA45_0==MINUS||LA45_0==NEW||LA45_0==OPEN_SQUARE_BRACE||(LA45_0 >= PERCENT && LA45_0 <= PRINTF)||(LA45_0 >= Postfix && LA45_0 <= Prefix)||LA45_0==Real||LA45_0==SUPPRESS_WARNINGS||(LA45_0 >= ShiftOperator && LA45_0 <= SingleQuotedString)||LA45_0==TILDE||LA45_0==UnquotedString||(LA45_0 >= 114 && LA45_0 <= 117)||(LA45_0 >= 120 && LA45_0 <= 121)||LA45_0==123) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// ./Ldapi.g:1286:22: expression
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_keyValuePair2177);
					expression231=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression231.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					if ( cnt45 >= 1 ) break loop45;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(45, input);
					throw eee;
				}
				cnt45++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
					  try{ 
			    	 if(currentScope.getScopeSymbol().getIsFunction() == false){
					Scope aux = currentScope.getEnclosingScope();	
					Symbol sym0 = (Symbol) currentScope.getMembers().get(ind_keyValuePair);
					if(ind_keyValuePair > 0){
					Symbol sym00 = (Symbol) currentScope.getMembers().get(ind_keyValuePair-1);
			}
					Symbol sym1=null;	
					if (currentScope.getMembers().size() > ind_keyValuePair){
						sym1 = (Symbol) currentScope.getMembers().get(ind_keyValuePair+1);
						ind_keyValuePair ++;
					}
					ind_keyValuePair ++;
							
					String aa = sym0.getName();
					if (aa.startsWith("\"") || aa.startsWith("\'"))
						aa = aa.substring(1,aa.length()-1);	
					
					String scpName = currentScope.getScopeName();
					String s = "$" + scpName + "[\'" + aa +"\']";
					CallSymbol ms = new CallSymbol(s, sym0.getCodeLine(), aux, 0, currentFile);
					if (sym1.getTainted() == 1)
			          	ms.getScopeSymbol().setTainted(1);
			          ms.define(sym1, null, true);
					aux.define(ms, ms, false);
					}
					} catch (Exception e){
						
					}
			    	 }
			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, keyValuePair_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "keyValuePair"


	public static class listDefinition_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "listDefinition"
	// ./Ldapi.g:1320:1: listDefinition : ^( List ( atomOrReference )* ( ^( EQUALS listEntry ) )? ) ;
	public final Ldapi.listDefinition_return listDefinition() throws RecognitionException {
		Ldapi.listDefinition_return retval = new Ldapi.listDefinition_return();
		retval.start = input.LT(1);
		int listDefinition_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree List232=null;
		CommonTree EQUALS234=null;
		TreeRuleReturnScope atomOrReference233 =null;
		TreeRuleReturnScope listEntry235 =null;

		CommonTree List232_tree=null;
		CommonTree EQUALS234_tree=null;


				Scope scp_main = currentScope;
				Flags[16] = 1; /*list_flag = 1;*/
			
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// ./Ldapi.g:1325:5: ( ^( List ( atomOrReference )* ( ^( EQUALS listEntry ) )? ) )
			// ./Ldapi.g:1325:7: ^( List ( atomOrReference )* ( ^( EQUALS listEntry ) )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			List232=(CommonTree)match(input,List,FOLLOW_List_in_listDefinition2210); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			List232_tree = (CommonTree)adaptor.dupNode(List232);


			root_1 = (CommonTree)adaptor.becomeRoot(List232_tree, root_1);
			}

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// ./Ldapi.g:1325:14: ( atomOrReference )*
				loop46:
				while (true) {
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==AMPERSAND||(LA46_0 >= Apply && LA46_0 <= Array)||LA46_0==Boolean||LA46_0==CLASS_MEMBER||LA46_0==DOLLAR||LA46_0==DoubleQuotedString||LA46_0==HereDoc||LA46_0==INSTANCE_MEMBER||LA46_0==Integer||LA46_0==List||LA46_0==OPEN_SQUARE_BRACE||LA46_0==Real||LA46_0==SingleQuotedString||LA46_0==UnquotedString||LA46_0==120) ) {
						alt46=1;
					}

					switch (alt46) {
					case 1 :
						// ./Ldapi.g:1325:14: atomOrReference
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_atomOrReference_in_listDefinition2212);
						atomOrReference233=atomOrReference();
						state._fsp--;
						if (state.failed) return retval;
						if ( state.backtracking==0 ) 
						adaptor.addChild(root_1, atomOrReference233.getTree());

						if ( state.backtracking==0 ) {
						}

						}
						break;

					default :
						break loop46;
					}
				}

				// ./Ldapi.g:1325:31: ( ^( EQUALS listEntry ) )?
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==EQUALS) ) {
					alt47=1;
				}
				switch (alt47) {
					case 1 :
						// ./Ldapi.g:1325:32: ^( EQUALS listEntry )
						{
						_last = (CommonTree)input.LT(1);
						{
						CommonTree _save_last_2 = _last;
						CommonTree _first_2 = null;
						CommonTree root_2 = (CommonTree)adaptor.nil();
						_last = (CommonTree)input.LT(1);
						EQUALS234=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_listDefinition2217); if (state.failed) return retval;
						if ( state.backtracking==0 ) {
						EQUALS234_tree = (CommonTree)adaptor.dupNode(EQUALS234);


						root_2 = (CommonTree)adaptor.becomeRoot(EQUALS234_tree, root_2);
						}

						match(input, Token.DOWN, null); if (state.failed) return retval;
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_listEntry_in_listDefinition2219);
						listEntry235=listEntry();
						state._fsp--;
						if (state.failed) return retval;
						if ( state.backtracking==0 ) 
						adaptor.addChild(root_2, listEntry235.getTree());

						match(input, Token.UP, null); if (state.failed) return retval;
						adaptor.addChild(root_1, root_2);
						_last = _save_last_2;
						}


						if ( state.backtracking==0 ) {
						}

						}
						break;

				}

				match(input, Token.UP, null); if (state.failed) return retval;
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
					  try{    	
			    	   if (Flags[15] == 0){
			    		while(currentScope.getScopeName().equals("AssignList") == false)
			    			currentScope = currentScope.getEnclosingScope();

			    		Scope scp_list = currentScope.getEnclosingScope();    		
			    		int num_varList = scp_list.getMembers().size();
					if (num_varList - 1 == currentScope.getMembers().size()){
						Boolean b = currentScope.verifyNumberVarList(num_varList);				                  
						if(b == true)
						   scp_list.populateList(scp_main, currentScope, num_varList, mts, mus, currentFile);
					}
					else{
						try{					
							Symbol sym1 = (Symbol) currentScope.getMembers().get(0);
							if(currentScope.getMembers().size() == 1 && sym1.getIsVariableSymbol() == true){
								Scope ss = null;
								for(int i = scp_main.getMembers().size(); i > 0; i--){
									ss = (Scope) scp_main.getMembers().get(i-1);
									if (ss.getScopeName().equals(sym1.getName()) == true)
										break;
								}
								if (ss != null)
									scp_list.populateList(scp_main, ss, num_varList, mts, mus, currentFile);
							}
						} catch (Exception e) {}
					}
					
					currentScope = scp_main;		
					Flags[16] = 0;
			    	   }
					} catch (Exception e){
						
					}
			    	}
			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, listDefinition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "listDefinition"


	public static class listEntry_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "listEntry"
	// ./Ldapi.g:1364:1: listEntry : ( expression | ^( ListAssign ( expression )* ) );
	public final Ldapi.listEntry_return listEntry() throws RecognitionException {
		Ldapi.listEntry_return retval = new Ldapi.listEntry_return();
		retval.start = input.LT(1);
		int listEntry_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ListAssign237=null;
		TreeRuleReturnScope expression236 =null;
		TreeRuleReturnScope expression238 =null;

		CommonTree ListAssign237_tree=null;


				CallSymbol ms_aux = new CallSymbol("AssignList", linha, currentScope, 0, currentFile);
				currentScope.define(ms_aux, ms_aux, false);
				currentScope = ms_aux;
			
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// ./Ldapi.g:1370:5: ( expression | ^( ListAssign ( expression )* ) )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==AMPERSAND||LA49_0==ASTERISK||(LA49_0 >= Apply && LA49_0 <= Array)||(LA49_0 >= AssignmentOperator && LA49_0 <= BANG)||LA49_0==Boolean||(LA49_0 >= CLASS_MEMBER && LA49_0 <= CLONE)||(LA49_0 >= Cast && LA49_0 <= ConcatAssigmentOperator)||LA49_0==DIE||(LA49_0 >= DOLLAR && LA49_0 <= DOT)||(LA49_0 >= DoubleQuotedString && LA49_0 <= ECHO)||(LA49_0 >= EQUALS && LA49_0 <= EqualityOperator)||LA49_0==FORWARD_SLASH||LA49_0==HereDoc||(LA49_0 >= INSTANCE_MEMBER && LA49_0 <= IfExpression)||(LA49_0 >= Integer && LA49_0 <= List)||LA49_0==MINUS||LA49_0==NEW||LA49_0==OPEN_SQUARE_BRACE||(LA49_0 >= PERCENT && LA49_0 <= PRINTF)||(LA49_0 >= Postfix && LA49_0 <= Prefix)||LA49_0==Real||LA49_0==SUPPRESS_WARNINGS||(LA49_0 >= ShiftOperator && LA49_0 <= SingleQuotedString)||LA49_0==TILDE||LA49_0==UnquotedString||(LA49_0 >= 114 && LA49_0 <= 117)||(LA49_0 >= 120 && LA49_0 <= 121)||LA49_0==123) ) {
				alt49=1;
			}
			else if ( (LA49_0==ListAssign) ) {
				alt49=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// ./Ldapi.g:1370:7: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_listEntry2256);
					expression236=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, expression236.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:1371:7: ^( ListAssign ( expression )* )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ListAssign237=(CommonTree)match(input,ListAssign,FOLLOW_ListAssign_in_listEntry2265); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ListAssign237_tree = (CommonTree)adaptor.dupNode(ListAssign237);


					root_1 = (CommonTree)adaptor.becomeRoot(ListAssign237_tree, root_1);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// ./Ldapi.g:1371:20: ( expression )*
						loop48:
						while (true) {
							int alt48=2;
							int LA48_0 = input.LA(1);
							if ( (LA48_0==AMPERSAND||LA48_0==ASTERISK||(LA48_0 >= Apply && LA48_0 <= Array)||(LA48_0 >= AssignmentOperator && LA48_0 <= BANG)||LA48_0==Boolean||(LA48_0 >= CLASS_MEMBER && LA48_0 <= CLONE)||(LA48_0 >= Cast && LA48_0 <= ConcatAssigmentOperator)||LA48_0==DIE||(LA48_0 >= DOLLAR && LA48_0 <= DOT)||(LA48_0 >= DoubleQuotedString && LA48_0 <= ECHO)||(LA48_0 >= EQUALS && LA48_0 <= EqualityOperator)||LA48_0==FORWARD_SLASH||LA48_0==HereDoc||(LA48_0 >= INSTANCE_MEMBER && LA48_0 <= IfExpression)||(LA48_0 >= Integer && LA48_0 <= List)||LA48_0==MINUS||LA48_0==NEW||LA48_0==OPEN_SQUARE_BRACE||(LA48_0 >= PERCENT && LA48_0 <= PRINTF)||(LA48_0 >= Postfix && LA48_0 <= Prefix)||LA48_0==Real||LA48_0==SUPPRESS_WARNINGS||(LA48_0 >= ShiftOperator && LA48_0 <= SingleQuotedString)||LA48_0==TILDE||LA48_0==UnquotedString||(LA48_0 >= 114 && LA48_0 <= 117)||(LA48_0 >= 120 && LA48_0 <= 121)||LA48_0==123) ) {
								alt48=1;
							}

							switch (alt48) {
							case 1 :
								// ./Ldapi.g:1371:20: expression
								{
								_last = (CommonTree)input.LT(1);
								pushFollow(FOLLOW_expression_in_listEntry2267);
								expression238=expression();
								state._fsp--;
								if (state.failed) return retval;
								if ( state.backtracking==0 ) 
								adaptor.addChild(root_1, expression238.getTree());

								if ( state.backtracking==0 ) {
								}

								}
								break;

							default :
								break loop48;
							}
						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, listEntry_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "listEntry"


	public static class atom_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// ./Ldapi.g:1374:1: atom : ( SingleQuotedString | DoubleQuotedString | Integer | Real | Boolean | 'null' | HereDoc | arrayDeclaration | listDefinition );
	public final Ldapi.atom_return atom() throws RecognitionException {
		Ldapi.atom_return retval = new Ldapi.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree SingleQuotedString239=null;
		CommonTree DoubleQuotedString240=null;
		CommonTree Integer241=null;
		CommonTree Real242=null;
		CommonTree Boolean243=null;
		CommonTree string_literal244=null;
		CommonTree HereDoc245=null;
		TreeRuleReturnScope arrayDeclaration246 =null;
		TreeRuleReturnScope listDefinition247 =null;

		CommonTree SingleQuotedString239_tree=null;
		CommonTree DoubleQuotedString240_tree=null;
		CommonTree Integer241_tree=null;
		CommonTree Real242_tree=null;
		CommonTree Boolean243_tree=null;
		CommonTree string_literal244_tree=null;
		CommonTree HereDoc245_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// ./Ldapi.g:1375:5: ( SingleQuotedString | DoubleQuotedString | Integer | Real | Boolean | 'null' | HereDoc | arrayDeclaration | listDefinition )
			int alt50=9;
			switch ( input.LA(1) ) {
			case SingleQuotedString:
				{
				alt50=1;
				}
				break;
			case DoubleQuotedString:
				{
				alt50=2;
				}
				break;
			case Integer:
				{
				alt50=3;
				}
				break;
			case Real:
				{
				alt50=4;
				}
				break;
			case Boolean:
				{
				alt50=5;
				}
				break;
			case 120:
				{
				alt50=6;
				}
				break;
			case HereDoc:
				{
				alt50=7;
				}
				break;
			case Array:
				{
				alt50=8;
				}
				break;
			case List:
				{
				alt50=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}
			switch (alt50) {
				case 1 :
					// ./Ldapi.g:1375:7: SingleQuotedString
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					SingleQuotedString239=(CommonTree)match(input,SingleQuotedString,FOLLOW_SingleQuotedString_in_atom2286); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SingleQuotedString239_tree = (CommonTree)adaptor.dupNode(SingleQuotedString239);


					adaptor.addChild(root_0, SingleQuotedString239_tree);
					}

					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0 && Flags[17] == 0){
							texto = (SingleQuotedString239!=null?SingleQuotedString239.getText():null);
							linha = (SingleQuotedString239!=null?SingleQuotedString239.getLine():0);

							if (Flags[7] == 0 ){ /*defArgFunction_flag;*/
								int t = 0;
								if (Flags[19] == 0){ /*defAttributeClass_flag;*/
								  	for (String aux : GlobalDataLDAPi.UserInput){
										if (texto.contains(aux) == true){
								  			t = 1;
											break;
								  		}
									}
								}
								VariableSymbol vs = new VariableSymbol(texto, t, linha, true, currentFile);
						   		currentScope.define(vs, null, true);
							}
						    }
						    else
						    	Flags[17] = 0;
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:1402:7: DoubleQuotedString
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					DoubleQuotedString240=(CommonTree)match(input,DoubleQuotedString,FOLLOW_DoubleQuotedString_in_atom2297); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DoubleQuotedString240_tree = (CommonTree)adaptor.dupNode(DoubleQuotedString240);


					adaptor.addChild(root_0, DoubleQuotedString240_tree);
					}

					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0 && Flags[17] == 0){
							texto = (DoubleQuotedString240!=null?DoubleQuotedString240.getText():null);
							linha = (DoubleQuotedString240!=null?DoubleQuotedString240.getLine():0);
							if (Flags[7] == 0 ){
								int t = 0;
								if (Flags[19] == 0){ /*defAttributeClass_flag;*/
								  	for (String aux : GlobalDataLDAPi.UserInput){
										if (texto.contains(aux) == true){
								  			t = 1;
											break;
								  		}
									}
								}
								VariableSymbol vs = new VariableSymbol(texto, t, linha, true, currentFile);
						   		currentScope.define(vs, null, true);
							}
						    }
						    else
						    	Flags[17] = 0;
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// ./Ldapi.g:1428:7: Integer
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					Integer241=(CommonTree)match(input,Integer,FOLLOW_Integer_in_atom2309); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Integer241_tree = (CommonTree)adaptor.dupNode(Integer241);


					adaptor.addChild(root_0, Integer241_tree);
					}

					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0 && Flags[17] == 0){
							texto = (Integer241!=null?Integer241.getText():null);
							linha = (Integer241!=null?Integer241.getLine():0);
							if (Flags[7] == 0 ){
								VariableSymbol vs = new VariableSymbol(texto, 0, linha, true, currentFile);
						   		currentScope.define(vs, null, true);
							}
						    }
						    else
						    	Flags[17] = 0;
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// ./Ldapi.g:1445:7: Real
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					Real242=(CommonTree)match(input,Real,FOLLOW_Real_in_atom2320); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Real242_tree = (CommonTree)adaptor.dupNode(Real242);


					adaptor.addChild(root_0, Real242_tree);
					}

					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0 && Flags[17] == 0){
							texto = (Real242!=null?Real242.getText():null);
							if (Flags[7] == 0 ){
								VariableSymbol vs = new VariableSymbol(texto, 0, linha, true, currentFile);
						   		currentScope.define(vs, null, true);
							}
						    }
						    else
						    	Flags[17] = 0;
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 5 :
					// ./Ldapi.g:1461:7: Boolean
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					Boolean243=(CommonTree)match(input,Boolean,FOLLOW_Boolean_in_atom2331); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Boolean243_tree = (CommonTree)adaptor.dupNode(Boolean243);


					adaptor.addChild(root_0, Boolean243_tree);
					}

					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0 && Flags[17] == 0){
							texto = (Boolean243!=null?Boolean243.getText():null);
							linha = (Boolean243!=null?Boolean243.getLine():0);
							if (Flags[7] == 0 ){
								VariableSymbol vs = new VariableSymbol(texto, 0, linha, true, currentFile);
						   		currentScope.define(vs, null, true);
							}
						    }
						    else
						    	Flags[17] = 0;
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 6 :
					// ./Ldapi.g:1478:7: 'null'
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					string_literal244=(CommonTree)match(input,120,FOLLOW_120_in_atom2342); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal244_tree = (CommonTree)adaptor.dupNode(string_literal244);


					adaptor.addChild(root_0, string_literal244_tree);
					}

					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0 && Flags[17] == 0){
							if (Flags[7] == 0 ){
								VariableSymbol vs = new VariableSymbol("null", 0, linha, true, currentFile);
						   		currentScope.define(vs, null, true);
							}
						    }
						    else
						    	Flags[17] = 0;
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 7 :
					// ./Ldapi.g:1493:7: HereDoc
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					HereDoc245=(CommonTree)match(input,HereDoc,FOLLOW_HereDoc_in_atom2354); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					HereDoc245_tree = (CommonTree)adaptor.dupNode(HereDoc245);


					adaptor.addChild(root_0, HereDoc245_tree);
					}

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 8 :
					// ./Ldapi.g:1493:17: arrayDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_arrayDeclaration_in_atom2358);
					arrayDeclaration246=arrayDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, arrayDeclaration246.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 9 :
					// ./Ldapi.g:1493:36: listDefinition
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_listDefinition_in_atom2362);
					listDefinition247=listDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, listDefinition247.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class reference_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "reference"
	// ./Ldapi.g:1496:1: reference : ( ^( AMPERSAND nameOrFunctionCall ) | nameOrFunctionCall );
	public final Ldapi.reference_return reference() throws RecognitionException {
		Ldapi.reference_return retval = new Ldapi.reference_return();
		retval.start = input.LT(1);
		int reference_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree AMPERSAND248=null;
		TreeRuleReturnScope nameOrFunctionCall249 =null;
		TreeRuleReturnScope nameOrFunctionCall250 =null;

		CommonTree AMPERSAND248_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// ./Ldapi.g:1497:5: ( ^( AMPERSAND nameOrFunctionCall ) | nameOrFunctionCall )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==AMPERSAND) ) {
				alt51=1;
			}
			else if ( (LA51_0==Apply||LA51_0==CLASS_MEMBER||LA51_0==DOLLAR||LA51_0==INSTANCE_MEMBER||LA51_0==OPEN_SQUARE_BRACE||LA51_0==UnquotedString) ) {
				alt51=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// ./Ldapi.g:1497:7: ^( AMPERSAND nameOrFunctionCall )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					AMPERSAND248=(CommonTree)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_reference2380); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AMPERSAND248_tree = (CommonTree)adaptor.dupNode(AMPERSAND248);


					root_1 = (CommonTree)adaptor.becomeRoot(AMPERSAND248_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_nameOrFunctionCall_in_reference2382);
					nameOrFunctionCall249=nameOrFunctionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, nameOrFunctionCall249.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:1498:7: nameOrFunctionCall
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_nameOrFunctionCall_in_reference2391);
					nameOrFunctionCall250=nameOrFunctionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, nameOrFunctionCall250.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, reference_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "reference"


	public static class nameOrFunctionCall_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nameOrFunctionCall"
	// ./Ldapi.g:1501:1: nameOrFunctionCall : ( ^( Apply name ( expression )* ) | name );
	public final Ldapi.nameOrFunctionCall_return nameOrFunctionCall() throws RecognitionException {
		Ldapi.nameOrFunctionCall_return retval = new Ldapi.nameOrFunctionCall_return();
		retval.start = input.LT(1);
		int nameOrFunctionCall_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree Apply251=null;
		TreeRuleReturnScope name252 =null;
		TreeRuleReturnScope expression253 =null;
		TreeRuleReturnScope name254 =null;

		CommonTree Apply251_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// ./Ldapi.g:1502:4: ( ^( Apply name ( expression )* ) | name )
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==Apply) ) {
				alt53=1;
			}
			else if ( (LA53_0==CLASS_MEMBER||LA53_0==DOLLAR||LA53_0==INSTANCE_MEMBER||LA53_0==OPEN_SQUARE_BRACE||LA53_0==UnquotedString) ) {
				alt53=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
					// ./Ldapi.g:1502:6: ^( Apply name ( expression )* )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {Flags[1] = 1; /*callFunction_flag = 1;*/}
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					Apply251=(CommonTree)match(input,Apply,FOLLOW_Apply_in_nameOrFunctionCall2410); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Apply251_tree = (CommonTree)adaptor.dupNode(Apply251);


					root_1 = (CommonTree)adaptor.becomeRoot(Apply251_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_name_in_nameOrFunctionCall2412);
					name252=name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, name252.getTree());

					// ./Ldapi.g:1502:62: ( expression )*
					loop52:
					while (true) {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==AMPERSAND||LA52_0==ASTERISK||(LA52_0 >= Apply && LA52_0 <= Array)||(LA52_0 >= AssignmentOperator && LA52_0 <= BANG)||LA52_0==Boolean||(LA52_0 >= CLASS_MEMBER && LA52_0 <= CLONE)||(LA52_0 >= Cast && LA52_0 <= ConcatAssigmentOperator)||LA52_0==DIE||(LA52_0 >= DOLLAR && LA52_0 <= DOT)||(LA52_0 >= DoubleQuotedString && LA52_0 <= ECHO)||(LA52_0 >= EQUALS && LA52_0 <= EqualityOperator)||LA52_0==FORWARD_SLASH||LA52_0==HereDoc||(LA52_0 >= INSTANCE_MEMBER && LA52_0 <= IfExpression)||(LA52_0 >= Integer && LA52_0 <= List)||LA52_0==MINUS||LA52_0==NEW||LA52_0==OPEN_SQUARE_BRACE||(LA52_0 >= PERCENT && LA52_0 <= PRINTF)||(LA52_0 >= Postfix && LA52_0 <= Prefix)||LA52_0==Real||LA52_0==SUPPRESS_WARNINGS||(LA52_0 >= ShiftOperator && LA52_0 <= SingleQuotedString)||LA52_0==TILDE||LA52_0==UnquotedString||(LA52_0 >= 114 && LA52_0 <= 117)||(LA52_0 >= 120 && LA52_0 <= 121)||LA52_0==123) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// ./Ldapi.g:1502:62: expression
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expression_in_nameOrFunctionCall2414);
							expression253=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, expression253.getTree());

							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							break loop52;
						}
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						 try{
						    if (Flags[15] == 0){
							int dirnameFunction = 0;

						   	if (GlobalDataLDAPi.LDAPIFunctions.contains(currentScope.getScopeName()) == true && currentScope.getScopeSymbol().getIsClassMethod() == false) {
								Flags[2] = 0; //call_mysql_flag = 0;
							}

						   	if (GlobalDataLDAPi.LDAPSecFunctions.contains(currentScope.getScopeName()) == true && currentScope.getScopeSymbol().getIsClassMethod() == false)
								Flags[3] = 0; //call_mysqlsec_flag = 0;	   

							if (Flags[10] == 1){ //call_UserFunction_flag = 1;)
								// Se a funcao chamada e' uma UserFunction... estamos em definicao de uma UserFunction
						   		if (Flags[6] == 1) //defFunction_flag = 1
									Flags[10] = 0; //call_UserFunction_flag = 0;

								Iterator <Symbol> it = currentScope.getMembers().iterator();
								for(;it.hasNext();){
									Symbol sy = it.next();
									sy.setIsParamUserFunction(true);
								}
						
								Flags[10] = 0; //call_UserFunction_flag = 0;
							}

						     if (currentScope.getScopeSymbol().getName().equals("dirname") == true){
								Scope aux = currentScope.getEnclosingScope();
								Symbol sym = (Symbol) currentScope.getMembers().get(0);		
								if (sym.getAlfanumeric() == true){
									if (sym.getName().startsWith("\"") || sym.getName().startsWith("\"")){
										String aa = sym.getName();
										String aaa = aa.substring(1,aa.length()-1);
										sym.setName(aaa);
									}
									if (sym.getName().equals("__FILE__") || sym.getName().equals("__DIR__"))
										sym.setName(sym.getFileSymbol());				           	
					               	File f = new File(sym.getName());
					               	String s = f.getParent();
					               	sym.setName(s.toString());               	
					            	}            	
								aux.define(sym, null, true);
								aux.getMembers().remove(currentScope);
								currentScope = aux;
								dirnameFunction = 1;
						     }
						     
							if (currentScope.getScopeSymbol().getName().equals("define") == true){
								Scope aux = currentScope.getEnclosingScope();
								if (currentScope.getMembers().size() < 2){
									aux.getMembers().remove(currentScope);
									currentScope = aux;
									dirnameFunction = 1;				
								}
								else{	
									Symbol sym0 = (Symbol) currentScope.getMembers().get(0);					
									Symbol sym1 = (Symbol) currentScope.getMembers().get(1);						
									aux.getMembers().remove(currentScope);

									if (sym1.getTainted() == 1)
										sym0.setTainted(1);
									if (sym0.getAlfanumeric() == true && (sym0.getName().startsWith("\"") || sym0.getName().startsWith("\'"))){
										String aa = sym0.getName();
										String aaa = aa.substring(1,aa.length()-1);
										sym0.setName(aaa);
									}

									CallSymbol ms = new CallSymbol(sym0.getName(), sym0.getCodeLine(), aux, 0, currentFile);
									aux.define(ms, ms, false);
									currentScope = ms;		
									if (sym1.getAlfanumeric() == true){
										String aa = sym1.getName();
										String aaa = aa.substring(1,aa.length()-1);
										sym1.setName(aaa);
										if (sym1.getName().equals("__FILE__"))
											sym1.setName(sym1.getFileSymbol());
									      
										if (sym1.getName().equals("__DIR__")){
											File f = new File(sym1.getFileSymbol());
									          String s = f.getParent();
									          sym1.setName(s.toString());
									     }
									}	     
									currentScope.define(sym1, null, true);
							     }
							 }

							if (dirnameFunction == 0)
							   	currentScope = currentScope.getEnclosingScope();
						    }
							} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:1597:7: name
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_name_in_nameOrFunctionCall2428);
					name254=name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, name254.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, nameOrFunctionCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "nameOrFunctionCall"


	public static class name_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "name"
	// ./Ldapi.g:1600:1: name : ( staticMemberAccess | memberAccess | variable );
	public final Ldapi.name_return name() throws RecognitionException {
		Ldapi.name_return retval = new Ldapi.name_return();
		retval.start = input.LT(1);
		int name_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope staticMemberAccess255 =null;
		TreeRuleReturnScope memberAccess256 =null;
		TreeRuleReturnScope variable257 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// ./Ldapi.g:1601:5: ( staticMemberAccess | memberAccess | variable )
			int alt54=3;
			switch ( input.LA(1) ) {
			case CLASS_MEMBER:
				{
				alt54=1;
				}
				break;
			case INSTANCE_MEMBER:
			case OPEN_SQUARE_BRACE:
				{
				alt54=2;
				}
				break;
			case DOLLAR:
			case UnquotedString:
				{
				alt54=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// ./Ldapi.g:1601:7: staticMemberAccess
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_staticMemberAccess_in_name2445);
					staticMemberAccess255=staticMemberAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, staticMemberAccess255.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:1602:7: memberAccess
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_memberAccess_in_name2453);
					memberAccess256=memberAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, memberAccess256.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// ./Ldapi.g:1603:7: variable
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_variable_in_name2461);
					variable257=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, variable257.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, name_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "name"


	public static class staticMemberAccess_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "staticMemberAccess"
	// ./Ldapi.g:1606:1: staticMemberAccess : ^( '::' UnquotedString nameOrFunctionCall ) ;
	public final Ldapi.staticMemberAccess_return staticMemberAccess() throws RecognitionException {
		Ldapi.staticMemberAccess_return retval = new Ldapi.staticMemberAccess_return();
		retval.start = input.LT(1);
		int staticMemberAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal258=null;
		CommonTree UnquotedString259=null;
		TreeRuleReturnScope nameOrFunctionCall260 =null;

		CommonTree string_literal258_tree=null;
		CommonTree UnquotedString259_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// ./Ldapi.g:1607:5: ( ^( '::' UnquotedString nameOrFunctionCall ) )
			// ./Ldapi.g:1607:7: ^( '::' UnquotedString nameOrFunctionCall )
			{
			root_0 = (CommonTree)adaptor.nil();


			if ( state.backtracking==0 ) {
					try{
					Flags[21] = 1;
			     	CallSymbol ms = new CallSymbol("staticMemberAccess", -1, currentScope, 0, currentFile);
			     	currentScope.define(ms, ms, false);
			     	currentScope = ms; 
					} catch (Exception e){
						
					} 	
				 }
			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal258=(CommonTree)match(input,CLASS_MEMBER,FOLLOW_CLASS_MEMBER_in_staticMemberAccess2495); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal258_tree = (CommonTree)adaptor.dupNode(string_literal258);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal258_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			UnquotedString259=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_staticMemberAccess2497); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			UnquotedString259_tree = (CommonTree)adaptor.dupNode(UnquotedString259);


			adaptor.addChild(root_1, UnquotedString259_tree);
			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_nameOrFunctionCall_in_staticMemberAccess2499);
			nameOrFunctionCall260=nameOrFunctionCall();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, nameOrFunctionCall260.getTree());

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
					try{
					Flags[21] = 0;
					currentScope.getScopeSymbol().setCodeLine(linha);
					currentScope.getScopeSymbol().setIsStaticMember(true);
					currentScope.getScopeSymbol().setIsClassInstruction(true);
					String cname = (UnquotedString259!=null?UnquotedString259.getText():null);
					currentScope.getScopeSymbol().setName(cname);

					//Symbol symm = (Symbol) currentScope.getMembers().get(0);				
					
					currentScope = currentScope.getEnclosingScope();		
			       
					} catch (Exception e){
						
					}
				}
			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, staticMemberAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "staticMemberAccess"


	public static class memberAccess_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "memberAccess"
	// ./Ldapi.g:1637:1: memberAccess : ( arrayAccess ( INSTANCE_MEMBER UnquotedString )? | ^( INSTANCE_MEMBER variable arrayOrUnquotedStringOrFunctionCall ) );
	public final Ldapi.memberAccess_return memberAccess() throws RecognitionException {
		Ldapi.memberAccess_return retval = new Ldapi.memberAccess_return();
		retval.start = input.LT(1);
		int memberAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree INSTANCE_MEMBER262=null;
		CommonTree UnquotedString263=null;
		CommonTree INSTANCE_MEMBER264=null;
		TreeRuleReturnScope arrayAccess261 =null;
		TreeRuleReturnScope variable265 =null;
		TreeRuleReturnScope arrayOrUnquotedStringOrFunctionCall266 =null;

		CommonTree INSTANCE_MEMBER262_tree=null;
		CommonTree UnquotedString263_tree=null;
		CommonTree INSTANCE_MEMBER264_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// ./Ldapi.g:1638:5: ( arrayAccess ( INSTANCE_MEMBER UnquotedString )? | ^( INSTANCE_MEMBER variable arrayOrUnquotedStringOrFunctionCall ) )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==OPEN_SQUARE_BRACE) ) {
				alt56=1;
			}
			else if ( (LA56_0==INSTANCE_MEMBER) ) {
				alt56=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}

			switch (alt56) {
				case 1 :
					// ./Ldapi.g:1638:7: arrayAccess ( INSTANCE_MEMBER UnquotedString )?
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {Flags[12] = 1;}
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_arrayAccess_in_memberAccess2528);
					arrayAccess261=arrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, arrayAccess261.getTree());

					// ./Ldapi.g:1638:36: ( INSTANCE_MEMBER UnquotedString )?
					int alt55=2;
					alt55 = dfa55.predict(input);
					switch (alt55) {
						case 1 :
							// ./Ldapi.g:1638:37: INSTANCE_MEMBER UnquotedString
							{
							_last = (CommonTree)input.LT(1);
							INSTANCE_MEMBER262=(CommonTree)match(input,INSTANCE_MEMBER,FOLLOW_INSTANCE_MEMBER_in_memberAccess2531); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							INSTANCE_MEMBER262_tree = (CommonTree)adaptor.dupNode(INSTANCE_MEMBER262);


							adaptor.addChild(root_0, INSTANCE_MEMBER262_tree);
							}

							_last = (CommonTree)input.LT(1);
							UnquotedString263=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_memberAccess2533); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							UnquotedString263_tree = (CommonTree)adaptor.dupNode(UnquotedString263);


							adaptor.addChild(root_0, UnquotedString263_tree);
							}

							if ( state.backtracking==0 ) {
							}

							}
							break;

					}

					if ( state.backtracking==0 ) {
						try{	  
					        if (Flags[15] == 0){
						// membro esquerdo da atribuicao e' um array
						if (isLeftMemberArray == 1){
							int i = currentScope.getMembers().size();
							Symbol sym1 = (Symbol)currentScope.getMembers().get(i-1);
							scp_array_left.getScopeSymbol().setName(sym1.getName());
							currentScope = scp_array_left;
							isLeftMemberArray = 0;
						}

						if ((UnquotedString263!=null?UnquotedString263.getText():null) != null){
							CallSymbol ms = new CallSymbol((UnquotedString263!=null?UnquotedString263.getText():null), linha, null, 0, currentFile);
							int i = currentScope.getMembers().size();
							Symbol sym1 = (Symbol)currentScope.getMembers().get(i-1);
							ms.define(sym1, null, true);
							currentScope.getMembers().remove(i-1);
							currentScope.define(ms, ms, false);
						}
						}
							} catch (Exception e){
								
							}
					      }
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:1665:7: ^( INSTANCE_MEMBER variable arrayOrUnquotedStringOrFunctionCall )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
					    		Flags[0] = 1; // assign_flag = 1
					    		Flags[25] = 1; // instanceMember_flag = 1
					    		instanceName = "";
					    		accessInstance++;  		  		
					      }
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					INSTANCE_MEMBER264=(CommonTree)match(input,INSTANCE_MEMBER,FOLLOW_INSTANCE_MEMBER_in_memberAccess2567); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INSTANCE_MEMBER264_tree = (CommonTree)adaptor.dupNode(INSTANCE_MEMBER264);


					root_1 = (CommonTree)adaptor.becomeRoot(INSTANCE_MEMBER264_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_variable_in_memberAccess2569);
					variable265=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, variable265.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_memberAccess2571);
					arrayOrUnquotedStringOrFunctionCall266=arrayOrUnquotedStringOrFunctionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, arrayOrUnquotedStringOrFunctionCall266.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							try{
					       	accessInstance--;
							if (Flags[26] == 0)
								currentScope.getScopeSymbol().setIsClassInstruction(true);
							else
								currentScope.getScopeSymbol().setIsClassInstruction(false);
							
							if (accessInstance == 0){
								Flags[12] = 0;
							   	Flags[21] = 0;
							   	Flags[24] = 0;
							   	Flags[26] = 0;
						   	}
					       	currentScope = currentScope.getEnclosingScope(); 
							} catch (Exception e){
								
							}
					       }
					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, memberAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberAccess"


	public static class arrayOrUnquotedStringOrFunctionCall_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arrayOrUnquotedStringOrFunctionCall"
	// ./Ldapi.g:1693:1: arrayOrUnquotedStringOrFunctionCall : ( ^( EQUALS arrayAccess expression ) | arrayAccess | ^( EQUALS expression expression ) | ^( AssignmentOperator expression expression ) | ^( ConcatAssigmentOperator expression expression ) | ^( INSTANCE_MEMBER objectNameOrMethod arrayOrUnquotedStringOrFunctionCall ) | nameOrFunctionCall );
	public final Ldapi.arrayOrUnquotedStringOrFunctionCall_return arrayOrUnquotedStringOrFunctionCall() throws RecognitionException {
		Ldapi.arrayOrUnquotedStringOrFunctionCall_return retval = new Ldapi.arrayOrUnquotedStringOrFunctionCall_return();
		retval.start = input.LT(1);
		int arrayOrUnquotedStringOrFunctionCall_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree EQUALS267=null;
		CommonTree EQUALS271=null;
		CommonTree AssignmentOperator274=null;
		CommonTree ConcatAssigmentOperator277=null;
		CommonTree INSTANCE_MEMBER280=null;
		TreeRuleReturnScope arrayAccess268 =null;
		TreeRuleReturnScope expression269 =null;
		TreeRuleReturnScope arrayAccess270 =null;
		TreeRuleReturnScope expression272 =null;
		TreeRuleReturnScope expression273 =null;
		TreeRuleReturnScope expression275 =null;
		TreeRuleReturnScope expression276 =null;
		TreeRuleReturnScope expression278 =null;
		TreeRuleReturnScope expression279 =null;
		TreeRuleReturnScope objectNameOrMethod281 =null;
		TreeRuleReturnScope arrayOrUnquotedStringOrFunctionCall282 =null;
		TreeRuleReturnScope nameOrFunctionCall283 =null;

		CommonTree EQUALS267_tree=null;
		CommonTree EQUALS271_tree=null;
		CommonTree AssignmentOperator274_tree=null;
		CommonTree ConcatAssigmentOperator277_tree=null;
		CommonTree INSTANCE_MEMBER280_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// ./Ldapi.g:1697:5: ( ^( EQUALS arrayAccess expression ) | arrayAccess | ^( EQUALS expression expression ) | ^( AssignmentOperator expression expression ) | ^( ConcatAssigmentOperator expression expression ) | ^( INSTANCE_MEMBER objectNameOrMethod arrayOrUnquotedStringOrFunctionCall ) | nameOrFunctionCall )
			int alt57=7;
			switch ( input.LA(1) ) {
			case EQUALS:
				{
				int LA57_1 = input.LA(2);
				if ( (LA57_1==DOWN) ) {
					int LA57_10 = input.LA(3);
					if ( (synpred122_Ldapi()) ) {
						alt57=1;
					}
					else if ( (synpred124_Ldapi()) ) {
						alt57=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 57, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 57, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OPEN_SQUARE_BRACE:
				{
				int LA57_2 = input.LA(2);
				if ( (LA57_2==DOWN) ) {
					int LA57_11 = input.LA(3);
					if ( (synpred123_Ldapi()) ) {
						alt57=2;
					}
					else if ( (true) ) {
						alt57=7;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 57, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AssignmentOperator:
				{
				alt57=4;
				}
				break;
			case ConcatAssigmentOperator:
				{
				alt57=5;
				}
				break;
			case INSTANCE_MEMBER:
				{
				int LA57_5 = input.LA(2);
				if ( (LA57_5==DOWN) ) {
					int LA57_12 = input.LA(3);
					if ( (synpred127_Ldapi()) ) {
						alt57=6;
					}
					else if ( (true) ) {
						alt57=7;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 57, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Apply:
			case CLASS_MEMBER:
			case DOLLAR:
			case UnquotedString:
				{
				alt57=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// ./Ldapi.g:1698:6: ^( EQUALS arrayAccess expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
						   try{
							Flags[23] = 1;   			
							Flags[12] = 1;
							Flags[28] = 1;
							Flags[24] = 1; /*assign_flag = 1;*/
							
							initInstanceOperations();
					    		
					    		if (Flags[26] == 0) /*noClass_instMember_flag e callMethodClass ou access*/
					    			Flags[21] = 1;
							} catch (Exception e){
								
							}      	
					     }
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					EQUALS267=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_arrayOrUnquotedStringOrFunctionCall2622); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQUALS267_tree = (CommonTree)adaptor.dupNode(EQUALS267);


					root_1 = (CommonTree)adaptor.becomeRoot(EQUALS267_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_arrayAccess_in_arrayOrUnquotedStringOrFunctionCall2624);
					arrayAccess268=arrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, arrayAccess268.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2626);
					expression269=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression269.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						  try{
					     	currentScope = currentScope.getEnclosingScope();
							} catch (Exception e){
								
							}
						
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:1723:2: arrayAccess
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
						  try{
							Flags[23] = 1;   			
							Flags[12] = 1;
							Flags[28] = 1;
							
							initInstanceOperations();
							} catch (Exception e){
								
							}
					    }
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_arrayAccess_in_arrayOrUnquotedStringOrFunctionCall2642);
					arrayAccess270=arrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, arrayAccess270.getTree());

					if ( state.backtracking==0 ) {
						   try{
					      if (Flags[26] == 0){
					       	Symbol sym = null;
					 		if(Flags[27] == 0){
					 			sym = (Symbol) currentScope.getMembers().get(0);
					 		}
					 		else{
					 			Iterator <Symbol> it = currentScope.getMembers().iterator();
								for(; it.hasNext();){
							   		sym = it.next();
						 			if (sym.getRootScope() != null)
						 				break;
							   	}
					 		}
					      
						   	String s = sym.getName(); 	
						     if (s.startsWith("$") == true){
					     		sym.setName(s.substring(1));
					     		s = sym.getName();
					     	}    	
					      }
							} catch (Exception e){
								
							}    	
					      }
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// ./Ldapi.g:1762:2: ^( EQUALS expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
						  try{
							Flags[23] = 1;
							Flags[24] = 1; /*assign_flag = 1;*/
					    
							initInstanceOperations();
					    		if (Flags[26] == 0) /*noClass_instMember_flag e callMethodClass ou access*/
					    			Flags[21] = 1;
							} catch (Exception e){
								
							}
					    }
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					EQUALS271=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_arrayOrUnquotedStringOrFunctionCall2672); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQUALS271_tree = (CommonTree)adaptor.dupNode(EQUALS271);


					root_1 = (CommonTree)adaptor.becomeRoot(EQUALS271_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2674);
					expression272=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression272.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2676);
					expression273=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression273.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							try{
							if (Flags[26] == 1){
								Flags[24] = 1;	   	
							}
					     	currentScope = currentScope.getEnclosingScope();
							} catch (Exception e){
								
							}     	
					      }
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// ./Ldapi.g:1787:7: ^( AssignmentOperator expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					AssignmentOperator274=(CommonTree)match(input,AssignmentOperator,FOLLOW_AssignmentOperator_in_arrayOrUnquotedStringOrFunctionCall2701); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AssignmentOperator274_tree = (CommonTree)adaptor.dupNode(AssignmentOperator274);


					root_1 = (CommonTree)adaptor.becomeRoot(AssignmentOperator274_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2703);
					expression275=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression275.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2705);
					expression276=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression276.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 5 :
					// ./Ldapi.g:1789:2: ^( ConcatAssigmentOperator expression expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
						  try{
							Flags[23] = 1;
							Flags[24] = 1; /*assign_flag = 1;*/
					    
							initInstanceOperations();
							} catch (Exception e){
								
							}
					    }
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ConcatAssigmentOperator277=(CommonTree)match(input,ConcatAssigmentOperator,FOLLOW_ConcatAssigmentOperator_in_arrayOrUnquotedStringOrFunctionCall2720); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ConcatAssigmentOperator277_tree = (CommonTree)adaptor.dupNode(ConcatAssigmentOperator277);


					root_1 = (CommonTree)adaptor.becomeRoot(ConcatAssigmentOperator277_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2722);
					expression278=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression278.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2724);
					expression279=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression279.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						  try{
							if (Flags[18] == 0 && Flags[6] == 0){ /*defFunction_flag = 0 ou defClass_flag = 0 para somente na chamada da funcao/class e nao na sua definicao*/
								Symbol sy = currentScope.getScopeSymbol();
								VariableSymbol vs = new VariableSymbol(sy.getName(), sy.getTainted(), sy.getCodeLine(), currentFile);
								currentScope.define(vs, null, true);	   	
							}

					     	currentScope = currentScope.getEnclosingScope();
							} catch (Exception e){
								
							}    	
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 6 :
					// ./Ldapi.g:1814:7: ^( INSTANCE_MEMBER objectNameOrMethod arrayOrUnquotedStringOrFunctionCall )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					INSTANCE_MEMBER280=(CommonTree)match(input,INSTANCE_MEMBER,FOLLOW_INSTANCE_MEMBER_in_arrayOrUnquotedStringOrFunctionCall2738); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INSTANCE_MEMBER280_tree = (CommonTree)adaptor.dupNode(INSTANCE_MEMBER280);


					root_1 = (CommonTree)adaptor.becomeRoot(INSTANCE_MEMBER280_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_objectNameOrMethod_in_arrayOrUnquotedStringOrFunctionCall2740);
					objectNameOrMethod281=objectNameOrMethod();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, objectNameOrMethod281.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_arrayOrUnquotedStringOrFunctionCall2742);
					arrayOrUnquotedStringOrFunctionCall282=arrayOrUnquotedStringOrFunctionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, arrayOrUnquotedStringOrFunctionCall282.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
							try{
					      	/* Chamada de metodo fora de um obj
					      	 * a -> metodo -> metodo
					      	 *
					      	 * Chamada dentro do metodo
					      	 * this -> metodo -> metodo
					      	 * this -> attrib obj -> metodo
					      	 */
					      	
					      	if (Flags[26] == 0){ 
							 	if (currentScope.getScopeSymbol().getIsClassMethod() == false)
							 		instanceName = (objectNameOrMethod281!=null?((Ldapi.objectNameOrMethod_return)objectNameOrMethod281).instanceName_aux:null);
							 	else
							 		currentInstance = (objectNameOrMethod281!=null?((Ldapi.objectNameOrMethod_return)objectNameOrMethod281).inst_aux:null);
							 		
								currentScope = currentScope.getEnclosingScope();
							}
							Flags[27] = 0;
							} catch (Exception e){
								
							}
					      }
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 7 :
					// ./Ldapi.g:1839:7: nameOrFunctionCall
					{
					root_0 = (CommonTree)adaptor.nil();


					if ( state.backtracking==0 ) {
							try{	
							initInstanceOperations();
							if (Flags[26] == 1) /*noClass_instMember_flag e callMethodClass ou access*/
								currentScope.getScopeSymbol().setIsClassInstruction(false);
							else{
								Flags[21] = 1;
								Flags[23] = 1;
							}
							} catch (Exception e){
								
							}
					    }
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_nameOrFunctionCall_in_arrayOrUnquotedStringOrFunctionCall2779);
					nameOrFunctionCall283=nameOrFunctionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, nameOrFunctionCall283.getTree());

					if ( state.backtracking==0 ) {
						   try{    
					      	Flags[21] = 0;
					      	if (Flags[26] == 0){
					      		currentScope.getScopeSymbol().setIsClassInstruction(true);
							 	if (currentScope.getMembers().size() == 0){     	
									VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
									currentScope.define(vs, null, true);
								
									if (Flags[18] == 0 && Flags[6] == 0){
										SymbolTable t = currentInstance.getInstanceAttributes();

										if (t.containsSymbol(texto)){
											Flags[21] = 3; // acede a um attributo normal var -> att 
										}	
									}
							 	}
							 	else{ // chama metodo para o obj var -> func
							 		if (Flags[2] == 1 || Flags[3] == 1){
							 			Flags[2] = 0; // LDAPI_function
							 			Flags[3] = 0; // SecLDAP_function
							 		}
							 		else{		 		
							 			Scope scp = null;			 		
								 		if(Flags[27] == 0){
								 			Iterator <Symbol> it = currentScope.getMembers().iterator();
											Symbol sym1;
											for(; it.hasNext();){
										   		sym1 = it.next();
									 			if (sym1.getRootScope() != null){
									 				scp = (Scope) sym1;
									 				break;
									 			}
										   	}

											// Marcar os simbolos parametros do metodo
								 			it = scp.getMembers().iterator();
											for(; it.hasNext();){
										   		sym1 = it.next();
										   		sym1.setIsParamUserFunction(true);
										   	}
								 		}
								  }
							  
							 	}
					      }
					      else{
							if (currentScope.getMembers().size() == 0){     	
								VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
								currentScope.define(vs, null, true);
							}
						}
							} catch (Exception e){
								
							}	
					      }
					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

			if ( state.backtracking==0 ) {
					Flags[23] = 0;
				}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, arrayOrUnquotedStringOrFunctionCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayOrUnquotedStringOrFunctionCall"


	public static class objectNameOrMethod_return extends TreeRuleReturnScope {
		public String instanceName_aux;
		public Instance inst_aux;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "objectNameOrMethod"
	// ./Ldapi.g:1913:1: objectNameOrMethod returns [String instanceName_aux, Instance inst_aux] : nameOrFunctionCall ;
	public final Ldapi.objectNameOrMethod_return objectNameOrMethod() throws RecognitionException {
		Ldapi.objectNameOrMethod_return retval = new Ldapi.objectNameOrMethod_return();
		retval.start = input.LT(1);
		int objectNameOrMethod_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope nameOrFunctionCall284 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// ./Ldapi.g:1914:5: ( nameOrFunctionCall )
			// ./Ldapi.g:1914:7: nameOrFunctionCall
			{
			root_0 = (CommonTree)adaptor.nil();


			if ( state.backtracking==0 ) {
					try{
					Flags[23] = 1;
			    
					initInstanceOperations();
			    		if (Flags[26] == 0) /*noClass_instMember_flag e callMethodClass ou access*/
			    			Flags[21] = 1; /*callMethodClass or access attribute*/
					} catch (Exception e){
						
					}
			    }
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_nameOrFunctionCall_in_objectNameOrMethod2828);
			nameOrFunctionCall284=nameOrFunctionCall();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_0, nameOrFunctionCall284.getTree());

			if ( state.backtracking==0 ) {
				  try{
			      	Flags[21] = 0;
			      	if (Flags[26] == 0){
			      	currentScope.getScopeSymbol().setIsClassInstruction(true);
			      	if (currentScope.getMembers().size() == 0){
						CallSymbol ms = new CallSymbol(texto, linha, currentScope, 0, currentFile);
					   	currentScope.define(ms, ms, false);
					   	currentScope = ms;
					   	retval.instanceName_aux = instanceName;
					   	instanceName = texto;
			      	}
			      	else{
			      	     currentScope = (Scope) currentScope.getMembers().get(0);
			      	     currentScope.getScopeSymbol().setIsClassMethod(true);
						if (Flags[18] == 0 && Flags[6] == 0){
							// obter metodo
							mss_final = null;
							mss_final_file = "";
						   	String s = currentScope.getScopeSymbol().getName();
							MethodClass mc = currentClass.getMethodClass(s, "", mct);
							mss_final = mc.getMeth();
							mss_final_file = mc.getClassMeth().getFileClass();
						   			
							if (mss_final != null){
								// obter instancia do return do metodo
								Instance ci = currentInstance.getInstanceOfReturn(s, currentScope.getScopeSymbol().getCodeLine(), null, null, false);
								if (ci != null){
									retval.inst_aux = currentInstance;
									currentInstance = ci;
								
									// obter classe
									s = currentInstance.getFileOfClass();
									class_table = (ClassTable) mct.get(s);
									s = currentInstance.getInstanceClass();
									currentClass = (ClassSymbol) class_table.getClassOfListClasses(s);
									
									Flags[27] = 1;
								}
							}
							
							// Marcar os simbolos como parametros do metodo
				 			Iterator <Symbol> it = currentScope.getMembers().iterator();
							for(; it.hasNext();){
						   		Symbol sym1 = it.next();
						   		sym1.setIsParamUserFunction(true);
						   	}
						}
			      	}
			      	}
			      else{
					if (currentScope.getMembers().size() == 0){   	
						VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
						currentScope.define(vs, null, true);
					}
				}	
					} catch (Exception e){
						
					}	  		
			    }
			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, objectNameOrMethod_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "objectNameOrMethod"


	public static class arrayAccess_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arrayAccess"
	// ./Ldapi.g:1989:1: arrayAccess : ^( OPEN_SQUARE_BRACE variable ( expression )* ) ;
	public final Ldapi.arrayAccess_return arrayAccess() throws RecognitionException {
		Ldapi.arrayAccess_return retval = new Ldapi.arrayAccess_return();
		retval.start = input.LT(1);
		int arrayAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree OPEN_SQUARE_BRACE285=null;
		TreeRuleReturnScope variable286 =null;
		TreeRuleReturnScope expression287 =null;

		CommonTree OPEN_SQUARE_BRACE285_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// ./Ldapi.g:1990:5: ( ^( OPEN_SQUARE_BRACE variable ( expression )* ) )
			// ./Ldapi.g:1990:7: ^( OPEN_SQUARE_BRACE variable ( expression )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			OPEN_SQUARE_BRACE285=(CommonTree)match(input,OPEN_SQUARE_BRACE,FOLLOW_OPEN_SQUARE_BRACE_in_arrayAccess2853); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			OPEN_SQUARE_BRACE285_tree = (CommonTree)adaptor.dupNode(OPEN_SQUARE_BRACE285);


			root_1 = (CommonTree)adaptor.becomeRoot(OPEN_SQUARE_BRACE285_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_variable_in_arrayAccess2855);
			variable286=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, variable286.getTree());

			// ./Ldapi.g:1990:36: ( expression )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==AMPERSAND||LA58_0==ASTERISK||(LA58_0 >= Apply && LA58_0 <= Array)||(LA58_0 >= AssignmentOperator && LA58_0 <= BANG)||LA58_0==Boolean||(LA58_0 >= CLASS_MEMBER && LA58_0 <= CLONE)||(LA58_0 >= Cast && LA58_0 <= ConcatAssigmentOperator)||LA58_0==DIE||(LA58_0 >= DOLLAR && LA58_0 <= DOT)||(LA58_0 >= DoubleQuotedString && LA58_0 <= ECHO)||(LA58_0 >= EQUALS && LA58_0 <= EqualityOperator)||LA58_0==FORWARD_SLASH||LA58_0==HereDoc||(LA58_0 >= INSTANCE_MEMBER && LA58_0 <= IfExpression)||(LA58_0 >= Integer && LA58_0 <= List)||LA58_0==MINUS||LA58_0==NEW||LA58_0==OPEN_SQUARE_BRACE||(LA58_0 >= PERCENT && LA58_0 <= PRINTF)||(LA58_0 >= Postfix && LA58_0 <= Prefix)||LA58_0==Real||LA58_0==SUPPRESS_WARNINGS||(LA58_0 >= ShiftOperator && LA58_0 <= SingleQuotedString)||LA58_0==TILDE||LA58_0==UnquotedString||(LA58_0 >= 114 && LA58_0 <= 117)||(LA58_0 >= 120 && LA58_0 <= 121)||LA58_0==123) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// ./Ldapi.g:1990:36: expression
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_arrayAccess2857);
					expression287=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, expression287.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					break loop58;
				}
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
				  try{
				   if (Flags[15] == 0){   
					Symbol sym1 = null, sym2 = null;
					int indice = indexArrayAccess.get(indexArrayAccess.size()-1);
					indexArrayAccess.remove(indexArrayAccess.size()-1);

					int j = currentScope.getMembers().size() - indice - 1;

					if(j > 0){
						sym1 = (Symbol)currentScope.getMembers().get(indice);
						
						if (sym1.getName().equals("GLOBALS") && Flags[6] == 1){			
							sym2 = (Symbol)currentScope.getMembers().get(indice + 1);
							sym1.setName(sym2.getName().substring(1,sym2.getName().length()-1));
							VariableSymbol vs = new VariableSymbol(sym1.getName(), 0, -1, currentFile);
							currentMethod.setGlobalVarFunction(sym1.getName(), vs);
							currentScope.getMembers().remove(indice + 1);
						}
						else{
							String sss = "$" + sym1.getName() + "[";
							for (int i = 1; i <= j; i++){
								sym1 = (Symbol)currentScope.getMembers().get(indice + i);
								if (!sym1.getIsVariableSymbol())
									sss = sss + sym1.getName() + "]";
								else{
									if(!sym1.getName().contains("$"))
										if(!sym1.getAlfanumeric())
											sss = sss + "$" + sym1.getName() + "]";
										else
											sss = sss + sym1.getName() + "]";
									else
										sss = sss + sym1.getName() + "]";
								}
								if(j > i){
									sss = sss + "[";
								}			
							}
							sym1 = (Symbol)currentScope.getMembers().get(indice);
							sym1.setName(sss);
							for (int i = 1; i <= j; i++)
								currentScope.getMembers().remove(indice + 1);
							
							if (indice > 0 && Flags[29] == 0){
								Symbol sym11 = (Symbol)currentScope.getMembers().get(indice - 1);
							 	if (sym1.getName().contains(sym11.getName()))
									currentScope.getMembers().remove(indice - 1);
							}
						}	
					}
					
					// acesso array sem atribuicao 
					if (isAloneMemberArray == 1)
						isAloneMemberArray = 0;


					// elemento de array como variavel global na definicao de uma UserFunction ou SymbolTable
					if (Flags[9] == 1){ //globalVar_flag = 1;
						VariableSymbol vs = new VariableSymbol(sym1.getName(), 0, linha, currentFile);
						if (Flags[6] == 1)
							currentMethod.setGlobalVarFunction(sym1.getName(), vs);
						else
							currentSymbolTable.setGlobalVarSymbolTable(sym1.getName(), vs);		
						currentScope.getMembers().remove(indice);
					}
				   }
					} catch (Exception e){
						
					}	   
				}
			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, arrayAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayAccess"


	public static class variable_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// ./Ldapi.g:2063:1: variable : ( ^( DOLLAR variable ) | UnquotedString );
	public final Ldapi.variable_return variable() throws RecognitionException {
		Ldapi.variable_return retval = new Ldapi.variable_return();
		retval.start = input.LT(1);
		int variable_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DOLLAR288=null;
		CommonTree UnquotedString290=null;
		TreeRuleReturnScope variable289 =null;

		CommonTree DOLLAR288_tree=null;
		CommonTree UnquotedString290_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// ./Ldapi.g:2064:5: ( ^( DOLLAR variable ) | UnquotedString )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==DOLLAR) ) {
				alt59=1;
			}
			else if ( (LA59_0==UnquotedString) ) {
				alt59=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// ./Ldapi.g:2064:7: ^( DOLLAR variable )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DOLLAR288=(CommonTree)match(input,DOLLAR,FOLLOW_DOLLAR_in_variable2881); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOLLAR288_tree = (CommonTree)adaptor.dupNode(DOLLAR288);


					root_1 = (CommonTree)adaptor.becomeRoot(DOLLAR288_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_variable_in_variable2883);
					variable289=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_1, variable289.getTree());

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0){
							if (Flags[9] == 1 && Flags[12] == 0){ /*globalVarFunction_flag = 1 && arrayAccess_flag = 0*/
								VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
								if (Flags[6] == 1)
									currentMethod.setGlobalVarFunction(texto, vs);
								else
									currentSymbolTable.setGlobalVarSymbolTable(texto, vs);
							}
							else{
							   	if (Flags[0] == 1){ //assign_flag = 1
								   	CallSymbol ms = new CallSymbol(texto, linha, currentScope, 0, currentFile);
								   	currentScope.define(ms, ms, false); // def method in current scope
								   	currentScope = ms;       // set current scope to method scope
								   	instanceName = texto;
									Flags[0] = 0; //assign_flag = 0;

									// membro esquerdo da atribuicao e' um array				
									if (Flags[12] == 1){ //arrayAccess_flag = 1
										scp_array_left = currentScope;
										CallSymbol ms_aux = new CallSymbol(texto, linha, null, 0, currentFile);
								   		currentScope = ms_aux;
						       			VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
										currentScope.define(vs, null, true);
										indexArrayAccess.add(currentScope.getMembers().lastIndexOf(vs));
										isLeftMemberArray = 1;
										Flags[12] = 0; //arrayAccess_flag = 0
									}
								}
							   	else{
									int t = 0;
									if (GlobalDataLDAPi.UserInput.contains(texto) == true) {
										t = 1;
									}

									//membro direito da atribuicao, por exemplo
									if (currentScope.getScopeName().equals(currentSymbolTable.getScopeName()) == false){				
						       			VariableSymbol vs = new VariableSymbol(texto, t, linha, currentFile);
						       							
										currentScope.define(vs, null, true);
										if (Flags[12] == 1){ //arrayAccess_flag = 1
											indexArrayAccess.add(currentScope.getMembers().lastIndexOf(vs));
											Flags[12] = 0; //arrayAccess_flag = 0
										}

									}
									else{
										// acesso array sem atribuicao
										if (Flags[12] == 1){ //arrayAccess_flag = 1
											VariableSymbol vs = new VariableSymbol(texto, t, linha, currentFile);
											currentScope.define(vs, null, true);
											//if (indexArrayAccess.size() == 0)
												indexArrayAccess.add(currentScope.getMembers().lastIndexOf(vs));
											isAloneMemberArray = 1;
											Flags[12] = 0; //arrayAccess_flag = 0
										}
										else{
											if (isAloneMemberArray == 1){
												VariableSymbol vs = new VariableSymbol(texto, t, linha, currentFile);
												currentScope.define(vs, null, true);
											}
										}
									}
									
									if (Flags[16] == 1){ //list_flag = 1
										CallSymbol ms_aux = new CallSymbol("list", linha, null, 0, currentFile);
								   		currentScope = ms_aux;
						       			VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
										currentScope.define(vs, null, true);
										Flags[16] = 0; //list_flag = 0					
									}
								}
							}
						    }
						  	} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// ./Ldapi.g:2143:7: UnquotedString
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					UnquotedString290=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_variable2899); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString290_tree = (CommonTree)adaptor.dupNode(UnquotedString290);


					adaptor.addChild(root_0, UnquotedString290_tree);
					}

					if ( state.backtracking==0 ) {
						  try{
						    if (Flags[15] == 0){
						     if (Flags[20] == 1 || Flags[22] == 1)
						     	instanceName = texto;

							texto=(UnquotedString290!=null?UnquotedString290.getText():null);
						   	linha=(UnquotedString290!=null?UnquotedString290.getLine():0);

							// handle with constants
							if (GlobalDataLDAPi.UserInput.contains(texto) == false){
								String texto_aux = texto.toUpperCase();
								if (texto_aux.equals(texto) == true){
									VariableSymbol vs = new VariableSymbol(texto, 0, linha, true, currentFile);
									currentScope.define(vs, null, true);	
								}
							}

						   	if (Flags[1] == 1){ //callFunction_flag = 1	   	
						     	CallSymbol ms = new CallSymbol(texto, linha, currentScope, 0, currentFile);
								ms.setIsFunction(true);
						     	currentScope.define(ms, ms, false); // def method in current scope
						     	currentScope = ms;       // set current scope to method scope
						     	
								if (Flags[20] == 1){ //createObjClass_flag = 1
									/* 1. criar instania da classe e inserir na tabela de objs do file em analise*/
									if (Flags[18] == 0 && Flags[6] == 0){ //defMethodClass_flag = 1
									 if (texto.equals("mysqli") == true)
									 	Flags[11] = 1;
									 else{
										// obter class
										mss_final = null;
										mss_final_file = "";
										int i;
										ClassTable class_table = null;
										for (Iterator <ClassTable> it = mct.values().iterator(); it.hasNext();){
											class_table = it.next();
											for (Iterator <ClassSymbol> it1 = class_table.getMembers().iterator(); it1.hasNext();){
											ClassSymbol csss = it1.next();
											}

											if (class_table.containsClass(texto) == true){
												currentClass = (ClassSymbol) class_table.getClassOfListClasses(texto);
												mss_final_file = class_table.getScopeName();
												break;
											}
										}
										if (currentClass != null && class_table.containsClass(texto) == true){
										// inserir instancia na tabela de objs do file em analise
										if ((GlobalDataLDAPi.MainInstancesTable).containsKey(currentFile) == false){
											instances_table = new InstanceTable(currentFile);
											mobjt.put(currentFile, instances_table);
										}
										else {
											instances_table = (InstanceTable) mobjt.get(currentFile);
										}

										if (currentClass.getExtendsClassName() != null && currentClass.getExtendsClassName().equals("mysqli") == true){
											Flags[11] = 1;
											currentInstance = new Instance(instanceName, linha, currentFile, texto, class_table.getScopeName(), currentClass, true);
											instances_table.define(currentInstance);
										}
										else{
										// criar instancia com copia dos atrbutos da classe
										currentInstance = new Instance(instanceName, linha, currentFile, texto, class_table.getScopeName(), currentClass, false);
										instances_table.define(currentInstance);

										/* 2. procurar metodo construtor*/
										MethodClass mc = currentClass.getMethodClass(texto, "construct", mct);
										if (mc != null){
											mss_final = mc.getMeth();
											Flags[21] = 2; //call_MethodClass_flag = 1; Se 2 entao o metodo e' construtor. Se 1 e' um metodo normal
										}
													
										}
									}
									}
									}
									Flags[20] = 0;
								}
								else{
								if (GlobalDataLDAPi.LDAPIFunctions.contains(texto) == true){
									Flags[2] = 1; //call_mysql_flag = 1;
									currentScope.getScopeSymbol().setIsTaintedFunction(true);
								}
								else{
									if (GlobalDataLDAPi.LDAPSecFunctions.contains(texto) == true){
										Flags[3] = 1; //call_mysqlsec_flag = 1;
										currentScope.getScopeSymbol().setIsSecureFunction(true);
										currentScope.getScopeSymbol().setTainted(0);
									}
									else{
										if (GlobalDataLDAPi.LDAPConnectFunctions.contains(texto) == true)
											Flags[11] = 1; //call_connectionDB_flag = 1;
										else{
											if (GlobalDataLDAPi.LDAPSelectDbFunctions.contains(texto) == true)
												Flags[13] = 1; //call_selectDB_flag = 1;
											else{
												if(texto.equals("mysqli_bind_param") == true)
													lineMysqliBindParam = linha;
												else{
													// Verifica se a funcao e' das definidas pelo programador.
													// Primeiro verifica no proprio file. Caso nao exista, ira verificar nos includes files do file em analise
													MethodTable mt;
													MethodSymbol mss = null;
													mss_final = null;
													if (currentSymbolTable.getHaveFunctions() == true){
														mt = (MethodTable) mft.get(currentFile);
											    			for(Iterator <MethodSymbol> it = mt.getMembers().iterator(); it.hasNext();){
															mss = it.next();
															if(mss.getFunctionName().equals(texto) == true){
																Flags[10] = 1; //call_UserFunction_flag = 1;
																currentScope.getScopeSymbol().setIsUserFunction(true);
																mss_final = mss;
																mss_final_file = currentFile;
																break;
															}
														}
													}
													if (mss_final == null){
														String s;
														SymbolTable st;
											    			for(Iterator <String> it = currentSymbolTable.getIncludeFiles().iterator(); it.hasNext();){
															s = it.next();
															st = (SymbolTable) mift.get(s);
															if(st.getHaveFunctions() == true){
																mt = (MethodTable) mft.get(s);
													    			for(Iterator <MethodSymbol> it1 = mt.getMembers().iterator(); it1.hasNext();){
																	mss = it1.next();
																	if(mss.getFunctionName().equals(texto) == true){
																		Flags[10] = 1; //call_UserFunction_flag = 1;
																		currentScope.getScopeSymbol().setIsUserFunction(true);
																		mss_final = mss;
																		mss_final_file = s;
																		break;
																	}
																}
															}
														}				
													}
												}
											}
										}
									}
								}
								}
								if (Flags[21] == 1) //call_MethodClass_flag = 1
									currentScope.getScopeSymbol().setIsClassMethod(true);
												
								Flags[1] = 0; //callFunction_flag = 0;
						   	}
									   	

								if (Flags[20] == 1){ //createObjClass_flag = 1
									CallSymbol ms = new CallSymbol(texto, linha, currentScope, 0, currentFile);
									ms.setIsFunction(true);
									currentScope.define(ms, ms, false); // def method in current scope
									//currentScope = ms;       // set current scope to method scope			

									/* 1. criar instania da classe e inserir na tabela de objs do file em analise*/
									if (Flags[18] == 0 && Flags[6] == 0){ //defMethodClass_flag = 1
									 if (texto.equals("mysqli") == true)
									 	Flags[11] = 1;
									 else{
										// obter class
										mss_final = null;
										mss_final_file = "";
										int i;
										ClassTable class_table = null;
										for (Iterator <ClassTable> it = mct.values().iterator(); it.hasNext();){
											class_table = it.next();
											for (Iterator <ClassSymbol> it1 = class_table.getMembers().iterator(); it1.hasNext();){
											ClassSymbol csss = it1.next();
											}
											
											
											
											if (class_table.containsClass(texto) == true){
												currentClass = (ClassSymbol) class_table.getClassOfListClasses(texto);
												mss_final_file = class_table.getScopeName();
												break;
											}
										}
										if (currentClass != null && class_table.containsClass(texto) == true){
										// inserir instancia na tabela de objs do file em analise
										if ((GlobalDataLDAPi.MainInstancesTable).containsKey(currentFile) == false){
											instances_table = new InstanceTable(currentFile);
											mobjt.put(currentFile, instances_table);
										}
										else {
											instances_table = (InstanceTable) mobjt.get(currentFile);
										}

										if (currentClass.getExtendsClassName() != null && currentClass.getExtendsClassName().equals("mysqli") == true){
											Flags[11] = 1;
											currentInstance = new Instance(instanceName, linha, currentFile, texto, class_table.getScopeName(), currentClass, true);
											instances_table.define(currentInstance);
										}
										else{
										// criar instancia com copia dos atributos da classe
										currentInstance = new Instance(instanceName, linha, currentFile, texto, class_table.getScopeName(), currentClass, false);
										instances_table.define(currentInstance);

										/* 2. procurar metodo construtor*/
										MethodClass mc = currentClass.getMethodClass(texto, "construct", mct);
										if (mc != null){
											mss_final = mc.getMeth();
											Flags[21] = 2; //call_MethodClass_flag = 1; Se 2 entao o metodo e' construtor. Se 1 e' um metodo normal
										}								
										}
									}
									}
									}
									Flags[20] = 0;
								}
						   	
						   		   	
						   	if (Flags[23] == 1 && ((Flags[12] == 1 && Flags[28] == 1) || Flags[24] == 1)){ //workOnInstance_flag arrayAccess_flag attributionOnInstance_flag	   	
						   	     if (Flags[26] == 0 )
							   	     currentScope.getScopeSymbol().setIsClassInstruction(true);
							   	
						   		if (Flags[12] == 1){
									//membro direito do acesso ao objecto e' um elemento de um array
						  			VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
									currentScope.define(vs, null, true);
									indexArrayAccess.add(currentScope.getMembers().lastIndexOf(vs));
									Flags[12] = 0; //arrayAccess_flag = 0
									Flags[28] = 0;
								}
								
						   		if (Flags[24] == 1){
						     	CallSymbol ms = new CallSymbol(texto, linha, currentScope, 0, currentFile);
						     	currentScope.define(ms, ms, false);
						     	currentScope = ms;
								Flags[24] = 0; //attributionOnInstance_flag = 0
								}
						   	}
						   	
						    }
					else Flags[1] = 0; //callFunction_flag = 0; 
						  	} catch (Exception e){
								
							}
						}
					if ( state.backtracking==0 ) {
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, variable_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class instanceMember_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instanceMember"
	// ./Ldapi.g:2390:1: instanceMember : ^( INSTANCE_MEMBER arrayOrUnquotedStringOrFunctionCall ) ;
	public final Ldapi.instanceMember_return instanceMember() throws RecognitionException {
		Ldapi.instanceMember_return retval = new Ldapi.instanceMember_return();
		retval.start = input.LT(1);
		int instanceMember_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree INSTANCE_MEMBER291=null;
		TreeRuleReturnScope arrayOrUnquotedStringOrFunctionCall292 =null;

		CommonTree INSTANCE_MEMBER291_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// ./Ldapi.g:2391:4: ( ^( INSTANCE_MEMBER arrayOrUnquotedStringOrFunctionCall ) )
			// ./Ldapi.g:2391:6: ^( INSTANCE_MEMBER arrayOrUnquotedStringOrFunctionCall )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			INSTANCE_MEMBER291=(CommonTree)match(input,INSTANCE_MEMBER,FOLLOW_INSTANCE_MEMBER_in_instanceMember2919); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			INSTANCE_MEMBER291_tree = (CommonTree)adaptor.dupNode(INSTANCE_MEMBER291);


			root_1 = (CommonTree)adaptor.becomeRoot(INSTANCE_MEMBER291_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_instanceMember2921);
			arrayOrUnquotedStringOrFunctionCall292=arrayOrUnquotedStringOrFunctionCall();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) 
			adaptor.addChild(root_1, arrayOrUnquotedStringOrFunctionCall292.getTree());

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, instanceMember_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instanceMember"


	public static class ignoreStatement_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ignoreStatement"
	// ./Ldapi.g:2394:1: ignoreStatement : PhpStatement ;
	public final Ldapi.ignoreStatement_return ignoreStatement() throws RecognitionException {
		Ldapi.ignoreStatement_return retval = new Ldapi.ignoreStatement_return();
		retval.start = input.LT(1);
		int ignoreStatement_StartIndex = input.index();

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree PhpStatement293=null;

		CommonTree PhpStatement293_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// ./Ldapi.g:2395:5: ( PhpStatement )
			// ./Ldapi.g:2395:7: PhpStatement
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			PhpStatement293=(CommonTree)match(input,PhpStatement,FOLLOW_PhpStatement_in_ignoreStatement2938); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PhpStatement293_tree = (CommonTree)adaptor.dupNode(PhpStatement293);


			adaptor.addChild(root_0, PhpStatement293_tree);
			}

			if ( state.backtracking==0 ) {
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, ignoreStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ignoreStatement"

	// $ANTLR start synpred2_Ldapi
	public final void synpred2_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:234:7: ( ignoreStatement )
		// ./Ldapi.g:234:7: ignoreStatement
		{
		pushFollow(FOLLOW_ignoreStatement_in_synpred2_Ldapi102);
		ignoreStatement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_Ldapi

	// $ANTLR start synpred26_Ldapi
	public final void synpred26_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:364:7: ( 'null' )
		// ./Ldapi.g:364:7: 'null'
		{
		match(input,120,FOLLOW_120_in_synpred26_Ldapi513); if (state.failed) return;

		}

	}
	// $ANTLR end synpred26_Ldapi

	// $ANTLR start synpred40_Ldapi
	public final void synpred40_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:526:7: ( expression )
		// ./Ldapi.g:526:7: expression
		{
		pushFollow(FOLLOW_expression_in_synpred40_Ldapi743);
		expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred40_Ldapi

	// $ANTLR start synpred41_Ldapi
	public final void synpred41_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:527:7: ( outputFunctions )
		// ./Ldapi.g:527:7: outputFunctions
		{
		pushFollow(FOLLOW_outputFunctions_in_synpred41_Ldapi752);
		outputFunctions();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred41_Ldapi

	// $ANTLR start synpred70_Ldapi
	public final void synpred70_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:917:7: ( ^( EQUALS expression simpleRequire ) )
		// ./Ldapi.g:917:7: ^( EQUALS expression simpleRequire )
		{
		match(input,EQUALS,FOLLOW_EQUALS_in_synpred70_Ldapi1466); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred70_Ldapi1468);
		expression();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_simpleRequire_in_synpred70_Ldapi1470);
		simpleRequire();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred70_Ldapi

	// $ANTLR start synpred71_Ldapi
	public final void synpred71_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:943:7: ( ^( EQUALS expression expression ) )
		// ./Ldapi.g:943:7: ^( EQUALS expression expression )
		{
		match(input,EQUALS,FOLLOW_EQUALS_in_synpred71_Ldapi1493); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred71_Ldapi1495);
		expression();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred71_Ldapi1497);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred71_Ldapi

	// $ANTLR start synpred78_Ldapi
	public final void synpred78_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:1108:7: ( ^( AMPERSAND expression expression ) )
		// ./Ldapi.g:1108:7: ^( AMPERSAND expression expression )
		{
		match(input,AMPERSAND,FOLLOW_AMPERSAND_in_synpred78_Ldapi1680); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred78_Ldapi1682);
		expression();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred78_Ldapi1684);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred78_Ldapi

	// $ANTLR start synpred83_Ldapi
	public final void synpred83_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:1152:7: ( ^( MINUS expression expression ) )
		// ./Ldapi.g:1152:7: ^( MINUS expression expression )
		{
		match(input,MINUS,FOLLOW_MINUS_in_synpred83_Ldapi1786); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred83_Ldapi1788);
		expression();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred83_Ldapi1790);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred83_Ldapi

	// $ANTLR start synpred91_Ldapi
	public final void synpred91_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:1219:7: ( ^( MINUS expression ) )
		// ./Ldapi.g:1219:7: ^( MINUS expression )
		{
		match(input,MINUS,FOLLOW_MINUS_in_synpred91_Ldapi1933); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred91_Ldapi1935);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred91_Ldapi

	// $ANTLR start synpred98_Ldapi
	public final void synpred98_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:1245:7: ( atomOrReference )
		// ./Ldapi.g:1245:7: atomOrReference
		{
		pushFollow(FOLLOW_atomOrReference_in_synpred98_Ldapi2060);
		atomOrReference();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred98_Ldapi

	// $ANTLR start synpred122_Ldapi
	public final void synpred122_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:1698:6: ( ^( EQUALS arrayAccess expression ) )
		// ./Ldapi.g:1698:6: ^( EQUALS arrayAccess expression )
		{
		match(input,EQUALS,FOLLOW_EQUALS_in_synpred122_Ldapi2622); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_arrayAccess_in_synpred122_Ldapi2624);
		arrayAccess();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred122_Ldapi2626);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred122_Ldapi

	// $ANTLR start synpred123_Ldapi
	public final void synpred123_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:1723:2: ( arrayAccess )
		// ./Ldapi.g:1723:2: arrayAccess
		{
		pushFollow(FOLLOW_arrayAccess_in_synpred123_Ldapi2642);
		arrayAccess();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred123_Ldapi

	// $ANTLR start synpred124_Ldapi
	public final void synpred124_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:1762:2: ( ^( EQUALS expression expression ) )
		// ./Ldapi.g:1762:2: ^( EQUALS expression expression )
		{
		match(input,EQUALS,FOLLOW_EQUALS_in_synpred124_Ldapi2672); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred124_Ldapi2674);
		expression();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred124_Ldapi2676);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred124_Ldapi

	// $ANTLR start synpred127_Ldapi
	public final void synpred127_Ldapi_fragment() throws RecognitionException {
		// ./Ldapi.g:1814:7: ( ^( INSTANCE_MEMBER objectNameOrMethod arrayOrUnquotedStringOrFunctionCall ) )
		// ./Ldapi.g:1814:7: ^( INSTANCE_MEMBER objectNameOrMethod arrayOrUnquotedStringOrFunctionCall )
		{
		match(input,INSTANCE_MEMBER,FOLLOW_INSTANCE_MEMBER_in_synpred127_Ldapi2738); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_objectNameOrMethod_in_synpred127_Ldapi2740);
		objectNameOrMethod();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_synpred127_Ldapi2742);
		arrayOrUnquotedStringOrFunctionCall();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred127_Ldapi

	// Delegated rules

	public final boolean synpred91_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred91_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred123_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred123_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred78_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred78_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred71_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred26_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred26_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred122_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred122_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred40_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred40_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred41_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred41_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred127_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred127_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred83_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred83_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred70_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred70_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred124_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred124_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred98_Ldapi() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred98_Ldapi_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA3 dfa3 = new DFA3(this);
	protected DFA2 dfa2 = new DFA2(this);
	protected DFA10 dfa10 = new DFA10(this);
	protected DFA22 dfa22 = new DFA22(this);
	protected DFA28 dfa28 = new DFA28(this);
	protected DFA29 dfa29 = new DFA29(this);
	protected DFA31 dfa31 = new DFA31(this);
	protected DFA41 dfa41 = new DFA41(this);
	protected DFA55 dfa55 = new DFA55(this);
	static final String DFA1_eotS =
		"\104\uffff";
	static final String DFA1_eofS =
		"\1\1\103\uffff";
	static final String DFA1_minS =
		"\1\5\103\uffff";
	static final String DFA1_maxS =
		"\1\173\103\uffff";
	static final String DFA1_acceptS =
		"\1\uffff\1\2\1\1\101\uffff";
	static final String DFA1_specialS =
		"\104\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff\3\2\10\uffff"+
			"\3\2\1\uffff\1\2\1\uffff\3\2\2\uffff\2\2\2\uffff\2\2\3\uffff\4\2\3\uffff"+
			"\1\2\1\uffff\1\2\2\uffff\4\2\6\uffff\4\2\1\uffff\1\2\2\uffff\1\2\3\uffff"+
			"\1\2\1\uffff\5\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff\2\2\2\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\4\2\2\uffff\2\2\1\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 230:7: ( statement )*";
		}
	}

	static final String DFA3_eotS =
		"\u008a\uffff";
	static final String DFA3_eofS =
		"\u008a\uffff";
	static final String DFA3_minS =
		"\1\5\1\0\u0088\uffff";
	static final String DFA3_maxS =
		"\1\173\1\0\u0088\uffff";
	static final String DFA3_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\5\7\uffff\1\6\173\uffff\1\1";
	static final String DFA3_specialS =
		"\1\uffff\1\0\u0088\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\15\1\uffff\1\15\1\uffff\2\15\1\uffff\2\15\1\uffff\1\3\1\2\1\15\2\uffff"+
			"\1\4\2\15\10\uffff\3\15\1\uffff\1\15\1\uffff\1\5\2\15\2\uffff\2\15\2"+
			"\uffff\2\15\3\uffff\1\5\1\15\2\5\3\uffff\1\15\1\uffff\1\15\2\uffff\1"+
			"\5\3\15\6\uffff\4\15\1\uffff\1\15\2\uffff\1\15\3\uffff\1\15\1\uffff\5"+
			"\15\1\uffff\1\1\2\15\1\uffff\3\15\1\uffff\1\15\1\5\2\15\1\uffff\1\15"+
			"\1\5\2\uffff\1\15\1\uffff\1\5\1\uffff\4\15\2\uffff\2\15\1\uffff\1\15",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "232:1: statement : ( ignoreStatement | BodyString | ^( Block ( statement )* ) | classDefinition | complexStatement | simpleStatement );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA3_1 = input.LA(1);
						 
						int index3_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Ldapi()) ) {s = 137;}
						else if ( (true) ) {s = 13;}
						 
						input.seek(index3_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 3, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA2_eotS =
		"\104\uffff";
	static final String DFA2_eofS =
		"\104\uffff";
	static final String DFA2_minS =
		"\1\3\103\uffff";
	static final String DFA2_maxS =
		"\1\173\103\uffff";
	static final String DFA2_acceptS =
		"\1\uffff\1\2\1\1\101\uffff";
	static final String DFA2_specialS =
		"\104\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff"+
			"\3\2\10\uffff\3\2\1\uffff\1\2\1\uffff\3\2\2\uffff\2\2\2\uffff\2\2\3\uffff"+
			"\4\2\3\uffff\1\2\1\uffff\1\2\2\uffff\4\2\6\uffff\4\2\1\uffff\1\2\2\uffff"+
			"\1\2\3\uffff\1\2\1\uffff\5\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff"+
			"\2\2\2\uffff\1\2\1\uffff\1\2\1\uffff\4\2\2\uffff\2\2\1\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 236:15: ( statement )*";
		}
	}

	static final String DFA10_eotS =
		"\104\uffff";
	static final String DFA10_eofS =
		"\104\uffff";
	static final String DFA10_minS =
		"\1\3\103\uffff";
	static final String DFA10_maxS =
		"\1\173\103\uffff";
	static final String DFA10_acceptS =
		"\1\uffff\1\2\1\1\101\uffff";
	static final String DFA10_specialS =
		"\104\uffff}>";
	static final String[] DFA10_transitionS = {
			"\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff"+
			"\3\2\10\uffff\3\2\1\uffff\1\2\1\uffff\3\2\2\uffff\2\2\2\uffff\2\2\3\uffff"+
			"\4\2\3\uffff\1\2\1\uffff\1\2\2\uffff\4\2\6\uffff\4\2\1\uffff\1\2\2\uffff"+
			"\1\2\3\uffff\1\2\1\uffff\5\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff"+
			"\2\2\2\uffff\1\2\1\uffff\1\2\1\uffff\4\2\2\uffff\2\2\1\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 308:87: ( statement )*";
		}
	}

	static final String DFA22_eotS =
		"\75\uffff";
	static final String DFA22_eofS =
		"\75\uffff";
	static final String DFA22_minS =
		"\1\5\62\uffff\4\2\1\uffff\4\0\1\uffff";
	static final String DFA22_maxS =
		"\1\173\62\uffff\4\2\1\uffff\4\0\1\uffff";
	static final String DFA22_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\62\uffff\1\6\4\uffff\1\5";
	static final String DFA22_specialS =
		"\70\uffff\1\0\1\1\1\2\1\3\1\uffff}>";
	static final String[] DFA22_transitionS = {
			"\1\4\1\uffff\1\4\1\uffff\2\4\1\uffff\2\4\3\uffff\1\4\3\uffff\2\4\10\uffff"+
			"\3\4\1\uffff\1\66\2\uffff\2\4\2\uffff\1\4\1\63\2\uffff\2\4\4\uffff\1"+
			"\4\5\uffff\1\1\1\uffff\1\4\3\uffff\3\4\6\uffff\4\4\1\uffff\1\4\2\uffff"+
			"\1\4\3\uffff\1\4\1\uffff\3\4\1\64\1\65\1\uffff\1\67\2\4\1\uffff\1\2\1"+
			"\4\1\3\1\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\1\4\3\uffff\4\4\2"+
			"\uffff\2\4\1\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "441:1: simpleStatement : ( ^( GLOBAL ( name )+ ) | ^( RETURN ( expression )? ) | simpleRequire | expression | outputFunctions | ignoreOthers );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA22_56 = input.LA(1);
						 
						int index22_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred40_Ldapi()) ) {s = 4;}
						else if ( (synpred41_Ldapi()) ) {s = 60;}
						 
						input.seek(index22_56);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA22_57 = input.LA(1);
						 
						int index22_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred40_Ldapi()) ) {s = 4;}
						else if ( (synpred41_Ldapi()) ) {s = 60;}
						 
						input.seek(index22_57);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA22_58 = input.LA(1);
						 
						int index22_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred40_Ldapi()) ) {s = 4;}
						else if ( (synpred41_Ldapi()) ) {s = 60;}
						 
						input.seek(index22_58);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA22_59 = input.LA(1);
						 
						int index22_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred40_Ldapi()) ) {s = 4;}
						else if ( (synpred41_Ldapi()) ) {s = 60;}
						 
						input.seek(index22_59);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 22, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA28_eotS =
		"\104\uffff";
	static final String DFA28_eofS =
		"\104\uffff";
	static final String DFA28_minS =
		"\1\3\103\uffff";
	static final String DFA28_maxS =
		"\1\173\103\uffff";
	static final String DFA28_acceptS =
		"\1\uffff\1\2\1\1\101\uffff";
	static final String DFA28_specialS =
		"\104\uffff}>";
	static final String[] DFA28_transitionS = {
			"\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff"+
			"\3\2\10\uffff\3\2\1\uffff\1\2\1\uffff\3\2\2\uffff\2\2\2\uffff\2\2\3\uffff"+
			"\4\2\3\uffff\1\2\1\uffff\1\2\2\uffff\4\2\6\uffff\4\2\1\uffff\1\2\2\uffff"+
			"\1\2\3\uffff\1\2\1\uffff\5\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff"+
			"\2\2\2\uffff\1\2\1\uffff\1\2\1\uffff\4\2\2\uffff\2\2\1\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
	static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
	static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
	static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
	static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
	static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
	static final short[][] DFA28_transition;

	static {
		int numStates = DFA28_transitionS.length;
		DFA28_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
		}
	}

	protected class DFA28 extends DFA {

		public DFA28(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 28;
			this.eot = DFA28_eot;
			this.eof = DFA28_eof;
			this.min = DFA28_min;
			this.max = DFA28_max;
			this.accept = DFA28_accept;
			this.special = DFA28_special;
			this.transition = DFA28_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 688:24: ( statement )*";
		}
	}

	static final String DFA29_eotS =
		"\104\uffff";
	static final String DFA29_eofS =
		"\104\uffff";
	static final String DFA29_minS =
		"\1\3\103\uffff";
	static final String DFA29_maxS =
		"\1\173\103\uffff";
	static final String DFA29_acceptS =
		"\1\uffff\1\2\1\1\101\uffff";
	static final String DFA29_specialS =
		"\104\uffff}>";
	static final String[] DFA29_transitionS = {
			"\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff"+
			"\3\2\10\uffff\3\2\1\uffff\1\2\1\uffff\3\2\2\uffff\2\2\2\uffff\2\2\3\uffff"+
			"\4\2\3\uffff\1\2\1\uffff\1\2\2\uffff\4\2\6\uffff\4\2\1\uffff\1\2\2\uffff"+
			"\1\2\3\uffff\1\2\1\uffff\5\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff"+
			"\2\2\2\uffff\1\2\1\uffff\1\2\1\uffff\4\2\2\uffff\2\2\1\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 692:17: ( statement )*";
		}
	}

	static final String DFA31_eotS =
		"\104\uffff";
	static final String DFA31_eofS =
		"\104\uffff";
	static final String DFA31_minS =
		"\1\3\103\uffff";
	static final String DFA31_maxS =
		"\1\173\103\uffff";
	static final String DFA31_acceptS =
		"\1\uffff\1\2\1\1\101\uffff";
	static final String DFA31_specialS =
		"\104\uffff}>";
	static final String[] DFA31_transitionS = {
			"\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff"+
			"\3\2\10\uffff\3\2\1\uffff\1\2\1\uffff\3\2\2\uffff\2\2\2\uffff\2\2\3\uffff"+
			"\4\2\3\uffff\1\2\1\uffff\1\2\2\uffff\4\2\6\uffff\4\2\1\uffff\1\2\2\uffff"+
			"\1\2\3\uffff\1\2\1\uffff\5\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff"+
			"\2\2\2\uffff\1\2\1\uffff\1\2\1\uffff\4\2\2\uffff\2\2\1\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 696:61: ( statement )*";
		}
	}

	static final String DFA41_eotS =
		"\74\uffff";
	static final String DFA41_eofS =
		"\74\uffff";
	static final String DFA41_minS =
		"\1\5\6\uffff\1\2\6\uffff\1\2\4\uffff\1\2\40\uffff\3\0\5\uffff";
	static final String DFA41_maxS =
		"\1\173\6\uffff\1\2\6\uffff\1\2\4\uffff\1\2\40\uffff\3\0\5\uffff";
	static final String DFA41_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
		"\1\uffff\1\20\1\21\1\22\1\23\1\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
		"\1\35\1\36\1\37\1\40\1\41\1\42\1\43\16\uffff\1\44\6\uffff\1\7\1\10\1\17"+
		"\1\24\1\34";
	static final String DFA41_specialS =
		"\64\uffff\1\0\1\1\1\2\5\uffff}>";
	static final String[] DFA41_transitionS = {
			"\1\16\1\uffff\1\25\1\uffff\2\41\1\uffff\1\11\1\30\3\uffff\1\41\3\uffff"+
			"\1\41\1\40\10\uffff\1\34\1\20\1\10\1\uffff\1\60\2\uffff\1\41\1\24\2\uffff"+
			"\1\41\1\60\2\uffff\1\7\1\17\4\uffff\1\26\7\uffff\1\41\3\uffff\1\41\1"+
			"\31\1\12\6\uffff\1\41\1\14\1\13\1\41\1\uffff\1\23\2\uffff\1\37\3\uffff"+
			"\1\41\1\uffff\1\27\1\15\1\22\2\60\2\uffff\1\36\1\35\2\uffff\1\41\2\uffff"+
			"\1\33\1\uffff\1\21\1\41\1\uffff\1\32\3\uffff\1\41\3\uffff\1\6\1\2\1\4"+
			"\1\5\2\uffff\1\41\1\1\1\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\64",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\65",
			"",
			"",
			"",
			"",
			"\1\66",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
	static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
	static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
	static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
	static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
	static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
	static final short[][] DFA41_transition;

	static {
		int numStates = DFA41_transitionS.length;
		DFA41_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
		}
	}

	protected class DFA41 extends DFA {

		public DFA41(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 41;
			this.eot = DFA41_eot;
			this.eof = DFA41_eof;
			this.min = DFA41_min;
			this.max = DFA41_max;
			this.accept = DFA41_accept;
			this.special = DFA41_special;
			this.transition = DFA41_transition;
		}
		@Override
		public String getDescription() {
			return "831:1: expression : ( ^( 'or' expression expression ) | ^( 'OR' expression expression ) | ^( 'xor' expression expression ) | ^( 'XOR' expression expression ) | ^( 'and' expression expression ) | ^( 'AND' expression expression ) | ^( EQUALS expression simpleRequire ) | ^( EQUALS expression expression ) | ^( ConcatAssigmentOperator expression expression ) | ^( AssignmentOperator expression expression ) | ^( IfExpression expression expression expression ) | ^( LOGICAL_OR expression expression ) | ^( LOGICAL_AND expression expression ) | ^( PIPE expression expression ) | ^( AMPERSAND expression expression ) | ^( EqualityOperator expression expression ) | ^( ComparisionOperator expression expression ) | ^( ShiftOperator expression expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( DOT expression expression ) | ^( ASTERISK expression expression ) | ^( FORWARD_SLASH expression expression ) | ^( PERCENT expression expression ) | ^( BANG expression ) | ^( INSTANCE_OF expression expression ) | ^( TILDE expression ) | ^( MINUS expression ) | ^( SUPPRESS_WARNINGS expression ) | ^( Cast UnquotedString expression ) | ^( Prefix IncrementOperator name ) | ^( Postfix IncrementOperator name ) | ^( NEW nameOrFunctionCall ) | ^( CLONE name ) | atomOrReference | outputFunctions );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA41_52 = input.LA(1);
						 
						int index41_52 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred70_Ldapi()) ) {s = 55;}
						else if ( (synpred71_Ldapi()) ) {s = 56;}
						 
						input.seek(index41_52);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA41_53 = input.LA(1);
						 
						int index41_53 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred78_Ldapi()) ) {s = 57;}
						else if ( (synpred98_Ldapi()) ) {s = 33;}
						 
						input.seek(index41_53);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA41_54 = input.LA(1);
						 
						int index41_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_Ldapi()) ) {s = 58;}
						else if ( (synpred91_Ldapi()) ) {s = 59;}
						 
						input.seek(index41_54);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 41, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA55_eotS =
		"\114\uffff";
	static final String DFA55_eofS =
		"\1\2\113\uffff";
	static final String DFA55_minS =
		"\1\3\1\2\112\uffff";
	static final String DFA55_maxS =
		"\1\173\1\156\112\uffff";
	static final String DFA55_acceptS =
		"\2\uffff\1\2\107\uffff\1\1\1\uffff";
	static final String DFA55_specialS =
		"\114\uffff}>";
	static final String[] DFA55_transitionS = {
			"\1\2\1\uffff\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\10\2\10\uffff\5\2\1"+
			"\uffff\3\2\2\uffff\3\2\1\uffff\2\2\3\uffff\4\2\3\uffff\1\2\1\uffff\1"+
			"\2\2\uffff\1\2\1\1\2\2\6\uffff\4\2\1\uffff\1\2\2\uffff\1\2\3\uffff\1"+
			"\2\1\uffff\5\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff\2\2\2\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\4\2\2\uffff\2\2\1\uffff\1\2",
			"\1\2\153\uffff\1\112",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
	static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
	static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
	static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
	static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
	static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
	static final short[][] DFA55_transition;

	static {
		int numStates = DFA55_transitionS.length;
		DFA55_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
		}
	}

	protected class DFA55 extends DFA {

		public DFA55(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 55;
			this.eot = DFA55_eot;
			this.eof = DFA55_eof;
			this.min = DFA55_min;
			this.max = DFA55_max;
			this.accept = DFA55_accept;
			this.special = DFA55_special;
			this.transition = DFA55_transition;
		}
		@Override
		public String getDescription() {
			return "1638:36: ( INSTANCE_MEMBER UnquotedString )?";
		}
	}

	public static final BitSet FOLLOW_statement_in_prog85 = new BitSet(new long[]{0x9478CCEB8073B6A2L,0x0B3D4DEEEFA25E07L});
	public static final BitSet FOLLOW_ignoreStatement_in_statement102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BodyString_in_statement110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Block_in_statement121 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_statement123 = new BitSet(new long[]{0x9478CCEB8073B6A8L,0x0B3D4DEEEFA25E07L});
	public static final BitSet FOLLOW_classDefinition_in_statement133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_complexStatement_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleStatement_in_statement149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classDefinition179 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Modifiers_in_classDefinition182 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_classModifier_in_classDefinition184 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_className_in_classDefinition188 = new BitSet(new long[]{0x0084000020000008L,0x0000800020008000L});
	public static final BitSet FOLLOW_extendsclass_in_classDefinition190 = new BitSet(new long[]{0x0080000020000008L,0x0000800020008000L});
	public static final BitSet FOLLOW_classImplements_in_classDefinition193 = new BitSet(new long[]{0x0080000020000008L,0x0000800000008000L});
	public static final BitSet FOLLOW_classMember_in_classDefinition196 = new BitSet(new long[]{0x0080000020000008L,0x0000800000008000L});
	public static final BitSet FOLLOW_UnquotedString_in_className215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsclass242 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UnquotedString_in_extendsclass244 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ignoreStatement_in_classImplements275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Method_in_classMember299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Modifiers_in_classMember302 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fieldModifier_in_classMember304 = new BitSet(new long[]{0x0000000000000118L,0x0440000000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_classMember308 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_Params_in_classMember311 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_paramDef_in_classMember313 = new BitSet(new long[]{0x0000404000000828L,0x0000400000000000L});
	public static final BitSet FOLLOW_Block_in_classMember319 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_classMember321 = new BitSet(new long[]{0x9478CCEB8073B6A8L,0x0B3D4DEEEFA25E07L});
	public static final BitSet FOLLOW_definitionAttribute_in_classMember337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_definitionAttribute371 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOLLAR_in_definitionAttribute374 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UnquotedString_in_definitionAttribute376 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_value_in_definitionAttribute379 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONST_in_definitionAttribute398 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UnquotedString_in_definitionAttribute400 = new BitSet(new long[]{0x1000040000020408L,0x0100410400001200L});
	public static final BitSet FOLLOW_value_in_definitionAttribute402 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Field_in_definitionAttribute421 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Modifiers_in_definitionAttribute424 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fieldModifier_in_definitionAttribute426 = new BitSet(new long[]{0x0000000000000118L,0x0440000000000000L});
	public static final BitSet FOLLOW_DOLLAR_in_definitionAttribute431 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UnquotedString_in_definitionAttribute433 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_value_in_definitionAttribute436 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ABSTRACT_in_classModifier463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_120_in_value513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UnquotedString_in_value526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_value538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_complexStatement555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_complexStatement569 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_forHeader_in_complexStatement571 = new BitSet(new long[]{0x9478CCEB8073B6A0L,0x0B3D4DEEEFA25E07L});
	public static final BitSet FOLLOW_statement_in_complexStatement573 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOR_EACH_in_complexStatement583 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_forHeader_in_complexStatement585 = new BitSet(new long[]{0x9478CCEB8073B6A0L,0x0B3D4DEEEFA25E07L});
	public static final BitSet FOLLOW_statement_in_complexStatement587 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_complexStatement597 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_whileCondition_in_complexStatement599 = new BitSet(new long[]{0x9478CCEB8073B6A0L,0x0B3D4DEEEFA25E07L});
	public static final BitSet FOLLOW_statement_in_complexStatement601 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DO_in_complexStatement611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_complexStatement613 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_whileCondition_in_complexStatement615 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWITCH_in_complexStatement625 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_complexStatement627 = new BitSet(new long[]{0x0000000400040008L});
	public static final BitSet FOLLOW_cases_in_complexStatement629 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_functionDefinition_in_complexStatement641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRY_in_complexStatement648 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_complexStatement650 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_catchStatement_in_complexStatement652 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CATCH_in_catchStatement668 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_whileCondition_in_catchStatement670 = new BitSet(new long[]{0x9478CCEB8073B6A0L,0x0B3D4DEEEFA25E07L});
	public static final BitSet FOLLOW_statement_in_catchStatement672 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GLOBAL_in_simpleStatement696 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_name_in_simpleStatement698 = new BitSet(new long[]{0x0000004000200008L,0x0000400000200001L});
	public static final BitSet FOLLOW_RETURN_in_simpleStatement718 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_simpleStatement720 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_simpleRequire_in_simpleStatement735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_simpleStatement743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outputFunctions_in_simpleStatement752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ignoreOthers_in_simpleStatement760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RequireOperator_in_simpleRequire786 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_simpleRequire788 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement831 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStatement833 = new BitSet(new long[]{0x9478CCEB8073B6A0L,0x0B3D4DEEEFA25E07L});
	public static final BitSet FOLLOW_statement_in_ifStatement835 = new BitSet(new long[]{0x8000100000000008L});
	public static final BitSet FOLLOW_conditional_in_ifStatement837 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_conditional868 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_conditional870 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_conditional889 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_conditional891 = new BitSet(new long[]{0x9478CCEB8073B6A0L,0x0B3D4DEEEFA25E07L});
	public static final BitSet FOLLOW_statement_in_conditional893 = new BitSet(new long[]{0x8000100000000008L});
	public static final BitSet FOLLOW_conditional_in_conditional895 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ignoreStatement_in_forHeader922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ignoreStatement_in_whileCondition939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ignoreStatement_in_ignoreOthers956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_casestatement_in_cases974 = new BitSet(new long[]{0x0000000400040002L});
	public static final BitSet FOLLOW_defaultcase_in_cases977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_casestatement1003 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_casestatement1005 = new BitSet(new long[]{0x9478CCEB8073B6A8L,0x0B3D4DEEEFA25E07L});
	public static final BitSet FOLLOW_statement_in_casestatement1007 = new BitSet(new long[]{0x9478CCEB8073B6A8L,0x0B3D4DEEEFA25E07L});
	public static final BitSet FOLLOW_DEFAULT_in_defaultcase1028 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_defaultcase1030 = new BitSet(new long[]{0x9478CCEB8073B6A8L,0x0B3D4DEEEFA25E07L});
	public static final BitSet FOLLOW_FUNCTION_in_functionDefinition1051 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UnquotedString_in_functionDefinition1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_Params_in_functionDefinition1056 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_paramDef_in_functionDefinition1058 = new BitSet(new long[]{0x0000404000000828L,0x0000400000000000L});
	public static final BitSet FOLLOW_Block_in_functionDefinition1063 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_functionDefinition1065 = new BitSet(new long[]{0x9478CCEB8073B6A8L,0x0B3D4DEEEFA25E07L});
	public static final BitSet FOLLOW_EQUALS_in_paramDef1099 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_paramName_in_paramDef1110 = new BitSet(new long[]{0x1000044000220620L,0x0100410400201201L});
	public static final BitSet FOLLOW_atomOrReference_in_paramDef1112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_paramName_in_paramDef1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOLLAR_in_paramName1156 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UnquotedString_in_paramName1158 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AMPERSAND_in_paramName1171 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOLLAR_in_paramName1174 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UnquotedString_in_paramName1176 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ECHO_in_outputFunctions1218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_outputFunctions1220 = new BitSet(new long[]{0x1010CCCB806236A8L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_PRINT_in_outputFunctions1245 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_outputFunctions1247 = new BitSet(new long[]{0x1010CCCB806236A8L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_PRINTF_in_outputFunctions1272 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_outputFunctions1274 = new BitSet(new long[]{0x1010CCCB806236A8L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_DIE_in_outputFunctions1299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_outputFunctions1301 = new BitSet(new long[]{0x1010CCCB806236A8L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_121_in_expression1332 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1334 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1336 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_115_in_expression1355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1357 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1359 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_123_in_expression1378 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1380 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1382 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_116_in_expression1399 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1401 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1403 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_117_in_expression1423 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1425 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1427 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_114_in_expression1444 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1446 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1448 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_expression1466 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1468 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_simpleRequire_in_expression1470 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_expression1493 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1495 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1497 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ConcatAssigmentOperator_in_expression1526 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1528 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1530 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AssignmentOperator_in_expression1544 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1546 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1548 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IfExpression_in_expression1571 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1573 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1575 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1577 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOGICAL_OR_in_expression1601 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1603 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1605 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOGICAL_AND_in_expression1626 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1628 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1630 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PIPE_in_expression1653 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1655 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1657 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AMPERSAND_in_expression1680 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1682 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1684 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EqualityOperator_in_expression1705 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1707 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1709 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ComparisionOperator_in_expression1729 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1731 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1733 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ShiftOperator_in_expression1756 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1758 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1760 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expression1772 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1774 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1776 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression1786 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1788 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1790 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_expression1804 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1806 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1808 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASTERISK_in_expression1822 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1824 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1826 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FORWARD_SLASH_in_expression1836 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1838 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1840 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PERCENT_in_expression1850 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1852 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1854 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BANG_in_expression1864 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1866 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INSTANCE_OF_in_expression1892 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1894 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1896 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TILDE_in_expression1908 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1910 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression1933 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1935 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SUPPRESS_WARNINGS_in_expression1947 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1949 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Cast_in_expression1959 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UnquotedString_in_expression1961 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_expression1963 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Prefix_in_expression1979 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IncrementOperator_in_expression1981 = new BitSet(new long[]{0x0000004000200000L,0x0000400000200001L});
	public static final BitSet FOLLOW_name_in_expression1983 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Postfix_in_expression1997 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IncrementOperator_in_expression1999 = new BitSet(new long[]{0x0000004000200000L,0x0000400000200001L});
	public static final BitSet FOLLOW_name_in_expression2001 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEW_in_expression2018 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameOrFunctionCall_in_expression2020 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLONE_in_expression2040 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_name_in_expression2042 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atomOrReference_in_expression2060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outputFunctions_in_expression2068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_atomOrReference2086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_in_atomOrReference2094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Array_in_arrayDeclaration2118 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration2120 = new BitSet(new long[]{0x1010CCCB806236E8L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_keyValuePair_in_arrayEntry2148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayEntry2156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_ASSIGN_in_keyValuePair2175 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_keyValuePair2177 = new BitSet(new long[]{0x1010CCCB806236A8L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_List_in_listDefinition2210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomOrReference_in_listDefinition2212 = new BitSet(new long[]{0x1000444000220628L,0x0100410400201201L});
	public static final BitSet FOLLOW_EQUALS_in_listDefinition2217 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_listEntry_in_listDefinition2219 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_listEntry2256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ListAssign_in_listEntry2265 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_listEntry2267 = new BitSet(new long[]{0x1010CCCB806236A8L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_SingleQuotedString_in_atom2286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DoubleQuotedString_in_atom2297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_in_atom2309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Real_in_atom2320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Boolean_in_atom2331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_120_in_atom2342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HereDoc_in_atom2354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayDeclaration_in_atom2358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listDefinition_in_atom2362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AMPERSAND_in_reference2380 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameOrFunctionCall_in_reference2382 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_nameOrFunctionCall_in_reference2391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Apply_in_nameOrFunctionCall2410 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_name_in_nameOrFunctionCall2412 = new BitSet(new long[]{0x1010CCCB806236A8L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_nameOrFunctionCall2414 = new BitSet(new long[]{0x1010CCCB806236A8L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_name_in_nameOrFunctionCall2428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticMemberAccess_in_name2445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccess_in_name2453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_name2461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_MEMBER_in_staticMemberAccess2495 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UnquotedString_in_staticMemberAccess2497 = new BitSet(new long[]{0x0000004000200200L,0x0000400000200001L});
	public static final BitSet FOLLOW_nameOrFunctionCall_in_staticMemberAccess2499 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayAccess_in_memberAccess2528 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_INSTANCE_MEMBER_in_memberAccess2531 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_memberAccess2533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTANCE_MEMBER_in_memberAccess2567 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_memberAccess2569 = new BitSet(new long[]{0x0000404200201200L,0x0000400000200001L});
	public static final BitSet FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_memberAccess2571 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_arrayOrUnquotedStringOrFunctionCall2622 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayAccess_in_arrayOrUnquotedStringOrFunctionCall2624 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2626 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayAccess_in_arrayOrUnquotedStringOrFunctionCall2642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_arrayOrUnquotedStringOrFunctionCall2672 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2674 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2676 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AssignmentOperator_in_arrayOrUnquotedStringOrFunctionCall2701 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2703 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2705 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ConcatAssigmentOperator_in_arrayOrUnquotedStringOrFunctionCall2720 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2722 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2724 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INSTANCE_MEMBER_in_arrayOrUnquotedStringOrFunctionCall2738 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_objectNameOrMethod_in_arrayOrUnquotedStringOrFunctionCall2740 = new BitSet(new long[]{0x0000404200201200L,0x0000400000200001L});
	public static final BitSet FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_arrayOrUnquotedStringOrFunctionCall2742 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_nameOrFunctionCall_in_arrayOrUnquotedStringOrFunctionCall2779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nameOrFunctionCall_in_objectNameOrMethod2828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_SQUARE_BRACE_in_arrayAccess2853 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_arrayAccess2855 = new BitSet(new long[]{0x1010CCCB806236A8L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_arrayAccess2857 = new BitSet(new long[]{0x1010CCCB806236A8L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_DOLLAR_in_variable2881 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_variable2883 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UnquotedString_in_variable2899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTANCE_MEMBER_in_instanceMember2919 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_instanceMember2921 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PhpStatement_in_ignoreStatement2938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ignoreStatement_in_synpred2_Ldapi102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_120_in_synpred26_Ldapi513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred40_Ldapi743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outputFunctions_in_synpred41_Ldapi752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_synpred70_Ldapi1466 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_synpred70_Ldapi1468 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_simpleRequire_in_synpred70_Ldapi1470 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_synpred71_Ldapi1493 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_synpred71_Ldapi1495 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_synpred71_Ldapi1497 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AMPERSAND_in_synpred78_Ldapi1680 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_synpred78_Ldapi1682 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_synpred78_Ldapi1684 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_synpred83_Ldapi1786 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_synpred83_Ldapi1788 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_synpred83_Ldapi1790 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_synpred91_Ldapi1933 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_synpred91_Ldapi1935 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atomOrReference_in_synpred98_Ldapi2060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_synpred122_Ldapi2622 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayAccess_in_synpred122_Ldapi2624 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_synpred122_Ldapi2626 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayAccess_in_synpred123_Ldapi2642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_synpred124_Ldapi2672 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_synpred124_Ldapi2674 = new BitSet(new long[]{0x1010CCCB806236A0L,0x0B3C45A4CFA25E07L});
	public static final BitSet FOLLOW_expression_in_synpred124_Ldapi2676 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INSTANCE_MEMBER_in_synpred127_Ldapi2738 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_objectNameOrMethod_in_synpred127_Ldapi2740 = new BitSet(new long[]{0x0000404200201200L,0x0000400000200001L});
	public static final BitSet FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_synpred127_Ldapi2742 = new BitSet(new long[]{0x0000000000000008L});
}
