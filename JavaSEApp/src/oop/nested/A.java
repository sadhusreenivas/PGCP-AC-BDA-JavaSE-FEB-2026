package oop.nested;
public class A { // outer class 
	private int x = 123;
	// local class
	public void display() {
		// define local class
		class Local{
			void printX() {
				System.out.println(x);
			}
		} // end of local class
		
		Local localObj = new Local();
		localObj.printX();
	}
	
	public static void main(String[] args) {

      A aObj = new A();
      aObj.display();
	}

}
