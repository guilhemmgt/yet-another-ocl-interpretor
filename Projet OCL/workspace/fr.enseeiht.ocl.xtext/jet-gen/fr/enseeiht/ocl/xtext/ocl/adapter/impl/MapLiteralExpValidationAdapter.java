package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclMap;
import fr.enseeiht.ocl.xtext.types.OclTypePair;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.MapElement;
import fr.enseeiht.ocl.xtext.ocl.MapLiteralExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for MapLiteralExp
 * @generated
 */
public final class MapLiteralExpValidationAdapter implements OCLAdapter {

  private MapLiteralExp target;

  /**
   * @generated
   */
  public MapLiteralExpValidationAdapter(MapLiteralExp object) {
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
	  OclType key = null;
	  OclType value = null;
	  for (MapElement elt : target.getElements()) {
		  MapElementValidationAdapter eltType  = (MapElementValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(elt);
		  // Below is a TypePair, which is only used here. Please note that this is not a real type in OCl, and is a special class needed for this instance only.
		  OclTypePair pair = (OclTypePair) eltType.getType();
		  if (pair.getLeft() instanceof OclInvalid || pair.getRight() instanceof OclInvalid) {
			  // Il devrait être impossible d'avoir (key=null && value != null) ou l'inverse, mais on le garde en sécurité dans cette section.
			  return new OclInvalid(pair.getLeft(), pair.getRight());
		  }
		  if (key == null || value == null) {
			  // Initialisation
			  key = pair.getLeft();
			  value = pair.getRight();
		  }
		  else {
			  // Unification des sous-types
			  key = key.unifyWith(pair.getLeft());
			  value = value.unifyWith(pair.getLeft());
		  }
		  
	  }
	  // Note that key and value can be null (but should in this case always be both null at the same time)
	  return new OclMap(key, value);
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = "Map{";
		EList<MapElement> elts = this.target.getElements();
		for (int i = 0; i < elts.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(elts.get(i)) + (i==elts.size()-1 ? "" : ",");
		}
		res += "}";
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