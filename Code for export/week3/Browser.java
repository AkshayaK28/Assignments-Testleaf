package week3;

public class Browser {
	
	String  browserName = "Chrome";
	int browserVersion = 2;

    public void openURL()
  {
    	System.out.println("Open the URL");
  }

    public void closeBrowser()
  {
    	System.out.println("Close the browser");
  }
    public void navigateBack()
  {
    	System.out.println("Navigate to back screen");
  }
	

	public static void main(String[] args) {
		Browser options = new Browser();
		options.openURL();
		options.closeBrowser();
		options.navigateBack();

	}

}

