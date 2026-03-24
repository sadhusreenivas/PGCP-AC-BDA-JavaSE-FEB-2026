package multithreading;
public class RunnableDemo implements Runnable{
	@Override
	public void run() {
		for(int i=11; i<=20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(750);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		
		RunnableDemo r1 = new RunnableDemo();
		RunnableDemo r2 = new RunnableDemo();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

	
}
