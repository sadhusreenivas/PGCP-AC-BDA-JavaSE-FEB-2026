package oop.inheritance;

public class ClassicCustomer extends Customer{
	double intRate;

	public ClassicCustomer(int custId, String custName, double balance, double intRate) {
		super(custId, custName, balance);
		this.intRate = intRate;
	}
	
	@Override
	public void dispCustomer() {
		super.dispCustomer();
		System.out.println("Interest Rate: "+intRate);
	}
	
	@Override
	public void calInterest() {
		// si = p t r / 100
		double t = 2.5;
		//double r = 8.5;
		double si = (getBalance() * t * intRate)/ 100;
		System.out.println("SI earned: "+si);
		double totalBalance = getBalance() + si;
		System.out.println("Update Balance: "+totalBalance);
	}
	
}
