/**
 *
 * $Id$
 */
package fr.inria.diverse.pdedependencies2dot.model.validation;

import fr.inria.diverse.pdedependencies2dot.model.Feature;
import fr.inria.diverse.pdedependencies2dot.model.Product;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.inria.diverse.pdedependencies2dot.model.PDEGraph}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PDEGraphValidator {
	boolean validate();

	boolean validateFeatures(EList<Feature> value);
	boolean validateProducts(EList<Product> value);
	boolean validateBundleSymbolicName(String value);
}
