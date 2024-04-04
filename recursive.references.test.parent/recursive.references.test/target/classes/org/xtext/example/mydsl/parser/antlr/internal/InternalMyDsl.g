/*
 * generated by Xtext 2.26.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getNodesNodeDefinitionParserRuleCall_0_0());
				}
				lv_nodes_0_0=ruleNodeDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"nodes",
						lv_nodes_0_0,
						"org.xtext.example.mydsl.MyDsl.NodeDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getSystemsSystemDefinitionParserRuleCall_1_0());
				}
				lv_systems_1_0=ruleSystemDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"systems",
						lv_systems_1_0,
						"org.xtext.example.mydsl.MyDsl.SystemDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getDeploymentsDeploymentParserRuleCall_2_0());
				}
				lv_deployments_2_0=ruleDeployment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"deployments",
						lv_deployments_2_0,
						"org.xtext.example.mydsl.MyDsl.Deployment");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)*
;

// Entry rule entryRuleNodeDefinition
entryRuleNodeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeDefinitionRule()); }
	iv_ruleNodeDefinition=ruleNodeDefinition
	{ $current=$iv_ruleNodeDefinition.current; }
	EOF;

// Rule NodeDefinition
ruleNodeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='node'
		{
			newLeafNode(otherlv_0, grammarAccess.getNodeDefinitionAccess().getNodeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNodeDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNodeDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getNodeDefinitionAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleNodeInstance
entryRuleNodeInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeInstanceRule()); }
	iv_ruleNodeInstance=ruleNodeInstance
	{ $current=$iv_ruleNodeInstance.current; }
	EOF;

// Rule NodeInstance
ruleNodeInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNodeInstanceRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getNodeInstanceAccess().getTypeNodeDefinitionCrossReference_0_0());
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNodeInstanceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNodeInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSystemDefinition
entryRuleSystemDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemDefinitionRule()); }
	iv_ruleSystemDefinition=ruleSystemDefinition
	{ $current=$iv_ruleSystemDefinition.current; }
	EOF;

// Rule SystemDefinition
ruleSystemDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='system'
		{
			newLeafNode(otherlv_0, grammarAccess.getSystemDefinitionAccess().getSystemKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSystemDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSystemDefinitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				otherlv_3='nodes'
				{
					newLeafNode(otherlv_3, grammarAccess.getSystemDefinitionAccess().getNodesKeyword_3_0_0());
				}
				otherlv_4=':'
				{
					newLeafNode(otherlv_4, grammarAccess.getSystemDefinitionAccess().getColonKeyword_3_0_1());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getSystemDefinitionAccess().getNodesNodeInstanceParserRuleCall_3_0_2_0_0());
							}
							lv_nodes_5_0=ruleNodeInstance
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSystemDefinitionRule());
								}
								add(
									$current,
									"nodes",
									lv_nodes_5_0,
									"org.xtext.example.mydsl.MyDsl.NodeInstance");
								afterParserOrEnumRuleCall();
							}
						)
					)
					otherlv_6=';'
					{
						newLeafNode(otherlv_6, grammarAccess.getSystemDefinitionAccess().getSemicolonKeyword_3_0_2_1());
					}
				)*
			)
			    |
			(
				otherlv_7='subsystems'
				{
					newLeafNode(otherlv_7, grammarAccess.getSystemDefinitionAccess().getSubsystemsKeyword_3_1_0());
				}
				otherlv_8=':'
				{
					newLeafNode(otherlv_8, grammarAccess.getSystemDefinitionAccess().getColonKeyword_3_1_1());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getSystemDefinitionAccess().getSubsystemsSystemInstanceParserRuleCall_3_1_2_0_0());
							}
							lv_subsystems_9_0=ruleSystemInstance
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSystemDefinitionRule());
								}
								add(
									$current,
									"subsystems",
									lv_subsystems_9_0,
									"org.xtext.example.mydsl.MyDsl.SystemInstance");
								afterParserOrEnumRuleCall();
							}
						)
					)
					otherlv_10=';'
					{
						newLeafNode(otherlv_10, grammarAccess.getSystemDefinitionAccess().getSemicolonKeyword_3_1_2_1());
					}
				)*
			)
		)*
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getSystemDefinitionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleSystemInstance
entryRuleSystemInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemInstanceRule()); }
	iv_ruleSystemInstance=ruleSystemInstance
	{ $current=$iv_ruleSystemInstance.current; }
	EOF;

// Rule SystemInstance
ruleSystemInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemInstanceRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getSystemInstanceAccess().getTypeSystemDefinitionCrossReference_0_0());
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSystemInstanceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleNodeInstanceReference
entryRuleNodeInstanceReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeInstanceReferenceRule()); }
	iv_ruleNodeInstanceReference=ruleNodeInstanceReference
	{ $current=$iv_ruleNodeInstanceReference.current; }
	EOF;

// Rule NodeInstanceReference
ruleNodeInstanceReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNodeInstanceReferenceAccess().getSystemReferenceParserRuleCall_0());
		}
		this_SystemReference_0=ruleSystemReference
		{
			$current = $this_SystemReference_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getNodeInstanceReferenceAccess().getNodeInstanceReferenceRefAction_1_0(),
						$current);
				}
			)
			otherlv_2='.'
			{
				newLeafNode(otherlv_2, grammarAccess.getNodeInstanceReferenceAccess().getFullStopKeyword_1_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNodeInstanceReferenceRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getNodeInstanceReferenceAccess().getTailFeatureCrossReference_1_2_0());
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSystemReference
entryRuleSystemReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemReferenceRule()); }
	iv_ruleSystemReference=ruleSystemReference
	{ $current=$iv_ruleSystemReference.current; }
	EOF;

// Rule SystemReference
ruleSystemReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSystemReferenceRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getSystemReferenceAccess().getSystemSystemInstanceCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleDeploymentStatement
entryRuleDeploymentStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeploymentStatementRule()); }
	iv_ruleDeploymentStatement=ruleDeploymentStatement
	{ $current=$iv_ruleDeploymentStatement.current; }
	EOF;

// Rule DeploymentStatement
ruleDeploymentStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='deploys'
		{
			newLeafNode(otherlv_0, grammarAccess.getDeploymentStatementAccess().getDeploysKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDeploymentStatementAccess().getNodesNodeInstanceReferenceParserRuleCall_1_0());
				}
				lv_nodes_1_0=ruleNodeInstanceReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeploymentStatementRule());
					}
					set(
						$current,
						"nodes",
						lv_nodes_1_0,
						"org.xtext.example.mydsl.MyDsl.NodeInstanceReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='on'
		{
			newLeafNode(otherlv_2, grammarAccess.getDeploymentStatementAccess().getOnKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeploymentStatementRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getDeploymentStatementAccess().getPlatformPlatformInstanceCrossReference_3_0());
				}
			)
		)
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getDeploymentStatementAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleDeployment
entryRuleDeployment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeploymentRule()); }
	iv_ruleDeployment=ruleDeployment
	{ $current=$iv_ruleDeployment.current; }
	EOF;

// Rule Deployment
ruleDeployment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDeploymentAccess().getDeploymentAction_0(),
					$current);
			}
		)
		otherlv_1='deployment'
		{
			newLeafNode(otherlv_1, grammarAccess.getDeploymentAccess().getDeploymentKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='platform'
			{
				newLeafNode(otherlv_3, grammarAccess.getDeploymentAccess().getPlatformKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDeploymentAccess().getPlatformsPlatformInstanceParserRuleCall_3_1_0());
					}
					lv_platforms_4_0=rulePlatformInstance
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDeploymentRule());
						}
						add(
							$current,
							"platforms",
							lv_platforms_4_0,
							"org.xtext.example.mydsl.MyDsl.PlatformInstance");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getDeploymentAccess().getSemicolonKeyword_3_2());
			}
		)*
		(
			otherlv_6='system'
			{
				newLeafNode(otherlv_6, grammarAccess.getDeploymentAccess().getSystemKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDeploymentAccess().getSystemsSystemInstanceParserRuleCall_4_1_0());
					}
					lv_systems_7_0=ruleSystemInstance
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDeploymentRule());
						}
						add(
							$current,
							"systems",
							lv_systems_7_0,
							"org.xtext.example.mydsl.MyDsl.SystemInstance");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_8=';'
			{
				newLeafNode(otherlv_8, grammarAccess.getDeploymentAccess().getSemicolonKeyword_4_2());
			}
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getDeploymentAccess().getDeploymentsDeploymentStatementParserRuleCall_5_0());
				}
				lv_deployments_9_0=ruleDeploymentStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeploymentRule());
					}
					add(
						$current,
						"deployments",
						lv_deployments_9_0,
						"org.xtext.example.mydsl.MyDsl.DeploymentStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRulePlatformInstance
entryRulePlatformInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlatformInstanceRule()); }
	iv_rulePlatformInstance=rulePlatformInstance
	{ $current=$iv_rulePlatformInstance.current; }
	EOF;

// Rule PlatformInstance
rulePlatformInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getPlatformInstanceAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getPlatformInstanceRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
