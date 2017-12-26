package fdv.tools.file2url;

import java.io.File;

import fdv.tools.support.AbstractTool;

public class File2Url extends AbstractTool<File2UrlContext> {

	public static void main(String... args) throws Exception {
		new File2Url().accept(args);
	}

	@Override
	public void accept(String[] t) {
		execute(new File2UrlContext().parse(t));
	}

	private void execute(File2UrlContext parse) {
		System.out.println(new File(parse.getFileName()).toURI());
	}
}
