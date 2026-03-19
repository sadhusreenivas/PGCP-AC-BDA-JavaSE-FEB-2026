package oop.abstraction;

public class Test implements Java9FeaturesDemo {

	
	public static void main(String[] args) {
	
		Test t = new Test();
		t.getEligibility();
		t.msg(); // pvt
		Java9FeaturesDemo.test(); // pvt
		

	}

	@Override
	public void getEligibility() {
		System.out.println("Max Age allowed is: "+MAX_AGE);
	}

}
