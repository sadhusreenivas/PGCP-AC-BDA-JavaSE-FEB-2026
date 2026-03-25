package multithreading;

public class Mythread2 extends Thread{
	Table table;
	
    Mythread2(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		try {
			table.printTable(18);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
// 18th table
	
	
	
}
