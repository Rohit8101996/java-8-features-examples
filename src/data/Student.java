package data;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int gradeLevel;
	private double gpa;
	private String gender;
	private List<String> activities=new ArrayList<String>();
	
	public Student(String name, int gradeLevel, double gpa, String gender,List<String> activities) {
		super();
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.gender = gender;
		this.setActivities(activities);
	}
	public Student(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
	
	public void printListOfActivities()
	{
		System.out.println(activities);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gradeLevel=" + gradeLevel + ", gpa=" + gpa + ", gender=" + gender
				+ ", activities=" + activities + "]";
	}
	
}
