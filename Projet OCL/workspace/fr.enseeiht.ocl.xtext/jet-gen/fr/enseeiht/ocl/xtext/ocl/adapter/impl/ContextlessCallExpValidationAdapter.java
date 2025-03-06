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
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.validation.InvalidTypeOperation;
import fr.enseeiht.ocl.xtext.validation.OperationNotFoundError;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndeclaredOperationInvalid;
import fr.enseeiht.ocl.xtext.ocl.ContextlessCallExp;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.ocl.OclFeatureDefinition;
import fr.enseeiht.ocl.xtext.ocl.Operation;
import fr.enseeiht.ocl.xtext.ocl.Parameter;
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
	 * 
	 * @param Target
	 * @return value of the element
	 * @generated
	 */
	public Object getValue(EObject contextTarget) {
		// Récupérer les types des arguments pour la résolution
		List<OclType> paramTypes = new ArrayList<OclType>();
		for (OclExpression param : this.target.getArguments()) {
			paramTypes.add(OCLValidationAdapterFactory.INSTANCE.createAdapter(param).getType());
		}

		// Récupérer toute les methodes définies localement de ce nom
		List<OclFeatureDefinitionValidationAdapter> defs = ((ModuleValidationAdapter) OCLValidationAdapterFactory.INSTANCE
				.createAdapter(this.target.eResource().getContents().get(0)))
				.getDefinitions(this.target.getOperationName(), true);

		if (!defs.isEmpty()) {
			for (OclFeatureDefinitionValidationAdapter op : defs) {
				// Résolution
				if (OperationResolutionUtils.isCorrectImplementation(null, op.getSourceType(), paramTypes,
						op.getArgsType(), this.target.getOperationName(), op.getName())) {
					Operation opDef = (Operation) ((OclFeatureDefinition) op.getElement()).getFeature();

					// Calculer les valeurs des arguments
					for (int i = 0; i < opDef.getParameters().size(); i++) {
						OCLAdapter argAdapter = OCLValidationAdapterFactory.INSTANCE
								.createAdapter(this.target.getArguments().get(i));
						Scoper.add(opDef.getParameters().get(i), argAdapter.getValue(contextTarget));
					}

					// Calculer la valeur de retiour
					Object returnValue = OCLValidationAdapterFactory.INSTANCE.createAdapter(opDef.getBody())
							.getValue(contextTarget);

					// Vider le scope
					for (Parameter param : opDef.getParameters())
						Scoper.remove(param);
					
					return returnValue;
				}
			}
		}
		return new UndeclaredOperationInvalid(this.target.getOperationName(), paramTypes);
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
	List<IOclOperation> operations = OclOperationEnum.getOperations(this.target.getOperationName());
	if (operations != null) {
		for (IOclOperation operation : operations) {
			// Type check the call!
			if (OperationResolutionUtils.isCorrectImplementation(null, operation.getSourceType(), paramTypes, operation.getArgsType(), this.target.getOperationName(), operation.getName())) {
				return operation.getReturnType(null, paramTypes);
			}
		}
		// No correct operation was found
		
		return new OclInvalid(new InvalidTypeOperation(target, this.target.getOperationName(), paramTypes));
	} else {
		return new OclInvalid(new OperationNotFoundError(target, this.target.getOperationName()));
	}
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = this.target.getOperationName() + "(";
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