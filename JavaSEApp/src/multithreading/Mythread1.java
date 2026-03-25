package multithreading;

public class Mythread1 extends Thread{
	Table table;
	
    Mythread1(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		try {
			table.printTable(17);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
// 17th table
	
	
	
}
