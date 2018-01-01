package fdv.tools.d;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Before;

public abstract class DigerstTestBase {

	@Before
	public final void setUpDigerstTestBase() {

	}

	protected String asMd5Hex(InputStream asInputStream_) throws IOException {
		return DigestUtils.md5Hex(asInputStream_);
	}

	protected InputStream asInputStream(String string) throws UnsupportedEncodingException {
		return new ByteArrayInputStream(string.getBytes("utf-8"));
	}

	protected String asSha256Hex(InputStream is) throws Exception {
		return DigestUtils.sha256Hex(is);
	}

	protected String asNamedSha256Hex(String fileName, InputStream hwFile) throws Exception {
		return asSha256Hex(hwFile) + " *" + fileName;
	}

	protected InputStream getResourceAsInputStream(String name) {
		return getClass().getClassLoader().getResourceAsStream(name);
	}

}
