package fdv.tools.banner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.typemarkup.Behavior;

public class BannerContextTest extends BannerContextTestBase {

	@Test
	@Behavior("Строка переданная в вызове является сообщением")
	public void test$oneArgumentMessage() {
		final String expected = randomString();
		assertEquals(expected, new BannerContext().parse(new String[] { expected }).getMessage());
	}

	@Test
	@Behavior("Отсутствие сообщения в командной строке приводит к ошибке")
	public void test$noArgumentsIsError() {
		expect(IllegalArgumentException.class, "В переданных параметрах нет сообщения. Количество аргументов: [0]");
		new BannerContext().parse(new String[] {});
	}

	@Test
	@Behavior("Аргументы склеиваются")
	public void test$manuArguments() {
		final String s1 = randomString();
		final String s2 = randomString();
		final String s3 = randomString();
		assertEquals(s1 + " " + s2 + " " + s3, new BannerContext().parse(new String[] { s1, s2, s3 }).getMessage());
	}

}
