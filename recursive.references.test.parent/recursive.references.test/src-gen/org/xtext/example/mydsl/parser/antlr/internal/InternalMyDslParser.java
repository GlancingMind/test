package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'node'", "';'", "'system'", "'{'", "'nodes'", "':'", "'subsystems'", "'}'", "'.'", "'->'", "'deploys'", "'on'", "'deployment'", "'platform'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_nodes_0_0= ruleNodeDefinition ) ) | ( (lv_systems_1_0= ruleSystemDefinition ) ) | ( (lv_deployments_2_0= ruleDeployment ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_nodes_0_0 = null;

        EObject lv_systems_1_0 = null;

        EObject lv_deployments_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_nodes_0_0= ruleNodeDefinition ) ) | ( (lv_systems_1_0= ruleSystemDefinition ) ) | ( (lv_deployments_2_0= ruleDeployment ) ) )* )
            // InternalMyDsl.g:78:2: ( ( (lv_nodes_0_0= ruleNodeDefinition ) ) | ( (lv_systems_1_0= ruleSystemDefinition ) ) | ( (lv_deployments_2_0= ruleDeployment ) ) )*
            {
            // InternalMyDsl.g:78:2: ( ( (lv_nodes_0_0= ruleNodeDefinition ) ) | ( (lv_systems_1_0= ruleSystemDefinition ) ) | ( (lv_deployments_2_0= ruleDeployment ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 13:
                    {
                    alt1=2;
                    }
                    break;
                case 23:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: ( (lv_nodes_0_0= ruleNodeDefinition ) )
            	    {
            	    // InternalMyDsl.g:79:3: ( (lv_nodes_0_0= ruleNodeDefinition ) )
            	    // InternalMyDsl.g:80:4: (lv_nodes_0_0= ruleNodeDefinition )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_nodes_0_0= ruleNodeDefinition )
            	    // InternalMyDsl.g:81:5: lv_nodes_0_0= ruleNodeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getNodesNodeDefinitionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_nodes_0_0=ruleNodeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.NodeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:99:3: ( (lv_systems_1_0= ruleSystemDefinition ) )
            	    {
            	    // InternalMyDsl.g:99:3: ( (lv_systems_1_0= ruleSystemDefinition ) )
            	    // InternalMyDsl.g:100:4: (lv_systems_1_0= ruleSystemDefinition )
            	    {
            	    // InternalMyDsl.g:100:4: (lv_systems_1_0= ruleSystemDefinition )
            	    // InternalMyDsl.g:101:5: lv_systems_1_0= ruleSystemDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSystemsSystemDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_systems_1_0=ruleSystemDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systems",
            	    						lv_systems_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.SystemDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:119:3: ( (lv_deployments_2_0= ruleDeployment ) )
            	    {
            	    // InternalMyDsl.g:119:3: ( (lv_deployments_2_0= ruleDeployment ) )
            	    // InternalMyDsl.g:120:4: (lv_deployments_2_0= ruleDeployment )
            	    {
            	    // InternalMyDsl.g:120:4: (lv_deployments_2_0= ruleDeployment )
            	    // InternalMyDsl.g:121:5: lv_deployments_2_0= ruleDeployment
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDeploymentsDeploymentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_deployments_2_0=ruleDeployment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"deployments",
            	    						lv_deployments_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Deployment");
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


            	leaveRule();

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


    // $ANTLR start "entryRuleNodeDefinition"
    // InternalMyDsl.g:142:1: entryRuleNodeDefinition returns [EObject current=null] : iv_ruleNodeDefinition= ruleNodeDefinition EOF ;
    public final EObject entryRuleNodeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDefinition = null;


        try {
            // InternalMyDsl.g:142:55: (iv_ruleNodeDefinition= ruleNodeDefinition EOF )
            // InternalMyDsl.g:143:2: iv_ruleNodeDefinition= ruleNodeDefinition EOF
            {
             newCompositeNode(grammarAccess.getNodeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeDefinition=ruleNodeDefinition();

            state._fsp--;

             current =iv_ruleNodeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeDefinition"


    // $ANTLR start "ruleNodeDefinition"
    // InternalMyDsl.g:149:1: ruleNodeDefinition returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleNodeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:155:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:156:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:156:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:157:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeDefinitionAccess().getNodeKeyword_0());
            		
            // InternalMyDsl.g:161:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:162:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:162:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:163:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeDefinitionAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeDefinition"


    // $ANTLR start "entryRuleNodeInstance"
    // InternalMyDsl.g:187:1: entryRuleNodeInstance returns [EObject current=null] : iv_ruleNodeInstance= ruleNodeInstance EOF ;
    public final EObject entryRuleNodeInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeInstance = null;


        try {
            // InternalMyDsl.g:187:53: (iv_ruleNodeInstance= ruleNodeInstance EOF )
            // InternalMyDsl.g:188:2: iv_ruleNodeInstance= ruleNodeInstance EOF
            {
             newCompositeNode(grammarAccess.getNodeInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeInstance=ruleNodeInstance();

            state._fsp--;

             current =iv_ruleNodeInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeInstance"


    // $ANTLR start "ruleNodeInstance"
    // InternalMyDsl.g:194:1: ruleNodeInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNodeInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:200:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:201:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:201:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:202:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMyDsl.g:202:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:203:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:203:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:204:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getNodeInstanceAccess().getTypeNodeDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:215:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:216:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:216:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:217:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeInstanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeInstanceRule());
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
    // $ANTLR end "ruleNodeInstance"


    // $ANTLR start "entryRuleSystemDefinition"
    // InternalMyDsl.g:237:1: entryRuleSystemDefinition returns [EObject current=null] : iv_ruleSystemDefinition= ruleSystemDefinition EOF ;
    public final EObject entryRuleSystemDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDefinition = null;


        try {
            // InternalMyDsl.g:237:57: (iv_ruleSystemDefinition= ruleSystemDefinition EOF )
            // InternalMyDsl.g:238:2: iv_ruleSystemDefinition= ruleSystemDefinition EOF
            {
             newCompositeNode(grammarAccess.getSystemDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemDefinition=ruleSystemDefinition();

            state._fsp--;

             current =iv_ruleSystemDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemDefinition"


    // $ANTLR start "ruleSystemDefinition"
    // InternalMyDsl.g:244:1: ruleSystemDefinition returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'nodes' otherlv_4= ':' ( ( (lv_nodes_5_0= ruleNodeInstance ) ) otherlv_6= ';' )* ) | (otherlv_7= 'subsystems' otherlv_8= ':' ( ( (lv_subsystems_9_0= ruleSystemInstance ) ) otherlv_10= ';' )* ) )* otherlv_11= '}' ) ;
    public final EObject ruleSystemDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_nodes_5_0 = null;

        EObject lv_subsystems_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:250:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'nodes' otherlv_4= ':' ( ( (lv_nodes_5_0= ruleNodeInstance ) ) otherlv_6= ';' )* ) | (otherlv_7= 'subsystems' otherlv_8= ':' ( ( (lv_subsystems_9_0= ruleSystemInstance ) ) otherlv_10= ';' )* ) )* otherlv_11= '}' ) )
            // InternalMyDsl.g:251:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'nodes' otherlv_4= ':' ( ( (lv_nodes_5_0= ruleNodeInstance ) ) otherlv_6= ';' )* ) | (otherlv_7= 'subsystems' otherlv_8= ':' ( ( (lv_subsystems_9_0= ruleSystemInstance ) ) otherlv_10= ';' )* ) )* otherlv_11= '}' )
            {
            // InternalMyDsl.g:251:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'nodes' otherlv_4= ':' ( ( (lv_nodes_5_0= ruleNodeInstance ) ) otherlv_6= ';' )* ) | (otherlv_7= 'subsystems' otherlv_8= ':' ( ( (lv_subsystems_9_0= ruleSystemInstance ) ) otherlv_10= ';' )* ) )* otherlv_11= '}' )
            // InternalMyDsl.g:252:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'nodes' otherlv_4= ':' ( ( (lv_nodes_5_0= ruleNodeInstance ) ) otherlv_6= ';' )* ) | (otherlv_7= 'subsystems' otherlv_8= ':' ( ( (lv_subsystems_9_0= ruleSystemInstance ) ) otherlv_10= ';' )* ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemDefinitionAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:258:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:278:3: ( (otherlv_3= 'nodes' otherlv_4= ':' ( ( (lv_nodes_5_0= ruleNodeInstance ) ) otherlv_6= ';' )* ) | (otherlv_7= 'subsystems' otherlv_8= ':' ( ( (lv_subsystems_9_0= ruleSystemInstance ) ) otherlv_10= ';' )* ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }
                else if ( (LA4_0==17) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:279:4: (otherlv_3= 'nodes' otherlv_4= ':' ( ( (lv_nodes_5_0= ruleNodeInstance ) ) otherlv_6= ';' )* )
            	    {
            	    // InternalMyDsl.g:279:4: (otherlv_3= 'nodes' otherlv_4= ':' ( ( (lv_nodes_5_0= ruleNodeInstance ) ) otherlv_6= ';' )* )
            	    // InternalMyDsl.g:280:5: otherlv_3= 'nodes' otherlv_4= ':' ( ( (lv_nodes_5_0= ruleNodeInstance ) ) otherlv_6= ';' )*
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_8); 

            	    					newLeafNode(otherlv_3, grammarAccess.getSystemDefinitionAccess().getNodesKeyword_3_0_0());
            	    				
            	    otherlv_4=(Token)match(input,16,FOLLOW_9); 

            	    					newLeafNode(otherlv_4, grammarAccess.getSystemDefinitionAccess().getColonKeyword_3_0_1());
            	    				
            	    // InternalMyDsl.g:288:5: ( ( (lv_nodes_5_0= ruleNodeInstance ) ) otherlv_6= ';' )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==RULE_ID) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:289:6: ( (lv_nodes_5_0= ruleNodeInstance ) ) otherlv_6= ';'
            	    	    {
            	    	    // InternalMyDsl.g:289:6: ( (lv_nodes_5_0= ruleNodeInstance ) )
            	    	    // InternalMyDsl.g:290:7: (lv_nodes_5_0= ruleNodeInstance )
            	    	    {
            	    	    // InternalMyDsl.g:290:7: (lv_nodes_5_0= ruleNodeInstance )
            	    	    // InternalMyDsl.g:291:8: lv_nodes_5_0= ruleNodeInstance
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getSystemDefinitionAccess().getNodesNodeInstanceParserRuleCall_3_0_2_0_0());
            	    	    							
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_nodes_5_0=ruleNodeInstance();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getSystemDefinitionRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"nodes",
            	    	    									lv_nodes_5_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.NodeInstance");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }

            	    	    otherlv_6=(Token)match(input,12,FOLLOW_9); 

            	    	    						newLeafNode(otherlv_6, grammarAccess.getSystemDefinitionAccess().getSemicolonKeyword_3_0_2_1());
            	    	    					

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:315:4: (otherlv_7= 'subsystems' otherlv_8= ':' ( ( (lv_subsystems_9_0= ruleSystemInstance ) ) otherlv_10= ';' )* )
            	    {
            	    // InternalMyDsl.g:315:4: (otherlv_7= 'subsystems' otherlv_8= ':' ( ( (lv_subsystems_9_0= ruleSystemInstance ) ) otherlv_10= ';' )* )
            	    // InternalMyDsl.g:316:5: otherlv_7= 'subsystems' otherlv_8= ':' ( ( (lv_subsystems_9_0= ruleSystemInstance ) ) otherlv_10= ';' )*
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_8); 

            	    					newLeafNode(otherlv_7, grammarAccess.getSystemDefinitionAccess().getSubsystemsKeyword_3_1_0());
            	    				
            	    otherlv_8=(Token)match(input,16,FOLLOW_9); 

            	    					newLeafNode(otherlv_8, grammarAccess.getSystemDefinitionAccess().getColonKeyword_3_1_1());
            	    				
            	    // InternalMyDsl.g:324:5: ( ( (lv_subsystems_9_0= ruleSystemInstance ) ) otherlv_10= ';' )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_ID) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:325:6: ( (lv_subsystems_9_0= ruleSystemInstance ) ) otherlv_10= ';'
            	    	    {
            	    	    // InternalMyDsl.g:325:6: ( (lv_subsystems_9_0= ruleSystemInstance ) )
            	    	    // InternalMyDsl.g:326:7: (lv_subsystems_9_0= ruleSystemInstance )
            	    	    {
            	    	    // InternalMyDsl.g:326:7: (lv_subsystems_9_0= ruleSystemInstance )
            	    	    // InternalMyDsl.g:327:8: lv_subsystems_9_0= ruleSystemInstance
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getSystemDefinitionAccess().getSubsystemsSystemInstanceParserRuleCall_3_1_2_0_0());
            	    	    							
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_subsystems_9_0=ruleSystemInstance();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getSystemDefinitionRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"subsystems",
            	    	    									lv_subsystems_9_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.SystemInstance");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }

            	    	    otherlv_10=(Token)match(input,12,FOLLOW_9); 

            	    	    						newLeafNode(otherlv_10, grammarAccess.getSystemDefinitionAccess().getSemicolonKeyword_3_1_2_1());
            	    	    					

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSystemDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemDefinition"


    // $ANTLR start "entryRuleSystemInstance"
    // InternalMyDsl.g:359:1: entryRuleSystemInstance returns [EObject current=null] : iv_ruleSystemInstance= ruleSystemInstance EOF ;
    public final EObject entryRuleSystemInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemInstance = null;


        try {
            // InternalMyDsl.g:359:55: (iv_ruleSystemInstance= ruleSystemInstance EOF )
            // InternalMyDsl.g:360:2: iv_ruleSystemInstance= ruleSystemInstance EOF
            {
             newCompositeNode(grammarAccess.getSystemInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemInstance=ruleSystemInstance();

            state._fsp--;

             current =iv_ruleSystemInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemInstance"


    // $ANTLR start "ruleSystemInstance"
    // InternalMyDsl.g:366:1: ruleSystemInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSystemInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:372:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:373:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:373:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:374:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMyDsl.g:374:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:375:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:375:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:376:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getSystemInstanceAccess().getTypeSystemDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:387:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:388:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:388:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:389:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemInstanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemInstanceRule());
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
    // $ANTLR end "ruleSystemInstance"


    // $ANTLR start "entryRuleSystemReference"
    // InternalMyDsl.g:409:1: entryRuleSystemReference returns [EObject current=null] : iv_ruleSystemReference= ruleSystemReference EOF ;
    public final EObject entryRuleSystemReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemReference = null;


        try {
            // InternalMyDsl.g:409:56: (iv_ruleSystemReference= ruleSystemReference EOF )
            // InternalMyDsl.g:410:2: iv_ruleSystemReference= ruleSystemReference EOF
            {
             newCompositeNode(grammarAccess.getSystemReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemReference=ruleSystemReference();

            state._fsp--;

             current =iv_ruleSystemReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemReference"


    // $ANTLR start "ruleSystemReference"
    // InternalMyDsl.g:416:1: ruleSystemReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleSystemReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:422:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )? ) )
            // InternalMyDsl.g:423:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // InternalMyDsl.g:423:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )? )
            // InternalMyDsl.g:424:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )?
            {
            // InternalMyDsl.g:424:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:425:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:425:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:426:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getSystemReferenceAccess().getSystemSystemInstanceCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:437:3: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:438:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getSystemReferenceAccess().getFullStopKeyword_1_0());
                    			
                    // InternalMyDsl.g:442:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:443:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:443:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:444:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemReferenceRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getSystemReferenceAccess().getSubsystemSystemReferenceCrossReference_1_1_0());
                    					

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
    // $ANTLR end "ruleSystemReference"


    // $ANTLR start "entryRuleNodeInstanceReference"
    // InternalMyDsl.g:460:1: entryRuleNodeInstanceReference returns [EObject current=null] : iv_ruleNodeInstanceReference= ruleNodeInstanceReference EOF ;
    public final EObject entryRuleNodeInstanceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeInstanceReference = null;


        try {
            // InternalMyDsl.g:460:62: (iv_ruleNodeInstanceReference= ruleNodeInstanceReference EOF )
            // InternalMyDsl.g:461:2: iv_ruleNodeInstanceReference= ruleNodeInstanceReference EOF
            {
             newCompositeNode(grammarAccess.getNodeInstanceReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeInstanceReference=ruleNodeInstanceReference();

            state._fsp--;

             current =iv_ruleNodeInstanceReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeInstanceReference"


    // $ANTLR start "ruleNodeInstanceReference"
    // InternalMyDsl.g:467:1: ruleNodeInstanceReference returns [EObject current=null] : ( ( (lv_belongingSystemReference_0_0= ruleSystemReference ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleNodeInstanceReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_belongingSystemReference_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:473:2: ( ( ( (lv_belongingSystemReference_0_0= ruleSystemReference ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMyDsl.g:474:2: ( ( (lv_belongingSystemReference_0_0= ruleSystemReference ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMyDsl.g:474:2: ( ( (lv_belongingSystemReference_0_0= ruleSystemReference ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // InternalMyDsl.g:475:3: ( (lv_belongingSystemReference_0_0= ruleSystemReference ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMyDsl.g:475:3: ( (lv_belongingSystemReference_0_0= ruleSystemReference ) )
            // InternalMyDsl.g:476:4: (lv_belongingSystemReference_0_0= ruleSystemReference )
            {
            // InternalMyDsl.g:476:4: (lv_belongingSystemReference_0_0= ruleSystemReference )
            // InternalMyDsl.g:477:5: lv_belongingSystemReference_0_0= ruleSystemReference
            {

            					newCompositeNode(grammarAccess.getNodeInstanceReferenceAccess().getBelongingSystemReferenceSystemReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_belongingSystemReference_0_0=ruleSystemReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeInstanceReferenceRule());
            					}
            					set(
            						current,
            						"belongingSystemReference",
            						lv_belongingSystemReference_0_0,
            						"org.xtext.example.mydsl.MyDsl.SystemReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeInstanceReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMyDsl.g:498:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:499:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:499:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:500:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeInstanceReferenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getNodeInstanceReferenceAccess().getNodeNodeInstanceCrossReference_2_0());
            				

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
    // $ANTLR end "ruleNodeInstanceReference"


    // $ANTLR start "entryRuleDeploymentStatement"
    // InternalMyDsl.g:515:1: entryRuleDeploymentStatement returns [EObject current=null] : iv_ruleDeploymentStatement= ruleDeploymentStatement EOF ;
    public final EObject entryRuleDeploymentStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentStatement = null;


        try {
            // InternalMyDsl.g:515:60: (iv_ruleDeploymentStatement= ruleDeploymentStatement EOF )
            // InternalMyDsl.g:516:2: iv_ruleDeploymentStatement= ruleDeploymentStatement EOF
            {
             newCompositeNode(grammarAccess.getDeploymentStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeploymentStatement=ruleDeploymentStatement();

            state._fsp--;

             current =iv_ruleDeploymentStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeploymentStatement"


    // $ANTLR start "ruleDeploymentStatement"
    // InternalMyDsl.g:522:1: ruleDeploymentStatement returns [EObject current=null] : (otherlv_0= 'deploys' ( (lv_nodes_1_0= ruleNodeInstanceReference ) ) otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDeploymentStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_nodes_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:528:2: ( (otherlv_0= 'deploys' ( (lv_nodes_1_0= ruleNodeInstanceReference ) ) otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalMyDsl.g:529:2: (otherlv_0= 'deploys' ( (lv_nodes_1_0= ruleNodeInstanceReference ) ) otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalMyDsl.g:529:2: (otherlv_0= 'deploys' ( (lv_nodes_1_0= ruleNodeInstanceReference ) ) otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalMyDsl.g:530:3: otherlv_0= 'deploys' ( (lv_nodes_1_0= ruleNodeInstanceReference ) ) otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeploymentStatementAccess().getDeploysKeyword_0());
            		
            // InternalMyDsl.g:534:3: ( (lv_nodes_1_0= ruleNodeInstanceReference ) )
            // InternalMyDsl.g:535:4: (lv_nodes_1_0= ruleNodeInstanceReference )
            {
            // InternalMyDsl.g:535:4: (lv_nodes_1_0= ruleNodeInstanceReference )
            // InternalMyDsl.g:536:5: lv_nodes_1_0= ruleNodeInstanceReference
            {

            					newCompositeNode(grammarAccess.getDeploymentStatementAccess().getNodesNodeInstanceReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_nodes_1_0=ruleNodeInstanceReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeploymentStatementRule());
            					}
            					set(
            						current,
            						"nodes",
            						lv_nodes_1_0,
            						"org.xtext.example.mydsl.MyDsl.NodeInstanceReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDeploymentStatementAccess().getOnKeyword_2());
            		
            // InternalMyDsl.g:557:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:558:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:558:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:559:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeploymentStatementRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_3, grammarAccess.getDeploymentStatementAccess().getPlatformPlatformInstanceCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeploymentStatementAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeploymentStatement"


    // $ANTLR start "entryRuleDeployment"
    // InternalMyDsl.g:578:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalMyDsl.g:578:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalMyDsl.g:579:2: iv_ruleDeployment= ruleDeployment EOF
            {
             newCompositeNode(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeployment=ruleDeployment();

            state._fsp--;

             current =iv_ruleDeployment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalMyDsl.g:585:1: ruleDeployment returns [EObject current=null] : ( () otherlv_1= 'deployment' otherlv_2= '{' (otherlv_3= 'platform' ( (lv_platforms_4_0= rulePlatformInstance ) ) otherlv_5= ';' )* (otherlv_6= 'system' ( (lv_systems_7_0= ruleSystemInstance ) ) otherlv_8= ';' )* ( (lv_deployments_9_0= ruleDeploymentStatement ) )* otherlv_10= '}' ) ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_platforms_4_0 = null;

        EObject lv_systems_7_0 = null;

        EObject lv_deployments_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:591:2: ( ( () otherlv_1= 'deployment' otherlv_2= '{' (otherlv_3= 'platform' ( (lv_platforms_4_0= rulePlatformInstance ) ) otherlv_5= ';' )* (otherlv_6= 'system' ( (lv_systems_7_0= ruleSystemInstance ) ) otherlv_8= ';' )* ( (lv_deployments_9_0= ruleDeploymentStatement ) )* otherlv_10= '}' ) )
            // InternalMyDsl.g:592:2: ( () otherlv_1= 'deployment' otherlv_2= '{' (otherlv_3= 'platform' ( (lv_platforms_4_0= rulePlatformInstance ) ) otherlv_5= ';' )* (otherlv_6= 'system' ( (lv_systems_7_0= ruleSystemInstance ) ) otherlv_8= ';' )* ( (lv_deployments_9_0= ruleDeploymentStatement ) )* otherlv_10= '}' )
            {
            // InternalMyDsl.g:592:2: ( () otherlv_1= 'deployment' otherlv_2= '{' (otherlv_3= 'platform' ( (lv_platforms_4_0= rulePlatformInstance ) ) otherlv_5= ';' )* (otherlv_6= 'system' ( (lv_systems_7_0= ruleSystemInstance ) ) otherlv_8= ';' )* ( (lv_deployments_9_0= ruleDeploymentStatement ) )* otherlv_10= '}' )
            // InternalMyDsl.g:593:3: () otherlv_1= 'deployment' otherlv_2= '{' (otherlv_3= 'platform' ( (lv_platforms_4_0= rulePlatformInstance ) ) otherlv_5= ';' )* (otherlv_6= 'system' ( (lv_systems_7_0= ruleSystemInstance ) ) otherlv_8= ';' )* ( (lv_deployments_9_0= ruleDeploymentStatement ) )* otherlv_10= '}'
            {
            // InternalMyDsl.g:593:3: ()
            // InternalMyDsl.g:594:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeploymentAccess().getDeploymentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDeploymentAccess().getDeploymentKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:608:3: (otherlv_3= 'platform' ( (lv_platforms_4_0= rulePlatformInstance ) ) otherlv_5= ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:609:4: otherlv_3= 'platform' ( (lv_platforms_4_0= rulePlatformInstance ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDeploymentAccess().getPlatformKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:613:4: ( (lv_platforms_4_0= rulePlatformInstance ) )
            	    // InternalMyDsl.g:614:5: (lv_platforms_4_0= rulePlatformInstance )
            	    {
            	    // InternalMyDsl.g:614:5: (lv_platforms_4_0= rulePlatformInstance )
            	    // InternalMyDsl.g:615:6: lv_platforms_4_0= rulePlatformInstance
            	    {

            	    						newCompositeNode(grammarAccess.getDeploymentAccess().getPlatformsPlatformInstanceParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_platforms_4_0=rulePlatformInstance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"platforms",
            	    							lv_platforms_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.PlatformInstance");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,12,FOLLOW_13); 

            	    				newLeafNode(otherlv_5, grammarAccess.getDeploymentAccess().getSemicolonKeyword_3_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMyDsl.g:637:3: (otherlv_6= 'system' ( (lv_systems_7_0= ruleSystemInstance ) ) otherlv_8= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:638:4: otherlv_6= 'system' ( (lv_systems_7_0= ruleSystemInstance ) ) otherlv_8= ';'
            	    {
            	    otherlv_6=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDeploymentAccess().getSystemKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:642:4: ( (lv_systems_7_0= ruleSystemInstance ) )
            	    // InternalMyDsl.g:643:5: (lv_systems_7_0= ruleSystemInstance )
            	    {
            	    // InternalMyDsl.g:643:5: (lv_systems_7_0= ruleSystemInstance )
            	    // InternalMyDsl.g:644:6: lv_systems_7_0= ruleSystemInstance
            	    {

            	    						newCompositeNode(grammarAccess.getDeploymentAccess().getSystemsSystemInstanceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_systems_7_0=ruleSystemInstance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"systems",
            	    							lv_systems_7_0,
            	    							"org.xtext.example.mydsl.MyDsl.SystemInstance");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,12,FOLLOW_14); 

            	    				newLeafNode(otherlv_8, grammarAccess.getDeploymentAccess().getSemicolonKeyword_4_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalMyDsl.g:666:3: ( (lv_deployments_9_0= ruleDeploymentStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:667:4: (lv_deployments_9_0= ruleDeploymentStatement )
            	    {
            	    // InternalMyDsl.g:667:4: (lv_deployments_9_0= ruleDeploymentStatement )
            	    // InternalMyDsl.g:668:5: lv_deployments_9_0= ruleDeploymentStatement
            	    {

            	    					newCompositeNode(grammarAccess.getDeploymentAccess().getDeploymentsDeploymentStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_deployments_9_0=ruleDeploymentStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"deployments",
            	    						lv_deployments_9_0,
            	    						"org.xtext.example.mydsl.MyDsl.DeploymentStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRulePlatformInstance"
    // InternalMyDsl.g:693:1: entryRulePlatformInstance returns [EObject current=null] : iv_rulePlatformInstance= rulePlatformInstance EOF ;
    public final EObject entryRulePlatformInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformInstance = null;


        try {
            // InternalMyDsl.g:693:57: (iv_rulePlatformInstance= rulePlatformInstance EOF )
            // InternalMyDsl.g:694:2: iv_rulePlatformInstance= rulePlatformInstance EOF
            {
             newCompositeNode(grammarAccess.getPlatformInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformInstance=rulePlatformInstance();

            state._fsp--;

             current =iv_rulePlatformInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlatformInstance"


    // $ANTLR start "rulePlatformInstance"
    // InternalMyDsl.g:700:1: rulePlatformInstance returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePlatformInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:706:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:707:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:707:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:708:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:708:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:709:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPlatformInstanceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPlatformInstanceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "rulePlatformInstance"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000802802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001242000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000242000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000240000L});

}