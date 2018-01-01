package fdv.tools.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.thoughtworks.xstream.annotations.XStreamOmitField;

public abstract class ToolContextBase<Context> implements ArgumentParser<Context> {

	@XStreamOmitField
	protected Logger logger = LoggerFactory.getLogger(getClass());

}
