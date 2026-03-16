package oop.inheritance;

public class CustApp {

	public static void main(String[] args) {
	
//		Customer cc = new ClassicCustomer(123,"ABC",100000, 9.5); // upcasting
//		cc.dispCustomer(); // dynamic method dispatch - RTP
//		cc.calInterest(); // dynamic method dispatch - RTP
		
		Customer c1 = new Customer(321,"XYZ", 100000);
		ClassicCustomer cc1 = new ClassicCustomer(567,"ASDF",100000, 9.5);
		c1.dispCustomer();
		c1.calInterest();
		
		c1 = cc1; // upcasting
		c1.dispCustomer();
		c1.calInterest();

	}

}
