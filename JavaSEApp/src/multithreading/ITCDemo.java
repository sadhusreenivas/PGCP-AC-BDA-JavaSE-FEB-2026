package multithreading;

public class ITCDemo {

	public static void main(String[] args) {

    Customer c = new Customer(40000);
    
    new Thread() {
		public void run() {
			c.withdraw(50000); //
		}
    }.start();
    
    new Thread() {
    	public void run() {
			c.deposit(40000); //
		}
    }.start();

	}

}
