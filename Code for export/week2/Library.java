package week2;

public class Library {

	
	// A method is created with one input argument
	
	public String addBook(String bookTitle) {
		System.out.println(bookTitle);
		return bookTitle;
	}
	
	// To define another method
	
	public String issueBook(String bookDetail) {
		System.out.println(bookDetail);
		return bookDetail;
	}
	
	
	public static void main(String[] args) {
		// To Call the methods using Objects
		
		Library name = new Library();
		name.addBook("Book added successfully");
		name.issueBook("Book issued successfully");
		

	}

}
