package videodownloader;

import model.Video;
import videodownloader.proxy.IDownloader;

public class VideoDownloader implements IDownloader{

	public VideoDownloader() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Video getVideo(String videoName) {
		// TODO Auto-generated method stub
		System.out.println("Connecting to https://youtube.com/");
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Downloading video " + videoName);
		for(int i = 0; i < 5; i++) {
			System.out.println(".");
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		System.out.println("Retrieving metadata");
		
		return new Video(videoName);
	}

}
