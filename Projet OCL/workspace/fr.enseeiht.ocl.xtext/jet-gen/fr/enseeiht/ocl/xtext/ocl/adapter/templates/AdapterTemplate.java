package fr.enseeiht.ocl.xtext.ocl.adapter.templates;

public class AdapterTemplate
{
  protected static String nl;
  public static synchronized AdapterTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    AdapterTemplate result = new AdapterTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " ";
  protected final String TEXT_2 = NL + NL + NL + "package fr.enseeiht.ocl.xtext.ocl.adapter.impl;" + NL + "" + NL + "import org.eclipse.emf.ecore.EObject;" + NL + "import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;" + NL + "import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;" + NL + "import fr.enseeiht.ocl.xtext.ocl.";
  protected final String TEXT_3 = ";" + NL + "import fr.enseeiht.ocl.xtext.OCLType;" + NL + "/**" + NL + " * OCLAdapter for ";
  protected final String TEXT_4 = NL + " * @generated" + NL + " */" + NL + "public final class ";
  protected final String TEXT_5 = "ValidationAdapter implements OCLAdapter {" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_6 = " target;" + NL + "\t/**" + NL + "\t * Private constructor." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_7 = "ValidationAdapter() {}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_8 = "ValidationAdapter(";
  protected final String TEXT_9 = " object) {" + NL + "\t\tthis.target = object;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Returns the value of the element given its context" + NL + "\t * @param Target" + NL + "\t * @return value of the element" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getValue(EObject contextTarget) {" + NL + "\t\tthrow new UnimplementedException(\"La methode getValue de ";
  protected final String TEXT_10 = "Adapter n'as pas encore été implémentée\");" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Get the type of the element" + NL + "\t * @return type of the element" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic OCLType getType() {" + NL + "\t\tthrow new UnimplementedException(\"La methode getType de ";
  protected final String TEXT_11 = "Adapter n'as pas encore été implémentée\");" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Get adapted element" + NL + "\t * @return adapted element" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic EObject getElement() {" + NL + "\t\treturn this.target;" + NL + "\t}" + NL + " }";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_11);
    return stringBuffer.toString();
  }
}
