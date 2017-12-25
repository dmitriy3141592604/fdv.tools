package fdv.tools.banner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.typemarkup.Behavior;

public class BannerContextTest extends BannerContextTestBase {

	@Test
	@Behavior("Строка переданная в вызове является сообщением")
	public void test$oneArgumentMessage() {
		assertEquals("message", new BannerContext().parse(new String[] { "message" }).getMessage());
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
		assertEquals("m e s", new BannerContext().parse(new String[] { "m", "e", "s" }).getMessage());
	}

}
