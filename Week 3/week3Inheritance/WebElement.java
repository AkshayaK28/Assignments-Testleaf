package week3Inheritance;


public class WebElement {
	
	public void click() 
	{
		System.out.println("Click the Element");
	}
	public void setText(String text)
	{
		System.out.println("The text is "+text);
	}

	public static void main(String[] args) {
		WebElement text = new WebElement();
		text.click();
		text.setText("Hello");

	}

}
