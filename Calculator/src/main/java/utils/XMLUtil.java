package utils;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getChartType(String str){
        try{
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("Calculator/src/main/resources/config.xml"));

            NodeList nl = doc.getElementsByTagName("chartType");
            String cName = null;
            switch (str){
                case "+":
                    cName = nl.item(0).getFirstChild().getNodeValue();
                    break;
                case "-":
                    cName = nl.item(1).getFirstChild().getNodeValue();
                    break;
                case "*":
                    cName = nl.item(2).getFirstChild().getNodeValue();
                    break;
                case "/":
                    cName = nl.item(3).getFirstChild().getNodeValue();
                    break;
                default: break;
            }

            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {

    }
}
