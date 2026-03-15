package oop.association;

public class Course {
	private int courseId;
	private String courseName;
	private int totalStudents;
	
	public Course(int courseId, String courseName, int totalStudents) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.totalStudents = totalStudents;
	}
	
	public String toString() {
		return "Course Details:\n"+courseId+"\t"+courseName+"\t"+totalStudents;
	}
	

}
