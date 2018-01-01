package fdv.tools.af;

import java.awt.GraphicsEnvironment;

public class PrintAvailableFonts {

	public static void main(String... args) {
		final String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for (int i = 0; i < fonts.length; i++) {
			System.out.println(fonts[i]);
		}
	}
}
