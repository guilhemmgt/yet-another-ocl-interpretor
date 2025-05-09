/**
 * generated by Xtext
 */
package fr.enseeiht.ocl.xtext.ocl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.enseeiht.ocl.xtext.ocl.OclPackage
 * @generated
 */
public interface OclFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OclFactory eINSTANCE = fr.enseeiht.ocl.xtext.ocl.impl.OclFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Context Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Block</em>'.
   * @generated
   */
  OclContextBlock createOclContextBlock();

  /**
   * Returns a new object of class '<em>Feature Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Definition</em>'.
   * @generated
   */
  OclFeatureDefinition createOclFeatureDefinition();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Invariant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invariant</em>'.
   * @generated
   */
  OclInvariant createOclInvariant();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  OclExpression createOclExpression();

  /**
   * Returns a new object of class '<em>Model Element Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Element Exp</em>'.
   * @generated
   */
  OclModelElementExp createOclModelElementExp();

  /**
   * Returns a new object of class '<em>Operator Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Call Exp</em>'.
   * @generated
   */
  OperatorCallExp createOperatorCallExp();

  /**
   * Returns a new object of class '<em>Eq Op Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Eq Op Call Exp</em>'.
   * @generated
   */
  EqOpCallExp createEqOpCallExp();

  /**
   * Returns a new object of class '<em>Rel Op Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rel Op Call Exp</em>'.
   * @generated
   */
  RelOpCallExp createRelOpCallExp();

  /**
   * Returns a new object of class '<em>Add Op Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Op Call Exp</em>'.
   * @generated
   */
  AddOpCallExp createAddOpCallExp();

  /**
   * Returns a new object of class '<em>Int Op Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Op Call Exp</em>'.
   * @generated
   */
  IntOpCallExp createIntOpCallExp();

  /**
   * Returns a new object of class '<em>Mul Op Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mul Op Call Exp</em>'.
   * @generated
   */
  MulOpCallExp createMulOpCallExp();

  /**
   * Returns a new object of class '<em>Not Op Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Op Call Exp</em>'.
   * @generated
   */
  NotOpCallExp createNotOpCallExp();

  /**
   * Returns a new object of class '<em>Property Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Call Exp</em>'.
   * @generated
   */
  PropertyCallExp createPropertyCallExp();

  /**
   * Returns a new object of class '<em>Auxiliary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Auxiliary</em>'.
   * @generated
   */
  Auxiliary createAuxiliary();

  /**
   * Returns a new object of class '<em>Variable Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Exp</em>'.
   * @generated
   */
  VariableExp createVariableExp();

  /**
   * Returns a new object of class '<em>Self Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Self Literal Exp</em>'.
   * @generated
   */
  SelfLiteralExp createSelfLiteralExp();

  /**
   * Returns a new object of class '<em>Null Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal Exp</em>'.
   * @generated
   */
  NullLiteralExp createNullLiteralExp();

  /**
   * Returns a new object of class '<em>String Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal Exp</em>'.
   * @generated
   */
  StringLiteralExp createStringLiteralExp();

  /**
   * Returns a new object of class '<em>Numeric Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Literal Exp</em>'.
   * @generated
   */
  NumericLiteralExp createNumericLiteralExp();

  /**
   * Returns a new object of class '<em>Real Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Literal Exp</em>'.
   * @generated
   */
  RealLiteralExp createRealLiteralExp();

  /**
   * Returns a new object of class '<em>Integer Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Literal Exp</em>'.
   * @generated
   */
  IntegerLiteralExp createIntegerLiteralExp();

  /**
   * Returns a new object of class '<em>Bag Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bag Literal Exp</em>'.
   * @generated
   */
  BagLiteralExp createBagLiteralExp();

  /**
   * Returns a new object of class '<em>Ordered Set Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ordered Set Literal Exp</em>'.
   * @generated
   */
  OrderedSetLiteralExp createOrderedSetLiteralExp();

  /**
   * Returns a new object of class '<em>Sequence Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Literal Exp</em>'.
   * @generated
   */
  SequenceLiteralExp createSequenceLiteralExp();

  /**
   * Returns a new object of class '<em>Set Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Literal Exp</em>'.
   * @generated
   */
  SetLiteralExp createSetLiteralExp();

  /**
   * Returns a new object of class '<em>Tuple Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Literal Exp</em>'.
   * @generated
   */
  TupleLiteralExp createTupleLiteralExp();

  /**
   * Returns a new object of class '<em>Tuple Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Part</em>'.
   * @generated
   */
  TuplePart createTuplePart();

  /**
   * Returns a new object of class '<em>Map Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Literal Exp</em>'.
   * @generated
   */
  MapLiteralExp createMapLiteralExp();

  /**
   * Returns a new object of class '<em>Map Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Element</em>'.
   * @generated
   */
  MapElement createMapElement();

  /**
   * Returns a new object of class '<em>Enum Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Literal Exp</em>'.
   * @generated
   */
  EnumLiteralExp createEnumLiteralExp();

  /**
   * Returns a new object of class '<em>Let Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Let Exp</em>'.
   * @generated
   */
  LetExp createLetExp();

  /**
   * Returns a new object of class '<em>If Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Exp</em>'.
   * @generated
   */
  IfExp createIfExp();

  /**
   * Returns a new object of class '<em>Brace Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Brace Exp</em>'.
   * @generated
   */
  BraceExp createBraceExp();

  /**
   * Returns a new object of class '<em>Contextless Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contextless Call Exp</em>'.
   * @generated
   */
  ContextlessCallExp createContextlessCallExp();

  /**
   * Returns a new object of class '<em>Boolean Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal Exp</em>'.
   * @generated
   */
  BooleanLiteralExp createBooleanLiteralExp();

  /**
   * Returns a new object of class '<em>Property Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Call</em>'.
   * @generated
   */
  PropertyCall createPropertyCall();

  /**
   * Returns a new object of class '<em>Operation Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Call</em>'.
   * @generated
   */
  OperationCall createOperationCall();

  /**
   * Returns a new object of class '<em>Navigation Or Attribute Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Navigation Or Attribute Call</em>'.
   * @generated
   */
  NavigationOrAttributeCall createNavigationOrAttributeCall();

  /**
   * Returns a new object of class '<em>Iterate Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iterate Exp</em>'.
   * @generated
   */
  IterateExp createIterateExp();

  /**
   * Returns a new object of class '<em>Iterator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iterator</em>'.
   * @generated
   */
  Iterator createIterator();

  /**
   * Returns a new object of class '<em>Iterator Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iterator Exp</em>'.
   * @generated
   */
  IteratorExp createIteratorExp();

  /**
   * Returns a new object of class '<em>Local Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Variable</em>'.
   * @generated
   */
  LocalVariable createLocalVariable();

  /**
   * Returns a new object of class '<em>Type Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Literal</em>'.
   * @generated
   */
  OclTypeLiteral createOclTypeLiteral();

  /**
   * Returns a new object of class '<em>Collection Type Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Type Literal</em>'.
   * @generated
   */
  CollectionTypeLiteral createCollectionTypeLiteral();

  /**
   * Returns a new object of class '<em>Collection Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Type</em>'.
   * @generated
   */
  CollectionType createCollectionType();

  /**
   * Returns a new object of class '<em>Bag Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bag Type</em>'.
   * @generated
   */
  BagType createBagType();

  /**
   * Returns a new object of class '<em>Ordered Set Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ordered Set Type</em>'.
   * @generated
   */
  OrderedSetType createOrderedSetType();

  /**
   * Returns a new object of class '<em>Sequence Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Type</em>'.
   * @generated
   */
  SequenceType createSequenceType();

  /**
   * Returns a new object of class '<em>Set Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Type</em>'.
   * @generated
   */
  SetType createSetType();

  /**
   * Returns a new object of class '<em>Primitive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive</em>'.
   * @generated
   */
  Primitive createPrimitive();

  /**
   * Returns a new object of class '<em>String Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Type</em>'.
   * @generated
   */
  StringType createStringType();

  /**
   * Returns a new object of class '<em>Boolean Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Type</em>'.
   * @generated
   */
  BooleanType createBooleanType();

  /**
   * Returns a new object of class '<em>Numeric Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Type</em>'.
   * @generated
   */
  NumericType createNumericType();

  /**
   * Returns a new object of class '<em>Integer Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Type</em>'.
   * @generated
   */
  IntegerType createIntegerType();

  /**
   * Returns a new object of class '<em>Real Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Type</em>'.
   * @generated
   */
  RealType createRealType();

  /**
   * Returns a new object of class '<em>Any Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Type</em>'.
   * @generated
   */
  OclAnyType createOclAnyType();

  /**
   * Returns a new object of class '<em>Void Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Void Type</em>'.
   * @generated
   */
  OclVoidType createOclVoidType();

  /**
   * Returns a new object of class '<em>Tuple Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Type</em>'.
   * @generated
   */
  TupleType createTupleType();

  /**
   * Returns a new object of class '<em>Tuple Type Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Type Attribute</em>'.
   * @generated
   */
  TupleTypeAttribute createTupleTypeAttribute();

  /**
   * Returns a new object of class '<em>Model Element Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Element Class</em>'.
   * @generated
   */
  OclModelElementClass createOclModelElementClass();

  /**
   * Returns a new object of class '<em>Map Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Type</em>'.
   * @generated
   */
  MapType createMapType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OclPackage getOclPackage();

} //OclFactory
