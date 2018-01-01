package fdv.tools.fb;

import java.awt.Color;
import java.awt.Font;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fdv.tools.support.image.GraphicsWrapper;
import fdv.tools.support.image.WritableImage;

class FontBoundsLogic extends GraphicsWrapper implements Runnable {

	public FontBoundsLogic(WritableImage image) {
		super(image);
	}

	@Override
	public void run() {
		setBackgrounColor(Color.WHITE);

		setFont(new Font("Times", Font.PLAIN, 20));

		drawDecoratedString("Привет", 20, 50, 10);
	}
}

public class FontBounds {

	protected static boolean showCornerEnds = true;

	private final static Logger logger = LoggerFactory.getLogger(FontBounds.class);

	public static void main(String... args) throws Exception {

		logger.warn("Start");
		try (WritableImage image = new WritableImage("font-align-out/image1.png", 500, 400)) {

			new FontBoundsLogic(image).run();

		} finally {
			logger.warn("Complete");
		}
	}

}
