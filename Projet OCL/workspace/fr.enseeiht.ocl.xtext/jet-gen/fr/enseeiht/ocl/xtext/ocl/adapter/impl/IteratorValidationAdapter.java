package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.Iterator;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for Iterator
 * @generated
 */
public final class IteratorValidationAdapter implements OCLAdapter {

  private Iterator target;

  /**
   * @generated
   */
  public IteratorValidationAdapter(Iterator object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated
   */
  public Object getValue(EObject contextTarget) {
    throw new UnimplementedException(this.getClass(),"getValue");
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated
   */
  public OclType getType() {
    throw new UnimplementedException(this.getClass(),"getType");
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
	   String res = this.target.getName();
	   if (this.target.getType() != null)
		   res += ":" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getType());
	   return res;
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