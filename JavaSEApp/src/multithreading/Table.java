package multithreading;

public class Table {
	
	public synchronized void printTable(int n) throws InterruptedException {
		
		for(int i = 1; i<=10; i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
			Thread.sleep(500);
		}
	}

}
