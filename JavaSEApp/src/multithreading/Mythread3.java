package multithreading;

public class Mythread3 extends Thread{
	Table table;
	
    Mythread3(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		try {
			table.printTable(19);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
// 19th table
	
	
	
}
