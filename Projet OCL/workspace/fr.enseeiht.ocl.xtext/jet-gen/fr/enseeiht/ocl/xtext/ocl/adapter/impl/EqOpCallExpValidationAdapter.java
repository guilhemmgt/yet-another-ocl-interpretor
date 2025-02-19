package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.types.OclString;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.EqOpCallExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for EqOpCallExp
 * @generated
 */
public final class EqOpCallExpValidationAdapter implements OCLAdapter {

  private EqOpCallExp target;

  /**
   * @generated
   */
  public EqOpCallExpValidationAdapter(EqOpCallExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated
   */
  public Object getValue(EObject contextTarget) {
    throw new UnimplementedException("La methode getValue de EqOpCallExpAdapter n'as pas encore été implémentée");
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  // Attention : arg2 peut être vide si l'opération n'est pas une vraie opération (ce sera toujours le cas dans le membre de droite)
	  OperatorCallExpValidationAdapter arg1 = (OperatorCallExpValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgumentGauche());
	  OperatorCallExpValidationAdapter arg2 = (OperatorCallExpValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgumentDroite());
	  if (arg2 == null) {
		  // Il n'y a pas de membre à droite, on renvoie le type de arg1
		  return arg1.getType();
	  }
	  else {
		  OclType type1 = arg1.getType();
		  OclType type2 = arg2.getType();
		  // On peut comparer tout avec tout à condition qu'aucun argument ne soit invalide.
		  // C'est la spé.
		  boolean anyInvalid = type1.conformsTo(new OclInvalid()) || type2.conformsTo(new OclInvalid()) ;
		  if (!anyInvalid) {
			  String message = "Invalid operation between types " + type1 + " and " + type2 + "(operation : '" + target.getOperationName() + "')";
			  return new OclInvalid(target, message, type1, type2);
		  }
		  else {
			  // Opération invalide
			  return new OclBoolean();
		  }
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