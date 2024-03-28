package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'node'", "';'", "'system'", "'{'", "'}'", "'nodes'", "':'", "'subsystems'", "'.'", "'->'", "'deploys'", "'on'", "'deployment'", "'platform'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalMyDsl.g:68:3: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNodeDefinition"
    // InternalMyDsl.g:78:1: entryRuleNodeDefinition : ruleNodeDefinition EOF ;
    public final void entryRuleNodeDefinition() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleNodeDefinition EOF )
            // InternalMyDsl.g:80:1: ruleNodeDefinition EOF
            {
             before(grammarAccess.getNodeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeDefinition();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeDefinition"


    // $ANTLR start "ruleNodeDefinition"
    // InternalMyDsl.g:87:1: ruleNodeDefinition : ( ( rule__NodeDefinition__Group__0 ) ) ;
    public final void ruleNodeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__NodeDefinition__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__NodeDefinition__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__NodeDefinition__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__NodeDefinition__Group__0 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__NodeDefinition__Group__0 )
            // InternalMyDsl.g:94:4: rule__NodeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeDefinition"


    // $ANTLR start "entryRuleNodeInstance"
    // InternalMyDsl.g:103:1: entryRuleNodeInstance : ruleNodeInstance EOF ;
    public final void entryRuleNodeInstance() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleNodeInstance EOF )
            // InternalMyDsl.g:105:1: ruleNodeInstance EOF
            {
             before(grammarAccess.getNodeInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeInstance();

            state._fsp--;

             after(grammarAccess.getNodeInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeInstance"


    // $ANTLR start "ruleNodeInstance"
    // InternalMyDsl.g:112:1: ruleNodeInstance : ( ( rule__NodeInstance__Group__0 ) ) ;
    public final void ruleNodeInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__NodeInstance__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__NodeInstance__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__NodeInstance__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__NodeInstance__Group__0 )
            {
             before(grammarAccess.getNodeInstanceAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__NodeInstance__Group__0 )
            // InternalMyDsl.g:119:4: rule__NodeInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeInstance"


    // $ANTLR start "entryRuleSystemDefinition"
    // InternalMyDsl.g:128:1: entryRuleSystemDefinition : ruleSystemDefinition EOF ;
    public final void entryRuleSystemDefinition() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleSystemDefinition EOF )
            // InternalMyDsl.g:130:1: ruleSystemDefinition EOF
            {
             before(grammarAccess.getSystemDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemDefinition();

            state._fsp--;

             after(grammarAccess.getSystemDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemDefinition"


    // $ANTLR start "ruleSystemDefinition"
    // InternalMyDsl.g:137:1: ruleSystemDefinition : ( ( rule__SystemDefinition__Group__0 ) ) ;
    public final void ruleSystemDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__SystemDefinition__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__SystemDefinition__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__SystemDefinition__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__SystemDefinition__Group__0 )
            {
             before(grammarAccess.getSystemDefinitionAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__SystemDefinition__Group__0 )
            // InternalMyDsl.g:144:4: rule__SystemDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemDefinition"


    // $ANTLR start "entryRuleSystemInstance"
    // InternalMyDsl.g:153:1: entryRuleSystemInstance : ruleSystemInstance EOF ;
    public final void entryRuleSystemInstance() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleSystemInstance EOF )
            // InternalMyDsl.g:155:1: ruleSystemInstance EOF
            {
             before(grammarAccess.getSystemInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemInstance();

            state._fsp--;

             after(grammarAccess.getSystemInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemInstance"


    // $ANTLR start "ruleSystemInstance"
    // InternalMyDsl.g:162:1: ruleSystemInstance : ( ( rule__SystemInstance__Group__0 ) ) ;
    public final void ruleSystemInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__SystemInstance__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__SystemInstance__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__SystemInstance__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__SystemInstance__Group__0 )
            {
             before(grammarAccess.getSystemInstanceAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__SystemInstance__Group__0 )
            // InternalMyDsl.g:169:4: rule__SystemInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemInstance"


    // $ANTLR start "entryRuleSystemReference"
    // InternalMyDsl.g:178:1: entryRuleSystemReference : ruleSystemReference EOF ;
    public final void entryRuleSystemReference() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleSystemReference EOF )
            // InternalMyDsl.g:180:1: ruleSystemReference EOF
            {
             before(grammarAccess.getSystemReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemReference();

            state._fsp--;

             after(grammarAccess.getSystemReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemReference"


    // $ANTLR start "ruleSystemReference"
    // InternalMyDsl.g:187:1: ruleSystemReference : ( ( rule__SystemReference__Group__0 ) ) ;
    public final void ruleSystemReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__SystemReference__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__SystemReference__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__SystemReference__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__SystemReference__Group__0 )
            {
             before(grammarAccess.getSystemReferenceAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__SystemReference__Group__0 )
            // InternalMyDsl.g:194:4: rule__SystemReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemReference"


    // $ANTLR start "entryRuleNodeInstanceReference"
    // InternalMyDsl.g:203:1: entryRuleNodeInstanceReference : ruleNodeInstanceReference EOF ;
    public final void entryRuleNodeInstanceReference() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleNodeInstanceReference EOF )
            // InternalMyDsl.g:205:1: ruleNodeInstanceReference EOF
            {
             before(grammarAccess.getNodeInstanceReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeInstanceReference();

            state._fsp--;

             after(grammarAccess.getNodeInstanceReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeInstanceReference"


    // $ANTLR start "ruleNodeInstanceReference"
    // InternalMyDsl.g:212:1: ruleNodeInstanceReference : ( ( rule__NodeInstanceReference__Group__0 ) ) ;
    public final void ruleNodeInstanceReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__NodeInstanceReference__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__NodeInstanceReference__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__NodeInstanceReference__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__NodeInstanceReference__Group__0 )
            {
             before(grammarAccess.getNodeInstanceReferenceAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__NodeInstanceReference__Group__0 )
            // InternalMyDsl.g:219:4: rule__NodeInstanceReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeInstanceReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeInstanceReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeInstanceReference"


    // $ANTLR start "entryRuleDeploymentStatement"
    // InternalMyDsl.g:228:1: entryRuleDeploymentStatement : ruleDeploymentStatement EOF ;
    public final void entryRuleDeploymentStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleDeploymentStatement EOF )
            // InternalMyDsl.g:230:1: ruleDeploymentStatement EOF
            {
             before(grammarAccess.getDeploymentStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleDeploymentStatement();

            state._fsp--;

             after(grammarAccess.getDeploymentStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeploymentStatement"


    // $ANTLR start "ruleDeploymentStatement"
    // InternalMyDsl.g:237:1: ruleDeploymentStatement : ( ( rule__DeploymentStatement__Group__0 ) ) ;
    public final void ruleDeploymentStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__DeploymentStatement__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__DeploymentStatement__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__DeploymentStatement__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__DeploymentStatement__Group__0 )
            {
             before(grammarAccess.getDeploymentStatementAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__DeploymentStatement__Group__0 )
            // InternalMyDsl.g:244:4: rule__DeploymentStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeploymentStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeploymentStatement"


    // $ANTLR start "entryRuleDeployment"
    // InternalMyDsl.g:253:1: entryRuleDeployment : ruleDeployment EOF ;
    public final void entryRuleDeployment() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleDeployment EOF )
            // InternalMyDsl.g:255:1: ruleDeployment EOF
            {
             before(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_1);
            ruleDeployment();

            state._fsp--;

             after(grammarAccess.getDeploymentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalMyDsl.g:262:1: ruleDeployment : ( ( rule__Deployment__Group__0 ) ) ;
    public final void ruleDeployment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Deployment__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Deployment__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Deployment__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Deployment__Group__0 )
            {
             before(grammarAccess.getDeploymentAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Deployment__Group__0 )
            // InternalMyDsl.g:269:4: rule__Deployment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRulePlatformInstance"
    // InternalMyDsl.g:278:1: entryRulePlatformInstance : rulePlatformInstance EOF ;
    public final void entryRulePlatformInstance() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( rulePlatformInstance EOF )
            // InternalMyDsl.g:280:1: rulePlatformInstance EOF
            {
             before(grammarAccess.getPlatformInstanceRule()); 
            pushFollow(FOLLOW_1);
            rulePlatformInstance();

            state._fsp--;

             after(grammarAccess.getPlatformInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlatformInstance"


    // $ANTLR start "rulePlatformInstance"
    // InternalMyDsl.g:287:1: rulePlatformInstance : ( ( rule__PlatformInstance__NameAssignment ) ) ;
    public final void rulePlatformInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__PlatformInstance__NameAssignment ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__PlatformInstance__NameAssignment ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__PlatformInstance__NameAssignment ) )
            // InternalMyDsl.g:293:3: ( rule__PlatformInstance__NameAssignment )
            {
             before(grammarAccess.getPlatformInstanceAccess().getNameAssignment()); 
            // InternalMyDsl.g:294:3: ( rule__PlatformInstance__NameAssignment )
            // InternalMyDsl.g:294:4: rule__PlatformInstance__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PlatformInstance__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPlatformInstanceAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlatformInstance"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalMyDsl.g:302:1: rule__Model__Alternatives : ( ( ( rule__Model__NodesAssignment_0 ) ) | ( ( rule__Model__SystemsAssignment_1 ) ) | ( ( rule__Model__DeploymentsAssignment_2 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( ( ( rule__Model__NodesAssignment_0 ) ) | ( ( rule__Model__SystemsAssignment_1 ) ) | ( ( rule__Model__DeploymentsAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:307:2: ( ( rule__Model__NodesAssignment_0 ) )
                    {
                    // InternalMyDsl.g:307:2: ( ( rule__Model__NodesAssignment_0 ) )
                    // InternalMyDsl.g:308:3: ( rule__Model__NodesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getNodesAssignment_0()); 
                    // InternalMyDsl.g:309:3: ( rule__Model__NodesAssignment_0 )
                    // InternalMyDsl.g:309:4: rule__Model__NodesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__NodesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getNodesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:313:2: ( ( rule__Model__SystemsAssignment_1 ) )
                    {
                    // InternalMyDsl.g:313:2: ( ( rule__Model__SystemsAssignment_1 ) )
                    // InternalMyDsl.g:314:3: ( rule__Model__SystemsAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getSystemsAssignment_1()); 
                    // InternalMyDsl.g:315:3: ( rule__Model__SystemsAssignment_1 )
                    // InternalMyDsl.g:315:4: rule__Model__SystemsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__SystemsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSystemsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:319:2: ( ( rule__Model__DeploymentsAssignment_2 ) )
                    {
                    // InternalMyDsl.g:319:2: ( ( rule__Model__DeploymentsAssignment_2 ) )
                    // InternalMyDsl.g:320:3: ( rule__Model__DeploymentsAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getDeploymentsAssignment_2()); 
                    // InternalMyDsl.g:321:3: ( rule__Model__DeploymentsAssignment_2 )
                    // InternalMyDsl.g:321:4: rule__Model__DeploymentsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__DeploymentsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDeploymentsAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__SystemDefinition__Alternatives_3"
    // InternalMyDsl.g:329:1: rule__SystemDefinition__Alternatives_3 : ( ( ( rule__SystemDefinition__Group_3_0__0 ) ) | ( ( rule__SystemDefinition__Group_3_1__0 ) ) );
    public final void rule__SystemDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:333:1: ( ( ( rule__SystemDefinition__Group_3_0__0 ) ) | ( ( rule__SystemDefinition__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:334:2: ( ( rule__SystemDefinition__Group_3_0__0 ) )
                    {
                    // InternalMyDsl.g:334:2: ( ( rule__SystemDefinition__Group_3_0__0 ) )
                    // InternalMyDsl.g:335:3: ( rule__SystemDefinition__Group_3_0__0 )
                    {
                     before(grammarAccess.getSystemDefinitionAccess().getGroup_3_0()); 
                    // InternalMyDsl.g:336:3: ( rule__SystemDefinition__Group_3_0__0 )
                    // InternalMyDsl.g:336:4: rule__SystemDefinition__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SystemDefinition__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSystemDefinitionAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:340:2: ( ( rule__SystemDefinition__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:340:2: ( ( rule__SystemDefinition__Group_3_1__0 ) )
                    // InternalMyDsl.g:341:3: ( rule__SystemDefinition__Group_3_1__0 )
                    {
                     before(grammarAccess.getSystemDefinitionAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:342:3: ( rule__SystemDefinition__Group_3_1__0 )
                    // InternalMyDsl.g:342:4: rule__SystemDefinition__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SystemDefinition__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSystemDefinitionAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Alternatives_3"


    // $ANTLR start "rule__NodeDefinition__Group__0"
    // InternalMyDsl.g:350:1: rule__NodeDefinition__Group__0 : rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1 ;
    public final void rule__NodeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:354:1: ( rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1 )
            // InternalMyDsl.g:355:2: rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__NodeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__0"


    // $ANTLR start "rule__NodeDefinition__Group__0__Impl"
    // InternalMyDsl.g:362:1: rule__NodeDefinition__Group__0__Impl : ( 'node' ) ;
    public final void rule__NodeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:1: ( ( 'node' ) )
            // InternalMyDsl.g:367:1: ( 'node' )
            {
            // InternalMyDsl.g:367:1: ( 'node' )
            // InternalMyDsl.g:368:2: 'node'
            {
             before(grammarAccess.getNodeDefinitionAccess().getNodeKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNodeDefinitionAccess().getNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__0__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__1"
    // InternalMyDsl.g:377:1: rule__NodeDefinition__Group__1 : rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2 ;
    public final void rule__NodeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:381:1: ( rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2 )
            // InternalMyDsl.g:382:2: rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__NodeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__1"


    // $ANTLR start "rule__NodeDefinition__Group__1__Impl"
    // InternalMyDsl.g:389:1: rule__NodeDefinition__Group__1__Impl : ( ( rule__NodeDefinition__NameAssignment_1 ) ) ;
    public final void rule__NodeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:393:1: ( ( ( rule__NodeDefinition__NameAssignment_1 ) ) )
            // InternalMyDsl.g:394:1: ( ( rule__NodeDefinition__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:394:1: ( ( rule__NodeDefinition__NameAssignment_1 ) )
            // InternalMyDsl.g:395:2: ( rule__NodeDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:396:2: ( rule__NodeDefinition__NameAssignment_1 )
            // InternalMyDsl.g:396:3: rule__NodeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__1__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__2"
    // InternalMyDsl.g:404:1: rule__NodeDefinition__Group__2 : rule__NodeDefinition__Group__2__Impl ;
    public final void rule__NodeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:408:1: ( rule__NodeDefinition__Group__2__Impl )
            // InternalMyDsl.g:409:2: rule__NodeDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__2"


    // $ANTLR start "rule__NodeDefinition__Group__2__Impl"
    // InternalMyDsl.g:415:1: rule__NodeDefinition__Group__2__Impl : ( ';' ) ;
    public final void rule__NodeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:419:1: ( ( ';' ) )
            // InternalMyDsl.g:420:1: ( ';' )
            {
            // InternalMyDsl.g:420:1: ( ';' )
            // InternalMyDsl.g:421:2: ';'
            {
             before(grammarAccess.getNodeDefinitionAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNodeDefinitionAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__2__Impl"


    // $ANTLR start "rule__NodeInstance__Group__0"
    // InternalMyDsl.g:431:1: rule__NodeInstance__Group__0 : rule__NodeInstance__Group__0__Impl rule__NodeInstance__Group__1 ;
    public final void rule__NodeInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:435:1: ( rule__NodeInstance__Group__0__Impl rule__NodeInstance__Group__1 )
            // InternalMyDsl.g:436:2: rule__NodeInstance__Group__0__Impl rule__NodeInstance__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__NodeInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstance__Group__0"


    // $ANTLR start "rule__NodeInstance__Group__0__Impl"
    // InternalMyDsl.g:443:1: rule__NodeInstance__Group__0__Impl : ( ( rule__NodeInstance__TypeAssignment_0 ) ) ;
    public final void rule__NodeInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:447:1: ( ( ( rule__NodeInstance__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:448:1: ( ( rule__NodeInstance__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:448:1: ( ( rule__NodeInstance__TypeAssignment_0 ) )
            // InternalMyDsl.g:449:2: ( rule__NodeInstance__TypeAssignment_0 )
            {
             before(grammarAccess.getNodeInstanceAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:450:2: ( rule__NodeInstance__TypeAssignment_0 )
            // InternalMyDsl.g:450:3: rule__NodeInstance__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NodeInstance__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeInstanceAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstance__Group__0__Impl"


    // $ANTLR start "rule__NodeInstance__Group__1"
    // InternalMyDsl.g:458:1: rule__NodeInstance__Group__1 : rule__NodeInstance__Group__1__Impl ;
    public final void rule__NodeInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:462:1: ( rule__NodeInstance__Group__1__Impl )
            // InternalMyDsl.g:463:2: rule__NodeInstance__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeInstance__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstance__Group__1"


    // $ANTLR start "rule__NodeInstance__Group__1__Impl"
    // InternalMyDsl.g:469:1: rule__NodeInstance__Group__1__Impl : ( ( rule__NodeInstance__NameAssignment_1 ) ) ;
    public final void rule__NodeInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( ( rule__NodeInstance__NameAssignment_1 ) ) )
            // InternalMyDsl.g:474:1: ( ( rule__NodeInstance__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:474:1: ( ( rule__NodeInstance__NameAssignment_1 ) )
            // InternalMyDsl.g:475:2: ( rule__NodeInstance__NameAssignment_1 )
            {
             before(grammarAccess.getNodeInstanceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:476:2: ( rule__NodeInstance__NameAssignment_1 )
            // InternalMyDsl.g:476:3: rule__NodeInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeInstance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeInstanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstance__Group__1__Impl"


    // $ANTLR start "rule__SystemDefinition__Group__0"
    // InternalMyDsl.g:485:1: rule__SystemDefinition__Group__0 : rule__SystemDefinition__Group__0__Impl rule__SystemDefinition__Group__1 ;
    public final void rule__SystemDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:489:1: ( rule__SystemDefinition__Group__0__Impl rule__SystemDefinition__Group__1 )
            // InternalMyDsl.g:490:2: rule__SystemDefinition__Group__0__Impl rule__SystemDefinition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SystemDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group__0"


    // $ANTLR start "rule__SystemDefinition__Group__0__Impl"
    // InternalMyDsl.g:497:1: rule__SystemDefinition__Group__0__Impl : ( 'system' ) ;
    public final void rule__SystemDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:501:1: ( ( 'system' ) )
            // InternalMyDsl.g:502:1: ( 'system' )
            {
            // InternalMyDsl.g:502:1: ( 'system' )
            // InternalMyDsl.g:503:2: 'system'
            {
             before(grammarAccess.getSystemDefinitionAccess().getSystemKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSystemDefinitionAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group__0__Impl"


    // $ANTLR start "rule__SystemDefinition__Group__1"
    // InternalMyDsl.g:512:1: rule__SystemDefinition__Group__1 : rule__SystemDefinition__Group__1__Impl rule__SystemDefinition__Group__2 ;
    public final void rule__SystemDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:1: ( rule__SystemDefinition__Group__1__Impl rule__SystemDefinition__Group__2 )
            // InternalMyDsl.g:517:2: rule__SystemDefinition__Group__1__Impl rule__SystemDefinition__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SystemDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group__1"


    // $ANTLR start "rule__SystemDefinition__Group__1__Impl"
    // InternalMyDsl.g:524:1: rule__SystemDefinition__Group__1__Impl : ( ( rule__SystemDefinition__NameAssignment_1 ) ) ;
    public final void rule__SystemDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:528:1: ( ( ( rule__SystemDefinition__NameAssignment_1 ) ) )
            // InternalMyDsl.g:529:1: ( ( rule__SystemDefinition__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:529:1: ( ( rule__SystemDefinition__NameAssignment_1 ) )
            // InternalMyDsl.g:530:2: ( rule__SystemDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getSystemDefinitionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:531:2: ( rule__SystemDefinition__NameAssignment_1 )
            // InternalMyDsl.g:531:3: rule__SystemDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group__1__Impl"


    // $ANTLR start "rule__SystemDefinition__Group__2"
    // InternalMyDsl.g:539:1: rule__SystemDefinition__Group__2 : rule__SystemDefinition__Group__2__Impl rule__SystemDefinition__Group__3 ;
    public final void rule__SystemDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:543:1: ( rule__SystemDefinition__Group__2__Impl rule__SystemDefinition__Group__3 )
            // InternalMyDsl.g:544:2: rule__SystemDefinition__Group__2__Impl rule__SystemDefinition__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SystemDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group__2"


    // $ANTLR start "rule__SystemDefinition__Group__2__Impl"
    // InternalMyDsl.g:551:1: rule__SystemDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SystemDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( ( '{' ) )
            // InternalMyDsl.g:556:1: ( '{' )
            {
            // InternalMyDsl.g:556:1: ( '{' )
            // InternalMyDsl.g:557:2: '{'
            {
             before(grammarAccess.getSystemDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSystemDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group__2__Impl"


    // $ANTLR start "rule__SystemDefinition__Group__3"
    // InternalMyDsl.g:566:1: rule__SystemDefinition__Group__3 : rule__SystemDefinition__Group__3__Impl rule__SystemDefinition__Group__4 ;
    public final void rule__SystemDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:570:1: ( rule__SystemDefinition__Group__3__Impl rule__SystemDefinition__Group__4 )
            // InternalMyDsl.g:571:2: rule__SystemDefinition__Group__3__Impl rule__SystemDefinition__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SystemDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group__3"


    // $ANTLR start "rule__SystemDefinition__Group__3__Impl"
    // InternalMyDsl.g:578:1: rule__SystemDefinition__Group__3__Impl : ( ( rule__SystemDefinition__Alternatives_3 )* ) ;
    public final void rule__SystemDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( ( ( rule__SystemDefinition__Alternatives_3 )* ) )
            // InternalMyDsl.g:583:1: ( ( rule__SystemDefinition__Alternatives_3 )* )
            {
            // InternalMyDsl.g:583:1: ( ( rule__SystemDefinition__Alternatives_3 )* )
            // InternalMyDsl.g:584:2: ( rule__SystemDefinition__Alternatives_3 )*
            {
             before(grammarAccess.getSystemDefinitionAccess().getAlternatives_3()); 
            // InternalMyDsl.g:585:2: ( rule__SystemDefinition__Alternatives_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:585:3: rule__SystemDefinition__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SystemDefinition__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSystemDefinitionAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group__3__Impl"


    // $ANTLR start "rule__SystemDefinition__Group__4"
    // InternalMyDsl.g:593:1: rule__SystemDefinition__Group__4 : rule__SystemDefinition__Group__4__Impl ;
    public final void rule__SystemDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:597:1: ( rule__SystemDefinition__Group__4__Impl )
            // InternalMyDsl.g:598:2: rule__SystemDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group__4"


    // $ANTLR start "rule__SystemDefinition__Group__4__Impl"
    // InternalMyDsl.g:604:1: rule__SystemDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__SystemDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:608:1: ( ( '}' ) )
            // InternalMyDsl.g:609:1: ( '}' )
            {
            // InternalMyDsl.g:609:1: ( '}' )
            // InternalMyDsl.g:610:2: '}'
            {
             before(grammarAccess.getSystemDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSystemDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group__4__Impl"


    // $ANTLR start "rule__SystemDefinition__Group_3_0__0"
    // InternalMyDsl.g:620:1: rule__SystemDefinition__Group_3_0__0 : rule__SystemDefinition__Group_3_0__0__Impl rule__SystemDefinition__Group_3_0__1 ;
    public final void rule__SystemDefinition__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:624:1: ( rule__SystemDefinition__Group_3_0__0__Impl rule__SystemDefinition__Group_3_0__1 )
            // InternalMyDsl.g:625:2: rule__SystemDefinition__Group_3_0__0__Impl rule__SystemDefinition__Group_3_0__1
            {
            pushFollow(FOLLOW_9);
            rule__SystemDefinition__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_0__0"


    // $ANTLR start "rule__SystemDefinition__Group_3_0__0__Impl"
    // InternalMyDsl.g:632:1: rule__SystemDefinition__Group_3_0__0__Impl : ( 'nodes' ) ;
    public final void rule__SystemDefinition__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( ( 'nodes' ) )
            // InternalMyDsl.g:637:1: ( 'nodes' )
            {
            // InternalMyDsl.g:637:1: ( 'nodes' )
            // InternalMyDsl.g:638:2: 'nodes'
            {
             before(grammarAccess.getSystemDefinitionAccess().getNodesKeyword_3_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSystemDefinitionAccess().getNodesKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_0__0__Impl"


    // $ANTLR start "rule__SystemDefinition__Group_3_0__1"
    // InternalMyDsl.g:647:1: rule__SystemDefinition__Group_3_0__1 : rule__SystemDefinition__Group_3_0__1__Impl rule__SystemDefinition__Group_3_0__2 ;
    public final void rule__SystemDefinition__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:651:1: ( rule__SystemDefinition__Group_3_0__1__Impl rule__SystemDefinition__Group_3_0__2 )
            // InternalMyDsl.g:652:2: rule__SystemDefinition__Group_3_0__1__Impl rule__SystemDefinition__Group_3_0__2
            {
            pushFollow(FOLLOW_4);
            rule__SystemDefinition__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_0__1"


    // $ANTLR start "rule__SystemDefinition__Group_3_0__1__Impl"
    // InternalMyDsl.g:659:1: rule__SystemDefinition__Group_3_0__1__Impl : ( ':' ) ;
    public final void rule__SystemDefinition__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:663:1: ( ( ':' ) )
            // InternalMyDsl.g:664:1: ( ':' )
            {
            // InternalMyDsl.g:664:1: ( ':' )
            // InternalMyDsl.g:665:2: ':'
            {
             before(grammarAccess.getSystemDefinitionAccess().getColonKeyword_3_0_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSystemDefinitionAccess().getColonKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_0__1__Impl"


    // $ANTLR start "rule__SystemDefinition__Group_3_0__2"
    // InternalMyDsl.g:674:1: rule__SystemDefinition__Group_3_0__2 : rule__SystemDefinition__Group_3_0__2__Impl ;
    public final void rule__SystemDefinition__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:678:1: ( rule__SystemDefinition__Group_3_0__2__Impl )
            // InternalMyDsl.g:679:2: rule__SystemDefinition__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_0__2"


    // $ANTLR start "rule__SystemDefinition__Group_3_0__2__Impl"
    // InternalMyDsl.g:685:1: rule__SystemDefinition__Group_3_0__2__Impl : ( ( rule__SystemDefinition__Group_3_0_2__0 )* ) ;
    public final void rule__SystemDefinition__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:689:1: ( ( ( rule__SystemDefinition__Group_3_0_2__0 )* ) )
            // InternalMyDsl.g:690:1: ( ( rule__SystemDefinition__Group_3_0_2__0 )* )
            {
            // InternalMyDsl.g:690:1: ( ( rule__SystemDefinition__Group_3_0_2__0 )* )
            // InternalMyDsl.g:691:2: ( rule__SystemDefinition__Group_3_0_2__0 )*
            {
             before(grammarAccess.getSystemDefinitionAccess().getGroup_3_0_2()); 
            // InternalMyDsl.g:692:2: ( rule__SystemDefinition__Group_3_0_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:692:3: rule__SystemDefinition__Group_3_0_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SystemDefinition__Group_3_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSystemDefinitionAccess().getGroup_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_0__2__Impl"


    // $ANTLR start "rule__SystemDefinition__Group_3_0_2__0"
    // InternalMyDsl.g:701:1: rule__SystemDefinition__Group_3_0_2__0 : rule__SystemDefinition__Group_3_0_2__0__Impl rule__SystemDefinition__Group_3_0_2__1 ;
    public final void rule__SystemDefinition__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:705:1: ( rule__SystemDefinition__Group_3_0_2__0__Impl rule__SystemDefinition__Group_3_0_2__1 )
            // InternalMyDsl.g:706:2: rule__SystemDefinition__Group_3_0_2__0__Impl rule__SystemDefinition__Group_3_0_2__1
            {
            pushFollow(FOLLOW_5);
            rule__SystemDefinition__Group_3_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group_3_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_0_2__0"


    // $ANTLR start "rule__SystemDefinition__Group_3_0_2__0__Impl"
    // InternalMyDsl.g:713:1: rule__SystemDefinition__Group_3_0_2__0__Impl : ( ( rule__SystemDefinition__NodesAssignment_3_0_2_0 ) ) ;
    public final void rule__SystemDefinition__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( ( ( rule__SystemDefinition__NodesAssignment_3_0_2_0 ) ) )
            // InternalMyDsl.g:718:1: ( ( rule__SystemDefinition__NodesAssignment_3_0_2_0 ) )
            {
            // InternalMyDsl.g:718:1: ( ( rule__SystemDefinition__NodesAssignment_3_0_2_0 ) )
            // InternalMyDsl.g:719:2: ( rule__SystemDefinition__NodesAssignment_3_0_2_0 )
            {
             before(grammarAccess.getSystemDefinitionAccess().getNodesAssignment_3_0_2_0()); 
            // InternalMyDsl.g:720:2: ( rule__SystemDefinition__NodesAssignment_3_0_2_0 )
            // InternalMyDsl.g:720:3: rule__SystemDefinition__NodesAssignment_3_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SystemDefinition__NodesAssignment_3_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSystemDefinitionAccess().getNodesAssignment_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_0_2__0__Impl"


    // $ANTLR start "rule__SystemDefinition__Group_3_0_2__1"
    // InternalMyDsl.g:728:1: rule__SystemDefinition__Group_3_0_2__1 : rule__SystemDefinition__Group_3_0_2__1__Impl ;
    public final void rule__SystemDefinition__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:732:1: ( rule__SystemDefinition__Group_3_0_2__1__Impl )
            // InternalMyDsl.g:733:2: rule__SystemDefinition__Group_3_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group_3_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_0_2__1"


    // $ANTLR start "rule__SystemDefinition__Group_3_0_2__1__Impl"
    // InternalMyDsl.g:739:1: rule__SystemDefinition__Group_3_0_2__1__Impl : ( ';' ) ;
    public final void rule__SystemDefinition__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:743:1: ( ( ';' ) )
            // InternalMyDsl.g:744:1: ( ';' )
            {
            // InternalMyDsl.g:744:1: ( ';' )
            // InternalMyDsl.g:745:2: ';'
            {
             before(grammarAccess.getSystemDefinitionAccess().getSemicolonKeyword_3_0_2_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSystemDefinitionAccess().getSemicolonKeyword_3_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_0_2__1__Impl"


    // $ANTLR start "rule__SystemDefinition__Group_3_1__0"
    // InternalMyDsl.g:755:1: rule__SystemDefinition__Group_3_1__0 : rule__SystemDefinition__Group_3_1__0__Impl rule__SystemDefinition__Group_3_1__1 ;
    public final void rule__SystemDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:759:1: ( rule__SystemDefinition__Group_3_1__0__Impl rule__SystemDefinition__Group_3_1__1 )
            // InternalMyDsl.g:760:2: rule__SystemDefinition__Group_3_1__0__Impl rule__SystemDefinition__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
            rule__SystemDefinition__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_1__0"


    // $ANTLR start "rule__SystemDefinition__Group_3_1__0__Impl"
    // InternalMyDsl.g:767:1: rule__SystemDefinition__Group_3_1__0__Impl : ( 'subsystems' ) ;
    public final void rule__SystemDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:771:1: ( ( 'subsystems' ) )
            // InternalMyDsl.g:772:1: ( 'subsystems' )
            {
            // InternalMyDsl.g:772:1: ( 'subsystems' )
            // InternalMyDsl.g:773:2: 'subsystems'
            {
             before(grammarAccess.getSystemDefinitionAccess().getSubsystemsKeyword_3_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSystemDefinitionAccess().getSubsystemsKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_1__0__Impl"


    // $ANTLR start "rule__SystemDefinition__Group_3_1__1"
    // InternalMyDsl.g:782:1: rule__SystemDefinition__Group_3_1__1 : rule__SystemDefinition__Group_3_1__1__Impl rule__SystemDefinition__Group_3_1__2 ;
    public final void rule__SystemDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:786:1: ( rule__SystemDefinition__Group_3_1__1__Impl rule__SystemDefinition__Group_3_1__2 )
            // InternalMyDsl.g:787:2: rule__SystemDefinition__Group_3_1__1__Impl rule__SystemDefinition__Group_3_1__2
            {
            pushFollow(FOLLOW_4);
            rule__SystemDefinition__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_1__1"


    // $ANTLR start "rule__SystemDefinition__Group_3_1__1__Impl"
    // InternalMyDsl.g:794:1: rule__SystemDefinition__Group_3_1__1__Impl : ( ':' ) ;
    public final void rule__SystemDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( ( ':' ) )
            // InternalMyDsl.g:799:1: ( ':' )
            {
            // InternalMyDsl.g:799:1: ( ':' )
            // InternalMyDsl.g:800:2: ':'
            {
             before(grammarAccess.getSystemDefinitionAccess().getColonKeyword_3_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSystemDefinitionAccess().getColonKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_1__1__Impl"


    // $ANTLR start "rule__SystemDefinition__Group_3_1__2"
    // InternalMyDsl.g:809:1: rule__SystemDefinition__Group_3_1__2 : rule__SystemDefinition__Group_3_1__2__Impl ;
    public final void rule__SystemDefinition__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:813:1: ( rule__SystemDefinition__Group_3_1__2__Impl )
            // InternalMyDsl.g:814:2: rule__SystemDefinition__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_1__2"


    // $ANTLR start "rule__SystemDefinition__Group_3_1__2__Impl"
    // InternalMyDsl.g:820:1: rule__SystemDefinition__Group_3_1__2__Impl : ( ( rule__SystemDefinition__Group_3_1_2__0 )* ) ;
    public final void rule__SystemDefinition__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:824:1: ( ( ( rule__SystemDefinition__Group_3_1_2__0 )* ) )
            // InternalMyDsl.g:825:1: ( ( rule__SystemDefinition__Group_3_1_2__0 )* )
            {
            // InternalMyDsl.g:825:1: ( ( rule__SystemDefinition__Group_3_1_2__0 )* )
            // InternalMyDsl.g:826:2: ( rule__SystemDefinition__Group_3_1_2__0 )*
            {
             before(grammarAccess.getSystemDefinitionAccess().getGroup_3_1_2()); 
            // InternalMyDsl.g:827:2: ( rule__SystemDefinition__Group_3_1_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:827:3: rule__SystemDefinition__Group_3_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SystemDefinition__Group_3_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSystemDefinitionAccess().getGroup_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_1__2__Impl"


    // $ANTLR start "rule__SystemDefinition__Group_3_1_2__0"
    // InternalMyDsl.g:836:1: rule__SystemDefinition__Group_3_1_2__0 : rule__SystemDefinition__Group_3_1_2__0__Impl rule__SystemDefinition__Group_3_1_2__1 ;
    public final void rule__SystemDefinition__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:840:1: ( rule__SystemDefinition__Group_3_1_2__0__Impl rule__SystemDefinition__Group_3_1_2__1 )
            // InternalMyDsl.g:841:2: rule__SystemDefinition__Group_3_1_2__0__Impl rule__SystemDefinition__Group_3_1_2__1
            {
            pushFollow(FOLLOW_5);
            rule__SystemDefinition__Group_3_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group_3_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_1_2__0"


    // $ANTLR start "rule__SystemDefinition__Group_3_1_2__0__Impl"
    // InternalMyDsl.g:848:1: rule__SystemDefinition__Group_3_1_2__0__Impl : ( ( rule__SystemDefinition__SubsystemsAssignment_3_1_2_0 ) ) ;
    public final void rule__SystemDefinition__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( ( ( rule__SystemDefinition__SubsystemsAssignment_3_1_2_0 ) ) )
            // InternalMyDsl.g:853:1: ( ( rule__SystemDefinition__SubsystemsAssignment_3_1_2_0 ) )
            {
            // InternalMyDsl.g:853:1: ( ( rule__SystemDefinition__SubsystemsAssignment_3_1_2_0 ) )
            // InternalMyDsl.g:854:2: ( rule__SystemDefinition__SubsystemsAssignment_3_1_2_0 )
            {
             before(grammarAccess.getSystemDefinitionAccess().getSubsystemsAssignment_3_1_2_0()); 
            // InternalMyDsl.g:855:2: ( rule__SystemDefinition__SubsystemsAssignment_3_1_2_0 )
            // InternalMyDsl.g:855:3: rule__SystemDefinition__SubsystemsAssignment_3_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SystemDefinition__SubsystemsAssignment_3_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSystemDefinitionAccess().getSubsystemsAssignment_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_1_2__0__Impl"


    // $ANTLR start "rule__SystemDefinition__Group_3_1_2__1"
    // InternalMyDsl.g:863:1: rule__SystemDefinition__Group_3_1_2__1 : rule__SystemDefinition__Group_3_1_2__1__Impl ;
    public final void rule__SystemDefinition__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:867:1: ( rule__SystemDefinition__Group_3_1_2__1__Impl )
            // InternalMyDsl.g:868:2: rule__SystemDefinition__Group_3_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemDefinition__Group_3_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_1_2__1"


    // $ANTLR start "rule__SystemDefinition__Group_3_1_2__1__Impl"
    // InternalMyDsl.g:874:1: rule__SystemDefinition__Group_3_1_2__1__Impl : ( ';' ) ;
    public final void rule__SystemDefinition__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:878:1: ( ( ';' ) )
            // InternalMyDsl.g:879:1: ( ';' )
            {
            // InternalMyDsl.g:879:1: ( ';' )
            // InternalMyDsl.g:880:2: ';'
            {
             before(grammarAccess.getSystemDefinitionAccess().getSemicolonKeyword_3_1_2_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSystemDefinitionAccess().getSemicolonKeyword_3_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__Group_3_1_2__1__Impl"


    // $ANTLR start "rule__SystemInstance__Group__0"
    // InternalMyDsl.g:890:1: rule__SystemInstance__Group__0 : rule__SystemInstance__Group__0__Impl rule__SystemInstance__Group__1 ;
    public final void rule__SystemInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:894:1: ( rule__SystemInstance__Group__0__Impl rule__SystemInstance__Group__1 )
            // InternalMyDsl.g:895:2: rule__SystemInstance__Group__0__Impl rule__SystemInstance__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SystemInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemInstance__Group__0"


    // $ANTLR start "rule__SystemInstance__Group__0__Impl"
    // InternalMyDsl.g:902:1: rule__SystemInstance__Group__0__Impl : ( ( rule__SystemInstance__TypeAssignment_0 ) ) ;
    public final void rule__SystemInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( ( ( rule__SystemInstance__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:907:1: ( ( rule__SystemInstance__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:907:1: ( ( rule__SystemInstance__TypeAssignment_0 ) )
            // InternalMyDsl.g:908:2: ( rule__SystemInstance__TypeAssignment_0 )
            {
             before(grammarAccess.getSystemInstanceAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:909:2: ( rule__SystemInstance__TypeAssignment_0 )
            // InternalMyDsl.g:909:3: rule__SystemInstance__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SystemInstance__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSystemInstanceAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemInstance__Group__0__Impl"


    // $ANTLR start "rule__SystemInstance__Group__1"
    // InternalMyDsl.g:917:1: rule__SystemInstance__Group__1 : rule__SystemInstance__Group__1__Impl ;
    public final void rule__SystemInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:921:1: ( rule__SystemInstance__Group__1__Impl )
            // InternalMyDsl.g:922:2: rule__SystemInstance__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemInstance__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemInstance__Group__1"


    // $ANTLR start "rule__SystemInstance__Group__1__Impl"
    // InternalMyDsl.g:928:1: rule__SystemInstance__Group__1__Impl : ( ( rule__SystemInstance__NameAssignment_1 ) ) ;
    public final void rule__SystemInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:932:1: ( ( ( rule__SystemInstance__NameAssignment_1 ) ) )
            // InternalMyDsl.g:933:1: ( ( rule__SystemInstance__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:933:1: ( ( rule__SystemInstance__NameAssignment_1 ) )
            // InternalMyDsl.g:934:2: ( rule__SystemInstance__NameAssignment_1 )
            {
             before(grammarAccess.getSystemInstanceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:935:2: ( rule__SystemInstance__NameAssignment_1 )
            // InternalMyDsl.g:935:3: rule__SystemInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemInstance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemInstanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemInstance__Group__1__Impl"


    // $ANTLR start "rule__SystemReference__Group__0"
    // InternalMyDsl.g:944:1: rule__SystemReference__Group__0 : rule__SystemReference__Group__0__Impl rule__SystemReference__Group__1 ;
    public final void rule__SystemReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:948:1: ( rule__SystemReference__Group__0__Impl rule__SystemReference__Group__1 )
            // InternalMyDsl.g:949:2: rule__SystemReference__Group__0__Impl rule__SystemReference__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SystemReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemReference__Group__0"


    // $ANTLR start "rule__SystemReference__Group__0__Impl"
    // InternalMyDsl.g:956:1: rule__SystemReference__Group__0__Impl : ( ( rule__SystemReference__SystemAssignment_0 ) ) ;
    public final void rule__SystemReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( ( ( rule__SystemReference__SystemAssignment_0 ) ) )
            // InternalMyDsl.g:961:1: ( ( rule__SystemReference__SystemAssignment_0 ) )
            {
            // InternalMyDsl.g:961:1: ( ( rule__SystemReference__SystemAssignment_0 ) )
            // InternalMyDsl.g:962:2: ( rule__SystemReference__SystemAssignment_0 )
            {
             before(grammarAccess.getSystemReferenceAccess().getSystemAssignment_0()); 
            // InternalMyDsl.g:963:2: ( rule__SystemReference__SystemAssignment_0 )
            // InternalMyDsl.g:963:3: rule__SystemReference__SystemAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SystemReference__SystemAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSystemReferenceAccess().getSystemAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemReference__Group__0__Impl"


    // $ANTLR start "rule__SystemReference__Group__1"
    // InternalMyDsl.g:971:1: rule__SystemReference__Group__1 : rule__SystemReference__Group__1__Impl ;
    public final void rule__SystemReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:975:1: ( rule__SystemReference__Group__1__Impl )
            // InternalMyDsl.g:976:2: rule__SystemReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemReference__Group__1"


    // $ANTLR start "rule__SystemReference__Group__1__Impl"
    // InternalMyDsl.g:982:1: rule__SystemReference__Group__1__Impl : ( ( rule__SystemReference__Group_1__0 )? ) ;
    public final void rule__SystemReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:986:1: ( ( ( rule__SystemReference__Group_1__0 )? ) )
            // InternalMyDsl.g:987:1: ( ( rule__SystemReference__Group_1__0 )? )
            {
            // InternalMyDsl.g:987:1: ( ( rule__SystemReference__Group_1__0 )? )
            // InternalMyDsl.g:988:2: ( rule__SystemReference__Group_1__0 )?
            {
             before(grammarAccess.getSystemReferenceAccess().getGroup_1()); 
            // InternalMyDsl.g:989:2: ( rule__SystemReference__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:989:3: rule__SystemReference__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SystemReference__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemReferenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemReference__Group__1__Impl"


    // $ANTLR start "rule__SystemReference__Group_1__0"
    // InternalMyDsl.g:998:1: rule__SystemReference__Group_1__0 : rule__SystemReference__Group_1__0__Impl rule__SystemReference__Group_1__1 ;
    public final void rule__SystemReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1002:1: ( rule__SystemReference__Group_1__0__Impl rule__SystemReference__Group_1__1 )
            // InternalMyDsl.g:1003:2: rule__SystemReference__Group_1__0__Impl rule__SystemReference__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__SystemReference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemReference__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemReference__Group_1__0"


    // $ANTLR start "rule__SystemReference__Group_1__0__Impl"
    // InternalMyDsl.g:1010:1: rule__SystemReference__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SystemReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( ( '.' ) )
            // InternalMyDsl.g:1015:1: ( '.' )
            {
            // InternalMyDsl.g:1015:1: ( '.' )
            // InternalMyDsl.g:1016:2: '.'
            {
             before(grammarAccess.getSystemReferenceAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSystemReferenceAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemReference__Group_1__0__Impl"


    // $ANTLR start "rule__SystemReference__Group_1__1"
    // InternalMyDsl.g:1025:1: rule__SystemReference__Group_1__1 : rule__SystemReference__Group_1__1__Impl ;
    public final void rule__SystemReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1029:1: ( rule__SystemReference__Group_1__1__Impl )
            // InternalMyDsl.g:1030:2: rule__SystemReference__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemReference__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemReference__Group_1__1"


    // $ANTLR start "rule__SystemReference__Group_1__1__Impl"
    // InternalMyDsl.g:1036:1: rule__SystemReference__Group_1__1__Impl : ( ( rule__SystemReference__SubsystemAssignment_1_1 ) ) ;
    public final void rule__SystemReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1040:1: ( ( ( rule__SystemReference__SubsystemAssignment_1_1 ) ) )
            // InternalMyDsl.g:1041:1: ( ( rule__SystemReference__SubsystemAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1041:1: ( ( rule__SystemReference__SubsystemAssignment_1_1 ) )
            // InternalMyDsl.g:1042:2: ( rule__SystemReference__SubsystemAssignment_1_1 )
            {
             before(grammarAccess.getSystemReferenceAccess().getSubsystemAssignment_1_1()); 
            // InternalMyDsl.g:1043:2: ( rule__SystemReference__SubsystemAssignment_1_1 )
            // InternalMyDsl.g:1043:3: rule__SystemReference__SubsystemAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemReference__SubsystemAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemReferenceAccess().getSubsystemAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemReference__Group_1__1__Impl"


    // $ANTLR start "rule__NodeInstanceReference__Group__0"
    // InternalMyDsl.g:1052:1: rule__NodeInstanceReference__Group__0 : rule__NodeInstanceReference__Group__0__Impl rule__NodeInstanceReference__Group__1 ;
    public final void rule__NodeInstanceReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1056:1: ( rule__NodeInstanceReference__Group__0__Impl rule__NodeInstanceReference__Group__1 )
            // InternalMyDsl.g:1057:2: rule__NodeInstanceReference__Group__0__Impl rule__NodeInstanceReference__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__NodeInstanceReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeInstanceReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstanceReference__Group__0"


    // $ANTLR start "rule__NodeInstanceReference__Group__0__Impl"
    // InternalMyDsl.g:1064:1: rule__NodeInstanceReference__Group__0__Impl : ( ( rule__NodeInstanceReference__BelongingSystemReferenceAssignment_0 ) ) ;
    public final void rule__NodeInstanceReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( ( ( rule__NodeInstanceReference__BelongingSystemReferenceAssignment_0 ) ) )
            // InternalMyDsl.g:1069:1: ( ( rule__NodeInstanceReference__BelongingSystemReferenceAssignment_0 ) )
            {
            // InternalMyDsl.g:1069:1: ( ( rule__NodeInstanceReference__BelongingSystemReferenceAssignment_0 ) )
            // InternalMyDsl.g:1070:2: ( rule__NodeInstanceReference__BelongingSystemReferenceAssignment_0 )
            {
             before(grammarAccess.getNodeInstanceReferenceAccess().getBelongingSystemReferenceAssignment_0()); 
            // InternalMyDsl.g:1071:2: ( rule__NodeInstanceReference__BelongingSystemReferenceAssignment_0 )
            // InternalMyDsl.g:1071:3: rule__NodeInstanceReference__BelongingSystemReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NodeInstanceReference__BelongingSystemReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeInstanceReferenceAccess().getBelongingSystemReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstanceReference__Group__0__Impl"


    // $ANTLR start "rule__NodeInstanceReference__Group__1"
    // InternalMyDsl.g:1079:1: rule__NodeInstanceReference__Group__1 : rule__NodeInstanceReference__Group__1__Impl rule__NodeInstanceReference__Group__2 ;
    public final void rule__NodeInstanceReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1083:1: ( rule__NodeInstanceReference__Group__1__Impl rule__NodeInstanceReference__Group__2 )
            // InternalMyDsl.g:1084:2: rule__NodeInstanceReference__Group__1__Impl rule__NodeInstanceReference__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NodeInstanceReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeInstanceReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstanceReference__Group__1"


    // $ANTLR start "rule__NodeInstanceReference__Group__1__Impl"
    // InternalMyDsl.g:1091:1: rule__NodeInstanceReference__Group__1__Impl : ( '->' ) ;
    public final void rule__NodeInstanceReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( ( '->' ) )
            // InternalMyDsl.g:1096:1: ( '->' )
            {
            // InternalMyDsl.g:1096:1: ( '->' )
            // InternalMyDsl.g:1097:2: '->'
            {
             before(grammarAccess.getNodeInstanceReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNodeInstanceReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstanceReference__Group__1__Impl"


    // $ANTLR start "rule__NodeInstanceReference__Group__2"
    // InternalMyDsl.g:1106:1: rule__NodeInstanceReference__Group__2 : rule__NodeInstanceReference__Group__2__Impl ;
    public final void rule__NodeInstanceReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1110:1: ( rule__NodeInstanceReference__Group__2__Impl )
            // InternalMyDsl.g:1111:2: rule__NodeInstanceReference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeInstanceReference__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstanceReference__Group__2"


    // $ANTLR start "rule__NodeInstanceReference__Group__2__Impl"
    // InternalMyDsl.g:1117:1: rule__NodeInstanceReference__Group__2__Impl : ( ( rule__NodeInstanceReference__NodeAssignment_2 ) ) ;
    public final void rule__NodeInstanceReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1121:1: ( ( ( rule__NodeInstanceReference__NodeAssignment_2 ) ) )
            // InternalMyDsl.g:1122:1: ( ( rule__NodeInstanceReference__NodeAssignment_2 ) )
            {
            // InternalMyDsl.g:1122:1: ( ( rule__NodeInstanceReference__NodeAssignment_2 ) )
            // InternalMyDsl.g:1123:2: ( rule__NodeInstanceReference__NodeAssignment_2 )
            {
             before(grammarAccess.getNodeInstanceReferenceAccess().getNodeAssignment_2()); 
            // InternalMyDsl.g:1124:2: ( rule__NodeInstanceReference__NodeAssignment_2 )
            // InternalMyDsl.g:1124:3: rule__NodeInstanceReference__NodeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NodeInstanceReference__NodeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeInstanceReferenceAccess().getNodeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstanceReference__Group__2__Impl"


    // $ANTLR start "rule__DeploymentStatement__Group__0"
    // InternalMyDsl.g:1133:1: rule__DeploymentStatement__Group__0 : rule__DeploymentStatement__Group__0__Impl rule__DeploymentStatement__Group__1 ;
    public final void rule__DeploymentStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1137:1: ( rule__DeploymentStatement__Group__0__Impl rule__DeploymentStatement__Group__1 )
            // InternalMyDsl.g:1138:2: rule__DeploymentStatement__Group__0__Impl rule__DeploymentStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DeploymentStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeploymentStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentStatement__Group__0"


    // $ANTLR start "rule__DeploymentStatement__Group__0__Impl"
    // InternalMyDsl.g:1145:1: rule__DeploymentStatement__Group__0__Impl : ( 'deploys' ) ;
    public final void rule__DeploymentStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( ( 'deploys' ) )
            // InternalMyDsl.g:1150:1: ( 'deploys' )
            {
            // InternalMyDsl.g:1150:1: ( 'deploys' )
            // InternalMyDsl.g:1151:2: 'deploys'
            {
             before(grammarAccess.getDeploymentStatementAccess().getDeploysKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDeploymentStatementAccess().getDeploysKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentStatement__Group__0__Impl"


    // $ANTLR start "rule__DeploymentStatement__Group__1"
    // InternalMyDsl.g:1160:1: rule__DeploymentStatement__Group__1 : rule__DeploymentStatement__Group__1__Impl rule__DeploymentStatement__Group__2 ;
    public final void rule__DeploymentStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1164:1: ( rule__DeploymentStatement__Group__1__Impl rule__DeploymentStatement__Group__2 )
            // InternalMyDsl.g:1165:2: rule__DeploymentStatement__Group__1__Impl rule__DeploymentStatement__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__DeploymentStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeploymentStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentStatement__Group__1"


    // $ANTLR start "rule__DeploymentStatement__Group__1__Impl"
    // InternalMyDsl.g:1172:1: rule__DeploymentStatement__Group__1__Impl : ( ( rule__DeploymentStatement__NodesAssignment_1 ) ) ;
    public final void rule__DeploymentStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( ( ( rule__DeploymentStatement__NodesAssignment_1 ) ) )
            // InternalMyDsl.g:1177:1: ( ( rule__DeploymentStatement__NodesAssignment_1 ) )
            {
            // InternalMyDsl.g:1177:1: ( ( rule__DeploymentStatement__NodesAssignment_1 ) )
            // InternalMyDsl.g:1178:2: ( rule__DeploymentStatement__NodesAssignment_1 )
            {
             before(grammarAccess.getDeploymentStatementAccess().getNodesAssignment_1()); 
            // InternalMyDsl.g:1179:2: ( rule__DeploymentStatement__NodesAssignment_1 )
            // InternalMyDsl.g:1179:3: rule__DeploymentStatement__NodesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeploymentStatement__NodesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentStatementAccess().getNodesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentStatement__Group__1__Impl"


    // $ANTLR start "rule__DeploymentStatement__Group__2"
    // InternalMyDsl.g:1187:1: rule__DeploymentStatement__Group__2 : rule__DeploymentStatement__Group__2__Impl rule__DeploymentStatement__Group__3 ;
    public final void rule__DeploymentStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1191:1: ( rule__DeploymentStatement__Group__2__Impl rule__DeploymentStatement__Group__3 )
            // InternalMyDsl.g:1192:2: rule__DeploymentStatement__Group__2__Impl rule__DeploymentStatement__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DeploymentStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeploymentStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentStatement__Group__2"


    // $ANTLR start "rule__DeploymentStatement__Group__2__Impl"
    // InternalMyDsl.g:1199:1: rule__DeploymentStatement__Group__2__Impl : ( 'on' ) ;
    public final void rule__DeploymentStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( ( 'on' ) )
            // InternalMyDsl.g:1204:1: ( 'on' )
            {
            // InternalMyDsl.g:1204:1: ( 'on' )
            // InternalMyDsl.g:1205:2: 'on'
            {
             before(grammarAccess.getDeploymentStatementAccess().getOnKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDeploymentStatementAccess().getOnKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentStatement__Group__2__Impl"


    // $ANTLR start "rule__DeploymentStatement__Group__3"
    // InternalMyDsl.g:1214:1: rule__DeploymentStatement__Group__3 : rule__DeploymentStatement__Group__3__Impl rule__DeploymentStatement__Group__4 ;
    public final void rule__DeploymentStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1218:1: ( rule__DeploymentStatement__Group__3__Impl rule__DeploymentStatement__Group__4 )
            // InternalMyDsl.g:1219:2: rule__DeploymentStatement__Group__3__Impl rule__DeploymentStatement__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__DeploymentStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeploymentStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentStatement__Group__3"


    // $ANTLR start "rule__DeploymentStatement__Group__3__Impl"
    // InternalMyDsl.g:1226:1: rule__DeploymentStatement__Group__3__Impl : ( ( rule__DeploymentStatement__PlatformAssignment_3 ) ) ;
    public final void rule__DeploymentStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1230:1: ( ( ( rule__DeploymentStatement__PlatformAssignment_3 ) ) )
            // InternalMyDsl.g:1231:1: ( ( rule__DeploymentStatement__PlatformAssignment_3 ) )
            {
            // InternalMyDsl.g:1231:1: ( ( rule__DeploymentStatement__PlatformAssignment_3 ) )
            // InternalMyDsl.g:1232:2: ( rule__DeploymentStatement__PlatformAssignment_3 )
            {
             before(grammarAccess.getDeploymentStatementAccess().getPlatformAssignment_3()); 
            // InternalMyDsl.g:1233:2: ( rule__DeploymentStatement__PlatformAssignment_3 )
            // InternalMyDsl.g:1233:3: rule__DeploymentStatement__PlatformAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DeploymentStatement__PlatformAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentStatementAccess().getPlatformAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentStatement__Group__3__Impl"


    // $ANTLR start "rule__DeploymentStatement__Group__4"
    // InternalMyDsl.g:1241:1: rule__DeploymentStatement__Group__4 : rule__DeploymentStatement__Group__4__Impl ;
    public final void rule__DeploymentStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1245:1: ( rule__DeploymentStatement__Group__4__Impl )
            // InternalMyDsl.g:1246:2: rule__DeploymentStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeploymentStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentStatement__Group__4"


    // $ANTLR start "rule__DeploymentStatement__Group__4__Impl"
    // InternalMyDsl.g:1252:1: rule__DeploymentStatement__Group__4__Impl : ( ';' ) ;
    public final void rule__DeploymentStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1256:1: ( ( ';' ) )
            // InternalMyDsl.g:1257:1: ( ';' )
            {
            // InternalMyDsl.g:1257:1: ( ';' )
            // InternalMyDsl.g:1258:2: ';'
            {
             before(grammarAccess.getDeploymentStatementAccess().getSemicolonKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDeploymentStatementAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentStatement__Group__4__Impl"


    // $ANTLR start "rule__Deployment__Group__0"
    // InternalMyDsl.g:1268:1: rule__Deployment__Group__0 : rule__Deployment__Group__0__Impl rule__Deployment__Group__1 ;
    public final void rule__Deployment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1272:1: ( rule__Deployment__Group__0__Impl rule__Deployment__Group__1 )
            // InternalMyDsl.g:1273:2: rule__Deployment__Group__0__Impl rule__Deployment__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Deployment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__0"


    // $ANTLR start "rule__Deployment__Group__0__Impl"
    // InternalMyDsl.g:1280:1: rule__Deployment__Group__0__Impl : ( () ) ;
    public final void rule__Deployment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( ( () ) )
            // InternalMyDsl.g:1285:1: ( () )
            {
            // InternalMyDsl.g:1285:1: ( () )
            // InternalMyDsl.g:1286:2: ()
            {
             before(grammarAccess.getDeploymentAccess().getDeploymentAction_0()); 
            // InternalMyDsl.g:1287:2: ()
            // InternalMyDsl.g:1287:3: 
            {
            }

             after(grammarAccess.getDeploymentAccess().getDeploymentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__0__Impl"


    // $ANTLR start "rule__Deployment__Group__1"
    // InternalMyDsl.g:1295:1: rule__Deployment__Group__1 : rule__Deployment__Group__1__Impl rule__Deployment__Group__2 ;
    public final void rule__Deployment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1299:1: ( rule__Deployment__Group__1__Impl rule__Deployment__Group__2 )
            // InternalMyDsl.g:1300:2: rule__Deployment__Group__1__Impl rule__Deployment__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Deployment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__1"


    // $ANTLR start "rule__Deployment__Group__1__Impl"
    // InternalMyDsl.g:1307:1: rule__Deployment__Group__1__Impl : ( 'deployment' ) ;
    public final void rule__Deployment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( ( 'deployment' ) )
            // InternalMyDsl.g:1312:1: ( 'deployment' )
            {
            // InternalMyDsl.g:1312:1: ( 'deployment' )
            // InternalMyDsl.g:1313:2: 'deployment'
            {
             before(grammarAccess.getDeploymentAccess().getDeploymentKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getDeploymentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__1__Impl"


    // $ANTLR start "rule__Deployment__Group__2"
    // InternalMyDsl.g:1322:1: rule__Deployment__Group__2 : rule__Deployment__Group__2__Impl rule__Deployment__Group__3 ;
    public final void rule__Deployment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1326:1: ( rule__Deployment__Group__2__Impl rule__Deployment__Group__3 )
            // InternalMyDsl.g:1327:2: rule__Deployment__Group__2__Impl rule__Deployment__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Deployment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__2"


    // $ANTLR start "rule__Deployment__Group__2__Impl"
    // InternalMyDsl.g:1334:1: rule__Deployment__Group__2__Impl : ( '{' ) ;
    public final void rule__Deployment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( ( '{' ) )
            // InternalMyDsl.g:1339:1: ( '{' )
            {
            // InternalMyDsl.g:1339:1: ( '{' )
            // InternalMyDsl.g:1340:2: '{'
            {
             before(grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__2__Impl"


    // $ANTLR start "rule__Deployment__Group__3"
    // InternalMyDsl.g:1349:1: rule__Deployment__Group__3 : rule__Deployment__Group__3__Impl rule__Deployment__Group__4 ;
    public final void rule__Deployment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1353:1: ( rule__Deployment__Group__3__Impl rule__Deployment__Group__4 )
            // InternalMyDsl.g:1354:2: rule__Deployment__Group__3__Impl rule__Deployment__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Deployment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__3"


    // $ANTLR start "rule__Deployment__Group__3__Impl"
    // InternalMyDsl.g:1361:1: rule__Deployment__Group__3__Impl : ( ( rule__Deployment__Group_3__0 )* ) ;
    public final void rule__Deployment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1365:1: ( ( ( rule__Deployment__Group_3__0 )* ) )
            // InternalMyDsl.g:1366:1: ( ( rule__Deployment__Group_3__0 )* )
            {
            // InternalMyDsl.g:1366:1: ( ( rule__Deployment__Group_3__0 )* )
            // InternalMyDsl.g:1367:2: ( rule__Deployment__Group_3__0 )*
            {
             before(grammarAccess.getDeploymentAccess().getGroup_3()); 
            // InternalMyDsl.g:1368:2: ( rule__Deployment__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1368:3: rule__Deployment__Group_3__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Deployment__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDeploymentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__3__Impl"


    // $ANTLR start "rule__Deployment__Group__4"
    // InternalMyDsl.g:1376:1: rule__Deployment__Group__4 : rule__Deployment__Group__4__Impl rule__Deployment__Group__5 ;
    public final void rule__Deployment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1380:1: ( rule__Deployment__Group__4__Impl rule__Deployment__Group__5 )
            // InternalMyDsl.g:1381:2: rule__Deployment__Group__4__Impl rule__Deployment__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Deployment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__4"


    // $ANTLR start "rule__Deployment__Group__4__Impl"
    // InternalMyDsl.g:1388:1: rule__Deployment__Group__4__Impl : ( ( rule__Deployment__Group_4__0 )* ) ;
    public final void rule__Deployment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1392:1: ( ( ( rule__Deployment__Group_4__0 )* ) )
            // InternalMyDsl.g:1393:1: ( ( rule__Deployment__Group_4__0 )* )
            {
            // InternalMyDsl.g:1393:1: ( ( rule__Deployment__Group_4__0 )* )
            // InternalMyDsl.g:1394:2: ( rule__Deployment__Group_4__0 )*
            {
             before(grammarAccess.getDeploymentAccess().getGroup_4()); 
            // InternalMyDsl.g:1395:2: ( rule__Deployment__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1395:3: rule__Deployment__Group_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Deployment__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDeploymentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__4__Impl"


    // $ANTLR start "rule__Deployment__Group__5"
    // InternalMyDsl.g:1403:1: rule__Deployment__Group__5 : rule__Deployment__Group__5__Impl rule__Deployment__Group__6 ;
    public final void rule__Deployment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1407:1: ( rule__Deployment__Group__5__Impl rule__Deployment__Group__6 )
            // InternalMyDsl.g:1408:2: rule__Deployment__Group__5__Impl rule__Deployment__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Deployment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__5"


    // $ANTLR start "rule__Deployment__Group__5__Impl"
    // InternalMyDsl.g:1415:1: rule__Deployment__Group__5__Impl : ( ( rule__Deployment__DeploymentsAssignment_5 )* ) ;
    public final void rule__Deployment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1419:1: ( ( ( rule__Deployment__DeploymentsAssignment_5 )* ) )
            // InternalMyDsl.g:1420:1: ( ( rule__Deployment__DeploymentsAssignment_5 )* )
            {
            // InternalMyDsl.g:1420:1: ( ( rule__Deployment__DeploymentsAssignment_5 )* )
            // InternalMyDsl.g:1421:2: ( rule__Deployment__DeploymentsAssignment_5 )*
            {
             before(grammarAccess.getDeploymentAccess().getDeploymentsAssignment_5()); 
            // InternalMyDsl.g:1422:2: ( rule__Deployment__DeploymentsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1422:3: rule__Deployment__DeploymentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Deployment__DeploymentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDeploymentAccess().getDeploymentsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__5__Impl"


    // $ANTLR start "rule__Deployment__Group__6"
    // InternalMyDsl.g:1430:1: rule__Deployment__Group__6 : rule__Deployment__Group__6__Impl ;
    public final void rule__Deployment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1434:1: ( rule__Deployment__Group__6__Impl )
            // InternalMyDsl.g:1435:2: rule__Deployment__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__6"


    // $ANTLR start "rule__Deployment__Group__6__Impl"
    // InternalMyDsl.g:1441:1: rule__Deployment__Group__6__Impl : ( '}' ) ;
    public final void rule__Deployment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1445:1: ( ( '}' ) )
            // InternalMyDsl.g:1446:1: ( '}' )
            {
            // InternalMyDsl.g:1446:1: ( '}' )
            // InternalMyDsl.g:1447:2: '}'
            {
             before(grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__6__Impl"


    // $ANTLR start "rule__Deployment__Group_3__0"
    // InternalMyDsl.g:1457:1: rule__Deployment__Group_3__0 : rule__Deployment__Group_3__0__Impl rule__Deployment__Group_3__1 ;
    public final void rule__Deployment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1461:1: ( rule__Deployment__Group_3__0__Impl rule__Deployment__Group_3__1 )
            // InternalMyDsl.g:1462:2: rule__Deployment__Group_3__0__Impl rule__Deployment__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Deployment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group_3__0"


    // $ANTLR start "rule__Deployment__Group_3__0__Impl"
    // InternalMyDsl.g:1469:1: rule__Deployment__Group_3__0__Impl : ( 'platform' ) ;
    public final void rule__Deployment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( ( 'platform' ) )
            // InternalMyDsl.g:1474:1: ( 'platform' )
            {
            // InternalMyDsl.g:1474:1: ( 'platform' )
            // InternalMyDsl.g:1475:2: 'platform'
            {
             before(grammarAccess.getDeploymentAccess().getPlatformKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getPlatformKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group_3__0__Impl"


    // $ANTLR start "rule__Deployment__Group_3__1"
    // InternalMyDsl.g:1484:1: rule__Deployment__Group_3__1 : rule__Deployment__Group_3__1__Impl rule__Deployment__Group_3__2 ;
    public final void rule__Deployment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( rule__Deployment__Group_3__1__Impl rule__Deployment__Group_3__2 )
            // InternalMyDsl.g:1489:2: rule__Deployment__Group_3__1__Impl rule__Deployment__Group_3__2
            {
            pushFollow(FOLLOW_5);
            rule__Deployment__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group_3__1"


    // $ANTLR start "rule__Deployment__Group_3__1__Impl"
    // InternalMyDsl.g:1496:1: rule__Deployment__Group_3__1__Impl : ( ( rule__Deployment__PlatformsAssignment_3_1 ) ) ;
    public final void rule__Deployment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1500:1: ( ( ( rule__Deployment__PlatformsAssignment_3_1 ) ) )
            // InternalMyDsl.g:1501:1: ( ( rule__Deployment__PlatformsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1501:1: ( ( rule__Deployment__PlatformsAssignment_3_1 ) )
            // InternalMyDsl.g:1502:2: ( rule__Deployment__PlatformsAssignment_3_1 )
            {
             before(grammarAccess.getDeploymentAccess().getPlatformsAssignment_3_1()); 
            // InternalMyDsl.g:1503:2: ( rule__Deployment__PlatformsAssignment_3_1 )
            // InternalMyDsl.g:1503:3: rule__Deployment__PlatformsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__PlatformsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentAccess().getPlatformsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group_3__1__Impl"


    // $ANTLR start "rule__Deployment__Group_3__2"
    // InternalMyDsl.g:1511:1: rule__Deployment__Group_3__2 : rule__Deployment__Group_3__2__Impl ;
    public final void rule__Deployment__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( rule__Deployment__Group_3__2__Impl )
            // InternalMyDsl.g:1516:2: rule__Deployment__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group_3__2"


    // $ANTLR start "rule__Deployment__Group_3__2__Impl"
    // InternalMyDsl.g:1522:1: rule__Deployment__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Deployment__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1526:1: ( ( ';' ) )
            // InternalMyDsl.g:1527:1: ( ';' )
            {
            // InternalMyDsl.g:1527:1: ( ';' )
            // InternalMyDsl.g:1528:2: ';'
            {
             before(grammarAccess.getDeploymentAccess().getSemicolonKeyword_3_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group_3__2__Impl"


    // $ANTLR start "rule__Deployment__Group_4__0"
    // InternalMyDsl.g:1538:1: rule__Deployment__Group_4__0 : rule__Deployment__Group_4__0__Impl rule__Deployment__Group_4__1 ;
    public final void rule__Deployment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1542:1: ( rule__Deployment__Group_4__0__Impl rule__Deployment__Group_4__1 )
            // InternalMyDsl.g:1543:2: rule__Deployment__Group_4__0__Impl rule__Deployment__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Deployment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group_4__0"


    // $ANTLR start "rule__Deployment__Group_4__0__Impl"
    // InternalMyDsl.g:1550:1: rule__Deployment__Group_4__0__Impl : ( 'system' ) ;
    public final void rule__Deployment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1554:1: ( ( 'system' ) )
            // InternalMyDsl.g:1555:1: ( 'system' )
            {
            // InternalMyDsl.g:1555:1: ( 'system' )
            // InternalMyDsl.g:1556:2: 'system'
            {
             before(grammarAccess.getDeploymentAccess().getSystemKeyword_4_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getSystemKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group_4__0__Impl"


    // $ANTLR start "rule__Deployment__Group_4__1"
    // InternalMyDsl.g:1565:1: rule__Deployment__Group_4__1 : rule__Deployment__Group_4__1__Impl rule__Deployment__Group_4__2 ;
    public final void rule__Deployment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1569:1: ( rule__Deployment__Group_4__1__Impl rule__Deployment__Group_4__2 )
            // InternalMyDsl.g:1570:2: rule__Deployment__Group_4__1__Impl rule__Deployment__Group_4__2
            {
            pushFollow(FOLLOW_5);
            rule__Deployment__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group_4__1"


    // $ANTLR start "rule__Deployment__Group_4__1__Impl"
    // InternalMyDsl.g:1577:1: rule__Deployment__Group_4__1__Impl : ( ( rule__Deployment__SystemsAssignment_4_1 ) ) ;
    public final void rule__Deployment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( ( ( rule__Deployment__SystemsAssignment_4_1 ) ) )
            // InternalMyDsl.g:1582:1: ( ( rule__Deployment__SystemsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1582:1: ( ( rule__Deployment__SystemsAssignment_4_1 ) )
            // InternalMyDsl.g:1583:2: ( rule__Deployment__SystemsAssignment_4_1 )
            {
             before(grammarAccess.getDeploymentAccess().getSystemsAssignment_4_1()); 
            // InternalMyDsl.g:1584:2: ( rule__Deployment__SystemsAssignment_4_1 )
            // InternalMyDsl.g:1584:3: rule__Deployment__SystemsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__SystemsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentAccess().getSystemsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group_4__1__Impl"


    // $ANTLR start "rule__Deployment__Group_4__2"
    // InternalMyDsl.g:1592:1: rule__Deployment__Group_4__2 : rule__Deployment__Group_4__2__Impl ;
    public final void rule__Deployment__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1596:1: ( rule__Deployment__Group_4__2__Impl )
            // InternalMyDsl.g:1597:2: rule__Deployment__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group_4__2"


    // $ANTLR start "rule__Deployment__Group_4__2__Impl"
    // InternalMyDsl.g:1603:1: rule__Deployment__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Deployment__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1607:1: ( ( ';' ) )
            // InternalMyDsl.g:1608:1: ( ';' )
            {
            // InternalMyDsl.g:1608:1: ( ';' )
            // InternalMyDsl.g:1609:2: ';'
            {
             before(grammarAccess.getDeploymentAccess().getSemicolonKeyword_4_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group_4__2__Impl"


    // $ANTLR start "rule__Model__NodesAssignment_0"
    // InternalMyDsl.g:1619:1: rule__Model__NodesAssignment_0 : ( ruleNodeDefinition ) ;
    public final void rule__Model__NodesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:1: ( ( ruleNodeDefinition ) )
            // InternalMyDsl.g:1624:2: ( ruleNodeDefinition )
            {
            // InternalMyDsl.g:1624:2: ( ruleNodeDefinition )
            // InternalMyDsl.g:1625:3: ruleNodeDefinition
            {
             before(grammarAccess.getModelAccess().getNodesNodeDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNodesNodeDefinitionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NodesAssignment_0"


    // $ANTLR start "rule__Model__SystemsAssignment_1"
    // InternalMyDsl.g:1634:1: rule__Model__SystemsAssignment_1 : ( ruleSystemDefinition ) ;
    public final void rule__Model__SystemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( ( ruleSystemDefinition ) )
            // InternalMyDsl.g:1639:2: ( ruleSystemDefinition )
            {
            // InternalMyDsl.g:1639:2: ( ruleSystemDefinition )
            // InternalMyDsl.g:1640:3: ruleSystemDefinition
            {
             before(grammarAccess.getModelAccess().getSystemsSystemDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSystemsSystemDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SystemsAssignment_1"


    // $ANTLR start "rule__Model__DeploymentsAssignment_2"
    // InternalMyDsl.g:1649:1: rule__Model__DeploymentsAssignment_2 : ( ruleDeployment ) ;
    public final void rule__Model__DeploymentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1653:1: ( ( ruleDeployment ) )
            // InternalMyDsl.g:1654:2: ( ruleDeployment )
            {
            // InternalMyDsl.g:1654:2: ( ruleDeployment )
            // InternalMyDsl.g:1655:3: ruleDeployment
            {
             before(grammarAccess.getModelAccess().getDeploymentsDeploymentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeployment();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeploymentsDeploymentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeploymentsAssignment_2"


    // $ANTLR start "rule__NodeDefinition__NameAssignment_1"
    // InternalMyDsl.g:1664:1: rule__NodeDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NodeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1668:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1669:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1669:2: ( RULE_ID )
            // InternalMyDsl.g:1670:3: RULE_ID
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__NameAssignment_1"


    // $ANTLR start "rule__NodeInstance__TypeAssignment_0"
    // InternalMyDsl.g:1679:1: rule__NodeInstance__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NodeInstance__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1683:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1684:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1684:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1685:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeInstanceAccess().getTypeNodeDefinitionCrossReference_0_0()); 
            // InternalMyDsl.g:1686:3: ( RULE_ID )
            // InternalMyDsl.g:1687:4: RULE_ID
            {
             before(grammarAccess.getNodeInstanceAccess().getTypeNodeDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeInstanceAccess().getTypeNodeDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNodeInstanceAccess().getTypeNodeDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstance__TypeAssignment_0"


    // $ANTLR start "rule__NodeInstance__NameAssignment_1"
    // InternalMyDsl.g:1698:1: rule__NodeInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NodeInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1702:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1703:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1703:2: ( RULE_ID )
            // InternalMyDsl.g:1704:3: RULE_ID
            {
             before(grammarAccess.getNodeInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeInstanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstance__NameAssignment_1"


    // $ANTLR start "rule__SystemDefinition__NameAssignment_1"
    // InternalMyDsl.g:1713:1: rule__SystemDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1717:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1718:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1718:2: ( RULE_ID )
            // InternalMyDsl.g:1719:3: RULE_ID
            {
             before(grammarAccess.getSystemDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__NameAssignment_1"


    // $ANTLR start "rule__SystemDefinition__NodesAssignment_3_0_2_0"
    // InternalMyDsl.g:1728:1: rule__SystemDefinition__NodesAssignment_3_0_2_0 : ( ruleNodeInstance ) ;
    public final void rule__SystemDefinition__NodesAssignment_3_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1732:1: ( ( ruleNodeInstance ) )
            // InternalMyDsl.g:1733:2: ( ruleNodeInstance )
            {
            // InternalMyDsl.g:1733:2: ( ruleNodeInstance )
            // InternalMyDsl.g:1734:3: ruleNodeInstance
            {
             before(grammarAccess.getSystemDefinitionAccess().getNodesNodeInstanceParserRuleCall_3_0_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeInstance();

            state._fsp--;

             after(grammarAccess.getSystemDefinitionAccess().getNodesNodeInstanceParserRuleCall_3_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__NodesAssignment_3_0_2_0"


    // $ANTLR start "rule__SystemDefinition__SubsystemsAssignment_3_1_2_0"
    // InternalMyDsl.g:1743:1: rule__SystemDefinition__SubsystemsAssignment_3_1_2_0 : ( ruleSystemInstance ) ;
    public final void rule__SystemDefinition__SubsystemsAssignment_3_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1747:1: ( ( ruleSystemInstance ) )
            // InternalMyDsl.g:1748:2: ( ruleSystemInstance )
            {
            // InternalMyDsl.g:1748:2: ( ruleSystemInstance )
            // InternalMyDsl.g:1749:3: ruleSystemInstance
            {
             before(grammarAccess.getSystemDefinitionAccess().getSubsystemsSystemInstanceParserRuleCall_3_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemInstance();

            state._fsp--;

             after(grammarAccess.getSystemDefinitionAccess().getSubsystemsSystemInstanceParserRuleCall_3_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDefinition__SubsystemsAssignment_3_1_2_0"


    // $ANTLR start "rule__SystemInstance__TypeAssignment_0"
    // InternalMyDsl.g:1758:1: rule__SystemInstance__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SystemInstance__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1762:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1763:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1763:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1764:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemInstanceAccess().getTypeSystemDefinitionCrossReference_0_0()); 
            // InternalMyDsl.g:1765:3: ( RULE_ID )
            // InternalMyDsl.g:1766:4: RULE_ID
            {
             before(grammarAccess.getSystemInstanceAccess().getTypeSystemDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemInstanceAccess().getTypeSystemDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSystemInstanceAccess().getTypeSystemDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemInstance__TypeAssignment_0"


    // $ANTLR start "rule__SystemInstance__NameAssignment_1"
    // InternalMyDsl.g:1777:1: rule__SystemInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1781:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1782:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1782:2: ( RULE_ID )
            // InternalMyDsl.g:1783:3: RULE_ID
            {
             before(grammarAccess.getSystemInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemInstanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemInstance__NameAssignment_1"


    // $ANTLR start "rule__SystemReference__SystemAssignment_0"
    // InternalMyDsl.g:1792:1: rule__SystemReference__SystemAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SystemReference__SystemAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1796:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1797:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1797:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1798:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemReferenceAccess().getSystemSystemInstanceCrossReference_0_0()); 
            // InternalMyDsl.g:1799:3: ( RULE_ID )
            // InternalMyDsl.g:1800:4: RULE_ID
            {
             before(grammarAccess.getSystemReferenceAccess().getSystemSystemInstanceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemReferenceAccess().getSystemSystemInstanceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSystemReferenceAccess().getSystemSystemInstanceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemReference__SystemAssignment_0"


    // $ANTLR start "rule__SystemReference__SubsystemAssignment_1_1"
    // InternalMyDsl.g:1811:1: rule__SystemReference__SubsystemAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__SystemReference__SubsystemAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1815:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1816:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1816:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1817:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemReferenceAccess().getSubsystemSystemReferenceCrossReference_1_1_0()); 
            // InternalMyDsl.g:1818:3: ( RULE_ID )
            // InternalMyDsl.g:1819:4: RULE_ID
            {
             before(grammarAccess.getSystemReferenceAccess().getSubsystemSystemReferenceIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemReferenceAccess().getSubsystemSystemReferenceIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getSystemReferenceAccess().getSubsystemSystemReferenceCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemReference__SubsystemAssignment_1_1"


    // $ANTLR start "rule__NodeInstanceReference__BelongingSystemReferenceAssignment_0"
    // InternalMyDsl.g:1830:1: rule__NodeInstanceReference__BelongingSystemReferenceAssignment_0 : ( ruleSystemReference ) ;
    public final void rule__NodeInstanceReference__BelongingSystemReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( ( ruleSystemReference ) )
            // InternalMyDsl.g:1835:2: ( ruleSystemReference )
            {
            // InternalMyDsl.g:1835:2: ( ruleSystemReference )
            // InternalMyDsl.g:1836:3: ruleSystemReference
            {
             before(grammarAccess.getNodeInstanceReferenceAccess().getBelongingSystemReferenceSystemReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemReference();

            state._fsp--;

             after(grammarAccess.getNodeInstanceReferenceAccess().getBelongingSystemReferenceSystemReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstanceReference__BelongingSystemReferenceAssignment_0"


    // $ANTLR start "rule__NodeInstanceReference__NodeAssignment_2"
    // InternalMyDsl.g:1845:1: rule__NodeInstanceReference__NodeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__NodeInstanceReference__NodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1850:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1850:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1851:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeInstanceReferenceAccess().getNodeNodeInstanceCrossReference_2_0()); 
            // InternalMyDsl.g:1852:3: ( RULE_ID )
            // InternalMyDsl.g:1853:4: RULE_ID
            {
             before(grammarAccess.getNodeInstanceReferenceAccess().getNodeNodeInstanceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeInstanceReferenceAccess().getNodeNodeInstanceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getNodeInstanceReferenceAccess().getNodeNodeInstanceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeInstanceReference__NodeAssignment_2"


    // $ANTLR start "rule__DeploymentStatement__NodesAssignment_1"
    // InternalMyDsl.g:1864:1: rule__DeploymentStatement__NodesAssignment_1 : ( ruleNodeInstanceReference ) ;
    public final void rule__DeploymentStatement__NodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( ( ruleNodeInstanceReference ) )
            // InternalMyDsl.g:1869:2: ( ruleNodeInstanceReference )
            {
            // InternalMyDsl.g:1869:2: ( ruleNodeInstanceReference )
            // InternalMyDsl.g:1870:3: ruleNodeInstanceReference
            {
             before(grammarAccess.getDeploymentStatementAccess().getNodesNodeInstanceReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeInstanceReference();

            state._fsp--;

             after(grammarAccess.getDeploymentStatementAccess().getNodesNodeInstanceReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentStatement__NodesAssignment_1"


    // $ANTLR start "rule__DeploymentStatement__PlatformAssignment_3"
    // InternalMyDsl.g:1879:1: rule__DeploymentStatement__PlatformAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DeploymentStatement__PlatformAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1883:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1884:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1884:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1885:3: ( RULE_ID )
            {
             before(grammarAccess.getDeploymentStatementAccess().getPlatformPlatformInstanceCrossReference_3_0()); 
            // InternalMyDsl.g:1886:3: ( RULE_ID )
            // InternalMyDsl.g:1887:4: RULE_ID
            {
             before(grammarAccess.getDeploymentStatementAccess().getPlatformPlatformInstanceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeploymentStatementAccess().getPlatformPlatformInstanceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDeploymentStatementAccess().getPlatformPlatformInstanceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentStatement__PlatformAssignment_3"


    // $ANTLR start "rule__Deployment__PlatformsAssignment_3_1"
    // InternalMyDsl.g:1898:1: rule__Deployment__PlatformsAssignment_3_1 : ( rulePlatformInstance ) ;
    public final void rule__Deployment__PlatformsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1902:1: ( ( rulePlatformInstance ) )
            // InternalMyDsl.g:1903:2: ( rulePlatformInstance )
            {
            // InternalMyDsl.g:1903:2: ( rulePlatformInstance )
            // InternalMyDsl.g:1904:3: rulePlatformInstance
            {
             before(grammarAccess.getDeploymentAccess().getPlatformsPlatformInstanceParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformInstance();

            state._fsp--;

             after(grammarAccess.getDeploymentAccess().getPlatformsPlatformInstanceParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__PlatformsAssignment_3_1"


    // $ANTLR start "rule__Deployment__SystemsAssignment_4_1"
    // InternalMyDsl.g:1913:1: rule__Deployment__SystemsAssignment_4_1 : ( ruleSystemInstance ) ;
    public final void rule__Deployment__SystemsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1917:1: ( ( ruleSystemInstance ) )
            // InternalMyDsl.g:1918:2: ( ruleSystemInstance )
            {
            // InternalMyDsl.g:1918:2: ( ruleSystemInstance )
            // InternalMyDsl.g:1919:3: ruleSystemInstance
            {
             before(grammarAccess.getDeploymentAccess().getSystemsSystemInstanceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemInstance();

            state._fsp--;

             after(grammarAccess.getDeploymentAccess().getSystemsSystemInstanceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__SystemsAssignment_4_1"


    // $ANTLR start "rule__Deployment__DeploymentsAssignment_5"
    // InternalMyDsl.g:1928:1: rule__Deployment__DeploymentsAssignment_5 : ( ruleDeploymentStatement ) ;
    public final void rule__Deployment__DeploymentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1932:1: ( ( ruleDeploymentStatement ) )
            // InternalMyDsl.g:1933:2: ( ruleDeploymentStatement )
            {
            // InternalMyDsl.g:1933:2: ( ruleDeploymentStatement )
            // InternalMyDsl.g:1934:3: ruleDeploymentStatement
            {
             before(grammarAccess.getDeploymentAccess().getDeploymentsDeploymentStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDeploymentStatement();

            state._fsp--;

             after(grammarAccess.getDeploymentAccess().getDeploymentsDeploymentStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__DeploymentsAssignment_5"


    // $ANTLR start "rule__PlatformInstance__NameAssignment"
    // InternalMyDsl.g:1943:1: rule__PlatformInstance__NameAssignment : ( RULE_ID ) ;
    public final void rule__PlatformInstance__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1947:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1948:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1948:2: ( RULE_ID )
            // InternalMyDsl.g:1949:3: RULE_ID
            {
             before(grammarAccess.getPlatformInstanceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlatformInstanceAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformInstance__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000802802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000802800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000120A000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});

}