package fdv.tools.xslt;

import static javax.xml.transform.TransformerFactory.newInstance;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XSLT1Transformer {

	public static void main(String... args) throws Exception {
		try (final PrintWriter out = new PrintWriter(new FileWriter(args[2]))) {
			final StreamSource inputFile = new StreamSource(new File(args[0]));
			final StreamSource xsltFile = new StreamSource(new File(args[1]));
			final StreamResult result = new StreamResult(out);
			newInstance().newTransformer(xsltFile).transform(inputFile, result);
		}
	}
}
