package image;

public class ImageDisplay implements IDisplayable{
	private String filepath;
	
	public ImageDisplay(String filepath) {
		super();
		this.filepath = filepath;
		loadConfig();
	}
	
	private void loadConfig() {
		System.out.println("Pre-initialisizing task");
		
		for(int i = 0; i < 5; i++) {
			System.out.println(".");
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		System.out.println("Display following image: " + filepath);
	}
}
