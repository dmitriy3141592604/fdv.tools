package fdv.tools.pia;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import fdv.tools.support.ToolContextBase;

@XStreamAlias("album")
public class PrimitiveImageAlbumContext extends ToolContextBase<PrimitiveImageAlbumContext> {

	@XStreamAlias("images")
	private List<String> imageNames = new ArrayList<String>();

	public List<String> getImageNames() {
		return imageNames;
	}

	public void setImageNames(List<String> imageNames) {
		this.imageNames = imageNames;
	}

	public void addImageName(String imageName) {
		this.imageNames.add(imageName);
	}

	@Override
	public PrimitiveImageAlbumContext parse(String[] args) {
		for (final String imageName : args) {
			addImageName(imageName);
		}
		return this;
	}

}
