package oop.abstraction;
public interface Java9FeaturesDemo2 {
	
//	default void msg() {
//		System.out.println("Its a default method");
//		disp(); //
//	}
//    
//	private void disp() {
//		System.out.println("Its a private method");
//	}
	
	static void test() {
		System.out.println("Its a static method");
		//fun();
	}
	
	private static void fun() {
		System.out.println("Its a pvt st method");
	}
	
	public static void main(String[] args) {
		
		test();
		fun();
	
	}
}
