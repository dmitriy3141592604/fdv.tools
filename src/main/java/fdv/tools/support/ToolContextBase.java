package fdv.tools.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ToolContextBase<Context> implements ArgumentParser<Context> {

	protected Logger logger = LoggerFactory.getLogger(getClass());

}
