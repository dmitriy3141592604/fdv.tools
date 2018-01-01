package fdv.tools.fb;

import org.junit.Before;

public abstract class ActorModelTestBase {

	protected ActorModel am;

	@Before
	public final void setUpActorModelTestBase() {
		am = new ActorModel();
	}

}
