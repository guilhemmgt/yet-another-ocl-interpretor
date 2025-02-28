package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.OclContextBlock;
import fr.enseeiht.ocl.xtext.ocl.SelfLiteralExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for SelfLiteralExp
 * @generated
 */
public final class SelfLiteralExpValidationAdapter implements OCLAdapter {

  private SelfLiteralExp target;

  /**
   * @generated
   */
  public SelfLiteralExpValidationAdapter(SelfLiteralExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  return contextTarget;
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  // Climb back up the ETree until we find the context
	  EObject tempTarget = target;
	  while (!(tempTarget instanceof OclContextBlock)) {
		  tempTarget = tempTarget.eContainer();
	  }
	  return OCLValidationAdapterFactory.INSTANCE.createAdapter(tempTarget).getType();
  }

  /**
   * Get adapted element
   * @return adapted element
   * @generated
   */
  public EObject getElement() {
    return this.target;
  }
 }