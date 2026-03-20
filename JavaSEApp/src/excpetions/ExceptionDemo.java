package excpetions;

import java.util.InputMismatchException;

public class ExceptionDemo {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int x = 0;
		int y = 0;
		
		System.out.println("Enter two nos:");
		try {
		x = input.nextInt();
		y = input.nextInt();
		}
		catch(InputMismatchException e) {
			System.err.println(e);
		}
		
		int sum = x + y;
		System.out.println(sum);
		
		try {
		int res = x / y; // crash => throw new java.lang.ArithmeticException();
		System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.err.println(e);
		}
		
		int prod = x * y;
		System.out.println(prod);
		System.out.println("Rest of the code follows......");
	}

}
