package fr.enseeiht.ocl.xtext.ocl.adapter.impl;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclEClass;
import fr.enseeiht.ocl.xtext.types.OclInteger;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclString;
import fr.enseeiht.ocl.xtext.types.OclTuple;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccessInvalid;
import fr.enseeiht.ocl.xtext.ocl.NavigationOrAttributeCall;
import fr.enseeiht.ocl.xtext.ocl.PropertyCallExp;
import fr.enseeiht.ocl.xtext.ocl.TupleLiteralExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for NavigationOrAttributeCall
 * @generated
 */
public final class NavigationOrAttributeCallValidationAdapter implements OCLAdapter {

  private NavigationOrAttributeCall target;


  /**
   * @generated
   */
  public NavigationOrAttributeCallValidationAdapter(NavigationOrAttributeCall object) {
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
	EObject source;
	if (pos == 0) {
		// root call
		source = (EObject) OCLValidationAdapterFactory.INSTANCE.createAdapter(container.getSource()).getValue(contextTarget);
	} else {
		source = (EObject) OCLValidationAdapterFactory.INSTANCE.createAdapter(container.getCalls().get(pos-1)).getValue(contextTarget);
	}
	
	if (source != null) {
		for (EStructuralFeature feat : source.eClass().getEAllStructuralFeatures()) {
			if (this.target.getName().equals(feat.getName())) {
				return source.eGet(feat);
			}
		}
	} else {
		return new UndefinedAccessInvalid(source);
	}
	return null;
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  // On récupère le type du parent, qui devrait alors etre une EClass
	  PropertyCallExp container = (PropertyCallExp) this.target.eContainer();
	  // On remonte la pile des accès
	  int pos = container.getCalls().indexOf(this.target);
	  OclEClass source = null;
	  if (pos == 0) {
		  // root call
		  if (container.getSource() instanceof TupleLiteralExp) {
			  OclTuple tuple = (OclTuple) OCLValidationAdapterFactory.INSTANCE.createAdapter(container.getSource()).getType();
			  return tuple.getTypeOf(target, target.getName());
		  } else if (container.getSource() != null) {
			  source = (OclEClass) OCLValidationAdapterFactory.INSTANCE.createAdapter(container.getSource()).getType();
		  }
	  } else {
		  if (container.getSource() instanceof TupleLiteralExp) {
			  OclTuple tuple = (OclTuple) OCLValidationAdapterFactory.INSTANCE.createAdapter(container.getCalls().get(pos-1)).getType();
			  return tuple.getTypeOf(target, target.getName());
		  } else if (container.getCalls().get(pos-1) != null) {
			  source = (OclEClass) OCLValidationAdapterFactory.INSTANCE.createAdapter(container.getCalls().get(pos-1)).getType();
		  }
	  }
	  // On a le type parent! On récupère son sous-type.
	  
	  if (source != null) {
		  	EStructuralFeature feature = source.classtype.getEStructuralFeature(this.target.getName());
			EClassifier eType = source.classtype.getEStructuralFeature(this.target.getName()).getEType();
			OclType type; 
			if(eType instanceof EClass eClass) {
				type = new OclEClass(eClass);
			}
			else if(eType instanceof EDataType eDataType) {
				type = null;
				if(eDataType.getInstanceClassName().equals("boolean"))
					type = new OclBoolean();
				if(eDataType.getInstanceClassName().equals("java.lang.String"))
					type = new OclString();
				if(eDataType.getInstanceClassName().equals("int"))
					type = new OclInteger();
			}
			else if(eType instanceof EEnum eEnum) {
				type = null;
			}
			else {
				type = null;
			}
			
			if(feature.getUpperBound() == 1)
				return type;
			
			return new OclCollection(type);
		}
	  return new OclInvalid(target, "Cannot access attribute '" + target.getName() + "' in Class '" + source.classtype.getName() + "'.");
  }

  /**
   * Get adapted element
   * @return adapted element
   * @generated
   */
  public EObject getElement() {
    return this.target;
  }
                 public boolean conformsTo(OclType oclType) {
	// TODO Auto-generated method stub
	return false;
}

public OclType unifyWith(OclType oclType) {
	// TODO Auto-generated method stub
	return null;
}
 }