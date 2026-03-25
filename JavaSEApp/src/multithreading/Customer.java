package multithreading;
public class Customer {
	private double balance;

	public Customer(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw: "+amount);
		System.out.println("Balance is: "+getBalance());
		
		if(amount > balance) {
			System.out.println("Low balance...can not withdraw and will wait for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		balance = balance - amount;
		System.out.println("Withdraw success"+" Balance: "+balance);
	} // 
	
	public synchronized void deposit(int amount) {
		System.out.println("Going to deposit: "+amount);
		balance += amount;
		System.out.println("Deposit success");
		notify();
		System.out.println("Balance: "+balance);
	}
	
}
