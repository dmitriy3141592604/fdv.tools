package fdv.tools.banner;

import org.junit.Before;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;

public abstract class BannerTestBase {

	@Rule
	public SystemOutRule systemOut = new SystemOutRule().enableLog();

	@Before
	public final void setUpBannerTestBase() {

	}

}
