package singleton;

public class DatabaseConnectionLazy {
	
	// lazy loading
	
	private static DatabaseConnectionLazy instance;
	
	private DatabaseConnectionLazy() {
		
	}
	
	// Implementacija neke konekcije na BP

	public static DatabaseConnectionLazy getInstance() {
		if(instance == null)
			synchronized(DatabaseConnectionLazy.class) { //sinhronizacija kod masovnog koriscenja/paralelnog programiranja
				if(instance == null)
					instance = new DatabaseConnectionLazy();
			}		
		return instance;
	}
	
	

}