package oop.abstraction;

public class Y extends X{
	void msg() {
		System.out.println("Welcome ....!!");
	}
	
	@Override
	void test() {
	System.out.println("Implemented ....");
	}
	
	
    public static void main(String[] args) {
    	X x1 = new Y();
    	x1.test();
    	
    	new Y().msg(); //
	}
}
