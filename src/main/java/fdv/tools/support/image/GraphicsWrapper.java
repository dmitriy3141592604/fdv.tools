package fdv.tools.support.image;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GraphicsWrapper {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	private final WritableImage image;

	private final Graphics2D g;

	public GraphicsWrapper(WritableImage image) {
		this.image = image;
		this.g = getGraphics(image);
	}

	public void setBackgrounColor(Color color) {
		final Graphics2D g = getGraphics(image);
		final Paint oldPaint = g.getPaint();
		try {
			g.setPaint(color);
			g.fillRect(0, 0, image.getWidth(), image.getHeight());
		} finally {
			g.setPaint(oldPaint);
		}

	}

	static Graphics2D getGraphics(WritableImage image) {
		return (Graphics2D) image.getGraphics();
	}

	public void setFont(Font font) {
		getGraphics(image).setFont(font);
	}

	public Rectangle drawDecoratedString(String message, int x, int y, int margin) {
		final FontMetrics fm = g.getFontMetrics();
		final Rectangle2D stringBounds = fm.getStringBounds(message, g);
		final int stringHeight = (int) stringBounds.getHeight();
		final int stringWidth = (int) stringBounds.getWidth();

		logger.warn("stringBounds: {}", stringBounds);

		g.setPaint(Color.BLACK);
		g.drawString(message, x, y);
		final int rectangleX = x - margin;
		final int rectanbleY = y - stringHeight - margin;
		final int rectangleWidth = stringWidth + margin * 2;
		final int rectangleHeight = stringHeight + margin * 2;

		g.drawRect(rectangleX, rectanbleY, rectangleWidth, rectangleHeight);
		return new Rectangle(rectangleX, rectanbleY, rectangleWidth, rectangleHeight);
	};
}
