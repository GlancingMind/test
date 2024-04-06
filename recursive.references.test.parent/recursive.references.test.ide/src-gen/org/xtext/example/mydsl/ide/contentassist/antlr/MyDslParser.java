/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
			builder.put(grammarAccess.getSystemDefinitionAccess().getAlternatives_3(), "rule__SystemDefinition__Alternatives_3");
			builder.put(grammarAccess.getNodeDefinitionAccess().getGroup(), "rule__NodeDefinition__Group__0");
			builder.put(grammarAccess.getNodeInstanceAccess().getGroup(), "rule__NodeInstance__Group__0");
			builder.put(grammarAccess.getSystemDefinitionAccess().getGroup(), "rule__SystemDefinition__Group__0");
			builder.put(grammarAccess.getSystemDefinitionAccess().getGroup_3_0(), "rule__SystemDefinition__Group_3_0__0");
			builder.put(grammarAccess.getSystemDefinitionAccess().getGroup_3_0_2(), "rule__SystemDefinition__Group_3_0_2__0");
			builder.put(grammarAccess.getSystemDefinitionAccess().getGroup_3_1(), "rule__SystemDefinition__Group_3_1__0");
			builder.put(grammarAccess.getSystemDefinitionAccess().getGroup_3_1_2(), "rule__SystemDefinition__Group_3_1_2__0");
			builder.put(grammarAccess.getSystemInstanceAccess().getGroup(), "rule__SystemInstance__Group__0");
			builder.put(grammarAccess.getSubSystemReferenceAccess().getGroup(), "rule__SubSystemReference__Group__0");
			builder.put(grammarAccess.getSubSystemReferenceAccess().getGroup_1(), "rule__SubSystemReference__Group_1__0");
			builder.put(grammarAccess.getSystemReferenceAccess().getGroup(), "rule__SystemReference__Group__0");
			builder.put(grammarAccess.getDeploymentStatementAccess().getGroup(), "rule__DeploymentStatement__Group__0");
			builder.put(grammarAccess.getDeploymentAccess().getGroup(), "rule__Deployment__Group__0");
			builder.put(grammarAccess.getDeploymentAccess().getGroup_3(), "rule__Deployment__Group_3__0");
			builder.put(grammarAccess.getDeploymentAccess().getGroup_4(), "rule__Deployment__Group_4__0");
			builder.put(grammarAccess.getModelAccess().getNodesAssignment_0(), "rule__Model__NodesAssignment_0");
			builder.put(grammarAccess.getModelAccess().getSystemsAssignment_1(), "rule__Model__SystemsAssignment_1");
			builder.put(grammarAccess.getModelAccess().getDeploymentsAssignment_2(), "rule__Model__DeploymentsAssignment_2");
			builder.put(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1(), "rule__NodeDefinition__NameAssignment_1");
			builder.put(grammarAccess.getNodeInstanceAccess().getTypeAssignment_0(), "rule__NodeInstance__TypeAssignment_0");
			builder.put(grammarAccess.getNodeInstanceAccess().getNameAssignment_1(), "rule__NodeInstance__NameAssignment_1");
			builder.put(grammarAccess.getSystemDefinitionAccess().getNameAssignment_1(), "rule__SystemDefinition__NameAssignment_1");
			builder.put(grammarAccess.getSystemDefinitionAccess().getNodesAssignment_3_0_2_0(), "rule__SystemDefinition__NodesAssignment_3_0_2_0");
			builder.put(grammarAccess.getSystemDefinitionAccess().getSubsystemsAssignment_3_1_2_0(), "rule__SystemDefinition__SubsystemsAssignment_3_1_2_0");
			builder.put(grammarAccess.getSystemInstanceAccess().getTypeAssignment_0(), "rule__SystemInstance__TypeAssignment_0");
			builder.put(grammarAccess.getSystemInstanceAccess().getNameAssignment_1(), "rule__SystemInstance__NameAssignment_1");
			builder.put(grammarAccess.getSubSystemReferenceAccess().getSystemAssignment_1_2(), "rule__SubSystemReference__SystemAssignment_1_2");
			builder.put(grammarAccess.getSystemReferenceAccess().getSystemAssignment_1(), "rule__SystemReference__SystemAssignment_1");
			builder.put(grammarAccess.getDeploymentStatementAccess().getSystemRefAssignment_1(), "rule__DeploymentStatement__SystemRefAssignment_1");
			builder.put(grammarAccess.getDeploymentStatementAccess().getNodeAssignment_3(), "rule__DeploymentStatement__NodeAssignment_3");
			builder.put(grammarAccess.getDeploymentStatementAccess().getPlatformAssignment_5(), "rule__DeploymentStatement__PlatformAssignment_5");
			builder.put(grammarAccess.getDeploymentAccess().getPlatformsAssignment_3_1(), "rule__Deployment__PlatformsAssignment_3_1");
			builder.put(grammarAccess.getDeploymentAccess().getSystemsAssignment_4_1(), "rule__Deployment__SystemsAssignment_4_1");
			builder.put(grammarAccess.getDeploymentAccess().getDeploymentsAssignment_5(), "rule__Deployment__DeploymentsAssignment_5");
			builder.put(grammarAccess.getPlatformInstanceAccess().getNameAssignment(), "rule__PlatformInstance__NameAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
