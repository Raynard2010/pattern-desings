package main;

import videodownloader.proxy.IDownloader;
import videodownloader.proxy.VideoDownloaderProxy;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		IDownloader vd = new VideoDownloaderProxy();
		vd.getVideo("Dog");
		vd.getVideo("Cat");
		vd.getVideo("Dog");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
