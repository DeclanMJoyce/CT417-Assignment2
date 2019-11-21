package main.java.nuigalway.app;

import java.util.ArrayList;
import org.joda.time.DateTime;
import java.util.Date;

public class Course {

	private String courseName;
	private DateTime startDate;
	private DateTime endDate;
	
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
	
	
}
