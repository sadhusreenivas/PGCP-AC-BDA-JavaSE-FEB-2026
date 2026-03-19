package packages;

import java.util.*; // explicit import
//import java.sql.*; //implicit import

import static java.lang.Math.*; // static import

public class DateDemo {

	public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d); //
        
        System.out.println(random()); //?
        System.out.println(sqrt(625)); //?
        System.out.println(PI);
        // FQN
        oop.inheritance.Customer c = new oop.inheritance.Customer(123, "ABC", 12345);
        c.dispCustomer();
	}

}
