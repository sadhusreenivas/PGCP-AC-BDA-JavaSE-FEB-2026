package oop;

public class Employee { // fully encapsulated class
	private int eid;
	private String ename;
	private double basicPay;
	private static String org;

	static {
		org = "C-DAC";
		System.out.println("Org is initialized");
	}

	public Employee(int eid, String ename, double basicPay) {
		this.eid = eid;
		this.ename = ename;
		this.basicPay = basicPay;
	}

	@Override
	public String toString(){
		return eid + " " + ename + " " + basicPay + " " + org;
	}
    
	public static void changeOrg() {
		org = "C-DAC Hyd";
		System.out.println("Org name changed1");
	}
	
	// calculate salary - hra=30%, da=56%, ta=10
	public void calSalary() {
		double hra = 0.30;
		double da = 0.56;
		double ta =0.10;
		
		double salary = basicPay + basicPay*(hra+da+ta);
		System.out.println("Salary: "+salary);
	}
	
}
