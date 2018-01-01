package fdv.tools.fb;

import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// [x=0.0,y=-12.064453,w=41.0,h=15.09375]
public class FontBoundsAtOtherImage {

	public static void main(String... args) {
		final Logger logger = LoggerFactory.getLogger(FontBoundsAtOtherImage.class);
		final BufferedImage bi = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
		final Graphics2D g = (Graphics2D) bi.getGraphics();
		final FontMetrics fm = g.getFontMetrics();
		final Rectangle2D stringBounds = fm.getStringBounds("Привет", g);

		logger.warn("stringBounds: {}", stringBounds);
	}

}
