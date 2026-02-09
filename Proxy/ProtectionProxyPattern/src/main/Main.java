package main;

import database.proxy.DatabaseExecutorProxy;
import database.proxy.IExecutable;
import model.User;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		User admin = new User("Admin");
		User user = new User("Non Admin");
		
		IExecutable adminrole = new DatabaseExecutorProxy(admin);
		IExecutable userrole = new DatabaseExecutorProxy(user);
		
		System.out.println("Admin Role");
		System.out.println("==========");
		
		try {
			adminrole.executeQuery("SELECT * FROM Something");
			adminrole.executeQuery("UPDATE Something SET A = B");
			adminrole.executeQuery("DELETE * FROM Something");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("User Role");
		System.out.println("==========");
		
		try {
			userrole.executeQuery("SELECT * FROM Something");
			userrole.executeQuery("UPDATE Something SET A = B");
			userrole.executeQuery("DELETE * FROM Something");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
