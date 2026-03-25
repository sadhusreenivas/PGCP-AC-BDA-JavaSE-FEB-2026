package multithreading;
public class DisplayDemoApp {
	public static void main(String[] args) {
		
		DisplayCharSet d = new DisplayCharSet();
		// Thread classes - Anonymous Inner Class
		Thread t1 = new Thread() {
			@Override
			public void run() {
			d.printUpperCaseChars();
			}
		}; //
		t1.start();
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
			d.printLowerCaseChars();
			}
		}; //
		t2.start();
		
		new Thread() {
			@Override
			public void run() {
			d.printSpecialChars();
			}
		}.start(); //
		
		
	}

}
