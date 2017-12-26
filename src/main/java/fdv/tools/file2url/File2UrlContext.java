package fdv.tools.file2url;

import fdv.tools.support.ToolContextBase;

public class File2UrlContext extends ToolContextBase<File2UrlContext> {

	private String fileName;

	@Override
	public File2UrlContext parse(String[] args) {
		if (args.length != 1) {
			throw new IllegalArgumentException();
		}
		setFileName(args[0]);
		return this;
	}

	private void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

}
