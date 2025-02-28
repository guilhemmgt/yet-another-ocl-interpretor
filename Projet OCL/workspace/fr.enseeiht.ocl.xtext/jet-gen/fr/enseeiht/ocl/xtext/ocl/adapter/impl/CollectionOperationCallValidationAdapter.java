package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.CollectionOperationCall;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for CollectionOperationCall
 * @generated
 */
public final class CollectionOperationCallValidationAdapter implements OCLAdapter {

  private CollectionOperationCall target;

  /**
   * @generated
   */
  public CollectionOperationCallValidationAdapter(CollectionOperationCall object) {
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
		String res = "->" + this.target.getOperationName() + "(";
		EList<OclExpression> args = this.target.getArguments();
		for (int i = 0; i < args.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(args.get(i)) + (i==args.size()-1 ? "" : ",");
		}
		res += ")";
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