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

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_INT)||LA9_0==19||LA9_0==32||(LA9_0>=38 && LA9_0<=41)||(LA9_0>=44 && LA9_0<=48)||LA9_0==52||(LA9_0>=56 && LA9_0<=57)) ) {
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
    // InternalOcl.g:744:1: ruleOclModelElementExp returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleOclModelElementExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:750:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) ) )
            // InternalOcl.g:751:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) )
            {
            // InternalOcl.g:751:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) )
            // InternalOcl.g:752:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) )
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
            		
            // InternalOcl.g:769:3: ( ( ruleQualifiedName ) )
            // InternalOcl.g:770:4: ( ruleQualifiedName )
            {
            // InternalOcl.g:770:4: ( ruleQualifiedName )
            // InternalOcl.g:771:5: ruleQualifiedName
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
    // InternalOcl.g:789:1: entryRuleOperatorCallExp returns [EObject current=null] : iv_ruleOperatorCallExp= ruleOperatorCallExp EOF ;
    public final EObject entryRuleOperatorCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorCallExp = null;


        try {
            // InternalOcl.g:789:56: (iv_ruleOperatorCallExp= ruleOperatorCallExp EOF )
            // InternalOcl.g:790:2: iv_ruleOperatorCallExp= ruleOperatorCallExp EOF
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
    // InternalOcl.g:796:1: ruleOperatorCallExp returns [EObject current=null] : ( ( (lv_args_0_0= ruleEqOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) ) )* ) ;
    public final EObject ruleOperatorCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_args_0_0 = null;

        AntlrDatatypeRuleToken lv_operationNames_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:802:2: ( ( ( (lv_args_0_0= ruleEqOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) ) )* ) )
            // InternalOcl.g:803:2: ( ( (lv_args_0_0= ruleEqOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) ) )* )
            {
            // InternalOcl.g:803:2: ( ( (lv_args_0_0= ruleEqOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) ) )* )
            // InternalOcl.g:804:3: ( (lv_args_0_0= ruleEqOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) ) )*
            {
            // InternalOcl.g:804:3: ( (lv_args_0_0= ruleEqOpCallExp ) )
            // InternalOcl.g:805:4: (lv_args_0_0= ruleEqOpCallExp )
            {
            // InternalOcl.g:805:4: (lv_args_0_0= ruleEqOpCallExp )
            // InternalOcl.g:806:5: lv_args_0_0= ruleEqOpCallExp
            {

            					newCompositeNode(grammarAccess.getOperatorCallExpAccess().getArgsEqOpCallExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalOcl.g:823:3: ( ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=23 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOcl.g:824:4: ( (lv_operationNames_1_0= ruleBOOLOP ) ) ( (lv_args_2_0= ruleEqOpCallExp ) )
            	    {
            	    // InternalOcl.g:824:4: ( (lv_operationNames_1_0= ruleBOOLOP ) )
            	    // InternalOcl.g:825:5: (lv_operationNames_1_0= ruleBOOLOP )
            	    {
            	    // InternalOcl.g:825:5: (lv_operationNames_1_0= ruleBOOLOP )
            	    // InternalOcl.g:826:6: lv_operationNames_1_0= ruleBOOLOP
            	    {

            	    						newCompositeNode(grammarAccess.getOperatorCallExpAccess().getOperationNamesBOOLOPParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_20);
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

            	    // InternalOcl.g:843:4: ( (lv_args_2_0= ruleEqOpCallExp ) )
            	    // InternalOcl.g:844:5: (lv_args_2_0= ruleEqOpCallExp )
            	    {
            	    // InternalOcl.g:844:5: (lv_args_2_0= ruleEqOpCallExp )
            	    // InternalOcl.g:845:6: lv_args_2_0= ruleEqOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getOperatorCallExpAccess().getArgsEqOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
    // InternalOcl.g:874:1: ruleBOOLOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:880:2: ( (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // InternalOcl.g:881:2: (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // InternalOcl.g:881:2: (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt11=4;
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
    // InternalOcl.g:909:1: entryRuleEqOpCallExp returns [EObject current=null] : iv_ruleEqOpCallExp= ruleEqOpCallExp EOF ;
    public final EObject entryRuleEqOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqOpCallExp = null;


        try {
            // InternalOcl.g:909:52: (iv_ruleEqOpCallExp= ruleEqOpCallExp EOF )
            // InternalOcl.g:910:2: iv_ruleEqOpCallExp= ruleEqOpCallExp EOF
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
    // InternalOcl.g:916:1: ruleEqOpCallExp returns [EObject current=null] : ( ( (lv_args_0_0= ruleRelOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) ) )? ) ;
    public final EObject ruleEqOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_args_0_0 = null;

        AntlrDatatypeRuleToken lv_operationNames_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:922:2: ( ( ( (lv_args_0_0= ruleRelOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) ) )? ) )
            // InternalOcl.g:923:2: ( ( (lv_args_0_0= ruleRelOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) ) )? )
            {
            // InternalOcl.g:923:2: ( ( (lv_args_0_0= ruleRelOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) ) )? )
            // InternalOcl.g:924:3: ( (lv_args_0_0= ruleRelOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) ) )?
            {
            // InternalOcl.g:924:3: ( (lv_args_0_0= ruleRelOpCallExp ) )
            // InternalOcl.g:925:4: (lv_args_0_0= ruleRelOpCallExp )
            {
            // InternalOcl.g:925:4: (lv_args_0_0= ruleRelOpCallExp )
            // InternalOcl.g:926:5: lv_args_0_0= ruleRelOpCallExp
            {

            					newCompositeNode(grammarAccess.getEqOpCallExpAccess().getArgsRelOpCallExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalOcl.g:943:3: ( ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18||LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOcl.g:944:4: ( (lv_operationNames_1_0= ruleEQOP ) ) ( (lv_args_2_0= ruleRelOpCallExp ) )
                    {
                    // InternalOcl.g:944:4: ( (lv_operationNames_1_0= ruleEQOP ) )
                    // InternalOcl.g:945:5: (lv_operationNames_1_0= ruleEQOP )
                    {
                    // InternalOcl.g:945:5: (lv_operationNames_1_0= ruleEQOP )
                    // InternalOcl.g:946:6: lv_operationNames_1_0= ruleEQOP
                    {

                    						newCompositeNode(grammarAccess.getEqOpCallExpAccess().getOperationNamesEQOPParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    // InternalOcl.g:963:4: ( (lv_args_2_0= ruleRelOpCallExp ) )
                    // InternalOcl.g:964:5: (lv_args_2_0= ruleRelOpCallExp )
                    {
                    // InternalOcl.g:964:5: (lv_args_2_0= ruleRelOpCallExp )
                    // InternalOcl.g:965:6: lv_args_2_0= ruleRelOpCallExp
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
    // InternalOcl.g:987:1: entryRuleEQOP returns [String current=null] : iv_ruleEQOP= ruleEQOP EOF ;
    public final String entryRuleEQOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEQOP = null;


        try {
            // InternalOcl.g:987:44: (iv_ruleEQOP= ruleEQOP EOF )
            // InternalOcl.g:988:2: iv_ruleEQOP= ruleEQOP EOF
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
    // InternalOcl.g:994:1: ruleEQOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken ruleEQOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1000:2: ( (kw= '=' | kw= '<>' ) )
            // InternalOcl.g:1001:2: (kw= '=' | kw= '<>' )
            {
            // InternalOcl.g:1001:2: (kw= '=' | kw= '<>' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOcl.g:1002:3: kw= '='
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEQOPAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1008:3: kw= '<>'
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
    // InternalOcl.g:1017:1: entryRuleRelOpCallExp returns [EObject current=null] : iv_ruleRelOpCallExp= ruleRelOpCallExp EOF ;
    public final EObject entryRuleRelOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelOpCallExp = null;


        try {
            // InternalOcl.g:1017:53: (iv_ruleRelOpCallExp= ruleRelOpCallExp EOF )
            // InternalOcl.g:1018:2: iv_ruleRelOpCallExp= ruleRelOpCallExp EOF
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
    // InternalOcl.g:1024:1: ruleRelOpCallExp returns [EObject current=null] : ( ( (lv_args_0_0= ruleAddOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) ) )? ) ;
    public final EObject ruleRelOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_args_0_0 = null;

        AntlrDatatypeRuleToken lv_operationNames_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1030:2: ( ( ( (lv_args_0_0= ruleAddOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) ) )? ) )
            // InternalOcl.g:1031:2: ( ( (lv_args_0_0= ruleAddOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) ) )? )
            {
            // InternalOcl.g:1031:2: ( ( (lv_args_0_0= ruleAddOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) ) )? )
            // InternalOcl.g:1032:3: ( (lv_args_0_0= ruleAddOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) ) )?
            {
            // InternalOcl.g:1032:3: ( (lv_args_0_0= ruleAddOpCallExp ) )
            // InternalOcl.g:1033:4: (lv_args_0_0= ruleAddOpCallExp )
            {
            // InternalOcl.g:1033:4: (lv_args_0_0= ruleAddOpCallExp )
            // InternalOcl.g:1034:5: lv_args_0_0= ruleAddOpCallExp
            {

            					newCompositeNode(grammarAccess.getRelOpCallExpAccess().getArgsAddOpCallExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalOcl.g:1051:3: ( ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=28 && LA14_0<=31)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOcl.g:1052:4: ( (lv_operationNames_1_0= ruleRELOP ) ) ( (lv_args_2_0= ruleAddOpCallExp ) )
                    {
                    // InternalOcl.g:1052:4: ( (lv_operationNames_1_0= ruleRELOP ) )
                    // InternalOcl.g:1053:5: (lv_operationNames_1_0= ruleRELOP )
                    {
                    // InternalOcl.g:1053:5: (lv_operationNames_1_0= ruleRELOP )
                    // InternalOcl.g:1054:6: lv_operationNames_1_0= ruleRELOP
                    {

                    						newCompositeNode(grammarAccess.getRelOpCallExpAccess().getOperationNamesRELOPParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    // InternalOcl.g:1071:4: ( (lv_args_2_0= ruleAddOpCallExp ) )
                    // InternalOcl.g:1072:5: (lv_args_2_0= ruleAddOpCallExp )
                    {
                    // InternalOcl.g:1072:5: (lv_args_2_0= ruleAddOpCallExp )
                    // InternalOcl.g:1073:6: lv_args_2_0= ruleAddOpCallExp
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
    // InternalOcl.g:1095:1: entryRuleRELOP returns [String current=null] : iv_ruleRELOP= ruleRELOP EOF ;
    public final String entryRuleRELOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRELOP = null;


        try {
            // InternalOcl.g:1095:45: (iv_ruleRELOP= ruleRELOP EOF )
            // InternalOcl.g:1096:2: iv_ruleRELOP= ruleRELOP EOF
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
    // InternalOcl.g:1102:1: ruleRELOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleRELOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1108:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) )
            // InternalOcl.g:1109:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            {
            // InternalOcl.g:1109:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            case 31:
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
                    // InternalOcl.g:1110:3: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRELOPAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1116:3: kw= '<'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRELOPAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOcl.g:1122:3: kw= '>='
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRELOPAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOcl.g:1128:3: kw= '<='
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
    // InternalOcl.g:1137:1: entryRuleAddOpCallExp returns [EObject current=null] : iv_ruleAddOpCallExp= ruleAddOpCallExp EOF ;
    public final EObject entryRuleAddOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOpCallExp = null;


        try {
            // InternalOcl.g:1137:53: (iv_ruleAddOpCallExp= ruleAddOpCallExp EOF )
            // InternalOcl.g:1138:2: iv_ruleAddOpCallExp= ruleAddOpCallExp EOF
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
    // InternalOcl.g:1144:1: ruleAddOpCallExp returns [EObject current=null] : ( ( (lv_args_0_0= ruleIntOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) ) )* ) ;
    public final EObject ruleAddOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_args_0_0 = null;

        AntlrDatatypeRuleToken lv_operationNames_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1150:2: ( ( ( (lv_args_0_0= ruleIntOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) ) )* ) )
            // InternalOcl.g:1151:2: ( ( (lv_args_0_0= ruleIntOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) ) )* )
            {
            // InternalOcl.g:1151:2: ( ( (lv_args_0_0= ruleIntOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) ) )* )
            // InternalOcl.g:1152:3: ( (lv_args_0_0= ruleIntOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) ) )*
            {
            // InternalOcl.g:1152:3: ( (lv_args_0_0= ruleIntOpCallExp ) )
            // InternalOcl.g:1153:4: (lv_args_0_0= ruleIntOpCallExp )
            {
            // InternalOcl.g:1153:4: (lv_args_0_0= ruleIntOpCallExp )
            // InternalOcl.g:1154:5: lv_args_0_0= ruleIntOpCallExp
            {

            					newCompositeNode(grammarAccess.getAddOpCallExpAccess().getArgsIntOpCallExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalOcl.g:1171:3: ( ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=32 && LA16_0<=33)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOcl.g:1172:4: ( (lv_operationNames_1_0= ruleADDOP ) ) ( (lv_args_2_0= ruleIntOpCallExp ) )
            	    {
            	    // InternalOcl.g:1172:4: ( (lv_operationNames_1_0= ruleADDOP ) )
            	    // InternalOcl.g:1173:5: (lv_operationNames_1_0= ruleADDOP )
            	    {
            	    // InternalOcl.g:1173:5: (lv_operationNames_1_0= ruleADDOP )
            	    // InternalOcl.g:1174:6: lv_operationNames_1_0= ruleADDOP
            	    {

            	    						newCompositeNode(grammarAccess.getAddOpCallExpAccess().getOperationNamesADDOPParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_20);
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

            	    // InternalOcl.g:1191:4: ( (lv_args_2_0= ruleIntOpCallExp ) )
            	    // InternalOcl.g:1192:5: (lv_args_2_0= ruleIntOpCallExp )
            	    {
            	    // InternalOcl.g:1192:5: (lv_args_2_0= ruleIntOpCallExp )
            	    // InternalOcl.g:1193:6: lv_args_2_0= ruleIntOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getAddOpCallExpAccess().getArgsIntOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
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

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            else if ( (LA17_0==33) ) {
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
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getADDOPAccess().getHyphenMinusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1236:3: kw= '+'
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
    // InternalOcl.g:1252:1: ruleIntOpCallExp returns [EObject current=null] : ( ( (lv_args_0_0= ruleMulOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) ) )* ) ;
    public final EObject ruleIntOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_args_0_0 = null;

        AntlrDatatypeRuleToken lv_operationNames_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1258:2: ( ( ( (lv_args_0_0= ruleMulOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) ) )* ) )
            // InternalOcl.g:1259:2: ( ( (lv_args_0_0= ruleMulOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) ) )* )
            {
            // InternalOcl.g:1259:2: ( ( (lv_args_0_0= ruleMulOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) ) )* )
            // InternalOcl.g:1260:3: ( (lv_args_0_0= ruleMulOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) ) )*
            {
            // InternalOcl.g:1260:3: ( (lv_args_0_0= ruleMulOpCallExp ) )
            // InternalOcl.g:1261:4: (lv_args_0_0= ruleMulOpCallExp )
            {
            // InternalOcl.g:1261:4: (lv_args_0_0= ruleMulOpCallExp )
            // InternalOcl.g:1262:5: lv_args_0_0= ruleMulOpCallExp
            {

            					newCompositeNode(grammarAccess.getIntOpCallExpAccess().getArgsMulOpCallExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalOcl.g:1279:3: ( ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=34 && LA18_0<=35)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOcl.g:1280:4: ( (lv_operationNames_1_0= ruleINTOP ) ) ( (lv_args_2_0= ruleMulOpCallExp ) )
            	    {
            	    // InternalOcl.g:1280:4: ( (lv_operationNames_1_0= ruleINTOP ) )
            	    // InternalOcl.g:1281:5: (lv_operationNames_1_0= ruleINTOP )
            	    {
            	    // InternalOcl.g:1281:5: (lv_operationNames_1_0= ruleINTOP )
            	    // InternalOcl.g:1282:6: lv_operationNames_1_0= ruleINTOP
            	    {

            	    						newCompositeNode(grammarAccess.getIntOpCallExpAccess().getOperationNamesINTOPParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_20);
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

            	    // InternalOcl.g:1299:4: ( (lv_args_2_0= ruleMulOpCallExp ) )
            	    // InternalOcl.g:1300:5: (lv_args_2_0= ruleMulOpCallExp )
            	    {
            	    // InternalOcl.g:1300:5: (lv_args_2_0= ruleMulOpCallExp )
            	    // InternalOcl.g:1301:6: lv_args_2_0= ruleMulOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getIntOpCallExpAccess().getArgsMulOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
    // InternalOcl.g:1323:1: entryRuleINTOP returns [String current=null] : iv_ruleINTOP= ruleINTOP EOF ;
    public final String entryRuleINTOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTOP = null;


        try {
            // InternalOcl.g:1323:45: (iv_ruleINTOP= ruleINTOP EOF )
            // InternalOcl.g:1324:2: iv_ruleINTOP= ruleINTOP EOF
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
    // InternalOcl.g:1330:1: ruleINTOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'div' | kw= 'mod' ) ;
    public final AntlrDatatypeRuleToken ruleINTOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1336:2: ( (kw= 'div' | kw= 'mod' ) )
            // InternalOcl.g:1337:2: (kw= 'div' | kw= 'mod' )
            {
            // InternalOcl.g:1337:2: (kw= 'div' | kw= 'mod' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            else if ( (LA19_0==35) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalOcl.g:1338:3: kw= 'div'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getINTOPAccess().getDivKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1344:3: kw= 'mod'
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
    // InternalOcl.g:1353:1: entryRuleMulOpCallExp returns [EObject current=null] : iv_ruleMulOpCallExp= ruleMulOpCallExp EOF ;
    public final EObject entryRuleMulOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOpCallExp = null;


        try {
            // InternalOcl.g:1353:53: (iv_ruleMulOpCallExp= ruleMulOpCallExp EOF )
            // InternalOcl.g:1354:2: iv_ruleMulOpCallExp= ruleMulOpCallExp EOF
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
    // InternalOcl.g:1360:1: ruleMulOpCallExp returns [EObject current=null] : ( ( (lv_args_0_0= ruleNotOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) ) )* ) ;
    public final EObject ruleMulOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_args_0_0 = null;

        AntlrDatatypeRuleToken lv_operationNames_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1366:2: ( ( ( (lv_args_0_0= ruleNotOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) ) )* ) )
            // InternalOcl.g:1367:2: ( ( (lv_args_0_0= ruleNotOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) ) )* )
            {
            // InternalOcl.g:1367:2: ( ( (lv_args_0_0= ruleNotOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) ) )* )
            // InternalOcl.g:1368:3: ( (lv_args_0_0= ruleNotOpCallExp ) ) ( ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) ) )*
            {
            // InternalOcl.g:1368:3: ( (lv_args_0_0= ruleNotOpCallExp ) )
            // InternalOcl.g:1369:4: (lv_args_0_0= ruleNotOpCallExp )
            {
            // InternalOcl.g:1369:4: (lv_args_0_0= ruleNotOpCallExp )
            // InternalOcl.g:1370:5: lv_args_0_0= ruleNotOpCallExp
            {

            					newCompositeNode(grammarAccess.getMulOpCallExpAccess().getArgsNotOpCallExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalOcl.g:1387:3: ( ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=36 && LA20_0<=37)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOcl.g:1388:4: ( (lv_operationNames_1_0= ruleMULOP ) ) ( (lv_args_2_0= ruleNotOpCallExp ) )
            	    {
            	    // InternalOcl.g:1388:4: ( (lv_operationNames_1_0= ruleMULOP ) )
            	    // InternalOcl.g:1389:5: (lv_operationNames_1_0= ruleMULOP )
            	    {
            	    // InternalOcl.g:1389:5: (lv_operationNames_1_0= ruleMULOP )
            	    // InternalOcl.g:1390:6: lv_operationNames_1_0= ruleMULOP
            	    {

            	    						newCompositeNode(grammarAccess.getMulOpCallExpAccess().getOperationNamesMULOPParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_20);
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

            	    // InternalOcl.g:1407:4: ( (lv_args_2_0= ruleNotOpCallExp ) )
            	    // InternalOcl.g:1408:5: (lv_args_2_0= ruleNotOpCallExp )
            	    {
            	    // InternalOcl.g:1408:5: (lv_args_2_0= ruleNotOpCallExp )
            	    // InternalOcl.g:1409:6: lv_args_2_0= ruleNotOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getMulOpCallExpAccess().getArgsNotOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
    // InternalOcl.g:1431:1: entryRuleMULOP returns [String current=null] : iv_ruleMULOP= ruleMULOP EOF ;
    public final String entryRuleMULOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULOP = null;


        try {
            // InternalOcl.g:1431:45: (iv_ruleMULOP= ruleMULOP EOF )
            // InternalOcl.g:1432:2: iv_ruleMULOP= ruleMULOP EOF
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
    // InternalOcl.g:1438:1: ruleMULOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleMULOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1444:2: ( (kw= '*' | kw= '/' ) )
            // InternalOcl.g:1445:2: (kw= '*' | kw= '/' )
            {
            // InternalOcl.g:1445:2: (kw= '*' | kw= '/' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            else if ( (LA21_0==37) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalOcl.g:1446:3: kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMULOPAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1452:3: kw= '/'
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
    // InternalOcl.g:1461:1: entryRuleNotOpCallExp returns [EObject current=null] : iv_ruleNotOpCallExp= ruleNotOpCallExp EOF ;
    public final EObject entryRuleNotOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOpCallExp = null;


        try {
            // InternalOcl.g:1461:53: (iv_ruleNotOpCallExp= ruleNotOpCallExp EOF )
            // InternalOcl.g:1462:2: iv_ruleNotOpCallExp= ruleNotOpCallExp EOF
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
    // InternalOcl.g:1468:1: ruleNotOpCallExp returns [EObject current=null] : ( ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp ) ;
    public final EObject ruleNotOpCallExp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operationName_0_0 = null;

        EObject lv_source_1_0 = null;

        EObject this_PropertyCallExp_2 = null;



        	enterRule();

        try {
            // InternalOcl.g:1474:2: ( ( ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp ) )
            // InternalOcl.g:1475:2: ( ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp )
            {
            // InternalOcl.g:1475:2: ( ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32||LA22_0==38) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_INT)||LA22_0==19||(LA22_0>=39 && LA22_0<=41)||(LA22_0>=44 && LA22_0<=48)||LA22_0==52||(LA22_0>=56 && LA22_0<=57)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalOcl.g:1476:3: ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) )
                    {
                    // InternalOcl.g:1476:3: ( ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) )
                    // InternalOcl.g:1477:4: ( (lv_operationName_0_0= ruleUNARYOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) )
                    {
                    // InternalOcl.g:1477:4: ( (lv_operationName_0_0= ruleUNARYOP ) )
                    // InternalOcl.g:1478:5: (lv_operationName_0_0= ruleUNARYOP )
                    {
                    // InternalOcl.g:1478:5: (lv_operationName_0_0= ruleUNARYOP )
                    // InternalOcl.g:1479:6: lv_operationName_0_0= ruleUNARYOP
                    {

                    						newCompositeNode(grammarAccess.getNotOpCallExpAccess().getOperationNameUNARYOPParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    // InternalOcl.g:1496:4: ( (lv_source_1_0= ruleNotOpCallExp ) )
                    // InternalOcl.g:1497:5: (lv_source_1_0= ruleNotOpCallExp )
                    {
                    // InternalOcl.g:1497:5: (lv_source_1_0= ruleNotOpCallExp )
                    // InternalOcl.g:1498:6: lv_source_1_0= ruleNotOpCallExp
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
                    // InternalOcl.g:1517:3: this_PropertyCallExp_2= rulePropertyCallExp
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
    // InternalOcl.g:1529:1: entryRuleUNARYOP returns [String current=null] : iv_ruleUNARYOP= ruleUNARYOP EOF ;
    public final String entryRuleUNARYOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNARYOP = null;


        try {
            // InternalOcl.g:1529:47: (iv_ruleUNARYOP= ruleUNARYOP EOF )
            // InternalOcl.g:1530:2: iv_ruleUNARYOP= ruleUNARYOP EOF
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
    // InternalOcl.g:1536:1: ruleUNARYOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'not' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUNARYOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:1542:2: ( (kw= 'not' | kw= '-' ) )
            // InternalOcl.g:1543:2: (kw= 'not' | kw= '-' )
            {
            // InternalOcl.g:1543:2: (kw= 'not' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            else if ( (LA23_0==32) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalOcl.g:1544:3: kw= 'not'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUNARYOPAccess().getNotKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:1550:3: kw= '-'
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
    // InternalOcl.g:1559:1: entryRulePropertyCallExp returns [EObject current=null] : iv_rulePropertyCallExp= rulePropertyCallExp EOF ;
    public final EObject entryRulePropertyCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCallExp = null;


        try {
            // InternalOcl.g:1559:56: (iv_rulePropertyCallExp= rulePropertyCallExp EOF )
            // InternalOcl.g:1560:2: iv_rulePropertyCallExp= rulePropertyCallExp EOF
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
    // InternalOcl.g:1566:1: rulePropertyCallExp returns [EObject current=null] : ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* ) ;
    public final EObject rulePropertyCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_calls_1_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:1572:2: ( ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* ) )
            // InternalOcl.g:1573:2: ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* )
            {
            // InternalOcl.g:1573:2: ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* )
            // InternalOcl.g:1574:3: ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )*
            {
            // InternalOcl.g:1574:3: ( (lv_source_0_0= rulePrimary_OclExpression ) )
            // InternalOcl.g:1575:4: (lv_source_0_0= rulePrimary_OclExpression )
            {
            // InternalOcl.g:1575:4: (lv_source_0_0= rulePrimary_OclExpression )
            // InternalOcl.g:1576:5: lv_source_0_0= rulePrimary_OclExpression
            {

            					newCompositeNode(grammarAccess.getPropertyCallExpAccess().getSourcePrimary_OclExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalOcl.g:1593:3: ( (lv_calls_1_0= rulePropertyCall ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=58 && LA24_0<=59)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOcl.g:1594:4: (lv_calls_1_0= rulePropertyCall )
            	    {
            	    // InternalOcl.g:1594:4: (lv_calls_1_0= rulePropertyCall )
            	    // InternalOcl.g:1595:5: lv_calls_1_0= rulePropertyCall
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyCallExpAccess().getCallsPropertyCallParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
    // InternalOcl.g:1616:1: entryRulePrimary_OclExpression returns [EObject current=null] : iv_rulePrimary_OclExpression= rulePrimary_OclExpression EOF ;
    public final EObject entryRulePrimary_OclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary_OclExpression = null;


        try {
            // InternalOcl.g:1616:62: (iv_rulePrimary_OclExpression= rulePrimary_OclExpression EOF )
            // InternalOcl.g:1617:2: iv_rulePrimary_OclExpression= rulePrimary_OclExpression EOF
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
    // InternalOcl.g:1623:1: rulePrimary_OclExpression returns [EObject current=null] : (this_VariableExp_0= ruleVariableExp | this_SelfLiteralExp_1= ruleSelfLiteralExp | this_StringLiteralExp_2= ruleStringLiteralExp | this_BooleanLiteralExp_3= ruleBooleanLiteralExp | this_NumericLiteralExp_4= ruleNumericLiteralExp | this_NullLiteralExp_5= ruleNullLiteralExp | this_BagLiteralExp_6= ruleBagLiteralExp | this_OrderedSetLiteralExp_7= ruleOrderedSetLiteralExp | this_SequenceLiteralExp_8= ruleSequenceLiteralExp | this_SetLiteralExp_9= ruleSetLiteralExp | this_TupleLiteralExp_10= ruleTupleLiteralExp | this_MapLiteralExp_11= ruleMapLiteralExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_IfExp_13= ruleIfExp | this_BraceExp_14= ruleBraceExp | this_OclModelElementExp_15= ruleOclModelElementExp | this_ContextlessCallExp_16= ruleContextlessCallExp ) ;
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
            // InternalOcl.g:1629:2: ( (this_VariableExp_0= ruleVariableExp | this_SelfLiteralExp_1= ruleSelfLiteralExp | this_StringLiteralExp_2= ruleStringLiteralExp | this_BooleanLiteralExp_3= ruleBooleanLiteralExp | this_NumericLiteralExp_4= ruleNumericLiteralExp | this_NullLiteralExp_5= ruleNullLiteralExp | this_BagLiteralExp_6= ruleBagLiteralExp | this_OrderedSetLiteralExp_7= ruleOrderedSetLiteralExp | this_SequenceLiteralExp_8= ruleSequenceLiteralExp | this_SetLiteralExp_9= ruleSetLiteralExp | this_TupleLiteralExp_10= ruleTupleLiteralExp | this_MapLiteralExp_11= ruleMapLiteralExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_IfExp_13= ruleIfExp | this_BraceExp_14= ruleBraceExp | this_OclModelElementExp_15= ruleOclModelElementExp | this_ContextlessCallExp_16= ruleContextlessCallExp ) )
            // InternalOcl.g:1630:2: (this_VariableExp_0= ruleVariableExp | this_SelfLiteralExp_1= ruleSelfLiteralExp | this_StringLiteralExp_2= ruleStringLiteralExp | this_BooleanLiteralExp_3= ruleBooleanLiteralExp | this_NumericLiteralExp_4= ruleNumericLiteralExp | this_NullLiteralExp_5= ruleNullLiteralExp | this_BagLiteralExp_6= ruleBagLiteralExp | this_OrderedSetLiteralExp_7= ruleOrderedSetLiteralExp | this_SequenceLiteralExp_8= ruleSequenceLiteralExp | this_SetLiteralExp_9= ruleSetLiteralExp | this_TupleLiteralExp_10= ruleTupleLiteralExp | this_MapLiteralExp_11= ruleMapLiteralExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_IfExp_13= ruleIfExp | this_BraceExp_14= ruleBraceExp | this_OclModelElementExp_15= ruleOclModelElementExp | this_ContextlessCallExp_16= ruleContextlessCallExp )
            {
            // InternalOcl.g:1630:2: (this_VariableExp_0= ruleVariableExp | this_SelfLiteralExp_1= ruleSelfLiteralExp | this_StringLiteralExp_2= ruleStringLiteralExp | this_BooleanLiteralExp_3= ruleBooleanLiteralExp | this_NumericLiteralExp_4= ruleNumericLiteralExp | this_NullLiteralExp_5= ruleNullLiteralExp | this_BagLiteralExp_6= ruleBagLiteralExp | this_OrderedSetLiteralExp_7= ruleOrderedSetLiteralExp | this_SequenceLiteralExp_8= ruleSequenceLiteralExp | this_SetLiteralExp_9= ruleSetLiteralExp | this_TupleLiteralExp_10= ruleTupleLiteralExp | this_MapLiteralExp_11= ruleMapLiteralExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_IfExp_13= ruleIfExp | this_BraceExp_14= ruleBraceExp | this_OclModelElementExp_15= ruleOclModelElementExp | this_ContextlessCallExp_16= ruleContextlessCallExp )
            int alt25=17;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalOcl.g:1631:3: this_VariableExp_0= ruleVariableExp
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
                    // InternalOcl.g:1640:3: this_SelfLiteralExp_1= ruleSelfLiteralExp
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
                    // InternalOcl.g:1649:3: this_StringLiteralExp_2= ruleStringLiteralExp
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
                    // InternalOcl.g:1658:3: this_BooleanLiteralExp_3= ruleBooleanLiteralExp
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
                    // InternalOcl.g:1667:3: this_NumericLiteralExp_4= ruleNumericLiteralExp
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
                    // InternalOcl.g:1676:3: this_NullLiteralExp_5= ruleNullLiteralExp
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
                    // InternalOcl.g:1685:3: this_BagLiteralExp_6= ruleBagLiteralExp
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
                    // InternalOcl.g:1694:3: this_OrderedSetLiteralExp_7= ruleOrderedSetLiteralExp
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
                    // InternalOcl.g:1703:3: this_SequenceLiteralExp_8= ruleSequenceLiteralExp
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
                    // InternalOcl.g:1712:3: this_SetLiteralExp_9= ruleSetLiteralExp
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
                    // InternalOcl.g:1721:3: this_TupleLiteralExp_10= ruleTupleLiteralExp
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
                    // InternalOcl.g:1730:3: this_MapLiteralExp_11= ruleMapLiteralExp
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
                    // InternalOcl.g:1739:3: this_EnumLiteralExp_12= ruleEnumLiteralExp
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
                    // InternalOcl.g:1748:3: this_IfExp_13= ruleIfExp
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
                    // InternalOcl.g:1757:3: this_BraceExp_14= ruleBraceExp
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
                    // InternalOcl.g:1766:3: this_OclModelElementExp_15= ruleOclModelElementExp
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
                    // InternalOcl.g:1775:3: this_ContextlessCallExp_16= ruleContextlessCallExp
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
    // InternalOcl.g:1787:1: entryRuleVariableExp returns [EObject current=null] : iv_ruleVariableExp= ruleVariableExp EOF ;
    public final EObject entryRuleVariableExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExp = null;


        try {
            // InternalOcl.g:1787:52: (iv_ruleVariableExp= ruleVariableExp EOF )
            // InternalOcl.g:1788:2: iv_ruleVariableExp= ruleVariableExp EOF
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
    // InternalOcl.g:1794:1: ruleVariableExp returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalOcl.g:1800:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalOcl.g:1801:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalOcl.g:1801:2: ( (otherlv_0= RULE_ID ) )
            // InternalOcl.g:1802:3: (otherlv_0= RULE_ID )
            {
            // InternalOcl.g:1802:3: (otherlv_0= RULE_ID )
            // InternalOcl.g:1803:4: otherlv_0= RULE_ID
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
    // InternalOcl.g:1817:1: entryRuleSelfLiteralExp returns [EObject current=null] : iv_ruleSelfLiteralExp= ruleSelfLiteralExp EOF ;
    public final EObject entryRuleSelfLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfLiteralExp = null;


        try {
            // InternalOcl.g:1817:55: (iv_ruleSelfLiteralExp= ruleSelfLiteralExp EOF )
            // InternalOcl.g:1818:2: iv_ruleSelfLiteralExp= ruleSelfLiteralExp EOF
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
    // InternalOcl.g:1824:1: ruleSelfLiteralExp returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:1830:2: ( ( () otherlv_1= 'self' ) )
            // InternalOcl.g:1831:2: ( () otherlv_1= 'self' )
            {
            // InternalOcl.g:1831:2: ( () otherlv_1= 'self' )
            // InternalOcl.g:1832:3: () otherlv_1= 'self'
            {
            // InternalOcl.g:1832:3: ()
            // InternalOcl.g:1833:4: 
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
    // InternalOcl.g:1847:1: entryRuleNullLiteralExp returns [EObject current=null] : iv_ruleNullLiteralExp= ruleNullLiteralExp EOF ;
    public final EObject entryRuleNullLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExp = null;


        try {
            // InternalOcl.g:1847:55: (iv_ruleNullLiteralExp= ruleNullLiteralExp EOF )
            // InternalOcl.g:1848:2: iv_ruleNullLiteralExp= ruleNullLiteralExp EOF
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
    // InternalOcl.g:1854:1: ruleNullLiteralExp returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:1860:2: ( ( () otherlv_1= 'null' ) )
            // InternalOcl.g:1861:2: ( () otherlv_1= 'null' )
            {
            // InternalOcl.g:1861:2: ( () otherlv_1= 'null' )
            // InternalOcl.g:1862:3: () otherlv_1= 'null'
            {
            // InternalOcl.g:1862:3: ()
            // InternalOcl.g:1863:4: 
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
    // InternalOcl.g:1877:1: entryRuleStringLiteralExp returns [EObject current=null] : iv_ruleStringLiteralExp= ruleStringLiteralExp EOF ;
    public final EObject entryRuleStringLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExp = null;


        try {
            // InternalOcl.g:1877:57: (iv_ruleStringLiteralExp= ruleStringLiteralExp EOF )
            // InternalOcl.g:1878:2: iv_ruleStringLiteralExp= ruleStringLiteralExp EOF
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
    // InternalOcl.g:1884:1: ruleStringLiteralExp returns [EObject current=null] : ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteralExp() throws RecognitionException {
        EObject current = null;

        Token lv_stringSymbol_1_0=null;


        	enterRule();

        try {
            // InternalOcl.g:1890:2: ( ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) ) )
            // InternalOcl.g:1891:2: ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) )
            {
            // InternalOcl.g:1891:2: ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) )
            // InternalOcl.g:1892:3: () ( (lv_stringSymbol_1_0= RULE_STRING ) )
            {
            // InternalOcl.g:1892:3: ()
            // InternalOcl.g:1893:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringLiteralExpAccess().getStringLiteralExpAction_0(),
            					current);
            			

            }

            // InternalOcl.g:1899:3: ( (lv_stringSymbol_1_0= RULE_STRING ) )
            // InternalOcl.g:1900:4: (lv_stringSymbol_1_0= RULE_STRING )
            {
            // InternalOcl.g:1900:4: (lv_stringSymbol_1_0= RULE_STRING )
            // InternalOcl.g:1901:5: lv_stringSymbol_1_0= RULE_STRING
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
    // InternalOcl.g:1921:1: entryRuleNumericLiteralExp returns [EObject current=null] : iv_ruleNumericLiteralExp= ruleNumericLiteralExp EOF ;
    public final EObject entryRuleNumericLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteralExp = null;


        try {
            // InternalOcl.g:1921:58: (iv_ruleNumericLiteralExp= ruleNumericLiteralExp EOF )
            // InternalOcl.g:1922:2: iv_ruleNumericLiteralExp= ruleNumericLiteralExp EOF
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
    // InternalOcl.g:1928:1: ruleNumericLiteralExp returns [EObject current=null] : (this_RealLiteralExp_0= ruleRealLiteralExp | this_IntegerLiteralExp_1= ruleIntegerLiteralExp ) ;
    public final EObject ruleNumericLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject this_RealLiteralExp_0 = null;

        EObject this_IntegerLiteralExp_1 = null;



        	enterRule();

        try {
            // InternalOcl.g:1934:2: ( (this_RealLiteralExp_0= ruleRealLiteralExp | this_IntegerLiteralExp_1= ruleIntegerLiteralExp ) )
            // InternalOcl.g:1935:2: (this_RealLiteralExp_0= ruleRealLiteralExp | this_IntegerLiteralExp_1= ruleIntegerLiteralExp )
            {
            // InternalOcl.g:1935:2: (this_RealLiteralExp_0= ruleRealLiteralExp | this_IntegerLiteralExp_1= ruleIntegerLiteralExp )
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
                    // InternalOcl.g:1936:3: this_RealLiteralExp_0= ruleRealLiteralExp
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
                    // InternalOcl.g:1945:3: this_IntegerLiteralExp_1= ruleIntegerLiteralExp
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
    // InternalOcl.g:1957:1: entryRuleRealLiteralExp returns [EObject current=null] : iv_ruleRealLiteralExp= ruleRealLiteralExp EOF ;
    public final EObject entryRuleRealLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExp = null;


        try {
            // InternalOcl.g:1957:55: (iv_ruleRealLiteralExp= ruleRealLiteralExp EOF )
            // InternalOcl.g:1958:2: iv_ruleRealLiteralExp= ruleRealLiteralExp EOF
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
    // InternalOcl.g:1964:1: ruleRealLiteralExp returns [EObject current=null] : ( (lv_realSymbol_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleRealLiteralExp() throws RecognitionException {
        EObject current = null;

        Token lv_realSymbol_0_0=null;


        	enterRule();

        try {
            // InternalOcl.g:1970:2: ( ( (lv_realSymbol_0_0= RULE_DOUBLE ) ) )
            // InternalOcl.g:1971:2: ( (lv_realSymbol_0_0= RULE_DOUBLE ) )
            {
            // InternalOcl.g:1971:2: ( (lv_realSymbol_0_0= RULE_DOUBLE ) )
            // InternalOcl.g:1972:3: (lv_realSymbol_0_0= RULE_DOUBLE )
            {
            // InternalOcl.g:1972:3: (lv_realSymbol_0_0= RULE_DOUBLE )
            // InternalOcl.g:1973:4: lv_realSymbol_0_0= RULE_DOUBLE
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
    // InternalOcl.g:1992:1: entryRuleIntegerLiteralExp returns [EObject current=null] : iv_ruleIntegerLiteralExp= ruleIntegerLiteralExp EOF ;
    public final EObject entryRuleIntegerLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteralExp = null;


        try {
            // InternalOcl.g:1992:58: (iv_ruleIntegerLiteralExp= ruleIntegerLiteralExp EOF )
            // InternalOcl.g:1993:2: iv_ruleIntegerLiteralExp= ruleIntegerLiteralExp EOF
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
    // InternalOcl.g:1999:1: ruleIntegerLiteralExp returns [EObject current=null] : ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerLiteralExp() throws RecognitionException {
        EObject current = null;

        Token lv_integerSymbol_1_0=null;


        	enterRule();

        try {
            // InternalOcl.g:2005:2: ( ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) ) )
            // InternalOcl.g:2006:2: ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) )
            {
            // InternalOcl.g:2006:2: ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) )
            // InternalOcl.g:2007:3: () ( (lv_integerSymbol_1_0= RULE_INT ) )
            {
            // InternalOcl.g:2007:3: ()
            // InternalOcl.g:2008:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerLiteralExpAccess().getIntegerLiteralExpAction_0(),
            					current);
            			

            }

            // InternalOcl.g:2014:3: ( (lv_integerSymbol_1_0= RULE_INT ) )
            // InternalOcl.g:2015:4: (lv_integerSymbol_1_0= RULE_INT )
            {
            // InternalOcl.g:2015:4: (lv_integerSymbol_1_0= RULE_INT )
            // InternalOcl.g:2016:5: lv_integerSymbol_1_0= RULE_INT
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
    // InternalOcl.g:2036:1: entryRuleBagLiteralExp returns [EObject current=null] : iv_ruleBagLiteralExp= ruleBagLiteralExp EOF ;
    public final EObject entryRuleBagLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagLiteralExp = null;


        try {
            // InternalOcl.g:2036:54: (iv_ruleBagLiteralExp= ruleBagLiteralExp EOF )
            // InternalOcl.g:2037:2: iv_ruleBagLiteralExp= ruleBagLiteralExp EOF
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
    // InternalOcl.g:2043:1: ruleBagLiteralExp returns [EObject current=null] : ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalOcl.g:2049:2: ( ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2050:2: ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2050:2: ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2051:3: () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2051:3: ()
            // InternalOcl.g:2052:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBagLiteralExpAccess().getBagLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getBagLiteralExpAccess().getBagKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getBagLiteralExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2066:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_INT)||LA28_0==19||LA28_0==32||(LA28_0>=38 && LA28_0<=41)||(LA28_0>=44 && LA28_0<=48)||LA28_0==50||LA28_0==52||(LA28_0>=56 && LA28_0<=57)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOcl.g:2067:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:2067:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalOcl.g:2068:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:2068:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalOcl.g:2069:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getBagLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    // InternalOcl.g:2086:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==20) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalOcl.g:2087:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getBagLiteralExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2091:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:2092:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:2092:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalOcl.g:2093:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getBagLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop27;
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
    // InternalOcl.g:2120:1: entryRuleOrderedSetLiteralExp returns [EObject current=null] : iv_ruleOrderedSetLiteralExp= ruleOrderedSetLiteralExp EOF ;
    public final EObject entryRuleOrderedSetLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedSetLiteralExp = null;


        try {
            // InternalOcl.g:2120:61: (iv_ruleOrderedSetLiteralExp= ruleOrderedSetLiteralExp EOF )
            // InternalOcl.g:2121:2: iv_ruleOrderedSetLiteralExp= ruleOrderedSetLiteralExp EOF
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
    // InternalOcl.g:2127:1: ruleOrderedSetLiteralExp returns [EObject current=null] : ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalOcl.g:2133:2: ( ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2134:2: ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2134:2: ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2135:3: () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2135:3: ()
            // InternalOcl.g:2136:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrderedSetLiteralExpAccess().getOrderedSetLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderedSetLiteralExpAccess().getOrderedSetKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getOrderedSetLiteralExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2150:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_INT)||LA30_0==19||LA30_0==32||(LA30_0>=38 && LA30_0<=41)||(LA30_0>=44 && LA30_0<=48)||LA30_0==50||LA30_0==52||(LA30_0>=56 && LA30_0<=57)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOcl.g:2151:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:2151:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalOcl.g:2152:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:2152:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalOcl.g:2153:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getOrderedSetLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    // InternalOcl.g:2170:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==20) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalOcl.g:2171:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOrderedSetLiteralExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2175:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:2176:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:2176:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalOcl.g:2177:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getOrderedSetLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop29;
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
    // InternalOcl.g:2204:1: entryRuleSequenceLiteralExp returns [EObject current=null] : iv_ruleSequenceLiteralExp= ruleSequenceLiteralExp EOF ;
    public final EObject entryRuleSequenceLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceLiteralExp = null;


        try {
            // InternalOcl.g:2204:59: (iv_ruleSequenceLiteralExp= ruleSequenceLiteralExp EOF )
            // InternalOcl.g:2205:2: iv_ruleSequenceLiteralExp= ruleSequenceLiteralExp EOF
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
    // InternalOcl.g:2211:1: ruleSequenceLiteralExp returns [EObject current=null] : ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalOcl.g:2217:2: ( ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2218:2: ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2218:2: ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2219:3: () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2219:3: ()
            // InternalOcl.g:2220:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceLiteralExpAccess().getSequenceLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceLiteralExpAccess().getSequenceKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceLiteralExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2234:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_INT)||LA32_0==19||LA32_0==32||(LA32_0>=38 && LA32_0<=41)||(LA32_0>=44 && LA32_0<=48)||LA32_0==50||LA32_0==52||(LA32_0>=56 && LA32_0<=57)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOcl.g:2235:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:2235:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalOcl.g:2236:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:2236:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalOcl.g:2237:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    // InternalOcl.g:2254:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==20) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalOcl.g:2255:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSequenceLiteralExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2259:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:2260:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:2260:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalOcl.g:2261:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop31;
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
    // InternalOcl.g:2288:1: entryRuleSetLiteralExp returns [EObject current=null] : iv_ruleSetLiteralExp= ruleSetLiteralExp EOF ;
    public final EObject entryRuleSetLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteralExp = null;


        try {
            // InternalOcl.g:2288:54: (iv_ruleSetLiteralExp= ruleSetLiteralExp EOF )
            // InternalOcl.g:2289:2: iv_ruleSetLiteralExp= ruleSetLiteralExp EOF
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
    // InternalOcl.g:2295:1: ruleSetLiteralExp returns [EObject current=null] : ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalOcl.g:2301:2: ( ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2302:2: ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2302:2: ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2303:3: () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2303:3: ()
            // InternalOcl.g:2304:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetLiteralExpAccess().getSetLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getSetLiteralExpAccess().getSetKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getSetLiteralExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2318:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_INT)||LA34_0==19||LA34_0==32||(LA34_0>=38 && LA34_0<=41)||(LA34_0>=44 && LA34_0<=48)||LA34_0==50||LA34_0==52||(LA34_0>=56 && LA34_0<=57)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOcl.g:2319:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:2319:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalOcl.g:2320:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:2320:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalOcl.g:2321:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getSetLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    // InternalOcl.g:2338:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==20) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalOcl.g:2339:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSetLiteralExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2343:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:2344:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:2344:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalOcl.g:2345:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSetLiteralExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop33;
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
    // InternalOcl.g:2372:1: entryRuleTupleLiteralExp returns [EObject current=null] : iv_ruleTupleLiteralExp= ruleTupleLiteralExp EOF ;
    public final EObject entryRuleTupleLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExp = null;


        try {
            // InternalOcl.g:2372:56: (iv_ruleTupleLiteralExp= ruleTupleLiteralExp EOF )
            // InternalOcl.g:2373:2: iv_ruleTupleLiteralExp= ruleTupleLiteralExp EOF
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
    // InternalOcl.g:2379:1: ruleTupleLiteralExp returns [EObject current=null] : ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalOcl.g:2385:2: ( ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2386:2: ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2386:2: ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2387:3: () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2387:3: ()
            // InternalOcl.g:2388:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTupleLiteralExpAccess().getTupleLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpAccess().getTupleKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getTupleLiteralExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2402:3: ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOcl.g:2403:4: ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )*
                    {
                    // InternalOcl.g:2403:4: ( (lv_tuplePart_3_0= ruleTuplePart ) )
                    // InternalOcl.g:2404:5: (lv_tuplePart_3_0= ruleTuplePart )
                    {
                    // InternalOcl.g:2404:5: (lv_tuplePart_3_0= ruleTuplePart )
                    // InternalOcl.g:2405:6: lv_tuplePart_3_0= ruleTuplePart
                    {

                    						newCompositeNode(grammarAccess.getTupleLiteralExpAccess().getTuplePartTuplePartParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    // InternalOcl.g:2422:4: (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==20) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalOcl.g:2423:5: otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTupleLiteralExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2427:5: ( (lv_tuplePart_5_0= ruleTuplePart ) )
                    	    // InternalOcl.g:2428:6: (lv_tuplePart_5_0= ruleTuplePart )
                    	    {
                    	    // InternalOcl.g:2428:6: (lv_tuplePart_5_0= ruleTuplePart )
                    	    // InternalOcl.g:2429:7: lv_tuplePart_5_0= ruleTuplePart
                    	    {

                    	    							newCompositeNode(grammarAccess.getTupleLiteralExpAccess().getTuplePartTuplePartParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop35;
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
    // InternalOcl.g:2456:1: entryRuleTuplePart returns [EObject current=null] : iv_ruleTuplePart= ruleTuplePart EOF ;
    public final EObject entryRuleTuplePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePart = null;


        try {
            // InternalOcl.g:2456:50: (iv_ruleTuplePart= ruleTuplePart EOF )
            // InternalOcl.g:2457:2: iv_ruleTuplePart= ruleTuplePart EOF
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
    // InternalOcl.g:2463:1: ruleTuplePart returns [EObject current=null] : ( ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) ;
    public final EObject ruleTuplePart() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2469:2: ( ( ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:2470:2: ( ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:2470:2: ( ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            // InternalOcl.g:2471:3: ( (lv_varName_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) )
            {
            // InternalOcl.g:2471:3: ( (lv_varName_0_0= RULE_ID ) )
            // InternalOcl.g:2472:4: (lv_varName_0_0= RULE_ID )
            {
            // InternalOcl.g:2472:4: (lv_varName_0_0= RULE_ID )
            // InternalOcl.g:2473:5: lv_varName_0_0= RULE_ID
            {
            lv_varName_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            // InternalOcl.g:2489:3: (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==17) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOcl.g:2490:4: otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getTuplePartAccess().getColonKeyword_1_0());
                    			
                    // InternalOcl.g:2494:4: ( (lv_type_2_0= ruleOclTypeLiteral ) )
                    // InternalOcl.g:2495:5: (lv_type_2_0= ruleOclTypeLiteral )
                    {
                    // InternalOcl.g:2495:5: (lv_type_2_0= ruleOclTypeLiteral )
                    // InternalOcl.g:2496:6: lv_type_2_0= ruleOclTypeLiteral
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
            		
            // InternalOcl.g:2518:3: ( (lv_initExpression_4_0= ruleOclExpression ) )
            // InternalOcl.g:2519:4: (lv_initExpression_4_0= ruleOclExpression )
            {
            // InternalOcl.g:2519:4: (lv_initExpression_4_0= ruleOclExpression )
            // InternalOcl.g:2520:5: lv_initExpression_4_0= ruleOclExpression
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
    // InternalOcl.g:2541:1: entryRuleMapLiteralExp returns [EObject current=null] : iv_ruleMapLiteralExp= ruleMapLiteralExp EOF ;
    public final EObject entryRuleMapLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExp = null;


        try {
            // InternalOcl.g:2541:54: (iv_ruleMapLiteralExp= ruleMapLiteralExp EOF )
            // InternalOcl.g:2542:2: iv_ruleMapLiteralExp= ruleMapLiteralExp EOF
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
    // InternalOcl.g:2548:1: ruleMapLiteralExp returns [EObject current=null] : ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalOcl.g:2554:2: ( ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' ) )
            // InternalOcl.g:2555:2: ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' )
            {
            // InternalOcl.g:2555:2: ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' )
            // InternalOcl.g:2556:3: () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}'
            {
            // InternalOcl.g:2556:3: ()
            // InternalOcl.g:2557:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapLiteralExpAccess().getMapLiteralExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpAccess().getMapKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getMapLiteralExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOcl.g:2571:3: ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==19) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOcl.g:2572:4: ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )*
                    {
                    // InternalOcl.g:2572:4: ( (lv_elements_3_0= ruleMapElement ) )
                    // InternalOcl.g:2573:5: (lv_elements_3_0= ruleMapElement )
                    {
                    // InternalOcl.g:2573:5: (lv_elements_3_0= ruleMapElement )
                    // InternalOcl.g:2574:6: lv_elements_3_0= ruleMapElement
                    {

                    						newCompositeNode(grammarAccess.getMapLiteralExpAccess().getElementsMapElementParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    // InternalOcl.g:2591:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==20) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalOcl.g:2592:5: otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_16); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMapLiteralExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:2596:5: ( (lv_elements_5_0= ruleMapElement ) )
                    	    // InternalOcl.g:2597:6: (lv_elements_5_0= ruleMapElement )
                    	    {
                    	    // InternalOcl.g:2597:6: (lv_elements_5_0= ruleMapElement )
                    	    // InternalOcl.g:2598:7: lv_elements_5_0= ruleMapElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMapLiteralExpAccess().getElementsMapElementParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop38;
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
    // InternalOcl.g:2625:1: entryRuleMapElement returns [EObject current=null] : iv_ruleMapElement= ruleMapElement EOF ;
    public final EObject entryRuleMapElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapElement = null;


        try {
            // InternalOcl.g:2625:51: (iv_ruleMapElement= ruleMapElement EOF )
            // InternalOcl.g:2626:2: iv_ruleMapElement= ruleMapElement EOF
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
    // InternalOcl.g:2632:1: ruleMapElement returns [EObject current=null] : (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMapElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_key_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2638:2: ( (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' ) )
            // InternalOcl.g:2639:2: (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' )
            {
            // InternalOcl.g:2639:2: (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' )
            // InternalOcl.g:2640:3: otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMapElementAccess().getLeftParenthesisKeyword_0());
            		
            // InternalOcl.g:2644:3: ( (lv_key_1_0= ruleOclExpression ) )
            // InternalOcl.g:2645:4: (lv_key_1_0= ruleOclExpression )
            {
            // InternalOcl.g:2645:4: (lv_key_1_0= ruleOclExpression )
            // InternalOcl.g:2646:5: lv_key_1_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getMapElementAccess().getKeyOclExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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
            		
            // InternalOcl.g:2667:3: ( (lv_value_3_0= ruleOclExpression ) )
            // InternalOcl.g:2668:4: (lv_value_3_0= ruleOclExpression )
            {
            // InternalOcl.g:2668:4: (lv_value_3_0= ruleOclExpression )
            // InternalOcl.g:2669:5: lv_value_3_0= ruleOclExpression
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
    // InternalOcl.g:2694:1: entryRuleEnumLiteralExp returns [EObject current=null] : iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF ;
    public final EObject entryRuleEnumLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralExp = null;


        try {
            // InternalOcl.g:2694:55: (iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF )
            // InternalOcl.g:2695:2: iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF
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
    // InternalOcl.g:2701:1: ruleEnumLiteralExp returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) otherlv_3= '#' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalOcl.g:2707:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) otherlv_3= '#' ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalOcl.g:2708:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) otherlv_3= '#' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalOcl.g:2708:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) otherlv_3= '#' ( (lv_name_4_0= RULE_ID ) ) )
            // InternalOcl.g:2709:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) otherlv_3= '#' ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalOcl.g:2709:3: ( (otherlv_0= RULE_ID ) )
            // InternalOcl.g:2710:4: (otherlv_0= RULE_ID )
            {
            // InternalOcl.g:2710:4: (otherlv_0= RULE_ID )
            // InternalOcl.g:2711:5: otherlv_0= RULE_ID
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
            		
            // InternalOcl.g:2726:3: ( ( ruleQualifiedName ) )
            // InternalOcl.g:2727:4: ( ruleQualifiedName )
            {
            // InternalOcl.g:2727:4: ( ruleQualifiedName )
            // InternalOcl.g:2728:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumLiteralExpRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEnumLiteralExpAccess().getEnum_EEnumCrossReference_2_0());
            				
            pushFollow(FOLLOW_35);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumLiteralExpAccess().getNumberSignKeyword_3());
            		
            // InternalOcl.g:2746:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalOcl.g:2747:4: (lv_name_4_0= RULE_ID )
            {
            // InternalOcl.g:2747:4: (lv_name_4_0= RULE_ID )
            // InternalOcl.g:2748:5: lv_name_4_0= RULE_ID
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
    // InternalOcl.g:2768:1: entryRuleLetExp returns [EObject current=null] : iv_ruleLetExp= ruleLetExp EOF ;
    public final EObject entryRuleLetExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExp = null;


        try {
            // InternalOcl.g:2768:47: (iv_ruleLetExp= ruleLetExp EOF )
            // InternalOcl.g:2769:2: iv_ruleLetExp= ruleLetExp EOF
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
    // InternalOcl.g:2775:1: ruleLetExp returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) ) ;
    public final EObject ruleLetExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_in__3_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2781:2: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:2782:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:2782:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) )
            // InternalOcl.g:2783:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLetExpAccess().getLetKeyword_0());
            		
            // InternalOcl.g:2787:3: ( (lv_variable_1_0= ruleLocalVariable ) )
            // InternalOcl.g:2788:4: (lv_variable_1_0= ruleLocalVariable )
            {
            // InternalOcl.g:2788:4: (lv_variable_1_0= ruleLocalVariable )
            // InternalOcl.g:2789:5: lv_variable_1_0= ruleLocalVariable
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
            		
            // InternalOcl.g:2810:3: ( (lv_in__3_0= ruleOclExpression ) )
            // InternalOcl.g:2811:4: (lv_in__3_0= ruleOclExpression )
            {
            // InternalOcl.g:2811:4: (lv_in__3_0= ruleOclExpression )
            // InternalOcl.g:2812:5: lv_in__3_0= ruleOclExpression
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
    // InternalOcl.g:2833:1: entryRuleIfExp returns [EObject current=null] : iv_ruleIfExp= ruleIfExp EOF ;
    public final EObject entryRuleIfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExp = null;


        try {
            // InternalOcl.g:2833:46: (iv_ruleIfExp= ruleIfExp EOF )
            // InternalOcl.g:2834:2: iv_ruleIfExp= ruleIfExp EOF
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
    // InternalOcl.g:2840:1: ruleIfExp returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) ;
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
            // InternalOcl.g:2846:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) )
            // InternalOcl.g:2847:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            {
            // InternalOcl.g:2847:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            // InternalOcl.g:2848:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpAccess().getIfKeyword_0());
            		
            // InternalOcl.g:2852:3: ( (lv_condition_1_0= ruleOclExpression ) )
            // InternalOcl.g:2853:4: (lv_condition_1_0= ruleOclExpression )
            {
            // InternalOcl.g:2853:4: (lv_condition_1_0= ruleOclExpression )
            // InternalOcl.g:2854:5: lv_condition_1_0= ruleOclExpression
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
            		
            // InternalOcl.g:2875:3: ( (lv_thenExpression_3_0= ruleOclExpression ) )
            // InternalOcl.g:2876:4: (lv_thenExpression_3_0= ruleOclExpression )
            {
            // InternalOcl.g:2876:4: (lv_thenExpression_3_0= ruleOclExpression )
            // InternalOcl.g:2877:5: lv_thenExpression_3_0= ruleOclExpression
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
            		
            // InternalOcl.g:2898:3: ( (lv_elseExpression_5_0= ruleOclExpression ) )
            // InternalOcl.g:2899:4: (lv_elseExpression_5_0= ruleOclExpression )
            {
            // InternalOcl.g:2899:4: (lv_elseExpression_5_0= ruleOclExpression )
            // InternalOcl.g:2900:5: lv_elseExpression_5_0= ruleOclExpression
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
    // InternalOcl.g:2925:1: entryRuleBraceExp returns [EObject current=null] : iv_ruleBraceExp= ruleBraceExp EOF ;
    public final EObject entryRuleBraceExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBraceExp = null;


        try {
            // InternalOcl.g:2925:49: (iv_ruleBraceExp= ruleBraceExp EOF )
            // InternalOcl.g:2926:2: iv_ruleBraceExp= ruleBraceExp EOF
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
    // InternalOcl.g:2932:1: ruleBraceExp returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBraceExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:2938:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' ) )
            // InternalOcl.g:2939:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' )
            {
            // InternalOcl.g:2939:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' )
            // InternalOcl.g:2940:3: otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getBraceExpAccess().getLeftParenthesisKeyword_0());
            		
            // InternalOcl.g:2944:3: ( (lv_exp_1_0= ruleOclExpression ) )
            // InternalOcl.g:2945:4: (lv_exp_1_0= ruleOclExpression )
            {
            // InternalOcl.g:2945:4: (lv_exp_1_0= ruleOclExpression )
            // InternalOcl.g:2946:5: lv_exp_1_0= ruleOclExpression
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


    // $ANTLR start "entryRuleContextlessCallExp"
    // InternalOcl.g:2971:1: entryRuleContextlessCallExp returns [EObject current=null] : iv_ruleContextlessCallExp= ruleContextlessCallExp EOF ;
    public final EObject entryRuleContextlessCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextlessCallExp = null;


        try {
            // InternalOcl.g:2971:59: (iv_ruleContextlessCallExp= ruleContextlessCallExp EOF )
            // InternalOcl.g:2972:2: iv_ruleContextlessCallExp= ruleContextlessCallExp EOF
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
    // InternalOcl.g:2978:1: ruleContextlessCallExp returns [EObject current=null] : ( ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* )? otherlv_5= ')' ) ;
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
            // InternalOcl.g:2984:2: ( ( ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalOcl.g:2985:2: ( ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalOcl.g:2985:2: ( ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* )? otherlv_5= ')' )
            // InternalOcl.g:2986:3: ( (lv_operationName_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalOcl.g:2986:3: ( (lv_operationName_0_0= RULE_ID ) )
            // InternalOcl.g:2987:4: (lv_operationName_0_0= RULE_ID )
            {
            // InternalOcl.g:2987:4: (lv_operationName_0_0= RULE_ID )
            // InternalOcl.g:2988:5: lv_operationName_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,19,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getContextlessCallExpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:3008:3: ( ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_INT)||LA41_0==19||LA41_0==32||(LA41_0>=38 && LA41_0<=41)||(LA41_0>=44 && LA41_0<=48)||LA41_0==50||LA41_0==52||(LA41_0>=56 && LA41_0<=57)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOcl.g:3009:4: ( (lv_arguments_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:3009:4: ( (lv_arguments_2_0= ruleOclExpression ) )
                    // InternalOcl.g:3010:5: (lv_arguments_2_0= ruleOclExpression )
                    {
                    // InternalOcl.g:3010:5: (lv_arguments_2_0= ruleOclExpression )
                    // InternalOcl.g:3011:6: lv_arguments_2_0= ruleOclExpression
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

                    // InternalOcl.g:3028:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==20) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalOcl.g:3029:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getContextlessCallExpAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalOcl.g:3033:5: ( (lv_arguments_4_0= ruleOclExpression ) )
                    	    // InternalOcl.g:3034:6: (lv_arguments_4_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:3034:6: (lv_arguments_4_0= ruleOclExpression )
                    	    // InternalOcl.g:3035:7: lv_arguments_4_0= ruleOclExpression
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
                    	    break loop40;
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
    // InternalOcl.g:3062:1: entryRuleBooleanLiteralExp returns [EObject current=null] : iv_ruleBooleanLiteralExp= ruleBooleanLiteralExp EOF ;
    public final EObject entryRuleBooleanLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExp = null;


        try {
            // InternalOcl.g:3062:58: (iv_ruleBooleanLiteralExp= ruleBooleanLiteralExp EOF )
            // InternalOcl.g:3063:2: iv_ruleBooleanLiteralExp= ruleBooleanLiteralExp EOF
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
    // InternalOcl.g:3069:1: ruleBooleanLiteralExp returns [EObject current=null] : ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExp() throws RecognitionException {
        EObject current = null;

        Token lv_booleanSymbol_0_0=null;
        Token lv_booleanSymbol_1_0=null;


        	enterRule();

        try {
            // InternalOcl.g:3075:2: ( ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) ) )
            // InternalOcl.g:3076:2: ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) )
            {
            // InternalOcl.g:3076:2: ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==56) ) {
                alt42=1;
            }
            else if ( (LA42_0==57) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalOcl.g:3077:3: ( (lv_booleanSymbol_0_0= 'true' ) )
                    {
                    // InternalOcl.g:3077:3: ( (lv_booleanSymbol_0_0= 'true' ) )
                    // InternalOcl.g:3078:4: (lv_booleanSymbol_0_0= 'true' )
                    {
                    // InternalOcl.g:3078:4: (lv_booleanSymbol_0_0= 'true' )
                    // InternalOcl.g:3079:5: lv_booleanSymbol_0_0= 'true'
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
                    // InternalOcl.g:3092:3: ( (lv_booleanSymbol_1_0= 'false' ) )
                    {
                    // InternalOcl.g:3092:3: ( (lv_booleanSymbol_1_0= 'false' ) )
                    // InternalOcl.g:3093:4: (lv_booleanSymbol_1_0= 'false' )
                    {
                    // InternalOcl.g:3093:4: (lv_booleanSymbol_1_0= 'false' )
                    // InternalOcl.g:3094:5: lv_booleanSymbol_1_0= 'false'
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
    // InternalOcl.g:3110:1: entryRulePropertyCall returns [EObject current=null] : iv_rulePropertyCall= rulePropertyCall EOF ;
    public final EObject entryRulePropertyCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCall = null;


        try {
            // InternalOcl.g:3110:53: (iv_rulePropertyCall= rulePropertyCall EOF )
            // InternalOcl.g:3111:2: iv_rulePropertyCall= rulePropertyCall EOF
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
    // InternalOcl.g:3117:1: rulePropertyCall returns [EObject current=null] : (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp ) ;
    public final EObject rulePropertyCall() throws RecognitionException {
        EObject current = null;

        EObject this_OperationCall_0 = null;

        EObject this_NavigationOrAttributeCall_1 = null;

        EObject this_IterateExp_2 = null;

        EObject this_IteratorExp_3 = null;



        	enterRule();

        try {
            // InternalOcl.g:3123:2: ( (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp ) )
            // InternalOcl.g:3124:2: (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp )
            {
            // InternalOcl.g:3124:2: (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp )
            int alt43=4;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // InternalOcl.g:3125:3: this_OperationCall_0= ruleOperationCall
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
                    // InternalOcl.g:3134:3: this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall
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
                    // InternalOcl.g:3143:3: this_IterateExp_2= ruleIterateExp
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
                    // InternalOcl.g:3152:3: this_IteratorExp_3= ruleIteratorExp
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
    // InternalOcl.g:3164:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // InternalOcl.g:3164:54: (iv_ruleOperationCall= ruleOperationCall EOF )
            // InternalOcl.g:3165:2: iv_ruleOperationCall= ruleOperationCall EOF
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
    // InternalOcl.g:3171:1: ruleOperationCall returns [EObject current=null] : ( ( (lv_navOperator_0_0= ruleNavigationOp ) ) ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalOcl.g:3177:2: ( ( ( (lv_navOperator_0_0= ruleNavigationOp ) ) ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalOcl.g:3178:2: ( ( (lv_navOperator_0_0= ruleNavigationOp ) ) ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalOcl.g:3178:2: ( ( (lv_navOperator_0_0= ruleNavigationOp ) ) ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' )
            // InternalOcl.g:3179:3: ( (lv_navOperator_0_0= ruleNavigationOp ) ) ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')'
            {
            // InternalOcl.g:3179:3: ( (lv_navOperator_0_0= ruleNavigationOp ) )
            // InternalOcl.g:3180:4: (lv_navOperator_0_0= ruleNavigationOp )
            {
            // InternalOcl.g:3180:4: (lv_navOperator_0_0= ruleNavigationOp )
            // InternalOcl.g:3181:5: lv_navOperator_0_0= ruleNavigationOp
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

            // InternalOcl.g:3198:3: ( (lv_operationName_1_0= RULE_ID ) )
            // InternalOcl.g:3199:4: (lv_operationName_1_0= RULE_ID )
            {
            // InternalOcl.g:3199:4: (lv_operationName_1_0= RULE_ID )
            // InternalOcl.g:3200:5: lv_operationName_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,19,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOcl.g:3220:3: ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_INT)||LA45_0==19||LA45_0==32||(LA45_0>=38 && LA45_0<=41)||(LA45_0>=44 && LA45_0<=48)||LA45_0==50||LA45_0==52||(LA45_0>=56 && LA45_0<=57)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOcl.g:3221:4: ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalOcl.g:3221:4: ( (lv_arguments_3_0= ruleOclExpression ) )
                    // InternalOcl.g:3222:5: (lv_arguments_3_0= ruleOclExpression )
                    {
                    // InternalOcl.g:3222:5: (lv_arguments_3_0= ruleOclExpression )
                    // InternalOcl.g:3223:6: lv_arguments_3_0= ruleOclExpression
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

                    // InternalOcl.g:3240:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==20) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalOcl.g:3241:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOperationCallAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:3245:5: ( (lv_arguments_5_0= ruleOclExpression ) )
                    	    // InternalOcl.g:3246:6: (lv_arguments_5_0= ruleOclExpression )
                    	    {
                    	    // InternalOcl.g:3246:6: (lv_arguments_5_0= ruleOclExpression )
                    	    // InternalOcl.g:3247:7: lv_arguments_5_0= ruleOclExpression
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
                    	    break loop44;
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
    // InternalOcl.g:3274:1: entryRuleNavigationOp returns [String current=null] : iv_ruleNavigationOp= ruleNavigationOp EOF ;
    public final String entryRuleNavigationOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOp = null;


        try {
            // InternalOcl.g:3274:52: (iv_ruleNavigationOp= ruleNavigationOp EOF )
            // InternalOcl.g:3275:2: iv_ruleNavigationOp= ruleNavigationOp EOF
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
    // InternalOcl.g:3281:1: ruleNavigationOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleNavigationOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOcl.g:3287:2: ( (kw= '->' | kw= '.' ) )
            // InternalOcl.g:3288:2: (kw= '->' | kw= '.' )
            {
            // InternalOcl.g:3288:2: (kw= '->' | kw= '.' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                alt46=1;
            }
            else if ( (LA46_0==59) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalOcl.g:3289:3: kw= '->'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNavigationOpAccess().getHyphenMinusGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOcl.g:3295:3: kw= '.'
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
    // InternalOcl.g:3304:1: entryRuleNavigationOrAttributeCall returns [EObject current=null] : iv_ruleNavigationOrAttributeCall= ruleNavigationOrAttributeCall EOF ;
    public final EObject entryRuleNavigationOrAttributeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOrAttributeCall = null;


        try {
            // InternalOcl.g:3304:66: (iv_ruleNavigationOrAttributeCall= ruleNavigationOrAttributeCall EOF )
            // InternalOcl.g:3305:2: iv_ruleNavigationOrAttributeCall= ruleNavigationOrAttributeCall EOF
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
    // InternalOcl.g:3311:1: ruleNavigationOrAttributeCall returns [EObject current=null] : (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNavigationOrAttributeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalOcl.g:3317:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalOcl.g:3318:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalOcl.g:3318:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalOcl.g:3319:3: otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigationOrAttributeCallAccess().getFullStopKeyword_0());
            		
            // InternalOcl.g:3323:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOcl.g:3324:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOcl.g:3324:4: (lv_name_1_0= RULE_ID )
            // InternalOcl.g:3325:5: lv_name_1_0= RULE_ID
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
    // InternalOcl.g:3345:1: entryRuleIterateExp returns [EObject current=null] : iv_ruleIterateExp= ruleIterateExp EOF ;
    public final EObject entryRuleIterateExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterateExp = null;


        try {
            // InternalOcl.g:3345:51: (iv_ruleIterateExp= ruleIterateExp EOF )
            // InternalOcl.g:3346:2: iv_ruleIterateExp= ruleIterateExp EOF
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
    // InternalOcl.g:3352:1: ruleIterateExp returns [EObject current=null] : (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' ) ;
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
            // InternalOcl.g:3358:2: ( (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' ) )
            // InternalOcl.g:3359:2: (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' )
            {
            // InternalOcl.g:3359:2: (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' )
            // InternalOcl.g:3360:3: otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getIterateExpAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,60,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIterateExpAccess().getIterateKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getIterateExpAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOcl.g:3372:3: ( (lv_iterators_3_0= ruleIterator ) )
            // InternalOcl.g:3373:4: (lv_iterators_3_0= ruleIterator )
            {
            // InternalOcl.g:3373:4: (lv_iterators_3_0= ruleIterator )
            // InternalOcl.g:3374:5: lv_iterators_3_0= ruleIterator
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

            // InternalOcl.g:3391:3: (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==20) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalOcl.g:3392:4: otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIterateExpAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalOcl.g:3396:4: ( (lv_iterators_5_0= ruleIterator ) )
            	    // InternalOcl.g:3397:5: (lv_iterators_5_0= ruleIterator )
            	    {
            	    // InternalOcl.g:3397:5: (lv_iterators_5_0= ruleIterator )
            	    // InternalOcl.g:3398:6: lv_iterators_5_0= ruleIterator
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
            		
            // InternalOcl.g:3420:3: ( (lv_result_7_0= ruleLocalVariable ) )
            // InternalOcl.g:3421:4: (lv_result_7_0= ruleLocalVariable )
            {
            // InternalOcl.g:3421:4: (lv_result_7_0= ruleLocalVariable )
            // InternalOcl.g:3422:5: lv_result_7_0= ruleLocalVariable
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
            		
            // InternalOcl.g:3443:3: ( (lv_body_9_0= ruleOclExpression ) )
            // InternalOcl.g:3444:4: (lv_body_9_0= ruleOclExpression )
            {
            // InternalOcl.g:3444:4: (lv_body_9_0= ruleOclExpression )
            // InternalOcl.g:3445:5: lv_body_9_0= ruleOclExpression
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
    // InternalOcl.g:3470:1: entryRuleIterator returns [EObject current=null] : iv_ruleIterator= ruleIterator EOF ;
    public final EObject entryRuleIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterator = null;


        try {
            // InternalOcl.g:3470:49: (iv_ruleIterator= ruleIterator EOF )
            // InternalOcl.g:3471:2: iv_ruleIterator= ruleIterator EOF
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
    // InternalOcl.g:3477:1: ruleIterator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? ) ;
    public final EObject ruleIterator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3483:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? ) )
            // InternalOcl.g:3484:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? )
            {
            // InternalOcl.g:3484:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? )
            // InternalOcl.g:3485:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )?
            {
            // InternalOcl.g:3485:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOcl.g:3486:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOcl.g:3486:4: (lv_name_0_0= RULE_ID )
            // InternalOcl.g:3487:5: lv_name_0_0= RULE_ID
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

            // InternalOcl.g:3503:3: (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==17) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOcl.g:3504:4: otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getIteratorAccess().getColonKeyword_1_0());
                    			
                    // InternalOcl.g:3508:4: ( (lv_type_2_0= ruleOclTypeLiteral ) )
                    // InternalOcl.g:3509:5: (lv_type_2_0= ruleOclTypeLiteral )
                    {
                    // InternalOcl.g:3509:5: (lv_type_2_0= ruleOclTypeLiteral )
                    // InternalOcl.g:3510:6: lv_type_2_0= ruleOclTypeLiteral
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
    // InternalOcl.g:3532:1: entryRuleIteratorExp returns [EObject current=null] : iv_ruleIteratorExp= ruleIteratorExp EOF ;
    public final EObject entryRuleIteratorExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteratorExp = null;


        try {
            // InternalOcl.g:3532:52: (iv_ruleIteratorExp= ruleIteratorExp EOF )
            // InternalOcl.g:3533:2: iv_ruleIteratorExp= ruleIteratorExp EOF
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
    // InternalOcl.g:3539:1: ruleIteratorExp returns [EObject current=null] : (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' ) ;
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
            // InternalOcl.g:3545:2: ( (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' ) )
            // InternalOcl.g:3546:2: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' )
            {
            // InternalOcl.g:3546:2: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' )
            // InternalOcl.g:3547:3: otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIteratorExpAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalOcl.g:3551:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOcl.g:3552:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOcl.g:3552:4: (lv_name_1_0= RULE_ID )
            // InternalOcl.g:3553:5: lv_name_1_0= RULE_ID
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
            		
            // InternalOcl.g:3573:3: ( (lv_iterators_3_0= ruleIterator ) )
            // InternalOcl.g:3574:4: (lv_iterators_3_0= ruleIterator )
            {
            // InternalOcl.g:3574:4: (lv_iterators_3_0= ruleIterator )
            // InternalOcl.g:3575:5: lv_iterators_3_0= ruleIterator
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

            // InternalOcl.g:3592:3: (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==20) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalOcl.g:3593:4: otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIteratorExpAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalOcl.g:3597:4: ( (lv_iterators_5_0= ruleIterator ) )
            	    // InternalOcl.g:3598:5: (lv_iterators_5_0= ruleIterator )
            	    {
            	    // InternalOcl.g:3598:5: (lv_iterators_5_0= ruleIterator )
            	    // InternalOcl.g:3599:6: lv_iterators_5_0= ruleIterator
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
            		
            // InternalOcl.g:3621:3: ( (lv_body_7_0= ruleOclExpression ) )
            // InternalOcl.g:3622:4: (lv_body_7_0= ruleOclExpression )
            {
            // InternalOcl.g:3622:4: (lv_body_7_0= ruleOclExpression )
            // InternalOcl.g:3623:5: lv_body_7_0= ruleOclExpression
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


    // $ANTLR start "entryRuleLocalVariable"
    // InternalOcl.g:3648:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // InternalOcl.g:3648:54: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // InternalOcl.g:3649:2: iv_ruleLocalVariable= ruleLocalVariable EOF
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
    // InternalOcl.g:3655:1: ruleLocalVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3661:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) )
            // InternalOcl.g:3662:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            {
            // InternalOcl.g:3662:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            // InternalOcl.g:3663:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) )
            {
            // InternalOcl.g:3663:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOcl.g:3664:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOcl.g:3664:4: (lv_name_0_0= RULE_ID )
            // InternalOcl.g:3665:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            // InternalOcl.g:3681:3: (otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==17) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalOcl.g:3682:4: otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getLocalVariableAccess().getColonKeyword_1_0());
                    			
                    // InternalOcl.g:3686:4: ( (lv_type_2_0= ruleOclTypeLiteral ) )
                    // InternalOcl.g:3687:5: (lv_type_2_0= ruleOclTypeLiteral )
                    {
                    // InternalOcl.g:3687:5: (lv_type_2_0= ruleOclTypeLiteral )
                    // InternalOcl.g:3688:6: lv_type_2_0= ruleOclTypeLiteral
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
            		
            // InternalOcl.g:3710:3: ( (lv_initExpression_4_0= ruleOclExpression ) )
            // InternalOcl.g:3711:4: (lv_initExpression_4_0= ruleOclExpression )
            {
            // InternalOcl.g:3711:4: (lv_initExpression_4_0= ruleOclExpression )
            // InternalOcl.g:3712:5: lv_initExpression_4_0= ruleOclExpression
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
    // InternalOcl.g:3733:1: entryRuleOclTypeLiteral returns [EObject current=null] : iv_ruleOclTypeLiteral= ruleOclTypeLiteral EOF ;
    public final EObject entryRuleOclTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclTypeLiteral = null;


        try {
            // InternalOcl.g:3733:55: (iv_ruleOclTypeLiteral= ruleOclTypeLiteral EOF )
            // InternalOcl.g:3734:2: iv_ruleOclTypeLiteral= ruleOclTypeLiteral EOF
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
    // InternalOcl.g:3740:1: ruleOclTypeLiteral returns [EObject current=null] : (this_CollectionTypeLiteral_0= ruleCollectionTypeLiteral | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_OclVoidType_3= ruleOclVoidType | this_TupleType_4= ruleTupleType | this_OclModelElementClass_5= ruleOclModelElementClass | this_MapType_6= ruleMapType ) ;
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
            // InternalOcl.g:3746:2: ( (this_CollectionTypeLiteral_0= ruleCollectionTypeLiteral | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_OclVoidType_3= ruleOclVoidType | this_TupleType_4= ruleTupleType | this_OclModelElementClass_5= ruleOclModelElementClass | this_MapType_6= ruleMapType ) )
            // InternalOcl.g:3747:2: (this_CollectionTypeLiteral_0= ruleCollectionTypeLiteral | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_OclVoidType_3= ruleOclVoidType | this_TupleType_4= ruleTupleType | this_OclModelElementClass_5= ruleOclModelElementClass | this_MapType_6= ruleMapType )
            {
            // InternalOcl.g:3747:2: (this_CollectionTypeLiteral_0= ruleCollectionTypeLiteral | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_OclVoidType_3= ruleOclVoidType | this_TupleType_4= ruleTupleType | this_OclModelElementClass_5= ruleOclModelElementClass | this_MapType_6= ruleMapType )
            int alt51=7;
            switch ( input.LA(1) ) {
            case 41:
            case 44:
            case 45:
            case 46:
            case 63:
                {
                alt51=1;
                }
                break;
            case 64:
            case 65:
            case 66:
            case 67:
                {
                alt51=2;
                }
                break;
            case 68:
                {
                alt51=3;
                }
                break;
            case 69:
                {
                alt51=4;
                }
                break;
            case 47:
                {
                alt51=5;
                }
                break;
            case RULE_ID:
                {
                alt51=6;
                }
                break;
            case 48:
                {
                alt51=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalOcl.g:3748:3: this_CollectionTypeLiteral_0= ruleCollectionTypeLiteral
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
                    // InternalOcl.g:3757:3: this_Primitive_1= rulePrimitive
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
                    // InternalOcl.g:3766:3: this_OclAnyType_2= ruleOclAnyType
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
                    // InternalOcl.g:3775:3: this_OclVoidType_3= ruleOclVoidType
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
                    // InternalOcl.g:3784:3: this_TupleType_4= ruleTupleType
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
                    // InternalOcl.g:3793:3: this_OclModelElementClass_5= ruleOclModelElementClass
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
                    // InternalOcl.g:3802:3: this_MapType_6= ruleMapType
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
    // InternalOcl.g:3814:1: entryRuleCollectionTypeLiteral returns [EObject current=null] : iv_ruleCollectionTypeLiteral= ruleCollectionTypeLiteral EOF ;
    public final EObject entryRuleCollectionTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeLiteral = null;


        try {
            // InternalOcl.g:3814:62: (iv_ruleCollectionTypeLiteral= ruleCollectionTypeLiteral EOF )
            // InternalOcl.g:3815:2: iv_ruleCollectionTypeLiteral= ruleCollectionTypeLiteral EOF
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
    // InternalOcl.g:3821:1: ruleCollectionTypeLiteral returns [EObject current=null] : (this_CollectionType_0= ruleCollectionType | this_BagType_1= ruleBagType | this_OrderedSetType_2= ruleOrderedSetType | this_SequenceType_3= ruleSequenceType | this_SetType_4= ruleSetType ) ;
    public final EObject ruleCollectionTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionType_0 = null;

        EObject this_BagType_1 = null;

        EObject this_OrderedSetType_2 = null;

        EObject this_SequenceType_3 = null;

        EObject this_SetType_4 = null;



        	enterRule();

        try {
            // InternalOcl.g:3827:2: ( (this_CollectionType_0= ruleCollectionType | this_BagType_1= ruleBagType | this_OrderedSetType_2= ruleOrderedSetType | this_SequenceType_3= ruleSequenceType | this_SetType_4= ruleSetType ) )
            // InternalOcl.g:3828:2: (this_CollectionType_0= ruleCollectionType | this_BagType_1= ruleBagType | this_OrderedSetType_2= ruleOrderedSetType | this_SequenceType_3= ruleSequenceType | this_SetType_4= ruleSetType )
            {
            // InternalOcl.g:3828:2: (this_CollectionType_0= ruleCollectionType | this_BagType_1= ruleBagType | this_OrderedSetType_2= ruleOrderedSetType | this_SequenceType_3= ruleSequenceType | this_SetType_4= ruleSetType )
            int alt52=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt52=1;
                }
                break;
            case 41:
                {
                alt52=2;
                }
                break;
            case 44:
                {
                alt52=3;
                }
                break;
            case 45:
                {
                alt52=4;
                }
                break;
            case 46:
                {
                alt52=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalOcl.g:3829:3: this_CollectionType_0= ruleCollectionType
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
                    // InternalOcl.g:3838:3: this_BagType_1= ruleBagType
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
                    // InternalOcl.g:3847:3: this_OrderedSetType_2= ruleOrderedSetType
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
                    // InternalOcl.g:3856:3: this_SequenceType_3= ruleSequenceType
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
                    // InternalOcl.g:3865:3: this_SetType_4= ruleSetType
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
    // InternalOcl.g:3877:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalOcl.g:3877:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalOcl.g:3878:2: iv_ruleCollectionType= ruleCollectionType EOF
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
    // InternalOcl.g:3884:1: ruleCollectionType returns [EObject current=null] : (otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3890:2: ( (otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) )
            // InternalOcl.g:3891:2: (otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:3891:2: (otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            // InternalOcl.g:3892:3: otherlv_0= 'Collection' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionTypeAccess().getCollectionKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:3900:3: ( (lv_elementType_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:3901:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:3901:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:3902:5: lv_elementType_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getElementTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
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
    // InternalOcl.g:3927:1: entryRuleBagType returns [EObject current=null] : iv_ruleBagType= ruleBagType EOF ;
    public final EObject entryRuleBagType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagType = null;


        try {
            // InternalOcl.g:3927:48: (iv_ruleBagType= ruleBagType EOF )
            // InternalOcl.g:3928:2: iv_ruleBagType= ruleBagType EOF
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
    // InternalOcl.g:3934:1: ruleBagType returns [EObject current=null] : (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleBagType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3940:2: ( (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) )
            // InternalOcl.g:3941:2: (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:3941:2: (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            // InternalOcl.g:3942:3: otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBagTypeAccess().getBagKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getBagTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:3950:3: ( (lv_elementType_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:3951:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:3951:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:3952:5: lv_elementType_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getBagTypeAccess().getElementTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
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
    // InternalOcl.g:3977:1: entryRuleOrderedSetType returns [EObject current=null] : iv_ruleOrderedSetType= ruleOrderedSetType EOF ;
    public final EObject entryRuleOrderedSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedSetType = null;


        try {
            // InternalOcl.g:3977:55: (iv_ruleOrderedSetType= ruleOrderedSetType EOF )
            // InternalOcl.g:3978:2: iv_ruleOrderedSetType= ruleOrderedSetType EOF
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
    // InternalOcl.g:3984:1: ruleOrderedSetType returns [EObject current=null] : (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleOrderedSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:3990:2: ( (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) )
            // InternalOcl.g:3991:2: (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:3991:2: (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            // InternalOcl.g:3992:3: otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderedSetTypeAccess().getOrderedSetKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderedSetTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:4000:3: ( (lv_elementType_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:4001:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:4001:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:4002:5: lv_elementType_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getOrderedSetTypeAccess().getElementTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
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
    // InternalOcl.g:4027:1: entryRuleSequenceType returns [EObject current=null] : iv_ruleSequenceType= ruleSequenceType EOF ;
    public final EObject entryRuleSequenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceType = null;


        try {
            // InternalOcl.g:4027:53: (iv_ruleSequenceType= ruleSequenceType EOF )
            // InternalOcl.g:4028:2: iv_ruleSequenceType= ruleSequenceType EOF
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
    // InternalOcl.g:4034:1: ruleSequenceType returns [EObject current=null] : (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleSequenceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:4040:2: ( (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) )
            // InternalOcl.g:4041:2: (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:4041:2: (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            // InternalOcl.g:4042:3: otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceTypeAccess().getSequenceKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:4050:3: ( (lv_elementType_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:4051:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:4051:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:4052:5: lv_elementType_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getSequenceTypeAccess().getElementTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
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
    // InternalOcl.g:4077:1: entryRuleSetType returns [EObject current=null] : iv_ruleSetType= ruleSetType EOF ;
    public final EObject entryRuleSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetType = null;


        try {
            // InternalOcl.g:4077:48: (iv_ruleSetType= ruleSetType EOF )
            // InternalOcl.g:4078:2: iv_ruleSetType= ruleSetType EOF
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
    // InternalOcl.g:4084:1: ruleSetType returns [EObject current=null] : (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:4090:2: ( (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' ) )
            // InternalOcl.g:4091:2: (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            {
            // InternalOcl.g:4091:2: (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')' )
            // InternalOcl.g:4092:3: otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSetTypeAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSetTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:4100:3: ( (lv_elementType_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:4101:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:4101:4: (lv_elementType_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:4102:5: lv_elementType_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getSetTypeAccess().getElementTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
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
    // InternalOcl.g:4127:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalOcl.g:4127:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalOcl.g:4128:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalOcl.g:4134:1: rulePrimitive returns [EObject current=null] : (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_NumericType_2 = null;



        	enterRule();

        try {
            // InternalOcl.g:4140:2: ( (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) )
            // InternalOcl.g:4141:2: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            {
            // InternalOcl.g:4141:2: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt53=1;
                }
                break;
            case 65:
                {
                alt53=2;
                }
                break;
            case 66:
            case 67:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalOcl.g:4142:3: this_StringType_0= ruleStringType
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
                    // InternalOcl.g:4151:3: this_BooleanType_1= ruleBooleanType
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
                    // InternalOcl.g:4160:3: this_NumericType_2= ruleNumericType
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
    // InternalOcl.g:4172:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalOcl.g:4172:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalOcl.g:4173:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalOcl.g:4179:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'String' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4185:2: ( ( () otherlv_1= 'String' ) )
            // InternalOcl.g:4186:2: ( () otherlv_1= 'String' )
            {
            // InternalOcl.g:4186:2: ( () otherlv_1= 'String' )
            // InternalOcl.g:4187:3: () otherlv_1= 'String'
            {
            // InternalOcl.g:4187:3: ()
            // InternalOcl.g:4188:4: 
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
    // InternalOcl.g:4202:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalOcl.g:4202:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalOcl.g:4203:2: iv_ruleBooleanType= ruleBooleanType EOF
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
    // InternalOcl.g:4209:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'Boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4215:2: ( ( () otherlv_1= 'Boolean' ) )
            // InternalOcl.g:4216:2: ( () otherlv_1= 'Boolean' )
            {
            // InternalOcl.g:4216:2: ( () otherlv_1= 'Boolean' )
            // InternalOcl.g:4217:3: () otherlv_1= 'Boolean'
            {
            // InternalOcl.g:4217:3: ()
            // InternalOcl.g:4218:4: 
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
    // InternalOcl.g:4232:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // InternalOcl.g:4232:52: (iv_ruleNumericType= ruleNumericType EOF )
            // InternalOcl.g:4233:2: iv_ruleNumericType= ruleNumericType EOF
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
    // InternalOcl.g:4239:1: ruleNumericType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_RealType_1 = null;



        	enterRule();

        try {
            // InternalOcl.g:4245:2: ( (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType ) )
            // InternalOcl.g:4246:2: (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType )
            {
            // InternalOcl.g:4246:2: (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==66) ) {
                alt54=1;
            }
            else if ( (LA54_0==67) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalOcl.g:4247:3: this_IntegerType_0= ruleIntegerType
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
                    // InternalOcl.g:4256:3: this_RealType_1= ruleRealType
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
    // InternalOcl.g:4268:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalOcl.g:4268:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalOcl.g:4269:2: iv_ruleIntegerType= ruleIntegerType EOF
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
    // InternalOcl.g:4275:1: ruleIntegerType returns [EObject current=null] : ( () otherlv_1= 'Integer' ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4281:2: ( ( () otherlv_1= 'Integer' ) )
            // InternalOcl.g:4282:2: ( () otherlv_1= 'Integer' )
            {
            // InternalOcl.g:4282:2: ( () otherlv_1= 'Integer' )
            // InternalOcl.g:4283:3: () otherlv_1= 'Integer'
            {
            // InternalOcl.g:4283:3: ()
            // InternalOcl.g:4284:4: 
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
    // InternalOcl.g:4298:1: entryRuleRealType returns [EObject current=null] : iv_ruleRealType= ruleRealType EOF ;
    public final EObject entryRuleRealType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealType = null;


        try {
            // InternalOcl.g:4298:49: (iv_ruleRealType= ruleRealType EOF )
            // InternalOcl.g:4299:2: iv_ruleRealType= ruleRealType EOF
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
    // InternalOcl.g:4305:1: ruleRealType returns [EObject current=null] : ( () otherlv_1= 'Real' ) ;
    public final EObject ruleRealType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4311:2: ( ( () otherlv_1= 'Real' ) )
            // InternalOcl.g:4312:2: ( () otherlv_1= 'Real' )
            {
            // InternalOcl.g:4312:2: ( () otherlv_1= 'Real' )
            // InternalOcl.g:4313:3: () otherlv_1= 'Real'
            {
            // InternalOcl.g:4313:3: ()
            // InternalOcl.g:4314:4: 
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
    // InternalOcl.g:4328:1: entryRuleOclAnyType returns [EObject current=null] : iv_ruleOclAnyType= ruleOclAnyType EOF ;
    public final EObject entryRuleOclAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclAnyType = null;


        try {
            // InternalOcl.g:4328:51: (iv_ruleOclAnyType= ruleOclAnyType EOF )
            // InternalOcl.g:4329:2: iv_ruleOclAnyType= ruleOclAnyType EOF
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
    // InternalOcl.g:4335:1: ruleOclAnyType returns [EObject current=null] : ( () otherlv_1= 'OclAny' ) ;
    public final EObject ruleOclAnyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4341:2: ( ( () otherlv_1= 'OclAny' ) )
            // InternalOcl.g:4342:2: ( () otherlv_1= 'OclAny' )
            {
            // InternalOcl.g:4342:2: ( () otherlv_1= 'OclAny' )
            // InternalOcl.g:4343:3: () otherlv_1= 'OclAny'
            {
            // InternalOcl.g:4343:3: ()
            // InternalOcl.g:4344:4: 
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
    // InternalOcl.g:4358:1: entryRuleOclVoidType returns [EObject current=null] : iv_ruleOclVoidType= ruleOclVoidType EOF ;
    public final EObject entryRuleOclVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclVoidType = null;


        try {
            // InternalOcl.g:4358:52: (iv_ruleOclVoidType= ruleOclVoidType EOF )
            // InternalOcl.g:4359:2: iv_ruleOclVoidType= ruleOclVoidType EOF
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
    // InternalOcl.g:4365:1: ruleOclVoidType returns [EObject current=null] : ( () otherlv_1= 'OclVoid' ) ;
    public final EObject ruleOclVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4371:2: ( ( () otherlv_1= 'OclVoid' ) )
            // InternalOcl.g:4372:2: ( () otherlv_1= 'OclVoid' )
            {
            // InternalOcl.g:4372:2: ( () otherlv_1= 'OclVoid' )
            // InternalOcl.g:4373:3: () otherlv_1= 'OclVoid'
            {
            // InternalOcl.g:4373:3: ()
            // InternalOcl.g:4374:4: 
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
    // InternalOcl.g:4388:1: entryRuleTupleType returns [EObject current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final EObject entryRuleTupleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleType = null;


        try {
            // InternalOcl.g:4388:50: (iv_ruleTupleType= ruleTupleType EOF )
            // InternalOcl.g:4389:2: iv_ruleTupleType= ruleTupleType EOF
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
    // InternalOcl.g:4395:1: ruleTupleType returns [EObject current=null] : ( () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalOcl.g:4401:2: ( ( () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')' ) )
            // InternalOcl.g:4402:2: ( () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')' )
            {
            // InternalOcl.g:4402:2: ( () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')' )
            // InternalOcl.g:4403:3: () otherlv_1= 'Tuple' otherlv_2= '(' ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )? otherlv_6= ')'
            {
            // InternalOcl.g:4403:3: ()
            // InternalOcl.g:4404:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTupleTypeAccess().getTupleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleTypeAccess().getTupleKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOcl.g:4418:3: ( ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOcl.g:4419:4: ( (lv_attributes_3_0= ruleTupleTypeAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )*
                    {
                    // InternalOcl.g:4419:4: ( (lv_attributes_3_0= ruleTupleTypeAttribute ) )
                    // InternalOcl.g:4420:5: (lv_attributes_3_0= ruleTupleTypeAttribute )
                    {
                    // InternalOcl.g:4420:5: (lv_attributes_3_0= ruleTupleTypeAttribute )
                    // InternalOcl.g:4421:6: lv_attributes_3_0= ruleTupleTypeAttribute
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

                    // InternalOcl.g:4438:4: (otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==20) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalOcl.g:4439:5: otherlv_4= ',' ( (lv_attributes_5_0= ruleTupleTypeAttribute ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTupleTypeAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalOcl.g:4443:5: ( (lv_attributes_5_0= ruleTupleTypeAttribute ) )
                    	    // InternalOcl.g:4444:6: (lv_attributes_5_0= ruleTupleTypeAttribute )
                    	    {
                    	    // InternalOcl.g:4444:6: (lv_attributes_5_0= ruleTupleTypeAttribute )
                    	    // InternalOcl.g:4445:7: lv_attributes_5_0= ruleTupleTypeAttribute
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
                    	    break loop55;
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
    // InternalOcl.g:4472:1: entryRuleTupleTypeAttribute returns [EObject current=null] : iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF ;
    public final EObject entryRuleTupleTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeAttribute = null;


        try {
            // InternalOcl.g:4472:59: (iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF )
            // InternalOcl.g:4473:2: iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF
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
    // InternalOcl.g:4479:1: ruleTupleTypeAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) ) ;
    public final EObject ruleTupleTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalOcl.g:4485:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) ) )
            // InternalOcl.g:4486:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )
            {
            // InternalOcl.g:4486:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) ) )
            // InternalOcl.g:4487:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclTypeLiteral ) )
            {
            // InternalOcl.g:4487:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOcl.g:4488:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOcl.g:4488:4: (lv_name_0_0= RULE_ID )
            // InternalOcl.g:4489:5: lv_name_0_0= RULE_ID
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
            		
            // InternalOcl.g:4509:3: ( (lv_type_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:4510:4: (lv_type_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:4510:4: (lv_type_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:4511:5: lv_type_2_0= ruleOclTypeLiteral
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
    // InternalOcl.g:4532:1: entryRuleOclModelElementClass returns [EObject current=null] : iv_ruleOclModelElementClass= ruleOclModelElementClass EOF ;
    public final EObject entryRuleOclModelElementClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclModelElementClass = null;


        try {
            // InternalOcl.g:4532:61: (iv_ruleOclModelElementClass= ruleOclModelElementClass EOF )
            // InternalOcl.g:4533:2: iv_ruleOclModelElementClass= ruleOclModelElementClass EOF
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
    // InternalOcl.g:4539:1: ruleOclModelElementClass returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleOclModelElementClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOcl.g:4545:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) ) )
            // InternalOcl.g:4546:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) )
            {
            // InternalOcl.g:4546:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) ) )
            // InternalOcl.g:4547:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( ( ruleQualifiedName ) )
            {
            // InternalOcl.g:4547:3: ( (otherlv_0= RULE_ID ) )
            // InternalOcl.g:4548:4: (otherlv_0= RULE_ID )
            {
            // InternalOcl.g:4548:4: (otherlv_0= RULE_ID )
            // InternalOcl.g:4549:5: otherlv_0= RULE_ID
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
            		
            // InternalOcl.g:4564:3: ( ( ruleQualifiedName ) )
            // InternalOcl.g:4565:4: ( ruleQualifiedName )
            {
            // InternalOcl.g:4565:4: ( ruleQualifiedName )
            // InternalOcl.g:4566:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOclModelElementClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOclModelElementClassAccess().getNameEClassCrossReference_2_0());
            				
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
    // InternalOcl.g:4584:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // InternalOcl.g:4584:48: (iv_ruleMapType= ruleMapType EOF )
            // InternalOcl.g:4585:2: iv_ruleMapType= ruleMapType EOF
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
    // InternalOcl.g:4591:1: ruleMapType returns [EObject current=null] : (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclTypeLiteral ) ) otherlv_5= ')' ) ;
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
            // InternalOcl.g:4597:2: ( (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclTypeLiteral ) ) otherlv_5= ')' ) )
            // InternalOcl.g:4598:2: (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclTypeLiteral ) ) otherlv_5= ')' )
            {
            // InternalOcl.g:4598:2: (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclTypeLiteral ) ) otherlv_5= ')' )
            // InternalOcl.g:4599:3: otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclTypeLiteral ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclTypeLiteral ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getMapKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOcl.g:4607:3: ( (lv_keyType_2_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:4608:4: (lv_keyType_2_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:4608:4: (lv_keyType_2_0= ruleOclTypeLiteral )
            // InternalOcl.g:4609:5: lv_keyType_2_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getMapTypeAccess().getKeyTypeOclTypeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
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
            		
            // InternalOcl.g:4630:3: ( (lv_valueType_4_0= ruleOclTypeLiteral ) )
            // InternalOcl.g:4631:4: (lv_valueType_4_0= ruleOclTypeLiteral )
            {
            // InternalOcl.g:4631:4: (lv_valueType_4_0= ruleOclTypeLiteral )
            // InternalOcl.g:4632:5: lv_valueType_4_0= ruleOclTypeLiteral
            {

            					newCompositeNode(grammarAccess.getMapTypeAccess().getValueTypeOclTypeLiteralParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_34);
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
    // InternalOcl.g:4657:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalOcl.g:4657:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalOcl.g:4658:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalOcl.g:4664:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalOcl.g:4670:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID ) ) )
            // InternalOcl.g:4671:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID ) )
            {
            // InternalOcl.g:4671:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID ) )
            // InternalOcl.g:4672:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalOcl.g:4679:3: (kw= '.' this_ID_2= RULE_ID )
            // InternalOcl.g:4680:4: kw= '.' this_ID_2= RULE_ID
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


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String dfa_1s = "\27\uffff";
    static final String dfa_2s = "\1\uffff\1\21\22\uffff\1\25\2\uffff";
    static final String dfa_3s = "\1\4\1\16\15\uffff\1\5\2\uffff\1\73\1\5\1\16\2\uffff";
    static final String dfa_4s = "\1\71\1\76\15\uffff\1\5\2\uffff\1\73\1\5\1\76\2\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\uffff\1\21\1\1\3\uffff\1\20\1\15";
    static final String dfa_6s = "\27\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\1\2\5\13\uffff\1\16\23\uffff\1\2\1\6\1\7\2\uffff\1\10\1\11\1\12\1\13\1\14\3\uffff\1\15\3\uffff\2\4",
            "\1\21\1\17\1\21\1\uffff\1\21\1\20\22\21\5\uffff\1\21\7\uffff\1\21\1\uffff\3\21\2\uffff\2\21\2\uffff\1\21",
            "",
            "",
            "",
            "",
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
            return "1630:2: (this_VariableExp_0= ruleVariableExp | this_SelfLiteralExp_1= ruleSelfLiteralExp | this_StringLiteralExp_2= ruleStringLiteralExp | this_BooleanLiteralExp_3= ruleBooleanLiteralExp | this_NumericLiteralExp_4= ruleNumericLiteralExp | this_NullLiteralExp_5= ruleNullLiteralExp | this_BagLiteralExp_6= ruleBagLiteralExp | this_OrderedSetLiteralExp_7= ruleOrderedSetLiteralExp | this_SequenceLiteralExp_8= ruleSequenceLiteralExp | this_SetLiteralExp_9= ruleSetLiteralExp | this_TupleLiteralExp_10= ruleTupleLiteralExp | this_MapLiteralExp_11= ruleMapLiteralExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_IfExp_13= ruleIfExp | this_BraceExp_14= ruleBraceExp | this_OclModelElementExp_15= ruleOclModelElementExp | this_ContextlessCallExp_16= ruleContextlessCallExp )";
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\5\uffff\1\7\7\uffff";
    static final String dfa_10s = "\1\72\2\5\1\23\1\uffff\1\16\1\4\2\uffff\1\17\1\4\1\uffff\1\17";
    static final String dfa_11s = "\1\73\1\74\1\5\1\23\1\uffff\1\76\1\71\2\uffff\1\76\1\71\1\uffff\1\76";
    static final String dfa_12s = "\4\uffff\1\3\2\uffff\1\2\1\1\2\uffff\1\4\1\uffff";
    static final String dfa_13s = "\15\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\2",
            "\1\3\66\uffff\1\4",
            "\1\5",
            "\1\6",
            "",
            "\1\7\1\uffff\1\7\1\uffff\1\7\1\10\22\7\5\uffff\1\7\7\uffff\1\7\1\uffff\3\7\2\uffff\2\7\2\uffff\1\7",
            "\1\10\1\11\2\10\13\uffff\1\10\1\uffff\1\10\12\uffff\1\10\5\uffff\4\10\2\uffff\5\10\1\uffff\1\10\1\uffff\1\10\3\uffff\2\10",
            "",
            "",
            "\1\10\1\uffff\1\13\2\10\1\12\1\10\1\uffff\17\10\24\uffff\2\10\2\uffff\1\13",
            "\1\10\1\14\2\10\13\uffff\1\10\14\uffff\1\10\5\uffff\4\10\2\uffff\5\10\1\uffff\1\10\1\uffff\1\10\3\uffff\2\10",
            "",
            "\1\10\1\uffff\1\13\2\10\1\12\1\10\1\uffff\17\10\24\uffff\2\10\2\uffff\1\13"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "3124:2: (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp )";
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
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0311F3C1000800F0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008040002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0315FBC1000800F0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0315F3C1002800F0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x4000000000100000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});

}