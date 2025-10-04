package week3;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("1st method: "+endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, Boolean requestStatus) {
		System.out.println("2nd method: "+endpoint);
		System.out.println("Request Body is: "+requestBody);
		if(requestStatus) {
			System.out.println("Request sent successfull");
		} else
			System.out.println("Request unsuccessfull");
	}
	
	public static void main(String[] args) {
		// Object to call the methods
		
		APIClient call = new APIClient();
		call.sendRequest("Point1");
		call.sendRequest("Point2", "Body", false );
	}

}
