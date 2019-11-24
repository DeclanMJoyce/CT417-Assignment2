package main.java.nuigalway.app;

import java.util.ArrayList;
import org.joda.time.DateTime;
import java.util.Date;

public class Course {

	private String courseName;
	private DateTime startDate;
	private DateTime endDate;

	private ArrayList<Module> modules;
	private ArrayList<Student> students;

	public Course(String courseName, DateTime startDate, DateTime endDate) {

		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;

	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(Module module) {
		this.modules.add(module); // add module
		module.setCourses(this); // adds this course to module object
		for (Student s : students) {
			// if there are already students enrolled to this course
			// register the students in module
			module.setStudents(s);
			// given the student the new module
			s.setModules(module);
		}
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(Student student) {
		this.students.add(student); // add student
		student.setCourses(this); // adds this course to student object
		for (Module m : modules) {
			// if there are already modules for this course
			// give the students these modules
			m.setStudents(student);
			// give the module the new student
			student.setModules(m);
		}
	}

}

