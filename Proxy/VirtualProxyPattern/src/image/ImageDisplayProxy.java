package image;

public class ImageDisplayProxy implements IDisplayable{
	private String filepath;
	private ImageDisplay id = null;
	
	public ImageDisplayProxy(String filepath) {
		super();
		this.filepath = filepath;
	}

	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		if(id == null) {
			id = new ImageDisplay(filepath);
		}
		id.displayImage();
	}
}
