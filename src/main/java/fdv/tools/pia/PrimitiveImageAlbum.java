package fdv.tools.pia;

import java.io.InputStream;
import java.io.StringReader;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import com.thoughtworks.xstream.XStream;

import ch.qos.logback.classic.Logger;
import fdv.tools.support.AbstractTool;

public class PrimitiveImageAlbum extends AbstractTool<PrimitiveImageAlbumContext> {

	public static void main(String... args) {
		new PrimitiveImageAlbum().accept(args);
	}

	@Override
	public void accept(String[] args) {
		execute(new PrimitiveImageAlbumContext().parse(args));
	}

	private void execute(PrimitiveImageAlbumContext ctx) {
		try {
			final XStream xStream = new XStream();
			xStream.autodetectAnnotations(true);
			xStream.omitField(Logger.class, "logger");
			final String xml = xStream.toXML(ctx);
			System.out.println(xml);
			final TransformerFactory transformerFactory = TransformerFactory.newInstance();

			final InputStream xsltInputStream = this.getClass().getClassLoader().getResourceAsStream("fdv/tools/pia/primitive-image-album.xslt");
			if (xsltInputStream == null) {
				throw new IllegalStateException();
			}

			final Transformer transformer = transformerFactory.newTransformer(new StreamSource(xsltInputStream));
			transformer.transform(new StreamSource(new StringReader(xml)), new StreamResult(System.out));
		} catch (final Exception exception) {
			throw new RuntimeException(exception);
		}

	}

}
