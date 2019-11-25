package main.java.nuigalway.app;

import java.util.ArrayList;

public class Student {

	private String name;
	private String age;
	private String dob;
	private String id;
	private String username;
	private String course;
	private ArrayList<Module> modules;
    private ArrayList<Course> courses;
	
public Student(String name, String age, String dob, String id, String course) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
		this.course = course;
		
		modules = new ArrayList<>();
        courses = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername() {
		username = name + age;
		this.username = username;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(Module module) {
		this.modules.add(module);
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(Course course) {
		this.courses.add(course);
	}

	
}
