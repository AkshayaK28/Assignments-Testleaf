package week4;

public class Amazon extends CanaraBank {


	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("Upi payments method");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payments method");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking");
		
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("Payment details");
		
	}
	public static void main(String[] args) {
		Amazon details = new Amazon();
		details.cashOnDelivery();
		details.upiPayments();
		details.cardPayments();
		details.internetBanking();
		details.recordPaymentDetails();

	}

}
