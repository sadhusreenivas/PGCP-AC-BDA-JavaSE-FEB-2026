package multithreading;
public class ThreadBasicsDemo extends Thread{

	public void run() {
		if(Thread.currentThread().getName().equals("even")) {
			System.out.println("Its a even thread");
			System.out.println(Thread.currentThread().getPriority());
		}
		else {
			System.out.println("Its Thread-x");
			System.out.println(Thread.currentThread().getPriority());
		}
	}
	public static void main(String[] args) {
		
		ThreadBasicsDemo t1 = new ThreadBasicsDemo();
		t1.setName("even");
		t1.setDaemon(true);
		
		ThreadBasicsDemo t2 = new ThreadBasicsDemo();
		//t2.setPriority(MAX_PRIORITYmi);
		
		t1.start();
		t2.start();
		
		System.out.println(t1.isDaemon()); //
	}

}
