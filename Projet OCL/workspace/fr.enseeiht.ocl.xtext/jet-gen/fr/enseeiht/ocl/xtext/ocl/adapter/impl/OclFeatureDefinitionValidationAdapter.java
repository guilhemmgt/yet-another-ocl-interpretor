package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.Attribute;
import fr.enseeiht.ocl.xtext.ocl.OclContextBlock;
import fr.enseeiht.ocl.xtext.ocl.OclFeatureDefinition;
import fr.enseeiht.ocl.xtext.ocl.Operation;
import fr.enseeiht.ocl.xtext.ocl.Parameter;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for OclFeatureDefinition
 * @generated
 */
public final class OclFeatureDefinitionValidationAdapter implements OCLAdapter {

  private OclFeatureDefinition target;

  /**
   * @generated
   */
  public OclFeatureDefinitionValidationAdapter(OclFeatureDefinition object) {
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
   * Returns the name of the feature
   * @return String
   */
  public String getName() {
	  if (target.getFeature() instanceof Attribute) {
		  return ((Attribute) target.getFeature()).getName();
	  } else if (target.getFeature() instanceof Operation) {
		  return ((Operation) target.getFeature()).getName();
	  } else {
		  return "Invalid";
	  }
  }
  
  /**
   * Returns whether the feature is an operation
   * @return String
   */
  public boolean isOperation() {
	  return target.getFeature() instanceof Operation;
  }
  
  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	return OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getFeature()).getType();
  }

  /**
   * Get the type of the arguments, drops the classifiers
   * @return type of the arguments
   */
  public List<OclType> getArgsType() {
	  if (target.getFeature() instanceof Attribute) {
		  throw new UnimplementedException(this.getClass(),"getArgTypes:Attribute"); // Invalid case
	  } else if (target.getFeature() instanceof Operation) {
		  List<OclType> args = new LinkedList<OclType>();
		  for (Parameter typ : ((Operation) target.getFeature()).getParameters()) {
			  args.add(((OclClassifier)OCLValidationAdapterFactory.INSTANCE.createAdapter(typ).getType()).getRepresentedType());
		  }
		  return args;
	  } else {
		  return new LinkedList<OclType>();
	  }
  }

  
  /**
   * Get the type of the source
   * @return type of the source
   * @generated NOT
   */
  public OclType getSourceType() {
	  EObject container = target.eContainer();
	  if (container instanceof OclContextBlock) {
		  return OCLValidationAdapterFactory.INSTANCE.createAdapter(container).getType();
	  } else return null; // Module
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		return "def:" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getFeature());
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
    return "def";
  }
 }