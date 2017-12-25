package fdv.tools.banner;

public class BannerContext {

	private String message;

	public BannerContext() {

	}

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
