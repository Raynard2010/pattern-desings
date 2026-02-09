package main;

import database.Database;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
//		Database db1 = Database.getInstance();
//		Database db2 = Database.getInstance();
//		
//		System.out.println(db1);
//		System.out.println(db2);
		
		// multi threading
		Runnable run1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Database db = Database.getInstance();
				System.out.println(db);
			}
		};
		
		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run1);
		
		thread1.start();
		thread2.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
