package fr.enseeiht.ocl.xtext.ocl.adapter.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.ocl.operation.OclOperationFactory;
import fr.enseeiht.ocl.xtext.ocl.operation.OperationResolutionUtils;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.ContextlessCallExp;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.OclType;
/**
 * OCLAdapter for ContextlessCallExp
 * @generated
 */
public final class ContextlessCallExpValidationAdapter implements OCLAdapter {

  private ContextlessCallExp target;

  /**
   * @generated
   */
  public ContextlessCallExpValidationAdapter(ContextlessCallExp object) {
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
    // Obtain all contextless call elements
	// Typage des arguments
	List<OclType> paramTypes = new ArrayList<OclType>();
	for (OclExpression param : this.target.getArguments()) {
		paramTypes.add(OCLValidationAdapterFactory.INSTANCE.createAdapter(param).getType());
	}
	// Méthodes utilisateur
	List<OclFeatureDefinitionValidationAdapter> defs = ((ModuleValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.eResource().getContents().get(0))).getDefinitions(this.target.getOperationName(), true);
	if (!defs.isEmpty()) {
		for (OclFeatureDefinitionValidationAdapter op: defs) {
			// Type check the call!
			if (OperationResolutionUtils.isCorrectImplementation(null, op.getSourceType(), paramTypes, op.getArgsType(), this.target.getOperationName(), op.getName())) {
				return op.getType();
			}
		}
	}
	// Méthodes système
	List<IOclOperation> operations = OclOperationFactory.getOperations(this.target.getOperationName());
	if (operations != null) {
		for (IOclOperation operation : operations) {
			// Type check the call!
			if (OperationResolutionUtils.isCorrectImplementation(null, operation.getSourceType(), paramTypes, operation.getArgsType(), this.target.getOperationName(), operation.getName())) {
				return operation.getReturnType(null, paramTypes);
			}
		}
		// No correct operation was found
		List<String> messageStr = new LinkedList<String>(); 
		for (OclType typ : paramTypes) {
			messageStr.add(typ.toString());
		}
		return new OclInvalid(target, "The operation '" + this.target.getOperationName() + "' cannot be called with arguments of types: " + String.join(", ", messageStr) + ".");
	} else {
		return new OclInvalid(target, "No such operation '" + this.target.getOperationName() + "' exists..");
	}
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