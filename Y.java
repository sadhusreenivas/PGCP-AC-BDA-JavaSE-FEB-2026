
class ThisTest{
    
    void test(){
    	System.out.println(this); //
    }

	public static void main(String[] args) {
		
		ThisTest t = new ThisTest(); 
		System.out.println(t); // HashCode
		//System.out.println(this);
		t.test();
	}
}