package database.proxy;

import database.DatabaseExecutor;
import model.User;

public class DatabaseExecutorProxy implements IExecutable {

	private Boolean isAuth = false;
	private DatabaseExecutor dbe = null;
	
	
	
	public DatabaseExecutorProxy(User user) {
		if (user.getRole().equals("Admin")) {
			this.isAuth = true;
		}
		
		dbe = new DatabaseExecutor();
	}



	@Override
	public void executeQuery(String query) throws Exception {
		// TODO Auto-generated method stub
		if(isAuth) {
			dbe.executeQuery(query);
		}
		else {
			if(query.contains("DELETE")) {
				throw new Exception("You are not allowed to perform the following query");
			}
			else {
				dbe.executeQuery(query);
			}
		}
	}

}
