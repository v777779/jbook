package ch18.ex31.exercise;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class People extends ArrayList<Person> {
    public People(String fileName) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(fileName);   // если файла нет, то создается новый
            Element root = document.getDocumentElement();
            NodeList people = root.getElementsByTagName("person");
            for (int i = 0; i < people.getLength(); i++) {
                NodeList pFirst = ((Element) people.item(i)).getElementsByTagName("first");
                NodeList pLast = ((Element) people.item(i)).getElementsByTagName("last");
                add(new Person((Element) people.item(i)));
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
    }




}
