package fdv.tools.support.image;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;

public class GraphicsWrapper {

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

	public void drawDecoratedString(String message, int x, int y, int margin) {
		g.setFont(new Font("Arial", Font.PLAIN, 19));
		final FontMetrics fm = g.getFontMetrics();
		final Rectangle2D stringBounds = fm.getStringBounds(message, g);
		final int stringHeight = (int) stringBounds.getHeight();
		final int stringWidth = (int) stringBounds.getWidth();

		g.setPaint(Color.BLACK);
		g.drawString(message, x, y);
		g.drawRect(x - margin, y - stringHeight - margin, stringWidth + margin * 2, stringHeight + margin * 2);
	};
}
