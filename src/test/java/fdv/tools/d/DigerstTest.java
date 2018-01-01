package fdv.tools.d;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;

import org.junit.Test;

import com.github.typemarkup.Behavior;

public class DigerstTest extends DigerstTestBase {

	@Test
	@Behavior("Вычисляет md5 по заданной строке")
	public void test$md5String() throws Exception {
		final String text = "Hello, World!";
		assertEquals("65a8e27d8879283831b664bd8b7f0ad4", asMd5Hex(asInputStream(text)));
	}

	@Test
	@Behavior("Вычисляет sha256 по заданной строке")
	public void test$sha256ByString() throws Exception {
		final String text = "Hello, World!\n";
		assertEquals("c98c24b677eff44860afea6f493bbaec5bb1c4cbb209c6fc2bbb47f66ff2ad31", asSha256Hex(asInputStream(text)));
	}

	@Test
	@Behavior("Вычисляет sha259 ресурса")
	public void test$sha256FromResource() throws Exception {
		final InputStream is = getResourceAsInputStream("fdv\\tools\\d\\HelloWorld.txt");
		assertEquals("92b772380a3f8e27a93e57e6deeca6c01da07f5aadce78bb2fbb20de10a66925", asSha256Hex(is));
	}

	@Test
	@Behavior("Проверяет формирование строки в соответствии с правилами TotalCommander")
	public void test$tcCompability() throws Exception {
		final InputStream hwFile = getResourceAsInputStream("fdv\\tools\\d\\HelloWorld.txt");
		assertEquals("92b772380a3f8e27a93e57e6deeca6c01da07f5aadce78bb2fbb20de10a66925 *HelloWorld.txt", asNamedSha256Hex("HelloWorld.txt", hwFile));
	}

}
