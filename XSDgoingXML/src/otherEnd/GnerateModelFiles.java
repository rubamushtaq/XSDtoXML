package otherEnd;

public class GnerateModelFiles {
	public static void main(String[] args) {
		//1 . we have xsd files
		//2 run command xjc -p model E:\Ruba\eclipseMars\practiceWS\XSDgoingXML\src\schemaFile\customer.xsd
		//3 this will generate files on model folder of current directory 
		
		//Observation
		/**
		 * When you run this command , you will have
		 * Root file, domain file aloing with Object factory
		 * This will help us to create an XML from java . This informatiob which is put on those classes
		 * will be used by JAXB 
		 * 
		 * Anatomy of Class from XSD
		 * --------------------------
		 * 1. Element which has anonymous complexed type will be a root element
		 * 2. 
		 */
	}
}
