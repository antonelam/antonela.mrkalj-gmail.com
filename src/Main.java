import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.time.format.DateTimeFormatter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) {
		try {
			String main_path = "C:\\Users\\antonela.mrkalj\\git\\xml_generate\\TEST";
			FileManipulation filegenerate = new FileManipulation(main_path);
			filegenerate.startMetadataExtraction();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
