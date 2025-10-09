package week4;

public class DatabaseConcrete implements DatabseConnection {


	@Override
	public void connect() {
		System.out.println("To Connect to DB");
		
	}

	@Override
	public void disconnect() {
		System.out.println("To Disconnect from DB");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("To update & execute DB");
		
	}
	
	public static void main(String[] args) {
		DatabaseConcrete execution = new DatabaseConcrete();
		execution.connect();
		execution.disconnect();
		execution.executeUpdate();
		
	}
}
