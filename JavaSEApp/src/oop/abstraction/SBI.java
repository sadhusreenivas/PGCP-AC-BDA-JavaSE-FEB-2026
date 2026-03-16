package oop.abstraction;

public class SBI implements RBI, TTP{
	@Override
	public void withdraw() {
		System.out.println("Withdraw success and you earned cashback:  "+cashback);
	}
	@Override
	public void deposit() {
		System.out.println("Deposit success and you earned cashback:  "+cashback);
	}
	@Override
	public void transfer() {
		System.out.println("Transfer success and you earned cashback:  "+cashback);
	}
	
	@Override
	public void changeGovernor() {
		System.out.println("Governer changed and the new GOv: Sanjay Malhothra");
	}
	public void disp() {
		System.out.println("Welcome to SBI");
	}
	public static void main(String[] args) {
		
		SBI s = new SBI();
		s.deposit();
		s.withdraw();
		s.transfer();
		s.changeGovernor();
		s.disp();
		s.confirmTransaction();

	}
	
	@Override
	public void confirmTransaction() {
		System.out.println("Transaction confirmed!");
	}
	
}
