package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclEClass;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.OclContextBlock;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for OclContextBlock
 * @generated
 */
public final class OclContextBlockValidationAdapter implements OCLAdapter {

  private OclContextBlock target;

  /**
   * @generated
   */
  public OclContextBlockValidationAdapter(OclContextBlock object) {
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
   * @generated NOT
   */
  public OclType getType() {
	return new OclEClass(target.getClass_());
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = "context " + this.target.getEcoreTypes().getName() + "!" + this.target.getClass_().getName() + "\n";
		EList<EObject> members = this.target.getMembers();
		for (int i = 0; i < members.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(members.get(i)) + "\n";
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
   * @generated NOT
   */
   @Override
  public String getOutlineString() {
    return this.target.getClass_().getName();
  }
 }