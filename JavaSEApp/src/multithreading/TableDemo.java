package multithreading;

public class TableDemo {

	public static void main(String[] args) {
		
		Table table = new Table();
		
		Mythread1 t1 = new Mythread1(table);
		Mythread2 t2 = new Mythread2(table);
		Mythread3 t3 = new Mythread3(table);
		t1.setPriority(1);
		
		t3.setPriority(10);
		t3.start();
		t2.start();
		
		t1.start();
	}

}
