package fdv.tools.banner;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import fdv.test.support.RandomTestBase;

public abstract class BannerContextTestBase implements RandomTestBase {

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
