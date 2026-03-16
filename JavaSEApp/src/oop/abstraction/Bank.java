package oop.abstraction;
public class Bank extends ATM{
	
	public Bank(int cashback) {
		super(cashback);
	}

	@Override
	public void withdraw() {
	System.out.println("Withdraw success and you earned cashback:  "+getCashback());
	}

	@Override
	public void deposit() {
		System.out.println("Deposit success and you earned cashback:  "+getCashback());
	}
	

	@Override
	public void disp() {
		super.disp();
		System.out.println("Welcome to Bank");
	}

	public static void main(String[] args) {

		ATM atm = new Bank(15);
		atm.disp(); //
		atm.withdraw();
		atm.deposit();
	}

}
