package oop.nested;
public class Person {
	void eat() {
		System.out.println("Eating Dosa...");
	}
	void speak() {
		System.out.println("Telugu..");
	}
	void study() {
		System.out.println("Learning....Python");
	}
	
	public static void main(String[] args) {
        // AIC
		Person p = new Person() {
			@Override
			public void eat() {
				System.out.println("Eating idli!");
			}
			@Override
			public void speak() {
				System.out.println("Speaks Marathi!");
			}
	};
	p.eat();
	p.speak();
	p.study();
}
}
