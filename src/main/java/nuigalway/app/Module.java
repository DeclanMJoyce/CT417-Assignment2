package main.java.nuigalway.app;

import java.util.ArrayList;

public class Module {

	private String name;
	private String id;
	private ArrayList students;
	private ArrayList courses;
	
	public Module(String name, String id, ArrayList students, ArrayList courses) {
		this.name = name;
		this.id = id;
		this.students = students;
		this.courses = courses;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList getStudents() {
		return students;
	}

	public void setStudents(ArrayList students) {
		this.students = students;
	}

	public ArrayList getCourses() {
		return courses;
	}

	public void setCourses(ArrayList courses) {
		this.courses = courses;
	}
	
	
}
