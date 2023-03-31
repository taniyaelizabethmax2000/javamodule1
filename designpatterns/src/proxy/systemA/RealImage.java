package proxy.systemA;

public class RealImage {

	
	private final String filename;

	public RealImage(String filename) {
		super();
		this.filename = filename;
		loadImageFromDisk();
	}

	private void loadImageFromDisk() {
		
		System.out.println("Loading ...... "+filename);
	}

	
	public void showImage() {
		
		System.out.println("Dispalying Image..... "+filename);
	}
}
