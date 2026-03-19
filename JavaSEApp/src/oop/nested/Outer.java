package oop.nested;

public class Outer { // final abstract strictfp
	
	private String data = "C-DAC Hyd";
	
	// nested classes - non - static => inner 
	class Inner{ // private protected and static
		void msg() {
			System.out.println(data);
		}
	} // end of Inner
	
	public void disp() {
		System.out.println(data);
		Inner in = new Inner();
		in.msg();
	}
		
	public static void main(String[] args) {
		Outer out = new Outer();
		out.disp();
	}

} // end of Outer
