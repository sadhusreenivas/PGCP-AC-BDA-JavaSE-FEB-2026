package iostreams;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private int age;
	transient private long aadhar; // transient => not serializable
	
	public Person(String name, int age, long aadhar) {
		super();
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", aadhar=" + aadhar + "]";
	}
	

}
