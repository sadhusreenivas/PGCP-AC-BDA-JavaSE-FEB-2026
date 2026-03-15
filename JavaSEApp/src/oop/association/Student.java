package oop.association;

public class Student {
  private int sid;
  private String sname;
  private double gpa;
  
  private Course course; // object ref

  public Student(int sid, String sname, double gpa, Course course) {
	this.sid = sid;
	this.sname = sname;
	this.gpa = gpa;
	this.course = course;
  }

  @Override
  public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", gpa=" + gpa + ", course=" + course + "]";
  }
  
  
  
}
