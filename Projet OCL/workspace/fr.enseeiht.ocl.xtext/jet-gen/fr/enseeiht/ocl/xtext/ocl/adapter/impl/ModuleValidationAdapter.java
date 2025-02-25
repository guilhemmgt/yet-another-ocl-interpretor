package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.ArrayList;
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
   * @generated
   */
  public ModuleValidationAdapter(Module object) {
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
    for (Import imp : imports) {
    	res += OCLValidationAdapterFactory.INSTANCE.createAdapter(imp).toString() + "\n";
    }
    res += "\n";
    // Ajout des contextless features
    EList<OclFeatureDefinition> contextlessFeatures = this.target.getContextlessFeatures();
    for (OclFeatureDefinition cf : contextlessFeatures) {
    	res += OCLValidationAdapterFactory.INSTANCE.createAdapter(cf).toString() + "\n";
    }
    res += "\n";
    // Ajout des contexts
    EList<OclContextBlock> contextBlocks = this.target.getContextBlocks();
    for (OclContextBlock cb : contextBlocks) {
    	res += OCLValidationAdapterFactory.INSTANCE.createAdapter(cb).toString() + "\n";
    }
    res += "\n";
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
    public List<OclFeatureDefinition> getAllDefinition() {
	  return this.localDefinitions;
  }
 }