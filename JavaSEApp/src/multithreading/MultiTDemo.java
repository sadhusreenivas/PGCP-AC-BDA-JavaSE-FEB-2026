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
	public static void main(String[] args) throws InterruptedException {
		
		MultiTDemo t1 = new MultiTDemo();
		t1.start();
		t1.join(1500);
		MultiTDemo t2 = new MultiTDemo();
		t2.start();
		MultiTDemo t3 = new MultiTDemo();
		t3.start();
	}

}
