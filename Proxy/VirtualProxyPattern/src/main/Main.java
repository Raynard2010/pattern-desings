package main;

import image.IDisplayable;
import image.ImageDisplayProxy;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		IDisplayable dog_img = new ImageDisplayProxy("dog.jpg");
		IDisplayable cat_img = new ImageDisplayProxy("cat.jpg");
		
		System.out.println("Dog Image");
		System.out.println("=========");
		dog_img.displayImage();
		dog_img.displayImage();
		dog_img.displayImage();
		
		System.out.println("Cat Image");
		System.out.println("=========");
		cat_img.displayImage();
		cat_img.displayImage();
		cat_img.displayImage();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
