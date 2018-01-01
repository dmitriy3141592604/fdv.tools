package fdv.tools.support.image;

import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class WritableImage extends BufferedImage implements Closeable {

	private final int height;

	private final String outputFileName;

	private final int width;

	public WritableImage(String outputFileName, int width, int height) {
		super(width, height, BufferedImage.TYPE_INT_RGB);
		this.outputFileName = outputFileName;
		this.width = width;
		this.height = height;
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	@Override
	public void close() throws IOException {
		ImageIO.write(this, "png", new File(outputFileName));
	}

}
