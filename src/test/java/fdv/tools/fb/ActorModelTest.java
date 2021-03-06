package fdv.tools.fb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.typemarkup.Behavior;

public class ActorModelTest extends ActorModelTestBase {

	@Test
	@Behavior("Можно вычислить x координату цента")
	public void test$xCenter() {
		am.setFullImageBounds(10, 10, 50, 50);

		assertEquals(35, (int) am.getCenterX());
	}

	@Test
	@Behavior("Можно вычислить x координату левого верхнего описывающего прямоугольника")
	public void test$checkHeadXPosition$1() {
		final ActorModel am = new ActorModel();
		am.setHeadIndent(10);
		am.setMargin(12);
		am.setFullImageBounds(10, 10, 50, 50);

		assertEquals(25, (int) am.getHeadLeftUpperCornerX());
	}

	@Test
	@Behavior("Повторная провека координат описывающего прямоугольника")
	public void test$checkHeadXPosition$2() {
		am.setFullImageBounds(20, 20, 80, 80);
		am.setHeadIndent(14);

		assertEquals(46, (int) am.getHeadLeftUpperCornerX());
	}

	@Test
	// TODO Нужен тест с другими параметрами рисунка
	@Behavior("Можно вычислить координату y описывающего прямоугольника")
	public void test$checHeadYPosition$1() {
		am.setFullImageBounds(10, 10, 50, 50);
		am.setMargin(10);
		am.setHeadIndent(12);

		assertEquals(20, (int) am.getHeadLeftUpperCornerY());
	}

	@Test
	@Behavior("Можно вычислить x координату начала шеи")
	public void test$neckLineStartX$1() {
		am.setFullImageBounds(20, 10, 50, 50);
		am.setMargin(10);
		am.setHeadIndent(10);

		final int expected = 45;
		assertEquals(expected, (int) am.getCenterX());
		assertEquals(expected, (int) am.getNeckLineStartX());
	}

	@Test
	@Behavior("Можно вычислить x координату начала шеи (Вторая версия)")
	public void test$neckLineStartX$2() {
		am.setFullImageBounds(20, 10, 80, 50);
		am.setMargin(10);
		am.setHeadIndent(10);

		final int expected = 60;
		assertEquals(expected, (int) am.getCenterX());
		assertEquals(expected, (int) am.getNeckLineStartX());
	}

	@Test
	@Behavior("Можно вычислить y координату начала шеи")
	public void test$headLineStarty$1() {
		am.setFullImageBounds(20, 10, 50, 50);
		am.setMargin(11);
		am.setHeadIndent(12);
		assertEquals(45, am.getNeckLineStartY());
	}

	@Test
	@Behavior("Можно вычислить x координату конца шеи")
	public void test$heckLineEndX$1() {
		am.setFullImageBounds(20, 10, 80, 50);
		assertEquals(60, (int) am.getNeckLineEndX());
	}

	@Test
	@Behavior("Можно вычислть y координту конца шеи")
	public void test$neckLineEndY$1() {
		am.setFullImageBounds(20, 10, 80, 50);
		am.setMargin(11);
		am.setHandIndent(12);

		assertEquals(33, (int) am.getNeckLineEndY());
	}

	@Test
	@Behavior("Можно получить x координату центра пересечения рук")
	public void test$handCenterX() {
		am.setFullImageBounds(20, 10, 80, 50);

		assertEquals(60, (int) am.getCenterX());
		assertEquals(60, (int) am.getHandCenterX());
	}

	@Test
	@Behavior("Можно получить y координату центра пересечения рук")
	public void test$handCenterY() {
		am.setFullImageBounds(20, 10, 80, 50);
		am.setMargin(11);
		am.setHeadIndent(7);
		am.setHandIndent(13);

		assertEquals(10 + 11 + 2 * 7 + 13, (int) am.getHandCenterY());
	}

	@Test
	@Behavior("Можно получить x координату начала левой руки")
	public void test$leftHandStartX() {
		am.setFullImageBounds(20, 10, 80, 50);
		am.setMargin(10);

		assertEquals(20 + 10, (int) am.getLefthandStartX());
	}

	@Test
	@Behavior("Можно получить y координату начала левой руки")
	public void test$leftHandStartY() {
		am.setFullImageBounds(20, 10, 80, 50);
		am.setMargin(11);
		am.setHeadIndent(7);
		am.setHandIndent(13);

		final int expectedHandCenterY = 10 + 11 + 2 * 7 + 13;
		assertEquals(expectedHandCenterY, (int) am.getLeftHandStartY());
		assertEquals(expectedHandCenterY, (int) am.getHandCenterY());
	}

	@Test
	@Behavior("Можно получить x координату конца правой руки")
	public void test$rightHandEndX() {
		am.setFullImageBounds(20, 10, 80, 50);
		am.setMargin(11);

		assertEquals(89, am.getRightHandEndX());
	}

	@Test
	@Behavior("Можно получить y координату конца правой руки")
	public void test$rightHandEndY() {
		am.setFullImageBounds(20, 10, 80, 50);
		am.setMargin(11);
		am.setHeadIndent(7);
		am.setHandIndent(13);

		final int expectedHandCenterY = 10 + 11 + 2 * 7 + 13;
		assertEquals(expectedHandCenterY, (int) am.getRightHandEndY());
		assertEquals(expectedHandCenterY, (int) am.getHandCenterY());
	}

}
