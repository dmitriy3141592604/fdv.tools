package fdv.tools.support;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.typemarkup.Responsibility;

@Responsibility("Формирует базу для создания инструмента")
public abstract class AbstractTool<ContextType> implements Consumer<String[]> {

	@Responsibility("Предоставляет доступ до системы логирования")
	protected final Logger logger = LoggerFactory.getLogger(getClass());

}
