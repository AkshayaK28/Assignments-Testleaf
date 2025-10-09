package week4;

public class JavaConnection extends MySqlConnection{



	@Override
	public void connect() {
		System.out.println("To Connect to DB");
		
	}

	@Override
	public void disconnect() {
		System.out.println("To disconnect from DB");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("To update & execute");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("To Execute query");
		
	}
	public static void main(String[] args) {
		JavaConnection name1 = new JavaConnection();
		name1.connect();
		name1.disconnect();
		name1.executeUpdate();
		name1.executeQuery();

	}

}
