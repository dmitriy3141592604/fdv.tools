package fdv.tools.fb;

import java.awt.Color;
import java.awt.Font;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fdv.tools.support.image.GraphicsWrapper;
import fdv.tools.support.image.WritableImage;

public class FontBounds {

	protected static boolean showCornerEnds = true;

	private final static Logger logger = LoggerFactory.getLogger(FontBounds.class);

	public static void main(String... args) throws Exception {
		logger.warn("Start");
		try (WritableImage image = new WritableImage("font-align-out/image1.png", 500, 400)) {

			final GraphicsWrapper gw = new GraphicsWrapper(image);

			gw.setBackgrounColor(Color.WHITE);

			gw.setFont(new Font("Arail", Font.PLAIN, 19));
			gw.drawDecoratedString("Привет", 20, 50, 10);

		} finally {
			logger.warn("Complete");
		}
	}

}
