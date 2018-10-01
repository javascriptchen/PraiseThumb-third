package com.heima.test;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class MainTest {

	public static void main(String[] args) {
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(new File("src/xml/stus.xml"));
			Element rootElement = document.getRootElement();
			Element selectSingleNode = (Element) rootElement.selectSingleNode("//name");
			System.out.println(selectSingleNode.getText());
		} catch (DocumentException e) {
			
			e.printStackTrace();
		}
	}

}
