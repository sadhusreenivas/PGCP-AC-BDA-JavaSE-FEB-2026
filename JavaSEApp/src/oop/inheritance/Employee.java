package oop.inheritance;
public class Employee { // fully encapsulated class
	private int eid;
	private String ename;
	protected double basicPay;
	private static String org = "C-DAC Hyd";
	public void setEmployee(int eid, String ename, double basicPay) {
		this.eid = eid;
		this.ename = ename;
		this.basicPay = basicPay;
	}
	public void disp(){
		System.out.println(eid + " " + ename + " " + basicPay + " " + org);
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
