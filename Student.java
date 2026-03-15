class Student{
	int rno; // prim + instance
	String name; // ref + instance
	double gpa; // prim + instance
	static String org = "C-DAC Hyd"; // ref + class
	
    
    void setStudentData(){
    	java.util.Scanner scanner = new java.util.Scanner(System.in);
    	System.out.println("Pls enter rno");
    	rno = scanner.nextInt();
    	System.out.println("Name?");
    	name = scanner.next();
    	System.out.println("GPA?");
    	gpa = scanner.nextDouble();
    }

	void getStudent(){
		System.out.println(rno+" "+name+" "+gpa+" "+org);
	}
	public static void main(String[] args) { // starting point
		
		Student[] students = new Student[5]; // array creation
		for(int i=0; i<students.length;i++){
            students[i] = new Student();
			students[i].setStudentData();
			students[i].getStudent();
		}
	}
}