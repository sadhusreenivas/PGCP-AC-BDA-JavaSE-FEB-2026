package oop;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(123,"ABC",56000);
		e1.calSalary();
		
		//call changeOrg
		Employee.changeOrg();
		
		Employee e2 = new Employee(321,"XYZ",78000);
		e2.calSalary();
		
		System.out.println(e1); // e1.toString();
		System.out.println(e1.hashCode());
		System.out.println(e2); // e2.toString();
		System.out.println(e2.hashCode());
		
	}

}
