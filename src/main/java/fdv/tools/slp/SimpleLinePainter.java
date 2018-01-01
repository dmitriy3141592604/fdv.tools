package fdv.tools.slp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class SimpleLinePainter {

	public static void main(String... args) throws Exception {
		final BufferedImage bi = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
		final Graphics2D dd = (Graphics2D) bi.getGraphics();
		dd.setBackground(Color.GREEN);
		bi.getGraphics().setColor(Color.RED);
		dd.setPaint(Color.RED);
		dd.drawLine(10, 10, 30, 30);

		ImageIO.write(bi, "png", new File("img.out.png"));
	}
}
