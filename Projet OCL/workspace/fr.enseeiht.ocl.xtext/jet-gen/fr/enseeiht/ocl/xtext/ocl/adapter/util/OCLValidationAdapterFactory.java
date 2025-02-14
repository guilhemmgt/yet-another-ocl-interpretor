package fr.enseeiht.ocl.xtext.ocl.adapter.util;

import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.ocl.xtext.ocl.Import;
import fr.enseeiht.ocl.xtext.ocl.ModuleElement;
import fr.enseeiht.ocl.xtext.ocl.OclModuleElement;
import fr.enseeiht.ocl.xtext.ocl.OclFeatureDefinition;
import fr.enseeiht.ocl.xtext.ocl.Attribute;
import fr.enseeiht.ocl.xtext.ocl.Operation;
import fr.enseeiht.ocl.xtext.ocl.Parameter;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.ocl.OclModelElementExp;
import fr.enseeiht.ocl.xtext.ocl.OperatorCallExp;
import fr.enseeiht.ocl.xtext.ocl.PropertyCallExp;
import fr.enseeiht.ocl.xtext.ocl.Auxiliary;
import fr.enseeiht.ocl.xtext.ocl.VariableExp;
import fr.enseeiht.ocl.xtext.ocl.VariableDeclaration;
import fr.enseeiht.ocl.xtext.ocl.SuperExp;
import fr.enseeiht.ocl.xtext.ocl.SelfExp;
import fr.enseeiht.ocl.xtext.ocl.StringExp;
import fr.enseeiht.ocl.xtext.ocl.NumericExp;
import fr.enseeiht.ocl.xtext.ocl.RealExp;
import fr.enseeiht.ocl.xtext.ocl.IntegerExp;
import fr.enseeiht.ocl.xtext.ocl.BagExp;
import fr.enseeiht.ocl.xtext.ocl.OrderedSetExp;
import fr.enseeiht.ocl.xtext.ocl.SequenceExp;
import fr.enseeiht.ocl.xtext.ocl.SetExp;
import fr.enseeiht.ocl.xtext.ocl.TupleExp;
import fr.enseeiht.ocl.xtext.ocl.TuplePart;
import fr.enseeiht.ocl.xtext.ocl.MapExp;
import fr.enseeiht.ocl.xtext.ocl.MapElement;
import fr.enseeiht.ocl.xtext.ocl.EnumLiteralExp;
import fr.enseeiht.ocl.xtext.ocl.OclUndefinedExp;
import fr.enseeiht.ocl.xtext.ocl.LetExp;
import fr.enseeiht.ocl.xtext.ocl.IfExp;
import fr.enseeiht.ocl.xtext.ocl.BraceExp;
import fr.enseeiht.ocl.xtext.ocl.BooleanExp;
import fr.enseeiht.ocl.xtext.ocl.PropertyCall;
import fr.enseeiht.ocl.xtext.ocl.OperationCall;
import fr.enseeiht.ocl.xtext.ocl.NavigationOrAttributeCall;
import fr.enseeiht.ocl.xtext.ocl.IterateExp;
import fr.enseeiht.ocl.xtext.ocl.Iterator;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.CollectionOperationCall;
import fr.enseeiht.ocl.xtext.ocl.LocalVariable;
import fr.enseeiht.ocl.xtext.ocl.OclType;
import fr.enseeiht.ocl.xtext.ocl.CollectionType;
import fr.enseeiht.ocl.xtext.ocl.BagType;
import fr.enseeiht.ocl.xtext.ocl.OrderedSetType;
import fr.enseeiht.ocl.xtext.ocl.SequenceType;
import fr.enseeiht.ocl.xtext.ocl.SetType;
import fr.enseeiht.ocl.xtext.ocl.Primitive;
import fr.enseeiht.ocl.xtext.ocl.StringType;
import fr.enseeiht.ocl.xtext.ocl.BooleanType;
import fr.enseeiht.ocl.xtext.ocl.NumericType;
import fr.enseeiht.ocl.xtext.ocl.IntegerType;
import fr.enseeiht.ocl.xtext.ocl.RealType;
import fr.enseeiht.ocl.xtext.ocl.OclAnyType;
import fr.enseeiht.ocl.xtext.ocl.TupleType;
import fr.enseeiht.ocl.xtext.ocl.TupleTypeAttribute;
import fr.enseeiht.ocl.xtext.ocl.OclModelElement;
import fr.enseeiht.ocl.xtext.ocl.MapType;
import fr.enseeiht.ocl.xtext.ocl.BoolOpCallExp;
import fr.enseeiht.ocl.xtext.ocl.EqOpCallExp;
import fr.enseeiht.ocl.xtext.ocl.RelOpCallExp;
import fr.enseeiht.ocl.xtext.ocl.AddOpCallExp;
import fr.enseeiht.ocl.xtext.ocl.IntOpCallExp;
import fr.enseeiht.ocl.xtext.ocl.MulOpCallExp;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.ModuleValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.ImportValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.ModuleElementValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OclModuleElementValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OclFeatureDefinitionValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.AttributeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OperationValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.ParameterValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OclInvariantValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OclExpressionValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OclModelElementExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OperatorCallExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.PropertyCallExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.AuxiliaryValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.VariableExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.VariableDeclarationValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.SuperExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.SelfExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.StringExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.NumericExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.RealExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.IntegerExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.BagExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OrderedSetExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.SequenceExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.SetExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.TupleExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.TuplePartValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.MapExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.MapElementValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.EnumLiteralExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OclUndefinedExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.LetExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.IfExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.BraceExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.BooleanExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.PropertyCallValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OperationCallValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.NavigationOrAttributeCallValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.IterateExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.IteratorValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.IteratorExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.CollectionOperationCallValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.LocalVariableValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OclTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.CollectionTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.BagTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OrderedSetTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.SequenceTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.SetTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.PrimitiveValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.StringTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.BooleanTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.NumericTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.IntegerTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.RealTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OclAnyTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.TupleTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.TupleTypeAttributeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OclModelElementValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.MapTypeValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.BoolOpCallExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.EqOpCallExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.RelOpCallExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.AddOpCallExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.IntOpCallExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.MulOpCallExpValidationAdapter;

import fr.enseeiht.ocl.xtext.ocl.OclPackage;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.util.OclSwitch;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
/**
 * <!-- begin-user-doc -->
 * The <b>ValidationAdapter Factory</b> for the model.
 * It provides an adapter <code>createXXXValidationAdapter</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.enseeiht.ocl.xtext.ocl.OclPackage
 * @generated
 */
public class OCLValidationAdapterFactory
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OclPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OCLValidationAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = OclPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OclSwitch<OCLAdapter> modelSwitch =
    new OclSwitch<OCLAdapter>()
    {
      @Override
      public OCLAdapter caseModule(Module object)
      {
        return createModuleValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseImport(Import object)
      {
        return createImportValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseModuleElement(ModuleElement object)
      {
        return createModuleElementValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOclModuleElement(OclModuleElement object)
      {
        return createOclModuleElementValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOclFeatureDefinition(OclFeatureDefinition object)
      {
        return createOclFeatureDefinitionValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseAttribute(Attribute object)
      {
        return createAttributeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOperation(Operation object)
      {
        return createOperationValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseParameter(Parameter object)
      {
        return createParameterValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOclInvariant(OclInvariant object)
      {
        return createOclInvariantValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOclExpression(OclExpression object)
      {
        return createOclExpressionValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOclModelElementExp(OclModelElementExp object)
      {
        return createOclModelElementExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOperatorCallExp(OperatorCallExp object)
      {
        return createOperatorCallExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter casePropertyCallExp(PropertyCallExp object)
      {
        return createPropertyCallExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseAuxiliary(Auxiliary object)
      {
        return createAuxiliaryValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseVariableExp(VariableExp object)
      {
        return createVariableExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseSuperExp(SuperExp object)
      {
        return createSuperExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseSelfExp(SelfExp object)
      {
        return createSelfExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseStringExp(StringExp object)
      {
        return createStringExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseNumericExp(NumericExp object)
      {
        return createNumericExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseRealExp(RealExp object)
      {
        return createRealExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseIntegerExp(IntegerExp object)
      {
        return createIntegerExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseBagExp(BagExp object)
      {
        return createBagExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOrderedSetExp(OrderedSetExp object)
      {
        return createOrderedSetExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseSequenceExp(SequenceExp object)
      {
        return createSequenceExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseSetExp(SetExp object)
      {
        return createSetExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseTupleExp(TupleExp object)
      {
        return createTupleExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseTuplePart(TuplePart object)
      {
        return createTuplePartValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseMapExp(MapExp object)
      {
        return createMapExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseMapElement(MapElement object)
      {
        return createMapElementValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseEnumLiteralExp(EnumLiteralExp object)
      {
        return createEnumLiteralExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOclUndefinedExp(OclUndefinedExp object)
      {
        return createOclUndefinedExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseLetExp(LetExp object)
      {
        return createLetExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseIfExp(IfExp object)
      {
        return createIfExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseBraceExp(BraceExp object)
      {
        return createBraceExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseBooleanExp(BooleanExp object)
      {
        return createBooleanExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter casePropertyCall(PropertyCall object)
      {
        return createPropertyCallValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOperationCall(OperationCall object)
      {
        return createOperationCallValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseNavigationOrAttributeCall(NavigationOrAttributeCall object)
      {
        return createNavigationOrAttributeCallValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseIterateExp(IterateExp object)
      {
        return createIterateExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseIterator(Iterator object)
      {
        return createIteratorValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseIteratorExp(IteratorExp object)
      {
        return createIteratorExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseCollectionOperationCall(CollectionOperationCall object)
      {
        return createCollectionOperationCallValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseLocalVariable(LocalVariable object)
      {
        return createLocalVariableValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOclType(OclType object)
      {
        return createOclTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseCollectionType(CollectionType object)
      {
        return createCollectionTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseBagType(BagType object)
      {
        return createBagTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOrderedSetType(OrderedSetType object)
      {
        return createOrderedSetTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseSequenceType(SequenceType object)
      {
        return createSequenceTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseSetType(SetType object)
      {
        return createSetTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter casePrimitive(Primitive object)
      {
        return createPrimitiveValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseStringType(StringType object)
      {
        return createStringTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseBooleanType(BooleanType object)
      {
        return createBooleanTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseNumericType(NumericType object)
      {
        return createNumericTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseIntegerType(IntegerType object)
      {
        return createIntegerTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseRealType(RealType object)
      {
        return createRealTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOclAnyType(OclAnyType object)
      {
        return createOclAnyTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseTupleType(TupleType object)
      {
        return createTupleTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseTupleTypeAttribute(TupleTypeAttribute object)
      {
        return createTupleTypeAttributeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseOclModelElement(OclModelElement object)
      {
        return createOclModelElementValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseMapType(MapType object)
      {
        return createMapTypeValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseBoolOpCallExp(BoolOpCallExp object)
      {
        return createBoolOpCallExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseEqOpCallExp(EqOpCallExp object)
      {
        return createEqOpCallExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseRelOpCallExp(RelOpCallExp object)
      {
        return createRelOpCallExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseAddOpCallExp(AddOpCallExp object)
      {
        return createAddOpCallExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseIntOpCallExp(IntOpCallExp object)
      {
        return createIntOpCallExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter caseMulOpCallExp(MulOpCallExp object)
      {
        return createMulOpCallExpValidationAdapter(object);
      }
      @Override
      public OCLAdapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  public OCLAdapter createEObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Module
   * @generated
   */
  public OCLAdapter createModuleValidationAdapter(Module target)
  {
    return new ModuleValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Import
   * @generated
   */
  public OCLAdapter createImportValidationAdapter(Import target)
  {
    return new ImportValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.ModuleElement <em>ModuleElement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.ModuleElement
   * @generated
   */
  public OCLAdapter createModuleElementValidationAdapter(ModuleElement target)
  {
    return new ModuleElementValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclModuleElement <em>OclModuleElement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclModuleElement
   * @generated
   */
  public OCLAdapter createOclModuleElementValidationAdapter(OclModuleElement target)
  {
    return new OclModuleElementValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclFeatureDefinition <em>OclFeatureDefinition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclFeatureDefinition
   * @generated
   */
  public OCLAdapter createOclFeatureDefinitionValidationAdapter(OclFeatureDefinition target)
  {
    return new OclFeatureDefinitionValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Attribute
   * @generated
   */
  public OCLAdapter createAttributeValidationAdapter(Attribute target)
  {
    return new AttributeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Operation
   * @generated
   */
  public OCLAdapter createOperationValidationAdapter(Operation target)
  {
    return new OperationValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Parameter
   * @generated
   */
  public OCLAdapter createParameterValidationAdapter(Parameter target)
  {
    return new ParameterValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclInvariant <em>OclInvariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclInvariant
   * @generated
   */
  public OCLAdapter createOclInvariantValidationAdapter(OclInvariant target)
  {
    return new OclInvariantValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclExpression <em>OclExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclExpression
   * @generated
   */
  public OCLAdapter createOclExpressionValidationAdapter(OclExpression target)
  {
    return new OclExpressionValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclModelElementExp <em>OclModelElementExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclModelElementExp
   * @generated
   */
  public OCLAdapter createOclModelElementExpValidationAdapter(OclModelElementExp target)
  {
    return new OclModelElementExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OperatorCallExp <em>OperatorCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OperatorCallExp
   * @generated
   */
  public OCLAdapter createOperatorCallExpValidationAdapter(OperatorCallExp target)
  {
    return new OperatorCallExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.PropertyCallExp <em>PropertyCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.PropertyCallExp
   * @generated
   */
  public OCLAdapter createPropertyCallExpValidationAdapter(PropertyCallExp target)
  {
    return new PropertyCallExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Auxiliary <em>Auxiliary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Auxiliary
   * @generated
   */
  public OCLAdapter createAuxiliaryValidationAdapter(Auxiliary target)
  {
    return new AuxiliaryValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.VariableExp <em>VariableExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.VariableExp
   * @generated
   */
  public OCLAdapter createVariableExpValidationAdapter(VariableExp target)
  {
    return new VariableExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.VariableDeclaration <em>VariableDeclaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.VariableDeclaration
   * @generated
   */
  public OCLAdapter createVariableDeclarationValidationAdapter(VariableDeclaration target)
  {
    return new VariableDeclarationValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.SuperExp <em>SuperExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.SuperExp
   * @generated
   */
  public OCLAdapter createSuperExpValidationAdapter(SuperExp target)
  {
    return new SuperExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.SelfExp <em>SelfExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.SelfExp
   * @generated
   */
  public OCLAdapter createSelfExpValidationAdapter(SelfExp target)
  {
    return new SelfExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.StringExp <em>StringExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.StringExp
   * @generated
   */
  public OCLAdapter createStringExpValidationAdapter(StringExp target)
  {
    return new StringExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.NumericExp <em>NumericExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.NumericExp
   * @generated
   */
  public OCLAdapter createNumericExpValidationAdapter(NumericExp target)
  {
    return new NumericExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.RealExp <em>RealExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.RealExp
   * @generated
   */
  public OCLAdapter createRealExpValidationAdapter(RealExp target)
  {
    return new RealExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.IntegerExp <em>IntegerExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.IntegerExp
   * @generated
   */
  public OCLAdapter createIntegerExpValidationAdapter(IntegerExp target)
  {
    return new IntegerExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.BagExp <em>BagExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.BagExp
   * @generated
   */
  public OCLAdapter createBagExpValidationAdapter(BagExp target)
  {
    return new BagExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OrderedSetExp <em>OrderedSetExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OrderedSetExp
   * @generated
   */
  public OCLAdapter createOrderedSetExpValidationAdapter(OrderedSetExp target)
  {
    return new OrderedSetExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.SequenceExp <em>SequenceExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.SequenceExp
   * @generated
   */
  public OCLAdapter createSequenceExpValidationAdapter(SequenceExp target)
  {
    return new SequenceExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.SetExp <em>SetExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.SetExp
   * @generated
   */
  public OCLAdapter createSetExpValidationAdapter(SetExp target)
  {
    return new SetExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.TupleExp <em>TupleExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.TupleExp
   * @generated
   */
  public OCLAdapter createTupleExpValidationAdapter(TupleExp target)
  {
    return new TupleExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.TuplePart <em>TuplePart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.TuplePart
   * @generated
   */
  public OCLAdapter createTuplePartValidationAdapter(TuplePart target)
  {
    return new TuplePartValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.MapExp <em>MapExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.MapExp
   * @generated
   */
  public OCLAdapter createMapExpValidationAdapter(MapExp target)
  {
    return new MapExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.MapElement <em>MapElement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.MapElement
   * @generated
   */
  public OCLAdapter createMapElementValidationAdapter(MapElement target)
  {
    return new MapElementValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.EnumLiteralExp <em>EnumLiteralExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.EnumLiteralExp
   * @generated
   */
  public OCLAdapter createEnumLiteralExpValidationAdapter(EnumLiteralExp target)
  {
    return new EnumLiteralExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclUndefinedExp <em>OclUndefinedExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclUndefinedExp
   * @generated
   */
  public OCLAdapter createOclUndefinedExpValidationAdapter(OclUndefinedExp target)
  {
    return new OclUndefinedExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.LetExp <em>LetExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.LetExp
   * @generated
   */
  public OCLAdapter createLetExpValidationAdapter(LetExp target)
  {
    return new LetExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.IfExp <em>IfExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.IfExp
   * @generated
   */
  public OCLAdapter createIfExpValidationAdapter(IfExp target)
  {
    return new IfExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.BraceExp <em>BraceExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.BraceExp
   * @generated
   */
  public OCLAdapter createBraceExpValidationAdapter(BraceExp target)
  {
    return new BraceExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.BooleanExp <em>BooleanExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.BooleanExp
   * @generated
   */
  public OCLAdapter createBooleanExpValidationAdapter(BooleanExp target)
  {
    return new BooleanExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.PropertyCall <em>PropertyCall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.PropertyCall
   * @generated
   */
  public OCLAdapter createPropertyCallValidationAdapter(PropertyCall target)
  {
    return new PropertyCallValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OperationCall <em>OperationCall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OperationCall
   * @generated
   */
  public OCLAdapter createOperationCallValidationAdapter(OperationCall target)
  {
    return new OperationCallValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.NavigationOrAttributeCall <em>NavigationOrAttributeCall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.NavigationOrAttributeCall
   * @generated
   */
  public OCLAdapter createNavigationOrAttributeCallValidationAdapter(NavigationOrAttributeCall target)
  {
    return new NavigationOrAttributeCallValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.IterateExp <em>IterateExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.IterateExp
   * @generated
   */
  public OCLAdapter createIterateExpValidationAdapter(IterateExp target)
  {
    return new IterateExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Iterator <em>Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Iterator
   * @generated
   */
  public OCLAdapter createIteratorValidationAdapter(Iterator target)
  {
    return new IteratorValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.IteratorExp <em>IteratorExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.IteratorExp
   * @generated
   */
  public OCLAdapter createIteratorExpValidationAdapter(IteratorExp target)
  {
    return new IteratorExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.CollectionOperationCall <em>CollectionOperationCall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.CollectionOperationCall
   * @generated
   */
  public OCLAdapter createCollectionOperationCallValidationAdapter(CollectionOperationCall target)
  {
    return new CollectionOperationCallValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.LocalVariable <em>LocalVariable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.LocalVariable
   * @generated
   */
  public OCLAdapter createLocalVariableValidationAdapter(LocalVariable target)
  {
    return new LocalVariableValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclType <em>OclType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclType
   * @generated
   */
  public OCLAdapter createOclTypeValidationAdapter(OclType target)
  {
    return new OclTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.CollectionType <em>CollectionType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.CollectionType
   * @generated
   */
  public OCLAdapter createCollectionTypeValidationAdapter(CollectionType target)
  {
    return new CollectionTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.BagType <em>BagType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.BagType
   * @generated
   */
  public OCLAdapter createBagTypeValidationAdapter(BagType target)
  {
    return new BagTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OrderedSetType <em>OrderedSetType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OrderedSetType
   * @generated
   */
  public OCLAdapter createOrderedSetTypeValidationAdapter(OrderedSetType target)
  {
    return new OrderedSetTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.SequenceType <em>SequenceType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.SequenceType
   * @generated
   */
  public OCLAdapter createSequenceTypeValidationAdapter(SequenceType target)
  {
    return new SequenceTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.SetType <em>SetType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.SetType
   * @generated
   */
  public OCLAdapter createSetTypeValidationAdapter(SetType target)
  {
    return new SetTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Primitive
   * @generated
   */
  public OCLAdapter createPrimitiveValidationAdapter(Primitive target)
  {
    return new PrimitiveValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.StringType <em>StringType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.StringType
   * @generated
   */
  public OCLAdapter createStringTypeValidationAdapter(StringType target)
  {
    return new StringTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.BooleanType <em>BooleanType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.BooleanType
   * @generated
   */
  public OCLAdapter createBooleanTypeValidationAdapter(BooleanType target)
  {
    return new BooleanTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.NumericType <em>NumericType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.NumericType
   * @generated
   */
  public OCLAdapter createNumericTypeValidationAdapter(NumericType target)
  {
    return new NumericTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.IntegerType <em>IntegerType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.IntegerType
   * @generated
   */
  public OCLAdapter createIntegerTypeValidationAdapter(IntegerType target)
  {
    return new IntegerTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.RealType <em>RealType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.RealType
   * @generated
   */
  public OCLAdapter createRealTypeValidationAdapter(RealType target)
  {
    return new RealTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclAnyType <em>OclAnyType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclAnyType
   * @generated
   */
  public OCLAdapter createOclAnyTypeValidationAdapter(OclAnyType target)
  {
    return new OclAnyTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.TupleType <em>TupleType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.TupleType
   * @generated
   */
  public OCLAdapter createTupleTypeValidationAdapter(TupleType target)
  {
    return new TupleTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.TupleTypeAttribute <em>TupleTypeAttribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.TupleTypeAttribute
   * @generated
   */
  public OCLAdapter createTupleTypeAttributeValidationAdapter(TupleTypeAttribute target)
  {
    return new TupleTypeAttributeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclModelElement <em>OclModelElement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclModelElement
   * @generated
   */
  public OCLAdapter createOclModelElementValidationAdapter(OclModelElement target)
  {
    return new OclModelElementValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.MapType <em>MapType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.MapType
   * @generated
   */
  public OCLAdapter createMapTypeValidationAdapter(MapType target)
  {
    return new MapTypeValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.BoolOpCallExp <em>BoolOpCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.BoolOpCallExp
   * @generated
   */
  public OCLAdapter createBoolOpCallExpValidationAdapter(BoolOpCallExp target)
  {
    return new BoolOpCallExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.EqOpCallExp <em>EqOpCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.EqOpCallExp
   * @generated
   */
  public OCLAdapter createEqOpCallExpValidationAdapter(EqOpCallExp target)
  {
    return new EqOpCallExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.RelOpCallExp <em>RelOpCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.RelOpCallExp
   * @generated
   */
  public OCLAdapter createRelOpCallExpValidationAdapter(RelOpCallExp target)
  {
    return new RelOpCallExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.AddOpCallExp <em>AddOpCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.AddOpCallExp
   * @generated
   */
  public OCLAdapter createAddOpCallExpValidationAdapter(AddOpCallExp target)
  {
    return new AddOpCallExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.IntOpCallExp <em>IntOpCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.IntOpCallExp
   * @generated
   */
  public OCLAdapter createIntOpCallExpValidationAdapter(IntOpCallExp target)
  {
    return new IntOpCallExpValidationAdapter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.MulOpCallExp <em>MulOpCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.MulOpCallExp
   * @generated
   */
  public OCLAdapter createMulOpCallExpValidationAdapter(MulOpCallExp target)
  {
    return new MulOpCallExpValidationAdapter(target);
  }

}