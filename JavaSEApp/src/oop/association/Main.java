package oop.association;
public class Main {
	public static void main(String[] args) {
		
		Course course1 = new Course(20, "PGCP-AC", 66);
		Course course2 = new Course(25,"PGCP-BDA",44);
		
		Student s1 = new Student(19, "Gaurav", 8.9, course1);
		Student s2 = new Student(34, "Rushi", 7.5, course2);
		
		Teacher t1 = new Teacher("ABC","Java Tech", 10, s1);
		Teacher t2 = new Teacher("XYZ","Big Data", 10, s2);
		
		System.out.println(t1);
		System.out.println(t2);
		
	}
}
