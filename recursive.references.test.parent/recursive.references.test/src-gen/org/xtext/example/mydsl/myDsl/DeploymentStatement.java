/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeploymentStatement#getSystem <em>System</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeploymentStatement#getNode <em>Node</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeploymentStatement#getPlatform <em>Platform</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeploymentStatement()
 * @model
 * @generated
 */
public interface DeploymentStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' containment reference.
   * @see #setSystem(SubSystemReference)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeploymentStatement_System()
   * @model containment="true"
   * @generated
   */
  SubSystemReference getSystem();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DeploymentStatement#getSystem <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' containment reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(SubSystemReference value);

  /**
   * Returns the value of the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' reference.
   * @see #setNode(NodeInstance)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeploymentStatement_Node()
   * @model
   * @generated
   */
  NodeInstance getNode();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DeploymentStatement#getNode <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' reference.
   * @see #getNode()
   * @generated
   */
  void setNode(NodeInstance value);

  /**
   * Returns the value of the '<em><b>Platform</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Platform</em>' reference.
   * @see #setPlatform(PlatformInstance)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeploymentStatement_Platform()
   * @model
   * @generated
   */
  PlatformInstance getPlatform();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DeploymentStatement#getPlatform <em>Platform</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Platform</em>' reference.
   * @see #getPlatform()
   * @generated
   */
  void setPlatform(PlatformInstance value);

} // DeploymentStatement
