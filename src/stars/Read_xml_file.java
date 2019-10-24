package stars;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Read_xml_file {

	public static void main(String[] args) {
		
		File file= new File("C:\\Users\\Nitin\\eclipse-workspace\\selenium\\src\\Test.xml");
		DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder db= dbf.newDocumentBuilder();
			Document doc= db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println(doc.getDocumentElement().getNodeName());
			NodeList nodelist = doc.getElementsByTagName("student");
			Node node= nodelist.item(0);
			Element ele= (Element)node;
			
			
		/*	System.out.println(ele.getElementsByTagName("id").item(0).getTextContent());
			System.out.println(ele.getElementsByTagName("firstname").item(0).getTextContent());
			System.out.println(ele.getElementsByTagName("lastname").item(0).getTextContent());
			System.out.println(ele.getElementsByTagName("subject").item(0).getTextContent());
			System.out.println(ele.getElementsByTagName("marks").item(0).getTextContent());*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//for(int node=0;node<nodelist.getLength();node++) 
			
			
			
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
			
	
		
		

	

}
	}

