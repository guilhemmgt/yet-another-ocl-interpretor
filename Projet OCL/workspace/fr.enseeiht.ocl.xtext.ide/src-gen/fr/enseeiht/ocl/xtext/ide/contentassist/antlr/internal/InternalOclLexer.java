package fr.enseeiht.ocl.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOclLexer extends Lexer {
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
    public static final int RULE_STRING=5;
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

    public InternalOclLexer() {;} 
    public InternalOclLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOclLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalOcl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:11:7: ( 'and' )
            // InternalOcl.g:11:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:12:7: ( 'or' )
            // InternalOcl.g:12:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:13:7: ( 'xor' )
            // InternalOcl.g:13:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:14:7: ( 'implies' )
            // InternalOcl.g:14:9: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:15:7: ( '=' )
            // InternalOcl.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:16:7: ( '<>' )
            // InternalOcl.g:16:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:17:7: ( '>' )
            // InternalOcl.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:18:7: ( '<' )
            // InternalOcl.g:18:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:19:7: ( '>=' )
            // InternalOcl.g:19:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:20:7: ( '<=' )
            // InternalOcl.g:20:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:21:7: ( '-' )
            // InternalOcl.g:21:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:22:7: ( '+' )
            // InternalOcl.g:22:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:23:7: ( 'div' )
            // InternalOcl.g:23:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:24:7: ( 'mod' )
            // InternalOcl.g:24:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:25:7: ( '*' )
            // InternalOcl.g:25:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:26:7: ( '/' )
            // InternalOcl.g:26:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:27:7: ( 'not' )
            // InternalOcl.g:27:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:28:7: ( '->' )
            // InternalOcl.g:28:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:29:7: ( '.' )
            // InternalOcl.g:29:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:30:7: ( 'import' )
            // InternalOcl.g:30:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:31:7: ( 'as' )
            // InternalOcl.g:31:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:32:7: ( 'context' )
            // InternalOcl.g:32:9: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:33:7: ( '!' )
            // InternalOcl.g:33:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:34:7: ( 'def' )
            // InternalOcl.g:34:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:35:7: ( ':' )
            // InternalOcl.g:35:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:36:7: ( '(' )
            // InternalOcl.g:36:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:37:7: ( ')' )
            // InternalOcl.g:37:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:38:7: ( ',' )
            // InternalOcl.g:38:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:39:7: ( 'inv' )
            // InternalOcl.g:39:9: 'inv'
            {
            match("inv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:40:7: ( 'self' )
            // InternalOcl.g:40:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:41:7: ( 'null' )
            // InternalOcl.g:41:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:42:7: ( 'Bag' )
            // InternalOcl.g:42:9: 'Bag'
            {
            match("Bag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:43:7: ( '{' )
            // InternalOcl.g:43:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:44:7: ( '}' )
            // InternalOcl.g:44:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:45:7: ( 'OrderedSet' )
            // InternalOcl.g:45:9: 'OrderedSet'
            {
            match("OrderedSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:46:7: ( 'Sequence' )
            // InternalOcl.g:46:9: 'Sequence'
            {
            match("Sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:47:7: ( 'Set' )
            // InternalOcl.g:47:9: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:48:7: ( 'Tuple' )
            // InternalOcl.g:48:9: 'Tuple'
            {
            match("Tuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:49:7: ( 'Map' )
            // InternalOcl.g:49:9: 'Map'
            {
            match("Map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:50:7: ( '#' )
            // InternalOcl.g:50:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:51:7: ( 'let' )
            // InternalOcl.g:51:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:52:7: ( 'in' )
            // InternalOcl.g:52:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:53:7: ( 'if' )
            // InternalOcl.g:53:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:54:7: ( 'then' )
            // InternalOcl.g:54:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:55:7: ( 'else' )
            // InternalOcl.g:55:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:56:7: ( 'endif' )
            // InternalOcl.g:56:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:57:7: ( 'iterate' )
            // InternalOcl.g:57:9: 'iterate'
            {
            match("iterate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:58:7: ( ';' )
            // InternalOcl.g:58:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:59:7: ( '|' )
            // InternalOcl.g:59:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:60:7: ( 'Collection' )
            // InternalOcl.g:60:9: 'Collection'
            {
            match("Collection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:61:7: ( 'String' )
            // InternalOcl.g:61:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:62:7: ( 'Boolean' )
            // InternalOcl.g:62:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:63:7: ( 'Integer' )
            // InternalOcl.g:63:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:64:7: ( 'Real' )
            // InternalOcl.g:64:9: 'Real'
            {
            match("Real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:65:7: ( 'OclAny' )
            // InternalOcl.g:65:9: 'OclAny'
            {
            match("OclAny"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:66:7: ( 'OclVoid' )
            // InternalOcl.g:66:9: 'OclVoid'
            {
            match("OclVoid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:67:7: ( 'true' )
            // InternalOcl.g:67:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:68:7: ( 'false' )
            // InternalOcl.g:68:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:11701:13: ( ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' ) ( 'e' ( '-' | '+' ) RULE_INT )? )
            // InternalOcl.g:11701:15: ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' ) ( 'e' ( '-' | '+' ) RULE_INT )?
            {
            // InternalOcl.g:11701:15: ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalOcl.g:11701:16: RULE_INT '.' RULE_INT
                    {
                    mRULE_INT(); 
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalOcl.g:11701:38: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;
                case 3 :
                    // InternalOcl.g:11701:51: RULE_INT '.'
                    {
                    mRULE_INT(); 
                    match('.'); 

                    }
                    break;

            }

            // InternalOcl.g:11701:65: ( 'e' ( '-' | '+' ) RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='e') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOcl.g:11701:66: 'e' ( '-' | '+' ) RULE_INT
                    {
                    match('e'); 
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:11703:17: ( '--' ( . )* '\\n' )
            // InternalOcl.g:11703:19: '--' ( . )* '\\n'
            {
            match("--"); 

            // InternalOcl.g:11703:24: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOcl.g:11703:24: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:11705:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOcl.g:11705:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOcl.g:11705:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOcl.g:11705:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalOcl.g:11705:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOcl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:11707:10: ( ( '0' .. '9' )+ )
            // InternalOcl.g:11707:12: ( '0' .. '9' )+
            {
            // InternalOcl.g:11707:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOcl.g:11707:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:11709:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalOcl.g:11709:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalOcl.g:11709:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOcl.g:11709:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalOcl.g:11709:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalOcl.g:11709:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOcl.g:11709:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalOcl.g:11709:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalOcl.g:11709:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalOcl.g:11709:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOcl.g:11709:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:11711:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOcl.g:11711:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOcl.g:11711:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOcl.g:11711:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:11713:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOcl.g:11713:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOcl.g:11713:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOcl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOcl.g:11715:16: ( . )
            // InternalOcl.g:11715:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalOcl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | RULE_DOUBLE | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=66;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalOcl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalOcl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalOcl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalOcl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalOcl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalOcl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalOcl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalOcl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalOcl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalOcl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalOcl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalOcl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalOcl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalOcl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalOcl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalOcl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalOcl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalOcl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalOcl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalOcl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalOcl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalOcl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalOcl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalOcl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalOcl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalOcl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalOcl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalOcl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalOcl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalOcl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalOcl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalOcl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalOcl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalOcl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalOcl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalOcl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalOcl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalOcl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalOcl.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalOcl.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalOcl.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalOcl.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalOcl.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalOcl.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalOcl.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalOcl.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalOcl.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalOcl.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalOcl.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalOcl.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalOcl.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalOcl.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // InternalOcl.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // InternalOcl.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // InternalOcl.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // InternalOcl.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // InternalOcl.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // InternalOcl.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // InternalOcl.g:1:358: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 60 :
                // InternalOcl.g:1:370: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 61 :
                // InternalOcl.g:1:386: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 62 :
                // InternalOcl.g:1:394: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 63 :
                // InternalOcl.g:1:403: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 64 :
                // InternalOcl.g:1:415: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 65 :
                // InternalOcl.g:1:431: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 66 :
                // InternalOcl.g:1:439: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA1_eotS =
        "\3\uffff\1\5\2\uffff";
    static final String DFA1_eofS =
        "\6\uffff";
    static final String DFA1_minS =
        "\2\56\1\uffff\1\60\2\uffff";
    static final String DFA1_maxS =
        "\2\71\1\uffff\1\71\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\3";
    static final String DFA1_specialS =
        "\6\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "\12\4",
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

    class DFA1 extends DFA {

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
        public String getDescription() {
            return "11701:15: ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' )";
        }
    }
    static final String DFA12_eotS =
        "\1\uffff\4\61\1\uffff\1\73\1\75\1\100\1\uffff\2\61\1\uffff\1\107\1\61\1\112\1\61\5\uffff\2\61\2\uffff\4\61\1\uffff\3\61\2\uffff\4\61\1\151\1\56\1\uffff\2\56\2\uffff\1\61\1\156\1\uffff\1\157\2\61\1\163\1\164\1\61\12\uffff\3\61\3\uffff\2\61\2\uffff\1\61\5\uffff\3\61\2\uffff\6\61\1\uffff\5\61\2\uffff\4\61\1\uffff\1\151\2\uffff\1\u008f\2\uffff\1\u0090\1\61\1\u0093\2\uffff\1\61\1\u0095\1\u0096\1\u0097\1\u0098\3\61\1\u009c\4\61\1\u00a2\2\61\1\u00a5\1\u00a6\10\61\2\uffff\2\61\1\uffff\1\61\4\uffff\1\u00b2\1\61\1\u00b4\1\uffff\5\61\1\uffff\2\61\2\uffff\1\u00bc\1\u00bd\1\u00be\3\61\1\u00c2\4\61\1\uffff\1\61\1\uffff\6\61\1\u00ce\3\uffff\1\u00cf\2\61\1\uffff\1\u00d2\1\61\1\u00d4\4\61\1\u00d9\2\61\1\u00dc\2\uffff\2\61\1\uffff\1\u00df\1\uffff\1\u00e0\1\u00e1\1\u00e2\1\61\1\uffff\1\u00e4\1\61\1\uffff\1\61\1\u00e7\4\uffff\1\61\1\uffff\1\u00e9\1\61\1\uffff\1\61\1\uffff\1\61\1\u00ed\1\u00ee\2\uffff";
    static final String DFA12_eofS =
        "\u00ef\uffff";
    static final String DFA12_minS =
        "\1\0\1\156\1\162\1\157\1\146\1\uffff\2\75\1\55\1\uffff\1\145\1\157\1\uffff\1\52\1\157\1\60\1\157\5\uffff\1\145\1\141\2\uffff\1\143\1\145\1\165\1\141\1\uffff\1\145\1\150\1\154\2\uffff\1\157\1\156\1\145\1\141\1\56\1\101\1\uffff\2\0\2\uffff\1\144\1\60\1\uffff\1\60\1\162\1\160\2\60\1\145\12\uffff\1\166\1\146\1\144\3\uffff\1\164\1\154\2\uffff\1\156\5\uffff\1\154\1\147\1\157\2\uffff\1\144\1\154\1\161\1\162\2\160\1\uffff\1\164\1\145\1\165\1\163\1\144\2\uffff\1\154\1\164\1\141\1\154\1\uffff\1\56\2\uffff\1\60\2\uffff\1\60\1\154\1\60\2\uffff\1\162\4\60\1\154\1\164\1\146\1\60\1\154\1\145\1\101\1\165\1\60\1\151\1\154\2\60\1\156\2\145\1\151\1\154\1\145\1\154\1\163\2\uffff\1\151\1\162\1\uffff\1\141\4\uffff\1\60\1\145\1\60\1\uffff\1\145\1\162\1\156\1\157\1\145\1\uffff\1\156\1\145\2\uffff\3\60\1\146\1\145\1\147\1\60\2\145\2\164\1\uffff\1\170\1\uffff\1\141\1\145\1\171\1\151\1\156\1\147\1\60\3\uffff\1\60\1\143\1\145\1\uffff\1\60\1\163\1\60\1\145\1\164\1\156\1\144\1\60\1\144\1\143\1\60\2\uffff\1\164\1\162\1\uffff\1\60\1\uffff\3\60\1\123\1\uffff\1\60\1\145\1\uffff\1\151\1\60\4\uffff\1\145\1\uffff\1\60\1\157\1\uffff\1\164\1\uffff\1\156\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\163\1\162\1\157\1\164\1\uffff\1\76\1\75\1\76\1\uffff\1\151\1\157\1\uffff\1\52\1\165\1\71\1\157\5\uffff\1\145\1\157\2\uffff\1\162\1\164\1\165\1\141\1\uffff\1\145\1\162\1\156\2\uffff\1\157\1\156\1\145\1\141\1\71\1\172\1\uffff\2\uffff\2\uffff\1\144\1\172\1\uffff\1\172\1\162\1\160\2\172\1\145\12\uffff\1\166\1\146\1\144\3\uffff\1\164\1\154\2\uffff\1\156\5\uffff\1\154\1\147\1\157\2\uffff\1\144\1\154\1\164\1\162\2\160\1\uffff\1\164\1\145\1\165\1\163\1\144\2\uffff\1\154\1\164\1\141\1\154\1\uffff\1\71\2\uffff\1\172\2\uffff\1\172\1\157\1\172\2\uffff\1\162\4\172\1\154\1\164\1\146\1\172\1\154\1\145\1\126\1\165\1\172\1\151\1\154\2\172\1\156\2\145\1\151\1\154\1\145\1\154\1\163\2\uffff\1\151\1\162\1\uffff\1\141\4\uffff\1\172\1\145\1\172\1\uffff\1\145\1\162\1\156\1\157\1\145\1\uffff\1\156\1\145\2\uffff\3\172\1\146\1\145\1\147\1\172\2\145\2\164\1\uffff\1\170\1\uffff\1\141\1\145\1\171\1\151\1\156\1\147\1\172\3\uffff\1\172\1\143\1\145\1\uffff\1\172\1\163\1\172\1\145\1\164\1\156\1\144\1\172\1\144\1\143\1\172\2\uffff\1\164\1\162\1\uffff\1\172\1\uffff\3\172\1\123\1\uffff\1\172\1\145\1\uffff\1\151\1\172\4\uffff\1\145\1\uffff\1\172\1\157\1\uffff\1\164\1\uffff\1\156\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\5\3\uffff\1\14\2\uffff\1\17\4\uffff\1\27\1\31\1\32\1\33\1\34\2\uffff\1\41\1\42\4\uffff\1\50\3\uffff\1\60\1\61\6\uffff\1\75\2\uffff\1\101\1\102\2\uffff\1\75\6\uffff\1\5\1\6\1\12\1\10\1\11\1\7\1\22\1\74\1\13\1\14\3\uffff\1\17\1\100\1\20\2\uffff\1\23\1\73\1\uffff\1\27\1\31\1\32\1\33\1\34\3\uffff\1\41\1\42\6\uffff\1\50\5\uffff\1\60\1\61\4\uffff\1\76\1\uffff\1\77\1\101\1\uffff\1\25\1\2\3\uffff\1\52\1\53\32\uffff\1\1\1\3\2\uffff\1\35\1\uffff\1\15\1\30\1\16\1\21\3\uffff\1\40\5\uffff\1\45\2\uffff\1\47\1\51\13\uffff\1\37\1\uffff\1\36\7\uffff\1\54\1\71\1\55\3\uffff\1\66\13\uffff\1\46\1\56\2\uffff\1\72\1\uffff\1\24\4\uffff\1\67\2\uffff\1\63\2\uffff\1\4\1\57\1\26\1\64\1\uffff\1\70\2\uffff\1\65\1\uffff\1\44\3\uffff\1\43\1\62";
    static final String DFA12_specialS =
        "\1\2\52\uffff\1\0\1\1\u00c2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\21\1\53\1\36\3\56\1\54\1\23\1\24\1\14\1\11\1\25\1\10\1\17\1\15\12\50\1\22\1\42\1\6\1\5\1\7\2\56\1\52\1\27\1\44\5\52\1\45\3\52\1\35\1\52\1\32\2\52\1\46\1\33\1\34\6\52\3\56\1\51\1\52\1\56\1\1\1\52\1\20\1\12\1\41\1\47\2\52\1\4\2\52\1\37\1\13\1\16\1\2\3\52\1\26\1\40\3\52\1\3\2\52\1\30\1\43\1\31\uff82\56",
            "\1\57\4\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\66\6\uffff\1\64\1\65\5\uffff\1\67",
            "",
            "\1\72\1\71",
            "\1\74",
            "\1\77\20\uffff\1\76",
            "",
            "\1\103\3\uffff\1\102",
            "\1\104",
            "",
            "\1\106",
            "\1\110\5\uffff\1\111",
            "\12\113",
            "\1\114",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\123\15\uffff\1\124",
            "",
            "",
            "\1\130\16\uffff\1\127",
            "\1\131\16\uffff\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\136",
            "\1\137\11\uffff\1\140",
            "\1\141\1\uffff\1\142",
            "",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\113\1\uffff\12\152",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\0\153",
            "\0\153",
            "",
            "",
            "\1\155",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\160",
            "\1\161",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\25\61\1\162\4\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\165",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "",
            "",
            "\1\171",
            "\1\172",
            "",
            "",
            "\1\173",
            "",
            "",
            "",
            "",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081\2\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\113\1\uffff\12\152",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0091\2\uffff\1\u0092",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u0094",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f\24\uffff\1\u00a0",
            "\1\u00a1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00a3",
            "\1\u00a4",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00b3",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00d3",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00da",
            "\1\u00db",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e3",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "\1\u00e8",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | RULE_DOUBLE | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_43 = input.LA(1);

                        s = -1;
                        if ( ((LA12_43>='\u0000' && LA12_43<='\uFFFF')) ) {s = 107;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( ((LA12_44>='\u0000' && LA12_44<='\uFFFF')) ) {s = 107;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='a') ) {s = 1;}

                        else if ( (LA12_0=='o') ) {s = 2;}

                        else if ( (LA12_0=='x') ) {s = 3;}

                        else if ( (LA12_0=='i') ) {s = 4;}

                        else if ( (LA12_0=='=') ) {s = 5;}

                        else if ( (LA12_0=='<') ) {s = 6;}

                        else if ( (LA12_0=='>') ) {s = 7;}

                        else if ( (LA12_0=='-') ) {s = 8;}

                        else if ( (LA12_0=='+') ) {s = 9;}

                        else if ( (LA12_0=='d') ) {s = 10;}

                        else if ( (LA12_0=='m') ) {s = 11;}

                        else if ( (LA12_0=='*') ) {s = 12;}

                        else if ( (LA12_0=='/') ) {s = 13;}

                        else if ( (LA12_0=='n') ) {s = 14;}

                        else if ( (LA12_0=='.') ) {s = 15;}

                        else if ( (LA12_0=='c') ) {s = 16;}

                        else if ( (LA12_0=='!') ) {s = 17;}

                        else if ( (LA12_0==':') ) {s = 18;}

                        else if ( (LA12_0=='(') ) {s = 19;}

                        else if ( (LA12_0==')') ) {s = 20;}

                        else if ( (LA12_0==',') ) {s = 21;}

                        else if ( (LA12_0=='s') ) {s = 22;}

                        else if ( (LA12_0=='B') ) {s = 23;}

                        else if ( (LA12_0=='{') ) {s = 24;}

                        else if ( (LA12_0=='}') ) {s = 25;}

                        else if ( (LA12_0=='O') ) {s = 26;}

                        else if ( (LA12_0=='S') ) {s = 27;}

                        else if ( (LA12_0=='T') ) {s = 28;}

                        else if ( (LA12_0=='M') ) {s = 29;}

                        else if ( (LA12_0=='#') ) {s = 30;}

                        else if ( (LA12_0=='l') ) {s = 31;}

                        else if ( (LA12_0=='t') ) {s = 32;}

                        else if ( (LA12_0=='e') ) {s = 33;}

                        else if ( (LA12_0==';') ) {s = 34;}

                        else if ( (LA12_0=='|') ) {s = 35;}

                        else if ( (LA12_0=='C') ) {s = 36;}

                        else if ( (LA12_0=='I') ) {s = 37;}

                        else if ( (LA12_0=='R') ) {s = 38;}

                        else if ( (LA12_0=='f') ) {s = 39;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 40;}

                        else if ( (LA12_0=='^') ) {s = 41;}

                        else if ( (LA12_0=='A'||(LA12_0>='D' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='L')||LA12_0=='N'||(LA12_0>='P' && LA12_0<='Q')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='p' && LA12_0<='r')||(LA12_0>='u' && LA12_0<='w')||(LA12_0>='y' && LA12_0<='z')) ) {s = 42;}

                        else if ( (LA12_0=='\"') ) {s = 43;}

                        else if ( (LA12_0=='\'') ) {s = 44;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 45;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='$' && LA12_0<='&')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}