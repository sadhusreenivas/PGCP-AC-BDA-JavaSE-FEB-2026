package excpetions;

import java.util.InputMismatchException;

public class NestedTryDemo {
	public static void main(String[] args) {
		System.out.println("Welcome to Nested try");
		try {
			System.out.println("In outer Try");
			try {
				String s=null;
				System.out.println(s.length()); // NPE
			}
			catch(NullPointerException e) {
				System.err.println(e);
			}
			catch(Exception e) {
				System.err.println(e);
			}
			int[] arr = new int[5];
			arr[4] = 123;
			try {
				int x = 1 + (int) (Math.random()*5); // 1-5
				int y = (int) (Math.random()*3); // 0-2
				
				System.out.println(x/y);
			}
			catch(NumberFormatException e) {
				System.err.println(e);
			}
		} // end outer try
		catch(InputMismatchException e) {
			System.err.println(e);
		}
		
		finally {
			System.out.println("Finally executed.....as always");
		}
        System.out.println("Rest of the code follows.......");
	}

}
