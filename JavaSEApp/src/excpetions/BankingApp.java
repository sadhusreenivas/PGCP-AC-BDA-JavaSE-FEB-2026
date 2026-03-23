package excpetions;
public class BankingApp {
	private double balance;
	public BankingApp(double balance) {
		super();
		this.balance = balance;
	}
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Updated Balance: "+balance+" after deposit");
	}
	public void withdraw (int amount) throws InsufficientFundsException{
		if(amount > balance)
			throw new InsufficientFundsException("low balance");
		else {
			balance -= amount;
			System.out.println("Updated Balance: "+balance+" after withdraw");
		}
		}
	public static void main(String[] args) {
		BankingApp bank = new BankingApp(50000);
		bank.deposit(25000);
		
		try {
			bank.withdraw(35000);
			bank.withdraw(50000); // ?
			} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
		finally {
			if(bank != null)
				bank = null;
			System.out.println("Resources closed!");
		}
		
        System.out.println("resy of the code.....follows!");
	}

}
