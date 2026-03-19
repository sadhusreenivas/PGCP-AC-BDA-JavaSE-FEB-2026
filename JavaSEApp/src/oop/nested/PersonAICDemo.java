package oop.nested;

public class PersonAICDemo {
	
	public static void main(String[] args) {
        // AIC
		Person p = new Person() {
			@Override
			public void eat() {
				System.out.println("Eating Rice!");
			}
			@Override
			public void speak() {
				System.out.println("Speaks English!");
			}
	};
	
	p.eat();
	p.speak();

}
}