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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'as'", "'context'", "'!'", "'def'", "':'", "'='", "'('", "','", "')'", "'inv'", "'and'", "'or'", "'xor'", "'implies'", "'<>'", "'>'", "'<'", "'>='", "'<='", "'-'", "'+'", "'div'", "'mod'", "'*'", "'/'", "'not'", "'self'", "'null'", "'Bag'", "'{'", "'}'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Map'", "'#'", "'let'", "'in'", "'if'", "'then'", "'else'", "'endif'", "'true'", "'false'", "'->'", "'.'", "'iterate'", "';'", "'|'", "'Collection'", "'String'", "'Boolean'", "'Integer'", "'Real'", "'OclAny'", "'OclVoid'"
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
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
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
    // InternalOcl.g:71:1: ruleModule returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_contextlessFeatures_1_0= ruleOclFeatureDefinition ) )* ( (lv_contextBlocks_2_0= ruleOclContextBlock ) )+ ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_contextlessFeatures_1_0 = null;

        EObject lv_contextBlocks_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_contextlessFeatures_1_0= ruleOclFeatureDefinition ) )* ( (lv_contextBlocks_2_0= ruleOclContextBlock ) )+ ) )
            // InternalOcl.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_contextlessFeatures_1_0= ruleOclFeatureDefinition ) )* ( (lv_contextBlocks_2_0= ruleOclContextBlock ) )+ )
            {
            // InternalOcl.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_contextlessFeatures_1_0= ruleOclFeatureDefinition ) )* ( (lv_contextBlocks_2_0= ruleOclContextBlock ) )+ )
            // InternalOcl.g:79:3: ( (lv_imports_0_0= ruleImport ) )+ ( (lv_contextlessFeatures_1_0= ruleOclFeatureDefinition ) )* ( (lv_contextBlocks_2_0= ruleOclContextBlock ) )+
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

            // InternalOcl.g:98:3: ( (lv_contextlessFeatures_1_0= ruleOclFeatureDefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOcl.g:99:4: (lv_contextlessFeatures_1_0= ruleOclFeatureDefinition )
            	    {
            	    // InternalOcl.g:99:4: (lv_contextlessFeatures_1_0= ruleOclFeatureDefinition )
            	    // InternalOcl.g:100:5: lv_contextlessFeatures_1_0= ruleOclFeatureDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getContextlessFeaturesOclFeatureDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_contextlessFeatures_1_0=ruleOclFeatureDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contextlessFeatures",
            	    						lv_contextlessFeatures_1_0,
            	    						"fr.enseeiht.ocl.xtext.Ocl.OclFeatureDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalOcl.g:117:3: ( (lv_contextBlocks_2_0= ruleOclContextBlock ) )+
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
            	    // InternalOcl.g:118:4: (lv_contextBlocks_2_0= ruleOclContextBlock )
            	    {
            	    // InternalOcl.g:118:4: (lv_contextBlocks_2_0= ruleOclContextBlock )
            	    // InternalOcl.g:119:5: lv_contextBlocks_2_0= ruleOclContextBlock
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getContextBlocksOclContextBlockParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_contextBlocks_2_0=ruleOclContextBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contextBlocks",
            	    						lv_contextBlocks_2_0,
            	    						"fr.enseeiht.ocl.xtext.Ocl.OclContextBlock");
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


    // $ANTLR start "entryRuleOclContextBlock"
    // InternalOcl.g:198:1: entryRuleOclContextBlock returns [EObject current=null] : iv_ruleOclContextBlock= ruleOclContextBlock EOF ;
    public final EObject entryRuleOclContextBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclContextBlock = null;


        try {
            // InternalOcl.g:198:56: (iv_ruleOclContextBlock= ruleOclContextBlock EOF )
            // InternalOcl.g:199:2: iv_ruleOclContextBlock= ruleOclContextBlock EOF
            {
             newCompositeNode(grammarAccess.getOclContextBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclContextBlock=ruleOclContextBlock();

            state._fsp--;

             current =iv_ruleOclContextBlock; 
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
    // $ANTLR end "entryRuleOclContextBlock"


    // $ANTLR start "ruleOclContextBlock"
    // InternalOcl.g:205:1: ruleOclContextBlock returns [EObject current=null] : ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) ) ( ( (lv_members_4_1= ruleOclFeatureDefinition | lv_members_4_2= ruleOclInvariant ) ) )+ ) ;
    public final EObject ruleOclContextBlock() throws RecognitionException {
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

            				newLeafNode(otherlv_0, grammarAccess.getOclContextBlockAccess().getContextKeyword_0_0());
            			
            // InternalOcl.g:218:4: ( (otherlv_1= RULE_ID ) )
            // InternalOcl.g:219:5: (otherlv_1= RULE_ID )
            {
            // InternalOcl.g:219:5: (otherlv_1= RULE_ID )
            // InternalOcl.g:220:6: otherlv_1= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getOclContextBlockRule());
            						}
            					
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            						newLeafNode(otherlv_1, grammarAccess.getOclContextBlockAccess().getEcoreTypesImportCrossReference_0_1_0());
            					

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            				newLeafNode(otherlv_2, grammarAccess.getOclContextBlockAccess().getExclamationMarkKeyword_0_2());
            			
            // InternalOcl.g:235:4: ( ( ruleQualifiedName ) )
            // InternalOcl.g:236:5: ( ruleQualifiedName )
            {
            // InternalOcl.g:236:5: ( ruleQualifiedName )
            // InternalOcl.g:237:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getOclContextBlockRule());
            						}
            					

            						newCompositeNode(grammarAccess.getOclContextBlockAccess().getClassEClassCrossReference_0_3_0());
            					
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

            	            						newCompositeNode(grammarAccess.getOclContextBlockAccess().getMembersOclFeatureDefinitionParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_members_4_1=ruleOclFeatureDefinition();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getOclContextBlockRule());
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

            	            						newCompositeNode(grammarAccess.getOclContextBlockAccess().getMembersOclInvariantParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_11);
            	            lv_members_4_2=ruleOclInvariant();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getOclContextBlockRule());
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
    // $ANTLR end "ruleOclContextBlock"


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
    // InternalOcl.g:364:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:370:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:371:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:371:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            // InternalOcl.g:372:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) )
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
            		
            // InternalOcl.g:394:3: ( (lv_type_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:395:4: (lv_type_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:395:4: (lv_type_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:396:5: lv_type_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_type_2_0=ruleOclTypeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
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
    // InternalOcl.g:447:1: ruleOperation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclTypeLiteral ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) ) ) ;
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
            // InternalOcl.g:453:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclTypeLiteral ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:454:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclTypeLiteral ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:454:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclTypeLiteral ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) ) )
            // InternalOcl.g:455:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclTypeLiteral ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) )
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
            		
            // InternalOcl.g:477:3: ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOcl.g:478:4: ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
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

                    // InternalOcl.g:497:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
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
                    	    						
                    	    pushFollow(FOLLOW_18);
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getColonKeyword_4());
            		
            // InternalOcl.g:531:3: ( (lv_returnType_7_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:532:4: (lv_returnType_7_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:532:4: (lv_returnType_7_0= ruleOclTypeLiteral )
            // InternalOcl.g:533:5: lv_returnType_7_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeOclTypeLiteralParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_returnType_7_0=ruleOclTypeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_7_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
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
    // InternalOcl.g:584:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:590:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) ) )
            // InternalOcl.g:591:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )
            {
            // InternalOcl.g:591:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )
            // InternalOcl.g:592:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) )
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
            		
            // InternalOcl.g:614:3: ( (lv_type_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:615:4: (lv_type_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:615:4: (lv_type_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:616:5: lv_type_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleOclTypeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
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
    // InternalOcl.g:644:1: ruleOclInvariant returns [EObject current=null] : (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_errorMessage_3_0= ruleOclExpression ) ) otherlv_4= ')' )? otherlv_5= ':' ( (lv_body_6_0= ruleOclExpression ) ) ) ;
    public final EObject ruleOclInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_errorMessage_3_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:650:2: ( (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_errorMessage_3_0= ruleOclExpression ) ) otherlv_4= ')' )? otherlv_5= ':' ( (lv_body_6_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:651:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_errorMessage_3_0= ruleOclExpression ) ) otherlv_4= ')' )? otherlv_5= ':' ( (lv_body_6_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:651:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_errorMessage_3_0= ruleOclExpression ) ) otherlv_4= ')' )? otherlv_5= ':' ( (lv_body_6_0= ruleOclExpression ) ) )
            // InternalOcl.g:652:3: otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_errorMessage_3_0= ruleOclExpression ) ) otherlv_4= ')' )? otherlv_5= ':' ( (lv_body_6_0= ruleOclExpression ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getOclInvariantAccess().getInvKeyword_0());
            		
            // InternalOcl.g:656:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOcl.g:657:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOcl.g:657:4: (lv_name_1_0= RULE_ID )
            // InternalOcl.g:658:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalOcl.g:674:3: (otherlv_2= '(' ( (lv_errorMessage_3_0= ruleOclExpression ) ) otherlv_4= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOcl.g:675:4: otherlv_2= '(' ( (lv_errorMessage_3_0= ruleOclExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getOclInvariantAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalOcl.g:679:4: ( (lv_errorMessage_3_0= ruleOclExpression ) )
                    // InternalOcl.g:680:5: (lv_errorMessage_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:680:5: (lv_errorMessage_3_0= ruleOclExpression )
                    // InternalOcl.g:681:6: lv_errorMessage_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getOclInvariantAccess().getErrorMessageOclExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_errorMessage_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOclInvariantRule());
                    						}
                    						set(
                    							current,
                    							"errorMessage",
                    							lv_errorMessage_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getOclInvariantAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getOclInvariantAccess().getColonKeyword_3());
            		
            // InternalOcl.g:707:3: ( (lv_body_6_0= ruleOclExpression ) )
            // InternalOcl.g:708:4: (lv_body_6_0= ruleOclExpression )
            {
            // InternalOcl.g:708:4: (lv_body_6_0= ruleOclExpression )
            // InternalOcl.g:709:5: lv_body_6_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getOclInvariantAccess().getBodyOclExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_6_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOclInvariantRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
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
    // InternalOcl.g:730:1: entryRuleOclExpression returns [EObject current=null] : iv_ruleOclExpression= ruleOclExpression EOF ;
    public final EObject entryRuleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclExpression = null;


        try {
            // InternalOcl.g:730:54: (iv_ruleOclExpression= ruleOclExpression EOF )
            // InternalOcl.g:731:2: iv_ruleOclExpression= ruleOclExpression EOF
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
    // InternalOcl.g:737:1: ruleOclExpression returns [EObject current=null] : (this_OperatorCallExp_0= ruleOperatorCallExp | this_LetExp_1= ruleLetExp ) ;
    public final EObject ruleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OperatorCallExp_0 = null;

        EObject this_LetExp_1 = null;



        	enterRule();

        try {
            // InternalOcl.g:743:2: ( (this_OperatorCallExp_0= ruleOperatorCallExp | this_LetExp_1= ruleLetExp ) )
            // InternalOcl.g:744:2: (this_OperatorCallExp_0= ruleOperatorCallExp | this_LetExp_1= ruleLetExp )
            {
            // InternalOcl.g:744:2: (this_OperatorCallExp_0= ruleOperatorCallExp | this_LetExp_1= ruleLetExp )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_INT)||LA10_0==19||LA10_0==32||(LA10_0>=38 && LA10_0<=41)||(LA10_0>=44 && LA10_0<=48)||LA10_0==52||(LA10_0>=56 && LA10_0<=57)) ) {
                alt10=1;
            }
            else if ( (LA10_0==50) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOcl.g:745:3: this_OperatorCallExp_0= ruleOperatorCallExp
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
                    // InternalOcl.g:754:3: this_LetExp_1= ruleLetExp
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
    // InternalOcl.g:766:1: entryRuleOclModelElementExp returns [EObject current=null] : iv_ruleOclModelElementExp= ruleOclModelElementExp EOF ;
    public final EObject entryRuleOclModelElementExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclModelElementExp = null;


        try {
            // InternalOcl.g:766:59: (iv_ruleOclModelElementExp= ruleOclModelElementExp EOF )
            // InternalOcl.g:767:2: iv_ruleOclModelElementExp= ruleOclModelElementExp EOF
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
    // InternalOcl.g:773:1: ruleOclModelElementExp returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleOclModelElementExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:779:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) ) )
            // InternalOcl.g:780:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) )
            {
            // InternalOcl.g:780:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) )
            // InternalOcl.g:781:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) )
            {
            // InternalOcl.g:781:3: ( (otherlv_0= RULE_ID ) )
            // InternalOcl.g:782:4: (otherlv_0= RULE_ID )
            {
            // InternalOcl.g:782:4: (otherlv_0= RULE_ID )
            // InternalOcl.g:783:5: otherlv_0= RULE_ID
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
            		
            // InternalOcl.g:798:3: ( ( ruleQualifiedName ) )
            // InternalOcl.g:799:4: ( ruleQualifiedName )
            {
            // InternalOcl.g:799:4: ( ruleQualifiedName )
            // InternalOcl.g:800:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOclModelElementExpRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOclModelElementExpAccess().getClassEClassCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleOclModelElementExp"


    // $ANTLR start "entryRuleOperatorCallExp"
    // InternalOcl.g:818:1: entryRuleOperatorCallExp returns [EObject current=null] : iv_ruleOperatorCallExp= ruleOperatorCallExp EOF ;
    public final EObject entryRuleOperatorCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorCallExp = null;


        try {
            // InternalOcl.g:818:56: (iv_ruleOperatorCallExp= ruleOperatorCallExp EOF )
            // InternalOcl.g:819:2: iv_ruleOperatorCallExp= ruleOperatorCallExp EOF
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
    // InternalOcl.g:825:1: ruleOperatorCallExp returns [EObject current=null] : ( ( (lv_args_0_0= ruleEqOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) ) )* ) ;
    public final EObject ruleOperatorCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_args_0_0 = null;

        AntlrDatatypeRuleToken lv_operationNames_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:831:2: ( ( ( (lv_args_0_0= ruleEqOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) ) )* ) )
            // InternalOcl.g:832:2: ( ( (lv_args_0_0= ruleEqOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) ) )* )
            {
            // InternalOcl.g:832:2: ( ( (lv_args_0_0= ruleEqOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) ) )* )
            // InternalOcl.g:833:3: ( (lv_args_0_0= ruleEqOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) ) )*
            {
            // InternalOcl.g:833:3: ( (lv_args_0_0= ruleEqOpCallExp ) )
            // InternalOcl.g:834:4: (lv_args_0_0= ruleEqOpCallExp )
            {
            // InternalOcl.g:834:4: (lv_args_0_0= ruleEqOpCallExp )
            // InternalOcl.g:835:5: lv_args_0_0= ruleEqOpCallExp
            {

            					newCompositeNode(grammarAccess.getOperatorCallExpAccess().getArgsEqOpCallExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_args_0_0=ruleEqOpCallExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperatorCallExpRule());
            					}
            					add(
            						current,
            						"args",
            						lv_args_0_0,
            						"fr.enseeiht.ocl.xtext.Ocl.EqOpCallExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOcl.g:852:3: ( ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=23 && LA11_0<=26)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOcl.g:853:4: ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) )
            	    {
            	    // InternalOcl.g:853:4: ( (lv_operationNames_1_0= ruleBOOLOP ) )
            	    // InternalOcl.g:854:5: (lv_operationNames_1_0= ruleBOOLOP )
            	    {
            	    // InternalOcl.g:854:5: (lv_operationNames_1_0= ruleBOOLOP )
            	    // InternalOcl.g:855:6: lv_operationNames_1_0= ruleBOOLOP
            	    {

            	    						newCompositeNode(grammarAccess.getOperatorCallExpAccess().getOperationNamesBOOLOPParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_operationNames_1_0=ruleBOOLOP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperatorCallExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operationNames",
            	    							lv_operationNames_1_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.BOOLOP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalOcl.g:872:4: ( (lv_args_2_0= ruleEqOpCallExp ) )
            	    // InternalOcl.g:873:5: (lv_args_2_0= ruleEqOpCallExp )
            	    {
            	    // InternalOcl.g:873:5: (lv_args_2_0= ruleEqOpCallExp )
            	    // InternalOcl.g:874:6: lv_args_2_0= ruleEqOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getOperatorCallExpAccess().getArgsEqOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_args_2_0=ruleEqOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperatorCallExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_2_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.EqOpCallExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalOcl.g:896:1: entryRuleBOOLOP returns [String current=null] : iv_ruleBOOLOP= ruleBOOLOP EOF ;
    public final String entryRuleBOOLOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLOP = null;


        try {
            // InternalOcl.g:896:46: (iv_ruleBOOLOP= ruleBOOLOP EOF )
            // InternalOcl.g:897:2: iv_ruleBOOLOP= ruleBOOLOP EOF
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
    // InternalOcl.g:903:1: ruleBOOLOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:909:2: ( (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // InternalOcl.g:910:2: (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // InternalOcl.g:910:2: (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalOcl.g:911:3: kw= 'and'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLOPAccess().getAndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:917:3: kw= 'or'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLOPAccess().getOrKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOcl.g:923:3: kw= 'xor'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLOPAccess().getXorKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOcl.g:929:3: kw= 'implies'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLOPAccess().getImpliesKeyword_3());
                    		

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
    // InternalOcl.g:938:1: entryRuleEqOpCallExp returns [EObject current=null] : iv_ruleEqOpCallExp= ruleEqOpCallExp EOF ;
    public final EObject entryRuleEqOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqOpCallExp = null;


        try {
            // InternalOcl.g:938:52: (iv_ruleEqOpCallExp= ruleEqOpCallExp EOF )
            // InternalOcl.g:939:2: iv_ruleEqOpCallExp= ruleEqOpCallExp EOF
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
    // InternalOcl.g:945:1: ruleEqOpCallExp returns [EObject current=null] : ( ( (lv_args_0_0= ruleRelOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) ) )? ) ;
    public final EObject ruleEqOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_args_0_0 = null;

        AntlrDatatypeRuleToken lv_operationNames_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:951:2: ( ( ( (lv_args_0_0= ruleRelOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) ) )? ) )
            // InternalOcl.g:952:2: ( ( (lv_args_0_0= ruleRelOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) ) )? )
            {
            // InternalOcl.g:952:2: ( ( (lv_args_0_0= ruleRelOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) ) )? )
            // InternalOcl.g:953:3: ( (lv_args_0_0= ruleRelOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) ) )?
            {
            // InternalOcl.g:953:3: ( (lv_args_0_0= ruleRelOpCallExp ) )
            // InternalOcl.g:954:4: (lv_args_0_0= ruleRelOpCallExp )
            {
            // InternalOcl.g:954:4: (lv_args_0_0= ruleRelOpCallExp )
            // InternalOcl.g:955:5: lv_args_0_0= ruleRelOpCallExp
            {

            					newCompositeNode(grammarAccess.getEqOpCallExpAccess().getArgsRelOpCallExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_args_0_0=ruleRelOpCallExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqOpCallExpRule());
            					}
            					add(
            						current,
            						"args",
            						lv_args_0_0,
            						"fr.enseeiht.ocl.xtext.Ocl.RelOpCallExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOcl.g:972:3: ( ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18||LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOcl.g:973:4: ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) )
                    {
                    // InternalOcl.g:973:4: ( (lv_operationNames_1_0= ruleEQOP ) )
                    // InternalOcl.g:974:5: (lv_operationNames_1_0= ruleEQOP )
                    {
                    // InternalOcl.g:974:5: (lv_operationNames_1_0= ruleEQOP )
                    // InternalOcl.g:975:6: lv_operationNames_1_0= ruleEQOP
                    {

                    						newCompositeNode(grammarAccess.getEqOpCallExpAccess().getOperationNamesEQOPParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_operationNames_1_0=ruleEQOP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqOpCallExpRule());
                    						}
                    						add(
                    							current,
                    							"operationNames",
                    							lv_operationNames_1_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.EQOP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:992:4: ( (lv_args_2_0= ruleRelOpCallExp ) )
                    // InternalOcl.g:993:5: (lv_args_2_0= ruleRelOpCallExp )
                    {
                    // InternalOcl.g:993:5: (lv_args_2_0= ruleRelOpCallExp )
                    // InternalOcl.g:994:6: lv_args_2_0= ruleRelOpCallExp
                    {

                    						newCompositeNode(grammarAccess.getEqOpCallExpAccess().getArgsRelOpCallExpParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_args_2_0=ruleRelOpCallExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqOpCallExpRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_2_0,
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
    // InternalOcl.g:1016:1: entryRuleEQOP returns [String current=null] : iv_ruleEQOP= ruleEQOP EOF ;
    public final String entryRuleEQOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEQOP = null;


        try {
            // InternalOcl.g:1016:44: (iv_ruleEQOP= ruleEQOP EOF )
            // InternalOcl.g:1017:2: iv_ruleEQOP= ruleEQOP EOF
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
    // InternalOcl.g:1023:1: ruleEQOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken ruleEQOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1029:2: ( (kw= '=' | kw= '<>' ) )
            // InternalOcl.g:1030:2: (kw= '=' | kw= '<>' )
            {
            // InternalOcl.g:1030:2: (kw= '=' | kw= '<>' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalOcl.g:1031:3: kw= '='
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEQOPAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1037:3: kw= '<>'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

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
    // InternalOcl.g:1046:1: entryRuleRelOpCallExp returns [EObject current=null] : iv_ruleRelOpCallExp= ruleRelOpCallExp EOF ;
    public final EObject entryRuleRelOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelOpCallExp = null;


        try {
            // InternalOcl.g:1046:53: (iv_ruleRelOpCallExp= ruleRelOpCallExp EOF )
            // InternalOcl.g:1047:2: iv_ruleRelOpCallExp= ruleRelOpCallExp EOF
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
    // InternalOcl.g:1053:1: ruleRelOpCallExp returns [EObject current=null] : ( ( (lv_args_0_0= ruleAddOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) ) )? ) ;
    public final EObject ruleRelOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_args_0_0 = null;

        AntlrDatatypeRuleToken lv_operationNames_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1059:2: ( ( ( (lv_args_0_0= ruleAddOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) ) )? ) )
            // InternalOcl.g:1060:2: ( ( (lv_args_0_0= ruleAddOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) ) )? )
            {
            // InternalOcl.g:1060:2: ( ( (lv_args_0_0= ruleAddOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) ) )? )
            // InternalOcl.g:1061:3: ( (lv_args_0_0= ruleAddOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) ) )?
            {
            // InternalOcl.g:1061:3: ( (lv_args_0_0= ruleAddOpCallExp ) )
            // InternalOcl.g:1062:4: (lv_args_0_0= ruleAddOpCallExp )
            {
            // InternalOcl.g:1062:4: (lv_args_0_0= ruleAddOpCallExp )
            // InternalOcl.g:1063:5: lv_args_0_0= ruleAddOpCallExp
            {

            					newCompositeNode(grammarAccess.getRelOpCallExpAccess().getArgsAddOpCallExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_args_0_0=ruleAddOpCallExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelOpCallExpRule());
            					}
            					add(
            						current,
            						"args",
            						lv_args_0_0,
            						"fr.enseeiht.ocl.xtext.Ocl.AddOpCallExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOcl.g:1080:3: ( ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=28 && LA15_0<=31)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOcl.g:1081:4: ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) )
                    {
                    // InternalOcl.g:1081:4: ( (lv_operationNames_1_0= ruleRELOP ) )
                    // InternalOcl.g:1082:5: (lv_operationNames_1_0= ruleRELOP )
                    {
                    // InternalOcl.g:1082:5: (lv_operationNames_1_0= ruleRELOP )
                    // InternalOcl.g:1083:6: lv_operationNames_1_0= ruleRELOP
                    {

                    						newCompositeNode(grammarAccess.getRelOpCallExpAccess().getOperationNamesRELOPParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_operationNames_1_0=ruleRELOP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelOpCallExpRule());
                    						}
                    						add(
                    							current,
                    							"operationNames",
                    							lv_operationNames_1_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.RELOP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:1100:4: ( (lv_args_2_0= ruleAddOpCallExp ) )
                    // InternalOcl.g:1101:5: (lv_args_2_0= ruleAddOpCallExp )
                    {
                    // InternalOcl.g:1101:5: (lv_args_2_0= ruleAddOpCallExp )
                    // InternalOcl.g:1102:6: lv_args_2_0= ruleAddOpCallExp
                    {

                    						newCompositeNode(grammarAccess.getRelOpCallExpAccess().getArgsAddOpCallExpParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_args_2_0=ruleAddOpCallExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelOpCallExpRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_2_0,
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
    // InternalOcl.g:1124:1: entryRuleRELOP returns [String current=null] : iv_ruleRELOP= ruleRELOP EOF ;
    public final String entryRuleRELOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRELOP = null;


        try {
            // InternalOcl.g:1124:45: (iv_ruleRELOP= ruleRELOP EOF )
            // InternalOcl.g:1125:2: iv_ruleRELOP= ruleRELOP EOF
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
    // InternalOcl.g:1131:1: ruleRELOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleRELOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1137:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) )
            // InternalOcl.g:1138:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            {
            // InternalOcl.g:1138:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt16=1;
                }
                break;
            case 29:
                {
                alt16=2;
                }
                break;
            case 30:
                {
                alt16=3;
                }
                break;
            case 31:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalOcl.g:1139:3: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRELOPAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1145:3: kw= '<'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRELOPAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOcl.g:1151:3: kw= '>='
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRELOPAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOcl.g:1157:3: kw= '<='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

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
    // InternalOcl.g:1166:1: entryRuleAddOpCallExp returns [EObject current=null] : iv_ruleAddOpCallExp= ruleAddOpCallExp EOF ;
    public final EObject entryRuleAddOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOpCallExp = null;


        try {
            // InternalOcl.g:1166:53: (iv_ruleAddOpCallExp= ruleAddOpCallExp EOF )
            // InternalOcl.g:1167:2: iv_ruleAddOpCallExp= ruleAddOpCallExp EOF
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
    // InternalOcl.g:1173:1: ruleAddOpCallExp returns [EObject current=null] : ( ( (lv_args_0_0= ruleIntOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) ) )* ) ;
    public final EObject ruleAddOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_args_0_0 = null;

        AntlrDatatypeRuleToken lv_operationNames_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1179:2: ( ( ( (lv_args_0_0= ruleIntOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) ) )* ) )
            // InternalOcl.g:1180:2: ( ( (lv_args_0_0= ruleIntOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) ) )* )
            {
            // InternalOcl.g:1180:2: ( ( (lv_args_0_0= ruleIntOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) ) )* )
            // InternalOcl.g:1181:3: ( (lv_args_0_0= ruleIntOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) ) )*
            {
            // InternalOcl.g:1181:3: ( (lv_args_0_0= ruleIntOpCallExp ) )
            // InternalOcl.g:1182:4: (lv_args_0_0= ruleIntOpCallExp )
            {
            // InternalOcl.g:1182:4: (lv_args_0_0= ruleIntOpCallExp )
            // InternalOcl.g:1183:5: lv_args_0_0= ruleIntOpCallExp
            {

            					newCompositeNode(grammarAccess.getAddOpCallExpAccess().getArgsIntOpCallExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_args_0_0=ruleIntOpCallExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddOpCallExpRule());
            					}
            					add(
            						current,
            						"args",
            						lv_args_0_0,
            						"fr.enseeiht.ocl.xtext.Ocl.IntOpCallExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOcl.g:1200:3: ( ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=32 && LA17_0<=33)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOcl.g:1201:4: ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) )
            	    {
            	    // InternalOcl.g:1201:4: ( (lv_operationNames_1_0= ruleADDOP ) )
            	    // InternalOcl.g:1202:5: (lv_operationNames_1_0= ruleADDOP )
            	    {
            	    // InternalOcl.g:1202:5: (lv_operationNames_1_0= ruleADDOP )
            	    // InternalOcl.g:1203:6: lv_operationNames_1_0= ruleADDOP
            	    {

            	    						newCompositeNode(grammarAccess.getAddOpCallExpAccess().getOperationNamesADDOPParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_operationNames_1_0=ruleADDOP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddOpCallExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operationNames",
            	    							lv_operationNames_1_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.ADDOP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalOcl.g:1220:4: ( (lv_args_2_0= ruleIntOpCallExp ) )
            	    // InternalOcl.g:1221:5: (lv_args_2_0= ruleIntOpCallExp )
            	    {
            	    // InternalOcl.g:1221:5: (lv_args_2_0= ruleIntOpCallExp )
            	    // InternalOcl.g:1222:6: lv_args_2_0= ruleIntOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getAddOpCallExpAccess().getArgsIntOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_args_2_0=ruleIntOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddOpCallExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_2_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.IntOpCallExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalOcl.g:1244:1: entryRuleADDOP returns [String current=null] : iv_ruleADDOP= ruleADDOP EOF ;
    public final String entryRuleADDOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleADDOP = null;


        try {
            // InternalOcl.g:1244:45: (iv_ruleADDOP= ruleADDOP EOF )
            // InternalOcl.g:1245:2: iv_ruleADDOP= ruleADDOP EOF
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
    // InternalOcl.g:1251:1: ruleADDOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleADDOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1257:2: ( (kw= '-' | kw= '+' ) )
            // InternalOcl.g:1258:2: (kw= '-' | kw= '+' )
            {
            // InternalOcl.g:1258:2: (kw= '-' | kw= '+' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalOcl.g:1259:3: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getADDOPAccess().getHyphenMinusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1265:3: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

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
    // InternalOcl.g:1274:1: entryRuleIntOpCallExp returns [EObject current=null] : iv_ruleIntOpCallExp= ruleIntOpCallExp EOF ;
    public final EObject entryRuleIntOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntOpCallExp = null;


        try {
            // InternalOcl.g:1274:53: (iv_ruleIntOpCallExp= ruleIntOpCallExp EOF )
            // InternalOcl.g:1275:2: iv_ruleIntOpCallExp= ruleIntOpCallExp EOF
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
    // InternalOcl.g:1281:1: ruleIntOpCallExp returns [EObject current=null] : ( ( (lv_args_0_0= ruleMulOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) ) )* ) ;
    public final EObject ruleIntOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_args_0_0 = null;

        AntlrDatatypeRuleToken lv_operationNames_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1287:2: ( ( ( (lv_args_0_0= ruleMulOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) ) )* ) )
            // InternalOcl.g:1288:2: ( ( (lv_args_0_0= ruleMulOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) ) )* )
            {
            // InternalOcl.g:1288:2: ( ( (lv_args_0_0= ruleMulOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) ) )* )
            // InternalOcl.g:1289:3: ( (lv_args_0_0= ruleMulOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) ) )*
            {
            // InternalOcl.g:1289:3: ( (lv_args_0_0= ruleMulOpCallExp ) )
            // InternalOcl.g:1290:4: (lv_args_0_0= ruleMulOpCallExp )
            {
            // InternalOcl.g:1290:4: (lv_args_0_0= ruleMulOpCallExp )
            // InternalOcl.g:1291:5: lv_args_0_0= ruleMulOpCallExp
            {

            					newCompositeNode(grammarAccess.getIntOpCallExpAccess().getArgsMulOpCallExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_args_0_0=ruleMulOpCallExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntOpCallExpRule());
            					}
            					add(
            						current,
            						"args",
            						lv_args_0_0,
            						"fr.enseeiht.ocl.xtext.Ocl.MulOpCallExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOcl.g:1308:3: ( ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=34 && LA19_0<=35)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOcl.g:1309:4: ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) )
            	    {
            	    // InternalOcl.g:1309:4: ( (lv_operationNames_1_0= ruleINTOP ) )
            	    // InternalOcl.g:1310:5: (lv_operationNames_1_0= ruleINTOP )
            	    {
            	    // InternalOcl.g:1310:5: (lv_operationNames_1_0= ruleINTOP )
            	    // InternalOcl.g:1311:6: lv_operationNames_1_0= ruleINTOP
            	    {

            	    						newCompositeNode(grammarAccess.getIntOpCallExpAccess().getOperationNamesINTOPParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_operationNames_1_0=ruleINTOP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIntOpCallExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operationNames",
            	    							lv_operationNames_1_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.INTOP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalOcl.g:1328:4: ( (lv_args_2_0= ruleMulOpCallExp ) )
            	    // InternalOcl.g:1329:5: (lv_args_2_0= ruleMulOpCallExp )
            	    {
            	    // InternalOcl.g:1329:5: (lv_args_2_0= ruleMulOpCallExp )
            	    // InternalOcl.g:1330:6: lv_args_2_0= ruleMulOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getIntOpCallExpAccess().getArgsMulOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_args_2_0=ruleMulOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIntOpCallExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_2_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.MulOpCallExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalOcl.g:1352:1: entryRuleINTOP returns [String current=null] : iv_ruleINTOP= ruleINTOP EOF ;
    public final String entryRuleINTOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTOP = null;


        try {
            // InternalOcl.g:1352:45: (iv_ruleINTOP= ruleINTOP EOF )
            // InternalOcl.g:1353:2: iv_ruleINTOP= ruleINTOP EOF
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
    // InternalOcl.g:1359:1: ruleINTOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'div' | kw= 'mod' ) ;
    public final AntlrDatatypeRuleToken ruleINTOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1365:2: ( (kw= 'div' | kw= 'mod' ) )
            // InternalOcl.g:1366:2: (kw= 'div' | kw= 'mod' )
            {
            // InternalOcl.g:1366:2: (kw= 'div' | kw= 'mod' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            else if ( (LA20_0==35) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalOcl.g:1367:3: kw= 'div'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getINTOPAccess().getDivKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1373:3: kw= 'mod'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

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
    // InternalOcl.g:1382:1: entryRuleMulOpCallExp returns [EObject current=null] : iv_ruleMulOpCallExp= ruleMulOpCallExp EOF ;
    public final EObject entryRuleMulOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOpCallExp = null;


        try {
            // InternalOcl.g:1382:53: (iv_ruleMulOpCallExp= ruleMulOpCallExp EOF )
            // InternalOcl.g:1383:2: iv_ruleMulOpCallExp= ruleMulOpCallExp EOF
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
    // InternalOcl.g:1389:1: ruleMulOpCallExp returns [EObject current=null] : ( ( (lv_args_0_0= ruleNotOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) ) )* ) ;
    public final EObject ruleMulOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_args_0_0 = null;

        AntlrDatatypeRuleToken lv_operationNames_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1395:2: ( ( ( (lv_args_0_0= ruleNotOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) ) )* ) )
            // InternalOcl.g:1396:2: ( ( (lv_args_0_0= ruleNotOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) ) )* )
            {
            // InternalOcl.g:1396:2: ( ( (lv_args_0_0= ruleNotOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) ) )* )
            // InternalOcl.g:1397:3: ( (lv_args_0_0= ruleNotOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) ) )*
            {
            // InternalOcl.g:1397:3: ( (lv_args_0_0= ruleNotOpCallExp ) )
            // InternalOcl.g:1398:4: (lv_args_0_0= ruleNotOpCallExp )
            {
            // InternalOcl.g:1398:4: (lv_args_0_0= ruleNotOpCallExp )
            // InternalOcl.g:1399:5: lv_args_0_0= ruleNotOpCallExp
            {

            					newCompositeNode(grammarAccess.getMulOpCallExpAccess().getArgsNotOpCallExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_args_0_0=ruleNotOpCallExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMulOpCallExpRule());
            					}
            					add(
            						current,
            						"args",
            						lv_args_0_0,
            						"fr.enseeiht.ocl.xtext.Ocl.NotOpCallExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOcl.g:1416:3: ( ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=36 && LA21_0<=37)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOcl.g:1417:4: ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) )
            	    {
            	    // InternalOcl.g:1417:4: ( (lv_operationNames_1_0= ruleMULOP ) )
            	    // InternalOcl.g:1418:5: (lv_operationNames_1_0= ruleMULOP )
            	    {
            	    // InternalOcl.g:1418:5: (lv_operationNames_1_0= ruleMULOP )
            	    // InternalOcl.g:1419:6: lv_operationNames_1_0= ruleMULOP
            	    {

            	    						newCompositeNode(grammarAccess.getMulOpCallExpAccess().getOperationNamesMULOPParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_operationNames_1_0=ruleMULOP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOpCallExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operationNames",
            	    							lv_operationNames_1_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.MULOP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalOcl.g:1436:4: ( (lv_args_2_0= ruleNotOpCallExp ) )
            	    // InternalOcl.g:1437:5: (lv_args_2_0= ruleNotOpCallExp )
            	    {
            	    // InternalOcl.g:1437:5: (lv_args_2_0= ruleNotOpCallExp )
            	    // InternalOcl.g:1438:6: lv_args_2_0= ruleNotOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getMulOpCallExpAccess().getArgsNotOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_args_2_0=ruleNotOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOpCallExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_2_0,
            	    							"fr.enseeiht.ocl.xtext.Ocl.NotOpCallExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalOcl.g:1460:1: entryRuleMULOP returns [String current=null] : iv_ruleMULOP= ruleMULOP EOF ;
    public final String entryRuleMULOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULOP = null;


        try {
            // InternalOcl.g:1460:45: (iv_ruleMULOP= ruleMULOP EOF )
            // InternalOcl.g:1461:2: iv_ruleMULOP= ruleMULOP EOF
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
    // InternalOcl.g:1467:1: ruleMULOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleMULOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1473:2: ( (kw= '*' | kw= '/' ) )
            // InternalOcl.g:1474:2: (kw= '*' | kw= '/' )
            {
            // InternalOcl.g:1474:2: (kw= '*' | kw= '/' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            else if ( (LA22_0==37) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalOcl.g:1475:3: kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMULOPAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1481:3: kw= '/'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalOcl.g:1490:1: entryRuleNotOpCallExp returns [EObject current=null] : iv_ruleNotOpCallExp= ruleNotOpCallExp EOF ;
    public final EObject entryRuleNotOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOpCallExp = null;


        try {
            // InternalOcl.g:1490:53: (iv_ruleNotOpCallExp= ruleNotOpCallExp EOF )
            // InternalOcl.g:1491:2: iv_ruleNotOpCallExp= ruleNotOpCallExp EOF
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
    // InternalOcl.g:1497:1: ruleNotOpCallExp returns [EObject current=null] : ( ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp ) ;
    public final EObject ruleNotOpCallExp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operationName_0_0 = null;

        EObject lv_source_1_0 = null;

        EObject this_PropertyCallExp_2 = null;



        	enterRule();

        try {
            // InternalOcl.g:1503:2: ( ( ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp ) )
            // InternalOcl.g:1504:2: ( ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp )
            {
            // InternalOcl.g:1504:2: ( ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32||LA23_0==38) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_INT)||LA23_0==19||(LA23_0>=39 && LA23_0<=41)||(LA23_0>=44 && LA23_0<=48)||LA23_0==52||(LA23_0>=56 && LA23_0<=57)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalOcl.g:1505:3: ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) )
                    {
                    // InternalOcl.g:1505:3: ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) )
                    // InternalOcl.g:1506:4: ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) )
                    {
                    // InternalOcl.g:1506:4: ( (lv_operationName_0_0= ruleUNARYOP ) )
                    // InternalOcl.g:1507:5: (lv_operationName_0_0= ruleUNARYOP )
                    {
                    // InternalOcl.g:1507:5: (lv_operationName_0_0= ruleUNARYOP )
                    // InternalOcl.g:1508:6: lv_operationName_0_0= ruleUNARYOP
                    {

                    						newCompositeNode(grammarAccess.getNotOpCallExpAccess().getOperationNameUNARYOPParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalOcl.g:1525:4: ( (lv_source_1_0= ruleNotOpCallExp ) )
                    // InternalOcl.g:1526:5: (lv_source_1_0= ruleNotOpCallExp )
                    {
                    // InternalOcl.g:1526:5: (lv_source_1_0= ruleNotOpCallExp )
                    // InternalOcl.g:1527:6: lv_source_1_0= ruleNotOpCallExp
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
                    // InternalOcl.g:1546:3: this_PropertyCallExp_2= rulePropertyCallExp
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
    // InternalOcl.g:1558:1: entryRuleUNARYOP returns [String current=null] : iv_ruleUNARYOP= ruleUNARYOP EOF ;
    public final String entryRuleUNARYOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNARYOP = null;


        try {
            // InternalOcl.g:1558:47: (iv_ruleUNARYOP= ruleUNARYOP EOF )
            // InternalOcl.g:1559:2: iv_ruleUNARYOP= ruleUNARYOP EOF
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
    // InternalOcl.g:1565:1: ruleUNARYOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'not' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUNARYOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1571:2: ( (kw= 'not' | kw= '-' ) )
            // InternalOcl.g:1572:2: (kw= 'not' | kw= '-' )
            {
            // InternalOcl.g:1572:2: (kw= 'not' | kw= '-' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            else if ( (LA24_0==32) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalOcl.g:1573:3: kw= 'not'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUNARYOPAccess().getNotKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1579:3: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

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
    // InternalOcl.g:1588:1: entryRulePropertyCallExp returns [EObject current=null] : iv_rulePropertyCallExp= rulePropertyCallExp EOF ;
    public final EObject entryRulePropertyCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCallExp = null;


        try {
            // InternalOcl.g:1588:56: (iv_rulePropertyCallExp= rulePropertyCallExp EOF )
            // InternalOcl.g:1589:2: iv_rulePropertyCallExp= rulePropertyCallExp EOF
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
    // InternalOcl.g:1595:1: rulePropertyCallExp returns [EObject current=null] : ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* ) ;
    public final EObject rulePropertyCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_calls_1_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1601:2: ( ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* ) )
            // InternalOcl.g:1602:2: ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* )
            {
            // InternalOcl.g:1602:2: ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* )
            // InternalOcl.g:1603:3: ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )*
            {
            // InternalOcl.g:1603:3: ( (lv_source_0_0= rulePrimary_OclExpression ) )
            // InternalOcl.g:1604:4: (lv_source_0_0= rulePrimary_OclExpression )
            {
            // InternalOcl.g:1604:4: (lv_source_0_0= rulePrimary_OclExpression )
            // InternalOcl.g:1605:5: lv_source_0_0= rulePrimary_OclExpression
            {

            					newCompositeNode(grammarAccess.getPropertyCallExpAccess().getSourcePrimary_OclExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalOcl.g:1622:3: ( (lv_calls_1_0= rulePropertyCall ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=58 && LA25_0<=59)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalOcl.g:1623:4: (lv_calls_1_0= rulePropertyCall )
            	    {
            	    // InternalOcl.g:1623:4: (lv_calls_1_0= rulePropertyCall )
            	    // InternalOcl.g:1624:5: lv_calls_1_0= rulePropertyCall
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyCallExpAccess().getCallsPropertyCallParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break loop25;
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
    // InternalOcl.g:1645:1: entryRulePrimary_OclExpression returns [EObject current=null] : iv_rulePrimary_OclExpression= rulePrimary_OclExpression EOF ;
    public final EObject entryRulePrimary_OclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary_OclExpression = null;


        try {
            // InternalOcl.g:1645:62: (iv_rulePrimary_OclExpression= rulePrimary_OclExpression EOF )
            // InternalOcl.g:1646:2: iv_rulePrimary_OclExpression= rulePrimary_OclExpression EOF
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
    // InternalOcl.g:1652:1: rulePrimary_OclExpression returns [EObject current=null] : (this_VariableExp_0= ruleVariableExp | this_SelfLiteralExp_1= ruleSelfLiteralExp | this_StringLiteralExp_2= ruleStringLiteralExp | this_BooleanLiteralExp_3= ruleBooleanLiteralExp | this_NumericLiteralExp_4= ruleNumericLiteralExp | this_NullLiteralExp_5= ruleNullLiteralExp | this_BagLiteralExp_6= ruleBagLiteralExp | this_OrderedSetLiteralExp_7= ruleOrderedSetLiteralExp | this_SequenceLiteralExp_8= ruleSequenceLiteralExp | this_SetLiteralExp_9= ruleSetLiteralExp | this_TupleLiteralExp_10= ruleTupleLiteralExp | this_MapLiteralExp_11= ruleMapLiteralExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_IfExp_13= ruleIfExp | this_BraceExp_14= ruleBraceExp | this_OclModelElementExp_15= ruleOclModelElementExp | this_ContextlessCallExp_16= ruleContextlessCallExp ) ;
    public final EObject rulePrimary_OclExpression() throws RecognitionException {
        EObject current = null;

        EObject this_VariableExp_0 = null;

        EObject this_SelfLiteralExp_1 = null;

        EObject this_StringLiteralExp_2 = null;

        EObject this_BooleanLiteralExp_3 = null;

        EObject this_NumericLiteralExp_4 = null;

        EObject this_NullLiteralExp_5 = null;

        EObject this_BagLiteralExp_6 = null;

        EObject this_OrderedSetLiteralExp_7 = null;

        EObject this_SequenceLiteralExp_8 = null;

        EObject this_SetLiteralExp_9 = null;

        EObject this_TupleLiteralExp_10 = null;

        EObject this_MapLiteralExp_11 = null;

        EObject this_EnumLiteralExp_12 = null;

        EObject this_IfExp_13 = null;

        EObject this_BraceExp_14 = null;

        EObject this_OclModelElementExp_15 = null;

        EObject this_ContextlessCallExp_16 = null;



        	enterRule();

        try {
            // InternalOcl.g:1658:2: ( (this_VariableExp_0= ruleVariableExp | this_SelfLiteralExp_1= ruleSelfLiteralExp | this_StringLiteralExp_2= ruleStringLiteralExp | this_BooleanLiteralExp_3= ruleBooleanLiteralExp | this_NumericLiteralExp_4= ruleNumericLiteralExp | this_NullLiteralExp_5= ruleNullLiteralExp | this_BagLiteralExp_6= ruleBagLiteralExp | this_OrderedSetLiteralExp_7= ruleOrderedSetLiteralExp | this_SequenceLiteralExp_8= ruleSequenceLiteralExp | this_SetLiteralExp_9= ruleSetLiteralExp | this_TupleLiteralExp_10= ruleTupleLiteralExp | this_MapLiteralExp_11= ruleMapLiteralExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_IfExp_13= ruleIfExp | this_BraceExp_14= ruleBraceExp | this_OclModelElementExp_15= ruleOclModelElementExp | this_ContextlessCallExp_16= ruleContextlessCallExp ) )
            // InternalOcl.g:1659:2: (this_VariableExp_0= ruleVariableExp | this_SelfLiteralExp_1= ruleSelfLiteralExp | this_StringLiteralExp_2= ruleStringLiteralExp | this_BooleanLiteralExp_3= ruleBooleanLiteralExp | this_NumericLiteralExp_4= ruleNumericLiteralExp | this_NullLiteralExp_5= ruleNullLiteralExp | this_BagLiteralExp_6= ruleBagLiteralExp | this_OrderedSetLiteralExp_7= ruleOrderedSetLiteralExp | this_SequenceLiteralExp_8= ruleSequenceLiteralExp | this_SetLiteralExp_9= ruleSetLiteralExp | this_TupleLiteralExp_10= ruleTupleLiteralExp | this_MapLiteralExp_11= ruleMapLiteralExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_IfExp_13= ruleIfExp | this_BraceExp_14= ruleBraceExp | this_OclModelElementExp_15= ruleOclModelElementExp | this_ContextlessCallExp_16= ruleContextlessCallExp )
            {
            // InternalOcl.g:1659:2: (this_VariableExp_0= ruleVariableExp | this_SelfLiteralExp_1= ruleSelfLiteralExp | this_StringLiteralExp_2= ruleStringLiteralExp | this_BooleanLiteralExp_3= ruleBooleanLiteralExp | this_NumericLiteralExp_4= ruleNumericLiteralExp | this_NullLiteralExp_5= ruleNullLiteralExp | this_BagLiteralExp_6= ruleBagLiteralExp | this_OrderedSetLiteralExp_7= ruleOrderedSetLiteralExp | this_SequenceLiteralExp_8= ruleSequenceLiteralExp | this_SetLiteralExp_9= ruleSetLiteralExp | this_TupleLiteralExp_10= ruleTupleLiteralExp | this_MapLiteralExp_11= ruleMapLiteralExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_IfExp_13= ruleIfExp | this_BraceExp_14= ruleBraceExp | this_OclModelElementExp_15= ruleOclModelElementExp | this_ContextlessCallExp_16= ruleContextlessCallExp )
            int alt26=17;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalOcl.g:1660:3: this_VariableExp_0= ruleVariableExp
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
                    // InternalOcl.g:1669:3: this_SelfLiteralExp_1= ruleSelfLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getSelfLiteralExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelfLiteralExp_1=ruleSelfLiteralExp();

                    state._fsp--;


                    			current = this_SelfLiteralExp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOcl.g:1678:3: this_StringLiteralExp_2= ruleStringLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getStringLiteralExpParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteralExp_2=ruleStringLiteralExp();

                    state._fsp--;


                    			current = this_StringLiteralExp_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOcl.g:1687:3: this_BooleanLiteralExp_3= ruleBooleanLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getBooleanLiteralExpParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteralExp_3=ruleBooleanLiteralExp();

                    state._fsp--;


                    			current = this_BooleanLiteralExp_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOcl.g:1696:3: this_NumericLiteralExp_4= ruleNumericLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getNumericLiteralExpParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericLiteralExp_4=ruleNumericLiteralExp();

                    state._fsp--;


                    			current = this_NumericLiteralExp_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOcl.g:1705:3: this_NullLiteralExp_5= ruleNullLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getNullLiteralExpParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullLiteralExp_5=ruleNullLiteralExp();

                    state._fsp--;


                    			current = this_NullLiteralExp_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOcl.g:1714:3: this_BagLiteralExp_6= ruleBagLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getBagLiteralExpParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_BagLiteralExp_6=ruleBagLiteralExp();

                    state._fsp--;


                    			current = this_BagLiteralExp_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalOcl.g:1723:3: this_OrderedSetLiteralExp_7= ruleOrderedSetLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getOrderedSetLiteralExpParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrderedSetLiteralExp_7=ruleOrderedSetLiteralExp();

                    state._fsp--;


                    			current = this_OrderedSetLiteralExp_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalOcl.g:1732:3: this_SequenceLiteralExp_8= ruleSequenceLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getSequenceLiteralExpParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceLiteralExp_8=ruleSequenceLiteralExp();

                    state._fsp--;


                    			current = this_SequenceLiteralExp_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalOcl.g:1741:3: this_SetLiteralExp_9= ruleSetLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getSetLiteralExpParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetLiteralExp_9=ruleSetLiteralExp();

                    state._fsp--;


                    			current = this_SetLiteralExp_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalOcl.g:1750:3: this_TupleLiteralExp_10= ruleTupleLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getTupleLiteralExpParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_TupleLiteralExp_10=ruleTupleLiteralExp();

                    state._fsp--;


                    			current = this_TupleLiteralExp_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalOcl.g:1759:3: this_MapLiteralExp_11= ruleMapLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getMapLiteralExpParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_MapLiteralExp_11=ruleMapLiteralExp();

                    state._fsp--;


                    			current = this_MapLiteralExp_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalOcl.g:1768:3: this_EnumLiteralExp_12= ruleEnumLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getEnumLiteralExpParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumLiteralExp_12=ruleEnumLiteralExp();

                    state._fsp--;


                    			current = this_EnumLiteralExp_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalOcl.g:1777:3: this_IfExp_13= ruleIfExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getIfExpParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfExp_13=ruleIfExp();

                    state._fsp--;


                    			current = this_IfExp_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalOcl.g:1786:3: this_BraceExp_14= ruleBraceExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getBraceExpParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_BraceExp_14=ruleBraceExp();

                    state._fsp--;


                    			current = this_BraceExp_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalOcl.g:1795:3: this_OclModelElementExp_15= ruleOclModelElementExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getOclModelElementExpParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_OclModelElementExp_15=ruleOclModelElementExp();

                    state._fsp--;


                    			current = this_OclModelElementExp_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalOcl.g:1804:3: this_ContextlessCallExp_16= ruleContextlessCallExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getContextlessCallExpParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContextlessCallExp_16=ruleContextlessCallExp();

                    state._fsp--;


                    			current = this_ContextlessCallExp_16;
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
    // InternalOcl.g:1816:1: entryRuleVariableExp returns [EObject current=null] : iv_ruleVariableExp= ruleVariableExp EOF ;
    public final EObject entryRuleVariableExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExp = null;


        try {
            // InternalOcl.g:1816:52: (iv_ruleVariableExp= ruleVariableExp EOF )
            // InternalOcl.g:1817:2: iv_ruleVariableExp= ruleVariableExp EOF
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
    // InternalOcl.g:1823:1: ruleVariableExp returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOcl.g:1829:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalOcl.g:1830:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalOcl.g:1830:2: ( (otherlv_0= RULE_ID ) )
            // InternalOcl.g:1831:3: (otherlv_0= RULE_ID )
            {
            // InternalOcl.g:1831:3: (otherlv_0= RULE_ID )
            // InternalOcl.g:1832:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleSelfLiteralExp"
    // InternalOcl.g:1846:1: entryRuleSelfLiteralExp returns [EObject current=null] : iv_ruleSelfLiteralExp= ruleSelfLiteralExp EOF ;
    public final EObject entryRuleSelfLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfLiteralExp = null;


        try {
            // InternalOcl.g:1846:55: (iv_ruleSelfLiteralExp= ruleSelfLiteralExp EOF )
            // InternalOcl.g:1847:2: iv_ruleSelfLiteralExp= ruleSelfLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getSelfLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelfLiteralExp=ruleSelfLiteralExp();

            state._fsp--;

             current =iv_ruleSelfLiteralExp; 
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
    // $ANTLR end "entryRuleSelfLiteralExp"


    // $ANTLR start "ruleSelfLiteralExp"
    // InternalOcl.g:1853:1: ruleSelfLiteralExp returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:1859:2: ( ( () otherlv_1= 'self' ) )
            // InternalOcl.g:1860:2: ( () otherlv_1= 'self' )
            {
            // InternalOcl.g:1860:2: ( () otherlv_1= 'self' )
            // InternalOcl.g:1861:3: () otherlv_1= 'self'
            {
            // InternalOcl.g:1861:3: ()
            // InternalOcl.g:1862:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelfLiteralExpAccess().getSelfLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSelfLiteralExpAccess().getSelfKeyword_1());
            		

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
    // $ANTLR end "ruleSelfLiteralExp"


    // $ANTLR start "entryRuleNullLiteralExp"
    // InternalOcl.g:1876:1: entryRuleNullLiteralExp returns [EObject current=null] : iv_ruleNullLiteralExp= ruleNullLiteralExp EOF ;
    public final EObject entryRuleNullLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExp = null;


        try {
            // InternalOcl.g:1876:55: (iv_ruleNullLiteralExp= ruleNullLiteralExp EOF )
            // InternalOcl.g:1877:2: iv_ruleNullLiteralExp= ruleNullLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullLiteralExp=ruleNullLiteralExp();

            state._fsp--;

             current =iv_ruleNullLiteralExp; 
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
    // $ANTLR end "entryRuleNullLiteralExp"


    // $ANTLR start "ruleNullLiteralExp"
    // InternalOcl.g:1883:1: ruleNullLiteralExp returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:1889:2: ( ( () otherlv_1= 'null' ) )
            // InternalOcl.g:1890:2: ( () otherlv_1= 'null' )
            {
            // InternalOcl.g:1890:2: ( () otherlv_1= 'null' )
            // InternalOcl.g:1891:3: () otherlv_1= 'null'
            {
            // InternalOcl.g:1891:3: ()
            // InternalOcl.g:1892:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpAccess().getNullLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpAccess().getNullKeyword_1());
            		

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
    // $ANTLR end "ruleNullLiteralExp"


    // $ANTLR start "entryRuleStringLiteralExp"
    // InternalOcl.g:1906:1: entryRuleStringLiteralExp returns [EObject current=null] : iv_ruleStringLiteralExp= ruleStringLiteralExp EOF ;
    public final EObject entryRuleStringLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExp = null;


        try {
            // InternalOcl.g:1906:57: (iv_ruleStringLiteralExp= ruleStringLiteralExp EOF )
            // InternalOcl.g:1907:2: iv_ruleStringLiteralExp= ruleStringLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteralExp=ruleStringLiteralExp();

            state._fsp--;

             current =iv_ruleStringLiteralExp; 
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
    // $ANTLR end "entryRuleStringLiteralExp"


    // $ANTLR start "ruleStringLiteralExp"
    // InternalOcl.g:1913:1: ruleStringLiteralExp returns [EObject current=null] : ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteralExp() throws RecognitionException {
        EObject current = null;

        Token lv_stringSymbol_1_0=null;


        	enterRule();

        try {
            // InternalOcl.g:1919:2: ( ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) ) )
            // InternalOcl.g:1920:2: ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) )
            {
            // InternalOcl.g:1920:2: ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) )
            // InternalOcl.g:1921:3: () ( (lv_stringSymbol_1_0= RULE_STRING ) )
            {
            // InternalOcl.g:1921:3: ()
            // InternalOcl.g:1922:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringLiteralExpAccess().getStringLiteralExpAction_0(),
            					current);
            			

            }

            // InternalOcl.g:1928:3: ( (lv_stringSymbol_1_0= RULE_STRING ) )
            // InternalOcl.g:1929:4: (lv_stringSymbol_1_0= RULE_STRING )
            {
            // InternalOcl.g:1929:4: (lv_stringSymbol_1_0= RULE_STRING )
            // InternalOcl.g:1930:5: lv_stringSymbol_1_0= RULE_STRING
            {
            lv_stringSymbol_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_stringSymbol_1_0, grammarAccess.getStringLiteralExpAccess().getStringSymbolSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringLiteralExpRule());
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
    // $ANTLR end "ruleStringLiteralExp"


    // $ANTLR start "entryRuleNumericLiteralExp"
    // InternalOcl.g:1950:1: entryRuleNumericLiteralExp returns [EObject current=null] : iv_ruleNumericLiteralExp= ruleNumericLiteralExp EOF ;
    public final EObject entryRuleNumericLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteralExp = null;


        try {
            // InternalOcl.g:1950:58: (iv_ruleNumericLiteralExp= ruleNumericLiteralExp EOF )
            // InternalOcl.g:1951:2: iv_ruleNumericLiteralExp= ruleNumericLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getNumericLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericLiteralExp=ruleNumericLiteralExp();

            state._fsp--;

             current =iv_ruleNumericLiteralExp; 
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
    // $ANTLR end "entryRuleNumericLiteralExp"


    // $ANTLR start "ruleNumericLiteralExp"
    // InternalOcl.g:1957:1: ruleNumericLiteralExp returns [EObject current=null] : (this_RealLiteralExp_0= ruleRealLiteralExp | this_IntegerLiteralExp_1= ruleIntegerLiteralExp ) ;
    public final EObject ruleNumericLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject this_RealLiteralExp_0 = null;

        EObject this_IntegerLiteralExp_1 = null;



        	enterRule();

        try {
            // InternalOcl.g:1963:2: ( (this_RealLiteralExp_0= ruleRealLiteralExp | this_IntegerLiteralExp_1= ruleIntegerLiteralExp ) )
            // InternalOcl.g:1964:2: (this_RealLiteralExp_0= ruleRealLiteralExp | this_IntegerLiteralExp_1= ruleIntegerLiteralExp )
            {
            // InternalOcl.g:1964:2: (this_RealLiteralExp_0= ruleRealLiteralExp | this_IntegerLiteralExp_1= ruleIntegerLiteralExp )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_DOUBLE) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_INT) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalOcl.g:1965:3: this_RealLiteralExp_0= ruleRealLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getNumericLiteralExpAccess().getRealLiteralExpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteralExp_0=ruleRealLiteralExp();

                    state._fsp--;


                    			current = this_RealLiteralExp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1974:3: this_IntegerLiteralExp_1= ruleIntegerLiteralExp
                    {

                    			newCompositeNode(grammarAccess.getNumericLiteralExpAccess().getIntegerLiteralExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteralExp_1=ruleIntegerLiteralExp();

                    state._fsp--;


                    			current = this_IntegerLiteralExp_1;
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
    // $ANTLR end "ruleNumericLiteralExp"


    // $ANTLR start "entryRuleRealLiteralExp"
    // InternalOcl.g:1986:1: entryRuleRealLiteralExp returns [EObject current=null] : iv_ruleRealLiteralExp= ruleRealLiteralExp EOF ;
    public final EObject entryRuleRealLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExp = null;


        try {
            // InternalOcl.g:1986:55: (iv_ruleRealLiteralExp= ruleRealLiteralExp EOF )
            // InternalOcl.g:1987:2: iv_ruleRealLiteralExp= ruleRealLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteralExp=ruleRealLiteralExp();

            state._fsp--;

             current =iv_ruleRealLiteralExp; 
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
    // $ANTLR end "entryRuleRealLiteralExp"


    // $ANTLR start "ruleRealLiteralExp"
    // InternalOcl.g:1993:1: ruleRealLiteralExp returns [EObject current=null] : ( (lv_realSymbol_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleRealLiteralExp() throws RecognitionException {
        EObject current = null;

        Token lv_realSymbol_0_0=null;


        	enterRule();

        try {
            // InternalOcl.g:1999:2: ( ( (lv_realSymbol_0_0= RULE_DOUBLE ) ) )
            // InternalOcl.g:2000:2: ( (lv_realSymbol_0_0= RULE_DOUBLE ) )
            {
            // InternalOcl.g:2000:2: ( (lv_realSymbol_0_0= RULE_DOUBLE ) )
            // InternalOcl.g:2001:3: (lv_realSymbol_0_0= RULE_DOUBLE )
            {
            // InternalOcl.g:2001:3: (lv_realSymbol_0_0= RULE_DOUBLE )
            // InternalOcl.g:2002:4: lv_realSymbol_0_0= RULE_DOUBLE
            {
            lv_realSymbol_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            				newLeafNode(lv_realSymbol_0_0, grammarAccess.getRealLiteralExpAccess().getRealSymbolDOUBLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRealLiteralExpRule());
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
    // $ANTLR end "ruleRealLiteralExp"


    // $ANTLR start "entryRuleIntegerLiteralExp"
    // InternalOcl.g:2021:1: entryRuleIntegerLiteralExp returns [EObject current=null] : iv_ruleIntegerLiteralExp= ruleIntegerLiteralExp EOF ;
    public final EObject entryRuleIntegerLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteralExp = null;


        try {
            // InternalOcl.g:2021:58: (iv_ruleIntegerLiteralExp= ruleIntegerLiteralExp EOF )
            // InternalOcl.g:2022:2: iv_ruleIntegerLiteralExp= ruleIntegerLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteralExp=ruleIntegerLiteralExp();

            state._fsp--;

             current =iv_ruleIntegerLiteralExp; 
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
    // $ANTLR end "entryRuleIntegerLiteralExp"


    // $ANTLR start "ruleIntegerLiteralExp"
    // InternalOcl.g:2028:1: ruleIntegerLiteralExp returns [EObject current=null] : ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerLiteralExp() throws RecognitionException {
        EObject current = null;

        Token lv_integerSymbol_1_0=null;


        	enterRule();

        try {
            // InternalOcl.g:2034:2: ( ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) ) )
            // InternalOcl.g:2035:2: ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) )
            {
            // InternalOcl.g:2035:2: ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) )
            // InternalOcl.g:2036:3: () ( (lv_integerSymbol_1_0= RULE_INT ) )
            {
            // InternalOcl.g:2036:3: ()
            // InternalOcl.g:2037:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerLiteralExpAccess().getIntegerLiteralExpAction_0(),
            					current);
            			

            }

            // InternalOcl.g:2043:3: ( (lv_integerSymbol_1_0= RULE_INT ) )
            // InternalOcl.g:2044:4: (lv_integerSymbol_1_0= RULE_INT )
            {
            // InternalOcl.g:2044:4: (lv_integerSymbol_1_0= RULE_INT )
            // InternalOcl.g:2045:5: lv_integerSymbol_1_0= RULE_INT
            {
            lv_integerSymbol_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_integerSymbol_1_0, grammarAccess.getIntegerLiteralExpAccess().getIntegerSymbolINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerLiteralExpRule());
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
    // $ANTLR end "ruleIntegerLiteralExp"


    // $ANTLR start "entryRuleBagLiteralExp"
    // InternalOcl.g:2065:1: entryRuleBagLiteralExp returns [EObject current=null] : iv_ruleBagLiteralExp= ruleBagLiteralExp EOF ;
    public final EObject entryRuleBagLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagLiteralExp = null;


        try {
            // InternalOcl.g:2065:54: (iv_ruleBagLiteralExp= ruleBagLiteralExp EOF )
            // InternalOcl.g:2066:2: iv_ruleBagLiteralExp= ruleBagLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getBagLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBagLiteralExp=ruleBagLiteralExp();

            state._fsp--;

             current =iv_ruleBagLiteralExp; 
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
    // $ANTLR end "entryRuleBagLiteralExp"


    // $ANTLR start "ruleBagLiteralExp"
    // InternalOcl.g:2072:1: ruleBagLiteralExp returns [EObject current=null] : ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleBagLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2078:2: ( ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2079:2: ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2079:2: ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2080:3: () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2080:3: ()
            // InternalOcl.g:2081:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBagLiteralExpAccess().getBagLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getBagLiteralExpAccess().getBagKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getBagLiteralExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2095:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_INT)||LA29_0==19||LA29_0==32||(LA29_0>=38 && LA29_0<=41)||(LA29_0>=44 && LA29_0<=48)||LA29_0==50||LA29_0==52||(LA29_0>=56 && LA29_0<=57)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOcl.g:2096:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:2096:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalOcl.g:2097:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:2097:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalOcl.g:2098:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getBagLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_elements_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBagLiteralExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:2115:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==20) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalOcl.g:2116:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getBagLiteralExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2120:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:2121:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:2121:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalOcl.g:2122:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getBagLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_elements_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBagLiteralExpRule());
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
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBagLiteralExpAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBagLiteralExp"


    // $ANTLR start "entryRuleOrderedSetLiteralExp"
    // InternalOcl.g:2149:1: entryRuleOrderedSetLiteralExp returns [EObject current=null] : iv_ruleOrderedSetLiteralExp= ruleOrderedSetLiteralExp EOF ;
    public final EObject entryRuleOrderedSetLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedSetLiteralExp = null;


        try {
            // InternalOcl.g:2149:61: (iv_ruleOrderedSetLiteralExp= ruleOrderedSetLiteralExp EOF )
            // InternalOcl.g:2150:2: iv_ruleOrderedSetLiteralExp= ruleOrderedSetLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getOrderedSetLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderedSetLiteralExp=ruleOrderedSetLiteralExp();

            state._fsp--;

             current =iv_ruleOrderedSetLiteralExp; 
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
    // $ANTLR end "entryRuleOrderedSetLiteralExp"


    // $ANTLR start "ruleOrderedSetLiteralExp"
    // InternalOcl.g:2156:1: ruleOrderedSetLiteralExp returns [EObject current=null] : ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleOrderedSetLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2162:2: ( ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2163:2: ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2163:2: ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2164:3: () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2164:3: ()
            // InternalOcl.g:2165:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrderedSetLiteralExpAccess().getOrderedSetLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderedSetLiteralExpAccess().getOrderedSetKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getOrderedSetLiteralExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2179:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_INT)||LA31_0==19||LA31_0==32||(LA31_0>=38 && LA31_0<=41)||(LA31_0>=44 && LA31_0<=48)||LA31_0==50||LA31_0==52||(LA31_0>=56 && LA31_0<=57)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOcl.g:2180:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:2180:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalOcl.g:2181:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:2181:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalOcl.g:2182:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getOrderedSetLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_elements_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrderedSetLiteralExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:2199:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==20) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalOcl.g:2200:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOrderedSetLiteralExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2204:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:2205:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:2205:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalOcl.g:2206:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getOrderedSetLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_elements_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOrderedSetLiteralExpRule());
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
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOrderedSetLiteralExpAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleOrderedSetLiteralExp"


    // $ANTLR start "entryRuleSequenceLiteralExp"
    // InternalOcl.g:2233:1: entryRuleSequenceLiteralExp returns [EObject current=null] : iv_ruleSequenceLiteralExp= ruleSequenceLiteralExp EOF ;
    public final EObject entryRuleSequenceLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceLiteralExp = null;


        try {
            // InternalOcl.g:2233:59: (iv_ruleSequenceLiteralExp= ruleSequenceLiteralExp EOF )
            // InternalOcl.g:2234:2: iv_ruleSequenceLiteralExp= ruleSequenceLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getSequenceLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceLiteralExp=ruleSequenceLiteralExp();

            state._fsp--;

             current =iv_ruleSequenceLiteralExp; 
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
    // $ANTLR end "entryRuleSequenceLiteralExp"


    // $ANTLR start "ruleSequenceLiteralExp"
    // InternalOcl.g:2240:1: ruleSequenceLiteralExp returns [EObject current=null] : ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleSequenceLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2246:2: ( ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2247:2: ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2247:2: ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2248:3: () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2248:3: ()
            // InternalOcl.g:2249:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceLiteralExpAccess().getSequenceLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceLiteralExpAccess().getSequenceKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceLiteralExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2263:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_INT)||LA33_0==19||LA33_0==32||(LA33_0>=38 && LA33_0<=41)||(LA33_0>=44 && LA33_0<=48)||LA33_0==50||LA33_0==52||(LA33_0>=56 && LA33_0<=57)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOcl.g:2264:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:2264:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalOcl.g:2265:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:2265:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalOcl.g:2266:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_elements_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceLiteralExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:2283:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==20) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalOcl.g:2284:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSequenceLiteralExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2288:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:2289:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:2289:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalOcl.g:2290:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_elements_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceLiteralExpRule());
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
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSequenceLiteralExpAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSequenceLiteralExp"


    // $ANTLR start "entryRuleSetLiteralExp"
    // InternalOcl.g:2317:1: entryRuleSetLiteralExp returns [EObject current=null] : iv_ruleSetLiteralExp= ruleSetLiteralExp EOF ;
    public final EObject entryRuleSetLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteralExp = null;


        try {
            // InternalOcl.g:2317:54: (iv_ruleSetLiteralExp= ruleSetLiteralExp EOF )
            // InternalOcl.g:2318:2: iv_ruleSetLiteralExp= ruleSetLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getSetLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetLiteralExp=ruleSetLiteralExp();

            state._fsp--;

             current =iv_ruleSetLiteralExp; 
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
    // $ANTLR end "entryRuleSetLiteralExp"


    // $ANTLR start "ruleSetLiteralExp"
    // InternalOcl.g:2324:1: ruleSetLiteralExp returns [EObject current=null] : ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleSetLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2330:2: ( ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2331:2: ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2331:2: ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2332:3: () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2332:3: ()
            // InternalOcl.g:2333:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetLiteralExpAccess().getSetLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getSetLiteralExpAccess().getSetKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getSetLiteralExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2347:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_INT)||LA35_0==19||LA35_0==32||(LA35_0>=38 && LA35_0<=41)||(LA35_0>=44 && LA35_0<=48)||LA35_0==50||LA35_0==52||(LA35_0>=56 && LA35_0<=57)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOcl.g:2348:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:2348:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalOcl.g:2349:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:2349:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalOcl.g:2350:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getSetLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_elements_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetLiteralExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:2367:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==20) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalOcl.g:2368:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSetLiteralExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2372:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:2373:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:2373:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalOcl.g:2374:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSetLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_elements_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSetLiteralExpRule());
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
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSetLiteralExpAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSetLiteralExp"


    // $ANTLR start "entryRuleTupleLiteralExp"
    // InternalOcl.g:2401:1: entryRuleTupleLiteralExp returns [EObject current=null] : iv_ruleTupleLiteralExp= ruleTupleLiteralExp EOF ;
    public final EObject entryRuleTupleLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExp = null;


        try {
            // InternalOcl.g:2401:56: (iv_ruleTupleLiteralExp= ruleTupleLiteralExp EOF )
            // InternalOcl.g:2402:2: iv_ruleTupleLiteralExp= ruleTupleLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getTupleLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTupleLiteralExp=ruleTupleLiteralExp();

            state._fsp--;

             current =iv_ruleTupleLiteralExp; 
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
    // $ANTLR end "entryRuleTupleLiteralExp"


    // $ANTLR start "ruleTupleLiteralExp"
    // InternalOcl.g:2408:1: ruleTupleLiteralExp returns [EObject current=null] : ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleTupleLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_tuplePart_3_0 = null;

        EObject lv_tuplePart_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2414:2: ( ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2415:2: ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2415:2: ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2416:3: () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2416:3: ()
            // InternalOcl.g:2417:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTupleLiteralExpAccess().getTupleLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpAccess().getTupleKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getTupleLiteralExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2431:3: ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOcl.g:2432:4: ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )*
                    {
                    // InternalOcl.g:2432:4: ( (lv_tuplePart_3_0= ruleTuplePart ) )
                    // InternalOcl.g:2433:5: (lv_tuplePart_3_0= ruleTuplePart )
                    {
                    // InternalOcl.g:2433:5: (lv_tuplePart_3_0= ruleTuplePart )
                    // InternalOcl.g:2434:6: lv_tuplePart_3_0= ruleTuplePart
                    {

                    						newCompositeNode(grammarAccess.getTupleLiteralExpAccess().getTuplePartTuplePartParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_tuplePart_3_0=ruleTuplePart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTupleLiteralExpRule());
                    						}
                    						add(
                    							current,
                    							"tuplePart",
                    							lv_tuplePart_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.TuplePart");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:2451:4: (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==20) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalOcl.g:2452:5: otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTupleLiteralExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2456:5: ( (lv_tuplePart_5_0= ruleTuplePart ) )
                    	    // InternalOcl.g:2457:6: (lv_tuplePart_5_0= ruleTuplePart )
                    	    {
                    	    // InternalOcl.g:2457:6: (lv_tuplePart_5_0= ruleTuplePart )
                    	    // InternalOcl.g:2458:7: lv_tuplePart_5_0= ruleTuplePart
                    	    {

                    	    							newCompositeNode(grammarAccess.getTupleLiteralExpAccess().getTuplePartTuplePartParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_tuplePart_5_0=ruleTuplePart();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTupleLiteralExpRule());
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
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTupleLiteralExpAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTupleLiteralExp"


    // $ANTLR start "entryRuleTuplePart"
    // InternalOcl.g:2485:1: entryRuleTuplePart returns [EObject current=null] : iv_ruleTuplePart= ruleTuplePart EOF ;
    public final EObject entryRuleTuplePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePart = null;


        try {
            // InternalOcl.g:2485:50: (iv_ruleTuplePart= ruleTuplePart EOF )
            // InternalOcl.g:2486:2: iv_ruleTuplePart= ruleTuplePart EOF
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
    // InternalOcl.g:2492:1: ruleTuplePart returns [EObject current=null] : ( ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) ;
    public final EObject ruleTuplePart() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2498:2: ( ( ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:2499:2: ( ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:2499:2: ( ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            // InternalOcl.g:2500:3: ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) )
            {
            // InternalOcl.g:2500:3: ( (lv_varName_0_0= RULE_ID ) )
            // InternalOcl.g:2501:4: (lv_varName_0_0= RULE_ID )
            {
            // InternalOcl.g:2501:4: (lv_varName_0_0= RULE_ID )
            // InternalOcl.g:2502:5: lv_varName_0_0= RULE_ID
            {
            lv_varName_0_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_varName_0_0, grammarAccess.getTuplePartAccess().getVarNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTuplePartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOcl.g:2518:3: (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==17) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOcl.g:2519:4: otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getTuplePartAccess().getColonKeyword_1_0());
                    			
                    // InternalOcl.g:2523:4: ( (lv_type_2_0= ruleOclTypeLiteral ) )
                    // InternalOcl.g:2524:5: (lv_type_2_0= ruleOclTypeLiteral )
                    {
                    // InternalOcl.g:2524:5: (lv_type_2_0= ruleOclTypeLiteral )
                    // InternalOcl.g:2525:6: lv_type_2_0= ruleOclTypeLiteral
                    {

                    						newCompositeNode(grammarAccess.getTuplePartAccess().getTypeOclTypeLiteralParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_type_2_0=ruleOclTypeLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTuplePartRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getTuplePartAccess().getEqualsSignKeyword_2());
            		
            // InternalOcl.g:2547:3: ( (lv_initExpression_4_0= ruleOclExpression ) )
            // InternalOcl.g:2548:4: (lv_initExpression_4_0= ruleOclExpression )
            {
            // InternalOcl.g:2548:4: (lv_initExpression_4_0= ruleOclExpression )
            // InternalOcl.g:2549:5: lv_initExpression_4_0= ruleOclExpression
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


    // $ANTLR start "entryRuleMapLiteralExp"
    // InternalOcl.g:2570:1: entryRuleMapLiteralExp returns [EObject current=null] : iv_ruleMapLiteralExp= ruleMapLiteralExp EOF ;
    public final EObject entryRuleMapLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExp = null;


        try {
            // InternalOcl.g:2570:54: (iv_ruleMapLiteralExp= ruleMapLiteralExp EOF )
            // InternalOcl.g:2571:2: iv_ruleMapLiteralExp= ruleMapLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getMapLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapLiteralExp=ruleMapLiteralExp();

            state._fsp--;

             current =iv_ruleMapLiteralExp; 
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
    // $ANTLR end "entryRuleMapLiteralExp"


    // $ANTLR start "ruleMapLiteralExp"
    // InternalOcl.g:2577:1: ruleMapLiteralExp returns [EObject current=null] : ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleMapLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2583:2: ( ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2584:2: ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2584:2: ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2585:3: () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2585:3: ()
            // InternalOcl.g:2586:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapLiteralExpAccess().getMapLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpAccess().getMapKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getMapLiteralExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2600:3: ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==19) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOcl.g:2601:4: ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )*
                    {
                    // InternalOcl.g:2601:4: ( (lv_elements_3_0= ruleMapElement ) )
                    // InternalOcl.g:2602:5: (lv_elements_3_0= ruleMapElement )
                    {
                    // InternalOcl.g:2602:5: (lv_elements_3_0= ruleMapElement )
                    // InternalOcl.g:2603:6: lv_elements_3_0= ruleMapElement
                    {

                    						newCompositeNode(grammarAccess.getMapLiteralExpAccess().getElementsMapElementParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_elements_3_0=ruleMapElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMapLiteralExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.MapElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:2620:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==20) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalOcl.g:2621:5: otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_16); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMapLiteralExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2625:5: ( (lv_elements_5_0= ruleMapElement ) )
                    	    // InternalOcl.g:2626:6: (lv_elements_5_0= ruleMapElement )
                    	    {
                    	    // InternalOcl.g:2626:6: (lv_elements_5_0= ruleMapElement )
                    	    // InternalOcl.g:2627:7: lv_elements_5_0= ruleMapElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMapLiteralExpAccess().getElementsMapElementParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_elements_5_0=ruleMapElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMapLiteralExpRule());
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
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMapLiteralExpAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMapLiteralExp"


    // $ANTLR start "entryRuleMapElement"
    // InternalOcl.g:2654:1: entryRuleMapElement returns [EObject current=null] : iv_ruleMapElement= ruleMapElement EOF ;
    public final EObject entryRuleMapElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapElement = null;


        try {
            // InternalOcl.g:2654:51: (iv_ruleMapElement= ruleMapElement EOF )
            // InternalOcl.g:2655:2: iv_ruleMapElement= ruleMapElement EOF
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
    // InternalOcl.g:2661:1: ruleMapElement returns [EObject current=null] : (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMapElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_key_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2667:2: ( (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' ) )
            // InternalOcl.g:2668:2: (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' )
            {
            // InternalOcl.g:2668:2: (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' )
            // InternalOcl.g:2669:3: otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMapElementAccess().getLeftParenthesisKeyword_0());
            		
            // InternalOcl.g:2673:3: ( (lv_key_1_0= ruleOclExpression ) )
            // InternalOcl.g:2674:4: (lv_key_1_0= ruleOclExpression )
            {
            // InternalOcl.g:2674:4: (lv_key_1_0= ruleOclExpression )
            // InternalOcl.g:2675:5: lv_key_1_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getMapElementAccess().getKeyOclExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
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
            		
            // InternalOcl.g:2696:3: ( (lv_value_3_0= ruleOclExpression ) )
            // InternalOcl.g:2697:4: (lv_value_3_0= ruleOclExpression )
            {
            // InternalOcl.g:2697:4: (lv_value_3_0= ruleOclExpression )
            // InternalOcl.g:2698:5: lv_value_3_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getMapElementAccess().getValueOclExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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
    // InternalOcl.g:2723:1: entryRuleEnumLiteralExp returns [EObject current=null] : iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF ;
    public final EObject entryRuleEnumLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralExp = null;


        try {
            // InternalOcl.g:2723:55: (iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF )
            // InternalOcl.g:2724:2: iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF
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
    // InternalOcl.g:2730:1: ruleEnumLiteralExp returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) otherlv_3= '#' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalOcl.g:2736:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) otherlv_3= '#' ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalOcl.g:2737:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) otherlv_3= '#' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalOcl.g:2737:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) otherlv_3= '#' ( (lv_name_4_0= RULE_ID ) ) )
            // InternalOcl.g:2738:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) otherlv_3= '#' ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalOcl.g:2738:3: ( (otherlv_0= RULE_ID ) )
            // InternalOcl.g:2739:4: (otherlv_0= RULE_ID )
            {
            // InternalOcl.g:2739:4: (otherlv_0= RULE_ID )
            // InternalOcl.g:2740:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumLiteralExpRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getEnumLiteralExpAccess().getEcoreTypesImportCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumLiteralExpAccess().getExclamationMarkKeyword_1());
            		
            // InternalOcl.g:2755:3: ( ( ruleQualifiedName ) )
            // InternalOcl.g:2756:4: ( ruleQualifiedName )
            {
            // InternalOcl.g:2756:4: ( ruleQualifiedName )
            // InternalOcl.g:2757:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumLiteralExpRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEnumLiteralExpAccess().getEnum_EEnumCrossReference_2_0());
            				
            pushFollow(FOLLOW_36);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumLiteralExpAccess().getNumberSignKeyword_3());
            		
            // InternalOcl.g:2775:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalOcl.g:2776:4: (lv_name_4_0= RULE_ID )
            {
            // InternalOcl.g:2776:4: (lv_name_4_0= RULE_ID )
            // InternalOcl.g:2777:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getEnumLiteralExpAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumLiteralExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
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
    // $ANTLR end "ruleEnumLiteralExp"


    // $ANTLR start "entryRuleLetExp"
    // InternalOcl.g:2797:1: entryRuleLetExp returns [EObject current=null] : iv_ruleLetExp= ruleLetExp EOF ;
    public final EObject entryRuleLetExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExp = null;


        try {
            // InternalOcl.g:2797:47: (iv_ruleLetExp= ruleLetExp EOF )
            // InternalOcl.g:2798:2: iv_ruleLetExp= ruleLetExp EOF
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
    // InternalOcl.g:2804:1: ruleLetExp returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) ) ;
    public final EObject ruleLetExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_in__3_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2810:2: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:2811:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:2811:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) )
            // InternalOcl.g:2812:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLetExpAccess().getLetKeyword_0());
            		
            // InternalOcl.g:2816:3: ( (lv_variable_1_0= ruleLocalVariable ) )
            // InternalOcl.g:2817:4: (lv_variable_1_0= ruleLocalVariable )
            {
            // InternalOcl.g:2817:4: (lv_variable_1_0= ruleLocalVariable )
            // InternalOcl.g:2818:5: lv_variable_1_0= ruleLocalVariable
            {

            					newCompositeNode(grammarAccess.getLetExpAccess().getVariableLocalVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
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
            		
            // InternalOcl.g:2839:3: ( (lv_in__3_0= ruleOclExpression ) )
            // InternalOcl.g:2840:4: (lv_in__3_0= ruleOclExpression )
            {
            // InternalOcl.g:2840:4: (lv_in__3_0= ruleOclExpression )
            // InternalOcl.g:2841:5: lv_in__3_0= ruleOclExpression
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
    // InternalOcl.g:2862:1: entryRuleIfExp returns [EObject current=null] : iv_ruleIfExp= ruleIfExp EOF ;
    public final EObject entryRuleIfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExp = null;


        try {
            // InternalOcl.g:2862:46: (iv_ruleIfExp= ruleIfExp EOF )
            // InternalOcl.g:2863:2: iv_ruleIfExp= ruleIfExp EOF
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
    // InternalOcl.g:2869:1: ruleIfExp returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) ;
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
            // InternalOcl.g:2875:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) )
            // InternalOcl.g:2876:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            {
            // InternalOcl.g:2876:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            // InternalOcl.g:2877:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpAccess().getIfKeyword_0());
            		
            // InternalOcl.g:2881:3: ( (lv_condition_1_0= ruleOclExpression ) )
            // InternalOcl.g:2882:4: (lv_condition_1_0= ruleOclExpression )
            {
            // InternalOcl.g:2882:4: (lv_condition_1_0= ruleOclExpression )
            // InternalOcl.g:2883:5: lv_condition_1_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIfExpAccess().getConditionOclExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
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
            		
            // InternalOcl.g:2904:3: ( (lv_thenExpression_3_0= ruleOclExpression ) )
            // InternalOcl.g:2905:4: (lv_thenExpression_3_0= ruleOclExpression )
            {
            // InternalOcl.g:2905:4: (lv_thenExpression_3_0= ruleOclExpression )
            // InternalOcl.g:2906:5: lv_thenExpression_3_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIfExpAccess().getThenExpressionOclExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
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
            		
            // InternalOcl.g:2927:3: ( (lv_elseExpression_5_0= ruleOclExpression ) )
            // InternalOcl.g:2928:4: (lv_elseExpression_5_0= ruleOclExpression )
            {
            // InternalOcl.g:2928:4: (lv_elseExpression_5_0= ruleOclExpression )
            // InternalOcl.g:2929:5: lv_elseExpression_5_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIfExpAccess().getElseExpressionOclExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_40);
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
    // InternalOcl.g:2954:1: entryRuleBraceExp returns [EObject current=null] : iv_ruleBraceExp= ruleBraceExp EOF ;
    public final EObject entryRuleBraceExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBraceExp = null;


        try {
            // InternalOcl.g:2954:49: (iv_ruleBraceExp= ruleBraceExp EOF )
            // InternalOcl.g:2955:2: iv_ruleBraceExp= ruleBraceExp EOF
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
    // InternalOcl.g:2961:1: ruleBraceExp returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBraceExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2967:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' ) )
            // InternalOcl.g:2968:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' )
            {
            // InternalOcl.g:2968:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' )
            // InternalOcl.g:2969:3: otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getBraceExpAccess().getLeftParenthesisKeyword_0());
            		
            // InternalOcl.g:2973:3: ( (lv_exp_1_0= ruleOclExpression ) )
            // InternalOcl.g:2974:4: (lv_exp_1_0= ruleOclExpression )
            {
            // InternalOcl.g:2974:4: (lv_exp_1_0= ruleOclExpression )
            // InternalOcl.g:2975:5: lv_exp_1_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getBraceExpAccess().getExpOclExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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


    // $ANTLR start "entryRuleContextlessCallExp"
    // InternalOcl.g:3000:1: entryRuleContextlessCallExp returns [EObject current=null] : iv_ruleContextlessCallExp= ruleContextlessCallExp EOF ;
    public final EObject entryRuleContextlessCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextlessCallExp = null;


        try {
            // InternalOcl.g:3000:59: (iv_ruleContextlessCallExp= ruleContextlessCallExp EOF )
            // InternalOcl.g:3001:2: iv_ruleContextlessCallExp= ruleContextlessCallExp EOF
            {
             newCompositeNode(grammarAccess.getContextlessCallExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextlessCallExp=ruleContextlessCallExp();

            state._fsp--;

             current =iv_ruleContextlessCallExp; 
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
    // $ANTLR end "entryRuleContextlessCallExp"


    // $ANTLR start "ruleContextlessCallExp"
    // InternalOcl.g:3007:1: ruleContextlessCallExp returns [EObject current=null] : ( ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleContextlessCallExp() throws RecognitionException {
        EObject current = null;

        Token lv_operationName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3013:2: ( ( ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalOcl.g:3014:2: ( ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalOcl.g:3014:2: ( ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* )? otherlv_5= ')' )
            // InternalOcl.g:3015:3: ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalOcl.g:3015:3: ( (lv_operationName_0_0= RULE_ID ) )
            // InternalOcl.g:3016:4: (lv_operationName_0_0= RULE_ID )
            {
            // InternalOcl.g:3016:4: (lv_operationName_0_0= RULE_ID )
            // InternalOcl.g:3017:5: lv_operationName_0_0= RULE_ID
            {
            lv_operationName_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_operationName_0_0, grammarAccess.getContextlessCallExpAccess().getOperationNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextlessCallExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operationName",
            						lv_operationName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getContextlessCallExpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:3037:3: ( ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_INT)||LA42_0==19||LA42_0==32||(LA42_0>=38 && LA42_0<=41)||(LA42_0>=44 && LA42_0<=48)||LA42_0==50||LA42_0==52||(LA42_0>=56 && LA42_0<=57)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOcl.g:3038:4: ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:3038:4: ( (lv_arguments_2_0= ruleOclExpression ) )
                    // InternalOcl.g:3039:5: (lv_arguments_2_0= ruleOclExpression )
                    {
                    // InternalOcl.g:3039:5: (lv_arguments_2_0= ruleOclExpression )
                    // InternalOcl.g:3040:6: lv_arguments_2_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getContextlessCallExpAccess().getArgumentsOclExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_arguments_2_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextlessCallExpRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:3057:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==20) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalOcl.g:3058:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getContextlessCallExpAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalOcl.g:3062:5: ( (lv_arguments_4_0= ruleOclExpression ) )
                    	    // InternalOcl.g:3063:6: (lv_arguments_4_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:3063:6: (lv_arguments_4_0= ruleOclExpression )
                    	    // InternalOcl.g:3064:7: lv_arguments_4_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getContextlessCallExpAccess().getArgumentsOclExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_arguments_4_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContextlessCallExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_4_0,
                    	    								"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getContextlessCallExpAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleContextlessCallExp"


    // $ANTLR start "entryRuleBooleanLiteralExp"
    // InternalOcl.g:3091:1: entryRuleBooleanLiteralExp returns [EObject current=null] : iv_ruleBooleanLiteralExp= ruleBooleanLiteralExp EOF ;
    public final EObject entryRuleBooleanLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExp = null;


        try {
            // InternalOcl.g:3091:58: (iv_ruleBooleanLiteralExp= ruleBooleanLiteralExp EOF )
            // InternalOcl.g:3092:2: iv_ruleBooleanLiteralExp= ruleBooleanLiteralExp EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteralExp=ruleBooleanLiteralExp();

            state._fsp--;

             current =iv_ruleBooleanLiteralExp; 
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
    // $ANTLR end "entryRuleBooleanLiteralExp"


    // $ANTLR start "ruleBooleanLiteralExp"
    // InternalOcl.g:3098:1: ruleBooleanLiteralExp returns [EObject current=null] : ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExp() throws RecognitionException {
        EObject current = null;

        Token lv_booleanSymbol_0_0=null;
        Token lv_booleanSymbol_1_0=null;


        	enterRule();

        try {
            // InternalOcl.g:3104:2: ( ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) ) )
            // InternalOcl.g:3105:2: ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) )
            {
            // InternalOcl.g:3105:2: ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            else if ( (LA43_0==57) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalOcl.g:3106:3: ( (lv_booleanSymbol_0_0= 'true' ) )
                    {
                    // InternalOcl.g:3106:3: ( (lv_booleanSymbol_0_0= 'true' ) )
                    // InternalOcl.g:3107:4: (lv_booleanSymbol_0_0= 'true' )
                    {
                    // InternalOcl.g:3107:4: (lv_booleanSymbol_0_0= 'true' )
                    // InternalOcl.g:3108:5: lv_booleanSymbol_0_0= 'true'
                    {
                    lv_booleanSymbol_0_0=(Token)match(input,56,FOLLOW_2); 

                    					newLeafNode(lv_booleanSymbol_0_0, grammarAccess.getBooleanLiteralExpAccess().getBooleanSymbolTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralExpRule());
                    					}
                    					setWithLastConsumed(current, "booleanSymbol", lv_booleanSymbol_0_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOcl.g:3121:3: ( (lv_booleanSymbol_1_0= 'false' ) )
                    {
                    // InternalOcl.g:3121:3: ( (lv_booleanSymbol_1_0= 'false' ) )
                    // InternalOcl.g:3122:4: (lv_booleanSymbol_1_0= 'false' )
                    {
                    // InternalOcl.g:3122:4: (lv_booleanSymbol_1_0= 'false' )
                    // InternalOcl.g:3123:5: lv_booleanSymbol_1_0= 'false'
                    {
                    lv_booleanSymbol_1_0=(Token)match(input,57,FOLLOW_2); 

                    					newLeafNode(lv_booleanSymbol_1_0, grammarAccess.getBooleanLiteralExpAccess().getBooleanSymbolFalseKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralExpRule());
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
    // $ANTLR end "ruleBooleanLiteralExp"


    // $ANTLR start "entryRulePropertyCall"
    // InternalOcl.g:3139:1: entryRulePropertyCall returns [EObject current=null] : iv_rulePropertyCall= rulePropertyCall EOF ;
    public final EObject entryRulePropertyCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCall = null;


        try {
            // InternalOcl.g:3139:53: (iv_rulePropertyCall= rulePropertyCall EOF )
            // InternalOcl.g:3140:2: iv_rulePropertyCall= rulePropertyCall EOF
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
    // InternalOcl.g:3146:1: rulePropertyCall returns [EObject current=null] : (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp ) ;
    public final EObject rulePropertyCall() throws RecognitionException {
        EObject current = null;

        EObject this_OperationCall_0 = null;

        EObject this_NavigationOrAttributeCall_1 = null;

        EObject this_IterateExp_2 = null;

        EObject this_IteratorExp_3 = null;



        	enterRule();

        try {
            // InternalOcl.g:3152:2: ( (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp ) )
            // InternalOcl.g:3153:2: (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp )
            {
            // InternalOcl.g:3153:2: (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp )
            int alt44=4;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalOcl.g:3154:3: this_OperationCall_0= ruleOperationCall
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
                    // InternalOcl.g:3163:3: this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall
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
                    // InternalOcl.g:3172:3: this_IterateExp_2= ruleIterateExp
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
                    // InternalOcl.g:3181:3: this_IteratorExp_3= ruleIteratorExp
                    {

                    			newCompositeNode(grammarAccess.getPropertyCallAccess().getIteratorExpParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IteratorExp_3=ruleIteratorExp();

                    state._fsp--;


                    			current = this_IteratorExp_3;
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
    // InternalOcl.g:3193:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // InternalOcl.g:3193:54: (iv_ruleOperationCall= ruleOperationCall EOF )
            // InternalOcl.g:3194:2: iv_ruleOperationCall= ruleOperationCall EOF
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
    // InternalOcl.g:3200:1: ruleOperationCall returns [EObject current=null] : ( ( (lv_navOperator_0_0= ruleNavigationOp ) ) ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleOperationCall() throws RecognitionException {
        EObject current = null;

        Token lv_operationName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_navOperator_0_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3206:2: ( ( ( (lv_navOperator_0_0= ruleNavigationOp ) ) ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalOcl.g:3207:2: ( ( (lv_navOperator_0_0= ruleNavigationOp ) ) ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalOcl.g:3207:2: ( ( (lv_navOperator_0_0= ruleNavigationOp ) ) ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' )
            // InternalOcl.g:3208:3: ( (lv_navOperator_0_0= ruleNavigationOp ) ) ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')'
            {
            // InternalOcl.g:3208:3: ( (lv_navOperator_0_0= ruleNavigationOp ) )
            // InternalOcl.g:3209:4: (lv_navOperator_0_0= ruleNavigationOp )
            {
            // InternalOcl.g:3209:4: (lv_navOperator_0_0= ruleNavigationOp )
            // InternalOcl.g:3210:5: lv_navOperator_0_0= ruleNavigationOp
            {

            					newCompositeNode(grammarAccess.getOperationCallAccess().getNavOperatorNavigationOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_navOperator_0_0=ruleNavigationOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationCallRule());
            					}
            					set(
            						current,
            						"navOperator",
            						lv_navOperator_0_0,
            						"fr.enseeiht.ocl.xtext.Ocl.NavigationOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOcl.g:3227:3: ( (lv_operationName_1_0= RULE_ID ) )
            // InternalOcl.g:3228:4: (lv_operationName_1_0= RULE_ID )
            {
            // InternalOcl.g:3228:4: (lv_operationName_1_0= RULE_ID )
            // InternalOcl.g:3229:5: lv_operationName_1_0= RULE_ID
            {
            lv_operationName_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_operationName_1_0, grammarAccess.getOperationCallAccess().getOperationNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operationName",
            						lv_operationName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOcl.g:3249:3: ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_INT)||LA46_0==19||LA46_0==32||(LA46_0>=38 && LA46_0<=41)||(LA46_0>=44 && LA46_0<=48)||LA46_0==50||LA46_0==52||(LA46_0>=56 && LA46_0<=57)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalOcl.g:3250:4: ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:3250:4: ( (lv_arguments_3_0= ruleOclExpression ) )
                    // InternalOcl.g:3251:5: (lv_arguments_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:3251:5: (lv_arguments_3_0= ruleOclExpression )
                    // InternalOcl.g:3252:6: lv_arguments_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getOperationCallAccess().getArgumentsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_arguments_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationCallRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOcl.g:3269:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==20) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalOcl.g:3270:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOperationCallAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:3274:5: ( (lv_arguments_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:3275:6: (lv_arguments_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:3275:6: (lv_arguments_5_0= ruleOclExpression )
                    	    // InternalOcl.g:3276:7: lv_arguments_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationCallAccess().getArgumentsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_arguments_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationCallRule());
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
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_4());
            		

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


    // $ANTLR start "entryRuleNavigationOp"
    // InternalOcl.g:3303:1: entryRuleNavigationOp returns [String current=null] : iv_ruleNavigationOp= ruleNavigationOp EOF ;
    public final String entryRuleNavigationOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOp = null;


        try {
            // InternalOcl.g:3303:52: (iv_ruleNavigationOp= ruleNavigationOp EOF )
            // InternalOcl.g:3304:2: iv_ruleNavigationOp= ruleNavigationOp EOF
            {
             newCompositeNode(grammarAccess.getNavigationOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigationOp=ruleNavigationOp();

            state._fsp--;

             current =iv_ruleNavigationOp.getText(); 
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
    // $ANTLR end "entryRuleNavigationOp"


    // $ANTLR start "ruleNavigationOp"
    // InternalOcl.g:3310:1: ruleNavigationOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleNavigationOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:3316:2: ( (kw= '->' | kw= '.' ) )
            // InternalOcl.g:3317:2: (kw= '->' | kw= '.' )
            {
            // InternalOcl.g:3317:2: (kw= '->' | kw= '.' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            else if ( (LA47_0==59) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalOcl.g:3318:3: kw= '->'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNavigationOpAccess().getHyphenMinusGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:3324:3: kw= '.'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNavigationOpAccess().getFullStopKeyword_1());
                    		

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
    // $ANTLR end "ruleNavigationOp"


    // $ANTLR start "entryRuleNavigationOrAttributeCall"
    // InternalOcl.g:3333:1: entryRuleNavigationOrAttributeCall returns [EObject current=null] : iv_ruleNavigationOrAttributeCall= ruleNavigationOrAttributeCall EOF ;
    public final EObject entryRuleNavigationOrAttributeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOrAttributeCall = null;


        try {
            // InternalOcl.g:3333:66: (iv_ruleNavigationOrAttributeCall= ruleNavigationOrAttributeCall EOF )
            // InternalOcl.g:3334:2: iv_ruleNavigationOrAttributeCall= ruleNavigationOrAttributeCall EOF
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
    // InternalOcl.g:3340:1: ruleNavigationOrAttributeCall returns [EObject current=null] : (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNavigationOrAttributeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalOcl.g:3346:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalOcl.g:3347:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalOcl.g:3347:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalOcl.g:3348:3: otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigationOrAttributeCallAccess().getFullStopKeyword_0());
            		
            // InternalOcl.g:3352:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOcl.g:3353:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOcl.g:3353:4: (lv_name_1_0= RULE_ID )
            // InternalOcl.g:3354:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNavigationOrAttributeCallAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigationOrAttributeCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleNavigationOrAttributeCall"


    // $ANTLR start "entryRuleIterateExp"
    // InternalOcl.g:3374:1: entryRuleIterateExp returns [EObject current=null] : iv_ruleIterateExp= ruleIterateExp EOF ;
    public final EObject entryRuleIterateExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterateExp = null;


        try {
            // InternalOcl.g:3374:51: (iv_ruleIterateExp= ruleIterateExp EOF )
            // InternalOcl.g:3375:2: iv_ruleIterateExp= ruleIterateExp EOF
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
    // InternalOcl.g:3381:1: ruleIterateExp returns [EObject current=null] : (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' ) ;
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
            // InternalOcl.g:3387:2: ( (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' ) )
            // InternalOcl.g:3388:2: (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' )
            {
            // InternalOcl.g:3388:2: (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' )
            // InternalOcl.g:3389:3: otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getIterateExpAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,60,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIterateExpAccess().getIterateKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getIterateExpAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOcl.g:3401:3: ( (lv_iterators_3_0= ruleIterator ) )
            // InternalOcl.g:3402:4: (lv_iterators_3_0= ruleIterator )
            {
            // InternalOcl.g:3402:4: (lv_iterators_3_0= ruleIterator )
            // InternalOcl.g:3403:5: lv_iterators_3_0= ruleIterator
            {

            					newCompositeNode(grammarAccess.getIterateExpAccess().getIteratorsIteratorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalOcl.g:3420:3: (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==20) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalOcl.g:3421:4: otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIterateExpAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalOcl.g:3425:4: ( (lv_iterators_5_0= ruleIterator ) )
            	    // InternalOcl.g:3426:5: (lv_iterators_5_0= ruleIterator )
            	    {
            	    // InternalOcl.g:3426:5: (lv_iterators_5_0= ruleIterator )
            	    // InternalOcl.g:3427:6: lv_iterators_5_0= ruleIterator
            	    {

            	    						newCompositeNode(grammarAccess.getIterateExpAccess().getIteratorsIteratorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
            	    break loop48;
                }
            } while (true);

            otherlv_6=(Token)match(input,61,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getIterateExpAccess().getSemicolonKeyword_5());
            		
            // InternalOcl.g:3449:3: ( (lv_result_7_0= ruleLocalVariable ) )
            // InternalOcl.g:3450:4: (lv_result_7_0= ruleLocalVariable )
            {
            // InternalOcl.g:3450:4: (lv_result_7_0= ruleLocalVariable )
            // InternalOcl.g:3451:5: lv_result_7_0= ruleLocalVariable
            {

            					newCompositeNode(grammarAccess.getIterateExpAccess().getResultLocalVariableParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_44);
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
            		
            // InternalOcl.g:3472:3: ( (lv_body_9_0= ruleOclExpression ) )
            // InternalOcl.g:3473:4: (lv_body_9_0= ruleOclExpression )
            {
            // InternalOcl.g:3473:4: (lv_body_9_0= ruleOclExpression )
            // InternalOcl.g:3474:5: lv_body_9_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIterateExpAccess().getBodyOclExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
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
    // InternalOcl.g:3499:1: entryRuleIterator returns [EObject current=null] : iv_ruleIterator= ruleIterator EOF ;
    public final EObject entryRuleIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterator = null;


        try {
            // InternalOcl.g:3499:49: (iv_ruleIterator= ruleIterator EOF )
            // InternalOcl.g:3500:2: iv_ruleIterator= ruleIterator EOF
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
    // InternalOcl.g:3506:1: ruleIterator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? ) ;
    public final EObject ruleIterator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3512:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? ) )
            // InternalOcl.g:3513:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? )
            {
            // InternalOcl.g:3513:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? )
            // InternalOcl.g:3514:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )?
            {
            // InternalOcl.g:3514:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOcl.g:3515:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOcl.g:3515:4: (lv_name_0_0= RULE_ID )
            // InternalOcl.g:3516:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_45); 

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

            // InternalOcl.g:3532:3: (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==17) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOcl.g:3533:4: otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getIteratorAccess().getColonKeyword_1_0());
                    			
                    // InternalOcl.g:3537:4: ( (lv_type_2_0= ruleOclTypeLiteral ) )
                    // InternalOcl.g:3538:5: (lv_type_2_0= ruleOclTypeLiteral )
                    {
                    // InternalOcl.g:3538:5: (lv_type_2_0= ruleOclTypeLiteral )
                    // InternalOcl.g:3539:6: lv_type_2_0= ruleOclTypeLiteral
                    {

                    						newCompositeNode(grammarAccess.getIteratorAccess().getTypeOclTypeLiteralParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleOclTypeLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIteratorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
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
    // InternalOcl.g:3561:1: entryRuleIteratorExp returns [EObject current=null] : iv_ruleIteratorExp= ruleIteratorExp EOF ;
    public final EObject entryRuleIteratorExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteratorExp = null;


        try {
            // InternalOcl.g:3561:52: (iv_ruleIteratorExp= ruleIteratorExp EOF )
            // InternalOcl.g:3562:2: iv_ruleIteratorExp= ruleIteratorExp EOF
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
    // InternalOcl.g:3568:1: ruleIteratorExp returns [EObject current=null] : (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' ) ;
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
            // InternalOcl.g:3574:2: ( (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' ) )
            // InternalOcl.g:3575:2: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' )
            {
            // InternalOcl.g:3575:2: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' )
            // InternalOcl.g:3576:3: otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIteratorExpAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalOcl.g:3580:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOcl.g:3581:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOcl.g:3581:4: (lv_name_1_0= RULE_ID )
            // InternalOcl.g:3582:5: lv_name_1_0= RULE_ID
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
            		
            // InternalOcl.g:3602:3: ( (lv_iterators_3_0= ruleIterator ) )
            // InternalOcl.g:3603:4: (lv_iterators_3_0= ruleIterator )
            {
            // InternalOcl.g:3603:4: (lv_iterators_3_0= ruleIterator )
            // InternalOcl.g:3604:5: lv_iterators_3_0= ruleIterator
            {

            					newCompositeNode(grammarAccess.getIteratorExpAccess().getIteratorsIteratorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
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

            // InternalOcl.g:3621:3: (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==20) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalOcl.g:3622:4: otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIteratorExpAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalOcl.g:3626:4: ( (lv_iterators_5_0= ruleIterator ) )
            	    // InternalOcl.g:3627:5: (lv_iterators_5_0= ruleIterator )
            	    {
            	    // InternalOcl.g:3627:5: (lv_iterators_5_0= ruleIterator )
            	    // InternalOcl.g:3628:6: lv_iterators_5_0= ruleIterator
            	    {

            	    						newCompositeNode(grammarAccess.getIteratorExpAccess().getIteratorsIteratorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
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
            	    break loop50;
                }
            } while (true);

            otherlv_6=(Token)match(input,62,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getIteratorExpAccess().getVerticalLineKeyword_5());
            		
            // InternalOcl.g:3650:3: ( (lv_body_7_0= ruleOclExpression ) )
            // InternalOcl.g:3651:4: (lv_body_7_0= ruleOclExpression )
            {
            // InternalOcl.g:3651:4: (lv_body_7_0= ruleOclExpression )
            // InternalOcl.g:3652:5: lv_body_7_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIteratorExpAccess().getBodyOclExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
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


    // $ANTLR start "entryRuleLocalVariable"
    // InternalOcl.g:3677:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // InternalOcl.g:3677:54: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // InternalOcl.g:3678:2: iv_ruleLocalVariable= ruleLocalVariable EOF
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
    // InternalOcl.g:3684:1: ruleLocalVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3690:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:3691:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:3691:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            // InternalOcl.g:3692:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) )
            {
            // InternalOcl.g:3692:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOcl.g:3693:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOcl.g:3693:4: (lv_name_0_0= RULE_ID )
            // InternalOcl.g:3694:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_33); 

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

            // InternalOcl.g:3710:3: (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==17) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOcl.g:3711:4: otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getLocalVariableAccess().getColonKeyword_1_0());
                    			
                    // InternalOcl.g:3715:4: ( (lv_type_2_0= ruleOclTypeLiteral ) )
                    // InternalOcl.g:3716:5: (lv_type_2_0= ruleOclTypeLiteral )
                    {
                    // InternalOcl.g:3716:5: (lv_type_2_0= ruleOclTypeLiteral )
                    // InternalOcl.g:3717:6: lv_type_2_0= ruleOclTypeLiteral
                    {

                    						newCompositeNode(grammarAccess.getLocalVariableAccess().getTypeOclTypeLiteralParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_type_2_0=ruleOclTypeLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVariableRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalOcl.g:3739:3: ( (lv_initExpression_4_0= ruleOclExpression ) )
            // InternalOcl.g:3740:4: (lv_initExpression_4_0= ruleOclExpression )
            {
            // InternalOcl.g:3740:4: (lv_initExpression_4_0= ruleOclExpression )
            // InternalOcl.g:3741:5: lv_initExpression_4_0= ruleOclExpression
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


    // $ANTLR start "entryRuleOclTypeLiteral"
    // InternalOcl.g:3762:1: entryRuleOclTypeLiteral returns [EObject current=null] : iv_ruleOclTypeLiteral= ruleOclTypeLiteral EOF ;
    public final EObject entryRuleOclTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclTypeLiteral = null;


        try {
            // InternalOcl.g:3762:55: (iv_ruleOclTypeLiteral= ruleOclTypeLiteral EOF )
            // InternalOcl.g:3763:2: iv_ruleOclTypeLiteral= ruleOclTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getOclTypeLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclTypeLiteral=ruleOclTypeLiteral();

            state._fsp--;

             current =iv_ruleOclTypeLiteral; 
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
    // $ANTLR end "entryRuleOclTypeLiteral"


    // $ANTLR start "ruleOclTypeLiteral"
    // InternalOcl.g:3769:1: ruleOclTypeLiteral returns [EObject current=null] : (this_CollectionTypeLiteral_0= ruleCollectionTypeLiteral | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_OclVoidType_3= ruleOclVoidType | this_TupleType_4= ruleTupleType | this_OclModelElementClass_5= ruleOclModelElementClass | this_MapType_6= ruleMapType ) ;
    public final EObject ruleOclTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionTypeLiteral_0 = null;

        EObject this_Primitive_1 = null;

        EObject this_OclAnyType_2 = null;

        EObject this_OclVoidType_3 = null;

        EObject this_TupleType_4 = null;

        EObject this_OclModelElementClass_5 = null;

        EObject this_MapType_6 = null;



        	enterRule();

        try {
            // InternalOcl.g:3775:2: ( (this_CollectionTypeLiteral_0= ruleCollectionTypeLiteral | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_OclVoidType_3= ruleOclVoidType | this_TupleType_4= ruleTupleType | this_OclModelElementClass_5= ruleOclModelElementClass | this_MapType_6= ruleMapType ) )
            // InternalOcl.g:3776:2: (this_CollectionTypeLiteral_0= ruleCollectionTypeLiteral | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_OclVoidType_3= ruleOclVoidType | this_TupleType_4= ruleTupleType | this_OclModelElementClass_5= ruleOclModelElementClass | this_MapType_6= ruleMapType )
            {
            // InternalOcl.g:3776:2: (this_CollectionTypeLiteral_0= ruleCollectionTypeLiteral | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_OclVoidType_3= ruleOclVoidType | this_TupleType_4= ruleTupleType | this_OclModelElementClass_5= ruleOclModelElementClass | this_MapType_6= ruleMapType )
            int alt52=7;
            switch ( input.LA(1) ) {
            case 41:
            case 44:
            case 45:
            case 46:
            case 63:
                {
                alt52=1;
                }
                break;
            case 64:
            case 65:
            case 66:
            case 67:
                {
                alt52=2;
                }
                break;
            case 68:
                {
                alt52=3;
                }
                break;
            case 69:
                {
                alt52=4;
                }
                break;
            case 47:
                {
                alt52=5;
                }
                break;
            case RULE_ID:
                {
                alt52=6;
                }
                break;
            case 48:
                {
                alt52=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalOcl.g:3777:3: this_CollectionTypeLiteral_0= ruleCollectionTypeLiteral
                    {

                    			newCompositeNode(grammarAccess.getOclTypeLiteralAccess().getCollectionTypeLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectionTypeLiteral_0=ruleCollectionTypeLiteral();

                    state._fsp--;


                    			current = this_CollectionTypeLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:3786:3: this_Primitive_1= rulePrimitive
                    {

                    			newCompositeNode(grammarAccess.getOclTypeLiteralAccess().getPrimitiveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primitive_1=rulePrimitive();

                    state._fsp--;


                    			current = this_Primitive_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOcl.g:3795:3: this_OclAnyType_2= ruleOclAnyType
                    {

                    			newCompositeNode(grammarAccess.getOclTypeLiteralAccess().getOclAnyTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OclAnyType_2=ruleOclAnyType();

                    state._fsp--;


                    			current = this_OclAnyType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOcl.g:3804:3: this_OclVoidType_3= ruleOclVoidType
                    {

                    			newCompositeNode(grammarAccess.getOclTypeLiteralAccess().getOclVoidTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OclVoidType_3=ruleOclVoidType();

                    state._fsp--;


                    			current = this_OclVoidType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOcl.g:3813:3: this_TupleType_4= ruleTupleType
                    {

                    			newCompositeNode(grammarAccess.getOclTypeLiteralAccess().getTupleTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TupleType_4=ruleTupleType();

                    state._fsp--;


                    			current = this_TupleType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOcl.g:3822:3: this_OclModelElementClass_5= ruleOclModelElementClass
                    {

                    			newCompositeNode(grammarAccess.getOclTypeLiteralAccess().getOclModelElementClassParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_OclModelElementClass_5=ruleOclModelElementClass();

                    state._fsp--;


                    			current = this_OclModelElementClass_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOcl.g:3831:3: this_MapType_6= ruleMapType
                    {

                    			newCompositeNode(grammarAccess.getOclTypeLiteralAccess().getMapTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MapType_6=ruleMapType();

                    state._fsp--;


                    			current = this_MapType_6;
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
    // $ANTLR end "ruleOclTypeLiteral"


    // $ANTLR start "entryRuleCollectionTypeLiteral"
    // InternalOcl.g:3843:1: entryRuleCollectionTypeLiteral returns [EObject current=null] : iv_ruleCollectionTypeLiteral= ruleCollectionTypeLiteral EOF ;
    public final EObject entryRuleCollectionTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeLiteral = null;


        try {
            // InternalOcl.g:3843:62: (iv_ruleCollectionTypeLiteral= ruleCollectionTypeLiteral EOF )
            // InternalOcl.g:3844:2: iv_ruleCollectionTypeLiteral= ruleCollectionTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getCollectionTypeLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionTypeLiteral=ruleCollectionTypeLiteral();

            state._fsp--;

             current =iv_ruleCollectionTypeLiteral; 
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
    // $ANTLR end "entryRuleCollectionTypeLiteral"


    // $ANTLR start "ruleCollectionTypeLiteral"
    // InternalOcl.g:3850:1: ruleCollectionTypeLiteral returns [EObject current=null] : (this_CollectionType_0= ruleCollectionType | this_BagType_1= ruleBagType | this_OrderedSetType_2= ruleOrderedSetType | this_SequenceType_3= ruleSequenceType | this_SetType_4= ruleSetType ) ;
    public final EObject ruleCollectionTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionType_0 = null;

        EObject this_BagType_1 = null;

        EObject this_OrderedSetType_2 = null;

        EObject this_SequenceType_3 = null;

        EObject this_SetType_4 = null;



        	enterRule();

        try {
            // InternalOcl.g:3856:2: ( (this_CollectionType_0= ruleCollectionType | this_BagType_1= ruleBagType | this_OrderedSetType_2= ruleOrderedSetType | this_SequenceType_3= ruleSequenceType | this_SetType_4= ruleSetType ) )
            // InternalOcl.g:3857:2: (this_CollectionType_0= ruleCollectionType | this_BagType_1= ruleBagType | this_OrderedSetType_2= ruleOrderedSetType | this_SequenceType_3= ruleSequenceType | this_SetType_4= ruleSetType )
            {
            // InternalOcl.g:3857:2: (this_CollectionType_0= ruleCollectionType | this_BagType_1= ruleBagType | this_OrderedSetType_2= ruleOrderedSetType | this_SequenceType_3= ruleSequenceType | this_SetType_4= ruleSetType )
            int alt53=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt53=1;
                }
                break;
            case 41:
                {
                alt53=2;
                }
                break;
            case 44:
                {
                alt53=3;
                }
                break;
            case 45:
                {
                alt53=4;
                }
                break;
            case 46:
                {
                alt53=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalOcl.g:3858:3: this_CollectionType_0= ruleCollectionType
                    {

                    			newCompositeNode(grammarAccess.getCollectionTypeLiteralAccess().getCollectionTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectionType_0=ruleCollectionType();

                    state._fsp--;


                    			current = this_CollectionType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:3867:3: this_BagType_1= ruleBagType
                    {

                    			newCompositeNode(grammarAccess.getCollectionTypeLiteralAccess().getBagTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BagType_1=ruleBagType();

                    state._fsp--;


                    			current = this_BagType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOcl.g:3876:3: this_OrderedSetType_2= ruleOrderedSetType
                    {

                    			newCompositeNode(grammarAccess.getCollectionTypeLiteralAccess().getOrderedSetTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrderedSetType_2=ruleOrderedSetType();

                    state._fsp--;


                    			current = this_OrderedSetType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOcl.g:3885:3: this_SequenceType_3= ruleSequenceType
                    {

                    			newCompositeNode(grammarAccess.getCollectionTypeLiteralAccess().getSequenceTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceType_3=ruleSequenceType();

                    state._fsp--;


                    			current = this_SequenceType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOcl.g:3894:3: this_SetType_4= ruleSetType
                    {

                    			newCompositeNode(grammarAccess.getCollectionTypeLiteralAccess().getSetTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetType_4=ruleSetType();

                    state._fsp--;


                    			current = this_SetType_4;
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
    // $ANTLR end "ruleCollectionTypeLiteral"


    // $ANTLR start "entryRuleCollectionType"
    // InternalOcl.g:3906:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalOcl.g:3906:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalOcl.g:3907:2: iv_ruleCollectionType= ruleCollectionType EOF
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
    // InternalOcl.g:3913:1: ruleCollectionType returns [EObject current=null] : (otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3919:2: ( (otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) )
            // InternalOcl.g:3920:2: (otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:3920:2: (otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            // InternalOcl.g:3921:3: otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionTypeAccess().getCollectionKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:3929:3: ( (lv_elementType_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:3930:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:3930:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:3931:5: lv_elementType_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getElementTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_elementType_2_0=ruleOclTypeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalOcl.g:3956:1: entryRuleBagType returns [EObject current=null] : iv_ruleBagType= ruleBagType EOF ;
    public final EObject entryRuleBagType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagType = null;


        try {
            // InternalOcl.g:3956:48: (iv_ruleBagType= ruleBagType EOF )
            // InternalOcl.g:3957:2: iv_ruleBagType= ruleBagType EOF
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
    // InternalOcl.g:3963:1: ruleBagType returns [EObject current=null] : (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleBagType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3969:2: ( (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) )
            // InternalOcl.g:3970:2: (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:3970:2: (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            // InternalOcl.g:3971:3: otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBagTypeAccess().getBagKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getBagTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:3979:3: ( (lv_elementType_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:3980:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:3980:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:3981:5: lv_elementType_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getBagTypeAccess().getElementTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_elementType_2_0=ruleOclTypeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBagTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
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
    // InternalOcl.g:4006:1: entryRuleOrderedSetType returns [EObject current=null] : iv_ruleOrderedSetType= ruleOrderedSetType EOF ;
    public final EObject entryRuleOrderedSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedSetType = null;


        try {
            // InternalOcl.g:4006:55: (iv_ruleOrderedSetType= ruleOrderedSetType EOF )
            // InternalOcl.g:4007:2: iv_ruleOrderedSetType= ruleOrderedSetType EOF
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
    // InternalOcl.g:4013:1: ruleOrderedSetType returns [EObject current=null] : (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleOrderedSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:4019:2: ( (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) )
            // InternalOcl.g:4020:2: (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:4020:2: (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            // InternalOcl.g:4021:3: otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderedSetTypeAccess().getOrderedSetKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderedSetTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:4029:3: ( (lv_elementType_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:4030:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:4030:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:4031:5: lv_elementType_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getOrderedSetTypeAccess().getElementTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_elementType_2_0=ruleOclTypeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderedSetTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
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
    // InternalOcl.g:4056:1: entryRuleSequenceType returns [EObject current=null] : iv_ruleSequenceType= ruleSequenceType EOF ;
    public final EObject entryRuleSequenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceType = null;


        try {
            // InternalOcl.g:4056:53: (iv_ruleSequenceType= ruleSequenceType EOF )
            // InternalOcl.g:4057:2: iv_ruleSequenceType= ruleSequenceType EOF
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
    // InternalOcl.g:4063:1: ruleSequenceType returns [EObject current=null] : (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleSequenceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:4069:2: ( (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) )
            // InternalOcl.g:4070:2: (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:4070:2: (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            // InternalOcl.g:4071:3: otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceTypeAccess().getSequenceKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:4079:3: ( (lv_elementType_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:4080:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:4080:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:4081:5: lv_elementType_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getSequenceTypeAccess().getElementTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_elementType_2_0=ruleOclTypeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
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
    // InternalOcl.g:4106:1: entryRuleSetType returns [EObject current=null] : iv_ruleSetType= ruleSetType EOF ;
    public final EObject entryRuleSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetType = null;


        try {
            // InternalOcl.g:4106:48: (iv_ruleSetType= ruleSetType EOF )
            // InternalOcl.g:4107:2: iv_ruleSetType= ruleSetType EOF
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
    // InternalOcl.g:4113:1: ruleSetType returns [EObject current=null] : (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:4119:2: ( (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) )
            // InternalOcl.g:4120:2: (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:4120:2: (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            // InternalOcl.g:4121:3: otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSetTypeAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSetTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:4129:3: ( (lv_elementType_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:4130:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:4130:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:4131:5: lv_elementType_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getSetTypeAccess().getElementTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_elementType_2_0=ruleOclTypeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
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
    // InternalOcl.g:4156:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalOcl.g:4156:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalOcl.g:4157:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalOcl.g:4163:1: rulePrimitive returns [EObject current=null] : (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_NumericType_2 = null;



        	enterRule();

        try {
            // InternalOcl.g:4169:2: ( (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) )
            // InternalOcl.g:4170:2: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            {
            // InternalOcl.g:4170:2: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            int alt54=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt54=1;
                }
                break;
            case 65:
                {
                alt54=2;
                }
                break;
            case 66:
            case 67:
                {
                alt54=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalOcl.g:4171:3: this_StringType_0= ruleStringType
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
                    // InternalOcl.g:4180:3: this_BooleanType_1= ruleBooleanType
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
                    // InternalOcl.g:4189:3: this_NumericType_2= ruleNumericType
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
    // InternalOcl.g:4201:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalOcl.g:4201:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalOcl.g:4202:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalOcl.g:4208:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'String' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4214:2: ( ( () otherlv_1= 'String' ) )
            // InternalOcl.g:4215:2: ( () otherlv_1= 'String' )
            {
            // InternalOcl.g:4215:2: ( () otherlv_1= 'String' )
            // InternalOcl.g:4216:3: () otherlv_1= 'String'
            {
            // InternalOcl.g:4216:3: ()
            // InternalOcl.g:4217:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_2); 

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
    // InternalOcl.g:4231:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalOcl.g:4231:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalOcl.g:4232:2: iv_ruleBooleanType= ruleBooleanType EOF
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
    // InternalOcl.g:4238:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'Boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4244:2: ( ( () otherlv_1= 'Boolean' ) )
            // InternalOcl.g:4245:2: ( () otherlv_1= 'Boolean' )
            {
            // InternalOcl.g:4245:2: ( () otherlv_1= 'Boolean' )
            // InternalOcl.g:4246:3: () otherlv_1= 'Boolean'
            {
            // InternalOcl.g:4246:3: ()
            // InternalOcl.g:4247:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_2); 

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
    // InternalOcl.g:4261:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // InternalOcl.g:4261:52: (iv_ruleNumericType= ruleNumericType EOF )
            // InternalOcl.g:4262:2: iv_ruleNumericType= ruleNumericType EOF
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
    // InternalOcl.g:4268:1: ruleNumericType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_RealType_1 = null;



        	enterRule();

        try {
            // InternalOcl.g:4274:2: ( (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType ) )
            // InternalOcl.g:4275:2: (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType )
            {
            // InternalOcl.g:4275:2: (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==66) ) {
                alt55=1;
            }
            else if ( (LA55_0==67) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalOcl.g:4276:3: this_IntegerType_0= ruleIntegerType
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
                    // InternalOcl.g:4285:3: this_RealType_1= ruleRealType
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
    // InternalOcl.g:4297:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalOcl.g:4297:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalOcl.g:4298:2: iv_ruleIntegerType= ruleIntegerType EOF
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
    // InternalOcl.g:4304:1: ruleIntegerType returns [EObject current=null] : ( () otherlv_1= 'Integer' ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4310:2: ( ( () otherlv_1= 'Integer' ) )
            // InternalOcl.g:4311:2: ( () otherlv_1= 'Integer' )
            {
            // InternalOcl.g:4311:2: ( () otherlv_1= 'Integer' )
            // InternalOcl.g:4312:3: () otherlv_1= 'Integer'
            {
            // InternalOcl.g:4312:3: ()
            // InternalOcl.g:4313:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_2); 

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
    // InternalOcl.g:4327:1: entryRuleRealType returns [EObject current=null] : iv_ruleRealType= ruleRealType EOF ;
    public final EObject entryRuleRealType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealType = null;


        try {
            // InternalOcl.g:4327:49: (iv_ruleRealType= ruleRealType EOF )
            // InternalOcl.g:4328:2: iv_ruleRealType= ruleRealType EOF
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
    // InternalOcl.g:4334:1: ruleRealType returns [EObject current=null] : ( () otherlv_1= 'Real' ) ;
    public final EObject ruleRealType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4340:2: ( ( () otherlv_1= 'Real' ) )
            // InternalOcl.g:4341:2: ( () otherlv_1= 'Real' )
            {
            // InternalOcl.g:4341:2: ( () otherlv_1= 'Real' )
            // InternalOcl.g:4342:3: () otherlv_1= 'Real'
            {
            // InternalOcl.g:4342:3: ()
            // InternalOcl.g:4343:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealTypeAccess().getRealTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_2); 

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
    // InternalOcl.g:4357:1: entryRuleOclAnyType returns [EObject current=null] : iv_ruleOclAnyType= ruleOclAnyType EOF ;
    public final EObject entryRuleOclAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclAnyType = null;


        try {
            // InternalOcl.g:4357:51: (iv_ruleOclAnyType= ruleOclAnyType EOF )
            // InternalOcl.g:4358:2: iv_ruleOclAnyType= ruleOclAnyType EOF
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
    // InternalOcl.g:4364:1: ruleOclAnyType returns [EObject current=null] : ( () otherlv_1= 'OclAny' ) ;
    public final EObject ruleOclAnyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4370:2: ( ( () otherlv_1= 'OclAny' ) )
            // InternalOcl.g:4371:2: ( () otherlv_1= 'OclAny' )
            {
            // InternalOcl.g:4371:2: ( () otherlv_1= 'OclAny' )
            // InternalOcl.g:4372:3: () otherlv_1= 'OclAny'
            {
            // InternalOcl.g:4372:3: ()
            // InternalOcl.g:4373:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOclAnyTypeAccess().getOclAnyTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_2); 

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


    // $ANTLR start "entryRuleOclVoidType"
    // InternalOcl.g:4387:1: entryRuleOclVoidType returns [EObject current=null] : iv_ruleOclVoidType= ruleOclVoidType EOF ;
    public final EObject entryRuleOclVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclVoidType = null;


        try {
            // InternalOcl.g:4387:52: (iv_ruleOclVoidType= ruleOclVoidType EOF )
            // InternalOcl.g:4388:2: iv_ruleOclVoidType= ruleOclVoidType EOF
            {
             newCompositeNode(grammarAccess.getOclVoidTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclVoidType=ruleOclVoidType();

            state._fsp--;

             current =iv_ruleOclVoidType; 
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
    // $ANTLR end "entryRuleOclVoidType"


    // $ANTLR start "ruleOclVoidType"
    // InternalOcl.g:4394:1: ruleOclVoidType returns [EObject current=null] : ( () otherlv_1= 'OclVoid' ) ;
    public final EObject ruleOclVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4400:2: ( ( () otherlv_1= 'OclVoid' ) )
            // InternalOcl.g:4401:2: ( () otherlv_1= 'OclVoid' )
            {
            // InternalOcl.g:4401:2: ( () otherlv_1= 'OclVoid' )
            // InternalOcl.g:4402:3: () otherlv_1= 'OclVoid'
            {
            // InternalOcl.g:4402:3: ()
            // InternalOcl.g:4403:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOclVoidTypeAccess().getOclVoidTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getOclVoidTypeAccess().getOclVoidKeyword_1());
            		

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
    // $ANTLR end "ruleOclVoidType"


    // $ANTLR start "entryRuleTupleType"
    // InternalOcl.g:4417:1: entryRuleTupleType returns [EObject current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final EObject entryRuleTupleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleType = null;


        try {
            // InternalOcl.g:4417:50: (iv_ruleTupleType= ruleTupleType EOF )
            // InternalOcl.g:4418:2: iv_ruleTupleType= ruleTupleType EOF
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
    // InternalOcl.g:4424:1: ruleTupleType returns [EObject current=null] : ( () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalOcl.g:4430:2: ( ( () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')' ) )
            // InternalOcl.g:4431:2: ( () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')' )
            {
            // InternalOcl.g:4431:2: ( () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')' )
            // InternalOcl.g:4432:3: () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')'
            {
            // InternalOcl.g:4432:3: ()
            // InternalOcl.g:4433:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTupleTypeAccess().getTupleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleTypeAccess().getTupleKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOcl.g:4447:3: ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOcl.g:4448:4: ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )*
                    {
                    // InternalOcl.g:4448:4: ( (lv_attributes_3_0= ruleTupleTypeAttribute ) )
                    // InternalOcl.g:4449:5: (lv_attributes_3_0= ruleTupleTypeAttribute )
                    {
                    // InternalOcl.g:4449:5: (lv_attributes_3_0= ruleTupleTypeAttribute )
                    // InternalOcl.g:4450:6: lv_attributes_3_0= ruleTupleTypeAttribute
                    {

                    						newCompositeNode(grammarAccess.getTupleTypeAccess().getAttributesTupleTypeAttributeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    // InternalOcl.g:4467:4: (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==20) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalOcl.g:4468:5: otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTupleTypeAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:4472:5: ( (lv_attributes_5_0= ruleTupleTypeAttribute ) )
                    	    // InternalOcl.g:4473:6: (lv_attributes_5_0= ruleTupleTypeAttribute )
                    	    {
                    	    // InternalOcl.g:4473:6: (lv_attributes_5_0= ruleTupleTypeAttribute )
                    	    // InternalOcl.g:4474:7: lv_attributes_5_0= ruleTupleTypeAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getTupleTypeAccess().getAttributesTupleTypeAttributeParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
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
                    	    break loop56;
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
    // InternalOcl.g:4501:1: entryRuleTupleTypeAttribute returns [EObject current=null] : iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF ;
    public final EObject entryRuleTupleTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeAttribute = null;


        try {
            // InternalOcl.g:4501:59: (iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF )
            // InternalOcl.g:4502:2: iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF
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
    // InternalOcl.g:4508:1: ruleTupleTypeAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) ) ;
    public final EObject ruleTupleTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:4514:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) ) )
            // InternalOcl.g:4515:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )
            {
            // InternalOcl.g:4515:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )
            // InternalOcl.g:4516:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) )
            {
            // InternalOcl.g:4516:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOcl.g:4517:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOcl.g:4517:4: (lv_name_0_0= RULE_ID )
            // InternalOcl.g:4518:5: lv_name_0_0= RULE_ID
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
            		
            // InternalOcl.g:4538:3: ( (lv_type_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:4539:4: (lv_type_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:4539:4: (lv_type_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:4540:5: lv_type_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getTupleTypeAttributeAccess().getTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleOclTypeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleTypeAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
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


    // $ANTLR start "entryRuleOclModelElementClass"
    // InternalOcl.g:4561:1: entryRuleOclModelElementClass returns [EObject current=null] : iv_ruleOclModelElementClass= ruleOclModelElementClass EOF ;
    public final EObject entryRuleOclModelElementClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclModelElementClass = null;


        try {
            // InternalOcl.g:4561:61: (iv_ruleOclModelElementClass= ruleOclModelElementClass EOF )
            // InternalOcl.g:4562:2: iv_ruleOclModelElementClass= ruleOclModelElementClass EOF
            {
             newCompositeNode(grammarAccess.getOclModelElementClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclModelElementClass=ruleOclModelElementClass();

            state._fsp--;

             current =iv_ruleOclModelElementClass; 
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
    // $ANTLR end "entryRuleOclModelElementClass"


    // $ANTLR start "ruleOclModelElementClass"
    // InternalOcl.g:4568:1: ruleOclModelElementClass returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleOclModelElementClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4574:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) ) )
            // InternalOcl.g:4575:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) )
            {
            // InternalOcl.g:4575:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) )
            // InternalOcl.g:4576:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) )
            {
            // InternalOcl.g:4576:3: ( (otherlv_0= RULE_ID ) )
            // InternalOcl.g:4577:4: (otherlv_0= RULE_ID )
            {
            // InternalOcl.g:4577:4: (otherlv_0= RULE_ID )
            // InternalOcl.g:4578:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOclModelElementClassRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getOclModelElementClassAccess().getModelImportCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOclModelElementClassAccess().getExclamationMarkKeyword_1());
            		
            // InternalOcl.g:4593:3: ( ( ruleQualifiedName ) )
            // InternalOcl.g:4594:4: ( ruleQualifiedName )
            {
            // InternalOcl.g:4594:4: ( ruleQualifiedName )
            // InternalOcl.g:4595:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOclModelElementClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOclModelElementClassAccess().getNameEClassifierCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleOclModelElementClass"


    // $ANTLR start "entryRuleMapType"
    // InternalOcl.g:4613:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // InternalOcl.g:4613:48: (iv_ruleMapType= ruleMapType EOF )
            // InternalOcl.g:4614:2: iv_ruleMapType= ruleMapType EOF
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
    // InternalOcl.g:4620:1: ruleMapType returns [EObject current=null] : (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclTypeLiteral ) ) otherlv_5= ')' ) ;
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
            // InternalOcl.g:4626:2: ( (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclTypeLiteral ) ) otherlv_5= ')' ) )
            // InternalOcl.g:4627:2: (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclTypeLiteral ) ) otherlv_5= ')' )
            {
            // InternalOcl.g:4627:2: (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclTypeLiteral ) ) otherlv_5= ')' )
            // InternalOcl.g:4628:3: otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclTypeLiteral ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getMapKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:4636:3: ( (lv_keyType_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:4637:4: (lv_keyType_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:4637:4: (lv_keyType_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:4638:5: lv_keyType_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getMapTypeAccess().getKeyTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_35);
            lv_keyType_2_0=ruleOclTypeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapTypeRule());
            					}
            					set(
            						current,
            						"keyType",
            						lv_keyType_2_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getMapTypeAccess().getCommaKeyword_3());
            		
            // InternalOcl.g:4659:3: ( (lv_valueType_4_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:4660:4: (lv_valueType_4_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:4660:4: (lv_valueType_4_0= ruleOclTypeLiteral )
            // InternalOcl.g:4661:5: lv_valueType_4_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getMapTypeAccess().getValueTypeOclTypeLiteralParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_valueType_4_0=ruleOclTypeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapTypeRule());
            					}
            					set(
            						current,
            						"valueType",
            						lv_valueType_4_0,
            						"fr.enseeiht.ocl.xtext.Ocl.OclTypeLiteral");
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
    // InternalOcl.g:4686:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalOcl.g:4686:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalOcl.g:4687:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalOcl.g:4693:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalOcl.g:4699:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID ) ) )
            // InternalOcl.g:4700:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID ) )
            {
            // InternalOcl.g:4700:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID ) )
            // InternalOcl.g:4701:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_47); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalOcl.g:4708:3: (kw= '.' this_ID_2= RULE_ID )
            // InternalOcl.g:4709:4: kw= '.' this_ID_2= RULE_ID
            {
            kw=(Token)match(input,59,FOLLOW_8); 

            				current.merge(kw);
            				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            			
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            				current.merge(this_ID_2);
            			

            				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            			

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
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA44 dfa44 = new DFA44(this);
    static final String dfa_1s = "\27\uffff";
    static final String dfa_2s = "\1\uffff\1\20\22\uffff\1\25\2\uffff";
    static final String dfa_3s = "\1\4\1\16\15\uffff\1\5\2\uffff\1\73\1\5\1\16\2\uffff";
    static final String dfa_4s = "\1\71\1\76\15\uffff\1\5\2\uffff\1\73\1\5\1\76\2\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\uffff\1\1\1\21\3\uffff\1\20\1\15";
    static final String dfa_6s = "\27\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\1\2\5\13\uffff\1\16\23\uffff\1\2\1\6\1\7\2\uffff\1\10\1\11\1\12\1\13\1\14\3\uffff\1\15\3\uffff\2\4",
            "\1\20\1\17\1\20\1\uffff\1\20\1\21\22\20\5\uffff\1\20\7\uffff\1\20\1\uffff\3\20\2\uffff\2\20\2\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22",
            "",
            "",
            "\1\23",
            "\1\24",
            "\1\25\1\uffff\1\25\1\uffff\1\25\1\uffff\22\25\5\uffff\1\25\5\uffff\1\26\1\uffff\1\25\1\uffff\3\25\2\uffff\2\25\2\uffff\1\25",
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

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1659:2: (this_VariableExp_0= ruleVariableExp | this_SelfLiteralExp_1= ruleSelfLiteralExp | this_StringLiteralExp_2= ruleStringLiteralExp | this_BooleanLiteralExp_3= ruleBooleanLiteralExp | this_NumericLiteralExp_4= ruleNumericLiteralExp | this_NullLiteralExp_5= ruleNullLiteralExp | this_BagLiteralExp_6= ruleBagLiteralExp | this_OrderedSetLiteralExp_7= ruleOrderedSetLiteralExp | this_SequenceLiteralExp_8= ruleSequenceLiteralExp | this_SetLiteralExp_9= ruleSetLiteralExp | this_TupleLiteralExp_10= ruleTupleLiteralExp | this_MapLiteralExp_11= ruleMapLiteralExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_IfExp_13= ruleIfExp | this_BraceExp_14= ruleBraceExp | this_OclModelElementExp_15= ruleOclModelElementExp | this_ContextlessCallExp_16= ruleContextlessCallExp )";
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\5\uffff\1\10\7\uffff";
    static final String dfa_10s = "\1\72\2\5\1\23\1\uffff\1\16\1\4\2\uffff\1\17\1\uffff\1\4\1\17";
    static final String dfa_11s = "\1\73\1\74\1\5\1\23\1\uffff\1\76\1\71\2\uffff\1\76\1\uffff\1\71\1\76";
    static final String dfa_12s = "\4\uffff\1\3\2\uffff\1\1\1\2\1\uffff\1\4\2\uffff";
    static final String dfa_13s = "\15\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\2",
            "\1\3\66\uffff\1\4",
            "\1\5",
            "\1\6",
            "",
            "\1\10\1\uffff\1\10\1\uffff\1\10\1\7\22\10\5\uffff\1\10\7\uffff\1\10\1\uffff\3\10\2\uffff\2\10\2\uffff\1\10",
            "\1\7\1\11\2\7\13\uffff\1\7\1\uffff\1\7\12\uffff\1\7\5\uffff\4\7\2\uffff\5\7\1\uffff\1\7\1\uffff\1\7\3\uffff\2\7",
            "",
            "",
            "\1\7\1\uffff\1\12\2\7\1\13\1\7\1\uffff\17\7\24\uffff\2\7\2\uffff\1\12",
            "",
            "\1\7\1\14\2\7\13\uffff\1\7\14\uffff\1\7\5\uffff\4\7\2\uffff\5\7\1\uffff\1\7\1\uffff\1\7\3\uffff\2\7",
            "\1\7\1\uffff\1\12\2\7\1\13\1\7\1\uffff\17\7\24\uffff\2\7\2\uffff\1\12"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "3153:2: (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp )";
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x8001F20000000020L,0x000000000000003FL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0315F3C1000800F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0311F3C1000800F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008040002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0315FBC1000800F0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0315F3C1002800F0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000100000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4000000000100000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});

}