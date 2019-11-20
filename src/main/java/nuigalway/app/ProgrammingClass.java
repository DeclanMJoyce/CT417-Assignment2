package main.java.nuigalway.app;

import java.util.ArrayList;
import java.util.Date;

public class ProgrammingClass {

	private String courseName;
	private ArrayList modules;
	private ArrayList students;
	private Date startDate;
	private Date endDate;
	
	public ProgrammingClass(String courseName, ArrayList modules, ArrayList students, Date startDate, Date endDate) {
		
		this.courseName = courseName;
		this.modules = modules;
		this.students = students;
		this.startDate = startDate;
		this.endDate = endDate;
		
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ArrayList getModules() {
		return modules;
	}

	public void setModules(ArrayList modules) {
		this.modules = modules;
	}

	public ArrayList getStudents() {
		return students;
	}

	public void setStudents(ArrayList students) {
		this.students = students;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
