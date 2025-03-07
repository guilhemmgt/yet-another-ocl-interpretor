package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.Import;
import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.ocl.xtext.ocl.OclContextBlock;
import fr.enseeiht.ocl.xtext.ocl.OclFeatureDefinition;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for Module
 * @generated
 */
public final class ModuleValidationAdapter implements OCLAdapter {

  private Module target;
  private List<OclFeatureDefinition> localDefinitions; 
  /**
   * @generated NOT
   */
  public ModuleValidationAdapter(Module object) {
    this.target = object;
    this.localDefinitions = new ArrayList<OclFeatureDefinition>();
    // Get all contextless defs
    this.localDefinitions.addAll(this.target.getContextlessFeatures());
    // Get contexted defts
    for (OclContextBlock context : this.target.getContextBlocks()) {
    	for (EObject elt : context.getMembers()) {
    		if (elt instanceof OclFeatureDefinition) this.localDefinitions.add((OclFeatureDefinition) elt);
    	}
    }
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
    throw new UnimplementedException(this.getClass(),"getType");
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = "";
		// Ajout des imports
		EList<Import> imports = this.target.getImports();
		for (int i = 0; i < imports.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(imports.get(i)) + "\n";
		}
		// Ajout des contextless features
		EList<OclFeatureDefinition> contextlessFeatures = this.target.getContextlessFeatures();
		for (int i = 0; i < contextlessFeatures.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(contextlessFeatures.get(i)) + "\n";
		}
		// Ajout des contexts
		EList<OclContextBlock> contextBlocks = this.target.getContextBlocks();
		for (int i = 0; i < contextBlocks.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(contextBlocks.get(i)) + "\n";
		}
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
    /**
   * Get all the declared feature definitions
   * @return list of feature definitons (def)
   * @generated NOT
   */
  public List<OclFeatureDefinition> getAllDefinition() {
	  return this.localDefinitions;
  }
  
  /**
   * Get all the declared feature definitions, filtered by name, and whether they are an operation
   * @return list of feature definitons validation adapters (def).
   * @generated NOT
   */
  public List<OclFeatureDefinitionValidationAdapter> getDefinitions(String name, boolean isOperation) {
	  List<OclFeatureDefinitionValidationAdapter> filtered = new LinkedList<OclFeatureDefinitionValidationAdapter>();
	  for (OclFeatureDefinition def: localDefinitions) {
		  OclFeatureDefinitionValidationAdapter vadef = (OclFeatureDefinitionValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(def);
		  if (vadef.isOperation() == isOperation && vadef.getName().equals(name)) {
			  filtered.add(vadef);
		  }
	  }
	  return filtered;
  }
 }