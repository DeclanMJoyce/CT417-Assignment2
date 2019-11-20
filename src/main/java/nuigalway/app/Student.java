package main.java.nuigalway.app;

public class Student {

	private String name;
	private String age;
	private String dob;
	private String id;
	private String username;
	private String course;
	private String modules;
	
public Student(String name, String age, String dob, String id, String course) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
		this.course = course;
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

	public String getCourses() {
		return course;
	}

	public void setCourses(String course) {
		this.course = course;
	}

	public String getModules() {
		return modules;
	}

	public void setModules(String modules) {
		this.modules = modules;
	}

}
