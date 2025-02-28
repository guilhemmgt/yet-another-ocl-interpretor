package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.OclContextBlock;
import fr.enseeiht.ocl.xtext.ocl.Operation;
import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.Parameter;

/**
 * OCLAdapter for Operation
 * @generated
 */
public final class OperationValidationAdapter implements OCLAdapter {

  private Operation target;

  /**
   * @generated
   */
  public OperationValidationAdapter(Operation object) {
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
		OclType type = OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getBody()).getType();
		OclClassifier returntype = (OclClassifier) OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getReturnType()).getType();
		// L'expression dans l'invariant doit nécessairement avoir le bon type de retour
		boolean isCorrect = type.conformsTo(returntype.getRepresentedType());
		boolean isInvalid = type.conformsTo(new OclInvalid());
		for (Parameter param : target.getParameters()) {
			OclClassifier paramType = (OclClassifier) OCLValidationAdapterFactory.INSTANCE.createAdapter(param).getType();
			isInvalid = isInvalid || paramType.getRepresentedType() instanceof OclInvalid;
		}
		if (!isCorrect && !isInvalid) {
			String message = "Feature definition type mismatch : expected "+ returntype.getRepresentedType() + ", got " + type;
			return new OclInvalid(target, message);
		}
		else if (isInvalid) {
			return new OclInvalid(type);
		}
		else {
			return returntype.getRepresentedType();
		}
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = this.target.getName() + "(";
		EList<Parameter> params = this.target.getParameters();
		for (int i = 0; i < params.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(params.get(i)) + (i==params.size()-1 ? "" : ",");
		}
		res += "):" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getReturnType()) + "=" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getBody());
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
           public OclType getSourceType() {
	  if (this.target.eContainer() instanceof OclContextBlock) {
		  // TODO : Adapt this with answer from Paul
		  return /*((OclContextBlock)this.target.eContainer()).getClass_()*/ new OclAny();
	  }
	  return null;
		  

		// Récupération de l'expression dans la def
  }
  
  public List<OclType> getArgumentsType() {
	  List<OclType> result = new ArrayList<OclType>();
	  for (Parameter param : this.target.getParameters()) {
		  OclTypeLiteralValidationAdapter paramTypeAdapter = ((OclTypeLiteralValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(param.getType()));
		  result.add(paramTypeAdapter.getOclType());
	  }
	  return null;
  }
 }