package database;

public class Database {
	
	// lazy initialization singleton
	private static Database instance = null;

	private Database() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Database connection created.");
	}
	
	// public creation method
	public static Database getInstance() {
		if(instance == null) {
			
			// code lain yang panjang...
			
			synchronized(Database.class) {
				if(instance == null) {
					instance = new Database();
				}
			}
		}
		
		return instance;
	}

}
