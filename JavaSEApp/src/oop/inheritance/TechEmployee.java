package oop.inheritance;
public class TechEmployee extends Employee {
	int bonus;
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	// all non - private members
    // 3 methods 
	
	// calculate salary - hra=30%, da=56%, ta=10
	  @Override
		public void calSalary() {
			double hra = 0.30;
			double da = 0.56;
			double ta =0.10;
			double salary = basicPay + basicPay*(hra+da+ta) + bonus;
			System.out.println("Salary: "+salary);
		}
		@Override
	    public void disp(){
			super.disp(); // refers to immediate parent object 
			System.out.println("bonus: "+bonus);
		}
}
