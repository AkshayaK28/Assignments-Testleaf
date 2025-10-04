package week3Inheritance;

public class Elements extends Button{

	public static void main(String[] args) {
		WebElement text = new WebElement();
		text.click();
		text.setText("Hello");
		
		System.out.println("-------------------");
		
		Button text1 = new Button();
		text1.submit();
		
		System.out.println("-------------------");
		
		CheckBoxButton text2 = new CheckBoxButton();
		text2.clickCheckButton();
		
		System.out.println("-------------------");
		
		TextField text3 = new TextField();
		text3.getText();
		
		System.out.println("-------------------");
		
		RadioButton text4 = new RadioButton();
		text4.selectRadioButton();
		
		
		
	}

}
