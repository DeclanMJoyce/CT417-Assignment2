package main.java.nuigalway.app;

import java.util.ArrayList;

public class Module {

	private String name;
	private String id;
	private ArrayList<Student> students;
    private ArrayList<Course> courses;
	
	public Module(String name, String id) {
		this.name = name;
		this.id = id;
		
		students = new ArrayList<>();
        courses = new ArrayList<>();

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

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(Student student) {
		this.students.add(student);
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(Course course) {
		this.courses.add(course);
	}	
	
	
}
