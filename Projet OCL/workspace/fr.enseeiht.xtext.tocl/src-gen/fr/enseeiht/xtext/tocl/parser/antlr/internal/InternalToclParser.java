package fr.enseeiht.xtext.tocl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.enseeiht.xtext.tocl.services.ToclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalToclParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DOUBLE", "RULE_INT", "RULE_EXT_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "';'", "'import'", "'as'", "'context'", "'!'", "'def'", "':'", "'='", "'('", "','", "')'", "'inv'", "'until'", "'release'", "'and'", "'or'", "'xor'", "'implies'", "'equivalent'", "'<>'", "'>'", "'<'", "'>='", "'<='", "'-'", "'+'", "'div'", "'mod'", "'*'", "'/'", "'not'", "'always'", "'eventually'", "'next'", "'All'", "'Exists'", "'thisModule'", "'super'", "'self'", "'Bag'", "'{'", "'}'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Map'", "'#'", "'OclUndefined'", "'let'", "'in'", "'if'", "'then'", "'else'", "'endif'", "'true'", "'false'", "'.'", "'->'", "'iterate'", "'|'", "'String'", "'Boolean'", "'Integer'", "'Real'", "'OclAny'", "'OclType'", "'TupleType'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
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
    public static final int RULE_ID=4;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_WS=11;
    public static final int RULE_EXT_INT=8;
    public static final int RULE_ANY_OTHER=12;
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


        public InternalToclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalToclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalToclParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTocl.g"; }



     	private ToclGrammarAccess grammarAccess;

        public InternalToclParser(TokenStream input, ToclGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Module";
       	}

       	@Override
       	protected ToclGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModule"
    // InternalTocl.g:64:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalTocl.g:64:47: (iv_ruleModule= ruleModule EOF )
            // InternalTocl.g:65:2: iv_ruleModule= ruleModule EOF
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
    // InternalTocl.g:71:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) ) ( (lv_elements_4_0= ruleModuleElement ) )+ ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_imports_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:77:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) ) ( (lv_elements_4_0= ruleModuleElement ) )+ ) )
            // InternalTocl.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) ) ( (lv_elements_4_0= ruleModuleElement ) )+ )
            {
            // InternalTocl.g:78:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) ) ( (lv_elements_4_0= ruleModuleElement ) )+ )
            // InternalTocl.g:79:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) ) ( (lv_elements_4_0= ruleModuleElement ) )+
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalTocl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTocl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTocl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalTocl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getSemicolonKeyword_2());
            		
            // InternalTocl.g:105:3: ( (lv_imports_3_0= ruleImport ) )
            // InternalTocl.g:106:4: (lv_imports_3_0= ruleImport )
            {
            // InternalTocl.g:106:4: (lv_imports_3_0= ruleImport )
            // InternalTocl.g:107:5: lv_imports_3_0= ruleImport
            {

            					newCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_imports_3_0=ruleImport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleRule());
            					}
            					add(
            						current,
            						"imports",
            						lv_imports_3_0,
            						"fr.enseeiht.xtext.tocl.Tocl.Import");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTocl.g:124:3: ( (lv_elements_4_0= ruleModuleElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==19||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTocl.g:125:4: (lv_elements_4_0= ruleModuleElement )
            	    {
            	    // InternalTocl.g:125:4: (lv_elements_4_0= ruleModuleElement )
            	    // InternalTocl.g:126:5: lv_elements_4_0= ruleModuleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getElementsModuleElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_4_0=ruleModuleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"fr.enseeiht.xtext.tocl.Tocl.ModuleElement");
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
    // InternalTocl.g:147:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalTocl.g:147:47: (iv_ruleImport= ruleImport EOF )
            // InternalTocl.g:148:2: iv_ruleImport= ruleImport EOF
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
    // InternalTocl.g:154:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalTocl.g:160:2: ( (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalTocl.g:161:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalTocl.g:161:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalTocl.g:162:3: otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalTocl.g:166:3: ( (otherlv_1= RULE_STRING ) )
            // InternalTocl.g:167:4: (otherlv_1= RULE_STRING )
            {
            // InternalTocl.g:167:4: (otherlv_1= RULE_STRING )
            // InternalTocl.g:168:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getImportAccess().getPackageEPackageCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getAsKeyword_2());
            		
            // InternalTocl.g:183:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalTocl.g:184:4: (lv_name_3_0= RULE_ID )
            {
            // InternalTocl.g:184:4: (lv_name_3_0= RULE_ID )
            // InternalTocl.g:185:5: lv_name_3_0= RULE_ID
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


    // $ANTLR start "entryRuleModuleElement"
    // InternalTocl.g:205:1: entryRuleModuleElement returns [EObject current=null] : iv_ruleModuleElement= ruleModuleElement EOF ;
    public final EObject entryRuleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleElement = null;


        try {
            // InternalTocl.g:205:54: (iv_ruleModuleElement= ruleModuleElement EOF )
            // InternalTocl.g:206:2: iv_ruleModuleElement= ruleModuleElement EOF
            {
             newCompositeNode(grammarAccess.getModuleElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleElement=ruleModuleElement();

            state._fsp--;

             current =iv_ruleModuleElement; 
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
    // $ANTLR end "entryRuleModuleElement"


    // $ANTLR start "ruleModuleElement"
    // InternalTocl.g:212:1: ruleModuleElement returns [EObject current=null] : this_OclModuleElement_0= ruleOclModuleElement ;
    public final EObject ruleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject this_OclModuleElement_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:218:2: (this_OclModuleElement_0= ruleOclModuleElement )
            // InternalTocl.g:219:2: this_OclModuleElement_0= ruleOclModuleElement
            {

            		newCompositeNode(grammarAccess.getModuleElementAccess().getOclModuleElementParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OclModuleElement_0=ruleOclModuleElement();

            state._fsp--;


            		current = this_OclModuleElement_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleModuleElement"


    // $ANTLR start "entryRuleOclModuleElement"
    // InternalTocl.g:230:1: entryRuleOclModuleElement returns [EObject current=null] : iv_ruleOclModuleElement= ruleOclModuleElement EOF ;
    public final EObject entryRuleOclModuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclModuleElement = null;


        try {
            // InternalTocl.g:230:57: (iv_ruleOclModuleElement= ruleOclModuleElement EOF )
            // InternalTocl.g:231:2: iv_ruleOclModuleElement= ruleOclModuleElement EOF
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
    // InternalTocl.g:237:1: ruleOclModuleElement returns [EObject current=null] : (this_OclFeatureDefinition_0= ruleOclFeatureDefinition | this_OclInvariant_1= ruleOclInvariant ) ;
    public final EObject ruleOclModuleElement() throws RecognitionException {
        EObject current = null;

        EObject this_OclFeatureDefinition_0 = null;

        EObject this_OclInvariant_1 = null;



        	enterRule();

        try {
            // InternalTocl.g:243:2: ( (this_OclFeatureDefinition_0= ruleOclFeatureDefinition | this_OclInvariant_1= ruleOclInvariant ) )
            // InternalTocl.g:244:2: (this_OclFeatureDefinition_0= ruleOclFeatureDefinition | this_OclInvariant_1= ruleOclInvariant )
            {
            // InternalTocl.g:244:2: (this_OclFeatureDefinition_0= ruleOclFeatureDefinition | this_OclInvariant_1= ruleOclInvariant )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalTocl.g:245:3: this_OclFeatureDefinition_0= ruleOclFeatureDefinition
                    {

                    			newCompositeNode(grammarAccess.getOclModuleElementAccess().getOclFeatureDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OclFeatureDefinition_0=ruleOclFeatureDefinition();

                    state._fsp--;


                    			current = this_OclFeatureDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTocl.g:254:3: this_OclInvariant_1= ruleOclInvariant
                    {

                    			newCompositeNode(grammarAccess.getOclModuleElementAccess().getOclInvariantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OclInvariant_1=ruleOclInvariant();

                    state._fsp--;


                    			current = this_OclInvariant_1;
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
    // $ANTLR end "ruleOclModuleElement"


    // $ANTLR start "entryRuleOclFeatureDefinition"
    // InternalTocl.g:266:1: entryRuleOclFeatureDefinition returns [EObject current=null] : iv_ruleOclFeatureDefinition= ruleOclFeatureDefinition EOF ;
    public final EObject entryRuleOclFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclFeatureDefinition = null;


        try {
            // InternalTocl.g:266:61: (iv_ruleOclFeatureDefinition= ruleOclFeatureDefinition EOF )
            // InternalTocl.g:267:2: iv_ruleOclFeatureDefinition= ruleOclFeatureDefinition EOF
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
    // InternalTocl.g:273:1: ruleOclFeatureDefinition returns [EObject current=null] : ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) )? otherlv_4= 'def' otherlv_5= ':' ( ( (lv_feature_6_1= ruleAttribute | lv_feature_6_2= ruleOperation ) ) ) ) ;
    public final EObject ruleOclFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_feature_6_1 = null;

        EObject lv_feature_6_2 = null;



        	enterRule();

        try {
            // InternalTocl.g:279:2: ( ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) )? otherlv_4= 'def' otherlv_5= ':' ( ( (lv_feature_6_1= ruleAttribute | lv_feature_6_2= ruleOperation ) ) ) ) )
            // InternalTocl.g:280:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) )? otherlv_4= 'def' otherlv_5= ':' ( ( (lv_feature_6_1= ruleAttribute | lv_feature_6_2= ruleOperation ) ) ) )
            {
            // InternalTocl.g:280:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) )? otherlv_4= 'def' otherlv_5= ':' ( ( (lv_feature_6_1= ruleAttribute | lv_feature_6_2= ruleOperation ) ) ) )
            // InternalTocl.g:281:3: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) )? otherlv_4= 'def' otherlv_5= ':' ( ( (lv_feature_6_1= ruleAttribute | lv_feature_6_2= ruleOperation ) ) )
            {
            // InternalTocl.g:281:3: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTocl.g:282:4: otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) )
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getOclFeatureDefinitionAccess().getContextKeyword_0_0());
                    			
                    // InternalTocl.g:286:4: ( (otherlv_1= RULE_ID ) )
                    // InternalTocl.g:287:5: (otherlv_1= RULE_ID )
                    {
                    // InternalTocl.g:287:5: (otherlv_1= RULE_ID )
                    // InternalTocl.g:288:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOclFeatureDefinitionRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_1, grammarAccess.getOclFeatureDefinitionAccess().getEcoreTypesImportCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getOclFeatureDefinitionAccess().getExclamationMarkKeyword_0_2());
                    			
                    // InternalTocl.g:303:4: ( ( ruleQualifiedName ) )
                    // InternalTocl.g:304:5: ( ruleQualifiedName )
                    {
                    // InternalTocl.g:304:5: ( ruleQualifiedName )
                    // InternalTocl.g:305:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOclFeatureDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOclFeatureDefinitionAccess().getClassEClassCrossReference_0_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getOclFeatureDefinitionAccess().getDefKeyword_1());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getOclFeatureDefinitionAccess().getColonKeyword_2());
            		
            // InternalTocl.g:328:3: ( ( (lv_feature_6_1= ruleAttribute | lv_feature_6_2= ruleOperation ) ) )
            // InternalTocl.g:329:4: ( (lv_feature_6_1= ruleAttribute | lv_feature_6_2= ruleOperation ) )
            {
            // InternalTocl.g:329:4: ( (lv_feature_6_1= ruleAttribute | lv_feature_6_2= ruleOperation ) )
            // InternalTocl.g:330:5: (lv_feature_6_1= ruleAttribute | lv_feature_6_2= ruleOperation )
            {
            // InternalTocl.g:330:5: (lv_feature_6_1= ruleAttribute | lv_feature_6_2= ruleOperation )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==20) ) {
                    alt4=1;
                }
                else if ( (LA4_1==22) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTocl.g:331:6: lv_feature_6_1= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getOclFeatureDefinitionAccess().getFeatureAttributeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_feature_6_1=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOclFeatureDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"feature",
                    							lv_feature_6_1,
                    							"fr.enseeiht.xtext.tocl.Tocl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTocl.g:347:6: lv_feature_6_2= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getOclFeatureDefinitionAccess().getFeatureOperationParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_feature_6_2=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOclFeatureDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"feature",
                    							lv_feature_6_2,
                    							"fr.enseeiht.xtext.tocl.Tocl.Operation");
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
    // InternalTocl.g:369:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTocl.g:369:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTocl.g:370:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTocl.g:376:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:382:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) otherlv_5= ';' ) )
            // InternalTocl.g:383:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) otherlv_5= ';' )
            {
            // InternalTocl.g:383:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) otherlv_5= ';' )
            // InternalTocl.g:384:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) otherlv_5= ';'
            {
            // InternalTocl.g:384:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTocl.g:385:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTocl.g:385:4: (lv_name_0_0= RULE_ID )
            // InternalTocl.g:386:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalTocl.g:406:3: ( (lv_type_2_0= ruleOclType ) )
            // InternalTocl.g:407:4: (lv_type_2_0= ruleOclType )
            {
            // InternalTocl.g:407:4: (lv_type_2_0= ruleOclType )
            // InternalTocl.g:408:5: lv_type_2_0= ruleOclType
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
            						"fr.enseeiht.xtext.tocl.Tocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getEqualsSignKeyword_3());
            		
            // InternalTocl.g:429:3: ( (lv_initExpression_4_0= ruleOclExpression ) )
            // InternalTocl.g:430:4: (lv_initExpression_4_0= ruleOclExpression )
            {
            // InternalTocl.g:430:4: (lv_initExpression_4_0= ruleOclExpression )
            // InternalTocl.g:431:5: lv_initExpression_4_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getInitExpressionOclExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_initExpression_4_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"initExpression",
            						lv_initExpression_4_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getSemicolonKeyword_5());
            		

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
    // InternalTocl.g:456:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalTocl.g:456:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalTocl.g:457:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalTocl.g:463:1: ruleOperation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+ )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclType ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ';' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_returnType_7_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:469:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+ )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclType ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ';' ) )
            // InternalTocl.g:470:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+ )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclType ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ';' )
            {
            // InternalTocl.g:470:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+ )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclType ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ';' )
            // InternalTocl.g:471:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+ )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleOclType ) ) otherlv_8= '=' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ';'
            {
            // InternalTocl.g:471:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTocl.g:472:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTocl.g:472:4: (lv_name_0_0= RULE_ID )
            // InternalTocl.g:473:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTocl.g:493:3: ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTocl.g:494:4: ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+
                    {
                    // InternalTocl.g:494:4: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalTocl.g:495:5: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalTocl.g:495:5: (lv_parameters_2_0= ruleParameter )
                    // InternalTocl.g:496:6: lv_parameters_2_0= ruleParameter
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
                    							"fr.enseeiht.xtext.tocl.Tocl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTocl.g:513:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==23) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTocl.g:514:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalTocl.g:518:5: ( (lv_parameters_4_0= ruleParameter ) )
                    	    // InternalTocl.g:519:6: (lv_parameters_4_0= ruleParameter )
                    	    {
                    	    // InternalTocl.g:519:6: (lv_parameters_4_0= ruleParameter )
                    	    // InternalTocl.g:520:7: lv_parameters_4_0= ruleParameter
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
                    	    								"fr.enseeiht.xtext.tocl.Tocl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getColonKeyword_4());
            		
            // InternalTocl.g:547:3: ( (lv_returnType_7_0= ruleOclType ) )
            // InternalTocl.g:548:4: (lv_returnType_7_0= ruleOclType )
            {
            // InternalTocl.g:548:4: (lv_returnType_7_0= ruleOclType )
            // InternalTocl.g:549:5: lv_returnType_7_0= ruleOclType
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
            						"fr.enseeiht.xtext.tocl.Tocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getEqualsSignKeyword_6());
            		
            // InternalTocl.g:570:3: ( (lv_body_9_0= ruleOclExpression ) )
            // InternalTocl.g:571:4: (lv_body_9_0= ruleOclExpression )
            {
            // InternalTocl.g:571:4: (lv_body_9_0= ruleOclExpression )
            // InternalTocl.g:572:5: lv_body_9_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getBodyOclExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_4);
            lv_body_9_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_9_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getSemicolonKeyword_8());
            		

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
    // InternalTocl.g:597:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalTocl.g:597:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalTocl.g:598:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalTocl.g:604:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:610:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) ) )
            // InternalTocl.g:611:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )
            {
            // InternalTocl.g:611:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )
            // InternalTocl.g:612:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) )
            {
            // InternalTocl.g:612:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTocl.g:613:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTocl.g:613:4: (lv_name_0_0= RULE_ID )
            // InternalTocl.g:614:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalTocl.g:634:3: ( (lv_type_2_0= ruleOclType ) )
            // InternalTocl.g:635:4: (lv_type_2_0= ruleOclType )
            {
            // InternalTocl.g:635:4: (lv_type_2_0= ruleOclType )
            // InternalTocl.g:636:5: lv_type_2_0= ruleOclType
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
            						"fr.enseeiht.xtext.tocl.Tocl.OclType");
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
    // InternalTocl.g:657:1: entryRuleOclInvariant returns [EObject current=null] : iv_ruleOclInvariant= ruleOclInvariant EOF ;
    public final EObject entryRuleOclInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclInvariant = null;


        try {
            // InternalTocl.g:657:53: (iv_ruleOclInvariant= ruleOclInvariant EOF )
            // InternalTocl.g:658:2: iv_ruleOclInvariant= ruleOclInvariant EOF
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
    // InternalTocl.g:664:1: ruleOclInvariant returns [EObject current=null] : ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) )? otherlv_4= 'inv' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_body_7_0= ruleOclExpression ) ) ) ;
    public final EObject ruleOclInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:670:2: ( ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) )? otherlv_4= 'inv' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_body_7_0= ruleOclExpression ) ) ) )
            // InternalTocl.g:671:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) )? otherlv_4= 'inv' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_body_7_0= ruleOclExpression ) ) )
            {
            // InternalTocl.g:671:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) )? otherlv_4= 'inv' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_body_7_0= ruleOclExpression ) ) )
            // InternalTocl.g:672:3: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) )? otherlv_4= 'inv' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_body_7_0= ruleOclExpression ) )
            {
            // InternalTocl.g:672:3: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTocl.g:673:4: otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( ( ruleQualifiedName ) )
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getOclInvariantAccess().getContextKeyword_0_0());
                    			
                    // InternalTocl.g:677:4: ( (otherlv_1= RULE_ID ) )
                    // InternalTocl.g:678:5: (otherlv_1= RULE_ID )
                    {
                    // InternalTocl.g:678:5: (otherlv_1= RULE_ID )
                    // InternalTocl.g:679:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOclInvariantRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_1, grammarAccess.getOclInvariantAccess().getEcoreTypesImportCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getOclInvariantAccess().getExclamationMarkKeyword_0_2());
                    			
                    // InternalTocl.g:694:4: ( ( ruleQualifiedName ) )
                    // InternalTocl.g:695:5: ( ruleQualifiedName )
                    {
                    // InternalTocl.g:695:5: ( ruleQualifiedName )
                    // InternalTocl.g:696:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOclInvariantRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOclInvariantAccess().getClassEClassCrossReference_0_3_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getOclInvariantAccess().getInvKeyword_1());
            		
            // InternalTocl.g:715:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalTocl.g:716:4: (lv_name_5_0= RULE_ID )
            {
            // InternalTocl.g:716:4: (lv_name_5_0= RULE_ID )
            // InternalTocl.g:717:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_5_0, grammarAccess.getOclInvariantAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOclInvariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getOclInvariantAccess().getColonKeyword_3());
            		
            // InternalTocl.g:737:3: ( (lv_body_7_0= ruleOclExpression ) )
            // InternalTocl.g:738:4: (lv_body_7_0= ruleOclExpression )
            {
            // InternalTocl.g:738:4: (lv_body_7_0= ruleOclExpression )
            // InternalTocl.g:739:5: lv_body_7_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getOclInvariantAccess().getBodyOclExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_7_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOclInvariantRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_7_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
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
    // InternalTocl.g:760:1: entryRuleOclExpression returns [EObject current=null] : iv_ruleOclExpression= ruleOclExpression EOF ;
    public final EObject entryRuleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclExpression = null;


        try {
            // InternalTocl.g:760:54: (iv_ruleOclExpression= ruleOclExpression EOF )
            // InternalTocl.g:761:2: iv_ruleOclExpression= ruleOclExpression EOF
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
    // InternalTocl.g:767:1: ruleOclExpression returns [EObject current=null] : (this_OperatorCallExp_0= ruleOperatorCallExp | this_LetExp_1= ruleLetExp ) ;
    public final EObject ruleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OperatorCallExp_0 = null;

        EObject this_LetExp_1 = null;



        	enterRule();

        try {
            // InternalTocl.g:773:2: ( (this_OperatorCallExp_0= ruleOperatorCallExp | this_LetExp_1= ruleLetExp ) )
            // InternalTocl.g:774:2: (this_OperatorCallExp_0= ruleOperatorCallExp | this_LetExp_1= ruleLetExp )
            {
            // InternalTocl.g:774:2: (this_OperatorCallExp_0= ruleOperatorCallExp | this_LetExp_1= ruleLetExp )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||LA8_0==22||(LA8_0>=44 && LA8_0<=53)||(LA8_0>=56 && LA8_0<=62)||LA8_0==65||(LA8_0>=69 && LA8_0<=70)) ) {
                alt8=1;
            }
            else if ( (LA8_0==63) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTocl.g:775:3: this_OperatorCallExp_0= ruleOperatorCallExp
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
                    // InternalTocl.g:784:3: this_LetExp_1= ruleLetExp
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
    // InternalTocl.g:796:1: entryRuleOclModelElementExp returns [EObject current=null] : iv_ruleOclModelElementExp= ruleOclModelElementExp EOF ;
    public final EObject entryRuleOclModelElementExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclModelElementExp = null;


        try {
            // InternalTocl.g:796:59: (iv_ruleOclModelElementExp= ruleOclModelElementExp EOF )
            // InternalTocl.g:797:2: iv_ruleOclModelElementExp= ruleOclModelElementExp EOF
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
    // InternalTocl.g:803:1: ruleOclModelElementExp returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOclModelElementExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalTocl.g:809:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalTocl.g:810:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalTocl.g:810:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalTocl.g:811:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalTocl.g:811:3: ( (otherlv_0= RULE_ID ) )
            // InternalTocl.g:812:4: (otherlv_0= RULE_ID )
            {
            // InternalTocl.g:812:4: (otherlv_0= RULE_ID )
            // InternalTocl.g:813:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOclModelElementExpRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getOclModelElementExpAccess().getModelImportCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOclModelElementExpAccess().getExclamationMarkKeyword_1());
            		
            // InternalTocl.g:828:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTocl.g:829:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTocl.g:829:4: (lv_name_2_0= RULE_ID )
            // InternalTocl.g:830:5: lv_name_2_0= RULE_ID
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


    // $ANTLR start "entryRuleTEMPBIOP"
    // InternalTocl.g:850:1: entryRuleTEMPBIOP returns [String current=null] : iv_ruleTEMPBIOP= ruleTEMPBIOP EOF ;
    public final String entryRuleTEMPBIOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTEMPBIOP = null;


        try {
            // InternalTocl.g:850:48: (iv_ruleTEMPBIOP= ruleTEMPBIOP EOF )
            // InternalTocl.g:851:2: iv_ruleTEMPBIOP= ruleTEMPBIOP EOF
            {
             newCompositeNode(grammarAccess.getTEMPBIOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTEMPBIOP=ruleTEMPBIOP();

            state._fsp--;

             current =iv_ruleTEMPBIOP.getText(); 
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
    // $ANTLR end "entryRuleTEMPBIOP"


    // $ANTLR start "ruleTEMPBIOP"
    // InternalTocl.g:857:1: ruleTEMPBIOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'until' | kw= 'release' ) ;
    public final AntlrDatatypeRuleToken ruleTEMPBIOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTocl.g:863:2: ( (kw= 'until' | kw= 'release' ) )
            // InternalTocl.g:864:2: (kw= 'until' | kw= 'release' )
            {
            // InternalTocl.g:864:2: (kw= 'until' | kw= 'release' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTocl.g:865:3: kw= 'until'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTEMPBIOPAccess().getUntilKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTocl.g:871:3: kw= 'release'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTEMPBIOPAccess().getReleaseKeyword_1());
                    		

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
    // $ANTLR end "ruleTEMPBIOP"


    // $ANTLR start "entryRuleOperatorCallExp"
    // InternalTocl.g:880:1: entryRuleOperatorCallExp returns [EObject current=null] : iv_ruleOperatorCallExp= ruleOperatorCallExp EOF ;
    public final EObject entryRuleOperatorCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorCallExp = null;


        try {
            // InternalTocl.g:880:56: (iv_ruleOperatorCallExp= ruleOperatorCallExp EOF )
            // InternalTocl.g:881:2: iv_ruleOperatorCallExp= ruleOperatorCallExp EOF
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
    // InternalTocl.g:887:1: ruleOperatorCallExp returns [EObject current=null] : (this_BoolOpCallExp_0= ruleBoolOpCallExp ( () ( (lv_operationName_2_0= ruleTEMPBIOP ) ) ( (lv_argument_3_0= ruleBoolOpCallExp ) ) )* ) ;
    public final EObject ruleOperatorCallExp() throws RecognitionException {
        EObject current = null;

        EObject this_BoolOpCallExp_0 = null;

        AntlrDatatypeRuleToken lv_operationName_2_0 = null;

        EObject lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:893:2: ( (this_BoolOpCallExp_0= ruleBoolOpCallExp ( () ( (lv_operationName_2_0= ruleTEMPBIOP ) ) ( (lv_argument_3_0= ruleBoolOpCallExp ) ) )* ) )
            // InternalTocl.g:894:2: (this_BoolOpCallExp_0= ruleBoolOpCallExp ( () ( (lv_operationName_2_0= ruleTEMPBIOP ) ) ( (lv_argument_3_0= ruleBoolOpCallExp ) ) )* )
            {
            // InternalTocl.g:894:2: (this_BoolOpCallExp_0= ruleBoolOpCallExp ( () ( (lv_operationName_2_0= ruleTEMPBIOP ) ) ( (lv_argument_3_0= ruleBoolOpCallExp ) ) )* )
            // InternalTocl.g:895:3: this_BoolOpCallExp_0= ruleBoolOpCallExp ( () ( (lv_operationName_2_0= ruleTEMPBIOP ) ) ( (lv_argument_3_0= ruleBoolOpCallExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getOperatorCallExpAccess().getBoolOpCallExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_BoolOpCallExp_0=ruleBoolOpCallExp();

            state._fsp--;


            			current = this_BoolOpCallExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTocl.g:903:3: ( () ( (lv_operationName_2_0= ruleTEMPBIOP ) ) ( (lv_argument_3_0= ruleBoolOpCallExp ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=26 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTocl.g:904:4: () ( (lv_operationName_2_0= ruleTEMPBIOP ) ) ( (lv_argument_3_0= ruleBoolOpCallExp ) )
            	    {
            	    // InternalTocl.g:904:4: ()
            	    // InternalTocl.g:905:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOperatorCallExpAccess().getOperatorCallExpSourceAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTocl.g:911:4: ( (lv_operationName_2_0= ruleTEMPBIOP ) )
            	    // InternalTocl.g:912:5: (lv_operationName_2_0= ruleTEMPBIOP )
            	    {
            	    // InternalTocl.g:912:5: (lv_operationName_2_0= ruleTEMPBIOP )
            	    // InternalTocl.g:913:6: lv_operationName_2_0= ruleTEMPBIOP
            	    {

            	    						newCompositeNode(grammarAccess.getOperatorCallExpAccess().getOperationNameTEMPBIOPParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_operationName_2_0=ruleTEMPBIOP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperatorCallExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operationName",
            	    							lv_operationName_2_0,
            	    							"fr.enseeiht.xtext.tocl.Tocl.TEMPBIOP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTocl.g:930:4: ( (lv_argument_3_0= ruleBoolOpCallExp ) )
            	    // InternalTocl.g:931:5: (lv_argument_3_0= ruleBoolOpCallExp )
            	    {
            	    // InternalTocl.g:931:5: (lv_argument_3_0= ruleBoolOpCallExp )
            	    // InternalTocl.g:932:6: lv_argument_3_0= ruleBoolOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getOperatorCallExpAccess().getArgumentBoolOpCallExpParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_argument_3_0=ruleBoolOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperatorCallExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"argument",
            	    							lv_argument_3_0,
            	    							"fr.enseeiht.xtext.tocl.Tocl.BoolOpCallExp");
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


    // $ANTLR start "entryRuleBoolOpCallExp"
    // InternalTocl.g:954:1: entryRuleBoolOpCallExp returns [EObject current=null] : iv_ruleBoolOpCallExp= ruleBoolOpCallExp EOF ;
    public final EObject entryRuleBoolOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolOpCallExp = null;


        try {
            // InternalTocl.g:954:54: (iv_ruleBoolOpCallExp= ruleBoolOpCallExp EOF )
            // InternalTocl.g:955:2: iv_ruleBoolOpCallExp= ruleBoolOpCallExp EOF
            {
             newCompositeNode(grammarAccess.getBoolOpCallExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolOpCallExp=ruleBoolOpCallExp();

            state._fsp--;

             current =iv_ruleBoolOpCallExp; 
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
    // $ANTLR end "entryRuleBoolOpCallExp"


    // $ANTLR start "ruleBoolOpCallExp"
    // InternalTocl.g:961:1: ruleBoolOpCallExp returns [EObject current=null] : (this_EqOpCallExp_0= ruleEqOpCallExp ( ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) ) )* ) ;
    public final EObject ruleBoolOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject this_EqOpCallExp_0 = null;

        AntlrDatatypeRuleToken lv_operationName_2_0 = null;

        EObject lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:967:2: ( (this_EqOpCallExp_0= ruleEqOpCallExp ( ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) ) )* ) )
            // InternalTocl.g:968:2: (this_EqOpCallExp_0= ruleEqOpCallExp ( ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) ) )* )
            {
            // InternalTocl.g:968:2: (this_EqOpCallExp_0= ruleEqOpCallExp ( ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) ) )* )
            // InternalTocl.g:969:3: this_EqOpCallExp_0= ruleEqOpCallExp ( ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getBoolOpCallExpAccess().getEqOpCallExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_EqOpCallExp_0=ruleEqOpCallExp();

            state._fsp--;


            			current = this_EqOpCallExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTocl.g:977:3: ( ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=28 && LA11_0<=32)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTocl.g:978:4: ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) ) ( (lv_argument_3_0= ruleEqOpCallExp ) )
            	    {
            	    // InternalTocl.g:978:4: ( () ( (lv_operationName_2_0= ruleBOOLOP ) ) )
            	    // InternalTocl.g:979:5: () ( (lv_operationName_2_0= ruleBOOLOP ) )
            	    {
            	    // InternalTocl.g:979:5: ()
            	    // InternalTocl.g:980:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getBoolOpCallExpAccess().getBoolOpCallExpSourceAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalTocl.g:986:5: ( (lv_operationName_2_0= ruleBOOLOP ) )
            	    // InternalTocl.g:987:6: (lv_operationName_2_0= ruleBOOLOP )
            	    {
            	    // InternalTocl.g:987:6: (lv_operationName_2_0= ruleBOOLOP )
            	    // InternalTocl.g:988:7: lv_operationName_2_0= ruleBOOLOP
            	    {

            	    							newCompositeNode(grammarAccess.getBoolOpCallExpAccess().getOperationNameBOOLOPParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_22);
            	    lv_operationName_2_0=ruleBOOLOP();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBoolOpCallExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operationName",
            	    								lv_operationName_2_0,
            	    								"fr.enseeiht.xtext.tocl.Tocl.BOOLOP");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }

            	    // InternalTocl.g:1006:4: ( (lv_argument_3_0= ruleEqOpCallExp ) )
            	    // InternalTocl.g:1007:5: (lv_argument_3_0= ruleEqOpCallExp )
            	    {
            	    // InternalTocl.g:1007:5: (lv_argument_3_0= ruleEqOpCallExp )
            	    // InternalTocl.g:1008:6: lv_argument_3_0= ruleEqOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getBoolOpCallExpAccess().getArgumentEqOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_argument_3_0=ruleEqOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoolOpCallExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"argument",
            	    							lv_argument_3_0,
            	    							"fr.enseeiht.xtext.tocl.Tocl.EqOpCallExp");
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
    // $ANTLR end "ruleBoolOpCallExp"


    // $ANTLR start "entryRuleBOOLOP"
    // InternalTocl.g:1030:1: entryRuleBOOLOP returns [String current=null] : iv_ruleBOOLOP= ruleBOOLOP EOF ;
    public final String entryRuleBOOLOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLOP = null;


        try {
            // InternalTocl.g:1030:46: (iv_ruleBOOLOP= ruleBOOLOP EOF )
            // InternalTocl.g:1031:2: iv_ruleBOOLOP= ruleBOOLOP EOF
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
    // InternalTocl.g:1037:1: ruleBOOLOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' | kw= 'equivalent' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTocl.g:1043:2: ( (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' | kw= 'equivalent' ) )
            // InternalTocl.g:1044:2: (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' | kw= 'equivalent' )
            {
            // InternalTocl.g:1044:2: (kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' | kw= 'equivalent' )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            case 31:
                {
                alt12=4;
                }
                break;
            case 32:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTocl.g:1045:3: kw= 'and'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLOPAccess().getAndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTocl.g:1051:3: kw= 'or'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLOPAccess().getOrKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTocl.g:1057:3: kw= 'xor'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLOPAccess().getXorKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTocl.g:1063:3: kw= 'implies'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLOPAccess().getImpliesKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTocl.g:1069:3: kw= 'equivalent'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

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
    // InternalTocl.g:1078:1: entryRuleEqOpCallExp returns [EObject current=null] : iv_ruleEqOpCallExp= ruleEqOpCallExp EOF ;
    public final EObject entryRuleEqOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqOpCallExp = null;


        try {
            // InternalTocl.g:1078:52: (iv_ruleEqOpCallExp= ruleEqOpCallExp EOF )
            // InternalTocl.g:1079:2: iv_ruleEqOpCallExp= ruleEqOpCallExp EOF
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
    // InternalTocl.g:1085:1: ruleEqOpCallExp returns [EObject current=null] : (this_RelOpCallExp_0= ruleRelOpCallExp ( ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) ) )* ) ;
    public final EObject ruleEqOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject this_RelOpCallExp_0 = null;

        AntlrDatatypeRuleToken lv_operationName_2_0 = null;

        EObject lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:1091:2: ( (this_RelOpCallExp_0= ruleRelOpCallExp ( ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) ) )* ) )
            // InternalTocl.g:1092:2: (this_RelOpCallExp_0= ruleRelOpCallExp ( ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) ) )* )
            {
            // InternalTocl.g:1092:2: (this_RelOpCallExp_0= ruleRelOpCallExp ( ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) ) )* )
            // InternalTocl.g:1093:3: this_RelOpCallExp_0= ruleRelOpCallExp ( ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqOpCallExpAccess().getRelOpCallExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_RelOpCallExp_0=ruleRelOpCallExp();

            state._fsp--;


            			current = this_RelOpCallExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTocl.g:1101:3: ( ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21||LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTocl.g:1102:4: ( () ( (lv_operationName_2_0= ruleEQOP ) ) ) ( (lv_argument_3_0= ruleRelOpCallExp ) )
            	    {
            	    // InternalTocl.g:1102:4: ( () ( (lv_operationName_2_0= ruleEQOP ) ) )
            	    // InternalTocl.g:1103:5: () ( (lv_operationName_2_0= ruleEQOP ) )
            	    {
            	    // InternalTocl.g:1103:5: ()
            	    // InternalTocl.g:1104:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqOpCallExpAccess().getEqOpCallExpSourceAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalTocl.g:1110:5: ( (lv_operationName_2_0= ruleEQOP ) )
            	    // InternalTocl.g:1111:6: (lv_operationName_2_0= ruleEQOP )
            	    {
            	    // InternalTocl.g:1111:6: (lv_operationName_2_0= ruleEQOP )
            	    // InternalTocl.g:1112:7: lv_operationName_2_0= ruleEQOP
            	    {

            	    							newCompositeNode(grammarAccess.getEqOpCallExpAccess().getOperationNameEQOPParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_22);
            	    lv_operationName_2_0=ruleEQOP();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEqOpCallExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operationName",
            	    								lv_operationName_2_0,
            	    								"fr.enseeiht.xtext.tocl.Tocl.EQOP");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }

            	    // InternalTocl.g:1130:4: ( (lv_argument_3_0= ruleRelOpCallExp ) )
            	    // InternalTocl.g:1131:5: (lv_argument_3_0= ruleRelOpCallExp )
            	    {
            	    // InternalTocl.g:1131:5: (lv_argument_3_0= ruleRelOpCallExp )
            	    // InternalTocl.g:1132:6: lv_argument_3_0= ruleRelOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getEqOpCallExpAccess().getArgumentRelOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_argument_3_0=ruleRelOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqOpCallExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"argument",
            	    							lv_argument_3_0,
            	    							"fr.enseeiht.xtext.tocl.Tocl.RelOpCallExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleEqOpCallExp"


    // $ANTLR start "entryRuleEQOP"
    // InternalTocl.g:1154:1: entryRuleEQOP returns [String current=null] : iv_ruleEQOP= ruleEQOP EOF ;
    public final String entryRuleEQOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEQOP = null;


        try {
            // InternalTocl.g:1154:44: (iv_ruleEQOP= ruleEQOP EOF )
            // InternalTocl.g:1155:2: iv_ruleEQOP= ruleEQOP EOF
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
    // InternalTocl.g:1161:1: ruleEQOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken ruleEQOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTocl.g:1167:2: ( (kw= '=' | kw= '<>' ) )
            // InternalTocl.g:1168:2: (kw= '=' | kw= '<>' )
            {
            // InternalTocl.g:1168:2: (kw= '=' | kw= '<>' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalTocl.g:1169:3: kw= '='
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEQOPAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTocl.g:1175:3: kw= '<>'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

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
    // InternalTocl.g:1184:1: entryRuleRelOpCallExp returns [EObject current=null] : iv_ruleRelOpCallExp= ruleRelOpCallExp EOF ;
    public final EObject entryRuleRelOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelOpCallExp = null;


        try {
            // InternalTocl.g:1184:53: (iv_ruleRelOpCallExp= ruleRelOpCallExp EOF )
            // InternalTocl.g:1185:2: iv_ruleRelOpCallExp= ruleRelOpCallExp EOF
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
    // InternalTocl.g:1191:1: ruleRelOpCallExp returns [EObject current=null] : (this_AddOpCallExp_0= ruleAddOpCallExp ( ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) ) )* ) ;
    public final EObject ruleRelOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject this_AddOpCallExp_0 = null;

        AntlrDatatypeRuleToken lv_operationName_2_0 = null;

        EObject lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:1197:2: ( (this_AddOpCallExp_0= ruleAddOpCallExp ( ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) ) )* ) )
            // InternalTocl.g:1198:2: (this_AddOpCallExp_0= ruleAddOpCallExp ( ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) ) )* )
            {
            // InternalTocl.g:1198:2: (this_AddOpCallExp_0= ruleAddOpCallExp ( ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) ) )* )
            // InternalTocl.g:1199:3: this_AddOpCallExp_0= ruleAddOpCallExp ( ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelOpCallExpAccess().getAddOpCallExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_AddOpCallExp_0=ruleAddOpCallExp();

            state._fsp--;


            			current = this_AddOpCallExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTocl.g:1207:3: ( ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=34 && LA15_0<=37)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTocl.g:1208:4: ( () ( (lv_operationName_2_0= ruleRELOP ) ) ) ( (lv_argument_3_0= ruleAddOpCallExp ) )
            	    {
            	    // InternalTocl.g:1208:4: ( () ( (lv_operationName_2_0= ruleRELOP ) ) )
            	    // InternalTocl.g:1209:5: () ( (lv_operationName_2_0= ruleRELOP ) )
            	    {
            	    // InternalTocl.g:1209:5: ()
            	    // InternalTocl.g:1210:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getRelOpCallExpAccess().getRelOpCallExpSourceAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalTocl.g:1216:5: ( (lv_operationName_2_0= ruleRELOP ) )
            	    // InternalTocl.g:1217:6: (lv_operationName_2_0= ruleRELOP )
            	    {
            	    // InternalTocl.g:1217:6: (lv_operationName_2_0= ruleRELOP )
            	    // InternalTocl.g:1218:7: lv_operationName_2_0= ruleRELOP
            	    {

            	    							newCompositeNode(grammarAccess.getRelOpCallExpAccess().getOperationNameRELOPParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_22);
            	    lv_operationName_2_0=ruleRELOP();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRelOpCallExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operationName",
            	    								lv_operationName_2_0,
            	    								"fr.enseeiht.xtext.tocl.Tocl.RELOP");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }

            	    // InternalTocl.g:1236:4: ( (lv_argument_3_0= ruleAddOpCallExp ) )
            	    // InternalTocl.g:1237:5: (lv_argument_3_0= ruleAddOpCallExp )
            	    {
            	    // InternalTocl.g:1237:5: (lv_argument_3_0= ruleAddOpCallExp )
            	    // InternalTocl.g:1238:6: lv_argument_3_0= ruleAddOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getRelOpCallExpAccess().getArgumentAddOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_argument_3_0=ruleAddOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelOpCallExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"argument",
            	    							lv_argument_3_0,
            	    							"fr.enseeiht.xtext.tocl.Tocl.AddOpCallExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleRelOpCallExp"


    // $ANTLR start "entryRuleRELOP"
    // InternalTocl.g:1260:1: entryRuleRELOP returns [String current=null] : iv_ruleRELOP= ruleRELOP EOF ;
    public final String entryRuleRELOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRELOP = null;


        try {
            // InternalTocl.g:1260:45: (iv_ruleRELOP= ruleRELOP EOF )
            // InternalTocl.g:1261:2: iv_ruleRELOP= ruleRELOP EOF
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
    // InternalTocl.g:1267:1: ruleRELOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleRELOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTocl.g:1273:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) )
            // InternalTocl.g:1274:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            {
            // InternalTocl.g:1274:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 35:
                {
                alt16=2;
                }
                break;
            case 36:
                {
                alt16=3;
                }
                break;
            case 37:
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
                    // InternalTocl.g:1275:3: kw= '>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRELOPAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTocl.g:1281:3: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRELOPAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTocl.g:1287:3: kw= '>='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRELOPAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTocl.g:1293:3: kw= '<='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalTocl.g:1302:1: entryRuleAddOpCallExp returns [EObject current=null] : iv_ruleAddOpCallExp= ruleAddOpCallExp EOF ;
    public final EObject entryRuleAddOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOpCallExp = null;


        try {
            // InternalTocl.g:1302:53: (iv_ruleAddOpCallExp= ruleAddOpCallExp EOF )
            // InternalTocl.g:1303:2: iv_ruleAddOpCallExp= ruleAddOpCallExp EOF
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
    // InternalTocl.g:1309:1: ruleAddOpCallExp returns [EObject current=null] : (this_IntOpCallExp_0= ruleIntOpCallExp ( ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) ) )* ) ;
    public final EObject ruleAddOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject this_IntOpCallExp_0 = null;

        AntlrDatatypeRuleToken lv_operationName_2_0 = null;

        EObject lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:1315:2: ( (this_IntOpCallExp_0= ruleIntOpCallExp ( ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) ) )* ) )
            // InternalTocl.g:1316:2: (this_IntOpCallExp_0= ruleIntOpCallExp ( ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) ) )* )
            {
            // InternalTocl.g:1316:2: (this_IntOpCallExp_0= ruleIntOpCallExp ( ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) ) )* )
            // InternalTocl.g:1317:3: this_IntOpCallExp_0= ruleIntOpCallExp ( ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddOpCallExpAccess().getIntOpCallExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_IntOpCallExp_0=ruleIntOpCallExp();

            state._fsp--;


            			current = this_IntOpCallExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTocl.g:1325:3: ( ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=38 && LA17_0<=39)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTocl.g:1326:4: ( () ( (lv_operationName_2_0= ruleADDOP ) ) ) ( (lv_argument_3_0= ruleIntOpCallExp ) )
            	    {
            	    // InternalTocl.g:1326:4: ( () ( (lv_operationName_2_0= ruleADDOP ) ) )
            	    // InternalTocl.g:1327:5: () ( (lv_operationName_2_0= ruleADDOP ) )
            	    {
            	    // InternalTocl.g:1327:5: ()
            	    // InternalTocl.g:1328:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getAddOpCallExpAccess().getAddOpCallExpSourceAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalTocl.g:1334:5: ( (lv_operationName_2_0= ruleADDOP ) )
            	    // InternalTocl.g:1335:6: (lv_operationName_2_0= ruleADDOP )
            	    {
            	    // InternalTocl.g:1335:6: (lv_operationName_2_0= ruleADDOP )
            	    // InternalTocl.g:1336:7: lv_operationName_2_0= ruleADDOP
            	    {

            	    							newCompositeNode(grammarAccess.getAddOpCallExpAccess().getOperationNameADDOPParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_22);
            	    lv_operationName_2_0=ruleADDOP();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getAddOpCallExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operationName",
            	    								lv_operationName_2_0,
            	    								"fr.enseeiht.xtext.tocl.Tocl.ADDOP");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }

            	    // InternalTocl.g:1354:4: ( (lv_argument_3_0= ruleIntOpCallExp ) )
            	    // InternalTocl.g:1355:5: (lv_argument_3_0= ruleIntOpCallExp )
            	    {
            	    // InternalTocl.g:1355:5: (lv_argument_3_0= ruleIntOpCallExp )
            	    // InternalTocl.g:1356:6: lv_argument_3_0= ruleIntOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getAddOpCallExpAccess().getArgumentIntOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_argument_3_0=ruleIntOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddOpCallExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"argument",
            	    							lv_argument_3_0,
            	    							"fr.enseeiht.xtext.tocl.Tocl.IntOpCallExp");
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
    // InternalTocl.g:1378:1: entryRuleADDOP returns [String current=null] : iv_ruleADDOP= ruleADDOP EOF ;
    public final String entryRuleADDOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleADDOP = null;


        try {
            // InternalTocl.g:1378:45: (iv_ruleADDOP= ruleADDOP EOF )
            // InternalTocl.g:1379:2: iv_ruleADDOP= ruleADDOP EOF
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
    // InternalTocl.g:1385:1: ruleADDOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleADDOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTocl.g:1391:2: ( (kw= '-' | kw= '+' ) )
            // InternalTocl.g:1392:2: (kw= '-' | kw= '+' )
            {
            // InternalTocl.g:1392:2: (kw= '-' | kw= '+' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            else if ( (LA18_0==39) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalTocl.g:1393:3: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getADDOPAccess().getHyphenMinusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTocl.g:1399:3: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalTocl.g:1408:1: entryRuleIntOpCallExp returns [EObject current=null] : iv_ruleIntOpCallExp= ruleIntOpCallExp EOF ;
    public final EObject entryRuleIntOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntOpCallExp = null;


        try {
            // InternalTocl.g:1408:53: (iv_ruleIntOpCallExp= ruleIntOpCallExp EOF )
            // InternalTocl.g:1409:2: iv_ruleIntOpCallExp= ruleIntOpCallExp EOF
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
    // InternalTocl.g:1415:1: ruleIntOpCallExp returns [EObject current=null] : (this_MulOpCallExp_0= ruleMulOpCallExp ( ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) ) )* ) ;
    public final EObject ruleIntOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject this_MulOpCallExp_0 = null;

        AntlrDatatypeRuleToken lv_operationName_2_0 = null;

        EObject lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:1421:2: ( (this_MulOpCallExp_0= ruleMulOpCallExp ( ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) ) )* ) )
            // InternalTocl.g:1422:2: (this_MulOpCallExp_0= ruleMulOpCallExp ( ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) ) )* )
            {
            // InternalTocl.g:1422:2: (this_MulOpCallExp_0= ruleMulOpCallExp ( ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) ) )* )
            // InternalTocl.g:1423:3: this_MulOpCallExp_0= ruleMulOpCallExp ( ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getIntOpCallExpAccess().getMulOpCallExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_MulOpCallExp_0=ruleMulOpCallExp();

            state._fsp--;


            			current = this_MulOpCallExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTocl.g:1431:3: ( ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=40 && LA19_0<=41)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTocl.g:1432:4: ( () ( (lv_operationName_2_0= ruleINTOP ) ) ) ( (lv_argument_3_0= ruleMulOpCallExp ) )
            	    {
            	    // InternalTocl.g:1432:4: ( () ( (lv_operationName_2_0= ruleINTOP ) ) )
            	    // InternalTocl.g:1433:5: () ( (lv_operationName_2_0= ruleINTOP ) )
            	    {
            	    // InternalTocl.g:1433:5: ()
            	    // InternalTocl.g:1434:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getIntOpCallExpAccess().getIntOpCallExpSourceAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalTocl.g:1440:5: ( (lv_operationName_2_0= ruleINTOP ) )
            	    // InternalTocl.g:1441:6: (lv_operationName_2_0= ruleINTOP )
            	    {
            	    // InternalTocl.g:1441:6: (lv_operationName_2_0= ruleINTOP )
            	    // InternalTocl.g:1442:7: lv_operationName_2_0= ruleINTOP
            	    {

            	    							newCompositeNode(grammarAccess.getIntOpCallExpAccess().getOperationNameINTOPParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_22);
            	    lv_operationName_2_0=ruleINTOP();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getIntOpCallExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operationName",
            	    								lv_operationName_2_0,
            	    								"fr.enseeiht.xtext.tocl.Tocl.INTOP");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }

            	    // InternalTocl.g:1460:4: ( (lv_argument_3_0= ruleMulOpCallExp ) )
            	    // InternalTocl.g:1461:5: (lv_argument_3_0= ruleMulOpCallExp )
            	    {
            	    // InternalTocl.g:1461:5: (lv_argument_3_0= ruleMulOpCallExp )
            	    // InternalTocl.g:1462:6: lv_argument_3_0= ruleMulOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getIntOpCallExpAccess().getArgumentMulOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_argument_3_0=ruleMulOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIntOpCallExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"argument",
            	    							lv_argument_3_0,
            	    							"fr.enseeiht.xtext.tocl.Tocl.MulOpCallExp");
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
    // InternalTocl.g:1484:1: entryRuleINTOP returns [String current=null] : iv_ruleINTOP= ruleINTOP EOF ;
    public final String entryRuleINTOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTOP = null;


        try {
            // InternalTocl.g:1484:45: (iv_ruleINTOP= ruleINTOP EOF )
            // InternalTocl.g:1485:2: iv_ruleINTOP= ruleINTOP EOF
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
    // InternalTocl.g:1491:1: ruleINTOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'div' | kw= 'mod' ) ;
    public final AntlrDatatypeRuleToken ruleINTOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTocl.g:1497:2: ( (kw= 'div' | kw= 'mod' ) )
            // InternalTocl.g:1498:2: (kw= 'div' | kw= 'mod' )
            {
            // InternalTocl.g:1498:2: (kw= 'div' | kw= 'mod' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            else if ( (LA20_0==41) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalTocl.g:1499:3: kw= 'div'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getINTOPAccess().getDivKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTocl.g:1505:3: kw= 'mod'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalTocl.g:1514:1: entryRuleMulOpCallExp returns [EObject current=null] : iv_ruleMulOpCallExp= ruleMulOpCallExp EOF ;
    public final EObject entryRuleMulOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOpCallExp = null;


        try {
            // InternalTocl.g:1514:53: (iv_ruleMulOpCallExp= ruleMulOpCallExp EOF )
            // InternalTocl.g:1515:2: iv_ruleMulOpCallExp= ruleMulOpCallExp EOF
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
    // InternalTocl.g:1521:1: ruleMulOpCallExp returns [EObject current=null] : (this_NotOpCallExp_0= ruleNotOpCallExp ( ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) ) )* ) ;
    public final EObject ruleMulOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject this_NotOpCallExp_0 = null;

        AntlrDatatypeRuleToken lv_operationName_2_0 = null;

        EObject lv_argument_3_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:1527:2: ( (this_NotOpCallExp_0= ruleNotOpCallExp ( ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) ) )* ) )
            // InternalTocl.g:1528:2: (this_NotOpCallExp_0= ruleNotOpCallExp ( ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) ) )* )
            {
            // InternalTocl.g:1528:2: (this_NotOpCallExp_0= ruleNotOpCallExp ( ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) ) )* )
            // InternalTocl.g:1529:3: this_NotOpCallExp_0= ruleNotOpCallExp ( ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOpCallExpAccess().getNotOpCallExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_NotOpCallExp_0=ruleNotOpCallExp();

            state._fsp--;


            			current = this_NotOpCallExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTocl.g:1537:3: ( ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=42 && LA21_0<=43)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTocl.g:1538:4: ( () ( (lv_operationName_2_0= ruleMULOP ) ) ) ( (lv_argument_3_0= ruleNotOpCallExp ) )
            	    {
            	    // InternalTocl.g:1538:4: ( () ( (lv_operationName_2_0= ruleMULOP ) ) )
            	    // InternalTocl.g:1539:5: () ( (lv_operationName_2_0= ruleMULOP ) )
            	    {
            	    // InternalTocl.g:1539:5: ()
            	    // InternalTocl.g:1540:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulOpCallExpAccess().getMulOpCallExpSourceAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalTocl.g:1546:5: ( (lv_operationName_2_0= ruleMULOP ) )
            	    // InternalTocl.g:1547:6: (lv_operationName_2_0= ruleMULOP )
            	    {
            	    // InternalTocl.g:1547:6: (lv_operationName_2_0= ruleMULOP )
            	    // InternalTocl.g:1548:7: lv_operationName_2_0= ruleMULOP
            	    {

            	    							newCompositeNode(grammarAccess.getMulOpCallExpAccess().getOperationNameMULOPParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_22);
            	    lv_operationName_2_0=ruleMULOP();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMulOpCallExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operationName",
            	    								lv_operationName_2_0,
            	    								"fr.enseeiht.xtext.tocl.Tocl.MULOP");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }

            	    // InternalTocl.g:1566:4: ( (lv_argument_3_0= ruleNotOpCallExp ) )
            	    // InternalTocl.g:1567:5: (lv_argument_3_0= ruleNotOpCallExp )
            	    {
            	    // InternalTocl.g:1567:5: (lv_argument_3_0= ruleNotOpCallExp )
            	    // InternalTocl.g:1568:6: lv_argument_3_0= ruleNotOpCallExp
            	    {

            	    						newCompositeNode(grammarAccess.getMulOpCallExpAccess().getArgumentNotOpCallExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_argument_3_0=ruleNotOpCallExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOpCallExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"argument",
            	    							lv_argument_3_0,
            	    							"fr.enseeiht.xtext.tocl.Tocl.NotOpCallExp");
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
    // InternalTocl.g:1590:1: entryRuleMULOP returns [String current=null] : iv_ruleMULOP= ruleMULOP EOF ;
    public final String entryRuleMULOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULOP = null;


        try {
            // InternalTocl.g:1590:45: (iv_ruleMULOP= ruleMULOP EOF )
            // InternalTocl.g:1591:2: iv_ruleMULOP= ruleMULOP EOF
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
    // InternalTocl.g:1597:1: ruleMULOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleMULOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTocl.g:1603:2: ( (kw= '*' | kw= '/' ) )
            // InternalTocl.g:1604:2: (kw= '*' | kw= '/' )
            {
            // InternalTocl.g:1604:2: (kw= '*' | kw= '/' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            else if ( (LA22_0==43) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalTocl.g:1605:3: kw= '*'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMULOPAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTocl.g:1611:3: kw= '/'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

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
    // InternalTocl.g:1620:1: entryRuleNotOpCallExp returns [EObject current=null] : iv_ruleNotOpCallExp= ruleNotOpCallExp EOF ;
    public final EObject entryRuleNotOpCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOpCallExp = null;


        try {
            // InternalTocl.g:1620:53: (iv_ruleNotOpCallExp= ruleNotOpCallExp EOF )
            // InternalTocl.g:1621:2: iv_ruleNotOpCallExp= ruleNotOpCallExp EOF
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
    // InternalTocl.g:1627:1: ruleNotOpCallExp returns [EObject current=null] : ( ( ( (lv_operationName_0_0= ruleUnaryOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp ) ;
    public final EObject ruleNotOpCallExp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operationName_0_0 = null;

        EObject lv_source_1_0 = null;

        EObject this_PropertyCallExp_2 = null;



        	enterRule();

        try {
            // InternalTocl.g:1633:2: ( ( ( ( (lv_operationName_0_0= ruleUnaryOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp ) )
            // InternalTocl.g:1634:2: ( ( ( (lv_operationName_0_0= ruleUnaryOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp )
            {
            // InternalTocl.g:1634:2: ( ( ( (lv_operationName_0_0= ruleUnaryOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) ) | this_PropertyCallExp_2= rulePropertyCallExp )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=44 && LA23_0<=49)) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)||LA23_0==22||(LA23_0>=50 && LA23_0<=53)||(LA23_0>=56 && LA23_0<=62)||LA23_0==65||(LA23_0>=69 && LA23_0<=70)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalTocl.g:1635:3: ( ( (lv_operationName_0_0= ruleUnaryOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) )
                    {
                    // InternalTocl.g:1635:3: ( ( (lv_operationName_0_0= ruleUnaryOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) ) )
                    // InternalTocl.g:1636:4: ( (lv_operationName_0_0= ruleUnaryOP ) ) ( (lv_source_1_0= ruleNotOpCallExp ) )
                    {
                    // InternalTocl.g:1636:4: ( (lv_operationName_0_0= ruleUnaryOP ) )
                    // InternalTocl.g:1637:5: (lv_operationName_0_0= ruleUnaryOP )
                    {
                    // InternalTocl.g:1637:5: (lv_operationName_0_0= ruleUnaryOP )
                    // InternalTocl.g:1638:6: lv_operationName_0_0= ruleUnaryOP
                    {

                    						newCompositeNode(grammarAccess.getNotOpCallExpAccess().getOperationNameUnaryOPParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_operationName_0_0=ruleUnaryOP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotOpCallExpRule());
                    						}
                    						set(
                    							current,
                    							"operationName",
                    							lv_operationName_0_0,
                    							"fr.enseeiht.xtext.tocl.Tocl.UnaryOP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTocl.g:1655:4: ( (lv_source_1_0= ruleNotOpCallExp ) )
                    // InternalTocl.g:1656:5: (lv_source_1_0= ruleNotOpCallExp )
                    {
                    // InternalTocl.g:1656:5: (lv_source_1_0= ruleNotOpCallExp )
                    // InternalTocl.g:1657:6: lv_source_1_0= ruleNotOpCallExp
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
                    							"fr.enseeiht.xtext.tocl.Tocl.NotOpCallExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTocl.g:1676:3: this_PropertyCallExp_2= rulePropertyCallExp
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


    // $ANTLR start "entryRuleUnaryOP"
    // InternalTocl.g:1688:1: entryRuleUnaryOP returns [String current=null] : iv_ruleUnaryOP= ruleUnaryOP EOF ;
    public final String entryRuleUnaryOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOP = null;


        try {
            // InternalTocl.g:1688:47: (iv_ruleUnaryOP= ruleUnaryOP EOF )
            // InternalTocl.g:1689:2: iv_ruleUnaryOP= ruleUnaryOP EOF
            {
             newCompositeNode(grammarAccess.getUnaryOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOP=ruleUnaryOP();

            state._fsp--;

             current =iv_ruleUnaryOP.getText(); 
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
    // $ANTLR end "entryRuleUnaryOP"


    // $ANTLR start "ruleUnaryOP"
    // InternalTocl.g:1695:1: ruleUnaryOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NOTOP_0= ruleNOTOP | this_UNARYTEMPOP_1= ruleUNARYTEMPOP ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NOTOP_0 = null;

        AntlrDatatypeRuleToken this_UNARYTEMPOP_1 = null;



        	enterRule();

        try {
            // InternalTocl.g:1701:2: ( (this_NOTOP_0= ruleNOTOP | this_UNARYTEMPOP_1= ruleUNARYTEMPOP ) )
            // InternalTocl.g:1702:2: (this_NOTOP_0= ruleNOTOP | this_UNARYTEMPOP_1= ruleUNARYTEMPOP )
            {
            // InternalTocl.g:1702:2: (this_NOTOP_0= ruleNOTOP | this_UNARYTEMPOP_1= ruleUNARYTEMPOP )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=45 && LA24_0<=49)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalTocl.g:1703:3: this_NOTOP_0= ruleNOTOP
                    {

                    			newCompositeNode(grammarAccess.getUnaryOPAccess().getNOTOPParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NOTOP_0=ruleNOTOP();

                    state._fsp--;


                    			current.merge(this_NOTOP_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTocl.g:1714:3: this_UNARYTEMPOP_1= ruleUNARYTEMPOP
                    {

                    			newCompositeNode(grammarAccess.getUnaryOPAccess().getUNARYTEMPOPParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UNARYTEMPOP_1=ruleUNARYTEMPOP();

                    state._fsp--;


                    			current.merge(this_UNARYTEMPOP_1);
                    		

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
    // $ANTLR end "ruleUnaryOP"


    // $ANTLR start "entryRuleNOTOP"
    // InternalTocl.g:1728:1: entryRuleNOTOP returns [String current=null] : iv_ruleNOTOP= ruleNOTOP EOF ;
    public final String entryRuleNOTOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNOTOP = null;


        try {
            // InternalTocl.g:1728:45: (iv_ruleNOTOP= ruleNOTOP EOF )
            // InternalTocl.g:1729:2: iv_ruleNOTOP= ruleNOTOP EOF
            {
             newCompositeNode(grammarAccess.getNOTOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNOTOP=ruleNOTOP();

            state._fsp--;

             current =iv_ruleNOTOP.getText(); 
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
    // $ANTLR end "entryRuleNOTOP"


    // $ANTLR start "ruleNOTOP"
    // InternalTocl.g:1735:1: ruleNOTOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'not' ;
    public final AntlrDatatypeRuleToken ruleNOTOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTocl.g:1741:2: (kw= 'not' )
            // InternalTocl.g:1742:2: kw= 'not'
            {
            kw=(Token)match(input,44,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getNOTOPAccess().getNotKeyword());
            	

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
    // $ANTLR end "ruleNOTOP"


    // $ANTLR start "entryRuleUNARYTEMPOP"
    // InternalTocl.g:1750:1: entryRuleUNARYTEMPOP returns [String current=null] : iv_ruleUNARYTEMPOP= ruleUNARYTEMPOP EOF ;
    public final String entryRuleUNARYTEMPOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNARYTEMPOP = null;


        try {
            // InternalTocl.g:1750:51: (iv_ruleUNARYTEMPOP= ruleUNARYTEMPOP EOF )
            // InternalTocl.g:1751:2: iv_ruleUNARYTEMPOP= ruleUNARYTEMPOP EOF
            {
             newCompositeNode(grammarAccess.getUNARYTEMPOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNARYTEMPOP=ruleUNARYTEMPOP();

            state._fsp--;

             current =iv_ruleUNARYTEMPOP.getText(); 
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
    // $ANTLR end "entryRuleUNARYTEMPOP"


    // $ANTLR start "ruleUNARYTEMPOP"
    // InternalTocl.g:1757:1: ruleUNARYTEMPOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'always' | kw= 'eventually' | kw= 'next' | kw= 'All' | kw= 'Exists' ) ;
    public final AntlrDatatypeRuleToken ruleUNARYTEMPOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTocl.g:1763:2: ( (kw= 'always' | kw= 'eventually' | kw= 'next' | kw= 'All' | kw= 'Exists' ) )
            // InternalTocl.g:1764:2: (kw= 'always' | kw= 'eventually' | kw= 'next' | kw= 'All' | kw= 'Exists' )
            {
            // InternalTocl.g:1764:2: (kw= 'always' | kw= 'eventually' | kw= 'next' | kw= 'All' | kw= 'Exists' )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt25=1;
                }
                break;
            case 46:
                {
                alt25=2;
                }
                break;
            case 47:
                {
                alt25=3;
                }
                break;
            case 48:
                {
                alt25=4;
                }
                break;
            case 49:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalTocl.g:1765:3: kw= 'always'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUNARYTEMPOPAccess().getAlwaysKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTocl.g:1771:3: kw= 'eventually'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUNARYTEMPOPAccess().getEventuallyKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTocl.g:1777:3: kw= 'next'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUNARYTEMPOPAccess().getNextKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTocl.g:1783:3: kw= 'All'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUNARYTEMPOPAccess().getAllKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTocl.g:1789:3: kw= 'Exists'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUNARYTEMPOPAccess().getExistsKeyword_4());
                    		

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
    // $ANTLR end "ruleUNARYTEMPOP"


    // $ANTLR start "entryRulePropertyCallExp"
    // InternalTocl.g:1798:1: entryRulePropertyCallExp returns [EObject current=null] : iv_rulePropertyCallExp= rulePropertyCallExp EOF ;
    public final EObject entryRulePropertyCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCallExp = null;


        try {
            // InternalTocl.g:1798:56: (iv_rulePropertyCallExp= rulePropertyCallExp EOF )
            // InternalTocl.g:1799:2: iv_rulePropertyCallExp= rulePropertyCallExp EOF
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
    // InternalTocl.g:1805:1: rulePropertyCallExp returns [EObject current=null] : ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* ) ;
    public final EObject rulePropertyCallExp() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_calls_1_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:1811:2: ( ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* ) )
            // InternalTocl.g:1812:2: ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* )
            {
            // InternalTocl.g:1812:2: ( ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )* )
            // InternalTocl.g:1813:3: ( (lv_source_0_0= rulePrimary_OclExpression ) ) ( (lv_calls_1_0= rulePropertyCall ) )*
            {
            // InternalTocl.g:1813:3: ( (lv_source_0_0= rulePrimary_OclExpression ) )
            // InternalTocl.g:1814:4: (lv_source_0_0= rulePrimary_OclExpression )
            {
            // InternalTocl.g:1814:4: (lv_source_0_0= rulePrimary_OclExpression )
            // InternalTocl.g:1815:5: lv_source_0_0= rulePrimary_OclExpression
            {

            					newCompositeNode(grammarAccess.getPropertyCallExpAccess().getSourcePrimary_OclExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_source_0_0=rulePrimary_OclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyCallExpRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_0_0,
            						"fr.enseeiht.xtext.tocl.Tocl.Primary_OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTocl.g:1832:3: ( (lv_calls_1_0= rulePropertyCall ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=71 && LA26_0<=72)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalTocl.g:1833:4: (lv_calls_1_0= rulePropertyCall )
            	    {
            	    // InternalTocl.g:1833:4: (lv_calls_1_0= rulePropertyCall )
            	    // InternalTocl.g:1834:5: lv_calls_1_0= rulePropertyCall
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyCallExpAccess().getCallsPropertyCallParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_calls_1_0=rulePropertyCall();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyCallExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"calls",
            	    						lv_calls_1_0,
            	    						"fr.enseeiht.xtext.tocl.Tocl.PropertyCall");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalTocl.g:1855:1: entryRulePrimary_OclExpression returns [EObject current=null] : iv_rulePrimary_OclExpression= rulePrimary_OclExpression EOF ;
    public final EObject entryRulePrimary_OclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary_OclExpression = null;


        try {
            // InternalTocl.g:1855:62: (iv_rulePrimary_OclExpression= rulePrimary_OclExpression EOF )
            // InternalTocl.g:1856:2: iv_rulePrimary_OclExpression= rulePrimary_OclExpression EOF
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
    // InternalTocl.g:1862:1: rulePrimary_OclExpression returns [EObject current=null] : (this_VariableExp_0= ruleVariableExp | this_SuperExp_1= ruleSuperExp | this_SelfExp_2= ruleSelfExp | this_StringExp_3= ruleStringExp | this_BooleanExp_4= ruleBooleanExp | this_NumericExp_5= ruleNumericExp | this_BagExp_6= ruleBagExp | this_OrderedSetExp_7= ruleOrderedSetExp | this_SequenceExp_8= ruleSequenceExp | this_SetExp_9= ruleSetExp | this_TupleExp_10= ruleTupleExp | this_MapExp_11= ruleMapExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_OclUndefinedExp_13= ruleOclUndefinedExp | this_IfExp_14= ruleIfExp | this_BraceExp_15= ruleBraceExp | this_OclModelElementExp_16= ruleOclModelElementExp ) ;
    public final EObject rulePrimary_OclExpression() throws RecognitionException {
        EObject current = null;

        EObject this_VariableExp_0 = null;

        EObject this_SuperExp_1 = null;

        EObject this_SelfExp_2 = null;

        EObject this_StringExp_3 = null;

        EObject this_BooleanExp_4 = null;

        EObject this_NumericExp_5 = null;

        EObject this_BagExp_6 = null;

        EObject this_OrderedSetExp_7 = null;

        EObject this_SequenceExp_8 = null;

        EObject this_SetExp_9 = null;

        EObject this_TupleExp_10 = null;

        EObject this_MapExp_11 = null;

        EObject this_EnumLiteralExp_12 = null;

        EObject this_OclUndefinedExp_13 = null;

        EObject this_IfExp_14 = null;

        EObject this_BraceExp_15 = null;

        EObject this_OclModelElementExp_16 = null;



        	enterRule();

        try {
            // InternalTocl.g:1868:2: ( (this_VariableExp_0= ruleVariableExp | this_SuperExp_1= ruleSuperExp | this_SelfExp_2= ruleSelfExp | this_StringExp_3= ruleStringExp | this_BooleanExp_4= ruleBooleanExp | this_NumericExp_5= ruleNumericExp | this_BagExp_6= ruleBagExp | this_OrderedSetExp_7= ruleOrderedSetExp | this_SequenceExp_8= ruleSequenceExp | this_SetExp_9= ruleSetExp | this_TupleExp_10= ruleTupleExp | this_MapExp_11= ruleMapExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_OclUndefinedExp_13= ruleOclUndefinedExp | this_IfExp_14= ruleIfExp | this_BraceExp_15= ruleBraceExp | this_OclModelElementExp_16= ruleOclModelElementExp ) )
            // InternalTocl.g:1869:2: (this_VariableExp_0= ruleVariableExp | this_SuperExp_1= ruleSuperExp | this_SelfExp_2= ruleSelfExp | this_StringExp_3= ruleStringExp | this_BooleanExp_4= ruleBooleanExp | this_NumericExp_5= ruleNumericExp | this_BagExp_6= ruleBagExp | this_OrderedSetExp_7= ruleOrderedSetExp | this_SequenceExp_8= ruleSequenceExp | this_SetExp_9= ruleSetExp | this_TupleExp_10= ruleTupleExp | this_MapExp_11= ruleMapExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_OclUndefinedExp_13= ruleOclUndefinedExp | this_IfExp_14= ruleIfExp | this_BraceExp_15= ruleBraceExp | this_OclModelElementExp_16= ruleOclModelElementExp )
            {
            // InternalTocl.g:1869:2: (this_VariableExp_0= ruleVariableExp | this_SuperExp_1= ruleSuperExp | this_SelfExp_2= ruleSelfExp | this_StringExp_3= ruleStringExp | this_BooleanExp_4= ruleBooleanExp | this_NumericExp_5= ruleNumericExp | this_BagExp_6= ruleBagExp | this_OrderedSetExp_7= ruleOrderedSetExp | this_SequenceExp_8= ruleSequenceExp | this_SetExp_9= ruleSetExp | this_TupleExp_10= ruleTupleExp | this_MapExp_11= ruleMapExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_OclUndefinedExp_13= ruleOclUndefinedExp | this_IfExp_14= ruleIfExp | this_BraceExp_15= ruleBraceExp | this_OclModelElementExp_16= ruleOclModelElementExp )
            int alt27=17;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalTocl.g:1870:3: this_VariableExp_0= ruleVariableExp
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
                    // InternalTocl.g:1879:3: this_SuperExp_1= ruleSuperExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getSuperExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SuperExp_1=ruleSuperExp();

                    state._fsp--;


                    			current = this_SuperExp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTocl.g:1888:3: this_SelfExp_2= ruleSelfExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getSelfExpParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelfExp_2=ruleSelfExp();

                    state._fsp--;


                    			current = this_SelfExp_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTocl.g:1897:3: this_StringExp_3= ruleStringExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getStringExpParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringExp_3=ruleStringExp();

                    state._fsp--;


                    			current = this_StringExp_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTocl.g:1906:3: this_BooleanExp_4= ruleBooleanExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getBooleanExpParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanExp_4=ruleBooleanExp();

                    state._fsp--;


                    			current = this_BooleanExp_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTocl.g:1915:3: this_NumericExp_5= ruleNumericExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getNumericExpParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericExp_5=ruleNumericExp();

                    state._fsp--;


                    			current = this_NumericExp_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTocl.g:1924:3: this_BagExp_6= ruleBagExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getBagExpParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_BagExp_6=ruleBagExp();

                    state._fsp--;


                    			current = this_BagExp_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTocl.g:1933:3: this_OrderedSetExp_7= ruleOrderedSetExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getOrderedSetExpParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrderedSetExp_7=ruleOrderedSetExp();

                    state._fsp--;


                    			current = this_OrderedSetExp_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTocl.g:1942:3: this_SequenceExp_8= ruleSequenceExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getSequenceExpParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceExp_8=ruleSequenceExp();

                    state._fsp--;


                    			current = this_SequenceExp_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalTocl.g:1951:3: this_SetExp_9= ruleSetExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getSetExpParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetExp_9=ruleSetExp();

                    state._fsp--;


                    			current = this_SetExp_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalTocl.g:1960:3: this_TupleExp_10= ruleTupleExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getTupleExpParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_TupleExp_10=ruleTupleExp();

                    state._fsp--;


                    			current = this_TupleExp_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalTocl.g:1969:3: this_MapExp_11= ruleMapExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getMapExpParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_MapExp_11=ruleMapExp();

                    state._fsp--;


                    			current = this_MapExp_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalTocl.g:1978:3: this_EnumLiteralExp_12= ruleEnumLiteralExp
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
                    // InternalTocl.g:1987:3: this_OclUndefinedExp_13= ruleOclUndefinedExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getOclUndefinedExpParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_OclUndefinedExp_13=ruleOclUndefinedExp();

                    state._fsp--;


                    			current = this_OclUndefinedExp_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalTocl.g:1996:3: this_IfExp_14= ruleIfExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getIfExpParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfExp_14=ruleIfExp();

                    state._fsp--;


                    			current = this_IfExp_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalTocl.g:2005:3: this_BraceExp_15= ruleBraceExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getBraceExpParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_BraceExp_15=ruleBraceExp();

                    state._fsp--;


                    			current = this_BraceExp_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalTocl.g:2014:3: this_OclModelElementExp_16= ruleOclModelElementExp
                    {

                    			newCompositeNode(grammarAccess.getPrimary_OclExpressionAccess().getOclModelElementExpParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_OclModelElementExp_16=ruleOclModelElementExp();

                    state._fsp--;


                    			current = this_OclModelElementExp_16;
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
    // InternalTocl.g:2026:1: entryRuleVariableExp returns [EObject current=null] : iv_ruleVariableExp= ruleVariableExp EOF ;
    public final EObject entryRuleVariableExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExp = null;


        try {
            // InternalTocl.g:2026:52: (iv_ruleVariableExp= ruleVariableExp EOF )
            // InternalTocl.g:2027:2: iv_ruleVariableExp= ruleVariableExp EOF
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
    // InternalTocl.g:2033:1: ruleVariableExp returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_VariableDeclaration_1= ruleVariableDeclaration ) ;
    public final EObject ruleVariableExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_VariableDeclaration_1 = null;



        	enterRule();

        try {
            // InternalTocl.g:2039:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_VariableDeclaration_1= ruleVariableDeclaration ) )
            // InternalTocl.g:2040:2: ( ( (otherlv_0= RULE_ID ) ) | this_VariableDeclaration_1= ruleVariableDeclaration )
            {
            // InternalTocl.g:2040:2: ( ( (otherlv_0= RULE_ID ) ) | this_VariableDeclaration_1= ruleVariableDeclaration )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==50) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalTocl.g:2041:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalTocl.g:2041:3: ( (otherlv_0= RULE_ID ) )
                    // InternalTocl.g:2042:4: (otherlv_0= RULE_ID )
                    {
                    // InternalTocl.g:2042:4: (otherlv_0= RULE_ID )
                    // InternalTocl.g:2043:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableExpRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getVariableExpAccess().getReferredVariableAuxiliaryCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTocl.g:2055:3: this_VariableDeclaration_1= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getVariableExpAccess().getVariableDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_1=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_1;
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
    // $ANTLR end "ruleVariableExp"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTocl.g:2067:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalTocl.g:2067:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalTocl.g:2068:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalTocl.g:2074:1: ruleVariableDeclaration returns [EObject current=null] : ( (lv_varName_0_0= 'thisModule' ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;


        	enterRule();

        try {
            // InternalTocl.g:2080:2: ( ( (lv_varName_0_0= 'thisModule' ) ) )
            // InternalTocl.g:2081:2: ( (lv_varName_0_0= 'thisModule' ) )
            {
            // InternalTocl.g:2081:2: ( (lv_varName_0_0= 'thisModule' ) )
            // InternalTocl.g:2082:3: (lv_varName_0_0= 'thisModule' )
            {
            // InternalTocl.g:2082:3: (lv_varName_0_0= 'thisModule' )
            // InternalTocl.g:2083:4: lv_varName_0_0= 'thisModule'
            {
            lv_varName_0_0=(Token)match(input,50,FOLLOW_2); 

            				newLeafNode(lv_varName_0_0, grammarAccess.getVariableDeclarationAccess().getVarNameThisModuleKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableDeclarationRule());
            				}
            				setWithLastConsumed(current, "varName", lv_varName_0_0, "thisModule");
            			

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleSuperExp"
    // InternalTocl.g:2098:1: entryRuleSuperExp returns [EObject current=null] : iv_ruleSuperExp= ruleSuperExp EOF ;
    public final EObject entryRuleSuperExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperExp = null;


        try {
            // InternalTocl.g:2098:49: (iv_ruleSuperExp= ruleSuperExp EOF )
            // InternalTocl.g:2099:2: iv_ruleSuperExp= ruleSuperExp EOF
            {
             newCompositeNode(grammarAccess.getSuperExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperExp=ruleSuperExp();

            state._fsp--;

             current =iv_ruleSuperExp; 
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
    // $ANTLR end "entryRuleSuperExp"


    // $ANTLR start "ruleSuperExp"
    // InternalTocl.g:2105:1: ruleSuperExp returns [EObject current=null] : ( () otherlv_1= 'super' ) ;
    public final EObject ruleSuperExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTocl.g:2111:2: ( ( () otherlv_1= 'super' ) )
            // InternalTocl.g:2112:2: ( () otherlv_1= 'super' )
            {
            // InternalTocl.g:2112:2: ( () otherlv_1= 'super' )
            // InternalTocl.g:2113:3: () otherlv_1= 'super'
            {
            // InternalTocl.g:2113:3: ()
            // InternalTocl.g:2114:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSuperExpAccess().getSuperExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSuperExpAccess().getSuperKeyword_1());
            		

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
    // $ANTLR end "ruleSuperExp"


    // $ANTLR start "entryRuleSelfExp"
    // InternalTocl.g:2128:1: entryRuleSelfExp returns [EObject current=null] : iv_ruleSelfExp= ruleSelfExp EOF ;
    public final EObject entryRuleSelfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExp = null;


        try {
            // InternalTocl.g:2128:48: (iv_ruleSelfExp= ruleSelfExp EOF )
            // InternalTocl.g:2129:2: iv_ruleSelfExp= ruleSelfExp EOF
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
    // InternalTocl.g:2135:1: ruleSelfExp returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTocl.g:2141:2: ( ( () otherlv_1= 'self' ) )
            // InternalTocl.g:2142:2: ( () otherlv_1= 'self' )
            {
            // InternalTocl.g:2142:2: ( () otherlv_1= 'self' )
            // InternalTocl.g:2143:3: () otherlv_1= 'self'
            {
            // InternalTocl.g:2143:3: ()
            // InternalTocl.g:2144:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelfExpAccess().getSelfExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_2); 

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
    // InternalTocl.g:2158:1: entryRuleStringExp returns [EObject current=null] : iv_ruleStringExp= ruleStringExp EOF ;
    public final EObject entryRuleStringExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExp = null;


        try {
            // InternalTocl.g:2158:50: (iv_ruleStringExp= ruleStringExp EOF )
            // InternalTocl.g:2159:2: iv_ruleStringExp= ruleStringExp EOF
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
    // InternalTocl.g:2165:1: ruleStringExp returns [EObject current=null] : ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringExp() throws RecognitionException {
        EObject current = null;

        Token lv_stringSymbol_1_0=null;


        	enterRule();

        try {
            // InternalTocl.g:2171:2: ( ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) ) )
            // InternalTocl.g:2172:2: ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) )
            {
            // InternalTocl.g:2172:2: ( () ( (lv_stringSymbol_1_0= RULE_STRING ) ) )
            // InternalTocl.g:2173:3: () ( (lv_stringSymbol_1_0= RULE_STRING ) )
            {
            // InternalTocl.g:2173:3: ()
            // InternalTocl.g:2174:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringExpAccess().getStringExpAction_0(),
            					current);
            			

            }

            // InternalTocl.g:2180:3: ( (lv_stringSymbol_1_0= RULE_STRING ) )
            // InternalTocl.g:2181:4: (lv_stringSymbol_1_0= RULE_STRING )
            {
            // InternalTocl.g:2181:4: (lv_stringSymbol_1_0= RULE_STRING )
            // InternalTocl.g:2182:5: lv_stringSymbol_1_0= RULE_STRING
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
    // InternalTocl.g:2202:1: entryRuleNumericExp returns [EObject current=null] : iv_ruleNumericExp= ruleNumericExp EOF ;
    public final EObject entryRuleNumericExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericExp = null;


        try {
            // InternalTocl.g:2202:51: (iv_ruleNumericExp= ruleNumericExp EOF )
            // InternalTocl.g:2203:2: iv_ruleNumericExp= ruleNumericExp EOF
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
    // InternalTocl.g:2209:1: ruleNumericExp returns [EObject current=null] : (this_RealExp_0= ruleRealExp | this_IntegerExp_1= ruleIntegerExp ) ;
    public final EObject ruleNumericExp() throws RecognitionException {
        EObject current = null;

        EObject this_RealExp_0 = null;

        EObject this_IntegerExp_1 = null;



        	enterRule();

        try {
            // InternalTocl.g:2215:2: ( (this_RealExp_0= ruleRealExp | this_IntegerExp_1= ruleIntegerExp ) )
            // InternalTocl.g:2216:2: (this_RealExp_0= ruleRealExp | this_IntegerExp_1= ruleIntegerExp )
            {
            // InternalTocl.g:2216:2: (this_RealExp_0= ruleRealExp | this_IntegerExp_1= ruleIntegerExp )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_DOUBLE) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_INT) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalTocl.g:2217:3: this_RealExp_0= ruleRealExp
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
                    // InternalTocl.g:2226:3: this_IntegerExp_1= ruleIntegerExp
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
    // InternalTocl.g:2238:1: entryRuleRealExp returns [EObject current=null] : iv_ruleRealExp= ruleRealExp EOF ;
    public final EObject entryRuleRealExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealExp = null;


        try {
            // InternalTocl.g:2238:48: (iv_ruleRealExp= ruleRealExp EOF )
            // InternalTocl.g:2239:2: iv_ruleRealExp= ruleRealExp EOF
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
    // InternalTocl.g:2245:1: ruleRealExp returns [EObject current=null] : ( (lv_realSymbol_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleRealExp() throws RecognitionException {
        EObject current = null;

        Token lv_realSymbol_0_0=null;


        	enterRule();

        try {
            // InternalTocl.g:2251:2: ( ( (lv_realSymbol_0_0= RULE_DOUBLE ) ) )
            // InternalTocl.g:2252:2: ( (lv_realSymbol_0_0= RULE_DOUBLE ) )
            {
            // InternalTocl.g:2252:2: ( (lv_realSymbol_0_0= RULE_DOUBLE ) )
            // InternalTocl.g:2253:3: (lv_realSymbol_0_0= RULE_DOUBLE )
            {
            // InternalTocl.g:2253:3: (lv_realSymbol_0_0= RULE_DOUBLE )
            // InternalTocl.g:2254:4: lv_realSymbol_0_0= RULE_DOUBLE
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
            					"fr.enseeiht.xtext.tocl.Tocl.DOUBLE");
            			

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
    // InternalTocl.g:2273:1: entryRuleIntegerExp returns [EObject current=null] : iv_ruleIntegerExp= ruleIntegerExp EOF ;
    public final EObject entryRuleIntegerExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExp = null;


        try {
            // InternalTocl.g:2273:51: (iv_ruleIntegerExp= ruleIntegerExp EOF )
            // InternalTocl.g:2274:2: iv_ruleIntegerExp= ruleIntegerExp EOF
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
    // InternalTocl.g:2280:1: ruleIntegerExp returns [EObject current=null] : ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerExp() throws RecognitionException {
        EObject current = null;

        Token lv_integerSymbol_1_0=null;


        	enterRule();

        try {
            // InternalTocl.g:2286:2: ( ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) ) )
            // InternalTocl.g:2287:2: ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) )
            {
            // InternalTocl.g:2287:2: ( () ( (lv_integerSymbol_1_0= RULE_INT ) ) )
            // InternalTocl.g:2288:3: () ( (lv_integerSymbol_1_0= RULE_INT ) )
            {
            // InternalTocl.g:2288:3: ()
            // InternalTocl.g:2289:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerExpAccess().getIntegerExpAction_0(),
            					current);
            			

            }

            // InternalTocl.g:2295:3: ( (lv_integerSymbol_1_0= RULE_INT ) )
            // InternalTocl.g:2296:4: (lv_integerSymbol_1_0= RULE_INT )
            {
            // InternalTocl.g:2296:4: (lv_integerSymbol_1_0= RULE_INT )
            // InternalTocl.g:2297:5: lv_integerSymbol_1_0= RULE_INT
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
    // InternalTocl.g:2317:1: entryRuleBagExp returns [EObject current=null] : iv_ruleBagExp= ruleBagExp EOF ;
    public final EObject entryRuleBagExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagExp = null;


        try {
            // InternalTocl.g:2317:47: (iv_ruleBagExp= ruleBagExp EOF )
            // InternalTocl.g:2318:2: iv_ruleBagExp= ruleBagExp EOF
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
    // InternalTocl.g:2324:1: ruleBagExp returns [EObject current=null] : ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalTocl.g:2330:2: ( ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalTocl.g:2331:2: ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalTocl.g:2331:2: ( () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalTocl.g:2332:3: () otherlv_1= 'Bag' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalTocl.g:2332:3: ()
            // InternalTocl.g:2333:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBagExpAccess().getBagExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getBagExpAccess().getBagKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getBagExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTocl.g:2347:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_INT)||LA31_0==22||(LA31_0>=44 && LA31_0<=53)||(LA31_0>=56 && LA31_0<=63)||LA31_0==65||(LA31_0>=69 && LA31_0<=70)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTocl.g:2348:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalTocl.g:2348:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalTocl.g:2349:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalTocl.g:2349:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalTocl.g:2350:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getBagExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_elements_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBagExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTocl.g:2367:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==23) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalTocl.g:2368:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getBagExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTocl.g:2372:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalTocl.g:2373:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalTocl.g:2373:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalTocl.g:2374:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getBagExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_elements_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBagExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_5_0,
                    	    								"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
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

            otherlv_6=(Token)match(input,55,FOLLOW_2); 

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
    // InternalTocl.g:2401:1: entryRuleOrderedSetExp returns [EObject current=null] : iv_ruleOrderedSetExp= ruleOrderedSetExp EOF ;
    public final EObject entryRuleOrderedSetExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedSetExp = null;


        try {
            // InternalTocl.g:2401:54: (iv_ruleOrderedSetExp= ruleOrderedSetExp EOF )
            // InternalTocl.g:2402:2: iv_ruleOrderedSetExp= ruleOrderedSetExp EOF
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
    // InternalTocl.g:2408:1: ruleOrderedSetExp returns [EObject current=null] : ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalTocl.g:2414:2: ( ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalTocl.g:2415:2: ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalTocl.g:2415:2: ( () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalTocl.g:2416:3: () otherlv_1= 'OrderedSet' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalTocl.g:2416:3: ()
            // InternalTocl.g:2417:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrderedSetExpAccess().getOrderedSetExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderedSetExpAccess().getOrderedSetKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getOrderedSetExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTocl.g:2431:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_INT)||LA33_0==22||(LA33_0>=44 && LA33_0<=53)||(LA33_0>=56 && LA33_0<=63)||LA33_0==65||(LA33_0>=69 && LA33_0<=70)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTocl.g:2432:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalTocl.g:2432:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalTocl.g:2433:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalTocl.g:2433:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalTocl.g:2434:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getOrderedSetExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_elements_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrderedSetExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTocl.g:2451:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==23) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalTocl.g:2452:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOrderedSetExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTocl.g:2456:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalTocl.g:2457:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalTocl.g:2457:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalTocl.g:2458:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getOrderedSetExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_elements_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOrderedSetExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_5_0,
                    	    								"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
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

            otherlv_6=(Token)match(input,55,FOLLOW_2); 

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
    // InternalTocl.g:2485:1: entryRuleSequenceExp returns [EObject current=null] : iv_ruleSequenceExp= ruleSequenceExp EOF ;
    public final EObject entryRuleSequenceExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceExp = null;


        try {
            // InternalTocl.g:2485:52: (iv_ruleSequenceExp= ruleSequenceExp EOF )
            // InternalTocl.g:2486:2: iv_ruleSequenceExp= ruleSequenceExp EOF
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
    // InternalTocl.g:2492:1: ruleSequenceExp returns [EObject current=null] : ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalTocl.g:2498:2: ( ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalTocl.g:2499:2: ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalTocl.g:2499:2: ( () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalTocl.g:2500:3: () otherlv_1= 'Sequence' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalTocl.g:2500:3: ()
            // InternalTocl.g:2501:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceExpAccess().getSequenceExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceExpAccess().getSequenceKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTocl.g:2515:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_INT)||LA35_0==22||(LA35_0>=44 && LA35_0<=53)||(LA35_0>=56 && LA35_0<=63)||LA35_0==65||(LA35_0>=69 && LA35_0<=70)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTocl.g:2516:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalTocl.g:2516:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalTocl.g:2517:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalTocl.g:2517:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalTocl.g:2518:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_elements_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTocl.g:2535:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==23) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalTocl.g:2536:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSequenceExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTocl.g:2540:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalTocl.g:2541:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalTocl.g:2541:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalTocl.g:2542:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_elements_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_5_0,
                    	    								"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
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

            otherlv_6=(Token)match(input,55,FOLLOW_2); 

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
    // InternalTocl.g:2569:1: entryRuleSetExp returns [EObject current=null] : iv_ruleSetExp= ruleSetExp EOF ;
    public final EObject entryRuleSetExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetExp = null;


        try {
            // InternalTocl.g:2569:47: (iv_ruleSetExp= ruleSetExp EOF )
            // InternalTocl.g:2570:2: iv_ruleSetExp= ruleSetExp EOF
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
    // InternalTocl.g:2576:1: ruleSetExp returns [EObject current=null] : ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalTocl.g:2582:2: ( ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalTocl.g:2583:2: ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalTocl.g:2583:2: ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}' )
            // InternalTocl.g:2584:3: () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalTocl.g:2584:3: ()
            // InternalTocl.g:2585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetExpAccess().getSetExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getSetExpAccess().getSetKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getSetExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTocl.g:2599:3: ( ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_INT)||LA37_0==22||(LA37_0>=44 && LA37_0<=53)||(LA37_0>=56 && LA37_0<=63)||LA37_0==65||(LA37_0>=69 && LA37_0<=70)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTocl.g:2600:4: ( (lv_elements_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalTocl.g:2600:4: ( (lv_elements_3_0= ruleOclExpression ) )
                    // InternalTocl.g:2601:5: (lv_elements_3_0= ruleOclExpression )
                    {
                    // InternalTocl.g:2601:5: (lv_elements_3_0= ruleOclExpression )
                    // InternalTocl.g:2602:6: lv_elements_3_0= ruleOclExpression
                    {

                    						newCompositeNode(grammarAccess.getSetExpAccess().getElementsOclExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_elements_3_0=ruleOclExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTocl.g:2619:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==23) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalTocl.g:2620:5: otherlv_4= ',' ( (lv_elements_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSetExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTocl.g:2624:5: ( (lv_elements_5_0= ruleOclExpression ) )
                    	    // InternalTocl.g:2625:6: (lv_elements_5_0= ruleOclExpression )
                    	    {
                    	    // InternalTocl.g:2625:6: (lv_elements_5_0= ruleOclExpression )
                    	    // InternalTocl.g:2626:7: lv_elements_5_0= ruleOclExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSetExpAccess().getElementsOclExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_elements_5_0=ruleOclExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSetExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_5_0,
                    	    								"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
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

            otherlv_6=(Token)match(input,55,FOLLOW_2); 

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
    // InternalTocl.g:2653:1: entryRuleTupleExp returns [EObject current=null] : iv_ruleTupleExp= ruleTupleExp EOF ;
    public final EObject entryRuleTupleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleExp = null;


        try {
            // InternalTocl.g:2653:49: (iv_ruleTupleExp= ruleTupleExp EOF )
            // InternalTocl.g:2654:2: iv_ruleTupleExp= ruleTupleExp EOF
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
    // InternalTocl.g:2660:1: ruleTupleExp returns [EObject current=null] : ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalTocl.g:2666:2: ( ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' ) )
            // InternalTocl.g:2667:2: ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' )
            {
            // InternalTocl.g:2667:2: ( () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}' )
            // InternalTocl.g:2668:3: () otherlv_1= 'Tuple' otherlv_2= '{' ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )? otherlv_6= '}'
            {
            // InternalTocl.g:2668:3: ()
            // InternalTocl.g:2669:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTupleExpAccess().getTupleExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleExpAccess().getTupleKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getTupleExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTocl.g:2683:3: ( ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalTocl.g:2684:4: ( (lv_tuplePart_3_0= ruleTuplePart ) ) (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )*
                    {
                    // InternalTocl.g:2684:4: ( (lv_tuplePart_3_0= ruleTuplePart ) )
                    // InternalTocl.g:2685:5: (lv_tuplePart_3_0= ruleTuplePart )
                    {
                    // InternalTocl.g:2685:5: (lv_tuplePart_3_0= ruleTuplePart )
                    // InternalTocl.g:2686:6: lv_tuplePart_3_0= ruleTuplePart
                    {

                    						newCompositeNode(grammarAccess.getTupleExpAccess().getTuplePartTuplePartParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_tuplePart_3_0=ruleTuplePart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTupleExpRule());
                    						}
                    						add(
                    							current,
                    							"tuplePart",
                    							lv_tuplePart_3_0,
                    							"fr.enseeiht.xtext.tocl.Tocl.TuplePart");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTocl.g:2703:4: (otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==23) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalTocl.g:2704:5: otherlv_4= ',' ( (lv_tuplePart_5_0= ruleTuplePart ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTupleExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTocl.g:2708:5: ( (lv_tuplePart_5_0= ruleTuplePart ) )
                    	    // InternalTocl.g:2709:6: (lv_tuplePart_5_0= ruleTuplePart )
                    	    {
                    	    // InternalTocl.g:2709:6: (lv_tuplePart_5_0= ruleTuplePart )
                    	    // InternalTocl.g:2710:7: lv_tuplePart_5_0= ruleTuplePart
                    	    {

                    	    							newCompositeNode(grammarAccess.getTupleExpAccess().getTuplePartTuplePartParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_tuplePart_5_0=ruleTuplePart();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTupleExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tuplePart",
                    	    								lv_tuplePart_5_0,
                    	    								"fr.enseeiht.xtext.tocl.Tocl.TuplePart");
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

            otherlv_6=(Token)match(input,55,FOLLOW_2); 

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
    // InternalTocl.g:2737:1: entryRuleTuplePart returns [EObject current=null] : iv_ruleTuplePart= ruleTuplePart EOF ;
    public final EObject entryRuleTuplePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePart = null;


        try {
            // InternalTocl.g:2737:50: (iv_ruleTuplePart= ruleTuplePart EOF )
            // InternalTocl.g:2738:2: iv_ruleTuplePart= ruleTuplePart EOF
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
    // InternalTocl.g:2744:1: ruleTuplePart returns [EObject current=null] : ( ( (lv_varName_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) ;
    public final EObject ruleTuplePart() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:2750:2: ( ( ( (lv_varName_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) )
            // InternalTocl.g:2751:2: ( ( (lv_varName_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            {
            // InternalTocl.g:2751:2: ( ( (lv_varName_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            // InternalTocl.g:2752:3: ( (lv_varName_0_0= RULE_STRING ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) )
            {
            // InternalTocl.g:2752:3: ( (lv_varName_0_0= RULE_STRING ) )
            // InternalTocl.g:2753:4: (lv_varName_0_0= RULE_STRING )
            {
            // InternalTocl.g:2753:4: (lv_varName_0_0= RULE_STRING )
            // InternalTocl.g:2754:5: lv_varName_0_0= RULE_STRING
            {
            lv_varName_0_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

            // InternalTocl.g:2770:3: (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==20) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTocl.g:2771:4: otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getTuplePartAccess().getColonKeyword_1_0());
                    			
                    // InternalTocl.g:2775:4: ( (lv_type_2_0= ruleOclType ) )
                    // InternalTocl.g:2776:5: (lv_type_2_0= ruleOclType )
                    {
                    // InternalTocl.g:2776:5: (lv_type_2_0= ruleOclType )
                    // InternalTocl.g:2777:6: lv_type_2_0= ruleOclType
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
                    							"fr.enseeiht.xtext.tocl.Tocl.OclType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getTuplePartAccess().getEqualsSignKeyword_2());
            		
            // InternalTocl.g:2799:3: ( (lv_initExpression_4_0= ruleOclExpression ) )
            // InternalTocl.g:2800:4: (lv_initExpression_4_0= ruleOclExpression )
            {
            // InternalTocl.g:2800:4: (lv_initExpression_4_0= ruleOclExpression )
            // InternalTocl.g:2801:5: lv_initExpression_4_0= ruleOclExpression
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
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
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
    // InternalTocl.g:2822:1: entryRuleMapExp returns [EObject current=null] : iv_ruleMapExp= ruleMapExp EOF ;
    public final EObject entryRuleMapExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapExp = null;


        try {
            // InternalTocl.g:2822:47: (iv_ruleMapExp= ruleMapExp EOF )
            // InternalTocl.g:2823:2: iv_ruleMapExp= ruleMapExp EOF
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
    // InternalTocl.g:2829:1: ruleMapExp returns [EObject current=null] : ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalTocl.g:2835:2: ( ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' ) )
            // InternalTocl.g:2836:2: ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' )
            {
            // InternalTocl.g:2836:2: ( () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}' )
            // InternalTocl.g:2837:3: () otherlv_1= 'Map' otherlv_2= '{' ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )? otherlv_6= '}'
            {
            // InternalTocl.g:2837:3: ()
            // InternalTocl.g:2838:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapExpAccess().getMapExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getMapExpAccess().getMapKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getMapExpAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTocl.g:2852:3: ( ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==22) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTocl.g:2853:4: ( (lv_elements_3_0= ruleMapElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )*
                    {
                    // InternalTocl.g:2853:4: ( (lv_elements_3_0= ruleMapElement ) )
                    // InternalTocl.g:2854:5: (lv_elements_3_0= ruleMapElement )
                    {
                    // InternalTocl.g:2854:5: (lv_elements_3_0= ruleMapElement )
                    // InternalTocl.g:2855:6: lv_elements_3_0= ruleMapElement
                    {

                    						newCompositeNode(grammarAccess.getMapExpAccess().getElementsMapElementParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_elements_3_0=ruleMapElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMapExpRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_3_0,
                    							"fr.enseeiht.xtext.tocl.Tocl.MapElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTocl.g:2872:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==23) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalTocl.g:2873:5: otherlv_4= ',' ( (lv_elements_5_0= ruleMapElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_16); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMapExpAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTocl.g:2877:5: ( (lv_elements_5_0= ruleMapElement ) )
                    	    // InternalTocl.g:2878:6: (lv_elements_5_0= ruleMapElement )
                    	    {
                    	    // InternalTocl.g:2878:6: (lv_elements_5_0= ruleMapElement )
                    	    // InternalTocl.g:2879:7: lv_elements_5_0= ruleMapElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMapExpAccess().getElementsMapElementParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_elements_5_0=ruleMapElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMapExpRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_5_0,
                    	    								"fr.enseeiht.xtext.tocl.Tocl.MapElement");
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

            otherlv_6=(Token)match(input,55,FOLLOW_2); 

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
    // InternalTocl.g:2906:1: entryRuleMapElement returns [EObject current=null] : iv_ruleMapElement= ruleMapElement EOF ;
    public final EObject entryRuleMapElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapElement = null;


        try {
            // InternalTocl.g:2906:51: (iv_ruleMapElement= ruleMapElement EOF )
            // InternalTocl.g:2907:2: iv_ruleMapElement= ruleMapElement EOF
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
    // InternalTocl.g:2913:1: ruleMapElement returns [EObject current=null] : (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMapElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_key_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:2919:2: ( (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' ) )
            // InternalTocl.g:2920:2: (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' )
            {
            // InternalTocl.g:2920:2: (otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')' )
            // InternalTocl.g:2921:3: otherlv_0= '(' ( (lv_key_1_0= ruleOclExpression ) ) otherlv_2= ',' ( (lv_value_3_0= ruleOclExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMapElementAccess().getLeftParenthesisKeyword_0());
            		
            // InternalTocl.g:2925:3: ( (lv_key_1_0= ruleOclExpression ) )
            // InternalTocl.g:2926:4: (lv_key_1_0= ruleOclExpression )
            {
            // InternalTocl.g:2926:4: (lv_key_1_0= ruleOclExpression )
            // InternalTocl.g:2927:5: lv_key_1_0= ruleOclExpression
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
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMapElementAccess().getCommaKeyword_2());
            		
            // InternalTocl.g:2948:3: ( (lv_value_3_0= ruleOclExpression ) )
            // InternalTocl.g:2949:4: (lv_value_3_0= ruleOclExpression )
            {
            // InternalTocl.g:2949:4: (lv_value_3_0= ruleOclExpression )
            // InternalTocl.g:2950:5: lv_value_3_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getMapElementAccess().getValueOclExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_value_3_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapElementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

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
    // InternalTocl.g:2975:1: entryRuleEnumLiteralExp returns [EObject current=null] : iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF ;
    public final EObject entryRuleEnumLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralExp = null;


        try {
            // InternalTocl.g:2975:55: (iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF )
            // InternalTocl.g:2976:2: iv_ruleEnumLiteralExp= ruleEnumLiteralExp EOF
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
    // InternalTocl.g:2982:1: ruleEnumLiteralExp returns [EObject current=null] : (otherlv_0= '#' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleEnumLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalTocl.g:2988:2: ( (otherlv_0= '#' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ) )
            // InternalTocl.g:2989:2: (otherlv_0= '#' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            {
            // InternalTocl.g:2989:2: (otherlv_0= '#' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalTocl.g:2990:3: otherlv_0= '#' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumLiteralExpAccess().getNumberSignKeyword_0());
            		
            // InternalTocl.g:2994:3: ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) )
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
                    // InternalTocl.g:2995:4: ( (lv_name_1_0= RULE_STRING ) )
                    {
                    // InternalTocl.g:2995:4: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalTocl.g:2996:5: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalTocl.g:2996:5: (lv_name_1_0= RULE_STRING )
                    // InternalTocl.g:2997:6: lv_name_1_0= RULE_STRING
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
                    // InternalTocl.g:3014:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalTocl.g:3014:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalTocl.g:3015:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalTocl.g:3015:5: (lv_name_2_0= RULE_ID )
                    // InternalTocl.g:3016:6: lv_name_2_0= RULE_ID
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


    // $ANTLR start "entryRuleOclUndefinedExp"
    // InternalTocl.g:3037:1: entryRuleOclUndefinedExp returns [EObject current=null] : iv_ruleOclUndefinedExp= ruleOclUndefinedExp EOF ;
    public final EObject entryRuleOclUndefinedExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclUndefinedExp = null;


        try {
            // InternalTocl.g:3037:56: (iv_ruleOclUndefinedExp= ruleOclUndefinedExp EOF )
            // InternalTocl.g:3038:2: iv_ruleOclUndefinedExp= ruleOclUndefinedExp EOF
            {
             newCompositeNode(grammarAccess.getOclUndefinedExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclUndefinedExp=ruleOclUndefinedExp();

            state._fsp--;

             current =iv_ruleOclUndefinedExp; 
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
    // $ANTLR end "entryRuleOclUndefinedExp"


    // $ANTLR start "ruleOclUndefinedExp"
    // InternalTocl.g:3044:1: ruleOclUndefinedExp returns [EObject current=null] : ( () otherlv_1= 'OclUndefined' ) ;
    public final EObject ruleOclUndefinedExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTocl.g:3050:2: ( ( () otherlv_1= 'OclUndefined' ) )
            // InternalTocl.g:3051:2: ( () otherlv_1= 'OclUndefined' )
            {
            // InternalTocl.g:3051:2: ( () otherlv_1= 'OclUndefined' )
            // InternalTocl.g:3052:3: () otherlv_1= 'OclUndefined'
            {
            // InternalTocl.g:3052:3: ()
            // InternalTocl.g:3053:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOclUndefinedExpAccess().getOclUndefinedExpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getOclUndefinedExpAccess().getOclUndefinedKeyword_1());
            		

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
    // $ANTLR end "ruleOclUndefinedExp"


    // $ANTLR start "entryRuleLetExp"
    // InternalTocl.g:3067:1: entryRuleLetExp returns [EObject current=null] : iv_ruleLetExp= ruleLetExp EOF ;
    public final EObject entryRuleLetExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExp = null;


        try {
            // InternalTocl.g:3067:47: (iv_ruleLetExp= ruleLetExp EOF )
            // InternalTocl.g:3068:2: iv_ruleLetExp= ruleLetExp EOF
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
    // InternalTocl.g:3074:1: ruleLetExp returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) ) ;
    public final EObject ruleLetExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_in__3_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:3080:2: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) ) )
            // InternalTocl.g:3081:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) )
            {
            // InternalTocl.g:3081:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) ) )
            // InternalTocl.g:3082:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLocalVariable ) ) otherlv_2= 'in' ( (lv_in__3_0= ruleOclExpression ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetExpAccess().getLetKeyword_0());
            		
            // InternalTocl.g:3086:3: ( (lv_variable_1_0= ruleLocalVariable ) )
            // InternalTocl.g:3087:4: (lv_variable_1_0= ruleLocalVariable )
            {
            // InternalTocl.g:3087:4: (lv_variable_1_0= ruleLocalVariable )
            // InternalTocl.g:3088:5: lv_variable_1_0= ruleLocalVariable
            {

            					newCompositeNode(grammarAccess.getLetExpAccess().getVariableLocalVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_variable_1_0=ruleLocalVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetExpRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"fr.enseeiht.xtext.tocl.Tocl.LocalVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,64,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getLetExpAccess().getInKeyword_2());
            		
            // InternalTocl.g:3109:3: ( (lv_in__3_0= ruleOclExpression ) )
            // InternalTocl.g:3110:4: (lv_in__3_0= ruleOclExpression )
            {
            // InternalTocl.g:3110:4: (lv_in__3_0= ruleOclExpression )
            // InternalTocl.g:3111:5: lv_in__3_0= ruleOclExpression
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
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
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
    // InternalTocl.g:3132:1: entryRuleIfExp returns [EObject current=null] : iv_ruleIfExp= ruleIfExp EOF ;
    public final EObject entryRuleIfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExp = null;


        try {
            // InternalTocl.g:3132:46: (iv_ruleIfExp= ruleIfExp EOF )
            // InternalTocl.g:3133:2: iv_ruleIfExp= ruleIfExp EOF
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
    // InternalTocl.g:3139:1: ruleIfExp returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) ;
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
            // InternalTocl.g:3145:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) )
            // InternalTocl.g:3146:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            {
            // InternalTocl.g:3146:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            // InternalTocl.g:3147:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpAccess().getIfKeyword_0());
            		
            // InternalTocl.g:3151:3: ( (lv_condition_1_0= ruleOclExpression ) )
            // InternalTocl.g:3152:4: (lv_condition_1_0= ruleOclExpression )
            {
            // InternalTocl.g:3152:4: (lv_condition_1_0= ruleOclExpression )
            // InternalTocl.g:3153:5: lv_condition_1_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIfExpAccess().getConditionOclExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_condition_1_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,66,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getIfExpAccess().getThenKeyword_2());
            		
            // InternalTocl.g:3174:3: ( (lv_thenExpression_3_0= ruleOclExpression ) )
            // InternalTocl.g:3175:4: (lv_thenExpression_3_0= ruleOclExpression )
            {
            // InternalTocl.g:3175:4: (lv_thenExpression_3_0= ruleOclExpression )
            // InternalTocl.g:3176:5: lv_thenExpression_3_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIfExpAccess().getThenExpressionOclExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_40);
            lv_thenExpression_3_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpRule());
            					}
            					set(
            						current,
            						"thenExpression",
            						lv_thenExpression_3_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,67,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpAccess().getElseKeyword_4());
            		
            // InternalTocl.g:3197:3: ( (lv_elseExpression_5_0= ruleOclExpression ) )
            // InternalTocl.g:3198:4: (lv_elseExpression_5_0= ruleOclExpression )
            {
            // InternalTocl.g:3198:4: (lv_elseExpression_5_0= ruleOclExpression )
            // InternalTocl.g:3199:5: lv_elseExpression_5_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIfExpAccess().getElseExpressionOclExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_41);
            lv_elseExpression_5_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfExpRule());
            					}
            					set(
            						current,
            						"elseExpression",
            						lv_elseExpression_5_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,68,FOLLOW_2); 

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
    // InternalTocl.g:3224:1: entryRuleBraceExp returns [EObject current=null] : iv_ruleBraceExp= ruleBraceExp EOF ;
    public final EObject entryRuleBraceExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBraceExp = null;


        try {
            // InternalTocl.g:3224:49: (iv_ruleBraceExp= ruleBraceExp EOF )
            // InternalTocl.g:3225:2: iv_ruleBraceExp= ruleBraceExp EOF
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
    // InternalTocl.g:3231:1: ruleBraceExp returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBraceExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:3237:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' ) )
            // InternalTocl.g:3238:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' )
            {
            // InternalTocl.g:3238:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')' )
            // InternalTocl.g:3239:3: otherlv_0= '(' ( (lv_exp_1_0= ruleOclExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getBraceExpAccess().getLeftParenthesisKeyword_0());
            		
            // InternalTocl.g:3243:3: ( (lv_exp_1_0= ruleOclExpression ) )
            // InternalTocl.g:3244:4: (lv_exp_1_0= ruleOclExpression )
            {
            // InternalTocl.g:3244:4: (lv_exp_1_0= ruleOclExpression )
            // InternalTocl.g:3245:5: lv_exp_1_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getBraceExpAccess().getExpOclExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_exp_1_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBraceExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

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
    // InternalTocl.g:3270:1: entryRuleBooleanExp returns [EObject current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final EObject entryRuleBooleanExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExp = null;


        try {
            // InternalTocl.g:3270:51: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // InternalTocl.g:3271:2: iv_ruleBooleanExp= ruleBooleanExp EOF
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
    // InternalTocl.g:3277:1: ruleBooleanExp returns [EObject current=null] : ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanExp() throws RecognitionException {
        EObject current = null;

        Token lv_booleanSymbol_0_0=null;
        Token lv_booleanSymbol_1_0=null;


        	enterRule();

        try {
            // InternalTocl.g:3283:2: ( ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) ) )
            // InternalTocl.g:3284:2: ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) )
            {
            // InternalTocl.g:3284:2: ( ( (lv_booleanSymbol_0_0= 'true' ) ) | ( (lv_booleanSymbol_1_0= 'false' ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==69) ) {
                alt44=1;
            }
            else if ( (LA44_0==70) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalTocl.g:3285:3: ( (lv_booleanSymbol_0_0= 'true' ) )
                    {
                    // InternalTocl.g:3285:3: ( (lv_booleanSymbol_0_0= 'true' ) )
                    // InternalTocl.g:3286:4: (lv_booleanSymbol_0_0= 'true' )
                    {
                    // InternalTocl.g:3286:4: (lv_booleanSymbol_0_0= 'true' )
                    // InternalTocl.g:3287:5: lv_booleanSymbol_0_0= 'true'
                    {
                    lv_booleanSymbol_0_0=(Token)match(input,69,FOLLOW_2); 

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
                    // InternalTocl.g:3300:3: ( (lv_booleanSymbol_1_0= 'false' ) )
                    {
                    // InternalTocl.g:3300:3: ( (lv_booleanSymbol_1_0= 'false' ) )
                    // InternalTocl.g:3301:4: (lv_booleanSymbol_1_0= 'false' )
                    {
                    // InternalTocl.g:3301:4: (lv_booleanSymbol_1_0= 'false' )
                    // InternalTocl.g:3302:5: lv_booleanSymbol_1_0= 'false'
                    {
                    lv_booleanSymbol_1_0=(Token)match(input,70,FOLLOW_2); 

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
    // InternalTocl.g:3318:1: entryRulePropertyCall returns [EObject current=null] : iv_rulePropertyCall= rulePropertyCall EOF ;
    public final EObject entryRulePropertyCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCall = null;


        try {
            // InternalTocl.g:3318:53: (iv_rulePropertyCall= rulePropertyCall EOF )
            // InternalTocl.g:3319:2: iv_rulePropertyCall= rulePropertyCall EOF
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
    // InternalTocl.g:3325:1: rulePropertyCall returns [EObject current=null] : (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp | this_CollectionOperationCall_4= ruleCollectionOperationCall ) ;
    public final EObject rulePropertyCall() throws RecognitionException {
        EObject current = null;

        EObject this_OperationCall_0 = null;

        EObject this_NavigationOrAttributeCall_1 = null;

        EObject this_IterateExp_2 = null;

        EObject this_IteratorExp_3 = null;

        EObject this_CollectionOperationCall_4 = null;



        	enterRule();

        try {
            // InternalTocl.g:3331:2: ( (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp | this_CollectionOperationCall_4= ruleCollectionOperationCall ) )
            // InternalTocl.g:3332:2: (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp | this_CollectionOperationCall_4= ruleCollectionOperationCall )
            {
            // InternalTocl.g:3332:2: (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp | this_CollectionOperationCall_4= ruleCollectionOperationCall )
            int alt45=5;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // InternalTocl.g:3333:3: this_OperationCall_0= ruleOperationCall
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
                    // InternalTocl.g:3342:3: this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall
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
                    // InternalTocl.g:3351:3: this_IterateExp_2= ruleIterateExp
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
                    // InternalTocl.g:3360:3: this_IteratorExp_3= ruleIteratorExp
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
                    // InternalTocl.g:3369:3: this_CollectionOperationCall_4= ruleCollectionOperationCall
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
    // InternalTocl.g:3381:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // InternalTocl.g:3381:54: (iv_ruleOperationCall= ruleOperationCall EOF )
            // InternalTocl.g:3382:2: iv_ruleOperationCall= ruleOperationCall EOF
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
    // InternalTocl.g:3388:1: ruleOperationCall returns [EObject current=null] : (otherlv_0= '.' ( ( (lv_operationName_1_0= RULE_STRING ) ) | ( (lv_operationName_2_0= RULE_ID ) ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* )? otherlv_7= ')' ) ;
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
            // InternalTocl.g:3394:2: ( (otherlv_0= '.' ( ( (lv_operationName_1_0= RULE_STRING ) ) | ( (lv_operationName_2_0= RULE_ID ) ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* )? otherlv_7= ')' ) )
            // InternalTocl.g:3395:2: (otherlv_0= '.' ( ( (lv_operationName_1_0= RULE_STRING ) ) | ( (lv_operationName_2_0= RULE_ID ) ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* )? otherlv_7= ')' )
            {
            // InternalTocl.g:3395:2: (otherlv_0= '.' ( ( (lv_operationName_1_0= RULE_STRING ) ) | ( (lv_operationName_2_0= RULE_ID ) ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* )? otherlv_7= ')' )
            // InternalTocl.g:3396:3: otherlv_0= '.' ( ( (lv_operationName_1_0= RULE_STRING ) ) | ( (lv_operationName_2_0= RULE_ID ) ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* )? otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationCallAccess().getFullStopKeyword_0());
            		
            // InternalTocl.g:3400:3: ( ( (lv_operationName_1_0= RULE_STRING ) ) | ( (lv_operationName_2_0= RULE_ID ) ) )
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
                    // InternalTocl.g:3401:4: ( (lv_operationName_1_0= RULE_STRING ) )
                    {
                    // InternalTocl.g:3401:4: ( (lv_operationName_1_0= RULE_STRING ) )
                    // InternalTocl.g:3402:5: (lv_operationName_1_0= RULE_STRING )
                    {
                    // InternalTocl.g:3402:5: (lv_operationName_1_0= RULE_STRING )
                    // InternalTocl.g:3403:6: lv_operationName_1_0= RULE_STRING
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
                    // InternalTocl.g:3420:4: ( (lv_operationName_2_0= RULE_ID ) )
                    {
                    // InternalTocl.g:3420:4: ( (lv_operationName_2_0= RULE_ID ) )
                    // InternalTocl.g:3421:5: (lv_operationName_2_0= RULE_ID )
                    {
                    // InternalTocl.g:3421:5: (lv_operationName_2_0= RULE_ID )
                    // InternalTocl.g:3422:6: lv_operationName_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalTocl.g:3443:3: ( ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_INT)||LA48_0==22||(LA48_0>=44 && LA48_0<=53)||(LA48_0>=56 && LA48_0<=63)||LA48_0==65||(LA48_0>=69 && LA48_0<=70)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalTocl.g:3444:4: ( (lv_arguments_4_0= ruleOclExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )*
                    {
                    // InternalTocl.g:3444:4: ( (lv_arguments_4_0= ruleOclExpression ) )
                    // InternalTocl.g:3445:5: (lv_arguments_4_0= ruleOclExpression )
                    {
                    // InternalTocl.g:3445:5: (lv_arguments_4_0= ruleOclExpression )
                    // InternalTocl.g:3446:6: lv_arguments_4_0= ruleOclExpression
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
                    							"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTocl.g:3463:4: (otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==23) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalTocl.g:3464:5: otherlv_5= ',' ( (lv_arguments_6_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FOLLOW_15); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOperationCallAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTocl.g:3468:5: ( (lv_arguments_6_0= ruleOclExpression ) )
                    	    // InternalTocl.g:3469:6: (lv_arguments_6_0= ruleOclExpression )
                    	    {
                    	    // InternalTocl.g:3469:6: (lv_arguments_6_0= ruleOclExpression )
                    	    // InternalTocl.g:3470:7: lv_arguments_6_0= ruleOclExpression
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
                    	    								"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

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
    // InternalTocl.g:3497:1: entryRuleNavigationOrAttributeCall returns [EObject current=null] : iv_ruleNavigationOrAttributeCall= ruleNavigationOrAttributeCall EOF ;
    public final EObject entryRuleNavigationOrAttributeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOrAttributeCall = null;


        try {
            // InternalTocl.g:3497:66: (iv_ruleNavigationOrAttributeCall= ruleNavigationOrAttributeCall EOF )
            // InternalTocl.g:3498:2: iv_ruleNavigationOrAttributeCall= ruleNavigationOrAttributeCall EOF
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
    // InternalTocl.g:3504:1: ruleNavigationOrAttributeCall returns [EObject current=null] : (otherlv_0= '.' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleNavigationOrAttributeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalTocl.g:3510:2: ( (otherlv_0= '.' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ) )
            // InternalTocl.g:3511:2: (otherlv_0= '.' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            {
            // InternalTocl.g:3511:2: (otherlv_0= '.' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalTocl.g:3512:3: otherlv_0= '.' ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigationOrAttributeCallAccess().getFullStopKeyword_0());
            		
            // InternalTocl.g:3516:3: ( ( (lv_name_1_0= RULE_STRING ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_ID) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalTocl.g:3517:4: ( (lv_name_1_0= RULE_STRING ) )
                    {
                    // InternalTocl.g:3517:4: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalTocl.g:3518:5: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalTocl.g:3518:5: (lv_name_1_0= RULE_STRING )
                    // InternalTocl.g:3519:6: lv_name_1_0= RULE_STRING
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
                    // InternalTocl.g:3536:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalTocl.g:3536:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalTocl.g:3537:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalTocl.g:3537:5: (lv_name_2_0= RULE_ID )
                    // InternalTocl.g:3538:6: lv_name_2_0= RULE_ID
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
    // InternalTocl.g:3559:1: entryRuleIterateExp returns [EObject current=null] : iv_ruleIterateExp= ruleIterateExp EOF ;
    public final EObject entryRuleIterateExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterateExp = null;


        try {
            // InternalTocl.g:3559:51: (iv_ruleIterateExp= ruleIterateExp EOF )
            // InternalTocl.g:3560:2: iv_ruleIterateExp= ruleIterateExp EOF
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
    // InternalTocl.g:3566:1: ruleIterateExp returns [EObject current=null] : (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' ) ;
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
            // InternalTocl.g:3572:2: ( (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' ) )
            // InternalTocl.g:3573:2: (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' )
            {
            // InternalTocl.g:3573:2: (otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')' )
            // InternalTocl.g:3574:3: otherlv_0= '->' otherlv_1= 'iterate' otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= ';' ( (lv_result_7_0= ruleLocalVariable ) ) otherlv_8= '|' ( (lv_body_9_0= ruleOclExpression ) ) otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getIterateExpAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,73,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIterateExpAccess().getIterateKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getIterateExpAccess().getLeftParenthesisKeyword_2());
            		
            // InternalTocl.g:3586:3: ( (lv_iterators_3_0= ruleIterator ) )
            // InternalTocl.g:3587:4: (lv_iterators_3_0= ruleIterator )
            {
            // InternalTocl.g:3587:4: (lv_iterators_3_0= ruleIterator )
            // InternalTocl.g:3588:5: lv_iterators_3_0= ruleIterator
            {

            					newCompositeNode(grammarAccess.getIterateExpAccess().getIteratorsIteratorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
            lv_iterators_3_0=ruleIterator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIterateExpRule());
            					}
            					add(
            						current,
            						"iterators",
            						lv_iterators_3_0,
            						"fr.enseeiht.xtext.tocl.Tocl.Iterator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTocl.g:3605:3: (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==23) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalTocl.g:3606:4: otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIterateExpAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalTocl.g:3610:4: ( (lv_iterators_5_0= ruleIterator ) )
            	    // InternalTocl.g:3611:5: (lv_iterators_5_0= ruleIterator )
            	    {
            	    // InternalTocl.g:3611:5: (lv_iterators_5_0= ruleIterator )
            	    // InternalTocl.g:3612:6: lv_iterators_5_0= ruleIterator
            	    {

            	    						newCompositeNode(grammarAccess.getIterateExpAccess().getIteratorsIteratorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_iterators_5_0=ruleIterator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIterateExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"iterators",
            	    							lv_iterators_5_0,
            	    							"fr.enseeiht.xtext.tocl.Tocl.Iterator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getIterateExpAccess().getSemicolonKeyword_5());
            		
            // InternalTocl.g:3634:3: ( (lv_result_7_0= ruleLocalVariable ) )
            // InternalTocl.g:3635:4: (lv_result_7_0= ruleLocalVariable )
            {
            // InternalTocl.g:3635:4: (lv_result_7_0= ruleLocalVariable )
            // InternalTocl.g:3636:5: lv_result_7_0= ruleLocalVariable
            {

            					newCompositeNode(grammarAccess.getIterateExpAccess().getResultLocalVariableParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_45);
            lv_result_7_0=ruleLocalVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIterateExpRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_7_0,
            						"fr.enseeiht.xtext.tocl.Tocl.LocalVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,74,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getIterateExpAccess().getVerticalLineKeyword_7());
            		
            // InternalTocl.g:3657:3: ( (lv_body_9_0= ruleOclExpression ) )
            // InternalTocl.g:3658:4: (lv_body_9_0= ruleOclExpression )
            {
            // InternalTocl.g:3658:4: (lv_body_9_0= ruleOclExpression )
            // InternalTocl.g:3659:5: lv_body_9_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIterateExpAccess().getBodyOclExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_36);
            lv_body_9_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIterateExpRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_9_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,24,FOLLOW_2); 

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
    // InternalTocl.g:3684:1: entryRuleIterator returns [EObject current=null] : iv_ruleIterator= ruleIterator EOF ;
    public final EObject entryRuleIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterator = null;


        try {
            // InternalTocl.g:3684:49: (iv_ruleIterator= ruleIterator EOF )
            // InternalTocl.g:3685:2: iv_ruleIterator= ruleIterator EOF
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
    // InternalTocl.g:3691:1: ruleIterator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? ) ;
    public final EObject ruleIterator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:3697:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? ) )
            // InternalTocl.g:3698:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? )
            {
            // InternalTocl.g:3698:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? )
            // InternalTocl.g:3699:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )?
            {
            // InternalTocl.g:3699:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTocl.g:3700:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTocl.g:3700:4: (lv_name_0_0= RULE_ID )
            // InternalTocl.g:3701:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_46); 

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

            // InternalTocl.g:3717:3: (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==20) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTocl.g:3718:4: otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getIteratorAccess().getColonKeyword_1_0());
                    			
                    // InternalTocl.g:3722:4: ( (lv_type_2_0= ruleOclType ) )
                    // InternalTocl.g:3723:5: (lv_type_2_0= ruleOclType )
                    {
                    // InternalTocl.g:3723:5: (lv_type_2_0= ruleOclType )
                    // InternalTocl.g:3724:6: lv_type_2_0= ruleOclType
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
                    							"fr.enseeiht.xtext.tocl.Tocl.OclType");
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
    // InternalTocl.g:3746:1: entryRuleIteratorExp returns [EObject current=null] : iv_ruleIteratorExp= ruleIteratorExp EOF ;
    public final EObject entryRuleIteratorExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteratorExp = null;


        try {
            // InternalTocl.g:3746:52: (iv_ruleIteratorExp= ruleIteratorExp EOF )
            // InternalTocl.g:3747:2: iv_ruleIteratorExp= ruleIteratorExp EOF
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
    // InternalTocl.g:3753:1: ruleIteratorExp returns [EObject current=null] : (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' ) ;
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
            // InternalTocl.g:3759:2: ( (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' ) )
            // InternalTocl.g:3760:2: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' )
            {
            // InternalTocl.g:3760:2: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')' )
            // InternalTocl.g:3761:3: otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_iterators_3_0= ruleIterator ) ) (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )* otherlv_6= '|' ( (lv_body_7_0= ruleOclExpression ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIteratorExpAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalTocl.g:3765:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTocl.g:3766:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTocl.g:3766:4: (lv_name_1_0= RULE_ID )
            // InternalTocl.g:3767:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getIteratorExpAccess().getLeftParenthesisKeyword_2());
            		
            // InternalTocl.g:3787:3: ( (lv_iterators_3_0= ruleIterator ) )
            // InternalTocl.g:3788:4: (lv_iterators_3_0= ruleIterator )
            {
            // InternalTocl.g:3788:4: (lv_iterators_3_0= ruleIterator )
            // InternalTocl.g:3789:5: lv_iterators_3_0= ruleIterator
            {

            					newCompositeNode(grammarAccess.getIteratorExpAccess().getIteratorsIteratorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_47);
            lv_iterators_3_0=ruleIterator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIteratorExpRule());
            					}
            					add(
            						current,
            						"iterators",
            						lv_iterators_3_0,
            						"fr.enseeiht.xtext.tocl.Tocl.Iterator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTocl.g:3806:3: (otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==23) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalTocl.g:3807:4: otherlv_4= ',' ( (lv_iterators_5_0= ruleIterator ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIteratorExpAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalTocl.g:3811:4: ( (lv_iterators_5_0= ruleIterator ) )
            	    // InternalTocl.g:3812:5: (lv_iterators_5_0= ruleIterator )
            	    {
            	    // InternalTocl.g:3812:5: (lv_iterators_5_0= ruleIterator )
            	    // InternalTocl.g:3813:6: lv_iterators_5_0= ruleIterator
            	    {

            	    						newCompositeNode(grammarAccess.getIteratorExpAccess().getIteratorsIteratorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_iterators_5_0=ruleIterator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIteratorExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"iterators",
            	    							lv_iterators_5_0,
            	    							"fr.enseeiht.xtext.tocl.Tocl.Iterator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_6=(Token)match(input,74,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getIteratorExpAccess().getVerticalLineKeyword_5());
            		
            // InternalTocl.g:3835:3: ( (lv_body_7_0= ruleOclExpression ) )
            // InternalTocl.g:3836:4: (lv_body_7_0= ruleOclExpression )
            {
            // InternalTocl.g:3836:4: (lv_body_7_0= ruleOclExpression )
            // InternalTocl.g:3837:5: lv_body_7_0= ruleOclExpression
            {

            					newCompositeNode(grammarAccess.getIteratorExpAccess().getBodyOclExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_36);
            lv_body_7_0=ruleOclExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIteratorExpRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_7_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_2); 

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
    // InternalTocl.g:3862:1: entryRuleCollectionOperationCall returns [EObject current=null] : iv_ruleCollectionOperationCall= ruleCollectionOperationCall EOF ;
    public final EObject entryRuleCollectionOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionOperationCall = null;


        try {
            // InternalTocl.g:3862:64: (iv_ruleCollectionOperationCall= ruleCollectionOperationCall EOF )
            // InternalTocl.g:3863:2: iv_ruleCollectionOperationCall= ruleCollectionOperationCall EOF
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
    // InternalTocl.g:3869:1: ruleCollectionOperationCall returns [EObject current=null] : (otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalTocl.g:3875:2: ( (otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalTocl.g:3876:2: (otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalTocl.g:3876:2: (otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')' )
            // InternalTocl.g:3877:3: otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionOperationCallAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalTocl.g:3881:3: ( (lv_operationName_1_0= RULE_ID ) )
            // InternalTocl.g:3882:4: (lv_operationName_1_0= RULE_ID )
            {
            // InternalTocl.g:3882:4: (lv_operationName_1_0= RULE_ID )
            // InternalTocl.g:3883:5: lv_operationName_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,22,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getCollectionOperationCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalTocl.g:3903:3: ( ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_INT)||LA54_0==22||(LA54_0>=44 && LA54_0<=53)||(LA54_0>=56 && LA54_0<=63)||LA54_0==65||(LA54_0>=69 && LA54_0<=70)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTocl.g:3904:4: ( (lv_arguments_3_0= ruleOclExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )*
                    {
                    // InternalTocl.g:3904:4: ( (lv_arguments_3_0= ruleOclExpression ) )
                    // InternalTocl.g:3905:5: (lv_arguments_3_0= ruleOclExpression )
                    {
                    // InternalTocl.g:3905:5: (lv_arguments_3_0= ruleOclExpression )
                    // InternalTocl.g:3906:6: lv_arguments_3_0= ruleOclExpression
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
                    							"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTocl.g:3923:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==23) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalTocl.g:3924:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleOclExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getCollectionOperationCallAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTocl.g:3928:5: ( (lv_arguments_5_0= ruleOclExpression ) )
                    	    // InternalTocl.g:3929:6: (lv_arguments_5_0= ruleOclExpression )
                    	    {
                    	    // InternalTocl.g:3929:6: (lv_arguments_5_0= ruleOclExpression )
                    	    // InternalTocl.g:3930:7: lv_arguments_5_0= ruleOclExpression
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
                    	    								"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

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
    // InternalTocl.g:3957:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // InternalTocl.g:3957:54: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // InternalTocl.g:3958:2: iv_ruleLocalVariable= ruleLocalVariable EOF
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
    // InternalTocl.g:3964:1: ruleLocalVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:3970:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) ) )
            // InternalTocl.g:3971:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            {
            // InternalTocl.g:3971:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) ) )
            // InternalTocl.g:3972:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleOclExpression ) )
            {
            // InternalTocl.g:3972:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTocl.g:3973:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTocl.g:3973:4: (lv_name_0_0= RULE_ID )
            // InternalTocl.g:3974:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            // InternalTocl.g:3990:3: (otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==20) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalTocl.g:3991:4: otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getLocalVariableAccess().getColonKeyword_1_0());
                    			
                    // InternalTocl.g:3995:4: ( (lv_type_2_0= ruleOclType ) )
                    // InternalTocl.g:3996:5: (lv_type_2_0= ruleOclType )
                    {
                    // InternalTocl.g:3996:5: (lv_type_2_0= ruleOclType )
                    // InternalTocl.g:3997:6: lv_type_2_0= ruleOclType
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
                    							"fr.enseeiht.xtext.tocl.Tocl.OclType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalTocl.g:4019:3: ( (lv_initExpression_4_0= ruleOclExpression ) )
            // InternalTocl.g:4020:4: (lv_initExpression_4_0= ruleOclExpression )
            {
            // InternalTocl.g:4020:4: (lv_initExpression_4_0= ruleOclExpression )
            // InternalTocl.g:4021:5: lv_initExpression_4_0= ruleOclExpression
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
            						"fr.enseeiht.xtext.tocl.Tocl.OclExpression");
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
    // InternalTocl.g:4042:1: entryRuleOclType returns [EObject current=null] : iv_ruleOclType= ruleOclType EOF ;
    public final EObject entryRuleOclType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclType = null;


        try {
            // InternalTocl.g:4042:48: (iv_ruleOclType= ruleOclType EOF )
            // InternalTocl.g:4043:2: iv_ruleOclType= ruleOclType EOF
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
    // InternalTocl.g:4049:1: ruleOclType returns [EObject current=null] : (this_CollectionType_0= ruleCollectionType | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_TupleType_3= ruleTupleType | this_OclModelElement_4= ruleOclModelElement | this_MapType_5= ruleMapType | this_OclType_abstractContents_6= ruleOclType_abstractContents ) ;
    public final EObject ruleOclType() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionType_0 = null;

        EObject this_Primitive_1 = null;

        EObject this_OclAnyType_2 = null;

        EObject this_TupleType_3 = null;

        EObject this_OclModelElement_4 = null;

        EObject this_MapType_5 = null;

        EObject this_OclType_abstractContents_6 = null;



        	enterRule();

        try {
            // InternalTocl.g:4055:2: ( (this_CollectionType_0= ruleCollectionType | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_TupleType_3= ruleTupleType | this_OclModelElement_4= ruleOclModelElement | this_MapType_5= ruleMapType | this_OclType_abstractContents_6= ruleOclType_abstractContents ) )
            // InternalTocl.g:4056:2: (this_CollectionType_0= ruleCollectionType | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_TupleType_3= ruleTupleType | this_OclModelElement_4= ruleOclModelElement | this_MapType_5= ruleMapType | this_OclType_abstractContents_6= ruleOclType_abstractContents )
            {
            // InternalTocl.g:4056:2: (this_CollectionType_0= ruleCollectionType | this_Primitive_1= rulePrimitive | this_OclAnyType_2= ruleOclAnyType | this_TupleType_3= ruleTupleType | this_OclModelElement_4= ruleOclModelElement | this_MapType_5= ruleMapType | this_OclType_abstractContents_6= ruleOclType_abstractContents )
            int alt56=7;
            switch ( input.LA(1) ) {
            case 53:
            case 56:
            case 57:
            case 58:
                {
                alt56=1;
                }
                break;
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt56=2;
                }
                break;
            case 79:
                {
                alt56=3;
                }
                break;
            case 59:
            case 81:
                {
                alt56=4;
                }
                break;
            case RULE_ID:
                {
                alt56=5;
                }
                break;
            case 60:
                {
                alt56=6;
                }
                break;
            case 80:
                {
                alt56=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalTocl.g:4057:3: this_CollectionType_0= ruleCollectionType
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
                    // InternalTocl.g:4066:3: this_Primitive_1= rulePrimitive
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
                    // InternalTocl.g:4075:3: this_OclAnyType_2= ruleOclAnyType
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
                    // InternalTocl.g:4084:3: this_TupleType_3= ruleTupleType
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
                    // InternalTocl.g:4093:3: this_OclModelElement_4= ruleOclModelElement
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
                    // InternalTocl.g:4102:3: this_MapType_5= ruleMapType
                    {

                    			newCompositeNode(grammarAccess.getOclTypeAccess().getMapTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MapType_5=ruleMapType();

                    state._fsp--;


                    			current = this_MapType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTocl.g:4111:3: this_OclType_abstractContents_6= ruleOclType_abstractContents
                    {

                    			newCompositeNode(grammarAccess.getOclTypeAccess().getOclType_abstractContentsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_OclType_abstractContents_6=ruleOclType_abstractContents();

                    state._fsp--;


                    			current = this_OclType_abstractContents_6;
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
    // InternalTocl.g:4123:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalTocl.g:4123:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalTocl.g:4124:2: iv_ruleCollectionType= ruleCollectionType EOF
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
    // InternalTocl.g:4130:1: ruleCollectionType returns [EObject current=null] : (this_BagType_0= ruleBagType | this_OrderedSetType_1= ruleOrderedSetType | this_SequenceType_2= ruleSequenceType | this_SetType_3= ruleSetType ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject this_BagType_0 = null;

        EObject this_OrderedSetType_1 = null;

        EObject this_SequenceType_2 = null;

        EObject this_SetType_3 = null;



        	enterRule();

        try {
            // InternalTocl.g:4136:2: ( (this_BagType_0= ruleBagType | this_OrderedSetType_1= ruleOrderedSetType | this_SequenceType_2= ruleSequenceType | this_SetType_3= ruleSetType ) )
            // InternalTocl.g:4137:2: (this_BagType_0= ruleBagType | this_OrderedSetType_1= ruleOrderedSetType | this_SequenceType_2= ruleSequenceType | this_SetType_3= ruleSetType )
            {
            // InternalTocl.g:4137:2: (this_BagType_0= ruleBagType | this_OrderedSetType_1= ruleOrderedSetType | this_SequenceType_2= ruleSequenceType | this_SetType_3= ruleSetType )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt57=1;
                }
                break;
            case 56:
                {
                alt57=2;
                }
                break;
            case 57:
                {
                alt57=3;
                }
                break;
            case 58:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalTocl.g:4138:3: this_BagType_0= ruleBagType
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
                    // InternalTocl.g:4147:3: this_OrderedSetType_1= ruleOrderedSetType
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
                    // InternalTocl.g:4156:3: this_SequenceType_2= ruleSequenceType
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
                    // InternalTocl.g:4165:3: this_SetType_3= ruleSetType
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
    // InternalTocl.g:4177:1: entryRuleBagType returns [EObject current=null] : iv_ruleBagType= ruleBagType EOF ;
    public final EObject entryRuleBagType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagType = null;


        try {
            // InternalTocl.g:4177:48: (iv_ruleBagType= ruleBagType EOF )
            // InternalTocl.g:4178:2: iv_ruleBagType= ruleBagType EOF
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
    // InternalTocl.g:4184:1: ruleBagType returns [EObject current=null] : (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) ;
    public final EObject ruleBagType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:4190:2: ( (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) )
            // InternalTocl.g:4191:2: (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            {
            // InternalTocl.g:4191:2: (otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            // InternalTocl.g:4192:3: otherlv_0= 'Bag' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBagTypeAccess().getBagKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getBagTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTocl.g:4200:3: ( (lv_elementType_2_0= ruleOclType ) )
            // InternalTocl.g:4201:4: (lv_elementType_2_0= ruleOclType )
            {
            // InternalTocl.g:4201:4: (lv_elementType_2_0= ruleOclType )
            // InternalTocl.g:4202:5: lv_elementType_2_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getBagTypeAccess().getElementTypeOclTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_elementType_2_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBagTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

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
    // InternalTocl.g:4227:1: entryRuleOrderedSetType returns [EObject current=null] : iv_ruleOrderedSetType= ruleOrderedSetType EOF ;
    public final EObject entryRuleOrderedSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedSetType = null;


        try {
            // InternalTocl.g:4227:55: (iv_ruleOrderedSetType= ruleOrderedSetType EOF )
            // InternalTocl.g:4228:2: iv_ruleOrderedSetType= ruleOrderedSetType EOF
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
    // InternalTocl.g:4234:1: ruleOrderedSetType returns [EObject current=null] : (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) ;
    public final EObject ruleOrderedSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:4240:2: ( (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) )
            // InternalTocl.g:4241:2: (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            {
            // InternalTocl.g:4241:2: (otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            // InternalTocl.g:4242:3: otherlv_0= 'OrderedSet' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderedSetTypeAccess().getOrderedSetKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderedSetTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTocl.g:4250:3: ( (lv_elementType_2_0= ruleOclType ) )
            // InternalTocl.g:4251:4: (lv_elementType_2_0= ruleOclType )
            {
            // InternalTocl.g:4251:4: (lv_elementType_2_0= ruleOclType )
            // InternalTocl.g:4252:5: lv_elementType_2_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getOrderedSetTypeAccess().getElementTypeOclTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_elementType_2_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderedSetTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

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
    // InternalTocl.g:4277:1: entryRuleSequenceType returns [EObject current=null] : iv_ruleSequenceType= ruleSequenceType EOF ;
    public final EObject entryRuleSequenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceType = null;


        try {
            // InternalTocl.g:4277:53: (iv_ruleSequenceType= ruleSequenceType EOF )
            // InternalTocl.g:4278:2: iv_ruleSequenceType= ruleSequenceType EOF
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
    // InternalTocl.g:4284:1: ruleSequenceType returns [EObject current=null] : (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) ;
    public final EObject ruleSequenceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:4290:2: ( (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) )
            // InternalTocl.g:4291:2: (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            {
            // InternalTocl.g:4291:2: (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            // InternalTocl.g:4292:3: otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceTypeAccess().getSequenceKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTocl.g:4300:3: ( (lv_elementType_2_0= ruleOclType ) )
            // InternalTocl.g:4301:4: (lv_elementType_2_0= ruleOclType )
            {
            // InternalTocl.g:4301:4: (lv_elementType_2_0= ruleOclType )
            // InternalTocl.g:4302:5: lv_elementType_2_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getSequenceTypeAccess().getElementTypeOclTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_elementType_2_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

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
    // InternalTocl.g:4327:1: entryRuleSetType returns [EObject current=null] : iv_ruleSetType= ruleSetType EOF ;
    public final EObject entryRuleSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetType = null;


        try {
            // InternalTocl.g:4327:48: (iv_ruleSetType= ruleSetType EOF )
            // InternalTocl.g:4328:2: iv_ruleSetType= ruleSetType EOF
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
    // InternalTocl.g:4334:1: ruleSetType returns [EObject current=null] : (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) ;
    public final EObject ruleSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:4340:2: ( (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' ) )
            // InternalTocl.g:4341:2: (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            {
            // InternalTocl.g:4341:2: (otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')' )
            // InternalTocl.g:4342:3: otherlv_0= 'Set' otherlv_1= '(' ( (lv_elementType_2_0= ruleOclType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSetTypeAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSetTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTocl.g:4350:3: ( (lv_elementType_2_0= ruleOclType ) )
            // InternalTocl.g:4351:4: (lv_elementType_2_0= ruleOclType )
            {
            // InternalTocl.g:4351:4: (lv_elementType_2_0= ruleOclType )
            // InternalTocl.g:4352:5: lv_elementType_2_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getSetTypeAccess().getElementTypeOclTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_elementType_2_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

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
    // InternalTocl.g:4377:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalTocl.g:4377:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalTocl.g:4378:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalTocl.g:4384:1: rulePrimitive returns [EObject current=null] : (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_NumericType_2 = null;



        	enterRule();

        try {
            // InternalTocl.g:4390:2: ( (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) )
            // InternalTocl.g:4391:2: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            {
            // InternalTocl.g:4391:2: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt58=1;
                }
                break;
            case 76:
                {
                alt58=2;
                }
                break;
            case 77:
            case 78:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalTocl.g:4392:3: this_StringType_0= ruleStringType
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
                    // InternalTocl.g:4401:3: this_BooleanType_1= ruleBooleanType
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
                    // InternalTocl.g:4410:3: this_NumericType_2= ruleNumericType
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
    // InternalTocl.g:4422:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalTocl.g:4422:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalTocl.g:4423:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalTocl.g:4429:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'String' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTocl.g:4435:2: ( ( () otherlv_1= 'String' ) )
            // InternalTocl.g:4436:2: ( () otherlv_1= 'String' )
            {
            // InternalTocl.g:4436:2: ( () otherlv_1= 'String' )
            // InternalTocl.g:4437:3: () otherlv_1= 'String'
            {
            // InternalTocl.g:4437:3: ()
            // InternalTocl.g:4438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_2); 

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
    // InternalTocl.g:4452:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalTocl.g:4452:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalTocl.g:4453:2: iv_ruleBooleanType= ruleBooleanType EOF
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
    // InternalTocl.g:4459:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'Boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTocl.g:4465:2: ( ( () otherlv_1= 'Boolean' ) )
            // InternalTocl.g:4466:2: ( () otherlv_1= 'Boolean' )
            {
            // InternalTocl.g:4466:2: ( () otherlv_1= 'Boolean' )
            // InternalTocl.g:4467:3: () otherlv_1= 'Boolean'
            {
            // InternalTocl.g:4467:3: ()
            // InternalTocl.g:4468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_2); 

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
    // InternalTocl.g:4482:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // InternalTocl.g:4482:52: (iv_ruleNumericType= ruleNumericType EOF )
            // InternalTocl.g:4483:2: iv_ruleNumericType= ruleNumericType EOF
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
    // InternalTocl.g:4489:1: ruleNumericType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_RealType_1 = null;



        	enterRule();

        try {
            // InternalTocl.g:4495:2: ( (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType ) )
            // InternalTocl.g:4496:2: (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType )
            {
            // InternalTocl.g:4496:2: (this_IntegerType_0= ruleIntegerType | this_RealType_1= ruleRealType )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==77) ) {
                alt59=1;
            }
            else if ( (LA59_0==78) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalTocl.g:4497:3: this_IntegerType_0= ruleIntegerType
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
                    // InternalTocl.g:4506:3: this_RealType_1= ruleRealType
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
    // InternalTocl.g:4518:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalTocl.g:4518:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalTocl.g:4519:2: iv_ruleIntegerType= ruleIntegerType EOF
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
    // InternalTocl.g:4525:1: ruleIntegerType returns [EObject current=null] : ( () otherlv_1= 'Integer' ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTocl.g:4531:2: ( ( () otherlv_1= 'Integer' ) )
            // InternalTocl.g:4532:2: ( () otherlv_1= 'Integer' )
            {
            // InternalTocl.g:4532:2: ( () otherlv_1= 'Integer' )
            // InternalTocl.g:4533:3: () otherlv_1= 'Integer'
            {
            // InternalTocl.g:4533:3: ()
            // InternalTocl.g:4534:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_2); 

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
    // InternalTocl.g:4548:1: entryRuleRealType returns [EObject current=null] : iv_ruleRealType= ruleRealType EOF ;
    public final EObject entryRuleRealType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealType = null;


        try {
            // InternalTocl.g:4548:49: (iv_ruleRealType= ruleRealType EOF )
            // InternalTocl.g:4549:2: iv_ruleRealType= ruleRealType EOF
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
    // InternalTocl.g:4555:1: ruleRealType returns [EObject current=null] : ( () otherlv_1= 'Real' ) ;
    public final EObject ruleRealType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTocl.g:4561:2: ( ( () otherlv_1= 'Real' ) )
            // InternalTocl.g:4562:2: ( () otherlv_1= 'Real' )
            {
            // InternalTocl.g:4562:2: ( () otherlv_1= 'Real' )
            // InternalTocl.g:4563:3: () otherlv_1= 'Real'
            {
            // InternalTocl.g:4563:3: ()
            // InternalTocl.g:4564:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealTypeAccess().getRealTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_2); 

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
    // InternalTocl.g:4578:1: entryRuleOclAnyType returns [EObject current=null] : iv_ruleOclAnyType= ruleOclAnyType EOF ;
    public final EObject entryRuleOclAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclAnyType = null;


        try {
            // InternalTocl.g:4578:51: (iv_ruleOclAnyType= ruleOclAnyType EOF )
            // InternalTocl.g:4579:2: iv_ruleOclAnyType= ruleOclAnyType EOF
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
    // InternalTocl.g:4585:1: ruleOclAnyType returns [EObject current=null] : ( () otherlv_1= 'OclAny' ) ;
    public final EObject ruleOclAnyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTocl.g:4591:2: ( ( () otherlv_1= 'OclAny' ) )
            // InternalTocl.g:4592:2: ( () otherlv_1= 'OclAny' )
            {
            // InternalTocl.g:4592:2: ( () otherlv_1= 'OclAny' )
            // InternalTocl.g:4593:3: () otherlv_1= 'OclAny'
            {
            // InternalTocl.g:4593:3: ()
            // InternalTocl.g:4594:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOclAnyTypeAccess().getOclAnyTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_2); 

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


    // $ANTLR start "entryRuleOclType_abstractContents"
    // InternalTocl.g:4608:1: entryRuleOclType_abstractContents returns [EObject current=null] : iv_ruleOclType_abstractContents= ruleOclType_abstractContents EOF ;
    public final EObject entryRuleOclType_abstractContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclType_abstractContents = null;


        try {
            // InternalTocl.g:4608:65: (iv_ruleOclType_abstractContents= ruleOclType_abstractContents EOF )
            // InternalTocl.g:4609:2: iv_ruleOclType_abstractContents= ruleOclType_abstractContents EOF
            {
             newCompositeNode(grammarAccess.getOclType_abstractContentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOclType_abstractContents=ruleOclType_abstractContents();

            state._fsp--;

             current =iv_ruleOclType_abstractContents; 
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
    // $ANTLR end "entryRuleOclType_abstractContents"


    // $ANTLR start "ruleOclType_abstractContents"
    // InternalTocl.g:4615:1: ruleOclType_abstractContents returns [EObject current=null] : ( () otherlv_1= 'OclType' ) ;
    public final EObject ruleOclType_abstractContents() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTocl.g:4621:2: ( ( () otherlv_1= 'OclType' ) )
            // InternalTocl.g:4622:2: ( () otherlv_1= 'OclType' )
            {
            // InternalTocl.g:4622:2: ( () otherlv_1= 'OclType' )
            // InternalTocl.g:4623:3: () otherlv_1= 'OclType'
            {
            // InternalTocl.g:4623:3: ()
            // InternalTocl.g:4624:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOclType_abstractContentsAccess().getOclTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getOclType_abstractContentsAccess().getOclTypeKeyword_1());
            		

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
    // $ANTLR end "ruleOclType_abstractContents"


    // $ANTLR start "entryRuleTupleType"
    // InternalTocl.g:4638:1: entryRuleTupleType returns [EObject current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final EObject entryRuleTupleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleType = null;


        try {
            // InternalTocl.g:4638:50: (iv_ruleTupleType= ruleTupleType EOF )
            // InternalTocl.g:4639:2: iv_ruleTupleType= ruleTupleType EOF
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
    // InternalTocl.g:4645:1: ruleTupleType returns [EObject current=null] : ( () (otherlv_1= 'TupleType' | otherlv_2= 'Tuple' ) otherlv_3= '(' ( ( (lv_attributes_4_0= ruleTupleTypeAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleTupleTypeAttribute ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleTupleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributes_4_0 = null;

        EObject lv_attributes_6_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:4651:2: ( ( () (otherlv_1= 'TupleType' | otherlv_2= 'Tuple' ) otherlv_3= '(' ( ( (lv_attributes_4_0= ruleTupleTypeAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleTupleTypeAttribute ) ) )* )? otherlv_7= ')' ) )
            // InternalTocl.g:4652:2: ( () (otherlv_1= 'TupleType' | otherlv_2= 'Tuple' ) otherlv_3= '(' ( ( (lv_attributes_4_0= ruleTupleTypeAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleTupleTypeAttribute ) ) )* )? otherlv_7= ')' )
            {
            // InternalTocl.g:4652:2: ( () (otherlv_1= 'TupleType' | otherlv_2= 'Tuple' ) otherlv_3= '(' ( ( (lv_attributes_4_0= ruleTupleTypeAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleTupleTypeAttribute ) ) )* )? otherlv_7= ')' )
            // InternalTocl.g:4653:3: () (otherlv_1= 'TupleType' | otherlv_2= 'Tuple' ) otherlv_3= '(' ( ( (lv_attributes_4_0= ruleTupleTypeAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleTupleTypeAttribute ) ) )* )? otherlv_7= ')'
            {
            // InternalTocl.g:4653:3: ()
            // InternalTocl.g:4654:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTupleTypeAccess().getTupleTypeAction_0(),
            					current);
            			

            }

            // InternalTocl.g:4660:3: (otherlv_1= 'TupleType' | otherlv_2= 'Tuple' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==81) ) {
                alt60=1;
            }
            else if ( (LA60_0==59) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalTocl.g:4661:4: otherlv_1= 'TupleType'
                    {
                    otherlv_1=(Token)match(input,81,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getTupleTypeAccess().getTupleTypeKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTocl.g:4666:4: otherlv_2= 'Tuple'
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getTupleTypeAccess().getTupleKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalTocl.g:4675:3: ( ( (lv_attributes_4_0= ruleTupleTypeAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleTupleTypeAttribute ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalTocl.g:4676:4: ( (lv_attributes_4_0= ruleTupleTypeAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleTupleTypeAttribute ) ) )*
                    {
                    // InternalTocl.g:4676:4: ( (lv_attributes_4_0= ruleTupleTypeAttribute ) )
                    // InternalTocl.g:4677:5: (lv_attributes_4_0= ruleTupleTypeAttribute )
                    {
                    // InternalTocl.g:4677:5: (lv_attributes_4_0= ruleTupleTypeAttribute )
                    // InternalTocl.g:4678:6: lv_attributes_4_0= ruleTupleTypeAttribute
                    {

                    						newCompositeNode(grammarAccess.getTupleTypeAccess().getAttributesTupleTypeAttributeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_attributes_4_0=ruleTupleTypeAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTupleTypeRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_4_0,
                    							"fr.enseeiht.xtext.tocl.Tocl.TupleTypeAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTocl.g:4695:4: (otherlv_5= ',' ( (lv_attributes_6_0= ruleTupleTypeAttribute ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==23) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalTocl.g:4696:5: otherlv_5= ',' ( (lv_attributes_6_0= ruleTupleTypeAttribute ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getTupleTypeAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalTocl.g:4700:5: ( (lv_attributes_6_0= ruleTupleTypeAttribute ) )
                    	    // InternalTocl.g:4701:6: (lv_attributes_6_0= ruleTupleTypeAttribute )
                    	    {
                    	    // InternalTocl.g:4701:6: (lv_attributes_6_0= ruleTupleTypeAttribute )
                    	    // InternalTocl.g:4702:7: lv_attributes_6_0= ruleTupleTypeAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getTupleTypeAccess().getAttributesTupleTypeAttributeParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_attributes_6_0=ruleTupleTypeAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTupleTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_6_0,
                    	    								"fr.enseeiht.xtext.tocl.Tocl.TupleTypeAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTupleTypeAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalTocl.g:4729:1: entryRuleTupleTypeAttribute returns [EObject current=null] : iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF ;
    public final EObject entryRuleTupleTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeAttribute = null;


        try {
            // InternalTocl.g:4729:59: (iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF )
            // InternalTocl.g:4730:2: iv_ruleTupleTypeAttribute= ruleTupleTypeAttribute EOF
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
    // InternalTocl.g:4736:1: ruleTupleTypeAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) ) ;
    public final EObject ruleTupleTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalTocl.g:4742:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) ) )
            // InternalTocl.g:4743:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )
            {
            // InternalTocl.g:4743:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) ) )
            // InternalTocl.g:4744:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleOclType ) )
            {
            // InternalTocl.g:4744:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTocl.g:4745:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTocl.g:4745:4: (lv_name_0_0= RULE_ID )
            // InternalTocl.g:4746:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleTypeAttributeAccess().getColonKeyword_1());
            		
            // InternalTocl.g:4766:3: ( (lv_type_2_0= ruleOclType ) )
            // InternalTocl.g:4767:4: (lv_type_2_0= ruleOclType )
            {
            // InternalTocl.g:4767:4: (lv_type_2_0= ruleOclType )
            // InternalTocl.g:4768:5: lv_type_2_0= ruleOclType
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
            						"fr.enseeiht.xtext.tocl.Tocl.OclType");
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
    // InternalTocl.g:4789:1: entryRuleOclModelElement returns [EObject current=null] : iv_ruleOclModelElement= ruleOclModelElement EOF ;
    public final EObject entryRuleOclModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclModelElement = null;


        try {
            // InternalTocl.g:4789:56: (iv_ruleOclModelElement= ruleOclModelElement EOF )
            // InternalTocl.g:4790:2: iv_ruleOclModelElement= ruleOclModelElement EOF
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
    // InternalTocl.g:4796:1: ruleOclModelElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOclModelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalTocl.g:4802:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalTocl.g:4803:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalTocl.g:4803:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalTocl.g:4804:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalTocl.g:4804:3: ( (otherlv_0= RULE_ID ) )
            // InternalTocl.g:4805:4: (otherlv_0= RULE_ID )
            {
            // InternalTocl.g:4805:4: (otherlv_0= RULE_ID )
            // InternalTocl.g:4806:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOclModelElementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getOclModelElementAccess().getModelImportCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOclModelElementAccess().getExclamationMarkKeyword_1());
            		
            // InternalTocl.g:4821:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTocl.g:4822:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTocl.g:4822:4: (lv_name_2_0= RULE_ID )
            // InternalTocl.g:4823:5: lv_name_2_0= RULE_ID
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
    // InternalTocl.g:4843:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // InternalTocl.g:4843:48: (iv_ruleMapType= ruleMapType EOF )
            // InternalTocl.g:4844:2: iv_ruleMapType= ruleMapType EOF
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
    // InternalTocl.g:4850:1: ruleMapType returns [EObject current=null] : (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')' ) ;
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
            // InternalTocl.g:4856:2: ( (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')' ) )
            // InternalTocl.g:4857:2: (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')' )
            {
            // InternalTocl.g:4857:2: (otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')' )
            // InternalTocl.g:4858:3: otherlv_0= 'Map' otherlv_1= '(' ( (lv_keyType_2_0= ruleOclType ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleOclType ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getMapKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTocl.g:4866:3: ( (lv_keyType_2_0= ruleOclType ) )
            // InternalTocl.g:4867:4: (lv_keyType_2_0= ruleOclType )
            {
            // InternalTocl.g:4867:4: (lv_keyType_2_0= ruleOclType )
            // InternalTocl.g:4868:5: lv_keyType_2_0= ruleOclType
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
            						"fr.enseeiht.xtext.tocl.Tocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getMapTypeAccess().getCommaKeyword_3());
            		
            // InternalTocl.g:4889:3: ( (lv_valueType_4_0= ruleOclType ) )
            // InternalTocl.g:4890:4: (lv_valueType_4_0= ruleOclType )
            {
            // InternalTocl.g:4890:4: (lv_valueType_4_0= ruleOclType )
            // InternalTocl.g:4891:5: lv_valueType_4_0= ruleOclType
            {

            					newCompositeNode(grammarAccess.getMapTypeAccess().getValueTypeOclTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_36);
            lv_valueType_4_0=ruleOclType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapTypeRule());
            					}
            					set(
            						current,
            						"valueType",
            						lv_valueType_4_0,
            						"fr.enseeiht.xtext.tocl.Tocl.OclType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

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
    // InternalTocl.g:4916:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalTocl.g:4916:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalTocl.g:4917:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalTocl.g:4923:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalTocl.g:4929:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalTocl.g:4930:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalTocl.g:4930:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalTocl.g:4931:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_48); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalTocl.g:4938:3: (kw= '.' this_ID_2= RULE_ID )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==71) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalTocl.g:4939:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,71,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_48); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop63;
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\21\1\4\2\uffff\1\22\1\4\1\23\1\4\1\23";
    static final String dfa_3s = "\1\31\1\4\2\uffff\1\22\1\4\1\107\1\4\1\107";
    static final String dfa_4s = "\2\uffff\1\1\1\2\5\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\5\uffff\1\3",
            "\1\4",
            "",
            "",
            "\1\5",
            "\1\6",
            "\1\2\5\uffff\1\3\55\uffff\1\7",
            "\1\10",
            "\1\2\5\uffff\1\3\55\uffff\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "244:2: (this_OclFeatureDefinition_0= ruleOclFeatureDefinition | this_OclInvariant_1= ruleOclInvariant )";
        }
    }
    static final String dfa_7s = "\23\uffff";
    static final String dfa_8s = "\1\uffff\1\2\21\uffff";
    static final String dfa_9s = "\1\4\1\16\21\uffff";
    static final String dfa_10s = "\1\106\1\112\21\uffff";
    static final String dfa_11s = "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21";
    static final String dfa_12s = "\23\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\5\2\7\16\uffff\1\21\33\uffff\1\2\1\3\1\4\1\10\2\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17\2\uffff\1\20\3\uffff\2\6",
            "\1\2\2\uffff\1\2\1\22\1\2\1\uffff\1\2\1\uffff\25\2\13\uffff\1\2\10\uffff\1\2\1\uffff\3\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1869:2: (this_VariableExp_0= ruleVariableExp | this_SuperExp_1= ruleSuperExp | this_SelfExp_2= ruleSelfExp | this_StringExp_3= ruleStringExp | this_BooleanExp_4= ruleBooleanExp | this_NumericExp_5= ruleNumericExp | this_BagExp_6= ruleBagExp | this_OrderedSetExp_7= ruleOrderedSetExp | this_SequenceExp_8= ruleSequenceExp | this_SetExp_9= ruleSetExp | this_TupleExp_10= ruleTupleExp | this_MapExp_11= ruleMapExp | this_EnumLiteralExp_12= ruleEnumLiteralExp | this_OclUndefinedExp_13= ruleOclUndefinedExp | this_IfExp_14= ruleIfExp | this_BraceExp_15= ruleBraceExp | this_OclModelElementExp_16= ruleOclModelElementExp )";
        }
    }
    static final String dfa_14s = "\17\uffff";
    static final String dfa_15s = "\3\uffff\2\7\12\uffff";
    static final String dfa_16s = "\1\107\2\4\2\16\1\26\3\uffff\1\4\1\uffff\1\22\1\4\1\uffff\1\22";
    static final String dfa_17s = "\1\110\1\5\1\111\2\112\1\26\3\uffff\1\106\1\uffff\1\112\1\106\1\uffff\1\112";
    static final String dfa_18s = "\6\uffff\1\3\1\2\1\1\1\uffff\1\5\2\uffff\1\4\1\uffff";
    static final String dfa_19s = "\17\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\1\2",
            "\1\4\1\3",
            "\1\5\104\uffff\1\6",
            "\1\7\2\uffff\1\7\1\uffff\1\7\1\uffff\1\7\1\10\25\7\13\uffff\1\7\10\uffff\1\7\1\uffff\3\7\2\uffff\2\7\1\uffff\1\7",
            "\1\7\2\uffff\1\7\1\uffff\1\7\1\uffff\1\7\1\10\25\7\13\uffff\1\7\10\uffff\1\7\1\uffff\3\7\2\uffff\2\7\1\uffff\1\7",
            "\1\11",
            "",
            "",
            "",
            "\1\13\3\12\16\uffff\1\12\1\uffff\1\12\23\uffff\12\12\2\uffff\10\12\1\uffff\1\12\3\uffff\2\12",
            "",
            "\1\12\1\uffff\1\15\1\12\1\uffff\1\14\1\12\1\uffff\22\12\33\uffff\2\12\1\uffff\1\15",
            "\1\16\3\12\16\uffff\1\12\25\uffff\12\12\2\uffff\10\12\1\uffff\1\12\3\uffff\2\12",
            "",
            "\1\12\1\uffff\1\15\1\12\1\uffff\1\14\1\12\1\uffff\22\12\33\uffff\2\12\1\uffff\1\15"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "3332:2: (this_OperationCall_0= ruleOperationCall | this_NavigationOrAttributeCall_1= ruleNavigationOrAttributeCall | this_IterateExp_2= ruleIterateExp | this_IteratorExp_3= ruleIteratorExp | this_CollectionOperationCall_4= ruleCollectionOperationCall )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000020A0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000020A0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x1F20000000000010L,0x000000000003F800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xFF3FF000004000F0L,0x0000000000000062L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x7F3FF000004000F0L,0x0000000000000062L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200200002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xFFBFF000004000F0L,0x0000000000000062L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0080000000800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000400000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xFF3FF000014000F0L,0x0000000000000062L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000400L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});

}