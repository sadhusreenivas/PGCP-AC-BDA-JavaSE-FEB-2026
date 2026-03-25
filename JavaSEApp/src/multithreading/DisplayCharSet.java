package multithreading;
public class DisplayCharSet {
	
	public synchronized void printUpperCaseChars() {
		for(int i=65; i<=90;i++) {
			System.out.print((char)i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	public synchronized void printLowerCaseChars() {
		for(int i=97; i<=122;i++) {
			System.out.print((char)i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	public synchronized void printSpecialChars() {
		for(int i=33; i<=59;i++) {
			System.out.print((char)i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	
}
