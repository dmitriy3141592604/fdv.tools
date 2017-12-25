package fdv.tools.banner;

import fdv.tools.support.ArgumentParser;

public class BannerContext implements ArgumentParser<BannerContext> {

	private String message;

	@Override
	public BannerContext parse(String[] args) {
		if (args.length == 0) {
			throw new IllegalArgumentException("В переданных параметрах нет сообщения. Количество аргументов: [0]");
		}
		final StringBuilder builder = new StringBuilder();
		boolean isFirst = true;
		for (final String str : args) {
			if (!isFirst) {
				builder.append(" ");
			}
			builder.append(str);
			isFirst = false;
		}
		message = builder.toString();
		return this;
	}

	public String getMessage() {
		return message;
	}

}
