package database;

import database.proxy.IExecutable;

public class DatabaseExecutor implements IExecutable{

	@Override
	public void executeQuery(String query) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Executing following query: " + query);
	}

}
