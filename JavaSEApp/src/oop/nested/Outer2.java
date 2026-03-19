package oop.nested;

public class Outer2 { // final abstract strictfp
	
	private String data = "C-DAC Hyd";
	
	public void disp() {
		System.out.println(data);
	}
	
	// nested classes - non - static => inner 
	class Inner{ // private protected and static
		void msg() {
			System.out.println(data);
		}
	} // end of Inner
		
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.disp();
		
		// inner object
		Outer2.Inner in = out.new Inner();
		in.msg();
	}

} // end of Outer
