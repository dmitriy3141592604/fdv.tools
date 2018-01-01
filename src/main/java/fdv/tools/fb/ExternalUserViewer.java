package fdv.tools.fb;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.JPanel;

import fdv.tools.support.swing.SimpleWindowBase;

public class ExternalUserViewer extends SimpleWindowBase {

	private static final long serialVersionUID = -8330652450871815839L;

	public static void main(String... args) {
		new ExternalUserViewer().run();
	}

	@Override
	public void init() {
		final ActorModel am = new ActorModel();
		am.setFullImageBounds(new Rectangle(10, 10, 60, 85));
		am.setHeadIndent(8);
		am.setHandIndent(15);
		am.setFootIndent(26);
		am.setMargin(4);
		add(new JPanel() {

			private static final long serialVersionUID = 1071265941703010108L;

			@Override
			protected void paintChildren(Graphics graphics) {
				super.paintChildren(graphics);
				final Graphics2D g = (Graphics2D) graphics;
				g.drawRect(10, 10, 60, 85);
				g.drawRect(14, 14, 52, 77);

				{
					{
						final double headX = am.getHeadLeftUpperCornerX();
						final double headY = am.getHeadLeftUpperCornerY();
						final double headRadius = am.getHeadRadius();
						final Double double1 = new Ellipse2D.Double(headX, headY, headRadius * 2, headRadius * 2);
						g.draw(double1);
					}
					{
						g.drawLine((int) am.getNeckLineStartX(), am.getNeckLineStartY(), (int) am.getNeckLineEndX(), (int) am.getNeckLineEndY());
					}
				}
			}

		});
	}

}
