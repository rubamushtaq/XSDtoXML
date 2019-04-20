package javaToXml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import otherEnd.model.AddressType;
import otherEnd.model.Customer;
import otherEnd.model.ObjectFactory;

public class ConvertJavaToXML {

	public static void main(String[] args) throws JAXBException {

		/**
		 * Purpose is to create an XML from java
		 */
		/**
		 * Convert String to
		 */
		JAXBContext jc = JAXBContext.newInstance("otherEnd.model");
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		AddressType billingAddress = new AddressType();
		billingAddress.setStreet("1 Any Street");
		Customer customer = new Customer();
		customer.setBillingAddress(billingAddress);
		marshaller.marshal(customer, System.out); //marshalled as customer has root element
		ObjectFactory objectFactory = new ObjectFactory();
		
		/**
		 * Marshal with JAXBElement
		 */
		/**
		 * @XmlElementDecl-- what it does
		 * It is generated auto in Object factory which let be created JAXBElement and method to which will create domain objects.
		 * see create billing address
		 */
		JAXBElement<AddressType> je = objectFactory.createBillingAddress(billingAddress);
		marshaller.marshal(je, System.out);
		
		
		/**
		 * Marshal with JAXBElement
		 */
		
		
		/**
		 * If I don't use JAXBElement it will give error as root element is missing,
		 * though there is XMLType element is present there.
		 * 
		 * 	marshaller.marshal(billingAddress, System.out);
		 */
	
		
		
		

	}

}
