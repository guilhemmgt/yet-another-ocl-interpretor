package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.ocl.operation.OclOperationFactory;
import fr.enseeiht.ocl.xtext.ocl.operation.OperationResolutionUtils;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccessInvalid;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.ocl.OclFeatureDefinition;
import fr.enseeiht.ocl.xtext.ocl.OperationCall;
import fr.enseeiht.ocl.xtext.ocl.PropertyCallExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for OperationCall
 * @generated
 */
public final class OperationCallValidationAdapter implements OCLAdapter {

  private OperationCall target;

  /**
   * @generated
   */
  public OperationCallValidationAdapter(OperationCall object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  PropertyCallExp container = (PropertyCallExp) this.target.eContainer();
		int pos = container.getCalls().indexOf(this.target);
		OCLAdapter source;
		// Get value from the rest of the navigation
		if (pos == 0) {
			// root call
			source = (OCLAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(container.getSource());
		} else {
			source = (OCLAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(container.getCalls().get(pos-1));
		}
		Object sourceValue = source.getValue(contextTarget);
		if (sourceValue != null) {
			// Récupération des méthodes définies par l'utilisateur
			// TODO : FAIRE
//			List<OclFeatureDefinition> defs = ((ModuleValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.eResource().getContents().get(0))).getAllDefinition();
//			for (OclFeatureDefinition def : defs) {
//				if (def.getFeature() instanceof Operation) {
//					Operation op = (Operation) def.getFeature();
//					OperationValidationAdapter opAdapter = ((OperationValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(op));
//					List<OclType> paramTypes = new ArrayList<OclType>();
//					for (OclExpression param : this.target.getArguments()) {
//						paramTypes.add(OCLValidationAdapterFactory.INSTANCE.createAdapter(param).getType());
//					}
//					if (OperationResolutionUtils.isCorrectImplementation(source.getType(), opAdapter.getSourceType(), paramTypes, opAdapter.getArgumentsType(), null, null)) {
//						System.out.println("Feur");
//					}
//				}
//			}
			// Récupération des méthodes système
			List<IOclOperation> operations = OclOperationFactory.getOperations(this.target.getOperationName());
			List<OclType> paramTypes = new ArrayList<OclType>();
			for (OclExpression param : this.target.getArguments()) {
				paramTypes.add(OCLValidationAdapterFactory.INSTANCE.createAdapter(param).getType());
			}
			if (operations != null ) {
				for (IOclOperation operation : operations) {
					if (true && OperationResolutionUtils.isCorrectImplementation(source.getType(), operation.getSourceType(), paramTypes, operation.getArgsType(), this.target.getOperationName(), operation.getName()) ) {
						// Compute args value 
						List<Object> args = new ArrayList<Object>();
						for (EObject arg : this.target.getArguments()) {
							OCLAdapter argAdapter = OCLValidationAdapterFactory.INSTANCE.createAdapter(arg);
							args.add(argAdapter.getValue(contextTarget));
						}
						return operation.getReturnValue(sourceValue, args);					
					}
				}
			}
		} else {
			return new UndefinedAccessInvalid(source.getElement());
		}
		return null;
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	PropertyCallExp container = (PropertyCallExp) this.target.eContainer();
	int pos = container.getCalls().indexOf(this.target);
	OCLAdapter source;
	// Get value from the rest of the navigation
	if (pos == 0) {
		// root call
		source = (OCLAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(container.getSource());
	} else {
		source = (OCLAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(container.getCalls().get(pos-1));
	}
	OclType sourceType = source.getType();
	if (!sourceType.conformsTo(new OclInvalid())) {
		// Typage des arguments
		List<OclType> paramTypes = new ArrayList<OclType>();
		for (OclExpression param : this.target.getArguments()) {
			paramTypes.add(OCLValidationAdapterFactory.INSTANCE.createAdapter(param).getType());
		}
		// Méthodes utilisateur
		List<OclFeatureDefinitionValidationAdapter> defs = ((ModuleValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.eResource().getContents().get(0))).getDefinitions(this.target.getOperationName(), true);
		if (!defs.isEmpty()) {
			for (OclFeatureDefinitionValidationAdapter op: defs) {
				System.out.println(op);
				// Type check the call!
				if (OperationResolutionUtils.isCorrectImplementation(sourceType, op.getSourceType(), paramTypes, op.getArgsType(), this.target.getOperationName(), op.getName())) {
					return op.getType();
				}
			}
		}
		// Méthodes système
		List<IOclOperation> operations = OclOperationFactory.getOperations(this.target.getOperationName());
		if (operations != null) {
			for (IOclOperation operation : operations) {
				// Type check the call!
				if (OperationResolutionUtils.isCorrectImplementation(sourceType, operation.getSourceType(), paramTypes, operation.getArgsType(), this.target.getOperationName(), operation.getName())) {
					return operation.getReturnType(sourceType, paramTypes);
				}
			}
			// No correct operation was found
			List<String> messageStr = new LinkedList<String>(); 
			for (OclType typ : paramTypes) {
				messageStr.add(typ.toString());
			}
			return new OclInvalid(target, "The operation '" + this.target.getOperationName() + "' cannot be called with arguments of types: " + String.join(", ", messageStr) + ".");
		} else {
			return new OclInvalid(target, "No such operation '" + this.target.getOperationName() + "' exists.");
		}
	} else {
		return sourceType;
	}
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = "." + this.target.getOperationName() + "(";
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