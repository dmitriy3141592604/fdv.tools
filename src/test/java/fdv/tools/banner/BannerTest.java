package fdv.tools.banner;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.typemarkup.Behavior;

public class BannerTest extends BannerTestBase {

	@Test
	@Behavior("Переданная при запуске строка выводится в stdout")
	public void test$simpleOutput() {
		final StringBuilder expected = new StringBuilder();
		expected.append("*****************************************************************************").append(lineSeparator());
		expected.append("*                               Hello, World!                               *").append(lineSeparator());
		expected.append("*****************************************************************************").append(lineSeparator());

		Banner.main(new String[] { "Hello, World!" });

		assertEquals(expected.toString(), systemOut.getLog());

	}

}
