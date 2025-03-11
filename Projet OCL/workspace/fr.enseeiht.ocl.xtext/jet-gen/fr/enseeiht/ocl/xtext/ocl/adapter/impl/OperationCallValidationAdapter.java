package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.ocl.operation.OclOperationEnum;
import fr.enseeiht.ocl.xtext.ocl.operation.OperationResolutionUtils;
import fr.enseeiht.ocl.xtext.scoping.Scoper;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.validation.InvalidTypeOperation;
import fr.enseeiht.ocl.xtext.validation.OperationNotFoundError;
import fr.enseeiht.ocl.xtext.validation.WrongNavigationOperatorError;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndeclaredOperationInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccessInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.ocl.OclFeatureDefinition;
import fr.enseeiht.ocl.xtext.ocl.Operation;
import fr.enseeiht.ocl.xtext.ocl.OperationCall;
import fr.enseeiht.ocl.xtext.ocl.Parameter;
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
	 * 
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
			source = (OCLAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(container.getCalls().get(pos - 1));
		}
		Object sourceValue = source.getValue(contextTarget);
		if (sourceValue instanceof Invalid) {
			return sourceValue;
		}
		if (sourceValue != null) {
			// Get args Type
			List<OclType> paramTypes = new ArrayList<OclType>();
			for (OclExpression param : this.target.getArguments()) {
				paramTypes.add(OCLValidationAdapterFactory.INSTANCE.createAdapter(param).getType());
			}
			
			OclType sourceType = source.getType(); 
			
			// Récupération des méthodes définies par l'utilisateur
			List<OclFeatureDefinition> defs = ((ModuleValidationAdapter) OCLValidationAdapterFactory.INSTANCE
					.createAdapter(this.target.eResource().getContents().get(0))).getAllDefinition();
			
			for (OclFeatureDefinition def : defs) {
				if (def.getFeature() instanceof Operation) {
					Operation op = (Operation) def.getFeature();
					OclFeatureDefinitionValidationAdapter opAdapter = ((OclFeatureDefinitionValidationAdapter) OCLValidationAdapterFactory.INSTANCE
							.createAdapter(def));
					
					if (OperationResolutionUtils.isCorrectImplementation(sourceType, opAdapter.getSourceType(), paramTypes, opAdapter.getArgsType(), this.target.getOperationName(), op.getName())) {
						
						// Get Values of each parameter
						for (int i = 0; i < op.getParameters().size(); i++) {
							OCLAdapter paramAdapter = OCLValidationAdapterFactory.INSTANCE
									.createAdapter(this.target.getArguments().get(i));
							
							Scoper.add(op.getParameters().get(i), paramAdapter.getValue(contextTarget));

						}

						// Compute return value
						Object returnValue = OCLValidationAdapterFactory.INSTANCE.createAdapter(op.getBody())
								.getValue(contextTarget);

						// Remove parameter from scope
						for (Parameter param : op.getParameters()) {
							Scoper.remove(param);
						}
						return returnValue;
					}
				}
			}
			
			// Récupération des méthodes système
			List<IOclOperation> operations = null;
			try {
				operations = OclOperationEnum.getOperations(this.target.getOperationName());
			} catch (IllegalArgumentException e) {
				return new UnsupportedFeatureException(this.target.getOperationName());
			}


			// Compute args value
			List<Object> args = new ArrayList<Object>();
			for (EObject arg : this.target.getArguments()) {
				OCLAdapter argAdapter = OCLValidationAdapterFactory.INSTANCE.createAdapter(arg);
				args.add(argAdapter.getValue(contextTarget));
			}

			if (operations != null) {
				for (IOclOperation operation : operations) {
					if (OperationResolutionUtils.isCorrectImplementation(sourceType, operation.getSourceType(),
							paramTypes, operation.getArgsType(sourceType, paramTypes), this.target.getOperationName(), operation.getName())) {
						return operation.getReturnValue(sourceValue, args, contextTarget);
					}
				}
			}

			return new UndeclaredOperationInvalid(this.target.getOperationName(), paramTypes);
		} else {
			return new UndefinedAccessInvalid(source.getElement());
		}

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
	if (sourceType.conformsTo(new OclCollection(new OclAny())) && this.target.getNavOperator().equals(".")) {
		return new OclInvalid(new WrongNavigationOperatorError(this.target,this.target.getNavOperator()));
	}
	if (!sourceType.conformsTo(new OclCollection(new OclAny())) && this.target.getNavOperator().equals("->")) {
		return new OclInvalid(new WrongNavigationOperatorError(this.target, this.target.getNavOperator()));
	}
	
	if (!sourceType.conformsTo(new OclInvalid())) {
		
		List<OclType> paramTypes = new ArrayList<OclType>();
		for (OclExpression param : this.target.getArguments()) {
			paramTypes.add(OCLValidationAdapterFactory.INSTANCE.createAdapter(param).getType());
		}
		// Méthodes utilisateur
		List<OclFeatureDefinitionValidationAdapter> defs = ((ModuleValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.eResource().getContents().get(0))).getDefinitions(this.target.getOperationName(), true);
		if (!defs.isEmpty()) {
			for (OclFeatureDefinitionValidationAdapter op: defs) {
				// Type check the call!
				if (OperationResolutionUtils.isCorrectImplementation(sourceType, op.getSourceType(), paramTypes, op.getArgsType(), this.target.getOperationName(), op.getName())) {
					return op.getType();
				}
			}
		}
		// Méthodes système
		List<IOclOperation> operations = null;
		try { 
			operations = OclOperationEnum.getOperations(this.target.getOperationName());
		} catch (IllegalArgumentException e) {
			return new OclInvalid(new OperationNotFoundError(this.target, this.target.getOperationName()));
		}
		if (operations != null) {
			for (IOclOperation operation : operations) {
				// Type check the call!
				if (OperationResolutionUtils.isCorrectImplementation(sourceType, operation.getSourceType(), paramTypes, operation.getArgsType(sourceType, paramTypes), this.target.getOperationName(), operation.getName())) {
					return operation.getReturnType(sourceType, paramTypes);
				}
			}
			// No correct operation was found
			return new OclInvalid(new InvalidTypeOperation(target, this.target.getOperationName(), paramTypes));
		} else {
			return new OclInvalid(new OperationNotFoundError(target, target.getOperationName()));
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