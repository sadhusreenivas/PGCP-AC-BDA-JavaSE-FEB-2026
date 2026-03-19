package oop.inheritance;
 public class Customer {
	private int custId;
	private String custName;
	private double balance;
	private static String bank = "SBI";
	
	public Customer(int custId, String custName, double balance) {
		this.custId = custId;
		this.custName = custName;
		this.balance = balance;
	}
	
	public void dispCustomer() {
		System.out.println(custId+" "+custName+" "+balance+" "+bank);
	}
	
	public void calInterest() {
		// si = p t r / 100
		double t = 2.5;
		double r = 8.5;
		double si = (balance * t * r)/ 100;
		System.out.println("SI earned: "+si);
	}

	public double getBalance() {
		return balance;
	}
	
	
	
}
