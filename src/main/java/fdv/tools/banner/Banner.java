package fdv.tools.banner;

import fdv.tools.support.AbstractTool;

public class Banner extends AbstractTool<String[]> {

	public static void main(String... args) {
		new Banner().accept(args);
	}

	@Override
	public void accept(String[] argLineItems) {
		execute(new BannerContext().parse(argLineItems));
	}

	private void execute(BannerContext context) {
		final String message = context.getMessage();

		final String topBottomLine = "*****************************************************************************";
		final int topBottomLineLength = topBottomLine.length();
		final int messageLength = message.length();

		final int astericsWidth = 1;
		final int margingRawWidth = ((topBottomLineLength - messageLength) / 2) - astericsWidth;

		final String leftMessageFill = String.format("*%-" + margingRawWidth + "s", " ");
		final int rightMessageFill = topBottomLineLength - 2 * astericsWidth - messageLength - margingRawWidth;

		System.out.println(topBottomLine);
		System.out.print(leftMessageFill);
		System.out.print(message);

		System.out.println(String.format("%" + rightMessageFill + "s*", " "));
		System.out.println(topBottomLine);
	}

}
