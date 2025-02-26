package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclTypePair;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.MapElement;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for MapElement
 * @generated
 */
public final class MapElementValidationAdapter implements OCLAdapter {

  private MapElement target;

  /**
   * @generated
   */
  public MapElementValidationAdapter(MapElement object) {
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
	  OclType key = OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getKey()).getType();
	  OclType value = OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getValue()).getType();
	  return new OclTypePair(key, value);
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