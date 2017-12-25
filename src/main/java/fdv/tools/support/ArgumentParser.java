package fdv.tools.support;

public interface ArgumentParser<ContextType> {

	ContextType parse(String[] args);

}
