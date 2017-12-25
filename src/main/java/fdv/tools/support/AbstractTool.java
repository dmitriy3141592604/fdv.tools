package fdv.tools.support;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractTool<ContextType> implements Consumer<String[]> {

	protected final Logger logger = LoggerFactory.getLogger(getClass());

}
