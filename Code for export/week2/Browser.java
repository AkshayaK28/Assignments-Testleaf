package week2;

public class Browser {
	
	
	//Type 1 - Not using Attributes
	
//	public void launchBrowser()
//	{
//		System.out.println("Chrome");
//	}
//	public void loadUrl()
//	{
//		System.out.println("Url loaded successfully");
//	}
//	public static void main(String[] args) {
//	Browser name = new Browser();
//	name.launchBrowser();
//	name.loadUrl();
//	}
//}

     
    //Type 2 - Using Attributes to get value
	
	public void launchBrowser(String browser)
	{
		System.out.println(browser);
	}
	public void loadUrl(String Url)
	{
		System.out.println(Url);
	}
	public static void main(String[] args) {
		Browser name = new Browser();
		name.launchBrowser("Chrome");
		name.loadUrl("Url loaded successfully");
	}
}
	
     //Type 3 - Using Attributes to get value & return 
//	public String  launchBrowser(String browserName)
//	{
//		System.out.println(browserName);
//		return browserName;
//	}
//	public String loadUrl(String LoadUrl)
//	{
//		System.out.println(LoadUrl);
//		return LoadUrl;
//	}
//
//	public static void main(String[] args) {
//		Browser name = new Browser();
//		name.launchBrowser("Chrome");
//		name.loadUrl("Url loaded successfully");

		
//	}
//
//}
