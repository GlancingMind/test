/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cNodesAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cNodesNodeDefinitionParserRuleCall_0_0 = (RuleCall)cNodesAssignment_0.eContents().get(0);
		private final Assignment cSystemsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cSystemsSystemDefinitionParserRuleCall_1_0 = (RuleCall)cSystemsAssignment_1.eContents().get(0);
		private final Assignment cDeploymentsAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cDeploymentsDeploymentParserRuleCall_2_0 = (RuleCall)cDeploymentsAssignment_2.eContents().get(0);
		
		//Model:
		//    (nodes+=NodeDefinition
		//    | systems+=SystemDefinition
		//    | deployments+=Deployment)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(nodes+=NodeDefinition
		//| systems+=SystemDefinition
		//| deployments+=Deployment)*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//nodes+=NodeDefinition
		public Assignment getNodesAssignment_0() { return cNodesAssignment_0; }
		
		//NodeDefinition
		public RuleCall getNodesNodeDefinitionParserRuleCall_0_0() { return cNodesNodeDefinitionParserRuleCall_0_0; }
		
		//systems+=SystemDefinition
		public Assignment getSystemsAssignment_1() { return cSystemsAssignment_1; }
		
		//SystemDefinition
		public RuleCall getSystemsSystemDefinitionParserRuleCall_1_0() { return cSystemsSystemDefinitionParserRuleCall_1_0; }
		
		//deployments+=Deployment
		public Assignment getDeploymentsAssignment_2() { return cDeploymentsAssignment_2; }
		
		//Deployment
		public RuleCall getDeploymentsDeploymentParserRuleCall_2_0() { return cDeploymentsDeploymentParserRuleCall_2_0; }
	}
	public class NodeDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.NodeDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNodeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//NodeDefinition: 'node' name=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'node' name=ID ';'
		public Group getGroup() { return cGroup; }
		
		//'node'
		public Keyword getNodeKeyword_0() { return cNodeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class NodeInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.NodeInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cTypeNodeDefinitionCrossReference_0_0 = (CrossReference)cTypeAssignment_0.eContents().get(0);
		private final RuleCall cTypeNodeDefinitionIDTerminalRuleCall_0_0_1 = (RuleCall)cTypeNodeDefinitionCrossReference_0_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//NodeInstance: type=[NodeDefinition] name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//type=[NodeDefinition] name=ID
		public Group getGroup() { return cGroup; }
		
		//type=[NodeDefinition]
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//[NodeDefinition]
		public CrossReference getTypeNodeDefinitionCrossReference_0_0() { return cTypeNodeDefinitionCrossReference_0_0; }
		
		//ID
		public RuleCall getTypeNodeDefinitionIDTerminalRuleCall_0_0_1() { return cTypeNodeDefinitionIDTerminalRuleCall_0_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class SystemDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.SystemDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSystemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cNodesKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Group cGroup_3_0_2 = (Group)cGroup_3_0.eContents().get(2);
		private final Assignment cNodesAssignment_3_0_2_0 = (Assignment)cGroup_3_0_2.eContents().get(0);
		private final RuleCall cNodesNodeInstanceParserRuleCall_3_0_2_0_0 = (RuleCall)cNodesAssignment_3_0_2_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_0_2_1 = (Keyword)cGroup_3_0_2.eContents().get(1);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cSubsystemsKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Group cGroup_3_1_2 = (Group)cGroup_3_1.eContents().get(2);
		private final Assignment cSubsystemsAssignment_3_1_2_0 = (Assignment)cGroup_3_1_2.eContents().get(0);
		private final RuleCall cSubsystemsSystemInstanceParserRuleCall_3_1_2_0_0 = (RuleCall)cSubsystemsAssignment_3_1_2_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_2_1 = (Keyword)cGroup_3_1_2.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SystemDefinition:
		//    'system' name=ID '{'(
		//            'nodes' ':' (nodes+=NodeInstance ';')*
		//        | 'subsystems' ':' (subsystems+=SystemInstance ';')*
		//        )*
		//    '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'system' name=ID '{'(
		//        'nodes' ':' (nodes+=NodeInstance ';')*
		//    | 'subsystems' ':' (subsystems+=SystemInstance ';')*
		//    )*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'system'
		public Keyword getSystemKeyword_0() { return cSystemKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(
		//            'nodes' ':' (nodes+=NodeInstance ';')*
		//        | 'subsystems' ':' (subsystems+=SystemInstance ';')*
		//        )*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'nodes' ':' (nodes+=NodeInstance ';')*
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'nodes'
		public Keyword getNodesKeyword_3_0_0() { return cNodesKeyword_3_0_0; }
		
		//':'
		public Keyword getColonKeyword_3_0_1() { return cColonKeyword_3_0_1; }
		
		//(nodes+=NodeInstance ';')*
		public Group getGroup_3_0_2() { return cGroup_3_0_2; }
		
		//nodes+=NodeInstance
		public Assignment getNodesAssignment_3_0_2_0() { return cNodesAssignment_3_0_2_0; }
		
		//NodeInstance
		public RuleCall getNodesNodeInstanceParserRuleCall_3_0_2_0_0() { return cNodesNodeInstanceParserRuleCall_3_0_2_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_0_2_1() { return cSemicolonKeyword_3_0_2_1; }
		
		//'subsystems' ':' (subsystems+=SystemInstance ';')*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'subsystems'
		public Keyword getSubsystemsKeyword_3_1_0() { return cSubsystemsKeyword_3_1_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_1() { return cColonKeyword_3_1_1; }
		
		//(subsystems+=SystemInstance ';')*
		public Group getGroup_3_1_2() { return cGroup_3_1_2; }
		
		//subsystems+=SystemInstance
		public Assignment getSubsystemsAssignment_3_1_2_0() { return cSubsystemsAssignment_3_1_2_0; }
		
		//SystemInstance
		public RuleCall getSubsystemsSystemInstanceParserRuleCall_3_1_2_0_0() { return cSubsystemsSystemInstanceParserRuleCall_3_1_2_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_2_1() { return cSemicolonKeyword_3_1_2_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class SystemInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.SystemInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cTypeSystemDefinitionCrossReference_0_0 = (CrossReference)cTypeAssignment_0.eContents().get(0);
		private final RuleCall cTypeSystemDefinitionIDTerminalRuleCall_0_0_1 = (RuleCall)cTypeSystemDefinitionCrossReference_0_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//SystemInstance: type=[SystemDefinition] name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//type=[SystemDefinition] name=ID
		public Group getGroup() { return cGroup; }
		
		//type=[SystemDefinition]
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//[SystemDefinition]
		public CrossReference getTypeSystemDefinitionCrossReference_0_0() { return cTypeSystemDefinitionCrossReference_0_0; }
		
		//ID
		public RuleCall getTypeSystemDefinitionIDTerminalRuleCall_0_0_1() { return cTypeSystemDefinitionIDTerminalRuleCall_0_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class NodeInstanceReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.NodeInstanceReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSystemReferenceParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cNodeInstanceReferenceRefAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cTailAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final CrossReference cTailFeatureCrossReference_1_2_0 = (CrossReference)cTailAssignment_1_2.eContents().get(0);
		private final RuleCall cTailFeatureIDTerminalRuleCall_1_2_0_1 = (RuleCall)cTailFeatureCrossReference_1_2_0.eContents().get(1);
		
		//// Right recursive
		////SystemReference: system=[SystemInstance] ('.' subsystem=SystemReference)?;
		//NodeInstanceReference:
		//    SystemReference ({NodeInstanceReference.ref=current} '.' tail=[Feature])*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//SystemReference ({NodeInstanceReference.ref=current} '.' tail=[Feature])*
		public Group getGroup() { return cGroup; }
		
		//SystemReference
		public RuleCall getSystemReferenceParserRuleCall_0() { return cSystemReferenceParserRuleCall_0; }
		
		//({NodeInstanceReference.ref=current} '.' tail=[Feature])*
		public Group getGroup_1() { return cGroup_1; }
		
		//{NodeInstanceReference.ref=current}
		public Action getNodeInstanceReferenceRefAction_1_0() { return cNodeInstanceReferenceRefAction_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1_1() { return cFullStopKeyword_1_1; }
		
		//tail=[Feature]
		public Assignment getTailAssignment_1_2() { return cTailAssignment_1_2; }
		
		//[Feature]
		public CrossReference getTailFeatureCrossReference_1_2_0() { return cTailFeatureCrossReference_1_2_0; }
		
		//ID
		public RuleCall getTailFeatureIDTerminalRuleCall_1_2_0_1() { return cTailFeatureIDTerminalRuleCall_1_2_0_1; }
	}
	public class SystemReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.SystemReference");
		private final Assignment cSystemAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cSystemSystemInstanceCrossReference_0 = (CrossReference)cSystemAssignment.eContents().get(0);
		private final RuleCall cSystemSystemInstanceIDTerminalRuleCall_0_1 = (RuleCall)cSystemSystemInstanceCrossReference_0.eContents().get(1);
		
		//SystemReference: system=[SystemInstance];
		@Override public ParserRule getRule() { return rule; }
		
		//system=[SystemInstance]
		public Assignment getSystemAssignment() { return cSystemAssignment; }
		
		//[SystemInstance]
		public CrossReference getSystemSystemInstanceCrossReference_0() { return cSystemSystemInstanceCrossReference_0; }
		
		//ID
		public RuleCall getSystemSystemInstanceIDTerminalRuleCall_0_1() { return cSystemSystemInstanceIDTerminalRuleCall_0_1; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Feature");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSystemInstanceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNodeInstanceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Feature:
		//    SystemInstance | NodeInstance
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//SystemInstance | NodeInstance
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SystemInstance
		public RuleCall getSystemInstanceParserRuleCall_0() { return cSystemInstanceParserRuleCall_0; }
		
		//NodeInstance
		public RuleCall getNodeInstanceParserRuleCall_1() { return cNodeInstanceParserRuleCall_1; }
	}
	public class DeploymentStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.DeploymentStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeploysKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNodesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNodesNodeInstanceReferenceParserRuleCall_1_0 = (RuleCall)cNodesAssignment_1.eContents().get(0);
		private final Keyword cOnKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPlatformAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cPlatformPlatformInstanceCrossReference_3_0 = (CrossReference)cPlatformAssignment_3.eContents().get(0);
		private final RuleCall cPlatformPlatformInstanceIDTerminalRuleCall_3_0_1 = (RuleCall)cPlatformPlatformInstanceCrossReference_3_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DeploymentStatement:
		//    'deploys' nodes=NodeInstanceReference 'on' platform=[PlatformInstance] ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'deploys' nodes=NodeInstanceReference 'on' platform=[PlatformInstance] ';'
		public Group getGroup() { return cGroup; }
		
		//'deploys'
		public Keyword getDeploysKeyword_0() { return cDeploysKeyword_0; }
		
		//nodes=NodeInstanceReference
		public Assignment getNodesAssignment_1() { return cNodesAssignment_1; }
		
		//NodeInstanceReference
		public RuleCall getNodesNodeInstanceReferenceParserRuleCall_1_0() { return cNodesNodeInstanceReferenceParserRuleCall_1_0; }
		
		//'on'
		public Keyword getOnKeyword_2() { return cOnKeyword_2; }
		
		//platform=[PlatformInstance]
		public Assignment getPlatformAssignment_3() { return cPlatformAssignment_3; }
		
		//[PlatformInstance]
		public CrossReference getPlatformPlatformInstanceCrossReference_3_0() { return cPlatformPlatformInstanceCrossReference_3_0; }
		
		//ID
		public RuleCall getPlatformPlatformInstanceIDTerminalRuleCall_3_0_1() { return cPlatformPlatformInstanceIDTerminalRuleCall_3_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class DeploymentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Deployment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDeploymentAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDeploymentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cPlatformKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPlatformsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cPlatformsPlatformInstanceParserRuleCall_3_1_0 = (RuleCall)cPlatformsAssignment_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cSystemKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cSystemsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cSystemsSystemInstanceParserRuleCall_4_1_0 = (RuleCall)cSystemsAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Assignment cDeploymentsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDeploymentsDeploymentStatementParserRuleCall_5_0 = (RuleCall)cDeploymentsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Deployment: {Deployment} 'deployment' '{'
		//        ('platform' platforms+=PlatformInstance ';')*
		//        ('system' systems+=SystemInstance ';')*
		//        (deployments+=DeploymentStatement)*
		//    '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Deployment} 'deployment' '{'
		//       ('platform' platforms+=PlatformInstance ';')*
		//       ('system' systems+=SystemInstance ';')*
		//       (deployments+=DeploymentStatement)*
		//   '}'
		public Group getGroup() { return cGroup; }
		
		//{Deployment}
		public Action getDeploymentAction_0() { return cDeploymentAction_0; }
		
		//'deployment'
		public Keyword getDeploymentKeyword_1() { return cDeploymentKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('platform' platforms+=PlatformInstance ';')*
		public Group getGroup_3() { return cGroup_3; }
		
		//'platform'
		public Keyword getPlatformKeyword_3_0() { return cPlatformKeyword_3_0; }
		
		//platforms+=PlatformInstance
		public Assignment getPlatformsAssignment_3_1() { return cPlatformsAssignment_3_1; }
		
		//PlatformInstance
		public RuleCall getPlatformsPlatformInstanceParserRuleCall_3_1_0() { return cPlatformsPlatformInstanceParserRuleCall_3_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_2() { return cSemicolonKeyword_3_2; }
		
		//('system' systems+=SystemInstance ';')*
		public Group getGroup_4() { return cGroup_4; }
		
		//'system'
		public Keyword getSystemKeyword_4_0() { return cSystemKeyword_4_0; }
		
		//systems+=SystemInstance
		public Assignment getSystemsAssignment_4_1() { return cSystemsAssignment_4_1; }
		
		//SystemInstance
		public RuleCall getSystemsSystemInstanceParserRuleCall_4_1_0() { return cSystemsSystemInstanceParserRuleCall_4_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_4_2() { return cSemicolonKeyword_4_2; }
		
		//(deployments+=DeploymentStatement)*
		public Assignment getDeploymentsAssignment_5() { return cDeploymentsAssignment_5; }
		
		//DeploymentStatement
		public RuleCall getDeploymentsDeploymentStatementParserRuleCall_5_0() { return cDeploymentsDeploymentStatementParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class PlatformInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.PlatformInstance");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//PlatformInstance: name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final NodeDefinitionElements pNodeDefinition;
	private final NodeInstanceElements pNodeInstance;
	private final SystemDefinitionElements pSystemDefinition;
	private final SystemInstanceElements pSystemInstance;
	private final NodeInstanceReferenceElements pNodeInstanceReference;
	private final SystemReferenceElements pSystemReference;
	private final FeatureElements pFeature;
	private final DeploymentStatementElements pDeploymentStatement;
	private final DeploymentElements pDeployment;
	private final PlatformInstanceElements pPlatformInstance;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pNodeDefinition = new NodeDefinitionElements();
		this.pNodeInstance = new NodeInstanceElements();
		this.pSystemDefinition = new SystemDefinitionElements();
		this.pSystemInstance = new SystemInstanceElements();
		this.pNodeInstanceReference = new NodeInstanceReferenceElements();
		this.pSystemReference = new SystemReferenceElements();
		this.pFeature = new FeatureElements();
		this.pDeploymentStatement = new DeploymentStatementElements();
		this.pDeployment = new DeploymentElements();
		this.pPlatformInstance = new PlatformInstanceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    (nodes+=NodeDefinition
	//    | systems+=SystemDefinition
	//    | deployments+=Deployment)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//NodeDefinition: 'node' name=ID ';';
	public NodeDefinitionElements getNodeDefinitionAccess() {
		return pNodeDefinition;
	}
	
	public ParserRule getNodeDefinitionRule() {
		return getNodeDefinitionAccess().getRule();
	}
	
	//NodeInstance: type=[NodeDefinition] name=ID;
	public NodeInstanceElements getNodeInstanceAccess() {
		return pNodeInstance;
	}
	
	public ParserRule getNodeInstanceRule() {
		return getNodeInstanceAccess().getRule();
	}
	
	//SystemDefinition:
	//    'system' name=ID '{'(
	//            'nodes' ':' (nodes+=NodeInstance ';')*
	//        | 'subsystems' ':' (subsystems+=SystemInstance ';')*
	//        )*
	//    '}'
	//;
	public SystemDefinitionElements getSystemDefinitionAccess() {
		return pSystemDefinition;
	}
	
	public ParserRule getSystemDefinitionRule() {
		return getSystemDefinitionAccess().getRule();
	}
	
	//SystemInstance: type=[SystemDefinition] name=ID;
	public SystemInstanceElements getSystemInstanceAccess() {
		return pSystemInstance;
	}
	
	public ParserRule getSystemInstanceRule() {
		return getSystemInstanceAccess().getRule();
	}
	
	//// Right recursive
	////SystemReference: system=[SystemInstance] ('.' subsystem=SystemReference)?;
	//NodeInstanceReference:
	//    SystemReference ({NodeInstanceReference.ref=current} '.' tail=[Feature])*
	//;
	public NodeInstanceReferenceElements getNodeInstanceReferenceAccess() {
		return pNodeInstanceReference;
	}
	
	public ParserRule getNodeInstanceReferenceRule() {
		return getNodeInstanceReferenceAccess().getRule();
	}
	
	//SystemReference: system=[SystemInstance];
	public SystemReferenceElements getSystemReferenceAccess() {
		return pSystemReference;
	}
	
	public ParserRule getSystemReferenceRule() {
		return getSystemReferenceAccess().getRule();
	}
	
	//Feature:
	//    SystemInstance | NodeInstance
	//;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//DeploymentStatement:
	//    'deploys' nodes=NodeInstanceReference 'on' platform=[PlatformInstance] ';'
	//;
	public DeploymentStatementElements getDeploymentStatementAccess() {
		return pDeploymentStatement;
	}
	
	public ParserRule getDeploymentStatementRule() {
		return getDeploymentStatementAccess().getRule();
	}
	
	//Deployment: {Deployment} 'deployment' '{'
	//        ('platform' platforms+=PlatformInstance ';')*
	//        ('system' systems+=SystemInstance ';')*
	//        (deployments+=DeploymentStatement)*
	//    '}'
	//;
	public DeploymentElements getDeploymentAccess() {
		return pDeployment;
	}
	
	public ParserRule getDeploymentRule() {
		return getDeploymentAccess().getRule();
	}
	
	//PlatformInstance: name=ID;
	public PlatformInstanceElements getPlatformInstanceAccess() {
		return pPlatformInstance;
	}
	
	public ParserRule getPlatformInstanceRule() {
		return getPlatformInstanceAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
