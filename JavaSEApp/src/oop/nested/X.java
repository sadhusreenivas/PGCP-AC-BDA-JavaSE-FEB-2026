package oop.nested;

public class X {

	private static int a = 123;
	
	static class Y{
		static void print() {
			System.out.println(a);
		}
	} // end static class
	
	public static void main(String[] args) {
		
	 X.Y.print();
	 
	}
	
}
