package fdv.tools.fb;

import java.awt.Rectangle;

import com.github.typemarkup.Responsibility;

public class ActorModel {

	@Responsibility("Хранит полный размер картинки")
	private Rectangle fullImageBounds;

	@Responsibility("Расстояние от рисунка до границ картинки")
	private int margin;

	@Responsibility("Смещение в пикселях от начала картинки до центра головы")
	private int headIndent;

	@Responsibility("Смещение в пикселях от центра головы до отрисовки рук")
	private int handIndent;

	@Responsibility("Смещение в пикселях от отрисовки рук, до отрисовки ног")
	private int footIndent;

	public Rectangle getFullImageSize() {
		return fullImageBounds;
	}

	public void setFullImageBounds(Rectangle fullImageBounds) {
		this.fullImageBounds = fullImageBounds;
	}

	public int getMargin() {
		return margin;
	}

	public void setMargin(int margin) {
		this.margin = margin;
	}

	public int getHeadIndent() {
		return headIndent;
	}

	public void setHeadIndent(int headIndent) {
		this.headIndent = headIndent;
	}

	public int getHandIndent() {
		return handIndent;
	}

	public void setHandIndent(int handIndent) {
		this.handIndent = handIndent;
	}

	public int getFootIndent() {
		return footIndent;
	}

	public void setFootIndent(int footIndent) {
		this.footIndent = footIndent;
	}

	public double getHeadRadius() {
		return headIndent;
	}

	public double getHeadLeftUpperCornerX() {
		return getXCenter() - getHeadIndent();
	}

	public double getHeadLeftUpperCornerY() {
		return fullImageBounds.getY() + margin;
	}

	public void setFullImageBounds(int x, int y, int width, int height) {
		setFullImageBounds(new Rectangle(x, y, width, height));
	}

	public double getXCenter() {
		return fullImageBounds.x + fullImageBounds.getWidth() / 2;
	}

	public double getNeckLineStartX() {
		return getXCenter();
	}

	public int getNeckLineStartY() {
		return fullImageBounds.y + margin + 2 * headIndent;
	}

	public double getNeckLineEndX() {
		return getXCenter();
	}

	public double getNeckLineEndY() {
		return getNeckLineStartY() + getHandIndent();
	}

}