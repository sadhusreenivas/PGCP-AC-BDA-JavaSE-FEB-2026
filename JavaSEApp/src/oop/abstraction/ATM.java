package oop.abstraction;
abstract public class ATM {
	private int cashback;

	public ATM(int cashback) {
		super();
		this.cashback = cashback;
	}
	public void disp() {
		System.out.println("Welcome to ATM");
	}
	public abstract void withdraw();
	public abstract void deposit();
	
	public int getCashback() {
		return cashback;
	}
	
}
