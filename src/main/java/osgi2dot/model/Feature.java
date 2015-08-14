/**
 */
package osgi2dot.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link osgi2dot.model.Feature#getRequiredFeatures <em>Required Features</em>}</li>
 *   <li>{@link osgi2dot.model.Feature#getContainingGraph <em>Containing Graph</em>}</li>
 *   <li>{@link osgi2dot.model.Feature#getAdditionnalPlugins <em>Additionnal Plugins</em>}</li>
 * </ul>
 * </p>
 *
 * @see osgi2dot.model.ModelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends PluginContainer {
	/**
	 * Returns the value of the '<em><b>Required Features</b></em>' reference list.
	 * The list contents are of type {@link osgi2dot.model.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Features</em>' reference list.
	 * @see osgi2dot.model.ModelPackage#getFeature_RequiredFeatures()
	 * @model
	 * @generated
	 */
	EList<Feature> getRequiredFeatures();

	/**
	 * Returns the value of the '<em><b>Containing Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link osgi2dot.model.PDEGraph#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Graph</em>' container reference.
	 * @see #setContainingGraph(PDEGraph)
	 * @see osgi2dot.model.ModelPackage#getFeature_ContainingGraph()
	 * @see osgi2dot.model.PDEGraph#getFeatures
	 * @model opposite="features" transient="false"
	 * @generated
	 */
	PDEGraph getContainingGraph();

	/**
	 * Sets the value of the '{@link osgi2dot.model.Feature#getContainingGraph <em>Containing Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Graph</em>' container reference.
	 * @see #getContainingGraph()
	 * @generated
	 */
	void setContainingGraph(PDEGraph value);

	/**
	 * Returns the value of the '<em><b>Additionnal Plugins</b></em>' reference list.
	 * The list contents are of type {@link osgi2dot.model.Plugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionnal Plugins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionnal Plugins</em>' reference list.
	 * @see osgi2dot.model.ModelPackage#getFeature_AdditionnalPlugins()
	 * @model
	 * @generated
	 */
	EList<Plugin> getAdditionnalPlugins();

} // Feature
