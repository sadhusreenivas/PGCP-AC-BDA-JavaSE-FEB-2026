package multithreading;

public class MultiTDemo extends Thread {

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(750);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		MultiTDemo t1 = new MultiTDemo();
		t1.start();
		
		MultiTDemo t2 = new MultiTDemo();
		t2.start();
		
		
	}

}
