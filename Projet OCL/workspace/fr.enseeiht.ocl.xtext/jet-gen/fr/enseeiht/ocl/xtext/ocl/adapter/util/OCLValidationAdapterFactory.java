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
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.util.OclSwitch;
/**
 * <!-- begin-user-doc -->
 * The <b>ValidationAdapter Factory</b> for the model.
 * It provides an adapter <code>createXXXValidationAdapter</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.enseeiht.ocl.xtext.ocl.OclPackage
 * @generated
 */
public class OCLValidationAdapterFactory extends AdapterFactoryImpl
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
  @Override
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
      public Adapter caseModule(Module object)
      {
        return createModuleValidationAdapter(object);
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportValidationAdapter(object);
      }
      @Override
      public Adapter caseModuleElement(ModuleElement object)
      {
        return createModuleElementValidationAdapter(object);
      }
      @Override
      public Adapter caseOclModuleElement(OclModuleElement object)
      {
        return createOclModuleElementValidationAdapter(object);
      }
      @Override
      public Adapter caseOclFeatureDefinition(OclFeatureDefinition object)
      {
        return createOclFeatureDefinitionValidationAdapter(object);
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeValidationAdapter(object);
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationValidationAdapter(object);
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterValidationAdapter(object);
      }
      @Override
      public Adapter caseOclInvariant(OclInvariant object)
      {
        return createOclInvariantValidationAdapter(object);
      }
      @Override
      public Adapter caseOclExpression(OclExpression object)
      {
        return createOclExpressionValidationAdapter(object);
      }
      @Override
      public Adapter caseOclModelElementExp(OclModelElementExp object)
      {
        return createOclModelElementExpValidationAdapter(object);
      }
      @Override
      public Adapter caseOperatorCallExp(OperatorCallExp object)
      {
        return createOperatorCallExpValidationAdapter(object);
      }
      @Override
      public Adapter casePropertyCallExp(PropertyCallExp object)
      {
        return createPropertyCallExpValidationAdapter(object);
      }
      @Override
      public Adapter caseAuxiliary(Auxiliary object)
      {
        return createAuxiliaryValidationAdapter(object);
      }
      @Override
      public Adapter caseVariableExp(VariableExp object)
      {
        return createVariableExpValidationAdapter(object);
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationValidationAdapter(object);
      }
      @Override
      public Adapter caseSuperExp(SuperExp object)
      {
        return createSuperExpValidationAdapter(object);
      }
      @Override
      public Adapter caseSelfExp(SelfExp object)
      {
        return createSelfExpValidationAdapter(object);
      }
      @Override
      public Adapter caseStringExp(StringExp object)
      {
        return createStringExpValidationAdapter(object);
      }
      @Override
      public Adapter caseNumericExp(NumericExp object)
      {
        return createNumericExpValidationAdapter(object);
      }
      @Override
      public Adapter caseRealExp(RealExp object)
      {
        return createRealExpValidationAdapter(object);
      }
      @Override
      public Adapter caseIntegerExp(IntegerExp object)
      {
        return createIntegerExpValidationAdapter(object);
      }
      @Override
      public Adapter caseBagExp(BagExp object)
      {
        return createBagExpValidationAdapter(object);
      }
      @Override
      public Adapter caseOrderedSetExp(OrderedSetExp object)
      {
        return createOrderedSetExpValidationAdapter(object);
      }
      @Override
      public Adapter caseSequenceExp(SequenceExp object)
      {
        return createSequenceExpValidationAdapter(object);
      }
      @Override
      public Adapter caseSetExp(SetExp object)
      {
        return createSetExpValidationAdapter(object);
      }
      @Override
      public Adapter caseTupleExp(TupleExp object)
      {
        return createTupleExpValidationAdapter(object);
      }
      @Override
      public Adapter caseTuplePart(TuplePart object)
      {
        return createTuplePartValidationAdapter(object);
      }
      @Override
      public Adapter caseMapExp(MapExp object)
      {
        return createMapExpValidationAdapter(object);
      }
      @Override
      public Adapter caseMapElement(MapElement object)
      {
        return createMapElementValidationAdapter(object);
      }
      @Override
      public Adapter caseEnumLiteralExp(EnumLiteralExp object)
      {
        return createEnumLiteralExpValidationAdapter(object);
      }
      @Override
      public Adapter caseOclUndefinedExp(OclUndefinedExp object)
      {
        return createOclUndefinedExpValidationAdapter(object);
      }
      @Override
      public Adapter caseLetExp(LetExp object)
      {
        return createLetExpValidationAdapter(object);
      }
      @Override
      public Adapter caseIfExp(IfExp object)
      {
        return createIfExpValidationAdapter(object);
      }
      @Override
      public Adapter caseBraceExp(BraceExp object)
      {
        return createBraceExpValidationAdapter(object);
      }
      @Override
      public Adapter caseBooleanExp(BooleanExp object)
      {
        return createBooleanExpValidationAdapter(object);
      }
      @Override
      public Adapter casePropertyCall(PropertyCall object)
      {
        return createPropertyCallValidationAdapter(object);
      }
      @Override
      public Adapter caseOperationCall(OperationCall object)
      {
        return createOperationCallValidationAdapter(object);
      }
      @Override
      public Adapter caseNavigationOrAttributeCall(NavigationOrAttributeCall object)
      {
        return createNavigationOrAttributeCallValidationAdapter(object);
      }
      @Override
      public Adapter caseIterateExp(IterateExp object)
      {
        return createIterateExpValidationAdapter(object);
      }
      @Override
      public Adapter caseIterator(Iterator object)
      {
        return createIteratorValidationAdapter(object);
      }
      @Override
      public Adapter caseIteratorExp(IteratorExp object)
      {
        return createIteratorExpValidationAdapter(object);
      }
      @Override
      public Adapter caseCollectionOperationCall(CollectionOperationCall object)
      {
        return createCollectionOperationCallValidationAdapter(object);
      }
      @Override
      public Adapter caseLocalVariable(LocalVariable object)
      {
        return createLocalVariableValidationAdapter(object);
      }
      @Override
      public Adapter caseOclType(OclType object)
      {
        return createOclTypeValidationAdapter(object);
      }
      @Override
      public Adapter caseCollectionType(CollectionType object)
      {
        return createCollectionTypeValidationAdapter(object);
      }
      @Override
      public Adapter caseBagType(BagType object)
      {
        return createBagTypeValidationAdapter(object);
      }
      @Override
      public Adapter caseOrderedSetType(OrderedSetType object)
      {
        return createOrderedSetTypeValidationAdapter(object);
      }
      @Override
      public Adapter caseSequenceType(SequenceType object)
      {
        return createSequenceTypeValidationAdapter(object);
      }
      @Override
      public Adapter caseSetType(SetType object)
      {
        return createSetTypeValidationAdapter(object);
      }
      @Override
      public Adapter casePrimitive(Primitive object)
      {
        return createPrimitiveValidationAdapter(object);
      }
      @Override
      public Adapter caseStringType(StringType object)
      {
        return createStringTypeValidationAdapter(object);
      }
      @Override
      public Adapter caseBooleanType(BooleanType object)
      {
        return createBooleanTypeValidationAdapter(object);
      }
      @Override
      public Adapter caseNumericType(NumericType object)
      {
        return createNumericTypeValidationAdapter(object);
      }
      @Override
      public Adapter caseIntegerType(IntegerType object)
      {
        return createIntegerTypeValidationAdapter(object);
      }
      @Override
      public Adapter caseRealType(RealType object)
      {
        return createRealTypeValidationAdapter(object);
      }
      @Override
      public Adapter caseOclAnyType(OclAnyType object)
      {
        return createOclAnyTypeValidationAdapter(object);
      }
      @Override
      public Adapter caseTupleType(TupleType object)
      {
        return createTupleTypeValidationAdapter(object);
      }
      @Override
      public Adapter caseTupleTypeAttribute(TupleTypeAttribute object)
      {
        return createTupleTypeAttributeValidationAdapter(object);
      }
      @Override
      public Adapter caseOclModelElement(OclModelElement object)
      {
        return createOclModelElementValidationAdapter(object);
      }
      @Override
      public Adapter caseMapType(MapType object)
      {
        return createMapTypeValidationAdapter(object);
      }
      @Override
      public Adapter caseBoolOpCallExp(BoolOpCallExp object)
      {
        return createBoolOpCallExpValidationAdapter(object);
      }
      @Override
      public Adapter caseEqOpCallExp(EqOpCallExp object)
      {
        return createEqOpCallExpValidationAdapter(object);
      }
      @Override
      public Adapter caseRelOpCallExp(RelOpCallExp object)
      {
        return createRelOpCallExpValidationAdapter(object);
      }
      @Override
      public Adapter caseAddOpCallExp(AddOpCallExp object)
      {
        return createAddOpCallExpValidationAdapter(object);
      }
      @Override
      public Adapter caseIntOpCallExp(IntOpCallExp object)
      {
        return createIntOpCallExpValidationAdapter(object);
      }
      @Override
      public Adapter caseMulOpCallExp(MulOpCallExp object)
      {
        return createMulOpCallExpValidationAdapter(object);
      }
      @Override
      public Adapter defaultCase(EObject object)
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
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Module
   * @generated
   */
  public Adapter createModuleValidationAdapter(Module target)
  {
    return new Module(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Import
   * @generated
   */
  public Adapter createImportValidationAdapter(Import target)
  {
    return new Import(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.ModuleElement <em>ModuleElement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.ModuleElement
   * @generated
   */
  public Adapter createModuleElementValidationAdapter(ModuleElement target)
  {
    return new ModuleElement(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclModuleElement <em>OclModuleElement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclModuleElement
   * @generated
   */
  public Adapter createOclModuleElementValidationAdapter(OclModuleElement target)
  {
    return new OclModuleElement(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclFeatureDefinition <em>OclFeatureDefinition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclFeatureDefinition
   * @generated
   */
  public Adapter createOclFeatureDefinitionValidationAdapter(OclFeatureDefinition target)
  {
    return new OclFeatureDefinition(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Attribute
   * @generated
   */
  public Adapter createAttributeValidationAdapter(Attribute target)
  {
    return new Attribute(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Operation
   * @generated
   */
  public Adapter createOperationValidationAdapter(Operation target)
  {
    return new Operation(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Parameter
   * @generated
   */
  public Adapter createParameterValidationAdapter(Parameter target)
  {
    return new Parameter(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclInvariant <em>OclInvariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclInvariant
   * @generated
   */
  public Adapter createOclInvariantValidationAdapter(OclInvariant target)
  {
    return new OclInvariant(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclExpression <em>OclExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclExpression
   * @generated
   */
  public Adapter createOclExpressionValidationAdapter(OclExpression target)
  {
    return new OclExpression(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclModelElementExp <em>OclModelElementExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclModelElementExp
   * @generated
   */
  public Adapter createOclModelElementExpValidationAdapter(OclModelElementExp target)
  {
    return new OclModelElementExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OperatorCallExp <em>OperatorCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OperatorCallExp
   * @generated
   */
  public Adapter createOperatorCallExpValidationAdapter(OperatorCallExp target)
  {
    return new OperatorCallExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.PropertyCallExp <em>PropertyCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.PropertyCallExp
   * @generated
   */
  public Adapter createPropertyCallExpValidationAdapter(PropertyCallExp target)
  {
    return new PropertyCallExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Auxiliary <em>Auxiliary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Auxiliary
   * @generated
   */
  public Adapter createAuxiliaryValidationAdapter(Auxiliary target)
  {
    return new Auxiliary(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.VariableExp <em>VariableExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.VariableExp
   * @generated
   */
  public Adapter createVariableExpValidationAdapter(VariableExp target)
  {
    return new VariableExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.VariableDeclaration <em>VariableDeclaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationValidationAdapter(VariableDeclaration target)
  {
    return new VariableDeclaration(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.SuperExp <em>SuperExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.SuperExp
   * @generated
   */
  public Adapter createSuperExpValidationAdapter(SuperExp target)
  {
    return new SuperExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.SelfExp <em>SelfExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.SelfExp
   * @generated
   */
  public Adapter createSelfExpValidationAdapter(SelfExp target)
  {
    return new SelfExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.StringExp <em>StringExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.StringExp
   * @generated
   */
  public Adapter createStringExpValidationAdapter(StringExp target)
  {
    return new StringExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.NumericExp <em>NumericExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.NumericExp
   * @generated
   */
  public Adapter createNumericExpValidationAdapter(NumericExp target)
  {
    return new NumericExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.RealExp <em>RealExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.RealExp
   * @generated
   */
  public Adapter createRealExpValidationAdapter(RealExp target)
  {
    return new RealExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.IntegerExp <em>IntegerExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.IntegerExp
   * @generated
   */
  public Adapter createIntegerExpValidationAdapter(IntegerExp target)
  {
    return new IntegerExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.BagExp <em>BagExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.BagExp
   * @generated
   */
  public Adapter createBagExpValidationAdapter(BagExp target)
  {
    return new BagExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OrderedSetExp <em>OrderedSetExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OrderedSetExp
   * @generated
   */
  public Adapter createOrderedSetExpValidationAdapter(OrderedSetExp target)
  {
    return new OrderedSetExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.SequenceExp <em>SequenceExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.SequenceExp
   * @generated
   */
  public Adapter createSequenceExpValidationAdapter(SequenceExp target)
  {
    return new SequenceExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.SetExp <em>SetExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.SetExp
   * @generated
   */
  public Adapter createSetExpValidationAdapter(SetExp target)
  {
    return new SetExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.TupleExp <em>TupleExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.TupleExp
   * @generated
   */
  public Adapter createTupleExpValidationAdapter(TupleExp target)
  {
    return new TupleExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.TuplePart <em>TuplePart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.TuplePart
   * @generated
   */
  public Adapter createTuplePartValidationAdapter(TuplePart target)
  {
    return new TuplePart(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.MapExp <em>MapExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.MapExp
   * @generated
   */
  public Adapter createMapExpValidationAdapter(MapExp target)
  {
    return new MapExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.MapElement <em>MapElement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.MapElement
   * @generated
   */
  public Adapter createMapElementValidationAdapter(MapElement target)
  {
    return new MapElement(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.EnumLiteralExp <em>EnumLiteralExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.EnumLiteralExp
   * @generated
   */
  public Adapter createEnumLiteralExpValidationAdapter(EnumLiteralExp target)
  {
    return new EnumLiteralExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclUndefinedExp <em>OclUndefinedExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclUndefinedExp
   * @generated
   */
  public Adapter createOclUndefinedExpValidationAdapter(OclUndefinedExp target)
  {
    return new OclUndefinedExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.LetExp <em>LetExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.LetExp
   * @generated
   */
  public Adapter createLetExpValidationAdapter(LetExp target)
  {
    return new LetExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.IfExp <em>IfExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.IfExp
   * @generated
   */
  public Adapter createIfExpValidationAdapter(IfExp target)
  {
    return new IfExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.BraceExp <em>BraceExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.BraceExp
   * @generated
   */
  public Adapter createBraceExpValidationAdapter(BraceExp target)
  {
    return new BraceExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.BooleanExp <em>BooleanExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.BooleanExp
   * @generated
   */
  public Adapter createBooleanExpValidationAdapter(BooleanExp target)
  {
    return new BooleanExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.PropertyCall <em>PropertyCall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.PropertyCall
   * @generated
   */
  public Adapter createPropertyCallValidationAdapter(PropertyCall target)
  {
    return new PropertyCall(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OperationCall <em>OperationCall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OperationCall
   * @generated
   */
  public Adapter createOperationCallValidationAdapter(OperationCall target)
  {
    return new OperationCall(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.NavigationOrAttributeCall <em>NavigationOrAttributeCall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.NavigationOrAttributeCall
   * @generated
   */
  public Adapter createNavigationOrAttributeCallValidationAdapter(NavigationOrAttributeCall target)
  {
    return new NavigationOrAttributeCall(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.IterateExp <em>IterateExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.IterateExp
   * @generated
   */
  public Adapter createIterateExpValidationAdapter(IterateExp target)
  {
    return new IterateExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Iterator <em>Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Iterator
   * @generated
   */
  public Adapter createIteratorValidationAdapter(Iterator target)
  {
    return new Iterator(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.IteratorExp <em>IteratorExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.IteratorExp
   * @generated
   */
  public Adapter createIteratorExpValidationAdapter(IteratorExp target)
  {
    return new IteratorExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.CollectionOperationCall <em>CollectionOperationCall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.CollectionOperationCall
   * @generated
   */
  public Adapter createCollectionOperationCallValidationAdapter(CollectionOperationCall target)
  {
    return new CollectionOperationCall(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.LocalVariable <em>LocalVariable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.LocalVariable
   * @generated
   */
  public Adapter createLocalVariableValidationAdapter(LocalVariable target)
  {
    return new LocalVariable(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclType <em>OclType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclType
   * @generated
   */
  public Adapter createOclTypeValidationAdapter(OclType target)
  {
    return new OclType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.CollectionType <em>CollectionType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.CollectionType
   * @generated
   */
  public Adapter createCollectionTypeValidationAdapter(CollectionType target)
  {
    return new CollectionType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.BagType <em>BagType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.BagType
   * @generated
   */
  public Adapter createBagTypeValidationAdapter(BagType target)
  {
    return new BagType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OrderedSetType <em>OrderedSetType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OrderedSetType
   * @generated
   */
  public Adapter createOrderedSetTypeValidationAdapter(OrderedSetType target)
  {
    return new OrderedSetType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.SequenceType <em>SequenceType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.SequenceType
   * @generated
   */
  public Adapter createSequenceTypeValidationAdapter(SequenceType target)
  {
    return new SequenceType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.SetType <em>SetType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.SetType
   * @generated
   */
  public Adapter createSetTypeValidationAdapter(SetType target)
  {
    return new SetType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.Primitive
   * @generated
   */
  public Adapter createPrimitiveValidationAdapter(Primitive target)
  {
    return new Primitive(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.StringType <em>StringType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.StringType
   * @generated
   */
  public Adapter createStringTypeValidationAdapter(StringType target)
  {
    return new StringType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.BooleanType <em>BooleanType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.BooleanType
   * @generated
   */
  public Adapter createBooleanTypeValidationAdapter(BooleanType target)
  {
    return new BooleanType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.NumericType <em>NumericType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.NumericType
   * @generated
   */
  public Adapter createNumericTypeValidationAdapter(NumericType target)
  {
    return new NumericType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.IntegerType <em>IntegerType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.IntegerType
   * @generated
   */
  public Adapter createIntegerTypeValidationAdapter(IntegerType target)
  {
    return new IntegerType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.RealType <em>RealType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.RealType
   * @generated
   */
  public Adapter createRealTypeValidationAdapter(RealType target)
  {
    return new RealType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclAnyType <em>OclAnyType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclAnyType
   * @generated
   */
  public Adapter createOclAnyTypeValidationAdapter(OclAnyType target)
  {
    return new OclAnyType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.TupleType <em>TupleType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.TupleType
   * @generated
   */
  public Adapter createTupleTypeValidationAdapter(TupleType target)
  {
    return new TupleType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.TupleTypeAttribute <em>TupleTypeAttribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.TupleTypeAttribute
   * @generated
   */
  public Adapter createTupleTypeAttributeValidationAdapter(TupleTypeAttribute target)
  {
    return new TupleTypeAttribute(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.OclModelElement <em>OclModelElement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.OclModelElement
   * @generated
   */
  public Adapter createOclModelElementValidationAdapter(OclModelElement target)
  {
    return new OclModelElement(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.MapType <em>MapType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.MapType
   * @generated
   */
  public Adapter createMapTypeValidationAdapter(MapType target)
  {
    return new MapType(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.BoolOpCallExp <em>BoolOpCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.BoolOpCallExp
   * @generated
   */
  public Adapter createBoolOpCallExpValidationAdapter(BoolOpCallExp target)
  {
    return new BoolOpCallExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.EqOpCallExp <em>EqOpCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.EqOpCallExp
   * @generated
   */
  public Adapter createEqOpCallExpValidationAdapter(EqOpCallExp target)
  {
    return new EqOpCallExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.RelOpCallExp <em>RelOpCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.RelOpCallExp
   * @generated
   */
  public Adapter createRelOpCallExpValidationAdapter(RelOpCallExp target)
  {
    return new RelOpCallExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.AddOpCallExp <em>AddOpCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.AddOpCallExp
   * @generated
   */
  public Adapter createAddOpCallExpValidationAdapter(AddOpCallExp target)
  {
    return new AddOpCallExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.IntOpCallExp <em>IntOpCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.IntOpCallExp
   * @generated
   */
  public Adapter createIntOpCallExpValidationAdapter(IntOpCallExp target)
  {
    return new IntOpCallExp(target);
  }

  /**
   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.MulOpCallExp <em>MulOpCallExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.enseeiht.ocl.xtext.ocl.MulOpCallExp
   * @generated
   */
  public Adapter createMulOpCallExpValidationAdapter(MulOpCallExp target)
  {
    return new MulOpCallExp(target);
  }

}