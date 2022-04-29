package no.hal.bdd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import no.hal.bdd.services.BddDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBddDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'using'", "'entity'", "'is'", "','", "'{'", "'actions:'", "'states:'", "'properties:'", "'}'", "'['", "']'", "'on'", "'in'", "'from'", "'to'", "'into'", "'/'", "'*'", "'Scenario:'", "'given'", "'when'", "'I'", "'then'", "'and'", "'#'", "'the'", "'of'", "'are'", "'true'", "'yes'", "'false'", "'no'", "'assure'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBddDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBddDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBddDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBddDsl.g"; }



     	private BddDslGrammarAccess grammarAccess;

        public InternalBddDslParser(TokenStream input, BddDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BddDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBddDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBddDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBddDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBddDsl.g:71:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_entityDefs_3_0= ruleEntityDef ) ) | ( (lv_scenarios_4_0= ruleScenario ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_modelRefs_2_0 = null;

        EObject lv_entityDefs_3_0 = null;

        EObject lv_scenarios_4_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:77:2: ( ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_entityDefs_3_0= ruleEntityDef ) ) | ( (lv_scenarios_4_0= ruleScenario ) ) )* ) )
            // InternalBddDsl.g:78:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_entityDefs_3_0= ruleEntityDef ) ) | ( (lv_scenarios_4_0= ruleScenario ) ) )* )
            {
            // InternalBddDsl.g:78:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_entityDefs_3_0= ruleEntityDef ) ) | ( (lv_scenarios_4_0= ruleScenario ) ) )* )
            // InternalBddDsl.g:79:3: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_entityDefs_3_0= ruleEntityDef ) ) | ( (lv_scenarios_4_0= ruleScenario ) ) )*
            {
            // InternalBddDsl.g:79:3: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBddDsl.g:80:4: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0_0());
            			
            // InternalBddDsl.g:84:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalBddDsl.g:85:5: (lv_name_1_0= RULE_ID )
            {
            // InternalBddDsl.g:85:5: (lv_name_1_0= RULE_ID )
            // InternalBddDsl.g:86:6: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            						newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getModelRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_1_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }


            }

            // InternalBddDsl.g:103:3: ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_entityDefs_3_0= ruleEntityDef ) ) | ( (lv_scenarios_4_0= ruleScenario ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt1=1;
                    }
                    break;
                case 13:
                    {
                    alt1=2;
                    }
                    break;
                case 30:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalBddDsl.g:104:4: ( (lv_modelRefs_2_0= ruleModelRef ) )
            	    {
            	    // InternalBddDsl.g:104:4: ( (lv_modelRefs_2_0= ruleModelRef ) )
            	    // InternalBddDsl.g:105:5: (lv_modelRefs_2_0= ruleModelRef )
            	    {
            	    // InternalBddDsl.g:105:5: (lv_modelRefs_2_0= ruleModelRef )
            	    // InternalBddDsl.g:106:6: lv_modelRefs_2_0= ruleModelRef
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getModelRefsModelRefParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_modelRefs_2_0=ruleModelRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modelRefs",
            	    							lv_modelRefs_2_0,
            	    							"no.hal.bdd.BddDsl.ModelRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBddDsl.g:124:4: ( (lv_entityDefs_3_0= ruleEntityDef ) )
            	    {
            	    // InternalBddDsl.g:124:4: ( (lv_entityDefs_3_0= ruleEntityDef ) )
            	    // InternalBddDsl.g:125:5: (lv_entityDefs_3_0= ruleEntityDef )
            	    {
            	    // InternalBddDsl.g:125:5: (lv_entityDefs_3_0= ruleEntityDef )
            	    // InternalBddDsl.g:126:6: lv_entityDefs_3_0= ruleEntityDef
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getEntityDefsEntityDefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_entityDefs_3_0=ruleEntityDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entityDefs",
            	    							lv_entityDefs_3_0,
            	    							"no.hal.bdd.BddDsl.EntityDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBddDsl.g:144:4: ( (lv_scenarios_4_0= ruleScenario ) )
            	    {
            	    // InternalBddDsl.g:144:4: ( (lv_scenarios_4_0= ruleScenario ) )
            	    // InternalBddDsl.g:145:5: (lv_scenarios_4_0= ruleScenario )
            	    {
            	    // InternalBddDsl.g:145:5: (lv_scenarios_4_0= ruleScenario )
            	    // InternalBddDsl.g:146:6: lv_scenarios_4_0= ruleScenario
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getScenariosScenarioParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_scenarios_4_0=ruleScenario();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"scenarios",
            	    							lv_scenarios_4_0,
            	    							"no.hal.bdd.BddDsl.Scenario");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelRef"
    // InternalBddDsl.g:168:1: entryRuleModelRef returns [EObject current=null] : iv_ruleModelRef= ruleModelRef EOF ;
    public final EObject entryRuleModelRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelRef = null;


        try {
            // InternalBddDsl.g:168:49: (iv_ruleModelRef= ruleModelRef EOF )
            // InternalBddDsl.g:169:2: iv_ruleModelRef= ruleModelRef EOF
            {
             newCompositeNode(grammarAccess.getModelRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelRef=ruleModelRef();

            state._fsp--;

             current =iv_ruleModelRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelRef"


    // $ANTLR start "ruleModelRef"
    // InternalBddDsl.g:175:1: ruleModelRef returns [EObject current=null] : (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleModelRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBddDsl.g:181:2: ( (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBddDsl.g:182:2: (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBddDsl.g:182:2: (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) )
            // InternalBddDsl.g:183:3: otherlv_0= 'using' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelRefAccess().getUsingKeyword_0());
            		
            // InternalBddDsl.g:187:3: ( (otherlv_1= RULE_ID ) )
            // InternalBddDsl.g:188:4: (otherlv_1= RULE_ID )
            {
            // InternalBddDsl.g:188:4: (otherlv_1= RULE_ID )
            // InternalBddDsl.g:189:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getModelRefAccess().getModelRefModelCrossReference_1_0());
            				

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
    // $ANTLR end "ruleModelRef"


    // $ANTLR start "entryRuleEntityDef"
    // InternalBddDsl.g:204:1: entryRuleEntityDef returns [EObject current=null] : iv_ruleEntityDef= ruleEntityDef EOF ;
    public final EObject entryRuleEntityDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDef = null;


        try {
            // InternalBddDsl.g:204:50: (iv_ruleEntityDef= ruleEntityDef EOF )
            // InternalBddDsl.g:205:2: iv_ruleEntityDef= ruleEntityDef EOF
            {
             newCompositeNode(grammarAccess.getEntityDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityDef=ruleEntityDef();

            state._fsp--;

             current =iv_ruleEntityDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityDef"


    // $ANTLR start "ruleEntityDef"
    // InternalBddDsl.g:211:1: ruleEntityDef returns [EObject current=null] : (otherlv_0= 'entity' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) (otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' (otherlv_7= 'actions:' ( (lv_actions_8_0= ruleActionDef ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleActionDef ) ) )* )? (otherlv_11= 'states:' ( (lv_states_12_0= ruleStateDef ) ) (otherlv_13= ',' ( (lv_states_14_0= ruleStateDef ) ) )* )? (otherlv_15= 'properties:' ( (lv_properties_16_0= rulePropertyDef ) ) (otherlv_17= ',' ( (lv_properties_18_0= rulePropertyDef ) ) )* )? otherlv_19= '}' ) ;
    public final EObject ruleEntityDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_actions_8_0 = null;

        EObject lv_actions_10_0 = null;

        EObject lv_states_12_0 = null;

        EObject lv_states_14_0 = null;

        EObject lv_properties_16_0 = null;

        EObject lv_properties_18_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:217:2: ( (otherlv_0= 'entity' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) (otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' (otherlv_7= 'actions:' ( (lv_actions_8_0= ruleActionDef ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleActionDef ) ) )* )? (otherlv_11= 'states:' ( (lv_states_12_0= ruleStateDef ) ) (otherlv_13= ',' ( (lv_states_14_0= ruleStateDef ) ) )* )? (otherlv_15= 'properties:' ( (lv_properties_16_0= rulePropertyDef ) ) (otherlv_17= ',' ( (lv_properties_18_0= rulePropertyDef ) ) )* )? otherlv_19= '}' ) )
            // InternalBddDsl.g:218:2: (otherlv_0= 'entity' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) (otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' (otherlv_7= 'actions:' ( (lv_actions_8_0= ruleActionDef ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleActionDef ) ) )* )? (otherlv_11= 'states:' ( (lv_states_12_0= ruleStateDef ) ) (otherlv_13= ',' ( (lv_states_14_0= ruleStateDef ) ) )* )? (otherlv_15= 'properties:' ( (lv_properties_16_0= rulePropertyDef ) ) (otherlv_17= ',' ( (lv_properties_18_0= rulePropertyDef ) ) )* )? otherlv_19= '}' )
            {
            // InternalBddDsl.g:218:2: (otherlv_0= 'entity' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) (otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' (otherlv_7= 'actions:' ( (lv_actions_8_0= ruleActionDef ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleActionDef ) ) )* )? (otherlv_11= 'states:' ( (lv_states_12_0= ruleStateDef ) ) (otherlv_13= ',' ( (lv_states_14_0= ruleStateDef ) ) )* )? (otherlv_15= 'properties:' ( (lv_properties_16_0= rulePropertyDef ) ) (otherlv_17= ',' ( (lv_properties_18_0= rulePropertyDef ) ) )* )? otherlv_19= '}' )
            // InternalBddDsl.g:219:3: otherlv_0= 'entity' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) (otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' (otherlv_7= 'actions:' ( (lv_actions_8_0= ruleActionDef ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleActionDef ) ) )* )? (otherlv_11= 'states:' ( (lv_states_12_0= ruleStateDef ) ) (otherlv_13= ',' ( (lv_states_14_0= ruleStateDef ) ) )* )? (otherlv_15= 'properties:' ( (lv_properties_16_0= rulePropertyDef ) ) (otherlv_17= ',' ( (lv_properties_18_0= rulePropertyDef ) ) )* )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityDefAccess().getEntityKeyword_0());
            		
            // InternalBddDsl.g:223:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) )
            // InternalBddDsl.g:224:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) )
            {
            // InternalBddDsl.g:224:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) )
            // InternalBddDsl.g:225:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING )
            {
            // InternalBddDsl.g:225:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBddDsl.g:226:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getEntityDefAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityDefRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:241:6: lv_name_1_2= RULE_STRING
                    {
                    lv_name_1_2=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getEntityDefAccess().getNameSTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityDefRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalBddDsl.g:258:3: (otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBddDsl.g:259:4: otherlv_2= 'is' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityDefAccess().getIsKeyword_2_0());
                    			
                    // InternalBddDsl.g:263:4: ( (otherlv_3= RULE_ID ) )
                    // InternalBddDsl.g:264:5: (otherlv_3= RULE_ID )
                    {
                    // InternalBddDsl.g:264:5: (otherlv_3= RULE_ID )
                    // InternalBddDsl.g:265:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityDefRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityDefAccess().getSuperEntitiesEntityDefCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalBddDsl.g:276:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalBddDsl.g:277:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEntityDefAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBddDsl.g:281:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalBddDsl.g:282:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalBddDsl.g:282:6: (otherlv_5= RULE_ID )
                    	    // InternalBddDsl.g:283:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEntityDefRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getEntityDefAccess().getSuperEntitiesEntityDefCrossReference_2_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityDefAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBddDsl.g:300:3: (otherlv_7= 'actions:' ( (lv_actions_8_0= ruleActionDef ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleActionDef ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBddDsl.g:301:4: otherlv_7= 'actions:' ( (lv_actions_8_0= ruleActionDef ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleActionDef ) ) )*
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntityDefAccess().getActionsKeyword_4_0());
                    			
                    // InternalBddDsl.g:305:4: ( (lv_actions_8_0= ruleActionDef ) )
                    // InternalBddDsl.g:306:5: (lv_actions_8_0= ruleActionDef )
                    {
                    // InternalBddDsl.g:306:5: (lv_actions_8_0= ruleActionDef )
                    // InternalBddDsl.g:307:6: lv_actions_8_0= ruleActionDef
                    {

                    						newCompositeNode(grammarAccess.getEntityDefAccess().getActionsActionDefParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_actions_8_0=ruleActionDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_8_0,
                    							"no.hal.bdd.BddDsl.ActionDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:324:4: (otherlv_9= ',' ( (lv_actions_10_0= ruleActionDef ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBddDsl.g:325:5: otherlv_9= ',' ( (lv_actions_10_0= ruleActionDef ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEntityDefAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalBddDsl.g:329:5: ( (lv_actions_10_0= ruleActionDef ) )
                    	    // InternalBddDsl.g:330:6: (lv_actions_10_0= ruleActionDef )
                    	    {
                    	    // InternalBddDsl.g:330:6: (lv_actions_10_0= ruleActionDef )
                    	    // InternalBddDsl.g:331:7: lv_actions_10_0= ruleActionDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityDefAccess().getActionsActionDefParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_actions_10_0=ruleActionDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_10_0,
                    	    								"no.hal.bdd.BddDsl.ActionDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBddDsl.g:350:3: (otherlv_11= 'states:' ( (lv_states_12_0= ruleStateDef ) ) (otherlv_13= ',' ( (lv_states_14_0= ruleStateDef ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBddDsl.g:351:4: otherlv_11= 'states:' ( (lv_states_12_0= ruleStateDef ) ) (otherlv_13= ',' ( (lv_states_14_0= ruleStateDef ) ) )*
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntityDefAccess().getStatesKeyword_5_0());
                    			
                    // InternalBddDsl.g:355:4: ( (lv_states_12_0= ruleStateDef ) )
                    // InternalBddDsl.g:356:5: (lv_states_12_0= ruleStateDef )
                    {
                    // InternalBddDsl.g:356:5: (lv_states_12_0= ruleStateDef )
                    // InternalBddDsl.g:357:6: lv_states_12_0= ruleStateDef
                    {

                    						newCompositeNode(grammarAccess.getEntityDefAccess().getStatesStateDefParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_states_12_0=ruleStateDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_12_0,
                    							"no.hal.bdd.BddDsl.StateDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:374:4: (otherlv_13= ',' ( (lv_states_14_0= ruleStateDef ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBddDsl.g:375:5: otherlv_13= ',' ( (lv_states_14_0= ruleStateDef ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEntityDefAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalBddDsl.g:379:5: ( (lv_states_14_0= ruleStateDef ) )
                    	    // InternalBddDsl.g:380:6: (lv_states_14_0= ruleStateDef )
                    	    {
                    	    // InternalBddDsl.g:380:6: (lv_states_14_0= ruleStateDef )
                    	    // InternalBddDsl.g:381:7: lv_states_14_0= ruleStateDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityDefAccess().getStatesStateDefParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_states_14_0=ruleStateDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"states",
                    	    								lv_states_14_0,
                    	    								"no.hal.bdd.BddDsl.StateDef");
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

            // InternalBddDsl.g:400:3: (otherlv_15= 'properties:' ( (lv_properties_16_0= rulePropertyDef ) ) (otherlv_17= ',' ( (lv_properties_18_0= rulePropertyDef ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBddDsl.g:401:4: otherlv_15= 'properties:' ( (lv_properties_16_0= rulePropertyDef ) ) (otherlv_17= ',' ( (lv_properties_18_0= rulePropertyDef ) ) )*
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getEntityDefAccess().getPropertiesKeyword_6_0());
                    			
                    // InternalBddDsl.g:405:4: ( (lv_properties_16_0= rulePropertyDef ) )
                    // InternalBddDsl.g:406:5: (lv_properties_16_0= rulePropertyDef )
                    {
                    // InternalBddDsl.g:406:5: (lv_properties_16_0= rulePropertyDef )
                    // InternalBddDsl.g:407:6: lv_properties_16_0= rulePropertyDef
                    {

                    						newCompositeNode(grammarAccess.getEntityDefAccess().getPropertiesPropertyDefParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_properties_16_0=rulePropertyDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_16_0,
                    							"no.hal.bdd.BddDsl.PropertyDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:424:4: (otherlv_17= ',' ( (lv_properties_18_0= rulePropertyDef ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBddDsl.g:425:5: otherlv_17= ',' ( (lv_properties_18_0= rulePropertyDef ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEntityDefAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalBddDsl.g:429:5: ( (lv_properties_18_0= rulePropertyDef ) )
                    	    // InternalBddDsl.g:430:6: (lv_properties_18_0= rulePropertyDef )
                    	    {
                    	    // InternalBddDsl.g:430:6: (lv_properties_18_0= rulePropertyDef )
                    	    // InternalBddDsl.g:431:7: lv_properties_18_0= rulePropertyDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityDefAccess().getPropertiesPropertyDefParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_properties_18_0=rulePropertyDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_18_0,
                    	    								"no.hal.bdd.BddDsl.PropertyDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getEntityDefAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityDef"


    // $ANTLR start "entryRuleActionDef"
    // InternalBddDsl.g:458:1: entryRuleActionDef returns [EObject current=null] : iv_ruleActionDef= ruleActionDef EOF ;
    public final EObject entryRuleActionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDef = null;


        try {
            // InternalBddDsl.g:458:50: (iv_ruleActionDef= ruleActionDef EOF )
            // InternalBddDsl.g:459:2: iv_ruleActionDef= ruleActionDef EOF
            {
             newCompositeNode(grammarAccess.getActionDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionDef=ruleActionDef();

            state._fsp--;

             current =iv_ruleActionDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionDef"


    // $ANTLR start "ruleActionDef"
    // InternalBddDsl.g:465:1: ruleActionDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_argument_1_0= ruleWORD ) )? ( ( (lv_preposition_2_0= rulePREP ) )? | ( ( (lv_optionalPref_3_0= '[' ) ) ( (lv_preposition_4_0= rulePREP ) ) otherlv_5= ']' ) ) ) ;
    public final EObject ruleActionDef() throws RecognitionException {
        EObject current = null;

        Token lv_optionalPref_3_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_argument_1_0 = null;

        AntlrDatatypeRuleToken lv_preposition_2_0 = null;

        AntlrDatatypeRuleToken lv_preposition_4_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:471:2: ( ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_argument_1_0= ruleWORD ) )? ( ( (lv_preposition_2_0= rulePREP ) )? | ( ( (lv_optionalPref_3_0= '[' ) ) ( (lv_preposition_4_0= rulePREP ) ) otherlv_5= ']' ) ) ) )
            // InternalBddDsl.g:472:2: ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_argument_1_0= ruleWORD ) )? ( ( (lv_preposition_2_0= rulePREP ) )? | ( ( (lv_optionalPref_3_0= '[' ) ) ( (lv_preposition_4_0= rulePREP ) ) otherlv_5= ']' ) ) )
            {
            // InternalBddDsl.g:472:2: ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_argument_1_0= ruleWORD ) )? ( ( (lv_preposition_2_0= rulePREP ) )? | ( ( (lv_optionalPref_3_0= '[' ) ) ( (lv_preposition_4_0= rulePREP ) ) otherlv_5= ']' ) ) )
            // InternalBddDsl.g:473:3: ( (lv_name_0_0= ruleWORD ) ) ( (lv_argument_1_0= ruleWORD ) )? ( ( (lv_preposition_2_0= rulePREP ) )? | ( ( (lv_optionalPref_3_0= '[' ) ) ( (lv_preposition_4_0= rulePREP ) ) otherlv_5= ']' ) )
            {
            // InternalBddDsl.g:473:3: ( (lv_name_0_0= ruleWORD ) )
            // InternalBddDsl.g:474:4: (lv_name_0_0= ruleWORD )
            {
            // InternalBddDsl.g:474:4: (lv_name_0_0= ruleWORD )
            // InternalBddDsl.g:475:5: lv_name_0_0= ruleWORD
            {

            					newCompositeNode(grammarAccess.getActionDefAccess().getNameWORDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_0_0=ruleWORD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"no.hal.bdd.BddDsl.WORD");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:492:3: ( (lv_argument_1_0= ruleWORD ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBddDsl.g:493:4: (lv_argument_1_0= ruleWORD )
                    {
                    // InternalBddDsl.g:493:4: (lv_argument_1_0= ruleWORD )
                    // InternalBddDsl.g:494:5: lv_argument_1_0= ruleWORD
                    {

                    					newCompositeNode(grammarAccess.getActionDefAccess().getArgumentWORDParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_argument_1_0=ruleWORD();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionDefRule());
                    					}
                    					set(
                    						current,
                    						"argument",
                    						lv_argument_1_0,
                    						"no.hal.bdd.BddDsl.WORD");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:511:3: ( ( (lv_preposition_2_0= rulePREP ) )? | ( ( (lv_optionalPref_3_0= '[' ) ) ( (lv_preposition_4_0= rulePREP ) ) otherlv_5= ']' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EOF||LA13_0==15||(LA13_0>=18 && LA13_0<=20)||(LA13_0>=23 && LA13_0<=27)) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBddDsl.g:512:4: ( (lv_preposition_2_0= rulePREP ) )?
                    {
                    // InternalBddDsl.g:512:4: ( (lv_preposition_2_0= rulePREP ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=23 && LA12_0<=27)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalBddDsl.g:513:5: (lv_preposition_2_0= rulePREP )
                            {
                            // InternalBddDsl.g:513:5: (lv_preposition_2_0= rulePREP )
                            // InternalBddDsl.g:514:6: lv_preposition_2_0= rulePREP
                            {

                            						newCompositeNode(grammarAccess.getActionDefAccess().getPrepositionPREPParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_preposition_2_0=rulePREP();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getActionDefRule());
                            						}
                            						set(
                            							current,
                            							"preposition",
                            							lv_preposition_2_0,
                            							"no.hal.bdd.BddDsl.PREP");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:532:4: ( ( (lv_optionalPref_3_0= '[' ) ) ( (lv_preposition_4_0= rulePREP ) ) otherlv_5= ']' )
                    {
                    // InternalBddDsl.g:532:4: ( ( (lv_optionalPref_3_0= '[' ) ) ( (lv_preposition_4_0= rulePREP ) ) otherlv_5= ']' )
                    // InternalBddDsl.g:533:5: ( (lv_optionalPref_3_0= '[' ) ) ( (lv_preposition_4_0= rulePREP ) ) otherlv_5= ']'
                    {
                    // InternalBddDsl.g:533:5: ( (lv_optionalPref_3_0= '[' ) )
                    // InternalBddDsl.g:534:6: (lv_optionalPref_3_0= '[' )
                    {
                    // InternalBddDsl.g:534:6: (lv_optionalPref_3_0= '[' )
                    // InternalBddDsl.g:535:7: lv_optionalPref_3_0= '['
                    {
                    lv_optionalPref_3_0=(Token)match(input,21,FOLLOW_14); 

                    							newLeafNode(lv_optionalPref_3_0, grammarAccess.getActionDefAccess().getOptionalPrefLeftSquareBracketKeyword_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActionDefRule());
                    							}
                    							setWithLastConsumed(current, "optionalPref", true, "[");
                    						

                    }


                    }

                    // InternalBddDsl.g:547:5: ( (lv_preposition_4_0= rulePREP ) )
                    // InternalBddDsl.g:548:6: (lv_preposition_4_0= rulePREP )
                    {
                    // InternalBddDsl.g:548:6: (lv_preposition_4_0= rulePREP )
                    // InternalBddDsl.g:549:7: lv_preposition_4_0= rulePREP
                    {

                    							newCompositeNode(grammarAccess.getActionDefAccess().getPrepositionPREPParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_preposition_4_0=rulePREP();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getActionDefRule());
                    							}
                    							set(
                    								current,
                    								"preposition",
                    								lv_preposition_4_0,
                    								"no.hal.bdd.BddDsl.PREP");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getActionDefAccess().getRightSquareBracketKeyword_2_1_2());
                    				

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
    // $ANTLR end "ruleActionDef"


    // $ANTLR start "entryRulePREP"
    // InternalBddDsl.g:576:1: entryRulePREP returns [String current=null] : iv_rulePREP= rulePREP EOF ;
    public final String entryRulePREP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePREP = null;


        try {
            // InternalBddDsl.g:576:44: (iv_rulePREP= rulePREP EOF )
            // InternalBddDsl.g:577:2: iv_rulePREP= rulePREP EOF
            {
             newCompositeNode(grammarAccess.getPREPRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePREP=rulePREP();

            state._fsp--;

             current =iv_rulePREP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePREP"


    // $ANTLR start "rulePREP"
    // InternalBddDsl.g:583:1: rulePREP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'on' | kw= 'in' | kw= 'from' | kw= 'to' | kw= 'into' ) ;
    public final AntlrDatatypeRuleToken rulePREP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBddDsl.g:589:2: ( (kw= 'on' | kw= 'in' | kw= 'from' | kw= 'to' | kw= 'into' ) )
            // InternalBddDsl.g:590:2: (kw= 'on' | kw= 'in' | kw= 'from' | kw= 'to' | kw= 'into' )
            {
            // InternalBddDsl.g:590:2: (kw= 'on' | kw= 'in' | kw= 'from' | kw= 'to' | kw= 'into' )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt14=1;
                }
                break;
            case 24:
                {
                alt14=2;
                }
                break;
            case 25:
                {
                alt14=3;
                }
                break;
            case 26:
                {
                alt14=4;
                }
                break;
            case 27:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalBddDsl.g:591:3: kw= 'on'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getOnKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:597:3: kw= 'in'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getInKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:603:3: kw= 'from'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getFromKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBddDsl.g:609:3: kw= 'to'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getToKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBddDsl.g:615:3: kw= 'into'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getIntoKeyword_4());
                    		

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
    // $ANTLR end "rulePREP"


    // $ANTLR start "entryRuleWORD"
    // InternalBddDsl.g:624:1: entryRuleWORD returns [String current=null] : iv_ruleWORD= ruleWORD EOF ;
    public final String entryRuleWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWORD = null;


        try {
            // InternalBddDsl.g:624:44: (iv_ruleWORD= ruleWORD EOF )
            // InternalBddDsl.g:625:2: iv_ruleWORD= ruleWORD EOF
            {
             newCompositeNode(grammarAccess.getWORDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWORD=ruleWORD();

            state._fsp--;

             current =iv_ruleWORD.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWORD"


    // $ANTLR start "ruleWORD"
    // InternalBddDsl.g:631:1: ruleWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalBddDsl.g:637:2: (this_ID_0= RULE_ID )
            // InternalBddDsl.g:638:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getWORDAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWORD"


    // $ANTLR start "entryRuleStateDef"
    // InternalBddDsl.g:648:1: entryRuleStateDef returns [EObject current=null] : iv_ruleStateDef= ruleStateDef EOF ;
    public final EObject entryRuleStateDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDef = null;


        try {
            // InternalBddDsl.g:648:49: (iv_ruleStateDef= ruleStateDef EOF )
            // InternalBddDsl.g:649:2: iv_ruleStateDef= ruleStateDef EOF
            {
             newCompositeNode(grammarAccess.getStateDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateDef=ruleStateDef();

            state._fsp--;

             current =iv_ruleStateDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateDef"


    // $ANTLR start "ruleStateDef"
    // InternalBddDsl.g:655:1: ruleStateDef returns [EObject current=null] : ( ( (lv_postive_0_0= ruleStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) ) )? ) ;
    public final EObject ruleStateDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_postive_0_0 = null;

        EObject lv_negative_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:661:2: ( ( ( (lv_postive_0_0= ruleStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) ) )? ) )
            // InternalBddDsl.g:662:2: ( ( (lv_postive_0_0= ruleStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) ) )? )
            {
            // InternalBddDsl.g:662:2: ( ( (lv_postive_0_0= ruleStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) ) )? )
            // InternalBddDsl.g:663:3: ( (lv_postive_0_0= ruleStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) ) )?
            {
            // InternalBddDsl.g:663:3: ( (lv_postive_0_0= ruleStateName ) )
            // InternalBddDsl.g:664:4: (lv_postive_0_0= ruleStateName )
            {
            // InternalBddDsl.g:664:4: (lv_postive_0_0= ruleStateName )
            // InternalBddDsl.g:665:5: lv_postive_0_0= ruleStateName
            {

            					newCompositeNode(grammarAccess.getStateDefAccess().getPostiveStateNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_postive_0_0=ruleStateName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateDefRule());
            					}
            					set(
            						current,
            						"postive",
            						lv_postive_0_0,
            						"no.hal.bdd.BddDsl.StateName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:682:3: (otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBddDsl.g:683:4: otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getStateDefAccess().getSolidusKeyword_1_0());
                    			
                    // InternalBddDsl.g:687:4: ( (lv_negative_2_0= ruleStateName ) )
                    // InternalBddDsl.g:688:5: (lv_negative_2_0= ruleStateName )
                    {
                    // InternalBddDsl.g:688:5: (lv_negative_2_0= ruleStateName )
                    // InternalBddDsl.g:689:6: lv_negative_2_0= ruleStateName
                    {

                    						newCompositeNode(grammarAccess.getStateDefAccess().getNegativeStateNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_negative_2_0=ruleStateName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateDefRule());
                    						}
                    						set(
                    							current,
                    							"negative",
                    							lv_negative_2_0,
                    							"no.hal.bdd.BddDsl.StateName");
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
    // $ANTLR end "ruleStateDef"


    // $ANTLR start "entryRuleStateName"
    // InternalBddDsl.g:711:1: entryRuleStateName returns [EObject current=null] : iv_ruleStateName= ruleStateName EOF ;
    public final EObject entryRuleStateName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateName = null;


        try {
            // InternalBddDsl.g:711:50: (iv_ruleStateName= ruleStateName EOF )
            // InternalBddDsl.g:712:2: iv_ruleStateName= ruleStateName EOF
            {
             newCompositeNode(grammarAccess.getStateNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateName=ruleStateName();

            state._fsp--;

             current =iv_ruleStateName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateName"


    // $ANTLR start "ruleStateName"
    // InternalBddDsl.g:718:1: ruleStateName returns [EObject current=null] : ( (lv_name_0_0= ruleWORD ) ) ;
    public final EObject ruleStateName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:724:2: ( ( (lv_name_0_0= ruleWORD ) ) )
            // InternalBddDsl.g:725:2: ( (lv_name_0_0= ruleWORD ) )
            {
            // InternalBddDsl.g:725:2: ( (lv_name_0_0= ruleWORD ) )
            // InternalBddDsl.g:726:3: (lv_name_0_0= ruleWORD )
            {
            // InternalBddDsl.g:726:3: (lv_name_0_0= ruleWORD )
            // InternalBddDsl.g:727:4: lv_name_0_0= ruleWORD
            {

            				newCompositeNode(grammarAccess.getStateNameAccess().getNameWORDParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleWORD();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStateNameRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"no.hal.bdd.BddDsl.WORD");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleStateName"


    // $ANTLR start "entryRulePropertyDef"
    // InternalBddDsl.g:747:1: entryRulePropertyDef returns [EObject current=null] : iv_rulePropertyDef= rulePropertyDef EOF ;
    public final EObject entryRulePropertyDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDef = null;


        try {
            // InternalBddDsl.g:747:52: (iv_rulePropertyDef= rulePropertyDef EOF )
            // InternalBddDsl.g:748:2: iv_rulePropertyDef= rulePropertyDef EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyDef=rulePropertyDef();

            state._fsp--;

             current =iv_rulePropertyDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDef"


    // $ANTLR start "rulePropertyDef"
    // InternalBddDsl.g:754:1: rulePropertyDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )? ) ;
    public final EObject rulePropertyDef() throws RecognitionException {
        EObject current = null;

        Token lv_plural_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:760:2: ( ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )? ) )
            // InternalBddDsl.g:761:2: ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )? )
            {
            // InternalBddDsl.g:761:2: ( ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )? )
            // InternalBddDsl.g:762:3: ( (lv_name_0_0= ruleWORD ) ) ( (lv_plural_1_0= '*' ) )?
            {
            // InternalBddDsl.g:762:3: ( (lv_name_0_0= ruleWORD ) )
            // InternalBddDsl.g:763:4: (lv_name_0_0= ruleWORD )
            {
            // InternalBddDsl.g:763:4: (lv_name_0_0= ruleWORD )
            // InternalBddDsl.g:764:5: lv_name_0_0= ruleWORD
            {

            					newCompositeNode(grammarAccess.getPropertyDefAccess().getNameWORDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_0_0=ruleWORD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"no.hal.bdd.BddDsl.WORD");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:781:3: ( (lv_plural_1_0= '*' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBddDsl.g:782:4: (lv_plural_1_0= '*' )
                    {
                    // InternalBddDsl.g:782:4: (lv_plural_1_0= '*' )
                    // InternalBddDsl.g:783:5: lv_plural_1_0= '*'
                    {
                    lv_plural_1_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_plural_1_0, grammarAccess.getPropertyDefAccess().getPluralAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyDefRule());
                    					}
                    					setWithLastConsumed(current, "plural", true, "*");
                    				

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
    // $ANTLR end "rulePropertyDef"


    // $ANTLR start "entryRuleID_OR_STRING"
    // InternalBddDsl.g:799:1: entryRuleID_OR_STRING returns [String current=null] : iv_ruleID_OR_STRING= ruleID_OR_STRING EOF ;
    public final String entryRuleID_OR_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID_OR_STRING = null;


        try {
            // InternalBddDsl.g:799:52: (iv_ruleID_OR_STRING= ruleID_OR_STRING EOF )
            // InternalBddDsl.g:800:2: iv_ruleID_OR_STRING= ruleID_OR_STRING EOF
            {
             newCompositeNode(grammarAccess.getID_OR_STRINGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleID_OR_STRING=ruleID_OR_STRING();

            state._fsp--;

             current =iv_ruleID_OR_STRING.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleID_OR_STRING"


    // $ANTLR start "ruleID_OR_STRING"
    // InternalBddDsl.g:806:1: ruleID_OR_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleID_OR_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalBddDsl.g:812:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // InternalBddDsl.g:813:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // InternalBddDsl.g:813:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_STRING) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalBddDsl.g:814:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getID_OR_STRINGAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:822:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getID_OR_STRINGAccess().getSTRINGTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleID_OR_STRING"


    // $ANTLR start "entryRuleScenario"
    // InternalBddDsl.g:833:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalBddDsl.g:833:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalBddDsl.g:834:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalBddDsl.g:840:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario:' ( (lv_name_1_0= ruleID_OR_STRING ) ) otherlv_2= 'given' ( (lv_preState_3_0= ruleScenarioState ) ) otherlv_4= 'when' otherlv_5= 'I' ( (lv_action_6_0= ruleScenarioAction ) ) otherlv_7= 'then' ( (lv_postState_8_0= ruleScenarioState ) ) ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_preState_3_0 = null;

        EObject lv_action_6_0 = null;

        EObject lv_postState_8_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:846:2: ( (otherlv_0= 'Scenario:' ( (lv_name_1_0= ruleID_OR_STRING ) ) otherlv_2= 'given' ( (lv_preState_3_0= ruleScenarioState ) ) otherlv_4= 'when' otherlv_5= 'I' ( (lv_action_6_0= ruleScenarioAction ) ) otherlv_7= 'then' ( (lv_postState_8_0= ruleScenarioState ) ) ) )
            // InternalBddDsl.g:847:2: (otherlv_0= 'Scenario:' ( (lv_name_1_0= ruleID_OR_STRING ) ) otherlv_2= 'given' ( (lv_preState_3_0= ruleScenarioState ) ) otherlv_4= 'when' otherlv_5= 'I' ( (lv_action_6_0= ruleScenarioAction ) ) otherlv_7= 'then' ( (lv_postState_8_0= ruleScenarioState ) ) )
            {
            // InternalBddDsl.g:847:2: (otherlv_0= 'Scenario:' ( (lv_name_1_0= ruleID_OR_STRING ) ) otherlv_2= 'given' ( (lv_preState_3_0= ruleScenarioState ) ) otherlv_4= 'when' otherlv_5= 'I' ( (lv_action_6_0= ruleScenarioAction ) ) otherlv_7= 'then' ( (lv_postState_8_0= ruleScenarioState ) ) )
            // InternalBddDsl.g:848:3: otherlv_0= 'Scenario:' ( (lv_name_1_0= ruleID_OR_STRING ) ) otherlv_2= 'given' ( (lv_preState_3_0= ruleScenarioState ) ) otherlv_4= 'when' otherlv_5= 'I' ( (lv_action_6_0= ruleScenarioAction ) ) otherlv_7= 'then' ( (lv_postState_8_0= ruleScenarioState ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalBddDsl.g:852:3: ( (lv_name_1_0= ruleID_OR_STRING ) )
            // InternalBddDsl.g:853:4: (lv_name_1_0= ruleID_OR_STRING )
            {
            // InternalBddDsl.g:853:4: (lv_name_1_0= ruleID_OR_STRING )
            // InternalBddDsl.g:854:5: lv_name_1_0= ruleID_OR_STRING
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getNameID_OR_STRINGParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_1_0=ruleID_OR_STRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.hal.bdd.BddDsl.ID_OR_STRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getGivenKeyword_2());
            		
            // InternalBddDsl.g:875:3: ( (lv_preState_3_0= ruleScenarioState ) )
            // InternalBddDsl.g:876:4: (lv_preState_3_0= ruleScenarioState )
            {
            // InternalBddDsl.g:876:4: (lv_preState_3_0= ruleScenarioState )
            // InternalBddDsl.g:877:5: lv_preState_3_0= ruleScenarioState
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getPreStateScenarioStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_preState_3_0=ruleScenarioState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"preState",
            						lv_preState_3_0,
            						"no.hal.bdd.BddDsl.ScenarioState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getWhenKeyword_4());
            		
            otherlv_5=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getIKeyword_5());
            		
            // InternalBddDsl.g:902:3: ( (lv_action_6_0= ruleScenarioAction ) )
            // InternalBddDsl.g:903:4: (lv_action_6_0= ruleScenarioAction )
            {
            // InternalBddDsl.g:903:4: (lv_action_6_0= ruleScenarioAction )
            // InternalBddDsl.g:904:5: lv_action_6_0= ruleScenarioAction
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getActionScenarioActionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
            lv_action_6_0=ruleScenarioAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_6_0,
            						"no.hal.bdd.BddDsl.ScenarioAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getScenarioAccess().getThenKeyword_7());
            		
            // InternalBddDsl.g:925:3: ( (lv_postState_8_0= ruleScenarioState ) )
            // InternalBddDsl.g:926:4: (lv_postState_8_0= ruleScenarioState )
            {
            // InternalBddDsl.g:926:4: (lv_postState_8_0= ruleScenarioState )
            // InternalBddDsl.g:927:5: lv_postState_8_0= ruleScenarioState
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getPostStateScenarioStateParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_postState_8_0=ruleScenarioState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"postState",
            						lv_postState_8_0,
            						"no.hal.bdd.BddDsl.ScenarioState");
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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioState"
    // InternalBddDsl.g:948:1: entryRuleScenarioState returns [EObject current=null] : iv_ruleScenarioState= ruleScenarioState EOF ;
    public final EObject entryRuleScenarioState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioState = null;


        try {
            // InternalBddDsl.g:948:54: (iv_ruleScenarioState= ruleScenarioState EOF )
            // InternalBddDsl.g:949:2: iv_ruleScenarioState= ruleScenarioState EOF
            {
             newCompositeNode(grammarAccess.getScenarioStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenarioState=ruleScenarioState();

            state._fsp--;

             current =iv_ruleScenarioState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenarioState"


    // $ANTLR start "ruleScenarioState"
    // InternalBddDsl.g:955:1: ruleScenarioState returns [EObject current=null] : ( ( (lv_states_0_0= ruleStatePhrase ) ) (otherlv_1= 'and' ( (lv_states_2_0= ruleStatePhrase ) ) )* ) ;
    public final EObject ruleScenarioState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_states_0_0 = null;

        EObject lv_states_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:961:2: ( ( ( (lv_states_0_0= ruleStatePhrase ) ) (otherlv_1= 'and' ( (lv_states_2_0= ruleStatePhrase ) ) )* ) )
            // InternalBddDsl.g:962:2: ( ( (lv_states_0_0= ruleStatePhrase ) ) (otherlv_1= 'and' ( (lv_states_2_0= ruleStatePhrase ) ) )* )
            {
            // InternalBddDsl.g:962:2: ( ( (lv_states_0_0= ruleStatePhrase ) ) (otherlv_1= 'and' ( (lv_states_2_0= ruleStatePhrase ) ) )* )
            // InternalBddDsl.g:963:3: ( (lv_states_0_0= ruleStatePhrase ) ) (otherlv_1= 'and' ( (lv_states_2_0= ruleStatePhrase ) ) )*
            {
            // InternalBddDsl.g:963:3: ( (lv_states_0_0= ruleStatePhrase ) )
            // InternalBddDsl.g:964:4: (lv_states_0_0= ruleStatePhrase )
            {
            // InternalBddDsl.g:964:4: (lv_states_0_0= ruleStatePhrase )
            // InternalBddDsl.g:965:5: lv_states_0_0= ruleStatePhrase
            {

            					newCompositeNode(grammarAccess.getScenarioStateAccess().getStatesStatePhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_states_0_0=ruleStatePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioStateRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_0_0,
            						"no.hal.bdd.BddDsl.StatePhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:982:3: (otherlv_1= 'and' ( (lv_states_2_0= ruleStatePhrase ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBddDsl.g:983:4: otherlv_1= 'and' ( (lv_states_2_0= ruleStatePhrase ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_19); 

            	    				newLeafNode(otherlv_1, grammarAccess.getScenarioStateAccess().getAndKeyword_1_0());
            	    			
            	    // InternalBddDsl.g:987:4: ( (lv_states_2_0= ruleStatePhrase ) )
            	    // InternalBddDsl.g:988:5: (lv_states_2_0= ruleStatePhrase )
            	    {
            	    // InternalBddDsl.g:988:5: (lv_states_2_0= ruleStatePhrase )
            	    // InternalBddDsl.g:989:6: lv_states_2_0= ruleStatePhrase
            	    {

            	    						newCompositeNode(grammarAccess.getScenarioStateAccess().getStatesStatePhraseParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_states_2_0=ruleStatePhrase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenarioStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_2_0,
            	    							"no.hal.bdd.BddDsl.StatePhrase");
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
    // $ANTLR end "ruleScenarioState"


    // $ANTLR start "entryRuleScenarioAction"
    // InternalBddDsl.g:1011:1: entryRuleScenarioAction returns [EObject current=null] : iv_ruleScenarioAction= ruleScenarioAction EOF ;
    public final EObject entryRuleScenarioAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioAction = null;


        try {
            // InternalBddDsl.g:1011:55: (iv_ruleScenarioAction= ruleScenarioAction EOF )
            // InternalBddDsl.g:1012:2: iv_ruleScenarioAction= ruleScenarioAction EOF
            {
             newCompositeNode(grammarAccess.getScenarioActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenarioAction=ruleScenarioAction();

            state._fsp--;

             current =iv_ruleScenarioAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenarioAction"


    // $ANTLR start "ruleScenarioAction"
    // InternalBddDsl.g:1018:1: ruleScenarioAction returns [EObject current=null] : ( ( (lv_actions_0_0= ruleActionPhrase ) ) (otherlv_1= 'and' ( (lv_actions_2_0= ruleActionPhrase ) ) )* ) ;
    public final EObject ruleScenarioAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_actions_0_0 = null;

        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1024:2: ( ( ( (lv_actions_0_0= ruleActionPhrase ) ) (otherlv_1= 'and' ( (lv_actions_2_0= ruleActionPhrase ) ) )* ) )
            // InternalBddDsl.g:1025:2: ( ( (lv_actions_0_0= ruleActionPhrase ) ) (otherlv_1= 'and' ( (lv_actions_2_0= ruleActionPhrase ) ) )* )
            {
            // InternalBddDsl.g:1025:2: ( ( (lv_actions_0_0= ruleActionPhrase ) ) (otherlv_1= 'and' ( (lv_actions_2_0= ruleActionPhrase ) ) )* )
            // InternalBddDsl.g:1026:3: ( (lv_actions_0_0= ruleActionPhrase ) ) (otherlv_1= 'and' ( (lv_actions_2_0= ruleActionPhrase ) ) )*
            {
            // InternalBddDsl.g:1026:3: ( (lv_actions_0_0= ruleActionPhrase ) )
            // InternalBddDsl.g:1027:4: (lv_actions_0_0= ruleActionPhrase )
            {
            // InternalBddDsl.g:1027:4: (lv_actions_0_0= ruleActionPhrase )
            // InternalBddDsl.g:1028:5: lv_actions_0_0= ruleActionPhrase
            {

            					newCompositeNode(grammarAccess.getScenarioActionAccess().getActionsActionPhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_actions_0_0=ruleActionPhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioActionRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_0_0,
            						"no.hal.bdd.BddDsl.ActionPhrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1045:3: (otherlv_1= 'and' ( (lv_actions_2_0= ruleActionPhrase ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBddDsl.g:1046:4: otherlv_1= 'and' ( (lv_actions_2_0= ruleActionPhrase ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_22); 

            	    				newLeafNode(otherlv_1, grammarAccess.getScenarioActionAccess().getAndKeyword_1_0());
            	    			
            	    // InternalBddDsl.g:1050:4: ( (lv_actions_2_0= ruleActionPhrase ) )
            	    // InternalBddDsl.g:1051:5: (lv_actions_2_0= ruleActionPhrase )
            	    {
            	    // InternalBddDsl.g:1051:5: (lv_actions_2_0= ruleActionPhrase )
            	    // InternalBddDsl.g:1052:6: lv_actions_2_0= ruleActionPhrase
            	    {

            	    						newCompositeNode(grammarAccess.getScenarioActionAccess().getActionsActionPhraseParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_actions_2_0=ruleActionPhrase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenarioActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_2_0,
            	    							"no.hal.bdd.BddDsl.ActionPhrase");
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
    // $ANTLR end "ruleScenarioAction"


    // $ANTLR start "entryRuleStatePhrase"
    // InternalBddDsl.g:1074:1: entryRuleStatePhrase returns [EObject current=null] : iv_ruleStatePhrase= ruleStatePhrase EOF ;
    public final EObject entryRuleStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatePhrase = null;


        try {
            // InternalBddDsl.g:1074:52: (iv_ruleStatePhrase= ruleStatePhrase EOF )
            // InternalBddDsl.g:1075:2: iv_ruleStatePhrase= ruleStatePhrase EOF
            {
             newCompositeNode(grammarAccess.getStatePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatePhrase=ruleStatePhrase();

            state._fsp--;

             current =iv_ruleStatePhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatePhrase"


    // $ANTLR start "ruleStatePhrase"
    // InternalBddDsl.g:1081:1: ruleStatePhrase returns [EObject current=null] : (this_ScenarioRef_0= ruleScenarioRef | this_EntityPropertyStatePhrase_1= ruleEntityPropertyStatePhrase | this_EntityStatePhrase_2= ruleEntityStatePhrase ) ;
    public final EObject ruleStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject this_ScenarioRef_0 = null;

        EObject this_EntityPropertyStatePhrase_1 = null;

        EObject this_EntityStatePhrase_2 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1087:2: ( (this_ScenarioRef_0= ruleScenarioRef | this_EntityPropertyStatePhrase_1= ruleEntityPropertyStatePhrase | this_EntityStatePhrase_2= ruleEntityStatePhrase ) )
            // InternalBddDsl.g:1088:2: (this_ScenarioRef_0= ruleScenarioRef | this_EntityPropertyStatePhrase_1= ruleEntityPropertyStatePhrase | this_EntityStatePhrase_2= ruleEntityStatePhrase )
            {
            // InternalBddDsl.g:1088:2: (this_ScenarioRef_0= ruleScenarioRef | this_EntityPropertyStatePhrase_1= ruleEntityPropertyStatePhrase | this_EntityStatePhrase_2= ruleEntityStatePhrase )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt20=1;
                }
                break;
            case RULE_STRING:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==14) ) {
                    alt20=3;
                }
                else if ( (LA20_2==EOF||(LA20_2>=12 && LA20_2<=13)||LA20_2==30||LA20_2==32||(LA20_2>=34 && LA20_2<=35)) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA20_3 = input.LA(2);

                if ( (LA20_3==RULE_ID) ) {
                    int LA20_5 = input.LA(3);

                    if ( (LA20_5==38) ) {
                        alt20=2;
                    }
                    else if ( ((LA20_5>=RULE_STRING && LA20_5<=RULE_INT)||LA20_5==36) ) {
                        alt20=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 36:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalBddDsl.g:1089:3: this_ScenarioRef_0= ruleScenarioRef
                    {

                    			newCompositeNode(grammarAccess.getStatePhraseAccess().getScenarioRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScenarioRef_0=ruleScenarioRef();

                    state._fsp--;


                    			current = this_ScenarioRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1098:3: this_EntityPropertyStatePhrase_1= ruleEntityPropertyStatePhrase
                    {

                    			newCompositeNode(grammarAccess.getStatePhraseAccess().getEntityPropertyStatePhraseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityPropertyStatePhrase_1=ruleEntityPropertyStatePhrase();

                    state._fsp--;


                    			current = this_EntityPropertyStatePhrase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:1107:3: this_EntityStatePhrase_2= ruleEntityStatePhrase
                    {

                    			newCompositeNode(grammarAccess.getStatePhraseAccess().getEntityStatePhraseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityStatePhrase_2=ruleEntityStatePhrase();

                    state._fsp--;


                    			current = this_EntityStatePhrase_2;
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
    // $ANTLR end "ruleStatePhrase"


    // $ANTLR start "entryRuleScenarioRef"
    // InternalBddDsl.g:1119:1: entryRuleScenarioRef returns [EObject current=null] : iv_ruleScenarioRef= ruleScenarioRef EOF ;
    public final EObject entryRuleScenarioRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioRef = null;


        try {
            // InternalBddDsl.g:1119:52: (iv_ruleScenarioRef= ruleScenarioRef EOF )
            // InternalBddDsl.g:1120:2: iv_ruleScenarioRef= ruleScenarioRef EOF
            {
             newCompositeNode(grammarAccess.getScenarioRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenarioRef=ruleScenarioRef();

            state._fsp--;

             current =iv_ruleScenarioRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenarioRef"


    // $ANTLR start "ruleScenarioRef"
    // InternalBddDsl.g:1126:1: ruleScenarioRef returns [EObject current=null] : ( ( ruleID_OR_STRING ) ) ;
    public final EObject ruleScenarioRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalBddDsl.g:1132:2: ( ( ( ruleID_OR_STRING ) ) )
            // InternalBddDsl.g:1133:2: ( ( ruleID_OR_STRING ) )
            {
            // InternalBddDsl.g:1133:2: ( ( ruleID_OR_STRING ) )
            // InternalBddDsl.g:1134:3: ( ruleID_OR_STRING )
            {
            // InternalBddDsl.g:1134:3: ( ruleID_OR_STRING )
            // InternalBddDsl.g:1135:4: ruleID_OR_STRING
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getScenarioRefRule());
            				}
            			

            				newCompositeNode(grammarAccess.getScenarioRefAccess().getScenarioRefScenarioCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleID_OR_STRING();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleScenarioRef"


    // $ANTLR start "entryRuleENTITY_IDENTITY"
    // InternalBddDsl.g:1152:1: entryRuleENTITY_IDENTITY returns [String current=null] : iv_ruleENTITY_IDENTITY= ruleENTITY_IDENTITY EOF ;
    public final String entryRuleENTITY_IDENTITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENTITY_IDENTITY = null;


        try {
            // InternalBddDsl.g:1152:55: (iv_ruleENTITY_IDENTITY= ruleENTITY_IDENTITY EOF )
            // InternalBddDsl.g:1153:2: iv_ruleENTITY_IDENTITY= ruleENTITY_IDENTITY EOF
            {
             newCompositeNode(grammarAccess.getENTITY_IDENTITYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENTITY_IDENTITY=ruleENTITY_IDENTITY();

            state._fsp--;

             current =iv_ruleENTITY_IDENTITY.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENTITY_IDENTITY"


    // $ANTLR start "ruleENTITY_IDENTITY"
    // InternalBddDsl.g:1159:1: ruleENTITY_IDENTITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '#' )? (this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) ) ;
    public final AntlrDatatypeRuleToken ruleENTITY_IDENTITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1165:2: ( ( (kw= '#' )? (this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) ) )
            // InternalBddDsl.g:1166:2: ( (kw= '#' )? (this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) )
            {
            // InternalBddDsl.g:1166:2: ( (kw= '#' )? (this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) )
            // InternalBddDsl.g:1167:3: (kw= '#' )? (this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            {
            // InternalBddDsl.g:1167:3: (kw= '#' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBddDsl.g:1168:4: kw= '#'
                    {
                    kw=(Token)match(input,36,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getENTITY_IDENTITYAccess().getNumberSignKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:1174:3: (this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_STRING) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalBddDsl.g:1175:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getENTITY_IDENTITYAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1183:4: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				current.merge(this_STRING_2);
                    			

                    				newLeafNode(this_STRING_2, grammarAccess.getENTITY_IDENTITYAccess().getSTRINGTerminalRuleCall_1_1());
                    			

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
    // $ANTLR end "ruleENTITY_IDENTITY"


    // $ANTLR start "entryRuleEntityRef"
    // InternalBddDsl.g:1195:1: entryRuleEntityRef returns [EObject current=null] : iv_ruleEntityRef= ruleEntityRef EOF ;
    public final EObject entryRuleEntityRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityRef = null;


        try {
            // InternalBddDsl.g:1195:50: (iv_ruleEntityRef= ruleEntityRef EOF )
            // InternalBddDsl.g:1196:2: iv_ruleEntityRef= ruleEntityRef EOF
            {
             newCompositeNode(grammarAccess.getEntityRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityRef=ruleEntityRef();

            state._fsp--;

             current =iv_ruleEntityRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityRef"


    // $ANTLR start "ruleEntityRef"
    // InternalBddDsl.g:1202:1: ruleEntityRef returns [EObject current=null] : ( (otherlv_0= 'the' ( ( ruleWORD ) ) ( (lv_name_2_0= ruleENTITY_IDENTITY ) ) ) | ( (lv_name_3_0= ruleENTITY_IDENTITY ) ) ) ;
    public final EObject ruleEntityRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1208:2: ( ( (otherlv_0= 'the' ( ( ruleWORD ) ) ( (lv_name_2_0= ruleENTITY_IDENTITY ) ) ) | ( (lv_name_3_0= ruleENTITY_IDENTITY ) ) ) )
            // InternalBddDsl.g:1209:2: ( (otherlv_0= 'the' ( ( ruleWORD ) ) ( (lv_name_2_0= ruleENTITY_IDENTITY ) ) ) | ( (lv_name_3_0= ruleENTITY_IDENTITY ) ) )
            {
            // InternalBddDsl.g:1209:2: ( (otherlv_0= 'the' ( ( ruleWORD ) ) ( (lv_name_2_0= ruleENTITY_IDENTITY ) ) ) | ( (lv_name_3_0= ruleENTITY_IDENTITY ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_INT)||LA23_0==36) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalBddDsl.g:1210:3: (otherlv_0= 'the' ( ( ruleWORD ) ) ( (lv_name_2_0= ruleENTITY_IDENTITY ) ) )
                    {
                    // InternalBddDsl.g:1210:3: (otherlv_0= 'the' ( ( ruleWORD ) ) ( (lv_name_2_0= ruleENTITY_IDENTITY ) ) )
                    // InternalBddDsl.g:1211:4: otherlv_0= 'the' ( ( ruleWORD ) ) ( (lv_name_2_0= ruleENTITY_IDENTITY ) )
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntityRefAccess().getTheKeyword_0_0());
                    			
                    // InternalBddDsl.g:1215:4: ( ( ruleWORD ) )
                    // InternalBddDsl.g:1216:5: ( ruleWORD )
                    {
                    // InternalBddDsl.g:1216:5: ( ruleWORD )
                    // InternalBddDsl.g:1217:6: ruleWORD
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRefRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntityRefAccess().getEntityEntityDefCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleWORD();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:1231:4: ( (lv_name_2_0= ruleENTITY_IDENTITY ) )
                    // InternalBddDsl.g:1232:5: (lv_name_2_0= ruleENTITY_IDENTITY )
                    {
                    // InternalBddDsl.g:1232:5: (lv_name_2_0= ruleENTITY_IDENTITY )
                    // InternalBddDsl.g:1233:6: lv_name_2_0= ruleENTITY_IDENTITY
                    {

                    						newCompositeNode(grammarAccess.getEntityRefAccess().getNameENTITY_IDENTITYParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_name_2_0=ruleENTITY_IDENTITY();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRefRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"no.hal.bdd.BddDsl.ENTITY_IDENTITY");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1252:3: ( (lv_name_3_0= ruleENTITY_IDENTITY ) )
                    {
                    // InternalBddDsl.g:1252:3: ( (lv_name_3_0= ruleENTITY_IDENTITY ) )
                    // InternalBddDsl.g:1253:4: (lv_name_3_0= ruleENTITY_IDENTITY )
                    {
                    // InternalBddDsl.g:1253:4: (lv_name_3_0= ruleENTITY_IDENTITY )
                    // InternalBddDsl.g:1254:5: lv_name_3_0= ruleENTITY_IDENTITY
                    {

                    					newCompositeNode(grammarAccess.getEntityRefAccess().getNameENTITY_IDENTITYParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_3_0=ruleENTITY_IDENTITY();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRefRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_3_0,
                    						"no.hal.bdd.BddDsl.ENTITY_IDENTITY");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleEntityRef"


    // $ANTLR start "entryRuleEntityStatePhrase"
    // InternalBddDsl.g:1275:1: entryRuleEntityStatePhrase returns [EObject current=null] : iv_ruleEntityStatePhrase= ruleEntityStatePhrase EOF ;
    public final EObject entryRuleEntityStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityStatePhrase = null;


        try {
            // InternalBddDsl.g:1275:58: (iv_ruleEntityStatePhrase= ruleEntityStatePhrase EOF )
            // InternalBddDsl.g:1276:2: iv_ruleEntityStatePhrase= ruleEntityStatePhrase EOF
            {
             newCompositeNode(grammarAccess.getEntityStatePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityStatePhrase=ruleEntityStatePhrase();

            state._fsp--;

             current =iv_ruleEntityStatePhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityStatePhrase"


    // $ANTLR start "ruleEntityStatePhrase"
    // InternalBddDsl.g:1282:1: ruleEntityStatePhrase returns [EObject current=null] : ( ( (lv_entity_0_0= ruleEntityRef ) ) otherlv_1= 'is' ( ( ruleWORD ) ) ) ;
    public final EObject ruleEntityStatePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_entity_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1288:2: ( ( ( (lv_entity_0_0= ruleEntityRef ) ) otherlv_1= 'is' ( ( ruleWORD ) ) ) )
            // InternalBddDsl.g:1289:2: ( ( (lv_entity_0_0= ruleEntityRef ) ) otherlv_1= 'is' ( ( ruleWORD ) ) )
            {
            // InternalBddDsl.g:1289:2: ( ( (lv_entity_0_0= ruleEntityRef ) ) otherlv_1= 'is' ( ( ruleWORD ) ) )
            // InternalBddDsl.g:1290:3: ( (lv_entity_0_0= ruleEntityRef ) ) otherlv_1= 'is' ( ( ruleWORD ) )
            {
            // InternalBddDsl.g:1290:3: ( (lv_entity_0_0= ruleEntityRef ) )
            // InternalBddDsl.g:1291:4: (lv_entity_0_0= ruleEntityRef )
            {
            // InternalBddDsl.g:1291:4: (lv_entity_0_0= ruleEntityRef )
            // InternalBddDsl.g:1292:5: lv_entity_0_0= ruleEntityRef
            {

            					newCompositeNode(grammarAccess.getEntityStatePhraseAccess().getEntityEntityRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_entity_0_0=ruleEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityStatePhraseRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_0_0,
            						"no.hal.bdd.BddDsl.EntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityStatePhraseAccess().getIsKeyword_1());
            		
            // InternalBddDsl.g:1313:3: ( ( ruleWORD ) )
            // InternalBddDsl.g:1314:4: ( ruleWORD )
            {
            // InternalBddDsl.g:1314:4: ( ruleWORD )
            // InternalBddDsl.g:1315:5: ruleWORD
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityStatePhraseRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityStatePhraseAccess().getStateStateNameCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleWORD();

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
    // $ANTLR end "ruleEntityStatePhrase"


    // $ANTLR start "entryRuleEntityPropertyStatePhrase"
    // InternalBddDsl.g:1333:1: entryRuleEntityPropertyStatePhrase returns [EObject current=null] : iv_ruleEntityPropertyStatePhrase= ruleEntityPropertyStatePhrase EOF ;
    public final EObject entryRuleEntityPropertyStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityPropertyStatePhrase = null;


        try {
            // InternalBddDsl.g:1333:66: (iv_ruleEntityPropertyStatePhrase= ruleEntityPropertyStatePhrase EOF )
            // InternalBddDsl.g:1334:2: iv_ruleEntityPropertyStatePhrase= ruleEntityPropertyStatePhrase EOF
            {
             newCompositeNode(grammarAccess.getEntityPropertyStatePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityPropertyStatePhrase=ruleEntityPropertyStatePhrase();

            state._fsp--;

             current =iv_ruleEntityPropertyStatePhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityPropertyStatePhrase"


    // $ANTLR start "ruleEntityPropertyStatePhrase"
    // InternalBddDsl.g:1340:1: ruleEntityPropertyStatePhrase returns [EObject current=null] : (otherlv_0= 'the' ( ( ruleWORD ) ) otherlv_2= 'of' ( (lv_entity_3_0= ruleEntityRef ) ) ( (otherlv_4= 'is' ( (lv_value_5_0= rulePropertyValue ) ) ) | (otherlv_6= 'are' ( (lv_values_7_0= rulePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= rulePropertyValue ) ) )* ) ) ) ;
    public final EObject ruleEntityPropertyStatePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_entity_3_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_values_7_0 = null;

        EObject lv_values_9_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1346:2: ( (otherlv_0= 'the' ( ( ruleWORD ) ) otherlv_2= 'of' ( (lv_entity_3_0= ruleEntityRef ) ) ( (otherlv_4= 'is' ( (lv_value_5_0= rulePropertyValue ) ) ) | (otherlv_6= 'are' ( (lv_values_7_0= rulePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= rulePropertyValue ) ) )* ) ) ) )
            // InternalBddDsl.g:1347:2: (otherlv_0= 'the' ( ( ruleWORD ) ) otherlv_2= 'of' ( (lv_entity_3_0= ruleEntityRef ) ) ( (otherlv_4= 'is' ( (lv_value_5_0= rulePropertyValue ) ) ) | (otherlv_6= 'are' ( (lv_values_7_0= rulePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= rulePropertyValue ) ) )* ) ) )
            {
            // InternalBddDsl.g:1347:2: (otherlv_0= 'the' ( ( ruleWORD ) ) otherlv_2= 'of' ( (lv_entity_3_0= ruleEntityRef ) ) ( (otherlv_4= 'is' ( (lv_value_5_0= rulePropertyValue ) ) ) | (otherlv_6= 'are' ( (lv_values_7_0= rulePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= rulePropertyValue ) ) )* ) ) )
            // InternalBddDsl.g:1348:3: otherlv_0= 'the' ( ( ruleWORD ) ) otherlv_2= 'of' ( (lv_entity_3_0= ruleEntityRef ) ) ( (otherlv_4= 'is' ( (lv_value_5_0= rulePropertyValue ) ) ) | (otherlv_6= 'are' ( (lv_values_7_0= rulePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= rulePropertyValue ) ) )* ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityPropertyStatePhraseAccess().getTheKeyword_0());
            		
            // InternalBddDsl.g:1352:3: ( ( ruleWORD ) )
            // InternalBddDsl.g:1353:4: ( ruleWORD )
            {
            // InternalBddDsl.g:1353:4: ( ruleWORD )
            // InternalBddDsl.g:1354:5: ruleWORD
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityPropertyStatePhraseRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityPropertyStatePhraseAccess().getPropertyPropertyDefCrossReference_1_0());
            				
            pushFollow(FOLLOW_27);
            ruleWORD();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityPropertyStatePhraseAccess().getOfKeyword_2());
            		
            // InternalBddDsl.g:1372:3: ( (lv_entity_3_0= ruleEntityRef ) )
            // InternalBddDsl.g:1373:4: (lv_entity_3_0= ruleEntityRef )
            {
            // InternalBddDsl.g:1373:4: (lv_entity_3_0= ruleEntityRef )
            // InternalBddDsl.g:1374:5: lv_entity_3_0= ruleEntityRef
            {

            					newCompositeNode(grammarAccess.getEntityPropertyStatePhraseAccess().getEntityEntityRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_entity_3_0=ruleEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityPropertyStatePhraseRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_3_0,
            						"no.hal.bdd.BddDsl.EntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1391:3: ( (otherlv_4= 'is' ( (lv_value_5_0= rulePropertyValue ) ) ) | (otherlv_6= 'are' ( (lv_values_7_0= rulePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= rulePropertyValue ) ) )* ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            else if ( (LA25_0==39) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalBddDsl.g:1392:4: (otherlv_4= 'is' ( (lv_value_5_0= rulePropertyValue ) ) )
                    {
                    // InternalBddDsl.g:1392:4: (otherlv_4= 'is' ( (lv_value_5_0= rulePropertyValue ) ) )
                    // InternalBddDsl.g:1393:5: otherlv_4= 'is' ( (lv_value_5_0= rulePropertyValue ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_29); 

                    					newLeafNode(otherlv_4, grammarAccess.getEntityPropertyStatePhraseAccess().getIsKeyword_4_0_0());
                    				
                    // InternalBddDsl.g:1397:5: ( (lv_value_5_0= rulePropertyValue ) )
                    // InternalBddDsl.g:1398:6: (lv_value_5_0= rulePropertyValue )
                    {
                    // InternalBddDsl.g:1398:6: (lv_value_5_0= rulePropertyValue )
                    // InternalBddDsl.g:1399:7: lv_value_5_0= rulePropertyValue
                    {

                    							newCompositeNode(grammarAccess.getEntityPropertyStatePhraseAccess().getValuePropertyValueParserRuleCall_4_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=rulePropertyValue();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEntityPropertyStatePhraseRule());
                    							}
                    							set(
                    								current,
                    								"value",
                    								lv_value_5_0,
                    								"no.hal.bdd.BddDsl.PropertyValue");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1418:4: (otherlv_6= 'are' ( (lv_values_7_0= rulePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= rulePropertyValue ) ) )* )
                    {
                    // InternalBddDsl.g:1418:4: (otherlv_6= 'are' ( (lv_values_7_0= rulePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= rulePropertyValue ) ) )* )
                    // InternalBddDsl.g:1419:5: otherlv_6= 'are' ( (lv_values_7_0= rulePropertyValue ) ) (otherlv_8= ',' ( (lv_values_9_0= rulePropertyValue ) ) )*
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_29); 

                    					newLeafNode(otherlv_6, grammarAccess.getEntityPropertyStatePhraseAccess().getAreKeyword_4_1_0());
                    				
                    // InternalBddDsl.g:1423:5: ( (lv_values_7_0= rulePropertyValue ) )
                    // InternalBddDsl.g:1424:6: (lv_values_7_0= rulePropertyValue )
                    {
                    // InternalBddDsl.g:1424:6: (lv_values_7_0= rulePropertyValue )
                    // InternalBddDsl.g:1425:7: lv_values_7_0= rulePropertyValue
                    {

                    							newCompositeNode(grammarAccess.getEntityPropertyStatePhraseAccess().getValuesPropertyValueParserRuleCall_4_1_1_0());
                    						
                    pushFollow(FOLLOW_30);
                    lv_values_7_0=rulePropertyValue();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEntityPropertyStatePhraseRule());
                    							}
                    							add(
                    								current,
                    								"values",
                    								lv_values_7_0,
                    								"no.hal.bdd.BddDsl.PropertyValue");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalBddDsl.g:1442:5: (otherlv_8= ',' ( (lv_values_9_0= rulePropertyValue ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalBddDsl.g:1443:6: otherlv_8= ',' ( (lv_values_9_0= rulePropertyValue ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_29); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getEntityPropertyStatePhraseAccess().getCommaKeyword_4_1_2_0());
                    	    					
                    	    // InternalBddDsl.g:1447:6: ( (lv_values_9_0= rulePropertyValue ) )
                    	    // InternalBddDsl.g:1448:7: (lv_values_9_0= rulePropertyValue )
                    	    {
                    	    // InternalBddDsl.g:1448:7: (lv_values_9_0= rulePropertyValue )
                    	    // InternalBddDsl.g:1449:8: lv_values_9_0= rulePropertyValue
                    	    {

                    	    								newCompositeNode(grammarAccess.getEntityPropertyStatePhraseAccess().getValuesPropertyValueParserRuleCall_4_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_30);
                    	    lv_values_9_0=rulePropertyValue();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getEntityPropertyStatePhraseRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"values",
                    	    									lv_values_9_0,
                    	    									"no.hal.bdd.BddDsl.PropertyValue");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


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
    // $ANTLR end "ruleEntityPropertyStatePhrase"


    // $ANTLR start "entryRulePropertyValue"
    // InternalBddDsl.g:1473:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalBddDsl.g:1473:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalBddDsl.g:1474:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalBddDsl.g:1480:1: rulePropertyValue returns [EObject current=null] : (this_SimpleValue_0= ruleSimpleValue | this_ListValue_1= ruleListValue | this_SetValue_2= ruleSetValue ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue_0 = null;

        EObject this_ListValue_1 = null;

        EObject this_SetValue_2 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1486:2: ( (this_SimpleValue_0= ruleSimpleValue | this_ListValue_1= ruleListValue | this_SetValue_2= ruleSetValue ) )
            // InternalBddDsl.g:1487:2: (this_SimpleValue_0= ruleSimpleValue | this_ListValue_1= ruleListValue | this_SetValue_2= ruleSetValue )
            {
            // InternalBddDsl.g:1487:2: (this_SimpleValue_0= ruleSimpleValue | this_ListValue_1= ruleListValue | this_SetValue_2= ruleSetValue )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt26=1;
                }
                break;
            case 21:
                {
                alt26=2;
                }
                break;
            case 16:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalBddDsl.g:1488:3: this_SimpleValue_0= ruleSimpleValue
                    {

                    			newCompositeNode(grammarAccess.getPropertyValueAccess().getSimpleValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleValue_0=ruleSimpleValue();

                    state._fsp--;


                    			current = this_SimpleValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1497:3: this_ListValue_1= ruleListValue
                    {

                    			newCompositeNode(grammarAccess.getPropertyValueAccess().getListValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListValue_1=ruleListValue();

                    state._fsp--;


                    			current = this_ListValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:1506:3: this_SetValue_2= ruleSetValue
                    {

                    			newCompositeNode(grammarAccess.getPropertyValueAccess().getSetValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetValue_2=ruleSetValue();

                    state._fsp--;


                    			current = this_SetValue_2;
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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleSimpleValue"
    // InternalBddDsl.g:1518:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // InternalBddDsl.g:1518:52: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // InternalBddDsl.g:1519:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleValue=ruleSimpleValue();

            state._fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleValue"


    // $ANTLR start "ruleSimpleValue"
    // InternalBddDsl.g:1525:1: ruleSimpleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_BooleanValue_1= ruleBooleanValue | this_StringValue_2= ruleStringValue ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_BooleanValue_1 = null;

        EObject this_StringValue_2 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1531:2: ( (this_IntValue_0= ruleIntValue | this_BooleanValue_1= ruleBooleanValue | this_StringValue_2= ruleStringValue ) )
            // InternalBddDsl.g:1532:2: (this_IntValue_0= ruleIntValue | this_BooleanValue_1= ruleBooleanValue | this_StringValue_2= ruleStringValue )
            {
            // InternalBddDsl.g:1532:2: (this_IntValue_0= ruleIntValue | this_BooleanValue_1= ruleBooleanValue | this_StringValue_2= ruleStringValue )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt27=1;
                }
                break;
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt27=2;
                }
                break;
            case RULE_STRING:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalBddDsl.g:1533:3: this_IntValue_0= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getSimpleValueAccess().getIntValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1542:3: this_BooleanValue_1= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getSimpleValueAccess().getBooleanValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_1=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:1551:3: this_StringValue_2= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getSimpleValueAccess().getStringValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_2;
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
    // $ANTLR end "ruleSimpleValue"


    // $ANTLR start "entryRuleListValue"
    // InternalBddDsl.g:1563:1: entryRuleListValue returns [EObject current=null] : iv_ruleListValue= ruleListValue EOF ;
    public final EObject entryRuleListValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValue = null;


        try {
            // InternalBddDsl.g:1563:50: (iv_ruleListValue= ruleListValue EOF )
            // InternalBddDsl.g:1564:2: iv_ruleListValue= ruleListValue EOF
            {
             newCompositeNode(grammarAccess.getListValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListValue=ruleListValue();

            state._fsp--;

             current =iv_ruleListValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalBddDsl.g:1570:1: ruleListValue returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleListValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1576:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )* )? otherlv_5= ']' ) )
            // InternalBddDsl.g:1577:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )* )? otherlv_5= ']' )
            {
            // InternalBddDsl.g:1577:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )* )? otherlv_5= ']' )
            // InternalBddDsl.g:1578:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )* )? otherlv_5= ']'
            {
            // InternalBddDsl.g:1578:3: ()
            // InternalBddDsl.g:1579:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListValueAccess().getListValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalBddDsl.g:1589:3: ( ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_INT)||(LA29_0>=40 && LA29_0<=43)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBddDsl.g:1590:4: ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )*
                    {
                    // InternalBddDsl.g:1590:4: ( (lv_values_2_0= ruleSimpleValue ) )
                    // InternalBddDsl.g:1591:5: (lv_values_2_0= ruleSimpleValue )
                    {
                    // InternalBddDsl.g:1591:5: (lv_values_2_0= ruleSimpleValue )
                    // InternalBddDsl.g:1592:6: lv_values_2_0= ruleSimpleValue
                    {

                    						newCompositeNode(grammarAccess.getListValueAccess().getValuesSimpleValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_values_2_0=ruleSimpleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListValueRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"no.hal.bdd.BddDsl.SimpleValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:1609:4: (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==15) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalBddDsl.g:1610:5: otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_33); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getListValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalBddDsl.g:1614:5: ( (lv_values_4_0= ruleSimpleValue ) )
                    	    // InternalBddDsl.g:1615:6: (lv_values_4_0= ruleSimpleValue )
                    	    {
                    	    // InternalBddDsl.g:1615:6: (lv_values_4_0= ruleSimpleValue )
                    	    // InternalBddDsl.g:1616:7: lv_values_4_0= ruleSimpleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getListValueAccess().getValuesSimpleValueParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_values_4_0=ruleSimpleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getListValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"no.hal.bdd.BddDsl.SimpleValue");
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

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleSetValue"
    // InternalBddDsl.g:1643:1: entryRuleSetValue returns [EObject current=null] : iv_ruleSetValue= ruleSetValue EOF ;
    public final EObject entryRuleSetValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetValue = null;


        try {
            // InternalBddDsl.g:1643:49: (iv_ruleSetValue= ruleSetValue EOF )
            // InternalBddDsl.g:1644:2: iv_ruleSetValue= ruleSetValue EOF
            {
             newCompositeNode(grammarAccess.getSetValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetValue=ruleSetValue();

            state._fsp--;

             current =iv_ruleSetValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetValue"


    // $ANTLR start "ruleSetValue"
    // InternalBddDsl.g:1650:1: ruleSetValue returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSetValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1656:2: ( ( () otherlv_1= '{' ( ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )* )? otherlv_5= '}' ) )
            // InternalBddDsl.g:1657:2: ( () otherlv_1= '{' ( ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )* )? otherlv_5= '}' )
            {
            // InternalBddDsl.g:1657:2: ( () otherlv_1= '{' ( ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )* )? otherlv_5= '}' )
            // InternalBddDsl.g:1658:3: () otherlv_1= '{' ( ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )* )? otherlv_5= '}'
            {
            // InternalBddDsl.g:1658:3: ()
            // InternalBddDsl.g:1659:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetValueAccess().getSetValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getSetValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBddDsl.g:1669:3: ( ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_INT)||(LA31_0>=40 && LA31_0<=43)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBddDsl.g:1670:4: ( (lv_values_2_0= ruleSimpleValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )*
                    {
                    // InternalBddDsl.g:1670:4: ( (lv_values_2_0= ruleSimpleValue ) )
                    // InternalBddDsl.g:1671:5: (lv_values_2_0= ruleSimpleValue )
                    {
                    // InternalBddDsl.g:1671:5: (lv_values_2_0= ruleSimpleValue )
                    // InternalBddDsl.g:1672:6: lv_values_2_0= ruleSimpleValue
                    {

                    						newCompositeNode(grammarAccess.getSetValueAccess().getValuesSimpleValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_values_2_0=ruleSimpleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetValueRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"no.hal.bdd.BddDsl.SimpleValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:1689:4: (otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==15) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalBddDsl.g:1690:5: otherlv_3= ',' ( (lv_values_4_0= ruleSimpleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_33); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSetValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalBddDsl.g:1694:5: ( (lv_values_4_0= ruleSimpleValue ) )
                    	    // InternalBddDsl.g:1695:6: (lv_values_4_0= ruleSimpleValue )
                    	    {
                    	    // InternalBddDsl.g:1695:6: (lv_values_4_0= ruleSimpleValue )
                    	    // InternalBddDsl.g:1696:7: lv_values_4_0= ruleSimpleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getSetValueAccess().getValuesSimpleValueParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_values_4_0=ruleSimpleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSetValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"no.hal.bdd.BddDsl.SimpleValue");
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

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSetValueAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalBddDsl.g:1723:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalBddDsl.g:1723:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalBddDsl.g:1724:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalBddDsl.g:1730:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1736:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalBddDsl.g:1737:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalBddDsl.g:1737:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalBddDsl.g:1738:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalBddDsl.g:1738:3: (lv_value_0_0= RULE_STRING )
            // InternalBddDsl.g:1739:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalBddDsl.g:1758:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalBddDsl.g:1758:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalBddDsl.g:1759:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalBddDsl.g:1765:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1771:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalBddDsl.g:1772:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalBddDsl.g:1772:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalBddDsl.g:1773:3: (lv_value_0_0= RULE_INT )
            {
            // InternalBddDsl.g:1773:3: (lv_value_0_0= RULE_INT )
            // InternalBddDsl.g:1774:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleTRUE"
    // InternalBddDsl.g:1793:1: entryRuleTRUE returns [String current=null] : iv_ruleTRUE= ruleTRUE EOF ;
    public final String entryRuleTRUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTRUE = null;


        try {
            // InternalBddDsl.g:1793:44: (iv_ruleTRUE= ruleTRUE EOF )
            // InternalBddDsl.g:1794:2: iv_ruleTRUE= ruleTRUE EOF
            {
             newCompositeNode(grammarAccess.getTRUERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTRUE=ruleTRUE();

            state._fsp--;

             current =iv_ruleTRUE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTRUE"


    // $ANTLR start "ruleTRUE"
    // InternalBddDsl.g:1800:1: ruleTRUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'yes' ) ;
    public final AntlrDatatypeRuleToken ruleTRUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1806:2: ( (kw= 'true' | kw= 'yes' ) )
            // InternalBddDsl.g:1807:2: (kw= 'true' | kw= 'yes' )
            {
            // InternalBddDsl.g:1807:2: (kw= 'true' | kw= 'yes' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            else if ( (LA32_0==41) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalBddDsl.g:1808:3: kw= 'true'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTRUEAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1814:3: kw= 'yes'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTRUEAccess().getYesKeyword_1());
                    		

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
    // $ANTLR end "ruleTRUE"


    // $ANTLR start "entryRuleFALSE"
    // InternalBddDsl.g:1823:1: entryRuleFALSE returns [String current=null] : iv_ruleFALSE= ruleFALSE EOF ;
    public final String entryRuleFALSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFALSE = null;


        try {
            // InternalBddDsl.g:1823:45: (iv_ruleFALSE= ruleFALSE EOF )
            // InternalBddDsl.g:1824:2: iv_ruleFALSE= ruleFALSE EOF
            {
             newCompositeNode(grammarAccess.getFALSERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFALSE=ruleFALSE();

            state._fsp--;

             current =iv_ruleFALSE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFALSE"


    // $ANTLR start "ruleFALSE"
    // InternalBddDsl.g:1830:1: ruleFALSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'false' | kw= 'no' ) ;
    public final AntlrDatatypeRuleToken ruleFALSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1836:2: ( (kw= 'false' | kw= 'no' ) )
            // InternalBddDsl.g:1837:2: (kw= 'false' | kw= 'no' )
            {
            // InternalBddDsl.g:1837:2: (kw= 'false' | kw= 'no' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            else if ( (LA33_0==43) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalBddDsl.g:1838:3: kw= 'false'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFALSEAccess().getFalseKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1844:3: kw= 'no'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFALSEAccess().getNoKeyword_1());
                    		

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
    // $ANTLR end "ruleFALSE"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalBddDsl.g:1853:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalBddDsl.g:1853:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalBddDsl.g:1854:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalBddDsl.g:1860:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_1= ruleTRUE | lv_value_0_2= ruleFALSE ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_1 = null;

        AntlrDatatypeRuleToken lv_value_0_2 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1866:2: ( ( ( (lv_value_0_1= ruleTRUE | lv_value_0_2= ruleFALSE ) ) ) )
            // InternalBddDsl.g:1867:2: ( ( (lv_value_0_1= ruleTRUE | lv_value_0_2= ruleFALSE ) ) )
            {
            // InternalBddDsl.g:1867:2: ( ( (lv_value_0_1= ruleTRUE | lv_value_0_2= ruleFALSE ) ) )
            // InternalBddDsl.g:1868:3: ( (lv_value_0_1= ruleTRUE | lv_value_0_2= ruleFALSE ) )
            {
            // InternalBddDsl.g:1868:3: ( (lv_value_0_1= ruleTRUE | lv_value_0_2= ruleFALSE ) )
            // InternalBddDsl.g:1869:4: (lv_value_0_1= ruleTRUE | lv_value_0_2= ruleFALSE )
            {
            // InternalBddDsl.g:1869:4: (lv_value_0_1= ruleTRUE | lv_value_0_2= ruleFALSE )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=40 && LA34_0<=41)) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=42 && LA34_0<=43)) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalBddDsl.g:1870:5: lv_value_0_1= ruleTRUE
                    {

                    					newCompositeNode(grammarAccess.getBooleanValueAccess().getValueTRUEParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_1=ruleTRUE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBooleanValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_1,
                    						"no.hal.bdd.BddDsl.TRUE");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1886:5: lv_value_0_2= ruleFALSE
                    {

                    					newCompositeNode(grammarAccess.getBooleanValueAccess().getValueFALSEParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_2=ruleFALSE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBooleanValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_2,
                    						"no.hal.bdd.BddDsl.FALSE");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleActionPhrase"
    // InternalBddDsl.g:1907:1: entryRuleActionPhrase returns [EObject current=null] : iv_ruleActionPhrase= ruleActionPhrase EOF ;
    public final EObject entryRuleActionPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionPhrase = null;


        try {
            // InternalBddDsl.g:1907:53: (iv_ruleActionPhrase= ruleActionPhrase EOF )
            // InternalBddDsl.g:1908:2: iv_ruleActionPhrase= ruleActionPhrase EOF
            {
             newCompositeNode(grammarAccess.getActionPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionPhrase=ruleActionPhrase();

            state._fsp--;

             current =iv_ruleActionPhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionPhrase"


    // $ANTLR start "ruleActionPhrase"
    // InternalBddDsl.g:1914:1: ruleActionPhrase returns [EObject current=null] : (this_VerbAction_0= ruleVerbAction | this_VerifyAction_1= ruleVerifyAction ) ;
    public final EObject ruleActionPhrase() throws RecognitionException {
        EObject current = null;

        EObject this_VerbAction_0 = null;

        EObject this_VerifyAction_1 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1920:2: ( (this_VerbAction_0= ruleVerbAction | this_VerifyAction_1= ruleVerifyAction ) )
            // InternalBddDsl.g:1921:2: (this_VerbAction_0= ruleVerbAction | this_VerifyAction_1= ruleVerifyAction )
            {
            // InternalBddDsl.g:1921:2: (this_VerbAction_0= ruleVerbAction | this_VerifyAction_1= ruleVerifyAction )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            else if ( (LA35_0==44) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalBddDsl.g:1922:3: this_VerbAction_0= ruleVerbAction
                    {

                    			newCompositeNode(grammarAccess.getActionPhraseAccess().getVerbActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VerbAction_0=ruleVerbAction();

                    state._fsp--;


                    			current = this_VerbAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1931:3: this_VerifyAction_1= ruleVerifyAction
                    {

                    			newCompositeNode(grammarAccess.getActionPhraseAccess().getVerifyActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VerifyAction_1=ruleVerifyAction();

                    state._fsp--;


                    			current = this_VerifyAction_1;
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
    // $ANTLR end "ruleActionPhrase"


    // $ANTLR start "entryRuleVerbAction"
    // InternalBddDsl.g:1943:1: entryRuleVerbAction returns [EObject current=null] : iv_ruleVerbAction= ruleVerbAction EOF ;
    public final EObject entryRuleVerbAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerbAction = null;


        try {
            // InternalBddDsl.g:1943:51: (iv_ruleVerbAction= ruleVerbAction EOF )
            // InternalBddDsl.g:1944:2: iv_ruleVerbAction= ruleVerbAction EOF
            {
             newCompositeNode(grammarAccess.getVerbActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerbAction=ruleVerbAction();

            state._fsp--;

             current =iv_ruleVerbAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerbAction"


    // $ANTLR start "ruleVerbAction"
    // InternalBddDsl.g:1950:1: ruleVerbAction returns [EObject current=null] : ( ( (lv_action_0_0= ruleActionRef ) ) ( (lv_entity_1_0= ruleEntityRef ) ) ) ;
    public final EObject ruleVerbAction() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_0 = null;

        EObject lv_entity_1_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1956:2: ( ( ( (lv_action_0_0= ruleActionRef ) ) ( (lv_entity_1_0= ruleEntityRef ) ) ) )
            // InternalBddDsl.g:1957:2: ( ( (lv_action_0_0= ruleActionRef ) ) ( (lv_entity_1_0= ruleEntityRef ) ) )
            {
            // InternalBddDsl.g:1957:2: ( ( (lv_action_0_0= ruleActionRef ) ) ( (lv_entity_1_0= ruleEntityRef ) ) )
            // InternalBddDsl.g:1958:3: ( (lv_action_0_0= ruleActionRef ) ) ( (lv_entity_1_0= ruleEntityRef ) )
            {
            // InternalBddDsl.g:1958:3: ( (lv_action_0_0= ruleActionRef ) )
            // InternalBddDsl.g:1959:4: (lv_action_0_0= ruleActionRef )
            {
            // InternalBddDsl.g:1959:4: (lv_action_0_0= ruleActionRef )
            // InternalBddDsl.g:1960:5: lv_action_0_0= ruleActionRef
            {

            					newCompositeNode(grammarAccess.getVerbActionAccess().getActionActionRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_action_0_0=ruleActionRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerbActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"no.hal.bdd.BddDsl.ActionRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1977:3: ( (lv_entity_1_0= ruleEntityRef ) )
            // InternalBddDsl.g:1978:4: (lv_entity_1_0= ruleEntityRef )
            {
            // InternalBddDsl.g:1978:4: (lv_entity_1_0= ruleEntityRef )
            // InternalBddDsl.g:1979:5: lv_entity_1_0= ruleEntityRef
            {

            					newCompositeNode(grammarAccess.getVerbActionAccess().getEntityEntityRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_entity_1_0=ruleEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerbActionRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_1_0,
            						"no.hal.bdd.BddDsl.EntityRef");
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
    // $ANTLR end "ruleVerbAction"


    // $ANTLR start "entryRuleActionRef"
    // InternalBddDsl.g:2000:1: entryRuleActionRef returns [EObject current=null] : iv_ruleActionRef= ruleActionRef EOF ;
    public final EObject entryRuleActionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionRef = null;


        try {
            // InternalBddDsl.g:2000:50: (iv_ruleActionRef= ruleActionRef EOF )
            // InternalBddDsl.g:2001:2: iv_ruleActionRef= ruleActionRef EOF
            {
             newCompositeNode(grammarAccess.getActionRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionRef=ruleActionRef();

            state._fsp--;

             current =iv_ruleActionRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionRef"


    // $ANTLR start "ruleActionRef"
    // InternalBddDsl.g:2007:1: ruleActionRef returns [EObject current=null] : ( ( ( ruleWORD ) ) ( (lv_argument_1_0= rulePropertyValue ) )? ( (lv_preposition_2_0= rulePREP ) )? ) ;
    public final EObject ruleActionRef() throws RecognitionException {
        EObject current = null;

        EObject lv_argument_1_0 = null;

        AntlrDatatypeRuleToken lv_preposition_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2013:2: ( ( ( ( ruleWORD ) ) ( (lv_argument_1_0= rulePropertyValue ) )? ( (lv_preposition_2_0= rulePREP ) )? ) )
            // InternalBddDsl.g:2014:2: ( ( ( ruleWORD ) ) ( (lv_argument_1_0= rulePropertyValue ) )? ( (lv_preposition_2_0= rulePREP ) )? )
            {
            // InternalBddDsl.g:2014:2: ( ( ( ruleWORD ) ) ( (lv_argument_1_0= rulePropertyValue ) )? ( (lv_preposition_2_0= rulePREP ) )? )
            // InternalBddDsl.g:2015:3: ( ( ruleWORD ) ) ( (lv_argument_1_0= rulePropertyValue ) )? ( (lv_preposition_2_0= rulePREP ) )?
            {
            // InternalBddDsl.g:2015:3: ( ( ruleWORD ) )
            // InternalBddDsl.g:2016:4: ( ruleWORD )
            {
            // InternalBddDsl.g:2016:4: ( ruleWORD )
            // InternalBddDsl.g:2017:5: ruleWORD
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionRefAccess().getVerbActionDefCrossReference_0_0());
            				
            pushFollow(FOLLOW_35);
            ruleWORD();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:2031:3: ( (lv_argument_1_0= rulePropertyValue ) )?
            int alt36=2;
            switch ( input.LA(1) ) {
                case RULE_INT:
                    {
                    int LA36_1 = input.LA(2);

                    if ( ((LA36_1>=RULE_STRING && LA36_1<=RULE_INT)||(LA36_1>=23 && LA36_1<=27)||(LA36_1>=36 && LA36_1<=37)) ) {
                        alt36=1;
                    }
                    else if ( (LA36_1==EOF) ) {
                        int LA36_5 = input.LA(3);

                        if ( (LA36_5==EOF) ) {
                            alt36=1;
                        }
                    }
                    }
                    break;
                case 16:
                case 21:
                case 40:
                case 41:
                case 42:
                case 43:
                    {
                    alt36=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA36_3 = input.LA(2);

                    if ( ((LA36_3>=RULE_STRING && LA36_3<=RULE_INT)||(LA36_3>=23 && LA36_3<=27)||(LA36_3>=36 && LA36_3<=37)) ) {
                        alt36=1;
                    }
                    else if ( (LA36_3==EOF) ) {
                        int LA36_5 = input.LA(3);

                        if ( (LA36_5==EOF) ) {
                            alt36=1;
                        }
                    }
                    }
                    break;
            }

            switch (alt36) {
                case 1 :
                    // InternalBddDsl.g:2032:4: (lv_argument_1_0= rulePropertyValue )
                    {
                    // InternalBddDsl.g:2032:4: (lv_argument_1_0= rulePropertyValue )
                    // InternalBddDsl.g:2033:5: lv_argument_1_0= rulePropertyValue
                    {

                    					newCompositeNode(grammarAccess.getActionRefAccess().getArgumentPropertyValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_36);
                    lv_argument_1_0=rulePropertyValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRefRule());
                    					}
                    					set(
                    						current,
                    						"argument",
                    						lv_argument_1_0,
                    						"no.hal.bdd.BddDsl.PropertyValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:2050:3: ( (lv_preposition_2_0= rulePREP ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=23 && LA37_0<=27)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBddDsl.g:2051:4: (lv_preposition_2_0= rulePREP )
                    {
                    // InternalBddDsl.g:2051:4: (lv_preposition_2_0= rulePREP )
                    // InternalBddDsl.g:2052:5: lv_preposition_2_0= rulePREP
                    {

                    					newCompositeNode(grammarAccess.getActionRefAccess().getPrepositionPREPParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_preposition_2_0=rulePREP();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRefRule());
                    					}
                    					set(
                    						current,
                    						"preposition",
                    						lv_preposition_2_0,
                    						"no.hal.bdd.BddDsl.PREP");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleActionRef"


    // $ANTLR start "entryRuleVerifyAction"
    // InternalBddDsl.g:2073:1: entryRuleVerifyAction returns [EObject current=null] : iv_ruleVerifyAction= ruleVerifyAction EOF ;
    public final EObject entryRuleVerifyAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifyAction = null;


        try {
            // InternalBddDsl.g:2073:53: (iv_ruleVerifyAction= ruleVerifyAction EOF )
            // InternalBddDsl.g:2074:2: iv_ruleVerifyAction= ruleVerifyAction EOF
            {
             newCompositeNode(grammarAccess.getVerifyActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerifyAction=ruleVerifyAction();

            state._fsp--;

             current =iv_ruleVerifyAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerifyAction"


    // $ANTLR start "ruleVerifyAction"
    // InternalBddDsl.g:2080:1: ruleVerifyAction returns [EObject current=null] : (otherlv_0= 'assure' ( (lv_state_1_0= ruleStatePhrase ) ) ) ;
    public final EObject ruleVerifyAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_state_1_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2086:2: ( (otherlv_0= 'assure' ( (lv_state_1_0= ruleStatePhrase ) ) ) )
            // InternalBddDsl.g:2087:2: (otherlv_0= 'assure' ( (lv_state_1_0= ruleStatePhrase ) ) )
            {
            // InternalBddDsl.g:2087:2: (otherlv_0= 'assure' ( (lv_state_1_0= ruleStatePhrase ) ) )
            // InternalBddDsl.g:2088:3: otherlv_0= 'assure' ( (lv_state_1_0= ruleStatePhrase ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifyActionAccess().getAssureKeyword_0());
            		
            // InternalBddDsl.g:2092:3: ( (lv_state_1_0= ruleStatePhrase ) )
            // InternalBddDsl.g:2093:4: (lv_state_1_0= ruleStatePhrase )
            {
            // InternalBddDsl.g:2093:4: (lv_state_1_0= ruleStatePhrase )
            // InternalBddDsl.g:2094:5: lv_state_1_0= ruleStatePhrase
            {

            					newCompositeNode(grammarAccess.getVerifyActionAccess().getStateStatePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_1_0=ruleStatePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifyActionRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_1_0,
            						"no.hal.bdd.BddDsl.StatePhrase");
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
    // $ANTLR end "ruleVerifyAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001C8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000FA00012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000FA00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003000000070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000F0000210060L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000F0000400060L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000F0000000060L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000F0000100060L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000F000FA10062L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000F800002L});

}