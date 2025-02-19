package fr.enseeiht.ocl.xtext.ocl.adapter.templates;

import java.util.List;

public class AdapterFactoryTemplate
{
  protected static String nl;
  public static synchronized AdapterFactoryTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    AdapterFactoryTemplate result = new AdapterFactoryTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package fr.enseeiht.ocl.xtext.ocl.adapter.util;" + NL;
  protected final String TEXT_2 = NL + "import fr.enseeiht.ocl.xtext.ocl.";
  protected final String TEXT_3 = ";";
  protected final String TEXT_4 = NL + "import fr.enseeiht.ocl.xtext.ocl.adapter.impl.";
  protected final String TEXT_5 = "ValidationAdapter;";
  protected final String TEXT_6 = NL + NL + "import fr.enseeiht.ocl.xtext.ocl.OclPackage;" + NL + "import org.eclipse.emf.ecore.EObject;" + NL + "import fr.enseeiht.ocl.xtext.ocl.util.OclSwitch;" + NL + "import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;" + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * The <b>ValidationAdapter Factory</b> for the model." + NL + " * It provides an adapter <code>createXXXValidationAdapter</code> method for each class of the model." + NL + " * <!-- end-user-doc -->" + NL + " * @see fr.enseeiht.ocl.xtext.ocl.OclPackage" + NL + " * @generated" + NL + " */" + NL + "public class OCLValidationAdapterFactory" + NL + "{" + NL + "  public final static OCLValidationAdapterFactory INSTANCE = new OCLValidationAdapterFactory();" + NL + "  /**" + NL + "   * The cached model package." + NL + "   * <!-- begin-user-doc -->" + NL + "   * <!-- end-user-doc -->" + NL + "   * @generated" + NL + "   */" + NL + "  protected static OclPackage modelPackage;" + NL + "" + NL + "  /**" + NL + "   * Creates an instance of the adapter factory." + NL + "   * <!-- begin-user-doc -->" + NL + "   * <!-- end-user-doc -->" + NL + "   * @generated" + NL + "   */" + NL + "  private OCLValidationAdapterFactory()" + NL + "  {" + NL + "    if (modelPackage == null)" + NL + "    {" + NL + "      modelPackage = OclPackage.eINSTANCE;" + NL + "    }" + NL + "  }" + NL + "" + NL + "  /**" + NL + "   * Returns whether this factory is applicable for the type of the object." + NL + "   * <!-- begin-user-doc -->" + NL + "   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model." + NL + "   * <!-- end-user-doc -->" + NL + "   * @return whether this factory is applicable for the type of the object." + NL + "   * @generated" + NL + "   */" + NL + "  public boolean isFactoryForType(Object object)" + NL + "  {" + NL + "    if (object == modelPackage)" + NL + "    {" + NL + "      return true;" + NL + "    }" + NL + "    if (object instanceof EObject)" + NL + "    {" + NL + "      return ((EObject)object).eClass().getEPackage() == modelPackage;" + NL + "    }" + NL + "    return false;" + NL + "  }" + NL + "" + NL + "  /**" + NL + "   * The switch that delegates to the <code>createXXX</code> methods." + NL + "   * <!-- begin-user-doc -->" + NL + "   * <!-- end-user-doc -->" + NL + "   * @generated" + NL + "   */" + NL + "  protected OclSwitch<OCLAdapter> modelSwitch =" + NL + "    new OclSwitch<OCLAdapter>()" + NL + "    {";
  protected final String TEXT_7 = NL + "      @Override" + NL + "      public OCLAdapter case";
  protected final String TEXT_8 = "(";
  protected final String TEXT_9 = " object)" + NL + "      {" + NL + "        return create";
  protected final String TEXT_10 = "ValidationAdapter(object);" + NL + "      }";
  protected final String TEXT_11 = NL + "      @Override" + NL + "      public OCLAdapter defaultCase(EObject object)" + NL + "      {" + NL + "        return createEObjectAdapter();" + NL + "      }" + NL + "    };" + NL + "" + NL + "  /**" + NL + "   * Creates an adapter for the <code>target</code>." + NL + "   * <!-- begin-user-doc -->" + NL + "   * <!-- end-user-doc -->" + NL + "   * @param target the object to adapt." + NL + "   * @return the adapter for the <code>target</code>." + NL + "   * @generated" + NL + "   */" + NL + "  public OCLAdapter createEObjectAdapter()" + NL + "  {" + NL + "    return null;" + NL + "  }" + NL + "" + NL + "  /**" + NL + "   * Creates an adapter for the <code>target</code>." + NL + "   * <!-- begin-user-doc -->" + NL + "   * <!-- end-user-doc -->" + NL + "   * @param target the object to adapt." + NL + "   * @return the adapter for the <code>target</code>." + NL + "   * @generated" + NL + "   */" + NL + "  public OCLAdapter createAdapter(EObject target)" + NL + "  {" + NL + "    return modelSwitch.doSwitch(target);" + NL + "  }";
  protected final String TEXT_12 = NL + "  /**" + NL + "   * Creates a new validation adapter for an object of class '{@link fr.enseeiht.ocl.xtext.ocl.";
  protected final String TEXT_13 = " <em>";
  protected final String TEXT_14 = "</em>}'." + NL + "   * <!-- begin-user-doc -->" + NL + "   * <!-- end-user-doc -->" + NL + "   * @return the new adapter." + NL + "   * @see fr.enseeiht.ocl.xtext.ocl.";
  protected final String TEXT_15 = NL + "   * @generated" + NL + "   */" + NL + "  public OCLAdapter create";
  protected final String TEXT_16 = "ValidationAdapter(";
  protected final String TEXT_17 = " target)" + NL + "  {" + NL + "    return new ";
  protected final String TEXT_18 = "ValidationAdapter(target);" + NL + "  }" + NL;
  protected final String TEXT_19 = NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     @SuppressWarnings("unchecked")
List<String> classNames = (List<String>) argument; 
    stringBuffer.append(TEXT_1);
    for (String className : classNames) {
    stringBuffer.append(TEXT_2);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_3);
    }
    for (String className : classNames) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_5);
    }
    stringBuffer.append(TEXT_6);
    for (String className : classNames) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    for (String className : classNames) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_18);
    }
    stringBuffer.append(TEXT_19);
    return stringBuffer.toString();
  }
}
