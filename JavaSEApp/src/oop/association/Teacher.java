package oop.association;

public class Teacher {
  private String name;
  private String specialization;
  private int experience;
  private static String worksFor = "C-DAC Hyd";
  private Student student;
  
  public Teacher(String name, String specialization, int experience, Student student) {
	this.name = name;
	this.specialization = specialization;
	this.experience = experience;
	this.student = student;
  }
  
  @Override
  public String toString() {
	  return name+" "+specialization+" "+experience+" "+student;
  }
 	
}
