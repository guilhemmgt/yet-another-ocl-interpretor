package fr.enseeiht.ocl.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.enseeiht.ocl.xtext.services.OclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOclParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'as'", "'context'", "'!'", "'def'", "':'", "'='", "'('", "','", "')'", "'inv'", "'and'", "'or'", "'xor'", "'implies'", "'equivalent'", "'<>'", "'>'", "'<'", "'>='", "'<='", "'-'", "'+'", "'div'", "'mod'", "'*'", "'/'", "'not'", "'self'", "'Bag'", "'{'", "'}'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Map'", "'#'", "'let'", "'in'", "'if'", "'then'", "'else'", "'endif'", "'true'", "'false'", "'.'", "'->'", "'iterate'", "';'", "'|'", "'String'", "'Boolean'", "'Integer'", "'Real'", "'OclAny'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalOclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOclParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOcl.g"; }



     	private OclGrammarAccess grammarAccess;

        public InternalOclParser(TokenStream input, OclGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Module";
       	}

       	@Override
       	protected OclGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModule"
    // InternalOcl.g:64:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalOcl.g:64:47: (iv_ruleModule= ruleModule EOF )
            // InternalOcl.g:65:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalOcl.g:71:1: ruleModule returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_elements_1_0= ruleOclFeatureDefinition ) )* ( (lv_elements_2_0= ruleOclModuleElement ) )+ ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_elements_1_0= ruleOclFeatureDefinition ) )* ( (lv_elements_2_0= ruleOclModuleElement ) )+ ) )
            // InternalOcl.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_elements_1_0= ruleOclFeatureDefinition ) )* ( (lv_elements_2_0= ruleOclModuleElement ) )+ )
            {
            // InternalOcl.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_elements_1_0= ruleOclFeatureDefinition ) )* ( (lv_elements_2_0= ruleOclModuleElement ) )+ )
            // InternalOcl.g:79:3: ( (lv_imports_0_0= ruleImport ) )+ ( (lv_elements_1_0= ruleOclFeatureDefinition ) )* ( (lv_elements_2_0= ruleOclModuleElement ) )+
            {
            // InternalOcl.g:79:3: ( (lv_imports_0_0= ruleImport ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOcl.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalOcl.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalOcl.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"fr.enseeiht.ocl.xtext.Ocl.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalOcl.g:98:3: ( (lv_elements_1_0= ruleOclFeatureDefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOcl.g:99:4: (lv_elements_1_0= ruleOclFeatureDefinition )
            	    {
            	    // InternalOcl.g:99:4: (lv_elements_1_0= ruleOclFeatureDefinition )
            	    // InternalOcl.g:100:5: lv_elements_1_0= ruleOclFeatureDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getElementsOclFeatureDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_1_0=ruleOclFeatureDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"fr.enseeiht.ocl.xtext.Ocl.OclFeatureDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalOcl.g:117:3: ( (lv_elements_2_0= ruleOclModuleElement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOcl.g:118:4: (lv_elements_2_0= ruleOclModuleElement )
            	    {
            	    // InternalOcl.g:118:4: (lv_elements_2_0= ruleOclModuleElement )
            	    // InternalOcl.g:119:5: lv_elements_2_0= ruleOclModuleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getElementsOclModuleElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_2_0=ruleOclModuleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"fr.enseeiht.ocl.xtext.Ocl.OclModuleElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleImport"
    // InternalOcl.g:140:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalOcl.g:140:47: (iv_ruleImport= ruleImport EOF )
            // InternalOcl.g:141:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalOcl.g:147:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalOcl.g:153:2: ( (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalOcl.g:154:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalOcl.g:154:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalOcl.g:155:3: otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalOcl.g:159:3: ( (otherlv_1= RULE_STRING ) )
            // InternalOcl.g:160:4: (otherlv_1= RULE_STRING )
            {
            // InternalOcl.g:160:4: (otherlv_1= RULE_STRING )
            // InternalOcl.g:161:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getImportAccess().getPackageEPackageCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getAsKeyword_2());
            		
            // InternalOcl.g:176:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalOcl.g:177:4: (lv_name_3_0= RULE_ID )
            {
            // InternalOcl.g:177:4: (lv_name_3_0= RULE_ID )
            // InternalOcl.g:178:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleOclModuleElement"
    // InternalOcl.g:198:1: entryRuleOclModuleElement returns [EObject current=null] : iv_ruleOclModuleElement= ruleOclModuleElement EOF ;
    public final EObject entryRuleOclModuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclModuleElement = null;


        try {
            // InternalOcl.g:198:57: (iv_ruleOclModuleElement= ruleOclModuleElement EOF )
            // InternalOcl.g:199:2: iv_ruleOclModuleElement= ruleOclModuleElement EOF
            {
             newCompositeNode(grammarAccess.getOclModuleElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclModuleElement=ruleOclModuleElement();

            state._fsp--;

             current =iv_ruleOclModuleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclModuleElement"


    // $ANTLR start "ruleOclModuleElement"
    // InternalOcl.g:205:1: ruleOclModuleElement returns [EObject current=null] : ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) ) ( ( (lv_members_4_1= ruleOclFeatureDefinition | lv_members_4_2= ruleOclInvariant ) ) )+ ) ;
    public final EObject ruleOclModuleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_members_4_1 = null;

        EObject lv_members_4_2 = null;



        	enterRule();

        try {
            // InternalOcl.g:211:2: ( ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) ) ( ( (lv_members_4_1= ruleOclFeatureDefinition | lv_members_4_2= ruleOclInvariant ) ) )+ ) )
            // InternalOcl.g:212:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) ) ( ( (lv_members_4_1= ruleOclFeatureDefinition | lv_members_4_2= ruleOclInvariant ) ) )+ )
            {
            // InternalOcl.g:212:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) ) ( ( (lv_members_4_1= ruleOclFeatureDefinition | lv_members_4_2= ruleOclInvariant ) ) )+ )
            // InternalOcl.g:213:3: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) ) ( ( (lv_members_4_1= ruleOclFeatureDefinition | lv_members_4_2= ruleOclInvariant ) ) )+
            {
            // InternalOcl.g:213:3: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) )
            // InternalOcl.g:214:4: otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            				newLeafNode(otherlv_0, grammarAccess.getOclModuleElementAccess().getContextKeyword_0_0());
            			
            // InternalOcl.g:218:4: ( (otherlv_1= RULE_ID ) )
            // InternalOcl.g:219:5: (otherlv_1= RULE_ID )
            {
            // InternalOcl.g:219:5: (otherlv_1= RULE_ID )
            // InternalOcl.g:220:6: otherlv_1= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getOclModuleElementRule());
            						}
            					
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            						newLeafNode(otherlv_1, grammarAccess.getOclModuleElementAccess().getEcoreTypesImportCrossReference_0_1_0());
            					

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            				newLeafNode(otherlv_2, grammarAccess.getOclModuleElementAccess().getExclamationMarkKeyword_0_2());
            			
            // InternalOcl.g:235:4: ( ( ruleQualifiedName ) )
            // InternalOcl.g:236:5: ( ruleQualifiedName )
            {
            // InternalOcl.g:236:5: ( ruleQualifiedName )
            // InternalOcl.g:237:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getOclModuleElementRule());
            						}
            					

            						newCompositeNode(grammarAccess.getOclModuleElementAccess().getClassEClassCrossReference_0_3_0());
            					
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOcl.g:252:3: ( ( (lv_members_4_1= ruleOclFeatureDefinition | lv_members_4_2= ruleOclInvariant ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16||LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOcl.g:253:4: ( (lv_members_4_1= ruleOclFeatureDefinition | lv_members_4_2= ruleOclInvariant ) )
            	    {
            	    // InternalOcl.g:253:4: ( (lv_members_4_1= ruleOclFeatureDefinition | lv_members_4_2= ruleOclInvariant ) )
            	    // InternalOcl.g:254:5: (lv_members_4_1= ruleOclFeatureDefinition | lv_members_4_2= ruleOclInvariant )
            	    {
            	    // InternalOcl.g:254:5: (lv_members_4_1= ruleOclFeatureDefinition | lv_members_4_2= ruleOclInvariant )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==16) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==22) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalOcl.g:255:6: lv_members_4_1= ruleOclFeatureDefinition
            	            {

            	            						newCompositeNode(grammarAccess.getOclModuleElementAccess().getMembersOclFeatureDefinitionParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_members_4_1=ruleOclFeatureDefinition();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getOclModuleElementRule());
            	            						}
            	            						add(
            	            							current,
            	            							"members",
            	            							lv_members_4_1,
            	            							"fr.enseeiht.ocl.xtext.Ocl.OclFeatureDefinition");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalOcl.g:271:6: lv_members_4_2= ruleOclInvariant
            	            {

            	            						newCompositeNode(grammarAccess.getOclModuleElementAccess().getMembersOclInvariantParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_members_4_2=ruleOclInvariant();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getOclModuleElementRule());
            	            						}
            	            						add(
            	            							current,
            	            							"members",
            	            							lv_members_4_2,
            	            							"fr.enseeiht.ocl.xtext.Ocl.OclInvariant");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclModuleElement"


    // $ANTLR start "entryRuleOclFeatureDefinition"
    // InternalOcl.g:293:1: entryRuleOclFeatureDefinition returns [EObject current=null] : iv_ruleOclFeatureDefinition= ruleOclFeatureDefinition EOF ;
    public final EObject entryRuleOclFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclFeatureDefinition = null;


        try {
            // InternalOcl.g:293:61: (iv_ruleOclFeatureDefinition= ruleOclFeatureDefinition EOF )
            // InternalOcl.g:294:2: iv_ruleOclFeatureDefinition= ruleOclFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getOclFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclFeatureDefinition=ruleOclFeatureDefinition();

            state._fsp--;

             current =iv_ruleOclFeatureDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclFeatureDefinition"


    // $ANTLR start "ruleOclFeatureDefinition"
    // InternalOcl.g:300:1: ruleOclFeatureDefinition returns [EObject current=null] : (otherlv_0= 'def' otherlv_1= ':' ( ( (lv_feature_2_1= ruleAttribute | lv_feature_2_2= ruleOperation ) ) ) ) ;
    public final EObject ruleOclFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_feature_2_1 = null;

        EObject lv_feature_2_2 = null;



        	enterRule();

        try {
            // InternalOcl.g:306:2: ( (otherlv_0= 'def' otherlv_1= ':' ( ( (lv_feature_2_1= ruleAttribute | lv_feature_2_2= ruleOperation ) ) ) ) )
            // InternalOcl.g:307:2: (otherlv_0= 'def' otherlv_1= ':' ( ( (lv_feature_2_1= ruleAttribute | lv_feature_2_2= ruleOperation ) ) ) )
            {
            // InternalOcl.g:307:2: (otherlv_0= 'def' otherlv_1= ':' ( ( (lv_feature_2_1= ruleAttribute | lv_feature_2_2= ruleOperation ) ) ) )
            // InternalOcl.g:308:3: otherlv_0= 'def' otherlv_1= ':' ( ( (lv_feature_2_1= ruleAttribute | lv_feature_2_2= ruleOperation ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getOclFeatureDefinitionAccess().getDefKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOclFeatureDefinitionAccess().getColonKeyword_1());
            		
            // InternalOcl.g:316:3: ( ( (lv_feature_2_1= ruleAttribute | lv_feature_2_2= ruleOperation ) ) )
            // InternalOcl.g:317:4: ( (lv_feature_2_1= ruleAttribute | lv_feature_2_2= ruleOperation ) )
            {
            // InternalOcl.g:317:4: ( (lv_feature_2_1= ruleAttribute | lv_feature_2_2= ruleOperation ) )
            // InternalOcl.g:318:5: (lv_feature_2_1= ruleAttribute | lv_feature_2_2= ruleOperation )
            {
            // InternalOcl.g:318:5: (lv_feature_2_1= ruleAttribute | lv_feature_2_2= ruleOperation )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==19) ) {
                    alt6=2;
                }
                else if ( (LA6_1==17) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOcl.g:319:6: lv_feature_2_1= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getOclFeatureDefinitionAccess().getFeatureAttributeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_feature_2_1=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOclFeatureDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"feature",
                    							lv_feature_2_1,
                    							"fr.enseeiht.ocl.xtext.Ocl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalOcl.g:335:6: lv_feature_2_2= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getOclFeatureDefinitionAccess().getFeatureOperationParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_feature_2_2=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOclFeatureDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"feature",
                    							lv_feature_2_2,
                    							"fr.enseeiht.ocl.xtext.Ocl.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclFeatureDefinition"


    // $ANTLR start "entryRuleAttribute"
    // InternalOcl.g:357:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOcl.g:357:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOcl.g:358:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalOcl.g:364:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:370:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:371:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:371:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            // InternalOcl.g:372:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) )
            {
            // InternalOcl.g:372:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOcl.g:373:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOcl.g:373:4: (lv_name_0_0= RULE_ID )
            // InternalOcl.g:374:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalOcl.g:394:3: ( (lv_type_2_0= ruleOclType ) )
            // InternalOcl.g:395:4: (lv_type_2_0= ruleOclType )
            {
            // InternalOcl.g:395:4: (lv_type_2_0= ruleOclType )
            // InternalOcl.g:396:5: lv_type_2_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeOclTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_type_2_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getEqualsSignKeyword_3());
            		
            // InternalOcl.g:417:3: ( (lv_initExpression_4_0= ruleOclExpression ) )
            // InternalOcl.g:418:4: (lv_initExpression_4_0= ruleOclExpression )
            {
            // InternalOcl.g:418:4: (lv_initExpression_4_0= ruleOclExpression )
            // InternalOcl.g:419:5: lv_initExpression_4_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getInitExpressionOclExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_initExpression_4_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"initExpression",
            						lv_initExpression_4_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleOperation"
    // InternalOcl.g:440:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalOcl.g:440:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalOcl.g:441:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalOcl.g:447:1: ruleOperation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+ )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclType ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_returnType_7_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:453:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+ )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclType ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:454:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+ )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclType ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:454:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+ )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclType ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) ) )
            // InternalOcl.g:455:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+ )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclType ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) )
            {
            // InternalOcl.g:455:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOcl.g:456:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOcl.g:456:4: (lv_name_0_0= RULE_ID )
            // InternalOcl.g:457:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:477:3: ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOcl.g:478:4: ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+
                    {
                    // InternalOcl.g:478:4: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalOcl.g:479:5: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalOcl.g:479:5: (lv_parameters_2_0= ruleParameter )
                    // InternalOcl.g:480:6: lv_parameters_2_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_2_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:497:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalOcl.g:498:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_8); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalOcl.g:502:5: ( (lv_parameters_4_0= ruleParameter ) )
                    	    // InternalOcl.g:503:6: (lv_parameters_4_0= ruleParameter )
                    	    {
                    	    // InternalOcl.g:503:6: (lv_parameters_4_0= ruleParameter )
                    	    // InternalOcl.g:504:7: lv_parameters_4_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_parameters_4_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_4_0,
                    	    								"fr.enseeiht.ocl.xtext.Ocl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getColonKeyword_4());
            		
            // InternalOcl.g:531:3: ( (lv_returnType_7_0= ruleOclType ) )
            // InternalOcl.g:532:4: (lv_returnType_7_0= ruleOclType )
            {
            // InternalOcl.g:532:4: (lv_returnType_7_0= ruleOclType )
            // InternalOcl.g:533:5: lv_returnType_7_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeOclTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_returnType_7_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_7_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getEqualsSignKeyword_6());
            		
            // InternalOcl.g:554:3: ( (lv_body_9_0= ruleOclExpression ) )
            // InternalOcl.g:555:4: (lv_body_9_0= ruleOclExpression )
            {
            // InternalOcl.g:555:4: (lv_body_9_0= ruleOclExpression )
            // InternalOcl.g:556:5: lv_body_9_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getBodyOclExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_9_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_9_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // InternalOcl.g:577:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalOcl.g:577:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalOcl.g:578:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalOcl.g:584:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:590:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) ) )
            // InternalOcl.g:591:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )
            {
            // InternalOcl.g:591:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )
            // InternalOcl.g:592:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) )
            {
            // InternalOcl.g:592:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOcl.g:593:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOcl.g:593:4: (lv_name_0_0= RULE_ID )
            // InternalOcl.g:594:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalOcl.g:614:3: ( (lv_type_2_0= ruleOclType ) )
            // InternalOcl.g:615:4: (lv_type_2_0= ruleOclType )
            {
            // InternalOcl.g:615:4: (lv_type_2_0= ruleOclType )
            // InternalOcl.g:616:5: lv_type_2_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeOclTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleOclInvariant"
    // InternalOcl.g:637:1: entryRuleOclInvariant returns [EObject current=null] : iv_ruleOclInvariant= ruleOclInvariant EOF ;
    public final EObject entryRuleOclInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclInvariant = null;


        try {
            // InternalOcl.g:637:53: (iv_ruleOclInvariant= ruleOclInvariant EOF )
            // InternalOcl.g:638:2: iv_ruleOclInvariant= ruleOclInvariant EOF
            {
             newCompositeNode(grammarAccess.getOclInvariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclInvariant=ruleOclInvariant();

            state._fsp--;

             current =iv_ruleOclInvariant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclInvariant"


    // $ANTLR start "ruleOclInvariant"
    // InternalOcl.g:644:1: ruleOclInvariant returns [EObject current=null] : (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_body_3_0= ruleOclExpression ) ) ) ;
    public final EObject ruleOclInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:650:2: ( (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_body_3_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:651:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_body_3_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:651:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_body_3_0= ruleOclExpression ) ) )
            // InternalOcl.g:652:3: otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_body_3_0= ruleOclExpression ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getOclInvariantAccess().getInvKeyword_0());
            		
            // InternalOcl.g:656:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOcl.g:657:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOcl.g:657:4: (lv_name_1_0= RULE_ID )
            // InternalOcl.g:658:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOclInvariantAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOclInvariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getOclInvariantAccess().getColonKeyword_2());
            		
            // InternalOcl.g:678:3: ( (lv_body_3_0= ruleOclExpression ) )
            // InternalOcl.g:679:4: (lv_body_3_0= ruleOclExpression )
            {
            // InternalOcl.g:679:4: (lv_body_3_0= ruleOclExpression )
            // InternalOcl.g:680:5: lv_body_3_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getOclInvariantAccess().getBodyOclExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_3_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOclInvariantRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclInvariant"


    // $ANTLR start "entryRuleOclExpression"
    // InternalOcl.g:701:1: entryRuleOclExpression returns [EObject current=null] : iv_ruleOclExpression= ruleOclExpression EOF ;
    public final EObject entryRuleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclExpression = null;


        try {
            // InternalOcl.g:701:54: (iv_ruleOclExpression= ruleOclExpression EOF )
            // InternalOcl.g:702:2: iv_ruleOclExpression= ruleOclExpression EOF
            {
             newCompositeNode(grammarAccess.getOclExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclExpression=ruleOclExpression();

            state._fsp--;

             current =iv_ruleOclExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclExpression"


    // $ANTLR start "ruleOclExpression"
    // InternalOcl.g:708:1: ruleOclExpression returns [EObject current=null] : (this_OperatorCallExp_0= ruleOperatorCallExp | this_LetExp_1= ruleLetExp ) ;
    public final EObject ruleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OperatorCallExp_0 = null;

        EObject this_LetExp_1 = null;



        	enterRule();

        try {
            // InternalOcl.g:714:2: ( (this_OperatorCallExp_0= ruleOperatorCallExp | this_LetExp_1= ruleLetExp ) )
            // InternalOcl.g:715:2: (this_OperatorCallExp_0= ruleOperatorCallExp | this_LetExp_1= ruleLetExp )
            {
            // InternalOcl.g:715:2: (this_OperatorCallExp_0= ruleOperatorCallExp | this_LetExp_1= ruleLetExp )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_INT)||LA9_0==19||LA9_0==33||(LA9_0>=39 && LA9_0<=41)||(LA9_0>=44 && LA9_0<=49)||LA9_0==52||(LA9_0>=56 && LA9_0<=57)) ) {
                alt9=1;
            }
            else if ( (LA9_0==50) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOcl.g:716:3: this_OperatorCallExp_0= ruleOperatorCallExp
                    {

                    			newCompositeNode(grammarAccess.getOclExpressionAccess().getOperatorCallExpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperatorCallExp_0=ruleOperatorCallExp();

                    state._fsp--;


                    			current = this_OperatorCallExp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:725:3: this_LetExp_1= ruleLetExp
                    {

                    			newCompositeNode(grammarAccess.getOclExpressionAccess().getLetExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetExp_1=ruleLetExp();

                    state._fsp--;


                    			current = this_LetExp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclExpression"


    // $ANTLR start "entryRuleOclModelElementExp"
    // InternalOcl.g:737:1: entryRuleOclModelElementExp returns [EObject current=null] : iv_ruleOclModelElementExp= ruleOclModelElementExp EOF ;
    public final EObject entryRuleOclModelElementExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclModelElementExp = null;


        try {
            // InternalOcl.g:737:59: (iv_ruleOclModelElementExp= ruleOclModelElementExp EOF )
            // InternalOcl.g:738:2: iv_ruleOclModelElementExp= ruleOclModelElementExp EOF
            {
             newCompositeNode(grammarAccess.getOclModelElementExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclModelElementExp=ruleOclModelElementExp();

            state._fsp--;

             current =iv_ruleOclModelElementExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclModelElementExp"


    // $ANTLR start "ruleOclModelElementExp"
    // InternalOcl.g:744:1: ruleOclModelElementExp returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOclModelElementExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalOcl.g:750:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalOcl.g:751:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalOcl.g:751:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalOcl.g:752:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalOcl.g:752:3: ( (otherlv_0= RULE_ID ) )
            // InternalOcl.g:753:4: (otherlv_0= RULE_ID )
            {
            // InternalOcl.g:753:4: (otherlv_0= RULE_ID )
            // InternalOcl.g:754:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOclModelElementExpRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getOclModelElementExpAccess().getModelImportCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOclModelElementExpAccess().getExclamationMarkKeyword_1());
            		
            // InternalOcl.g:769:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOcl.g:770:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOcl.g:770:4: (lv_name_2_0= RULE_ID )
            // InternalOcl.g:771:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOclModelElementExpAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOclModelElementExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclModelElementExp"


    // $ANTLR start "entryRuleOperatorCallExp"
    // InternalOcl.g:791:1: entryRuleOperatorCallExp returns [EObject current=null] : iv_ruleOperatorCallExp= ruleOperatorCallExp EOF ;
    public final EObject entryRuleOperatorCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorCallExp = null;


        try {
            // InternalOcl.g:791:56: (iv_ruleOperatorCallExp= ruleOperatorCallExp EOF )
            // InternalOcl.g:792:2: iv_ruleOperatorCallExp= ruleOperatorCallExp EOF
            {
             newCompositeNode(grammarAccess.getOperatorCallExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperatorCallExp=ruleOperatorCallExp();

            state._fsp--;

             current =iv_ruleOperatorCallExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperatorCallExp"


    // $ANTLR start "ruleOperatorCallExp"
    // InternalOcl.g:798:1: ruleOperatorCallExp returns [EObject current=null] : (this_EqOpCallExp_0= ruleEqOpCallExp ( ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) ) )* ) ;
    public final EObject ruleOperatorCallExp() throws RecognitionException {
        EObject current = null;

        EObject this_EqOpCallExp_0 = null;

        AntlrDatatypeRuleToken lv_operationName_2_0 = null;

        EObject lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:804:2: ( (this_EqOpCallExp_0= ruleEqOpCallExp ( ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) ) )* ) )
            // InternalOcl.g:805:2: (this_EqOpCallExp_0= ruleEqOpCallExp ( ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) ) )* )
            {
            // InternalOcl.g:805:2: (this_EqOpCallExp_0= ruleEqOpCallExp ( ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) ) )* )
            // InternalOcl.g:806:3: this_EqOpCallExp_0= ruleEqOpCallExp ( ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getOperatorCallExpAccess().getEqOpCallExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_EqOpCallExp_0=ruleEqOpCallExp();

            state._fsp--;


            			current = this_EqOpCallExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalOcl.g:814:3: ( ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=23 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOcl.g:815:4: ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) )
            	    {
            	    // InternalOcl.g:815:4: ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) )
            	    // InternalOcl.g:816:5: () ( (lv_operationName_2_0= ruleBOOLOP ) )
            	    {
            	    // InternalOcl.g:816:5: ()
            	    // InternalOcl.g:817:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getOperatorCallExpAccess().getOperatorCallExpSourceAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalOcl.g:823:5: ( (lv_operationName_2_0= ruleBOOLOP ) )
            	    // InternalOcl.g:824:6: (lv_operationName_2_0= ruleBOOLOP )
            	    {
            	    // InternalOcl.g:824:6: (lv_operationName_2_0= ruleBOOLOP )
            	    // InternalOcl.g:825:7: lv_operationName_2_0= ruleBOOLOP
            	    {

            	    							newCompositeNode(grammarAccess.getOperatorCallExpAccess().getOperationNameBOOLOPParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
            	    lv_operationName_2_0=ruleBOOLOP();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getOperatorCallExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operationName",
            	    								lv_operationName_2_0,
            	    								"fr.enseeiht.ocl.xtext.Ocl.BOOLOP");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }

            	    // InternalOcl.g:843:4: ( (lv_argument_3_0= ruleEqOpCallExp ) )
            	    // InternalOcl.g:844:5: (lv_argument_3_0= ruleEqOpCallExp )
            	    {
            	    // InternalOcl.g:844:5: (lv_argument_3_0= ruleEqOpCallExp )
            	    // InternalOcl.g:845:6: lv_argument_3_0= ruleEqOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getOperatorCallExpAccess().getArgumentEqOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_argument_3_0=ruleEqOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperatorCallExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"argument",
            	    							lv_argument_3_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.EqOpCallExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperatorCallExp"


    // $ANTLR start "entryRuleBOOLOP"
    // InternalOcl.g:867:1: entryRuleBOOLOP returns [String current=null] : iv_ruleBOOLOP= ruleBOOLOP EOF ;
    public final String entryRuleBOOLOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLOP = null;


        try {
            // InternalOcl.g:867:46: (iv_ruleBOOLOP= ruleBOOLOP EOF )
            // InternalOcl.g:868:2: iv_ruleBOOLOP= ruleBOOLOP EOF
            {
             newCompositeNode(grammarAccess.getBOOLOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOLOP=ruleBOOLOP();

            state._fsp--;

             current =iv_ruleBOOLOP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLOP"


    // $ANTLR start "ruleBOOLOP"
    // InternalOcl.g:874:1: ruleBOOLOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' | kw= 'equivalent' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:880:2: ( (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' | kw= 'equivalent' ) )
            // InternalOcl.g:881:2: (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' | kw= 'equivalent' )
            {
            // InternalOcl.g:881:2: (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' | kw= 'equivalent' )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            case 26:
                {
                alt11=4;
                }
                break;
            case 27:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalOcl.g:882:3: kw= 'and'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLOPAccess().getAndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:888:3: kw= 'or'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLOPAccess().getOrKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOcl.g:894:3: kw= 'xor'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLOPAccess().getXorKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOcl.g:900:3: kw= 'implies'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLOPAccess().getImpliesKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOcl.g:906:3: kw= 'equivalent'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLOPAccess().getEquivalentKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLOP"


    // $ANTLR start "entryRuleEqOpCallExp"
    // InternalOcl.g:915:1: entryRuleEqOpCallExp returns [EObject current=null] : iv_ruleEqOpCallExp= ruleEqOpCallExp EOF ;
    public final EObject entryRuleEqOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqOpCallExp = null;


        try {
            // InternalOcl.g:915:52: (iv_ruleEqOpCallExp= ruleEqOpCallExp EOF )
            // InternalOcl.g:916:2: iv_ruleEqOpCallExp= ruleEqOpCallExp EOF
            {
             newCompositeNode(grammarAccess.getEqOpCallExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqOpCallExp=ruleEqOpCallExp();

            state._fsp--;

             current =iv_ruleEqOpCallExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqOpCallExp"


    // $ANTLR start "ruleEqOpCallExp"
    // InternalOcl.g:922:1: ruleEqOpCallExp returns [EObject current=null] : (this_RelOpCallExp_0= ruleRelOpCallExp ( ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) ) )? ) ;
    public final EObject ruleEqOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject this_RelOpCallExp_0 = null;

        AntlrDatatypeRuleToken lv_operationName_2_0 = null;

        EObject lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:928:2: ( (this_RelOpCallExp_0= ruleRelOpCallExp ( ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) ) )? ) )
            // InternalOcl.g:929:2: (this_RelOpCallExp_0= ruleRelOpCallExp ( ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) ) )? )
            {
            // InternalOcl.g:929:2: (this_RelOpCallExp_0= ruleRelOpCallExp ( ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) ) )? )
            // InternalOcl.g:930:3: this_RelOpCallExp_0= ruleRelOpCallExp ( ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) ) )?
            {

            			newCompositeNode(grammarAccess.getEqOpCallExpAccess().getRelOpCallExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_RelOpCallExp_0=ruleRelOpCallExp();

            state._fsp--;


            			current = this_RelOpCallExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalOcl.g:938:3: ( ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18||LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOcl.g:939:4: ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) )
                    {
                    // InternalOcl.g:939:4: ( () ( (lv_operationName_2_0= ruleEQOP ) ) )
                    // InternalOcl.g:940:5: () ( (lv_operationName_2_0= ruleEQOP ) )
                    {
                    // InternalOcl.g:940:5: ()
                    // InternalOcl.g:941:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getEqOpCallExpAccess().getEqOpCallExpSourceAction_1_0_0(),
                    							current);
                    					

                    }

                    // InternalOcl.g:947:5: ( (lv_operationName_2_0= ruleEQOP ) )
                    // InternalOcl.g:948:6: (lv_operationName_2_0= ruleEQOP )
                    {
                    // InternalOcl.g:948:6: (lv_operationName_2_0= ruleEQOP )
                    // InternalOcl.g:949:7: lv_operationName_2_0= ruleEQOP
                    {

                    							newCompositeNode(grammarAccess.getEqOpCallExpAccess().getOperationNameEQOPParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_operationName_2_0=ruleEQOP();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEqOpCallExpRule());
                    							}
                    							set(
                    								current,
                    								"operationName",
                    								lv_operationName_2_0,
                    								"fr.enseeiht.ocl.xtext.Ocl.EQOP");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalOcl.g:967:4: ( (lv_argument_3_0= ruleRelOpCallExp ) )
                    // InternalOcl.g:968:5: (lv_argument_3_0= ruleRelOpCallExp )
                    {
                    // InternalOcl.g:968:5: (lv_argument_3_0= ruleRelOpCallExp )
                    // InternalOcl.g:969:6: lv_argument_3_0= ruleRelOpCallExp
                    {

                    						newCompositeNode(grammarAccess.getEqOpCallExpAccess().getArgumentRelOpCallExpParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_argument_3_0=ruleRelOpCallExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqOpCallExpRule());
                    						}
                    						set(
                    							current,
                    							"argument",
                    							lv_argument_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.RelOpCallExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqOpCallExp"


    // $ANTLR start "entryRuleEQOP"
    // InternalOcl.g:991:1: entryRuleEQOP returns [String current=null] : iv_ruleEQOP= ruleEQOP EOF ;
    public final String entryRuleEQOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEQOP = null;


        try {
            // InternalOcl.g:991:44: (iv_ruleEQOP= ruleEQOP EOF )
            // InternalOcl.g:992:2: iv_ruleEQOP= ruleEQOP EOF
            {
             newCompositeNode(grammarAccess.getEQOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEQOP=ruleEQOP();

            state._fsp--;

             current =iv_ruleEQOP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEQOP"


    // $ANTLR start "ruleEQOP"
    // InternalOcl.g:998:1: ruleEQOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken ruleEQOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1004:2: ( (kw= '=' | kw= '<>' ) )
            // InternalOcl.g:1005:2: (kw= '=' | kw= '<>' )
            {
            // InternalOcl.g:1005:2: (kw= '=' | kw= '<>' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOcl.g:1006:3: kw= '='
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEQOPAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1012:3: kw= '<>'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEQOPAccess().getLessThanSignGreaterThanSignKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEQOP"


    // $ANTLR start "entryRuleRelOpCallExp"
    // InternalOcl.g:1021:1: entryRuleRelOpCallExp returns [EObject current=null] : iv_ruleRelOpCallExp= ruleRelOpCallExp EOF ;
    public final EObject entryRuleRelOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelOpCallExp = null;


        try {
            // InternalOcl.g:1021:53: (iv_ruleRelOpCallExp= ruleRelOpCallExp EOF )
            // InternalOcl.g:1022:2: iv_ruleRelOpCallExp= ruleRelOpCallExp EOF
            {
             newCompositeNode(grammarAccess.getRelOpCallExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelOpCallExp=ruleRelOpCallExp();

            state._fsp--;

             current =iv_ruleRelOpCallExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelOpCallExp"


    // $ANTLR start "ruleRelOpCallExp"
    // InternalOcl.g:1028:1: ruleRelOpCallExp returns [EObject current=null] : (this_AddOpCallExp_0= ruleAddOpCallExp ( ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) ) )? ) ;
    public final EObject ruleRelOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject this_AddOpCallExp_0 = null;

        AntlrDatatypeRuleToken lv_operationName_2_0 = null;

        EObject lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1034:2: ( (this_AddOpCallExp_0= ruleAddOpCallExp ( ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) ) )? ) )
            // InternalOcl.g:1035:2: (this_AddOpCallExp_0= ruleAddOpCallExp ( ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) ) )? )
            {
            // InternalOcl.g:1035:2: (this_AddOpCallExp_0= ruleAddOpCallExp ( ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) ) )? )
            // InternalOcl.g:1036:3: this_AddOpCallExp_0= ruleAddOpCallExp ( ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) ) )?
            {

            			newCompositeNode(grammarAccess.getRelOpCallExpAccess().getAddOpCallExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_AddOpCallExp_0=ruleAddOpCallExp();

            state._fsp--;


            			current = this_AddOpCallExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalOcl.g:1044:3: ( ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=29 && LA14_0<=32)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOcl.g:1045:4: ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) )
                    {
                    // InternalOcl.g:1045:4: ( () ( (lv_operationName_2_0= ruleRELOP ) ) )
                    // InternalOcl.g:1046:5: () ( (lv_operationName_2_0= ruleRELOP ) )
                    {
                    // InternalOcl.g:1046:5: ()
                    // InternalOcl.g:1047:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getRelOpCallExpAccess().getRelOpCallExpSourceAction_1_0_0(),
                    							current);
                    					

                    }

                    // InternalOcl.g:1053:5: ( (lv_operationName_2_0= ruleRELOP ) )
                    // InternalOcl.g:1054:6: (lv_operationName_2_0= ruleRELOP )
                    {
                    // InternalOcl.g:1054:6: (lv_operationName_2_0= ruleRELOP )
                    // InternalOcl.g:1055:7: lv_operationName_2_0= ruleRELOP
                    {

                    							newCompositeNode(grammarAccess.getRelOpCallExpAccess().getOperationNameRELOPParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_operationName_2_0=ruleRELOP();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRelOpCallExpRule());
                    							}
                    							set(
                    								current,
                    								"operationName",
                    								lv_operationName_2_0,
                    								"fr.enseeiht.ocl.xtext.Ocl.RELOP");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalOcl.g:1073:4: ( (lv_argument_3_0= ruleAddOpCallExp ) )
                    // InternalOcl.g:1074:5: (lv_argument_3_0= ruleAddOpCallExp )
                    {
                    // InternalOcl.g:1074:5: (lv_argument_3_0= ruleAddOpCallExp )
                    // InternalOcl.g:1075:6: lv_argument_3_0= ruleAddOpCallExp
                    {

                    						newCompositeNode(grammarAccess.getRelOpCallExpAccess().getArgumentAddOpCallExpParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_argument_3_0=ruleAddOpCallExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelOpCallExpRule());
                    						}
                    						set(
                    							current,
                    							"argument",
                    							lv_argument_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.AddOpCallExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelOpCallExp"


    // $ANTLR start "entryRuleRELOP"
    // InternalOcl.g:1097:1: entryRuleRELOP returns [String current=null] : iv_ruleRELOP= ruleRELOP EOF ;
    public final String entryRuleRELOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRELOP = null;


        try {
            // InternalOcl.g:1097:45: (iv_ruleRELOP= ruleRELOP EOF )
            // InternalOcl.g:1098:2: iv_ruleRELOP= ruleRELOP EOF
            {
             newCompositeNode(grammarAccess.getRELOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRELOP=ruleRELOP();

            state._fsp--;

             current =iv_ruleRELOP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRELOP"


    // $ANTLR start "ruleRELOP"
    // InternalOcl.g:1104:1: ruleRELOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleRELOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1110:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) )
            // InternalOcl.g:1111:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            {
            // InternalOcl.g:1111:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalOcl.g:1112:3: kw= '>'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRELOPAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1118:3: kw= '<'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRELOPAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOcl.g:1124:3: kw= '>='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRELOPAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOcl.g:1130:3: kw= '<='
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRELOPAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRELOP"


    // $ANTLR start "entryRuleAddOpCallExp"
    // InternalOcl.g:1139:1: entryRuleAddOpCallExp returns [EObject current=null] : iv_ruleAddOpCallExp= ruleAddOpCallExp EOF ;
    public final EObject entryRuleAddOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOpCallExp = null;


        try {
            // InternalOcl.g:1139:53: (iv_ruleAddOpCallExp= ruleAddOpCallExp EOF )
            // InternalOcl.g:1140:2: iv_ruleAddOpCallExp= ruleAddOpCallExp EOF
            {
             newCompositeNode(grammarAccess.getAddOpCallExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddOpCallExp=ruleAddOpCallExp();

            state._fsp--;

             current =iv_ruleAddOpCallExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddOpCallExp"


    // $ANTLR start "ruleAddOpCallExp"
    // InternalOcl.g:1146:1: ruleAddOpCallExp returns [EObject current=null] : (this_IntOpCallExp_0= ruleIntOpCallExp ( ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) ) )* ) ;
    public final EObject ruleAddOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject this_IntOpCallExp_0 = null;

        AntlrDatatypeRuleToken lv_operationName_2_0 = null;

        EObject lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1152:2: ( (this_IntOpCallExp_0= ruleIntOpCallExp ( ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) ) )* ) )
            // InternalOcl.g:1153:2: (this_IntOpCallExp_0= ruleIntOpCallExp ( ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) ) )* )
            {
            // InternalOcl.g:1153:2: (this_IntOpCallExp_0= ruleIntOpCallExp ( ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) ) )* )
            // InternalOcl.g:1154:3: this_IntOpCallExp_0= ruleIntOpCallExp ( ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddOpCallExpAccess().getIntOpCallExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_IntOpCallExp_0=ruleIntOpCallExp();

            state._fsp--;


            			current = this_IntOpCallExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalOcl.g:1162:3: ( ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=33 && LA16_0<=34)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOcl.g:1163:4: ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) )
            	    {
            	    // InternalOcl.g:1163:4: ( () ( (lv_operationName_2_0= ruleADDOP ) ) )
            	    // InternalOcl.g:1164:5: () ( (lv_operationName_2_0= ruleADDOP ) )
            	    {
            	    // InternalOcl.g:1164:5: ()
            	    // InternalOcl.g:1165:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getAddOpCallExpAccess().getAddOpCallExpSourceAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalOcl.g:1171:5: ( (lv_operationName_2_0= ruleADDOP ) )
            	    // InternalOcl.g:1172:6: (lv_operationName_2_0= ruleADDOP )
            	    {
            	    // InternalOcl.g:1172:6: (lv_operationName_2_0= ruleADDOP )
            	    // InternalOcl.g:1173:7: lv_operationName_2_0= ruleADDOP
            	    {

            	    							newCompositeNode(grammarAccess.getAddOpCallExpAccess().getOperationNameADDOPParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
            	    lv_operationName_2_0=ruleADDOP();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getAddOpCallExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operationName",
            	    								lv_operationName_2_0,
            	    								"fr.enseeiht.ocl.xtext.Ocl.ADDOP");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }

            	    // InternalOcl.g:1191:4: ( (lv_argument_3_0= ruleIntOpCallExp ) )
            	    // InternalOcl.g:1192:5: (lv_argument_3_0= ruleIntOpCallExp )
            	    {
            	    // InternalOcl.g:1192:5: (lv_argument_3_0= ruleIntOpCallExp )
            	    // InternalOcl.g:1193:6: lv_argument_3_0= ruleIntOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getAddOpCallExpAccess().getArgumentIntOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_argument_3_0=ruleIntOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddOpCallExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"argument",
            	    							lv_argument_3_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.IntOpCallExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddOpCallExp"


    // $ANTLR start "entryRuleADDOP"
    // InternalOcl.g:1215:1: entryRuleADDOP returns [String current=null] : iv_ruleADDOP= ruleADDOP EOF ;
    public final String entryRuleADDOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleADDOP = null;


        try {
            // InternalOcl.g:1215:45: (iv_ruleADDOP= ruleADDOP EOF )
            // InternalOcl.g:1216:2: iv_ruleADDOP= ruleADDOP EOF
            {
             newCompositeNode(grammarAccess.getADDOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADDOP=ruleADDOP();

            state._fsp--;

             current =iv_ruleADDOP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleADDOP"


    // $ANTLR start "ruleADDOP"
    // InternalOcl.g:1222:1: ruleADDOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleADDOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1228:2: ( (kw= '-' | kw= '+' ) )
            // InternalOcl.g:1229:2: (kw= '-' | kw= '+' )
            {
            // InternalOcl.g:1229:2: (kw= '-' | kw= '+' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            else if ( (LA17_0==34) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalOcl.g:1230:3: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getADDOPAccess().getHyphenMinusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1236:3: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getADDOPAccess().getPlusSignKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleADDOP"


    // $ANTLR start "entryRuleIntOpCallExp"
    // InternalOcl.g:1245:1: entryRuleIntOpCallExp returns [EObject current=null] : iv_ruleIntOpCallExp= ruleIntOpCallExp EOF ;
    public final EObject entryRuleIntOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntOpCallExp = null;


        try {
            // InternalOcl.g:1245:53: (iv_ruleIntOpCallExp= ruleIntOpCallExp EOF )
            // InternalOcl.g:1246:2: iv_ruleIntOpCallExp= ruleIntOpCallExp EOF
            {
             newCompositeNode(grammarAccess.getIntOpCallExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntOpCallExp=ruleIntOpCallExp();

            state._fsp--;

             current =iv_ruleIntOpCallExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntOpCallExp"


    // $ANTLR start "ruleIntOpCallExp"
    // InternalOcl.g:1252:1: ruleIntOpCallExp returns [EObject current=null] : (this_MulOpCallExp_0= ruleMulOpCallExp ( ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) ) )* ) ;
    public final EObject ruleIntOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject this_MulOpCallExp_0 = null;

        AntlrDatatypeRuleToken lv_operationName_2_0 = null;

        EObject lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1258:2: ( (this_MulOpCallExp_0= ruleMulOpCallExp ( ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) ) )* ) )
            // InternalOcl.g:1259:2: (this_MulOpCallExp_0= ruleMulOpCallExp ( ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) ) )* )
            {
            // InternalOcl.g:1259:2: (this_MulOpCallExp_0= ruleMulOpCallExp ( ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) ) )* )
            // InternalOcl.g:1260:3: this_MulOpCallExp_0= ruleMulOpCallExp ( ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getIntOpCallExpAccess().getMulOpCallExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_MulOpCallExp_0=ruleMulOpCallExp();

            state._fsp--;


            			current = this_MulOpCallExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalOcl.g:1268:3: ( ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=35 && LA18_0<=36)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOcl.g:1269:4: ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) )
            	    {
            	    // InternalOcl.g:1269:4: ( () ( (lv_operationName_2_0= ruleINTOP ) ) )
            	    // InternalOcl.g:1270:5: () ( (lv_operationName_2_0= ruleINTOP ) )
            	    {
            	    // InternalOcl.g:1270:5: ()
            	    // InternalOcl.g:1271:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getIntOpCallExpAccess().getIntOpCallExpSourceAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalOcl.g:1277:5: ( (lv_operationName_2_0= ruleINTOP ) )
            	    // InternalOcl.g:1278:6: (lv_operationName_2_0= ruleINTOP )
            	    {
            	    // InternalOcl.g:1278:6: (lv_operationName_2_0= ruleINTOP )
            	    // InternalOcl.g:1279:7: lv_operationName_2_0= ruleINTOP
            	    {

            	    							newCompositeNode(grammarAccess.getIntOpCallExpAccess().getOperationNameINTOPParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
            	    lv_operationName_2_0=ruleINTOP();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getIntOpCallExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operationName",
            	    								lv_operationName_2_0,
            	    								"fr.enseeiht.ocl.xtext.Ocl.INTOP");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }

            	    // InternalOcl.g:1297:4: ( (lv_argument_3_0= ruleMulOpCallExp ) )
            	    // InternalOcl.g:1298:5: (lv_argument_3_0= ruleMulOpCallExp )
            	    {
            	    // InternalOcl.g:1298:5: (lv_argument_3_0= ruleMulOpCallExp )
            	    // InternalOcl.g:1299:6: lv_argument_3_0= ruleMulOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getIntOpCallExpAccess().getArgumentMulOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_argument_3_0=ruleMulOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIntOpCallExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"argument",
            	    							lv_argument_3_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.MulOpCallExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntOpCallExp"


    // $ANTLR start "entryRuleINTOP"
    // InternalOcl.g:1321:1: entryRuleINTOP returns [String current=null] : iv_ruleINTOP= ruleINTOP EOF ;
    public final String entryRuleINTOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTOP = null;


        try {
            // InternalOcl.g:1321:45: (iv_ruleINTOP= ruleINTOP EOF )
            // InternalOcl.g:1322:2: iv_ruleINTOP= ruleINTOP EOF
            {
             newCompositeNode(grammarAccess.getINTOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINTOP=ruleINTOP();

            state._fsp--;

             current =iv_ruleINTOP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTOP"


    // $ANTLR start "ruleINTOP"
    // InternalOcl.g:1328:1: ruleINTOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'div' | kw= 'mod' ) ;
    public final AntlrDatatypeRuleToken ruleINTOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1334:2: ( (kw= 'div' | kw= 'mod' ) )
            // InternalOcl.g:1335:2: (kw= 'div' | kw= 'mod' )
            {
            // InternalOcl.g:1335:2: (kw= 'div' | kw= 'mod' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalOcl.g:1336:3: kw= 'div'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getINTOPAccess().getDivKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1342:3: kw= 'mod'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getINTOPAccess().getModKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTOP"


    // $ANTLR start "entryRuleMulOpCallExp"
    // InternalOcl.g:1351:1: entryRuleMulOpCallExp returns [EObject current=null] : iv_ruleMulOpCallExp= ruleMulOpCallExp EOF ;
    public final EObject entryRuleMulOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOpCallExp = null;


        try {
            // InternalOcl.g:1351:53: (iv_ruleMulOpCallExp= ruleMulOpCallExp EOF )
            // InternalOcl.g:1352:2: iv_ruleMulOpCallExp= ruleMulOpCallExp EOF
            {
             newCompositeNode(grammarAccess.getMulOpCallExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOpCallExp=ruleMulOpCallExp();

            state._fsp--;

             current =iv_ruleMulOpCallExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOpCallExp"


    // $ANTLR start "ruleMulOpCallExp"
    // InternalOcl.g:1358:1: ruleMulOpCallExp returns [EObject current=null] : (this_NotOpCallExp_0= ruleNotOpCallExp ( ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) ) )* ) ;
    public final EObject ruleMulOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject this_NotOpCallExp_0 = null;

        AntlrDatatypeRuleToken lv_operationName_2_0 = null;

        EObject lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1364:2: ( (this_NotOpCallExp_0= ruleNotOpCallExp ( ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) ) )* ) )
            // InternalOcl.g:1365:2: (this_NotOpCallExp_0= ruleNotOpCallExp ( ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) ) )* )
            {
            // InternalOcl.g:1365:2: (this_NotOpCallExp_0= ruleNotOpCallExp ( ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) ) )* )
            // InternalOcl.g:1366:3: this_NotOpCallExp_0= ruleNotOpCallExp ( ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOpCallExpAccess().getNotOpCallExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_NotOpCallExp_0=ruleNotOpCallExp();

            state._fsp--;


            			current = this_NotOpCallExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalOcl.g:1374:3: ( ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=37 && LA20_0<=38)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOcl.g:1375:4: ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) )
            	    {
            	    // InternalOcl.g:1375:4: ( () ( (lv_operationName_2_0= ruleMULOP ) ) )
            	    // InternalOcl.g:1376:5: () ( (lv_operationName_2_0= ruleMULOP ) )
            	    {
            	    // InternalOcl.g:1376:5: ()
            	    // InternalOcl.g:1377:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulOpCallExpAccess().getMulOpCallExpSourceAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalOcl.g:1383:5: ( (lv_operationName_2_0= ruleMULOP ) )
            	    // InternalOcl.g:1384:6: (lv_operationName_2_0= ruleMULOP )
            	    {
            	    // InternalOcl.g:1384:6: (lv_operationName_2_0= ruleMULOP )
            	    // InternalOcl.g:1385:7: lv_operationName_2_0= ruleMULOP
            	    {

            	    							newCompositeNode(grammarAccess.getMulOpCallExpAccess().getOperationNameMULOPParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
            	    lv_operationName_2_0=ruleMULOP();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMulOpCallExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operationName",
            	    								lv_operationName_2_0,
            	    								"fr.enseeiht.ocl.xtext.Ocl.MULOP");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }

            	    // InternalOcl.g:1403:4: ( (lv_argument_3_0= ruleNotOpCallExp ) )
            	    // InternalOcl.g:1404:5: (lv_argument_3_0= ruleNotOpCallExp )
            	    {
            	    // InternalOcl.g:1404:5: (lv_argument_3_0= ruleNotOpCallExp )
            	    // InternalOcl.g:1405:6: lv_argument_3_0= ruleNotOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getMulOpCallExpAccess().getArgumentNotOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_argument_3_0=ruleNotOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOpCallExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"argument",
            	    							lv_argument_3_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.NotOpCallExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOpCallExp"


    // $ANTLR start "entryRuleMULOP"
    // InternalOcl.g:1427:1: entryRuleMULOP returns [String current=null] : iv_ruleMULOP= ruleMULOP EOF ;
    public final String entryRuleMULOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULOP = null;


        try {
            // InternalOcl.g:1427:45: (iv_ruleMULOP= ruleMULOP EOF )
            // InternalOcl.g:1428:2: iv_ruleMULOP= ruleMULOP EOF
            {
             newCompositeNode(grammarAccess.getMULOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMULOP=ruleMULOP();

            state._fsp--;

             current =iv_ruleMULOP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMULOP"


    // $ANTLR start "ruleMULOP"
    // InternalOcl.g:1434:1: ruleMULOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleMULOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1440:2: ( (kw= '*' | kw= '/' ) )
            // InternalOcl.g:1441:2: (kw= '*' | kw= '/' )
            {
            // InternalOcl.g:1441:2: (kw= '*' | kw= '/' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            else if ( (LA21_0==38) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalOcl.g:1442:3: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMULOPAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1448:3: kw= '/'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMULOPAccess().getSolidusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMULOP"


    // $ANTLR start "entryRuleNotOpCallExp"
    // InternalOcl.g:1457:1: entryRuleNotOpCallExp returns [EObject current=null] : iv_ruleNotOpCallExp= ruleNotOpCallExp EOF ;
    public final EObject entryRuleNotOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOpCallExp = null;


        try {
            // InternalOcl.g:1457:53: (iv_ruleNotOpCallExp= ruleNotOpCallExp EOF )
            // InternalOcl.g:1458:2: iv_ruleNotOpCallExp= ruleNotOpCallExp EOF
            {
             newCompositeNode(grammarAccess.getNotOpCallExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotOpCallExp=ruleNotOpCallExp();

            state._fsp--;

             current =iv_ruleNotOpCallExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOpCallExp"


    // $ANTLR start "ruleNotOpCallExp"
    // InternalOcl.g:1464:1: ruleNotOpCallExp returns [EObject current=null] : ( ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp ) ;
    public final EObject ruleNotOpCallExp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operationName_0_0 = null;

        EObject lv_source_1_0 = null;

        EObject this_PropertyCallExp_2 = null;



        	enterRule();

        try {
            // InternalOcl.g:1470:2: ( ( ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp ) )
            // InternalOcl.g:1471:2: ( ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp )
            {
            // InternalOcl.g:1471:2: ( ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33||LA22_0==39) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_INT)||LA22_0==19||(LA22_0>=40 && LA22_0<=41)||(LA22_0>=44 && LA22_0<=49)||LA22_0==52||(LA22_0>=56 && LA22_0<=57)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalOcl.g:1472:3: ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) )
                    {
                    // InternalOcl.g:1472:3: ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) )
                    // InternalOcl.g:1473:4: ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) )
                    {
                    // InternalOcl.g:1473:4: ( (lv_operationName_0_0= ruleUNARYOP ) )
                    // InternalOcl.g:1474:5: (lv_operationName_0_0= ruleUNARYOP )
                    {
                    // InternalOcl.g:1474:5: (lv_operationName_0_0= ruleUNARYOP )
                    // InternalOcl.g:1475:6: lv_operationName_0_0= ruleUNARYOP
                    {

                    						newCompositeNode(grammarAccess.getNotOpCallExpAccess().getOperationNameUNARYOPParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_operationName_0_0=ruleUNARYOP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotOpCallExpRule());
                    						}
                    						set(
                    							current,
                    							"operationName",
                    							lv_operationName_0_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.UNARYOP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:1492:4: ( (lv_source_1_0= ruleNotOpCallExp ) )
                    // InternalOcl.g:1493:5: (lv_source_1_0= ruleNotOpCallExp )
                    {
                    // InternalOcl.g:1493:5: (lv_source_1_0= ruleNotOpCallExp )
                    // InternalOcl.g:1494:6: lv_source_1_0= ruleNotOpCallExp
                    {

                    						newCompositeNode(grammarAccess.getNotOpCallExpAccess().getSourceNotOpCallExpParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_source_1_0=ruleNotOpCallExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotOpCallExpRule());
                    						}
                    						set(
                    							current,
                    							"source",
                    							lv_source_1_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.NotOpCallExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOcl.g:1513:3: this_PropertyCallExp_2= rulePropertyCallExp
                    {

                    			newCompositeNode(grammarAccess.getNotOpCallExpAccess().getPropertyCallExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyCallExp_2=rulePropertyCallExp();

                    state._fsp--;


                    			current = this_PropertyCallExp_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotOpCallExp"


    // $ANTLR start "entryRuleUNARYOP"
    // InternalOcl.g:1525:1: entryRuleUNARYOP returns [String current=null] : iv_ruleUNARYOP= ruleUNARYOP EOF ;
    public final String entryRuleUNARYOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNARYOP = null;


        try {
            // InternalOcl.g:1525:47: (iv_ruleUNARYOP= ruleUNARYOP EOF )
            // InternalOcl.g:1526:2: iv_ruleUNARYOP= ruleUNARYOP EOF
            {
             newCompositeNode(grammarAccess.getUNARYOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNARYOP=ruleUNARYOP();

            state._fsp--;

             current =iv_ruleUNARYOP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUNARYOP"


    // $ANTLR start "ruleUNARYOP"
    // InternalOcl.g:1532:1: ruleUNARYOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'not' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUNARYOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1538:2: ( (kw= 'not' | kw= '-' ) )
            // InternalOcl.g:1539:2: (kw= 'not' | kw= '-' )
            {
            // InternalOcl.g:1539:2: (kw= 'not' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            else if ( (LA23_0==33) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalOcl.g:1540:3: kw= 'not'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUNARYOPAccess().getNotKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1546:3: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUNARYOPAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUNARYOP"


    // $ANTLR start "entryRulePropertyCallExp"
    // InternalOcl.g:1555:1: entryRulePropertyCallExp returns [EObject current=null] : iv_rulePropertyCallExp= rulePropertyCallExp EOF ;
    public final EObject entryRulePropertyCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCallExp = null;


        try {
            // InternalOcl.g:1555:56: (iv_rulePropertyCallExp= rulePropertyCallExp EOF )
            // InternalOcl.g:1556:2: iv_rulePropertyCallExp= rulePropertyCallExp EOF
            {
             newCompositeNode(grammarAccess.getPropertyCallExpRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyCallExp=rulePropertyCallExp();

            state._fsp--;

             current =iv_rulePropertyCallExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyCallExp"


    // $ANTLR start "rulePropertyCallExp"
    // InternalOcl.g:1562:1: rulePropertyCallExp returns [EObject current=null] : ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* ) ;
    public final EObject rulePropertyCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_calls_1_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1568:2: ( ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* ) )
            // InternalOcl.g:1569:2: ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* )
            {
            // InternalOcl.g:1569:2: ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* )
            // InternalOcl.g:1570:3: ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )*
            {
            // InternalOcl.g:1570:3: ( (lv_source_0_0= rulePrimary_OclExpression ) )
            // InternalOcl.g:1571:4: (lv_source_0_0= rulePrimary_OclExpression )
            {
            // InternalOcl.g:1571:4: (lv_source_0_0= rulePrimary_OclExpression )
            // InternalOcl.g:1572:5: lv_source_0_0= rulePrimary_OclExpression
            {

            					newCompositeNode(grammarAccess.getPropertyCallExpAccess().getSourcePrimary_OclExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_source_0_0=rulePrimary_OclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyCallExpRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_0_0,
            						"fr.enseeiht.ocl.xtext.Ocl.Primary_OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOcl.g:1589:3: ( (lv_calls_1_0= rulePropertyCall ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=58 && LA24_0<=59)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOcl.g:1590:4: (lv_calls_1_0= rulePropertyCall )
            	    {
            	    // InternalOcl.g:1590:4: (lv_calls_1_0= rulePropertyCall )
            	    // InternalOcl.g:1591:5: lv_calls_1_0= rulePropertyCall
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyCallExpAccess().getCallsPropertyCallParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_calls_1_0=rulePropertyCall();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyCallExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"calls",
            	    						lv_calls_1_0,
            	    						"fr.enseeiht.ocl.xtext.Ocl.PropertyCall");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyCallExp"


    // $ANTLR start "entryRulePrimary_OclExpression"
    // InternalOcl.g:1612:1: entryRulePrimary_OclExpression returns [EObject current=null] : iv_rulePrimary_OclExpression= rulePrimary_OclExpression EOF ;
    public final EObject entryRulePrimary_OclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary_OclExpression = null;


        try {
            // InternalOcl.g:1612:62: (iv_rulePrimary_OclExpression= rulePrimary_OclExpression EOF )
            // InternalOcl.g:1613:2: iv_rulePrimary_OclExpression= rulePrimary_OclExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimary_OclExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary_OclExpression=rulePrimary_OclExpression();

            state._fsp--;

             current =iv_rulePrimary_OclExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary_OclExpression"


    // $ANTLR start "rulePrimary_OclExpression"
    // InternalOcl.g:1619:1: rulePrimary_OclExpression returns [EObject current=null] : (this_VariableExp_0= ruleVariableExp | this_SelfExp_1= ruleSelfExp | this_StringExp_2= ruleStringExp | this_BooleanExp_3= ruleBooleanExp | this_NumericExp_4= ruleNumericExp | this_BagExp_5= ruleBagExp | this_OrderedSetExp_6= ruleOrderedSetExp | this_SequenceExp_7= ruleSequenceExp | this_SetExp_8= ruleSetExp | this_TupleExp_9= ruleTupleExp | this_MapExp_10= ruleMapExp | this_EnumLiteralExp_11= ruleEnumLiteralExp | this_IfExp_12= ruleIfExp | this_BraceExp_13= ruleBraceExp | this_OclModelElementExp_14= ruleOclModelElementExp ) ;
    public final EObject rulePrimary_OclExpression() throws RecognitionException {
        EObject current = null;

        EObject this_VariableExp_0 = null;

        EObject this_SelfExp_1 = null;

        EObject this_StringExp_2 = null;

        EObject this_BooleanExp_3 = null;

        EObject this_NumericExp_4 = null;

        EObject this_BagExp_5 = null;

        EObject this_OrderedSetExp_6 = null;

        EObject this_SequenceExp_7 = null;

        EObject this_SetExp_8 = null;

        EObject this_TupleExp_9 = null;

        EObject this_MapExp_10 = null;

        EObject this_EnumLiteralExp_11 = null;

        EObject this_IfExp_12 = null;

        EObject this_BraceExp_13 = null;

        EObject this_OclModelElementExp_14 = null;



        	enterRule();

        try {
            // InternalOcl.g:1625:2: ( (this_VariableExp_0= ruleVariableExp | this_SelfExp_1= ruleSelfExp | this_StringExp_2= ruleStringExp | this_BooleanExp_3= ruleBooleanExp | this_NumericExp_4= ruleNumericExp | this_BagExp_5= ruleBagExp | this_OrderedSetExp_6= ruleOrderedSetExp | this_SequenceExp_7= ruleSequenceExp | this_SetExp_8= ruleSetExp | this_TupleExp_9= ruleTupleExp | this_MapExp_10= ruleMapExp | this_EnumLiteralExp_11= ruleEnumLiteralExp | this_IfExp_12= ruleIfExp | this_BraceExp_13= ruleBraceExp | this_OclModelElementExp_14= ruleOclModelElementExp ) )
            // InternalOcl.g:1626:2: (this_VariableExp_0= ruleVariableExp | this_SelfExp_1= ruleSelfExp | this_StringExp_2= ruleStringExp | this_BooleanExp_3= ruleBooleanExp | this_NumericExp_4= ruleNumericExp | this_BagExp_5= ruleBagExp | this_OrderedSetExp_6= ruleOrderedSetExp | this_SequenceExp_7= ruleSequenceExp | this_SetExp_8= ruleSetExp | this_TupleExp_9= ruleTupleExp | this_MapExp_10= ruleMapExp | this_EnumLiteralExp_11= ruleEnumLiteralExp | this_IfExp_12= ruleIfExp | this_BraceExp_13= ruleBraceExp | this_OclModelElementExp_14= ruleOclModelElementExp )
            {
            // InternalOcl.g:1626:2: (this_VariableExp_0= ruleVariableExp | this_SelfExp_1= ruleSelfExp | this_StringExp_2= ruleStringExp | this_BooleanExp_3= ruleBooleanExp | this_NumericExp_4= ruleNumericExp | this_BagExp_5= ruleBagExp | this_OrderedSetExp_6= ruleOrderedSetExp | this_SequenceExp_7= ruleSequenceExp | this_SetExp_8= ruleSetExp | this_TupleExp_9= ruleTupleExp | this_MapExp_10= ruleMapExp | this_EnumLiteralExp_11= ruleEnumLiteralExp | this_IfExp_12= ruleIfExp | this_BraceExp_13= ruleBraceExp | this_OclModelElementExp_14= ruleOclModelElementExp )
            int alt25=15;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalOcl.g:1627:3: this_VariableExp_0= ruleVariableExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getVariableExpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableExp_0=ruleVariableExp();

                    state._fsp--;


                    			current = this_VariableExp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1636:3: this_SelfExp_1= ruleSelfExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getSelfExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelfExp_1=ruleSelfExp();

                    state._fsp--;


                    			current = this_SelfExp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOcl.g:1645:3: this_StringExp_2= ruleStringExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getStringExpParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringExp_2=ruleStringExp();

                    state._fsp--;


                    			current = this_StringExp_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOcl.g:1654:3: this_BooleanExp_3= ruleBooleanExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getBooleanExpParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanExp_3=ruleBooleanExp();

                    state._fsp--;


                    			current = this_BooleanExp_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOcl.g:1663:3: this_NumericExp_4= ruleNumericExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getNumericExpParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericExp_4=ruleNumericExp();

                    state._fsp--;


                    			current = this_NumericExp_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOcl.g:1672:3: this_BagExp_5= ruleBagExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getBagExpParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_BagExp_5=ruleBagExp();

                    state._fsp--;


                    			current = this_BagExp_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOcl.g:1681:3: this_OrderedSetExp_6= ruleOrderedSetExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getOrderedSetExpParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrderedSetExp_6=ruleOrderedSetExp();

                    state._fsp--;


                    			current = this_OrderedSetExp_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalOcl.g:1690:3: this_SequenceExp_7= ruleSequenceExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getSequenceExpParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceExp_7=ruleSequenceExp();

                    state._fsp--;


                    			current = this_SequenceExp_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalOcl.g:1699:3: this_SetExp_8= ruleSetExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getSetExpParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetExp_8=ruleSetExp();

                    state._fsp--;


                    			current = this_SetExp_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalOcl.g:1708:3: this_TupleExp_9= ruleTupleExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getTupleExpParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_TupleExp_9=ruleTupleExp();

                    state._fsp--;


                    			current = this_TupleExp_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalOcl.g:1717:3: this_MapExp_10= ruleMapExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getMapExpParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_MapExp_10=ruleMapExp();

                    state._fsp--;


                    			current = this_MapExp_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalOcl.g:1726:3: this_EnumLiteralExp_11= ruleEnumLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getEnumLiteralExpParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumLiteralExp_11=ruleEnumLiteralExp();

                    state._fsp--;


                    			current = this_EnumLiteralExp_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalOcl.g:1735:3: this_IfExp_12= ruleIfExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getIfExpParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfExp_12=ruleIfExp();

                    state._fsp--;


                    			current = this_IfExp_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalOcl.g:1744:3: this_BraceExp_13= ruleBraceExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getBraceExpParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_BraceExp_13=ruleBraceExp();

                    state._fsp--;


                    			current = this_BraceExp_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalOcl.g:1753:3: this_OclModelElementExp_14= ruleOclModelElementExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getOclModelElementExpParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_OclModelElementExp_14=ruleOclModelElementExp();

                    state._fsp--;


                    			current = this_OclModelElementExp_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary_OclExpression"


    // $ANTLR start "entryRuleVariableExp"
    // InternalOcl.g:1765:1: entryRuleVariableExp returns [EObject current=null] : iv_ruleVariableExp= ruleVariableExp EOF ;
    public final EObject entryRuleVariableExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExp = null;


        try {
            // InternalOcl.g:1765:52: (iv_ruleVariableExp= ruleVariableExp EOF )
            // InternalOcl.g:1766:2: iv_ruleVariableExp= ruleVariableExp EOF
            {
             newCompositeNode(grammarAccess.getVariableExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableExp=ruleVariableExp();

            state._fsp--;

             current =iv_ruleVariableExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableExp"


    // $ANTLR start "ruleVariableExp"
    // InternalOcl.g:1772:1: ruleVariableExp returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOcl.g:1778:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalOcl.g:1779:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalOcl.g:1779:2: ( (otherlv_0= RULE_ID ) )
            // InternalOcl.g:1780:3: (otherlv_0= RULE_ID )
            {
            // InternalOcl.g:1780:3: (otherlv_0= RULE_ID )
            // InternalOcl.g:1781:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableExpRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableExpAccess().getReferredVariableAuxiliaryCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableExp"


    // $ANTLR start "entryRuleSelfExp"
    // InternalOcl.g:1795:1: entryRuleSelfExp returns [EObject current=null] : iv_ruleSelfExp= ruleSelfExp EOF ;
    public final EObject entryRuleSelfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExp = null;


        try {
            // InternalOcl.g:1795:48: (iv_ruleSelfExp= ruleSelfExp EOF )
            // InternalOcl.g:1796:2: iv_ruleSelfExp= ruleSelfExp EOF
            {
             newCompositeNode(grammarAccess.getSelfExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelfExp=ruleSelfExp();

            state._fsp--;

             current =iv_ruleSelfExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelfExp"


    // $ANTLR start "ruleSelfExp"
    // InternalOcl.g:1802:1: ruleSelfExp returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:1808:2: ( ( () otherlv_1= 'self' ) )
            // InternalOcl.g:1809:2: ( () otherlv_1= 'self' )
            {
            // InternalOcl.g:1809:2: ( () otherlv_1= 'self' )
            // InternalOcl.g:1810:3: () otherlv_1= 'self'
            {
            // InternalOcl.g:1810:3: ()
            // InternalOcl.g:1811:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelfExpAccess().getSelfExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSelfExpAccess().getSelfKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelfExp"


    // $ANTLR start "entryRuleStringExp"
    // InternalOcl.g:1825:1: entryRuleStringExp returns [EObject current=null] : iv_ruleStringExp= ruleStringExp EOF ;
    public final EObject entryRuleStringExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExp = null;


        try {
            // InternalOcl.g:1825:50: (iv_ruleStringExp= ruleStringExp EOF )
            // InternalOcl.g:1826:2: iv_ruleStringExp= ruleStringExp EOF
            {
             newCompositeNode(grammarAccess.getStringExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringExp=ruleStringExp();

            state._fsp--;

             current =iv_ruleStringExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringExp"


    // $ANTLR start "ruleStringExp"
    // InternalOcl.g:1832:1: ruleStringExp returns [EObject current=null] : ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringExp() throws RecognitionException {
        EObject current = null;

        Token lv_stringSymbol_1_0=null;


        	enterRule();

        try {
            // InternalOcl.g:1838:2: ( ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) ) )
            // InternalOcl.g:1839:2: ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) )
            {
            // InternalOcl.g:1839:2: ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) )
            // InternalOcl.g:1840:3: () ( (lv_stringSymbol_1_0= RULE_STRING ) )
            {
            // InternalOcl.g:1840:3: ()
            // InternalOcl.g:1841:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringExpAccess().getStringExpAction_0(),
            					current);
            			

            }

            // InternalOcl.g:1847:3: ( (lv_stringSymbol_1_0= RULE_STRING ) )
            // InternalOcl.g:1848:4: (lv_stringSymbol_1_0= RULE_STRING )
            {
            // InternalOcl.g:1848:4: (lv_stringSymbol_1_0= RULE_STRING )
            // InternalOcl.g:1849:5: lv_stringSymbol_1_0= RULE_STRING
            {
            lv_stringSymbol_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_stringSymbol_1_0, grammarAccess.getStringExpAccess().getStringSymbolSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stringSymbol",
            						lv_stringSymbol_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringExp"


    // $ANTLR start "entryRuleNumericExp"
    // InternalOcl.g:1869:1: entryRuleNumericExp returns [EObject current=null] : iv_ruleNumericExp= ruleNumericExp EOF ;
    public final EObject entryRuleNumericExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericExp = null;


        try {
            // InternalOcl.g:1869:51: (iv_ruleNumericExp= ruleNumericExp EOF )
            // InternalOcl.g:1870:2: iv_ruleNumericExp= ruleNumericExp EOF
            {
             newCompositeNode(grammarAccess.getNumericExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericExp=ruleNumericExp();

            state._fsp--;

             current =iv_ruleNumericExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericExp"


    // $ANTLR start "ruleNumericExp"
    // InternalOcl.g:1876:1: ruleNumericExp returns [EObject current=null] : (this_RealExp_0= ruleRealExp | this_IntegerExp_1= ruleIntegerExp ) ;
    public final EObject ruleNumericExp() throws RecognitionException {
        EObject current = null;

        EObject this_RealExp_0 = null;

        EObject this_IntegerExp_1 = null;



        	enterRule();

        try {
            // InternalOcl.g:1882:2: ( (this_RealExp_0= ruleRealExp | this_IntegerExp_1= ruleIntegerExp ) )
            // InternalOcl.g:1883:2: (this_RealExp_0= ruleRealExp | this_IntegerExp_1= ruleIntegerExp )
            {
            // InternalOcl.g:1883:2: (this_RealExp_0= ruleRealExp | this_IntegerExp_1= ruleIntegerExp )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DOUBLE) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_INT) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalOcl.g:1884:3: this_RealExp_0= ruleRealExp
                    {

                    			newCompositeNode(grammarAccess.getNumericExpAccess().getRealExpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealExp_0=ruleRealExp();

                    state._fsp--;


                    			current = this_RealExp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1893:3: this_IntegerExp_1= ruleIntegerExp
                    {

                    			newCompositeNode(grammarAccess.getNumericExpAccess().getIntegerExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerExp_1=ruleIntegerExp();

                    state._fsp--;


                    			current = this_IntegerExp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericExp"


    // $ANTLR start "entryRuleRealExp"
    // InternalOcl.g:1905:1: entryRuleRealExp returns [EObject current=null] : iv_ruleRealExp= ruleRealExp EOF ;
    public final EObject entryRuleRealExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealExp = null;


        try {
            // InternalOcl.g:1905:48: (iv_ruleRealExp= ruleRealExp EOF )
            // InternalOcl.g:1906:2: iv_ruleRealExp= ruleRealExp EOF
            {
             newCompositeNode(grammarAccess.getRealExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealExp=ruleRealExp();

            state._fsp--;

             current =iv_ruleRealExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealExp"


    // $ANTLR start "ruleRealExp"
    // InternalOcl.g:1912:1: ruleRealExp returns [EObject current=null] : ( (lv_realSymbol_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleRealExp() throws RecognitionException {
        EObject current = null;

        Token lv_realSymbol_0_0=null;


        	enterRule();

        try {
            // InternalOcl.g:1918:2: ( ( (lv_realSymbol_0_0= RULE_DOUBLE ) ) )
            // InternalOcl.g:1919:2: ( (lv_realSymbol_0_0= RULE_DOUBLE ) )
            {
            // InternalOcl.g:1919:2: ( (lv_realSymbol_0_0= RULE_DOUBLE ) )
            // InternalOcl.g:1920:3: (lv_realSymbol_0_0= RULE_DOUBLE )
            {
            // InternalOcl.g:1920:3: (lv_realSymbol_0_0= RULE_DOUBLE )
            // InternalOcl.g:1921:4: lv_realSymbol_0_0= RULE_DOUBLE
            {
            lv_realSymbol_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            				newLeafNode(lv_realSymbol_0_0, grammarAccess.getRealExpAccess().getRealSymbolDOUBLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRealExpRule());
            				}
            				setWithLastConsumed(
            					current,
            					"realSymbol",
            					lv_realSymbol_0_0,
            					"fr.enseeiht.ocl.xtext.Ocl.DOUBLE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealExp"


    // $ANTLR start "entryRuleIntegerExp"
    // InternalOcl.g:1940:1: entryRuleIntegerExp returns [EObject current=null] : iv_ruleIntegerExp= ruleIntegerExp EOF ;
    public final EObject entryRuleIntegerExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExp = null;


        try {
            // InternalOcl.g:1940:51: (iv_ruleIntegerExp= ruleIntegerExp EOF )
            // InternalOcl.g:1941:2: iv_ruleIntegerExp= ruleIntegerExp EOF
            {
             newCompositeNode(grammarAccess.getIntegerExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerExp=ruleIntegerExp();

            state._fsp--;

             current =iv_ruleIntegerExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerExp"


    // $ANTLR start "ruleIntegerExp"
    // InternalOcl.g:1947:1: ruleIntegerExp returns [EObject current=null] : ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerExp() throws RecognitionException {
        EObject current = null;

        Token lv_integerSymbol_1_0=null;


        	enterRule();

        try {
            // InternalOcl.g:1953:2: ( ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) ) )
            // InternalOcl.g:1954:2: ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) )
            {
            // InternalOcl.g:1954:2: ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) )
            // InternalOcl.g:1955:3: () ( (lv_integerSymbol_1_0= RULE_INT ) )
            {
            // InternalOcl.g:1955:3: ()
            // InternalOcl.g:1956:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerExpAccess().getIntegerExpAction_0(),
            					current);
            			

            }

            // InternalOcl.g:1962:3: ( (lv_integerSymbol_1_0= RULE_INT ) )
            // InternalOcl.g:1963:4: (lv_integerSymbol_1_0= RULE_INT )
            {
            // InternalOcl.g:1963:4: (lv_integerSymbol_1_0= RULE_INT )
            // InternalOcl.g:1964:5: lv_integerSymbol_1_0= RULE_INT
            {
            lv_integerSymbol_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_integerSymbol_1_0, grammarAccess.getIntegerExpAccess().getIntegerSymbolINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"integerSymbol",
            						lv_integerSymbol_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerExp"


    // $ANTLR start "entryRuleBagExp"
    // InternalOcl.g:1984:1: entryRuleBagExp returns [EObject current=null] : iv_ruleBagExp= ruleBagExp EOF ;
    public final EObject entryRuleBagExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagExp = null;


        try {
            // InternalOcl.g:1984:47: (iv_ruleBagExp= ruleBagExp EOF )
            // InternalOcl.g:1985:2: iv_ruleBagExp= ruleBagExp EOF
            {
             newCompositeNode(grammarAccess.getBagExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBagExp=ruleBagExp();

            state._fsp--;

             current =iv_ruleBagExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBagExp"


    // $ANTLR start "ruleBagExp"
    // InternalOcl.g:1991:1: ruleBagExp returns [EObject current=null] : ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleBagExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1997:2: ( ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:1998:2: ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:1998:2: ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:1999:3: () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:1999:3: ()
            // InternalOcl.g:2000:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBagExpAccess().getBagExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getBagExpAccess().getBagKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getBagExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2014:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_INT)||LA28_0==19||LA28_0==33||(LA28_0>=39 && LA28_0<=41)||(LA28_0>=44 && LA28_0<=50)||LA28_0==52||(LA28_0>=56 && LA28_0<=57)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOcl.g:2015:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:2015:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalOcl.g:2016:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:2016:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalOcl.g:2017:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getBagExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_elements_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBagExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:2034:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==20) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalOcl.g:2035:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getBagExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2039:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:2040:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:2040:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalOcl.g:2041:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getBagExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_elements_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBagExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_5_0,
                    	    								"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBagExpAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBagExp"


    // $ANTLR start "entryRuleOrderedSetExp"
    // InternalOcl.g:2068:1: entryRuleOrderedSetExp returns [EObject current=null] : iv_ruleOrderedSetExp= ruleOrderedSetExp EOF ;
    public final EObject entryRuleOrderedSetExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedSetExp = null;


        try {
            // InternalOcl.g:2068:54: (iv_ruleOrderedSetExp= ruleOrderedSetExp EOF )
            // InternalOcl.g:2069:2: iv_ruleOrderedSetExp= ruleOrderedSetExp EOF
            {
             newCompositeNode(grammarAccess.getOrderedSetExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderedSetExp=ruleOrderedSetExp();

            state._fsp--;

             current =iv_ruleOrderedSetExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderedSetExp"


    // $ANTLR start "ruleOrderedSetExp"
    // InternalOcl.g:2075:1: ruleOrderedSetExp returns [EObject current=null] : ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleOrderedSetExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2081:2: ( ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2082:2: ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2082:2: ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2083:3: () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2083:3: ()
            // InternalOcl.g:2084:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrderedSetExpAccess().getOrderedSetExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderedSetExpAccess().getOrderedSetKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getOrderedSetExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2098:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_INT)||LA30_0==19||LA30_0==33||(LA30_0>=39 && LA30_0<=41)||(LA30_0>=44 && LA30_0<=50)||LA30_0==52||(LA30_0>=56 && LA30_0<=57)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOcl.g:2099:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:2099:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalOcl.g:2100:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:2100:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalOcl.g:2101:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getOrderedSetExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_elements_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrderedSetExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:2118:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==20) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalOcl.g:2119:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOrderedSetExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2123:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:2124:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:2124:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalOcl.g:2125:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getOrderedSetExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_elements_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOrderedSetExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_5_0,
                    	    								"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOrderedSetExpAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderedSetExp"


    // $ANTLR start "entryRuleSequenceExp"
    // InternalOcl.g:2152:1: entryRuleSequenceExp returns [EObject current=null] : iv_ruleSequenceExp= ruleSequenceExp EOF ;
    public final EObject entryRuleSequenceExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceExp = null;


        try {
            // InternalOcl.g:2152:52: (iv_ruleSequenceExp= ruleSequenceExp EOF )
            // InternalOcl.g:2153:2: iv_ruleSequenceExp= ruleSequenceExp EOF
            {
             newCompositeNode(grammarAccess.getSequenceExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceExp=ruleSequenceExp();

            state._fsp--;

             current =iv_ruleSequenceExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceExp"


    // $ANTLR start "ruleSequenceExp"
    // InternalOcl.g:2159:1: ruleSequenceExp returns [EObject current=null] : ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleSequenceExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2165:2: ( ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2166:2: ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2166:2: ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2167:3: () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2167:3: ()
            // InternalOcl.g:2168:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceExpAccess().getSequenceExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceExpAccess().getSequenceKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2182:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_INT)||LA32_0==19||LA32_0==33||(LA32_0>=39 && LA32_0<=41)||(LA32_0>=44 && LA32_0<=50)||LA32_0==52||(LA32_0>=56 && LA32_0<=57)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOcl.g:2183:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:2183:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalOcl.g:2184:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:2184:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalOcl.g:2185:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_elements_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:2202:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==20) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalOcl.g:2203:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSequenceExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2207:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:2208:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:2208:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalOcl.g:2209:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_elements_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_5_0,
                    	    								"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSequenceExpAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceExp"


    // $ANTLR start "entryRuleSetExp"
    // InternalOcl.g:2236:1: entryRuleSetExp returns [EObject current=null] : iv_ruleSetExp= ruleSetExp EOF ;
    public final EObject entryRuleSetExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetExp = null;


        try {
            // InternalOcl.g:2236:47: (iv_ruleSetExp= ruleSetExp EOF )
            // InternalOcl.g:2237:2: iv_ruleSetExp= ruleSetExp EOF
            {
             newCompositeNode(grammarAccess.getSetExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetExp=ruleSetExp();

            state._fsp--;

             current =iv_ruleSetExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetExp"


    // $ANTLR start "ruleSetExp"
    // InternalOcl.g:2243:1: ruleSetExp returns [EObject current=null] : ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleSetExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2249:2: ( ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2250:2: ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2250:2: ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2251:3: () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2251:3: ()
            // InternalOcl.g:2252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetExpAccess().getSetExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getSetExpAccess().getSetKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getSetExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2266:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_INT)||LA34_0==19||LA34_0==33||(LA34_0>=39 && LA34_0<=41)||(LA34_0>=44 && LA34_0<=50)||LA34_0==52||(LA34_0>=56 && LA34_0<=57)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOcl.g:2267:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:2267:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalOcl.g:2268:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:2268:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalOcl.g:2269:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getSetExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_elements_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:2286:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==20) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalOcl.g:2287:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSetExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2291:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:2292:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:2292:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalOcl.g:2293:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSetExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_elements_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSetExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_5_0,
                    	    								"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSetExpAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetExp"


    // $ANTLR start "entryRuleTupleExp"
    // InternalOcl.g:2320:1: entryRuleTupleExp returns [EObject current=null] : iv_ruleTupleExp= ruleTupleExp EOF ;
    public final EObject entryRuleTupleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleExp = null;


        try {
            // InternalOcl.g:2320:49: (iv_ruleTupleExp= ruleTupleExp EOF )
            // InternalOcl.g:2321:2: iv_ruleTupleExp= ruleTupleExp EOF
            {
             newCompositeNode(grammarAccess.getTupleExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTupleExp=ruleTupleExp();

            state._fsp--;

             current =iv_ruleTupleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleExp"


    // $ANTLR start "ruleTupleExp"
    // InternalOcl.g:2327:1: ruleTupleExp returns [EObject current=null] : ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleTupleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_tuplePart_3_0 = null;

        EObject lv_tuplePart_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2333:2: ( ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2334:2: ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2334:2: ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2335:3: () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2335:3: ()
            // InternalOcl.g:2336:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTupleExpAccess().getTupleExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleExpAccess().getTupleKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getTupleExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2350:3: ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOcl.g:2351:4: ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )*
                    {
                    // InternalOcl.g:2351:4: ( (lv_tuplePart_3_0= ruleTuplePart ) )
                    // InternalOcl.g:2352:5: (lv_tuplePart_3_0= ruleTuplePart )
                    {
                    // InternalOcl.g:2352:5: (lv_tuplePart_3_0= ruleTuplePart )
                    // InternalOcl.g:2353:6: lv_tuplePart_3_0= ruleTuplePart
                    {

                    						newCompositeNode(grammarAccess.getTupleExpAccess().getTuplePartTuplePartParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tuplePart_3_0=ruleTuplePart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTupleExpRule());
                    						}
                    						add(
                    							current,
                    							"tuplePart",
                    							lv_tuplePart_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.TuplePart");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:2370:4: (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==20) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalOcl.g:2371:5: otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTupleExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2375:5: ( (lv_tuplePart_5_0= ruleTuplePart ) )
                    	    // InternalOcl.g:2376:6: (lv_tuplePart_5_0= ruleTuplePart )
                    	    {
                    	    // InternalOcl.g:2376:6: (lv_tuplePart_5_0= ruleTuplePart )
                    	    // InternalOcl.g:2377:7: lv_tuplePart_5_0= ruleTuplePart
                    	    {

                    	    							newCompositeNode(grammarAccess.getTupleExpAccess().getTuplePartTuplePartParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_tuplePart_5_0=ruleTuplePart();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTupleExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tuplePart",
                    	    								lv_tuplePart_5_0,
                    	    								"fr.enseeiht.ocl.xtext.Ocl.TuplePart");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTupleExpAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleExp"


    // $ANTLR start "entryRuleTuplePart"
    // InternalOcl.g:2404:1: entryRuleTuplePart returns [EObject current=null] : iv_ruleTuplePart= ruleTuplePart EOF ;
    public final EObject entryRuleTuplePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePart = null;


        try {
            // InternalOcl.g:2404:50: (iv_ruleTuplePart= ruleTuplePart EOF )
            // InternalOcl.g:2405:2: iv_ruleTuplePart= ruleTuplePart EOF
            {
             newCompositeNode(grammarAccess.getTuplePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTuplePart=ruleTuplePart();

            state._fsp--;

             current =iv_ruleTuplePart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuplePart"


    // $ANTLR start "ruleTuplePart"
    // InternalOcl.g:2411:1: ruleTuplePart returns [EObject current=null] : ( ( (lv_varName_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) ;
    public final EObject ruleTuplePart() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2417:2: ( ( ( (lv_varName_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:2418:2: ( ( (lv_varName_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:2418:2: ( ( (lv_varName_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            // InternalOcl.g:2419:3: ( (lv_varName_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) )
            {
            // InternalOcl.g:2419:3: ( (lv_varName_0_0= RULE_STRING ) )
            // InternalOcl.g:2420:4: (lv_varName_0_0= RULE_STRING )
            {
            // InternalOcl.g:2420:4: (lv_varName_0_0= RULE_STRING )
            // InternalOcl.g:2421:5: lv_varName_0_0= RULE_STRING
            {
            lv_varName_0_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_varName_0_0, grammarAccess.getTuplePartAccess().getVarNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTuplePartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOcl.g:2437:3: (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==17) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOcl.g:2438:4: otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getTuplePartAccess().getColonKeyword_1_0());
                    			
                    // InternalOcl.g:2442:4: ( (lv_type_2_0= ruleOclType ) )
                    // InternalOcl.g:2443:5: (lv_type_2_0= ruleOclType )
                    {
                    // InternalOcl.g:2443:5: (lv_type_2_0= ruleOclType )
                    // InternalOcl.g:2444:6: lv_type_2_0= ruleOclType
                    {

                    						newCompositeNode(grammarAccess.getTuplePartAccess().getTypeOclTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_type_2_0=ruleOclType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTuplePartRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getTuplePartAccess().getEqualsSignKeyword_2());
            		
            // InternalOcl.g:2466:3: ( (lv_initExpression_4_0= ruleOclExpression ) )
            // InternalOcl.g:2467:4: (lv_initExpression_4_0= ruleOclExpression )
            {
            // InternalOcl.g:2467:4: (lv_initExpression_4_0= ruleOclExpression )
            // InternalOcl.g:2468:5: lv_initExpression_4_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getTuplePartAccess().getInitExpressionOclExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_initExpression_4_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTuplePartRule());
            					}
            					set(
            						current,
            						"initExpression",
            						lv_initExpression_4_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuplePart"


    // $ANTLR start "entryRuleMapExp"
    // InternalOcl.g:2489:1: entryRuleMapExp returns [EObject current=null] : iv_ruleMapExp= ruleMapExp EOF ;
    public final EObject entryRuleMapExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapExp = null;


        try {
            // InternalOcl.g:2489:47: (iv_ruleMapExp= ruleMapExp EOF )
            // InternalOcl.g:2490:2: iv_ruleMapExp= ruleMapExp EOF
            {
             newCompositeNode(grammarAccess.getMapExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapExp=ruleMapExp();

            state._fsp--;

             current =iv_ruleMapExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapExp"


    // $ANTLR start "ruleMapExp"
    // InternalOcl.g:2496:1: ruleMapExp returns [EObject current=null] : ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleMapExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2502:2: ( ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2503:2: ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2503:2: ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2504:3: () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2504:3: ()
            // InternalOcl.g:2505:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapExpAccess().getMapExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getMapExpAccess().getMapKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getMapExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2519:3: ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==19) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOcl.g:2520:4: ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )*
                    {
                    // InternalOcl.g:2520:4: ( (lv_elements_3_0= ruleMapElement ) )
                    // InternalOcl.g:2521:5: (lv_elements_3_0= ruleMapElement )
                    {
                    // InternalOcl.g:2521:5: (lv_elements_3_0= ruleMapElement )
                    // InternalOcl.g:2522:6: lv_elements_3_0= ruleMapElement
                    {

                    						newCompositeNode(grammarAccess.getMapExpAccess().getElementsMapElementParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_elements_3_0=ruleMapElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMapExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.MapElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:2539:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==20) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalOcl.g:2540:5: otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_16); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMapExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2544:5: ( (lv_elements_5_0= ruleMapElement ) )
                    	    // InternalOcl.g:2545:6: (lv_elements_5_0= ruleMapElement )
                    	    {
                    	    // InternalOcl.g:2545:6: (lv_elements_5_0= ruleMapElement )
                    	    // InternalOcl.g:2546:7: lv_elements_5_0= ruleMapElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMapExpAccess().getElementsMapElementParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_elements_5_0=ruleMapElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMapExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_5_0,
                    	    								"fr.enseeiht.ocl.xtext.Ocl.MapElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMapExpAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapExp"


    // $ANTLR start "entryRuleMapElement"
    // InternalOcl.g:2573:1: entryRuleMapElement returns [EObject current=null] : iv_ruleMapElement= ruleMapElement EOF ;
    public final EObject entryRuleMapElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapElement = null;


        try {
            // InternalOcl.g:2573:51: (iv_ruleMapElement= ruleMapElement EOF )
            // InternalOcl.g:2574:2: iv_ruleMapElement= ruleMapElement EOF
            {
             newCompositeNode(grammarAccess.getMapElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapElement=ruleMapElement();

            state._fsp--;

             current =iv_ruleMapElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapElement"


    // $ANTLR start "ruleMapElement"
    // InternalOcl.g:2580:1: ruleMapElement returns [EObject current=null] : (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMapElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_key_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2586:2: ( (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' ) )
            // InternalOcl.g:2587:2: (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' )
            {
            // InternalOcl.g:2587:2: (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' )
            // InternalOcl.g:2588:3: otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMapElementAccess().getLeftParenthesisKeyword_0());
            		
            // InternalOcl.g:2592:3: ( (lv_key_1_0= ruleOclExpression ) )
            // InternalOcl.g:2593:4: (lv_key_1_0= ruleOclExpression )
            {
            // InternalOcl.g:2593:4: (lv_key_1_0= ruleOclExpression )
            // InternalOcl.g:2594:5: lv_key_1_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getMapElementAccess().getKeyOclExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_key_1_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapElementRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMapElementAccess().getCommaKeyword_2());
            		
            // InternalOcl.g:2615:3: ( (lv_value_3_0= ruleOclExpression ) )
            // InternalOcl.g:2616:4: (lv_value_3_0= ruleOclExpression )
            {
            // InternalOcl.g:2616:4: (lv_value_3_0= ruleOclExpression )
            // InternalOcl.g:2617:5: lv_value_3_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getMapElementAccess().getValueOclExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_value_3_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapElementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMapElementAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapElement"


    // $ANTLR start "entryRuleEnumLiteralExp"
    // InternalOcl.g:2642:1: entryRuleEnumLiteralExp returns [EObject current=null] : iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF ;
    public final EObject entryRuleEnumLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralExp = null;


        try {
            // InternalOcl.g:2642:55: (iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF )
            // InternalOcl.g:2643:2: iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumLiteralExp=ruleEnumLiteralExp();

            state._fsp--;

             current =iv_ruleEnumLiteralExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumLiteralExp"


    // $ANTLR start "ruleEnumLiteralExp"
    // InternalOcl.g:2649:1: ruleEnumLiteralExp returns [EObject current=null] : (otherlv_0= '#' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleEnumLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalOcl.g:2655:2: ( (otherlv_0= '#' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ) )
            // InternalOcl.g:2656:2: (otherlv_0= '#' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            {
            // InternalOcl.g:2656:2: (otherlv_0= '#' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalOcl.g:2657:3: otherlv_0= '#' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumLiteralExpAccess().getNumberSignKeyword_0());
            		
            // InternalOcl.g:2661:3: ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalOcl.g:2662:4: ( (lv_name_1_0= RULE_STRING ) )
                    {
                    // InternalOcl.g:2662:4: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalOcl.g:2663:5: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOcl.g:2663:5: (lv_name_1_0= RULE_STRING )
                    // InternalOcl.g:2664:6: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getEnumLiteralExpAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumLiteralExpRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOcl.g:2681:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalOcl.g:2681:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalOcl.g:2682:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalOcl.g:2682:5: (lv_name_2_0= RULE_ID )
                    // InternalOcl.g:2683:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getEnumLiteralExpAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumLiteralExpRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumLiteralExp"


    // $ANTLR start "entryRuleLetExp"
    // InternalOcl.g:2704:1: entryRuleLetExp returns [EObject current=null] : iv_ruleLetExp= ruleLetExp EOF ;
    public final EObject entryRuleLetExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExp = null;


        try {
            // InternalOcl.g:2704:47: (iv_ruleLetExp= ruleLetExp EOF )
            // InternalOcl.g:2705:2: iv_ruleLetExp= ruleLetExp EOF
            {
             newCompositeNode(grammarAccess.getLetExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetExp=ruleLetExp();

            state._fsp--;

             current =iv_ruleLetExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetExp"


    // $ANTLR start "ruleLetExp"
    // InternalOcl.g:2711:1: ruleLetExp returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) ) ;
    public final EObject ruleLetExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_in__3_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2717:2: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:2718:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:2718:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) )
            // InternalOcl.g:2719:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLetExpAccess().getLetKeyword_0());
            		
            // InternalOcl.g:2723:3: ( (lv_variable_1_0= ruleLocalVariable ) )
            // InternalOcl.g:2724:4: (lv_variable_1_0= ruleLocalVariable )
            {
            // InternalOcl.g:2724:4: (lv_variable_1_0= ruleLocalVariable )
            // InternalOcl.g:2725:5: lv_variable_1_0= ruleLocalVariable
            {

            					newCompositeNode(grammarAccess.getLetExpAccess().getVariableLocalVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_variable_1_0=ruleLocalVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetExpRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"fr.enseeiht.ocl.xtext.Ocl.LocalVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getLetExpAccess().getInKeyword_2());
            		
            // InternalOcl.g:2746:3: ( (lv_in__3_0= ruleOclExpression ) )
            // InternalOcl.g:2747:4: (lv_in__3_0= ruleOclExpression )
            {
            // InternalOcl.g:2747:4: (lv_in__3_0= ruleOclExpression )
            // InternalOcl.g:2748:5: lv_in__3_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getLetExpAccess().getIn_OclExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_in__3_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetExpRule());
            					}
            					set(
            						current,
            						"in_",
            						lv_in__3_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetExp"


    // $ANTLR start "entryRuleIfExp"
    // InternalOcl.g:2769:1: entryRuleIfExp returns [EObject current=null] : iv_ruleIfExp= ruleIfExp EOF ;
    public final EObject entryRuleIfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExp = null;


        try {
            // InternalOcl.g:2769:46: (iv_ruleIfExp= ruleIfExp EOF )
            // InternalOcl.g:2770:2: iv_ruleIfExp= ruleIfExp EOF
            {
             newCompositeNode(grammarAccess.getIfExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfExp=ruleIfExp();

            state._fsp--;

             current =iv_ruleIfExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExp"


    // $ANTLR start "ruleIfExp"
    // InternalOcl.g:2776:1: ruleIfExp returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) ;
    public final EObject ruleIfExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenExpression_3_0 = null;

        EObject lv_elseExpression_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2782:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) )
            // InternalOcl.g:2783:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            {
            // InternalOcl.g:2783:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            // InternalOcl.g:2784:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpAccess().getIfKeyword_0());
            		
            // InternalOcl.g:2788:3: ( (lv_condition_1_0= ruleOclExpression ) )
            // InternalOcl.g:2789:4: (lv_condition_1_0= ruleOclExpression )
            {
            // InternalOcl.g:2789:4: (lv_condition_1_0= ruleOclExpression )
            // InternalOcl.g:2790:5: lv_condition_1_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIfExpAccess().getConditionOclExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
            lv_condition_1_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getIfExpAccess().getThenKeyword_2());
            		
            // InternalOcl.g:2811:3: ( (lv_thenExpression_3_0= ruleOclExpression ) )
            // InternalOcl.g:2812:4: (lv_thenExpression_3_0= ruleOclExpression )
            {
            // InternalOcl.g:2812:4: (lv_thenExpression_3_0= ruleOclExpression )
            // InternalOcl.g:2813:5: lv_thenExpression_3_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIfExpAccess().getThenExpressionOclExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
            lv_thenExpression_3_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpRule());
            					}
            					set(
            						current,
            						"thenExpression",
            						lv_thenExpression_3_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,54,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpAccess().getElseKeyword_4());
            		
            // InternalOcl.g:2834:3: ( (lv_elseExpression_5_0= ruleOclExpression ) )
            // InternalOcl.g:2835:4: (lv_elseExpression_5_0= ruleOclExpression )
            {
            // InternalOcl.g:2835:4: (lv_elseExpression_5_0= ruleOclExpression )
            // InternalOcl.g:2836:5: lv_elseExpression_5_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIfExpAccess().getElseExpressionOclExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_39);
            lv_elseExpression_5_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpRule());
            					}
            					set(
            						current,
            						"elseExpression",
            						lv_elseExpression_5_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIfExpAccess().getEndifKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfExp"


    // $ANTLR start "entryRuleBraceExp"
    // InternalOcl.g:2861:1: entryRuleBraceExp returns [EObject current=null] : iv_ruleBraceExp= ruleBraceExp EOF ;
    public final EObject entryRuleBraceExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBraceExp = null;


        try {
            // InternalOcl.g:2861:49: (iv_ruleBraceExp= ruleBraceExp EOF )
            // InternalOcl.g:2862:2: iv_ruleBraceExp= ruleBraceExp EOF
            {
             newCompositeNode(grammarAccess.getBraceExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBraceExp=ruleBraceExp();

            state._fsp--;

             current =iv_ruleBraceExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBraceExp"


    // $ANTLR start "ruleBraceExp"
    // InternalOcl.g:2868:1: ruleBraceExp returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBraceExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2874:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' ) )
            // InternalOcl.g:2875:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' )
            {
            // InternalOcl.g:2875:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' )
            // InternalOcl.g:2876:3: otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getBraceExpAccess().getLeftParenthesisKeyword_0());
            		
            // InternalOcl.g:2880:3: ( (lv_exp_1_0= ruleOclExpression ) )
            // InternalOcl.g:2881:4: (lv_exp_1_0= ruleOclExpression )
            {
            // InternalOcl.g:2881:4: (lv_exp_1_0= ruleOclExpression )
            // InternalOcl.g:2882:5: lv_exp_1_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getBraceExpAccess().getExpOclExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_exp_1_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBraceExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBraceExpAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBraceExp"


    // $ANTLR start "entryRuleBooleanExp"
    // InternalOcl.g:2907:1: entryRuleBooleanExp returns [EObject current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final EObject entryRuleBooleanExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExp = null;


        try {
            // InternalOcl.g:2907:51: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // InternalOcl.g:2908:2: iv_ruleBooleanExp= ruleBooleanExp EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExp=ruleBooleanExp();

            state._fsp--;

             current =iv_ruleBooleanExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExp"


    // $ANTLR start "ruleBooleanExp"
    // InternalOcl.g:2914:1: ruleBooleanExp returns [EObject current=null] : ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanExp() throws RecognitionException {
        EObject current = null;

        Token lv_booleanSymbol_0_0=null;
        Token lv_booleanSymbol_1_0=null;


        	enterRule();

        try {
            // InternalOcl.g:2920:2: ( ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) ) )
            // InternalOcl.g:2921:2: ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) )
            {
            // InternalOcl.g:2921:2: ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==56) ) {
                alt41=1;
            }
            else if ( (LA41_0==57) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalOcl.g:2922:3: ( (lv_booleanSymbol_0_0= 'true' ) )
                    {
                    // InternalOcl.g:2922:3: ( (lv_booleanSymbol_0_0= 'true' ) )
                    // InternalOcl.g:2923:4: (lv_booleanSymbol_0_0= 'true' )
                    {
                    // InternalOcl.g:2923:4: (lv_booleanSymbol_0_0= 'true' )
                    // InternalOcl.g:2924:5: lv_booleanSymbol_0_0= 'true'
                    {
                    lv_booleanSymbol_0_0=(Token)match(input,56,FOLLOW_2); 

                    					newLeafNode(lv_booleanSymbol_0_0, grammarAccess.getBooleanExpAccess().getBooleanSymbolTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanExpRule());
                    					}
                    					setWithLastConsumed(current, "booleanSymbol", lv_booleanSymbol_0_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOcl.g:2937:3: ( (lv_booleanSymbol_1_0= 'false' ) )
                    {
                    // InternalOcl.g:2937:3: ( (lv_booleanSymbol_1_0= 'false' ) )
                    // InternalOcl.g:2938:4: (lv_booleanSymbol_1_0= 'false' )
                    {
                    // InternalOcl.g:2938:4: (lv_booleanSymbol_1_0= 'false' )
                    // InternalOcl.g:2939:5: lv_booleanSymbol_1_0= 'false'
                    {
                    lv_booleanSymbol_1_0=(Token)match(input,57,FOLLOW_2); 

                    					newLeafNode(lv_booleanSymbol_1_0, grammarAccess.getBooleanExpAccess().getBooleanSymbolFalseKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanExpRule());
                    					}
                    					setWithLastConsumed(current, "booleanSymbol", lv_booleanSymbol_1_0, "false");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "entryRulePropertyCall"
    // InternalOcl.g:2955:1: entryRulePropertyCall returns [EObject current=null] : iv_rulePropertyCall= rulePropertyCall EOF ;
    public final EObject entryRulePropertyCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCall = null;


        try {
            // InternalOcl.g:2955:53: (iv_rulePropertyCall= rulePropertyCall EOF )
            // InternalOcl.g:2956:2: iv_rulePropertyCall= rulePropertyCall EOF
            {
             newCompositeNode(grammarAccess.getPropertyCallRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyCall=rulePropertyCall();

            state._fsp--;

             current =iv_rulePropertyCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyCall"


    // $ANTLR start "rulePropertyCall"
    // InternalOcl.g:2962:1: rulePropertyCall returns [EObject current=null] : (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp | this_CollectionOperationCall_4= ruleCollectionOperationCall ) ;
    public final EObject rulePropertyCall() throws RecognitionException {
        EObject current = null;

        EObject this_OperationCall_0 = null;

        EObject this_NavigationOrAttributeCall_1 = null;

        EObject this_IterateExp_2 = null;

        EObject this_IteratorExp_3 = null;

        EObject this_CollectionOperationCall_4 = null;



        	enterRule();

        try {
            // InternalOcl.g:2968:2: ( (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp | this_CollectionOperationCall_4= ruleCollectionOperationCall ) )
            // InternalOcl.g:2969:2: (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp | this_CollectionOperationCall_4= ruleCollectionOperationCall )
            {
            // InternalOcl.g:2969:2: (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp | this_CollectionOperationCall_4= ruleCollectionOperationCall )
            int alt42=5;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalOcl.g:2970:3: this_OperationCall_0= ruleOperationCall
                    {

                    			newCompositeNode(grammarAccess.getPropertyCallAccess().getOperationCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationCall_0=ruleOperationCall();

                    state._fsp--;


                    			current = this_OperationCall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:2979:3: this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall
                    {

                    			newCompositeNode(grammarAccess.getPropertyCallAccess().getNavigationOrAttributeCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NavigationOrAttributeCall_1=ruleNavigationOrAttributeCall();

                    state._fsp--;


                    			current = this_NavigationOrAttributeCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOcl.g:2988:3: this_IterateExp_2= ruleIterateExp
                    {

                    			newCompositeNode(grammarAccess.getPropertyCallAccess().getIterateExpParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IterateExp_2=ruleIterateExp();

                    state._fsp--;


                    			current = this_IterateExp_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOcl.g:2997:3: this_IteratorExp_3= ruleIteratorExp
                    {

                    			newCompositeNode(grammarAccess.getPropertyCallAccess().getIteratorExpParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IteratorExp_3=ruleIteratorExp();

                    state._fsp--;


                    			current = this_IteratorExp_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOcl.g:3006:3: this_CollectionOperationCall_4= ruleCollectionOperationCall
                    {

                    			newCompositeNode(grammarAccess.getPropertyCallAccess().getCollectionOperationCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectionOperationCall_4=ruleCollectionOperationCall();

                    state._fsp--;


                    			current = this_CollectionOperationCall_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyCall"


    // $ANTLR start "entryRuleOperationCall"
    // InternalOcl.g:3018:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // InternalOcl.g:3018:54: (iv_ruleOperationCall= ruleOperationCall EOF )
            // InternalOcl.g:3019:2: iv_ruleOperationCall= ruleOperationCall EOF
            {
             newCompositeNode(grammarAccess.getOperationCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationCall=ruleOperationCall();

            state._fsp--;

             current =iv_ruleOperationCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationCall"


    // $ANTLR start "ruleOperationCall"
    // InternalOcl.g:3025:1: ruleOperationCall returns [EObject current=null] : (otherlv_0= '.' ( ( (lv_operationName_1_0= RULE_STRING ) ) | ( (lv_operationName_2_0= RULE_ID ) ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleOperationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operationName_1_0=null;
        Token lv_operationName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3031:2: ( (otherlv_0= '.' ( ( (lv_operationName_1_0= RULE_STRING ) ) | ( (lv_operationName_2_0= RULE_ID ) ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* )? otherlv_7= ')' ) )
            // InternalOcl.g:3032:2: (otherlv_0= '.' ( ( (lv_operationName_1_0= RULE_STRING ) ) | ( (lv_operationName_2_0= RULE_ID ) ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* )? otherlv_7= ')' )
            {
            // InternalOcl.g:3032:2: (otherlv_0= '.' ( ( (lv_operationName_1_0= RULE_STRING ) ) | ( (lv_operationName_2_0= RULE_ID ) ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* )? otherlv_7= ')' )
            // InternalOcl.g:3033:3: otherlv_0= '.' ( ( (lv_operationName_1_0= RULE_STRING ) ) | ( (lv_operationName_2_0= RULE_ID ) ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* )? otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationCallAccess().getFullStopKeyword_0());
            		
            // InternalOcl.g:3037:3: ( ( (lv_operationName_1_0= RULE_STRING ) ) | ( (lv_operationName_2_0= RULE_ID ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalOcl.g:3038:4: ( (lv_operationName_1_0= RULE_STRING ) )
                    {
                    // InternalOcl.g:3038:4: ( (lv_operationName_1_0= RULE_STRING ) )
                    // InternalOcl.g:3039:5: (lv_operationName_1_0= RULE_STRING )
                    {
                    // InternalOcl.g:3039:5: (lv_operationName_1_0= RULE_STRING )
                    // InternalOcl.g:3040:6: lv_operationName_1_0= RULE_STRING
                    {
                    lv_operationName_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_operationName_1_0, grammarAccess.getOperationCallAccess().getOperationNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationCallRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"operationName",
                    							lv_operationName_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOcl.g:3057:4: ( (lv_operationName_2_0= RULE_ID ) )
                    {
                    // InternalOcl.g:3057:4: ( (lv_operationName_2_0= RULE_ID ) )
                    // InternalOcl.g:3058:5: (lv_operationName_2_0= RULE_ID )
                    {
                    // InternalOcl.g:3058:5: (lv_operationName_2_0= RULE_ID )
                    // InternalOcl.g:3059:6: lv_operationName_2_0= RULE_ID
                    {
                    lv_operationName_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_operationName_2_0, grammarAccess.getOperationCallAccess().getOperationNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationCallRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"operationName",
                    							lv_operationName_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOcl.g:3080:3: ( ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_INT)||LA45_0==19||LA45_0==33||(LA45_0>=39 && LA45_0<=41)||(LA45_0>=44 && LA45_0<=50)||LA45_0==52||(LA45_0>=56 && LA45_0<=57)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOcl.g:3081:4: ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:3081:4: ( (lv_arguments_4_0= ruleOclExpression ) )
                    // InternalOcl.g:3082:5: (lv_arguments_4_0= ruleOclExpression )
                    {
                    // InternalOcl.g:3082:5: (lv_arguments_4_0= ruleOclExpression )
                    // InternalOcl.g:3083:6: lv_arguments_4_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getOperationCallAccess().getArgumentsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_arguments_4_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationCallRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_4_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:3100:4: (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==20) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalOcl.g:3101:5: otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOperationCallAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:3105:5: ( (lv_arguments_6_0= ruleOclExpression ) )
                    	    // InternalOcl.g:3106:6: (lv_arguments_6_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:3106:6: (lv_arguments_6_0= ruleOclExpression )
                    	    // InternalOcl.g:3107:7: lv_arguments_6_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationCallAccess().getArgumentsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_arguments_6_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_6_0,
                    	    								"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationCall"


    // $ANTLR start "entryRuleNavigationOrAttributeCall"
    // InternalOcl.g:3134:1: entryRuleNavigationOrAttributeCall returns [EObject current=null] : iv_ruleNavigationOrAttributeCall= ruleNavigationOrAttributeCall EOF ;
    public final EObject entryRuleNavigationOrAttributeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOrAttributeCall = null;


        try {
            // InternalOcl.g:3134:66: (iv_ruleNavigationOrAttributeCall= ruleNavigationOrAttributeCall EOF )
            // InternalOcl.g:3135:2: iv_ruleNavigationOrAttributeCall= ruleNavigationOrAttributeCall EOF
            {
             newCompositeNode(grammarAccess.getNavigationOrAttributeCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigationOrAttributeCall=ruleNavigationOrAttributeCall();

            state._fsp--;

             current =iv_ruleNavigationOrAttributeCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigationOrAttributeCall"


    // $ANTLR start "ruleNavigationOrAttributeCall"
    // InternalOcl.g:3141:1: ruleNavigationOrAttributeCall returns [EObject current=null] : (otherlv_0= '.' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleNavigationOrAttributeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalOcl.g:3147:2: ( (otherlv_0= '.' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ) )
            // InternalOcl.g:3148:2: (otherlv_0= '.' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            {
            // InternalOcl.g:3148:2: (otherlv_0= '.' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalOcl.g:3149:3: otherlv_0= '.' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigationOrAttributeCallAccess().getFullStopKeyword_0());
            		
            // InternalOcl.g:3153:3: ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ID) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalOcl.g:3154:4: ( (lv_name_1_0= RULE_STRING ) )
                    {
                    // InternalOcl.g:3154:4: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalOcl.g:3155:5: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOcl.g:3155:5: (lv_name_1_0= RULE_STRING )
                    // InternalOcl.g:3156:6: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getNavigationOrAttributeCallAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNavigationOrAttributeCallRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOcl.g:3173:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalOcl.g:3173:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalOcl.g:3174:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalOcl.g:3174:5: (lv_name_2_0= RULE_ID )
                    // InternalOcl.g:3175:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getNavigationOrAttributeCallAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNavigationOrAttributeCallRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigationOrAttributeCall"


    // $ANTLR start "entryRuleIterateExp"
    // InternalOcl.g:3196:1: entryRuleIterateExp returns [EObject current=null] : iv_ruleIterateExp= ruleIterateExp EOF ;
    public final EObject entryRuleIterateExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterateExp = null;


        try {
            // InternalOcl.g:3196:51: (iv_ruleIterateExp= ruleIterateExp EOF )
            // InternalOcl.g:3197:2: iv_ruleIterateExp= ruleIterateExp EOF
            {
             newCompositeNode(grammarAccess.getIterateExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIterateExp=ruleIterateExp();

            state._fsp--;

             current =iv_ruleIterateExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIterateExp"


    // $ANTLR start "ruleIterateExp"
    // InternalOcl.g:3203:1: ruleIterateExp returns [EObject current=null] : (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' ) ;
    public final EObject ruleIterateExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_iterators_3_0 = null;

        EObject lv_iterators_5_0 = null;

        EObject lv_result_7_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3209:2: ( (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' ) )
            // InternalOcl.g:3210:2: (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' )
            {
            // InternalOcl.g:3210:2: (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' )
            // InternalOcl.g:3211:3: otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getIterateExpAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,60,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIterateExpAccess().getIterateKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getIterateExpAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOcl.g:3223:3: ( (lv_iterators_3_0= ruleIterator ) )
            // InternalOcl.g:3224:4: (lv_iterators_3_0= ruleIterator )
            {
            // InternalOcl.g:3224:4: (lv_iterators_3_0= ruleIterator )
            // InternalOcl.g:3225:5: lv_iterators_3_0= ruleIterator
            {

            					newCompositeNode(grammarAccess.getIterateExpAccess().getIteratorsIteratorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
            lv_iterators_3_0=ruleIterator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIterateExpRule());
            					}
            					add(
            						current,
            						"iterators",
            						lv_iterators_3_0,
            						"fr.enseeiht.ocl.xtext.Ocl.Iterator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOcl.g:3242:3: (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==20) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalOcl.g:3243:4: otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIterateExpAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalOcl.g:3247:4: ( (lv_iterators_5_0= ruleIterator ) )
            	    // InternalOcl.g:3248:5: (lv_iterators_5_0= ruleIterator )
            	    {
            	    // InternalOcl.g:3248:5: (lv_iterators_5_0= ruleIterator )
            	    // InternalOcl.g:3249:6: lv_iterators_5_0= ruleIterator
            	    {

            	    						newCompositeNode(grammarAccess.getIterateExpAccess().getIteratorsIteratorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_iterators_5_0=ruleIterator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIterateExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"iterators",
            	    							lv_iterators_5_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.Iterator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_6=(Token)match(input,61,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getIterateExpAccess().getSemicolonKeyword_5());
            		
            // InternalOcl.g:3271:3: ( (lv_result_7_0= ruleLocalVariable ) )
            // InternalOcl.g:3272:4: (lv_result_7_0= ruleLocalVariable )
            {
            // InternalOcl.g:3272:4: (lv_result_7_0= ruleLocalVariable )
            // InternalOcl.g:3273:5: lv_result_7_0= ruleLocalVariable
            {

            					newCompositeNode(grammarAccess.getIterateExpAccess().getResultLocalVariableParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_43);
            lv_result_7_0=ruleLocalVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIterateExpRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_7_0,
            						"fr.enseeiht.ocl.xtext.Ocl.LocalVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,62,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getIterateExpAccess().getVerticalLineKeyword_7());
            		
            // InternalOcl.g:3294:3: ( (lv_body_9_0= ruleOclExpression ) )
            // InternalOcl.g:3295:4: (lv_body_9_0= ruleOclExpression )
            {
            // InternalOcl.g:3295:4: (lv_body_9_0= ruleOclExpression )
            // InternalOcl.g:3296:5: lv_body_9_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIterateExpAccess().getBodyOclExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_34);
            lv_body_9_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIterateExpRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_9_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getIterateExpAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIterateExp"


    // $ANTLR start "entryRuleIterator"
    // InternalOcl.g:3321:1: entryRuleIterator returns [EObject current=null] : iv_ruleIterator= ruleIterator EOF ;
    public final EObject entryRuleIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterator = null;


        try {
            // InternalOcl.g:3321:49: (iv_ruleIterator= ruleIterator EOF )
            // InternalOcl.g:3322:2: iv_ruleIterator= ruleIterator EOF
            {
             newCompositeNode(grammarAccess.getIteratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIterator=ruleIterator();

            state._fsp--;

             current =iv_ruleIterator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIterator"


    // $ANTLR start "ruleIterator"
    // InternalOcl.g:3328:1: ruleIterator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? ) ;
    public final EObject ruleIterator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3334:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? ) )
            // InternalOcl.g:3335:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? )
            {
            // InternalOcl.g:3335:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? )
            // InternalOcl.g:3336:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )?
            {
            // InternalOcl.g:3336:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOcl.g:3337:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOcl.g:3337:4: (lv_name_0_0= RULE_ID )
            // InternalOcl.g:3338:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIteratorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIteratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOcl.g:3354:3: (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==17) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOcl.g:3355:4: otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getIteratorAccess().getColonKeyword_1_0());
                    			
                    // InternalOcl.g:3359:4: ( (lv_type_2_0= ruleOclType ) )
                    // InternalOcl.g:3360:5: (lv_type_2_0= ruleOclType )
                    {
                    // InternalOcl.g:3360:5: (lv_type_2_0= ruleOclType )
                    // InternalOcl.g:3361:6: lv_type_2_0= ruleOclType
                    {

                    						newCompositeNode(grammarAccess.getIteratorAccess().getTypeOclTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleOclType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIteratorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIterator"


    // $ANTLR start "entryRuleIteratorExp"
    // InternalOcl.g:3383:1: entryRuleIteratorExp returns [EObject current=null] : iv_ruleIteratorExp= ruleIteratorExp EOF ;
    public final EObject entryRuleIteratorExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteratorExp = null;


        try {
            // InternalOcl.g:3383:52: (iv_ruleIteratorExp= ruleIteratorExp EOF )
            // InternalOcl.g:3384:2: iv_ruleIteratorExp= ruleIteratorExp EOF
            {
             newCompositeNode(grammarAccess.getIteratorExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIteratorExp=ruleIteratorExp();

            state._fsp--;

             current =iv_ruleIteratorExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIteratorExp"


    // $ANTLR start "ruleIteratorExp"
    // InternalOcl.g:3390:1: ruleIteratorExp returns [EObject current=null] : (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' ) ;
    public final EObject ruleIteratorExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_iterators_3_0 = null;

        EObject lv_iterators_5_0 = null;

        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3396:2: ( (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' ) )
            // InternalOcl.g:3397:2: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' )
            {
            // InternalOcl.g:3397:2: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' )
            // InternalOcl.g:3398:3: otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIteratorExpAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalOcl.g:3402:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOcl.g:3403:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOcl.g:3403:4: (lv_name_1_0= RULE_ID )
            // InternalOcl.g:3404:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIteratorExpAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIteratorExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getIteratorExpAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOcl.g:3424:3: ( (lv_iterators_3_0= ruleIterator ) )
            // InternalOcl.g:3425:4: (lv_iterators_3_0= ruleIterator )
            {
            // InternalOcl.g:3425:4: (lv_iterators_3_0= ruleIterator )
            // InternalOcl.g:3426:5: lv_iterators_3_0= ruleIterator
            {

            					newCompositeNode(grammarAccess.getIteratorExpAccess().getIteratorsIteratorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
            lv_iterators_3_0=ruleIterator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIteratorExpRule());
            					}
            					add(
            						current,
            						"iterators",
            						lv_iterators_3_0,
            						"fr.enseeiht.ocl.xtext.Ocl.Iterator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOcl.g:3443:3: (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==20) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalOcl.g:3444:4: otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIteratorExpAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalOcl.g:3448:4: ( (lv_iterators_5_0= ruleIterator ) )
            	    // InternalOcl.g:3449:5: (lv_iterators_5_0= ruleIterator )
            	    {
            	    // InternalOcl.g:3449:5: (lv_iterators_5_0= ruleIterator )
            	    // InternalOcl.g:3450:6: lv_iterators_5_0= ruleIterator
            	    {

            	    						newCompositeNode(grammarAccess.getIteratorExpAccess().getIteratorsIteratorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_iterators_5_0=ruleIterator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIteratorExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"iterators",
            	    							lv_iterators_5_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.Iterator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_6=(Token)match(input,62,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getIteratorExpAccess().getVerticalLineKeyword_5());
            		
            // InternalOcl.g:3472:3: ( (lv_body_7_0= ruleOclExpression ) )
            // InternalOcl.g:3473:4: (lv_body_7_0= ruleOclExpression )
            {
            // InternalOcl.g:3473:4: (lv_body_7_0= ruleOclExpression )
            // InternalOcl.g:3474:5: lv_body_7_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIteratorExpAccess().getBodyOclExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_34);
            lv_body_7_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIteratorExpRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_7_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getIteratorExpAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIteratorExp"


    // $ANTLR start "entryRuleCollectionOperationCall"
    // InternalOcl.g:3499:1: entryRuleCollectionOperationCall returns [EObject current=null] : iv_ruleCollectionOperationCall= ruleCollectionOperationCall EOF ;
    public final EObject entryRuleCollectionOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionOperationCall = null;


        try {
            // InternalOcl.g:3499:64: (iv_ruleCollectionOperationCall= ruleCollectionOperationCall EOF )
            // InternalOcl.g:3500:2: iv_ruleCollectionOperationCall= ruleCollectionOperationCall EOF
            {
             newCompositeNode(grammarAccess.getCollectionOperationCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionOperationCall=ruleCollectionOperationCall();

            state._fsp--;

             current =iv_ruleCollectionOperationCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionOperationCall"


    // $ANTLR start "ruleCollectionOperationCall"
    // InternalOcl.g:3506:1: ruleCollectionOperationCall returns [EObject current=null] : (otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleCollectionOperationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operationName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3512:2: ( (otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalOcl.g:3513:2: (otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalOcl.g:3513:2: (otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' )
            // InternalOcl.g:3514:3: otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionOperationCallAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalOcl.g:3518:3: ( (lv_operationName_1_0= RULE_ID ) )
            // InternalOcl.g:3519:4: (lv_operationName_1_0= RULE_ID )
            {
            // InternalOcl.g:3519:4: (lv_operationName_1_0= RULE_ID )
            // InternalOcl.g:3520:5: lv_operationName_1_0= RULE_ID
            {
            lv_operationName_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_operationName_1_0, grammarAccess.getCollectionOperationCallAccess().getOperationNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectionOperationCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operationName",
            						lv_operationName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getCollectionOperationCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOcl.g:3540:3: ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_INT)||LA51_0==19||LA51_0==33||(LA51_0>=39 && LA51_0<=41)||(LA51_0>=44 && LA51_0<=50)||LA51_0==52||(LA51_0>=56 && LA51_0<=57)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOcl.g:3541:4: ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:3541:4: ( (lv_arguments_3_0= ruleOclExpression ) )
                    // InternalOcl.g:3542:5: (lv_arguments_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:3542:5: (lv_arguments_3_0= ruleOclExpression )
                    // InternalOcl.g:3543:6: lv_arguments_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getCollectionOperationCallAccess().getArgumentsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_arguments_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollectionOperationCallRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:3560:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==20) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalOcl.g:3561:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getCollectionOperationCallAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:3565:5: ( (lv_arguments_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:3566:6: (lv_arguments_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:3566:6: (lv_arguments_5_0= ruleOclExpression )
                    	    // InternalOcl.g:3567:7: lv_arguments_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCollectionOperationCallAccess().getArgumentsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_arguments_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCollectionOperationCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCollectionOperationCallAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionOperationCall"


    // $ANTLR start "entryRuleLocalVariable"
    // InternalOcl.g:3594:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // InternalOcl.g:3594:54: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // InternalOcl.g:3595:2: iv_ruleLocalVariable= ruleLocalVariable EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalVariable=ruleLocalVariable();

            state._fsp--;

             current =iv_ruleLocalVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVariable"


    // $ANTLR start "ruleLocalVariable"
    // InternalOcl.g:3601:1: ruleLocalVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3607:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:3608:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:3608:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            // InternalOcl.g:3609:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) )
            {
            // InternalOcl.g:3609:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOcl.g:3610:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOcl.g:3610:4: (lv_name_0_0= RULE_ID )
            // InternalOcl.g:3611:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOcl.g:3627:3: (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==17) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalOcl.g:3628:4: otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getLocalVariableAccess().getColonKeyword_1_0());
                    			
                    // InternalOcl.g:3632:4: ( (lv_type_2_0= ruleOclType ) )
                    // InternalOcl.g:3633:5: (lv_type_2_0= ruleOclType )
                    {
                    // InternalOcl.g:3633:5: (lv_type_2_0= ruleOclType )
                    // InternalOcl.g:3634:6: lv_type_2_0= ruleOclType
                    {

                    						newCompositeNode(grammarAccess.getLocalVariableAccess().getTypeOclTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_type_2_0=ruleOclType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVariableRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalOcl.g:3656:3: ( (lv_initExpression_4_0= ruleOclExpression ) )
            // InternalOcl.g:3657:4: (lv_initExpression_4_0= ruleOclExpression )
            {
            // InternalOcl.g:3657:4: (lv_initExpression_4_0= ruleOclExpression )
            // InternalOcl.g:3658:5: lv_initExpression_4_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getLocalVariableAccess().getInitExpressionOclExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_initExpression_4_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalVariableRule());
            					}
            					set(
            						current,
            						"initExpression",
            						lv_initExpression_4_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalVariable"


    // $ANTLR start "entryRuleOclType"
    // InternalOcl.g:3679:1: entryRuleOclType returns [EObject current=null] : iv_ruleOclType= ruleOclType EOF ;
    public final EObject entryRuleOclType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclType = null;


        try {
            // InternalOcl.g:3679:48: (iv_ruleOclType= ruleOclType EOF )
            // InternalOcl.g:3680:2: iv_ruleOclType= ruleOclType EOF
            {
             newCompositeNode(grammarAccess.getOclTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclType=ruleOclType();

            state._fsp--;

             current =iv_ruleOclType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclType"


    // $ANTLR start "ruleOclType"
    // InternalOcl.g:3686:1: ruleOclType returns [EObject current=null] : (this_CollectionType_0= ruleCollectionType | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_TupleType_3= ruleTupleType | this_OclModelElement_4= ruleOclModelElement | this_MapType_5= ruleMapType ) ;
    public final EObject ruleOclType() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionType_0 = null;

        EObject this_Primitive_1 = null;

        EObject this_OclAnyType_2 = null;

        EObject this_TupleType_3 = null;

        EObject this_OclModelElement_4 = null;

        EObject this_MapType_5 = null;



        	enterRule();

        try {
            // InternalOcl.g:3692:2: ( (this_CollectionType_0= ruleCollectionType | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_TupleType_3= ruleTupleType | this_OclModelElement_4= ruleOclModelElement | this_MapType_5= ruleMapType ) )
            // InternalOcl.g:3693:2: (this_CollectionType_0= ruleCollectionType | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_TupleType_3= ruleTupleType | this_OclModelElement_4= ruleOclModelElement | this_MapType_5= ruleMapType )
            {
            // InternalOcl.g:3693:2: (this_CollectionType_0= ruleCollectionType | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_TupleType_3= ruleTupleType | this_OclModelElement_4= ruleOclModelElement | this_MapType_5= ruleMapType )
            int alt53=6;
            switch ( input.LA(1) ) {
            case 41:
            case 44:
            case 45:
            case 46:
                {
                alt53=1;
                }
                break;
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt53=2;
                }
                break;
            case 67:
                {
                alt53=3;
                }
                break;
            case 47:
                {
                alt53=4;
                }
                break;
            case RULE_ID:
                {
                alt53=5;
                }
                break;
            case 48:
                {
                alt53=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalOcl.g:3694:3: this_CollectionType_0= ruleCollectionType
                    {

                    			newCompositeNode(grammarAccess.getOclTypeAccess().getCollectionTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectionType_0=ruleCollectionType();

                    state._fsp--;


                    			current = this_CollectionType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:3703:3: this_Primitive_1= rulePrimitive
                    {

                    			newCompositeNode(grammarAccess.getOclTypeAccess().getPrimitiveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primitive_1=rulePrimitive();

                    state._fsp--;


                    			current = this_Primitive_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOcl.g:3712:3: this_OclAnyType_2= ruleOclAnyType
                    {

                    			newCompositeNode(grammarAccess.getOclTypeAccess().getOclAnyTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OclAnyType_2=ruleOclAnyType();

                    state._fsp--;


                    			current = this_OclAnyType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOcl.g:3721:3: this_TupleType_3= ruleTupleType
                    {

                    			newCompositeNode(grammarAccess.getOclTypeAccess().getTupleTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TupleType_3=ruleTupleType();

                    state._fsp--;


                    			current = this_TupleType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOcl.g:3730:3: this_OclModelElement_4= ruleOclModelElement
                    {

                    			newCompositeNode(grammarAccess.getOclTypeAccess().getOclModelElementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OclModelElement_4=ruleOclModelElement();

                    state._fsp--;


                    			current = this_OclModelElement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOcl.g:3739:3: this_MapType_5= ruleMapType
                    {

                    			newCompositeNode(grammarAccess.getOclTypeAccess().getMapTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MapType_5=ruleMapType();

                    state._fsp--;


                    			current = this_MapType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclType"


    // $ANTLR start "entryRuleCollectionType"
    // InternalOcl.g:3751:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalOcl.g:3751:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalOcl.g:3752:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
             newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;

             current =iv_ruleCollectionType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // InternalOcl.g:3758:1: ruleCollectionType returns [EObject current=null] : (this_BagType_0= ruleBagType | this_OrderedSetType_1= ruleOrderedSetType | this_SequenceType_2= ruleSequenceType | this_SetType_3= ruleSetType ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject this_BagType_0 = null;

        EObject this_OrderedSetType_1 = null;

        EObject this_SequenceType_2 = null;

        EObject this_SetType_3 = null;



        	enterRule();

        try {
            // InternalOcl.g:3764:2: ( (this_BagType_0= ruleBagType | this_OrderedSetType_1= ruleOrderedSetType | this_SequenceType_2= ruleSequenceType | this_SetType_3= ruleSetType ) )
            // InternalOcl.g:3765:2: (this_BagType_0= ruleBagType | this_OrderedSetType_1= ruleOrderedSetType | this_SequenceType_2= ruleSequenceType | this_SetType_3= ruleSetType )
            {
            // InternalOcl.g:3765:2: (this_BagType_0= ruleBagType | this_OrderedSetType_1= ruleOrderedSetType | this_SequenceType_2= ruleSequenceType | this_SetType_3= ruleSetType )
            int alt54=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt54=1;
                }
                break;
            case 44:
                {
                alt54=2;
                }
                break;
            case 45:
                {
                alt54=3;
                }
                break;
            case 46:
                {
                alt54=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalOcl.g:3766:3: this_BagType_0= ruleBagType
                    {

                    			newCompositeNode(grammarAccess.getCollectionTypeAccess().getBagTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BagType_0=ruleBagType();

                    state._fsp--;


                    			current = this_BagType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:3775:3: this_OrderedSetType_1= ruleOrderedSetType
                    {

                    			newCompositeNode(grammarAccess.getCollectionTypeAccess().getOrderedSetTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrderedSetType_1=ruleOrderedSetType();

                    state._fsp--;


                    			current = this_OrderedSetType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOcl.g:3784:3: this_SequenceType_2= ruleSequenceType
                    {

                    			newCompositeNode(grammarAccess.getCollectionTypeAccess().getSequenceTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceType_2=ruleSequenceType();

                    state._fsp--;


                    			current = this_SequenceType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOcl.g:3793:3: this_SetType_3= ruleSetType
                    {

                    			newCompositeNode(grammarAccess.getCollectionTypeAccess().getSetTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetType_3=ruleSetType();

                    state._fsp--;


                    			current = this_SetType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleBagType"
    // InternalOcl.g:3805:1: entryRuleBagType returns [EObject current=null] : iv_ruleBagType= ruleBagType EOF ;
    public final EObject entryRuleBagType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagType = null;


        try {
            // InternalOcl.g:3805:48: (iv_ruleBagType= ruleBagType EOF )
            // InternalOcl.g:3806:2: iv_ruleBagType= ruleBagType EOF
            {
             newCompositeNode(grammarAccess.getBagTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBagType=ruleBagType();

            state._fsp--;

             current =iv_ruleBagType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBagType"


    // $ANTLR start "ruleBagType"
    // InternalOcl.g:3812:1: ruleBagType returns [EObject current=null] : (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) ;
    public final EObject ruleBagType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3818:2: ( (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) )
            // InternalOcl.g:3819:2: (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:3819:2: (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            // InternalOcl.g:3820:3: otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBagTypeAccess().getBagKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getBagTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:3828:3: ( (lv_elementType_2_0= ruleOclType ) )
            // InternalOcl.g:3829:4: (lv_elementType_2_0= ruleOclType )
            {
            // InternalOcl.g:3829:4: (lv_elementType_2_0= ruleOclType )
            // InternalOcl.g:3830:5: lv_elementType_2_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getBagTypeAccess().getElementTypeOclTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_elementType_2_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBagTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBagTypeAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBagType"


    // $ANTLR start "entryRuleOrderedSetType"
    // InternalOcl.g:3855:1: entryRuleOrderedSetType returns [EObject current=null] : iv_ruleOrderedSetType= ruleOrderedSetType EOF ;
    public final EObject entryRuleOrderedSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedSetType = null;


        try {
            // InternalOcl.g:3855:55: (iv_ruleOrderedSetType= ruleOrderedSetType EOF )
            // InternalOcl.g:3856:2: iv_ruleOrderedSetType= ruleOrderedSetType EOF
            {
             newCompositeNode(grammarAccess.getOrderedSetTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderedSetType=ruleOrderedSetType();

            state._fsp--;

             current =iv_ruleOrderedSetType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderedSetType"


    // $ANTLR start "ruleOrderedSetType"
    // InternalOcl.g:3862:1: ruleOrderedSetType returns [EObject current=null] : (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) ;
    public final EObject ruleOrderedSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3868:2: ( (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) )
            // InternalOcl.g:3869:2: (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:3869:2: (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            // InternalOcl.g:3870:3: otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderedSetTypeAccess().getOrderedSetKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderedSetTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:3878:3: ( (lv_elementType_2_0= ruleOclType ) )
            // InternalOcl.g:3879:4: (lv_elementType_2_0= ruleOclType )
            {
            // InternalOcl.g:3879:4: (lv_elementType_2_0= ruleOclType )
            // InternalOcl.g:3880:5: lv_elementType_2_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getOrderedSetTypeAccess().getElementTypeOclTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_elementType_2_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderedSetTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOrderedSetTypeAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderedSetType"


    // $ANTLR start "entryRuleSequenceType"
    // InternalOcl.g:3905:1: entryRuleSequenceType returns [EObject current=null] : iv_ruleSequenceType= ruleSequenceType EOF ;
    public final EObject entryRuleSequenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceType = null;


        try {
            // InternalOcl.g:3905:53: (iv_ruleSequenceType= ruleSequenceType EOF )
            // InternalOcl.g:3906:2: iv_ruleSequenceType= ruleSequenceType EOF
            {
             newCompositeNode(grammarAccess.getSequenceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceType=ruleSequenceType();

            state._fsp--;

             current =iv_ruleSequenceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceType"


    // $ANTLR start "ruleSequenceType"
    // InternalOcl.g:3912:1: ruleSequenceType returns [EObject current=null] : (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) ;
    public final EObject ruleSequenceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3918:2: ( (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) )
            // InternalOcl.g:3919:2: (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:3919:2: (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            // InternalOcl.g:3920:3: otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceTypeAccess().getSequenceKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:3928:3: ( (lv_elementType_2_0= ruleOclType ) )
            // InternalOcl.g:3929:4: (lv_elementType_2_0= ruleOclType )
            {
            // InternalOcl.g:3929:4: (lv_elementType_2_0= ruleOclType )
            // InternalOcl.g:3930:5: lv_elementType_2_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getSequenceTypeAccess().getElementTypeOclTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_elementType_2_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSequenceTypeAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceType"


    // $ANTLR start "entryRuleSetType"
    // InternalOcl.g:3955:1: entryRuleSetType returns [EObject current=null] : iv_ruleSetType= ruleSetType EOF ;
    public final EObject entryRuleSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetType = null;


        try {
            // InternalOcl.g:3955:48: (iv_ruleSetType= ruleSetType EOF )
            // InternalOcl.g:3956:2: iv_ruleSetType= ruleSetType EOF
            {
             newCompositeNode(grammarAccess.getSetTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetType=ruleSetType();

            state._fsp--;

             current =iv_ruleSetType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetType"


    // $ANTLR start "ruleSetType"
    // InternalOcl.g:3962:1: ruleSetType returns [EObject current=null] : (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) ;
    public final EObject ruleSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3968:2: ( (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) )
            // InternalOcl.g:3969:2: (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:3969:2: (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            // InternalOcl.g:3970:3: otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSetTypeAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSetTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:3978:3: ( (lv_elementType_2_0= ruleOclType ) )
            // InternalOcl.g:3979:4: (lv_elementType_2_0= ruleOclType )
            {
            // InternalOcl.g:3979:4: (lv_elementType_2_0= ruleOclType )
            // InternalOcl.g:3980:5: lv_elementType_2_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getSetTypeAccess().getElementTypeOclTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_elementType_2_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSetTypeAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetType"


    // $ANTLR start "entryRulePrimitive"
    // InternalOcl.g:4005:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalOcl.g:4005:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalOcl.g:4006:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalOcl.g:4012:1: rulePrimitive returns [EObject current=null] : (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_NumericType_2 = null;



        	enterRule();

        try {
            // InternalOcl.g:4018:2: ( (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) )
            // InternalOcl.g:4019:2: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            {
            // InternalOcl.g:4019:2: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt55=1;
                }
                break;
            case 64:
                {
                alt55=2;
                }
                break;
            case 65:
            case 66:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalOcl.g:4020:3: this_StringType_0= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getStringTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_0=ruleStringType();

                    state._fsp--;


                    			current = this_StringType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:4029:3: this_BooleanType_1= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getBooleanTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOcl.g:4038:3: this_NumericType_2= ruleNumericType
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getNumericTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericType_2=ruleNumericType();

                    state._fsp--;


                    			current = this_NumericType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleStringType"
    // InternalOcl.g:4050:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalOcl.g:4050:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalOcl.g:4051:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalOcl.g:4057:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'String' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4063:2: ( ( () otherlv_1= 'String' ) )
            // InternalOcl.g:4064:2: ( () otherlv_1= 'String' )
            {
            // InternalOcl.g:4064:2: ( () otherlv_1= 'String' )
            // InternalOcl.g:4065:3: () otherlv_1= 'String'
            {
            // InternalOcl.g:4065:3: ()
            // InternalOcl.g:4066:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalOcl.g:4080:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalOcl.g:4080:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalOcl.g:4081:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalOcl.g:4087:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'Boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4093:2: ( ( () otherlv_1= 'Boolean' ) )
            // InternalOcl.g:4094:2: ( () otherlv_1= 'Boolean' )
            {
            // InternalOcl.g:4094:2: ( () otherlv_1= 'Boolean' )
            // InternalOcl.g:4095:3: () otherlv_1= 'Boolean'
            {
            // InternalOcl.g:4095:3: ()
            // InternalOcl.g:4096:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleNumericType"
    // InternalOcl.g:4110:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // InternalOcl.g:4110:52: (iv_ruleNumericType= ruleNumericType EOF )
            // InternalOcl.g:4111:2: iv_ruleNumericType= ruleNumericType EOF
            {
             newCompositeNode(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;

             current =iv_ruleNumericType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericType"


    // $ANTLR start "ruleNumericType"
    // InternalOcl.g:4117:1: ruleNumericType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_RealType_1 = null;



        	enterRule();

        try {
            // InternalOcl.g:4123:2: ( (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType ) )
            // InternalOcl.g:4124:2: (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType )
            {
            // InternalOcl.g:4124:2: (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==65) ) {
                alt56=1;
            }
            else if ( (LA56_0==66) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalOcl.g:4125:3: this_IntegerType_0= ruleIntegerType
                    {

                    			newCompositeNode(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerType_0=ruleIntegerType();

                    state._fsp--;


                    			current = this_IntegerType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:4134:3: this_RealType_1= ruleRealType
                    {

                    			newCompositeNode(grammarAccess.getNumericTypeAccess().getRealTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealType_1=ruleRealType();

                    state._fsp--;


                    			current = this_RealType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalOcl.g:4146:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalOcl.g:4146:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalOcl.g:4147:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalOcl.g:4153:1: ruleIntegerType returns [EObject current=null] : ( () otherlv_1= 'Integer' ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4159:2: ( ( () otherlv_1= 'Integer' ) )
            // InternalOcl.g:4160:2: ( () otherlv_1= 'Integer' )
            {
            // InternalOcl.g:4160:2: ( () otherlv_1= 'Integer' )
            // InternalOcl.g:4161:3: () otherlv_1= 'Integer'
            {
            // InternalOcl.g:4161:3: ()
            // InternalOcl.g:4162:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleRealType"
    // InternalOcl.g:4176:1: entryRuleRealType returns [EObject current=null] : iv_ruleRealType= ruleRealType EOF ;
    public final EObject entryRuleRealType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealType = null;


        try {
            // InternalOcl.g:4176:49: (iv_ruleRealType= ruleRealType EOF )
            // InternalOcl.g:4177:2: iv_ruleRealType= ruleRealType EOF
            {
             newCompositeNode(grammarAccess.getRealTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealType=ruleRealType();

            state._fsp--;

             current =iv_ruleRealType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealType"


    // $ANTLR start "ruleRealType"
    // InternalOcl.g:4183:1: ruleRealType returns [EObject current=null] : ( () otherlv_1= 'Real' ) ;
    public final EObject ruleRealType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4189:2: ( ( () otherlv_1= 'Real' ) )
            // InternalOcl.g:4190:2: ( () otherlv_1= 'Real' )
            {
            // InternalOcl.g:4190:2: ( () otherlv_1= 'Real' )
            // InternalOcl.g:4191:3: () otherlv_1= 'Real'
            {
            // InternalOcl.g:4191:3: ()
            // InternalOcl.g:4192:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealTypeAccess().getRealTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRealTypeAccess().getRealKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealType"


    // $ANTLR start "entryRuleOclAnyType"
    // InternalOcl.g:4206:1: entryRuleOclAnyType returns [EObject current=null] : iv_ruleOclAnyType= ruleOclAnyType EOF ;
    public final EObject entryRuleOclAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclAnyType = null;


        try {
            // InternalOcl.g:4206:51: (iv_ruleOclAnyType= ruleOclAnyType EOF )
            // InternalOcl.g:4207:2: iv_ruleOclAnyType= ruleOclAnyType EOF
            {
             newCompositeNode(grammarAccess.getOclAnyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclAnyType=ruleOclAnyType();

            state._fsp--;

             current =iv_ruleOclAnyType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclAnyType"


    // $ANTLR start "ruleOclAnyType"
    // InternalOcl.g:4213:1: ruleOclAnyType returns [EObject current=null] : ( () otherlv_1= 'OclAny' ) ;
    public final EObject ruleOclAnyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4219:2: ( ( () otherlv_1= 'OclAny' ) )
            // InternalOcl.g:4220:2: ( () otherlv_1= 'OclAny' )
            {
            // InternalOcl.g:4220:2: ( () otherlv_1= 'OclAny' )
            // InternalOcl.g:4221:3: () otherlv_1= 'OclAny'
            {
            // InternalOcl.g:4221:3: ()
            // InternalOcl.g:4222:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOclAnyTypeAccess().getOclAnyTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getOclAnyTypeAccess().getOclAnyKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclAnyType"


    // $ANTLR start "entryRuleTupleType"
    // InternalOcl.g:4236:1: entryRuleTupleType returns [EObject current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final EObject entryRuleTupleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleType = null;


        try {
            // InternalOcl.g:4236:50: (iv_ruleTupleType= ruleTupleType EOF )
            // InternalOcl.g:4237:2: iv_ruleTupleType= ruleTupleType EOF
            {
             newCompositeNode(grammarAccess.getTupleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTupleType=ruleTupleType();

            state._fsp--;

             current =iv_ruleTupleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleType"


    // $ANTLR start "ruleTupleType"
    // InternalOcl.g:4243:1: ruleTupleType returns [EObject current=null] : ( () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleTupleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:4249:2: ( ( () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')' ) )
            // InternalOcl.g:4250:2: ( () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')' )
            {
            // InternalOcl.g:4250:2: ( () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')' )
            // InternalOcl.g:4251:3: () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')'
            {
            // InternalOcl.g:4251:3: ()
            // InternalOcl.g:4252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTupleTypeAccess().getTupleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleTypeAccess().getTupleKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOcl.g:4266:3: ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalOcl.g:4267:4: ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )*
                    {
                    // InternalOcl.g:4267:4: ( (lv_attributes_3_0= ruleTupleTypeAttribute ) )
                    // InternalOcl.g:4268:5: (lv_attributes_3_0= ruleTupleTypeAttribute )
                    {
                    // InternalOcl.g:4268:5: (lv_attributes_3_0= ruleTupleTypeAttribute )
                    // InternalOcl.g:4269:6: lv_attributes_3_0= ruleTupleTypeAttribute
                    {

                    						newCompositeNode(grammarAccess.getTupleTypeAccess().getAttributesTupleTypeAttributeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_attributes_3_0=ruleTupleTypeAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTupleTypeRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.TupleTypeAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:4286:4: (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==20) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalOcl.g:4287:5: otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTupleTypeAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:4291:5: ( (lv_attributes_5_0= ruleTupleTypeAttribute ) )
                    	    // InternalOcl.g:4292:6: (lv_attributes_5_0= ruleTupleTypeAttribute )
                    	    {
                    	    // InternalOcl.g:4292:6: (lv_attributes_5_0= ruleTupleTypeAttribute )
                    	    // InternalOcl.g:4293:7: lv_attributes_5_0= ruleTupleTypeAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getTupleTypeAccess().getAttributesTupleTypeAttributeParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_attributes_5_0=ruleTupleTypeAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTupleTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_5_0,
                    	    								"fr.enseeiht.ocl.xtext.Ocl.TupleTypeAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTupleTypeAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleType"


    // $ANTLR start "entryRuleTupleTypeAttribute"
    // InternalOcl.g:4320:1: entryRuleTupleTypeAttribute returns [EObject current=null] : iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF ;
    public final EObject entryRuleTupleTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeAttribute = null;


        try {
            // InternalOcl.g:4320:59: (iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF )
            // InternalOcl.g:4321:2: iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getTupleTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTupleTypeAttribute=ruleTupleTypeAttribute();

            state._fsp--;

             current =iv_ruleTupleTypeAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleTypeAttribute"


    // $ANTLR start "ruleTupleTypeAttribute"
    // InternalOcl.g:4327:1: ruleTupleTypeAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) ) ;
    public final EObject ruleTupleTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:4333:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) ) )
            // InternalOcl.g:4334:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )
            {
            // InternalOcl.g:4334:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )
            // InternalOcl.g:4335:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) )
            {
            // InternalOcl.g:4335:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOcl.g:4336:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOcl.g:4336:4: (lv_name_0_0= RULE_ID )
            // InternalOcl.g:4337:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTupleTypeAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleTypeAttributeAccess().getColonKeyword_1());
            		
            // InternalOcl.g:4357:3: ( (lv_type_2_0= ruleOclType ) )
            // InternalOcl.g:4358:4: (lv_type_2_0= ruleOclType )
            {
            // InternalOcl.g:4358:4: (lv_type_2_0= ruleOclType )
            // InternalOcl.g:4359:5: lv_type_2_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getTupleTypeAttributeAccess().getTypeOclTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleTypeAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleTypeAttribute"


    // $ANTLR start "entryRuleOclModelElement"
    // InternalOcl.g:4380:1: entryRuleOclModelElement returns [EObject current=null] : iv_ruleOclModelElement= ruleOclModelElement EOF ;
    public final EObject entryRuleOclModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclModelElement = null;


        try {
            // InternalOcl.g:4380:56: (iv_ruleOclModelElement= ruleOclModelElement EOF )
            // InternalOcl.g:4381:2: iv_ruleOclModelElement= ruleOclModelElement EOF
            {
             newCompositeNode(grammarAccess.getOclModelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclModelElement=ruleOclModelElement();

            state._fsp--;

             current =iv_ruleOclModelElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclModelElement"


    // $ANTLR start "ruleOclModelElement"
    // InternalOcl.g:4387:1: ruleOclModelElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOclModelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalOcl.g:4393:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalOcl.g:4394:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalOcl.g:4394:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalOcl.g:4395:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalOcl.g:4395:3: ( (otherlv_0= RULE_ID ) )
            // InternalOcl.g:4396:4: (otherlv_0= RULE_ID )
            {
            // InternalOcl.g:4396:4: (otherlv_0= RULE_ID )
            // InternalOcl.g:4397:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOclModelElementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getOclModelElementAccess().getModelImportCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOclModelElementAccess().getExclamationMarkKeyword_1());
            		
            // InternalOcl.g:4412:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOcl.g:4413:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOcl.g:4413:4: (lv_name_2_0= RULE_ID )
            // InternalOcl.g:4414:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOclModelElementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOclModelElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclModelElement"


    // $ANTLR start "entryRuleMapType"
    // InternalOcl.g:4434:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // InternalOcl.g:4434:48: (iv_ruleMapType= ruleMapType EOF )
            // InternalOcl.g:4435:2: iv_ruleMapType= ruleMapType EOF
            {
             newCompositeNode(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapType=ruleMapType();

            state._fsp--;

             current =iv_ruleMapType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // InternalOcl.g:4441:1: ruleMapType returns [EObject current=null] : (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')' ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyType_2_0 = null;

        EObject lv_valueType_4_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:4447:2: ( (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')' ) )
            // InternalOcl.g:4448:2: (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')' )
            {
            // InternalOcl.g:4448:2: (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')' )
            // InternalOcl.g:4449:3: otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getMapKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:4457:3: ( (lv_keyType_2_0= ruleOclType ) )
            // InternalOcl.g:4458:4: (lv_keyType_2_0= ruleOclType )
            {
            // InternalOcl.g:4458:4: (lv_keyType_2_0= ruleOclType )
            // InternalOcl.g:4459:5: lv_keyType_2_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getMapTypeAccess().getKeyTypeOclTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_keyType_2_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapTypeRule());
            					}
            					set(
            						current,
            						"keyType",
            						lv_keyType_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getMapTypeAccess().getCommaKeyword_3());
            		
            // InternalOcl.g:4480:3: ( (lv_valueType_4_0= ruleOclType ) )
            // InternalOcl.g:4481:4: (lv_valueType_4_0= ruleOclType )
            {
            // InternalOcl.g:4481:4: (lv_valueType_4_0= ruleOclType )
            // InternalOcl.g:4482:5: lv_valueType_4_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getMapTypeAccess().getValueTypeOclTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_34);
            lv_valueType_4_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapTypeRule());
            					}
            					set(
            						current,
            						"valueType",
            						lv_valueType_4_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMapTypeAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalOcl.g:4507:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalOcl.g:4507:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalOcl.g:4508:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalOcl.g:4514:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalOcl.g:4520:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalOcl.g:4521:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalOcl.g:4521:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalOcl.g:4522:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalOcl.g:4529:3: (kw= '.' this_ID_2= RULE_ID )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==58) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalOcl.g:4530:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,58,FOLLOW_8); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_46); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\uffff\1\17\17\uffff";
    static final String dfa_3s = "\1\4\1\16\17\uffff";
    static final String dfa_4s = "\1\71\1\76\17\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\1\1\17";
    static final String dfa_6s = "\21\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\1\2\5\13\uffff\1\16\24\uffff\1\2\1\6\2\uffff\1\7\1\10\1\11\1\12\1\13\1\14\2\uffff\1\15\3\uffff\2\4",
            "\1\17\1\20\1\17\1\uffff\1\17\1\uffff\23\17\4\uffff\1\17\7\uffff\1\17\1\uffff\3\17\2\uffff\2\17\2\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1626:2: (this_VariableExp_0= ruleVariableExp | this_SelfExp_1= ruleSelfExp | this_StringExp_2= ruleStringExp | this_BooleanExp_3= ruleBooleanExp | this_NumericExp_4= ruleNumericExp | this_BagExp_5= ruleBagExp | this_OrderedSetExp_6= ruleOrderedSetExp | this_SequenceExp_7= ruleSequenceExp | this_SetExp_8= ruleSetExp | this_TupleExp_9= ruleTupleExp | this_MapExp_10= ruleMapExp | this_EnumLiteralExp_11= ruleEnumLiteralExp | this_IfExp_12= ruleIfExp | this_BraceExp_13= ruleBraceExp | this_OclModelElementExp_14= ruleOclModelElementExp )";
        }
    }
    static final String dfa_8s = "\17\uffff";
    static final String dfa_9s = "\3\uffff\2\7\12\uffff";
    static final String dfa_10s = "\1\72\1\4\1\5\2\16\1\23\3\uffff\1\4\1\uffff\1\17\1\uffff\1\4\1\17";
    static final String dfa_11s = "\1\73\1\5\1\74\2\76\1\23\3\uffff\1\71\1\uffff\1\76\1\uffff\1\71\1\76";
    static final String dfa_12s = "\6\uffff\1\3\1\2\1\1\1\uffff\1\5\1\uffff\1\4\2\uffff";
    static final String dfa_13s = "\17\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\2",
            "\1\3\1\4",
            "\1\5\66\uffff\1\6",
            "\1\7\1\uffff\1\7\1\uffff\1\7\1\10\23\7\4\uffff\1\7\7\uffff\1\7\1\uffff\3\7\2\uffff\2\7\2\uffff\1\7",
            "\1\7\1\uffff\1\7\1\uffff\1\7\1\10\23\7\4\uffff\1\7\7\uffff\1\7\1\uffff\3\7\2\uffff\2\7\2\uffff\1\7",
            "\1\11",
            "",
            "",
            "",
            "\1\12\1\13\2\12\13\uffff\1\12\1\uffff\1\12\13\uffff\1\12\5\uffff\3\12\2\uffff\7\12\1\uffff\1\12\3\uffff\2\12",
            "",
            "\1\12\1\uffff\1\14\1\12\1\uffff\1\15\1\12\1\uffff\20\12\23\uffff\2\12\2\uffff\1\14",
            "",
            "\1\12\1\16\2\12\13\uffff\1\12\15\uffff\1\12\5\uffff\3\12\2\uffff\7\12\1\uffff\1\12\3\uffff\2\12",
            "\1\12\1\uffff\1\14\1\12\1\uffff\1\15\1\12\1\uffff\20\12\23\uffff\2\12\2\uffff\1\14"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2969:2: (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp | this_CollectionOperationCall_4= ruleCollectionOperationCall )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000015000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000410002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x8001F20000000020L,0x000000000000000FL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0317F382000800F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0313F382000800F0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010040002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0317FB82000800F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0317F382002800F0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x4000000000100000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000002L});

}