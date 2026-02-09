package videodownloader.proxy;

import java.util.HashMap;

import model.Video;
import videodownloader.VideoDownloader;

public class VideoDownloaderProxy implements IDownloader{
	HashMap<String, Video> data;
	VideoDownloader vd;
	
	public VideoDownloaderProxy() {
		// TODO Auto-generated constructor stub
		vd = new VideoDownloader();
		data = new HashMap<>();		
	}

	@Override
	public Video getVideo(String videoName) {
		// TODO Auto-generated method stub
		if(data.containsKey(videoName)) {
			System.out.println("Video already stored in cache.");
			return data.get(videoName); // pakai yang sudah ada di cache
		}
		
		// buat yang baru
		Video vid = vd.getVideo(videoName);
		data.put(videoName, vid);
		
		return vid;
	}

}
