package oop.inheritance;

public class EmpApp {
	public static void main(String[] args) {
		
		TechEmployee te1 = new TechEmployee(); // super()
		te1.setEmployee(341285,"SS", 100000);
		te1.setBonus(10000);
		te1.disp();
	    System.out.println("Bonus: "+te1.getBonus());
		te1.calSalary();
		
	}

}
