package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclMap;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.MapType;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for MapType
 * @generated
 */
public final class MapTypeValidationAdapter implements OCLAdapter {

  private MapType target;

  /**
   * @generated
   */
  public MapTypeValidationAdapter(MapType object) {
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
	  OclClassifier keyClassifier  = (OclClassifier) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getKeyType()).getType();
	  OclClassifier valueClassifier  = (OclClassifier) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getValueType()).getType();
	  return new OclClassifier(new OclMap(keyClassifier.getRepresentedType(), valueClassifier.getRepresentedType()));
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