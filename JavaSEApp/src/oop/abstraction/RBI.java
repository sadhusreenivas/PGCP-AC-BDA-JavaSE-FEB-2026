package oop.abstraction;

public interface RBI extends Govt {
	
	int cashback = 10; // public static final int cashback = 10; 
	void withdraw(); // public abstract void withdraw();
	void deposit();
	void transfer();

}
