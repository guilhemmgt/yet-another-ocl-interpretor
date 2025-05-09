package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclVoid;
import fr.enseeiht.ocl.xtext.validation.TypeMismatchError;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.Iterator;
import fr.enseeiht.ocl.xtext.ocl.PropertyCallExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for Iterator
 * @generated
 */
public final class IteratorValidationAdapter implements OCLAdapter {

  private Iterator target;

  /**
   * @generated
   */
  public IteratorValidationAdapter(Iterator object) {
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
		// Get the PropertyCallExp in order to get the source type
		PropertyCallExp parent = (PropertyCallExp) this.target.eContainer().eContainer();
		
		// On remonte la pile des accès
		int pos = parent.getCalls().indexOf(this.target.eContainer());
		OclType source;
		if (pos == 0) {
			// root call
			source = OCLValidationAdapterFactory.INSTANCE.createAdapter(parent.getSource()).getType();
		} else {
			source =  OCLValidationAdapterFactory.INSTANCE.createAdapter(parent.getCalls().get(pos - 1))
					.getType();
		}
		if (source instanceof OclCollection eSource) {
			OclType sourceSubType = eSource.getSubtype();
			if (sourceSubType == null) {
				sourceSubType = new OclVoid();
			}
			if (this.target.getType() != null) {
				// cf. DOC at (Section 7.6.1)
				OclType expectedType = ((OclTypeLiteralValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getType())).getOclType();
				if (!sourceSubType.conformsTo(expectedType))
					return new OclInvalid(new TypeMismatchError(this.target, expectedType, sourceSubType)); 
			}
			return sourceSubType;
		} else {
			return new OclInvalid(new TypeMismatchError(this.target, new OclCollection(null), source));
		}		
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
	   String res = this.target.getName();
	   if (this.target.getType() != null)
		   res += ":" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getType());
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