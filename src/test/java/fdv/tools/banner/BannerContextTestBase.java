package fdv.tools.banner;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public abstract class BannerContextTestBase {

	@Rule
	public ExpectedException e = ExpectedException.none();

	@Before
	public final void setUpBannerContextTestBase() {

	}

	protected void expect(Class<? extends Throwable> exceptionClass, String expectedMessage) {
		e.expect(exceptionClass);
		e.expectMessage(expectedMessage);
	}

}
