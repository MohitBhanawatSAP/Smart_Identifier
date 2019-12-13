package Hackathon.Smart_Identifier;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Temp {

	public static void main(String[] args)
	{

	
		
			List<String> li_PriorityListOfAttributes=SmartIdentifier.getPriorityListOfAttributesFromLearningDictionary();
			
			
			for(String AttributesPropertiesThreads : li_PriorityListOfAttributes)
			{
				
//				name:=tag,id;;priorityScore:=24, 
//				name:=tag,name;;priorityScore:=20,
				
				String[] arr=AttributesPropertiesThreads.split(";;");

				String[] arr_attributes=(arr[0].replaceAll("name:=", "")).split(",");
				
			}
			
			
			
	}
}
