package week3;

public class Chrome extends Browser{
	
    public void openIncognito()
  {
    	System.out.println("Open Incognito");
  }
    public void clearCache()
  {
    	System.out.println("clearCache");
  }  
	public static void main(String[] args) {
		Chrome newoptions = new Chrome();
		newoptions.openIncognito();
		newoptions.clearCache();
		newoptions.openURL();
		newoptions.closeBrowser();
		newoptions.navigateBack();
	}

}
