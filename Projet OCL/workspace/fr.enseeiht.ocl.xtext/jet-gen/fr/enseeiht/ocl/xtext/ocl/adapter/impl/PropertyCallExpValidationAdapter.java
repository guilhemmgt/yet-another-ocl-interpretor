package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.PropertyCall;
import fr.enseeiht.ocl.xtext.ocl.PropertyCallExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for PropertyCallExp
 * @generated
 */
public final class PropertyCallExpValidationAdapter implements OCLAdapter {

  private PropertyCallExp target;

  /**
   * @generated
   */
  public PropertyCallExpValidationAdapter(PropertyCallExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  if (this.target.getCalls().isEmpty()) {
		  return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getSource()).getValue(contextTarget);
	  }
	  return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getCalls().get(this.target.getCalls().size()-1)).getValue(contextTarget);
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  // On renvoie lui meme
	  if (this.target.getCalls().isEmpty()) {
		  return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getSource()).getType();
	  }
	  // On renvoie le dernier call
	  return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getCalls().get(this.target.getCalls().size()-1)).getType();
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getSource()).toString();
		EList<PropertyCall> calls = this.target.getCalls();
		for (int i = 0; i < calls.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(calls.get(i)).toString();
		}
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

  /**
   * Return the string visible in the outline
   * @return outline name
   * @generated
   */
   @Override
  public String getOutlineString() {
    return null;
  }
 }