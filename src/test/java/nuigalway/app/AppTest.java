package test.java.nuigalway.app;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.junit.Test;

import main.java.nuigalway.app.Course;
import main.java.nuigalway.app.Module;
import main.java.nuigalway.app.Student;


public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
    	
    	// creating Student objects
    	Student student1 =  new Student("James", "21", "15/04/1998", "16384703", "ECE");
    	Student student2 =  new Student("John", "22", "01/05/1997", "16368412", "ECE");
		Student student3 =  new Student("Shane", "20", "20/03/1999", "16374433", "ECE");
		Student student4 =  new Student("Matt", "21", "28/01/1998", "16393210", "CSIT");
		Student student5 =  new Student("Callum", "22", "04/02/1997", "16323421", "CSIT");
		Student student6 =  new Student("Glenn", "20", "10/06/1999", "16396512", "CSIT");
		
		// testing Student methods
		assertEquals(student1.getName() ,"James");
		assertEquals(student1.getAge() ,"21");
		assertEquals(student1.getDob() ,"15/04/1998");
		assertEquals(student1.getId() ,"16384703");
		assertEquals(student1.getCourse() ,"ECE");
    	student1.setUsername();
        assertEquals(student1.getUsername() ,"James21");
        
        // adding Student objects the Student Arraylists
        ArrayList <Student> eceStudents = new ArrayList();
        eceStudents.add(student1);
        eceStudents.add(student2);
        eceStudents.add(student3);
        
        ArrayList <Student> csitStudents = new ArrayList();
        csitStudents.add(student4);
        csitStudents.add(student5);
        csitStudents.add(student6);
        
        // creating Module Objects
        Module softEngineering = new Module("Software Engineering", "CT417");
        Module machineLearning = new Module("Machine Learning", "CT4101");
        Module digitalSignalProcessing = new Module("Digital Signal Processing", "EE445");
        Module telecommunications = new Module("Telecommunications", "EE453");
        Module artificialIntelligence = new Module("Artificial Intelligence", "CT421");
        Module rings = new Module("Rings", "MA416");
        
        // testing Module methods
        assertEquals(softEngineering.getName() ,"Software Engineering");
        assertEquals(rings.getId() ,"MA416");
        
        // adding Module objects to Module Arraylist
        ArrayList <Module> eceModules = new ArrayList();
        eceModules.add(softEngineering);
        eceModules.add(machineLearning);
        eceModules.add(digitalSignalProcessing);
        eceModules.add(telecommunications);
        
        
        ArrayList <Module> csitModules = new ArrayList();
        csitModules.add(softEngineering);
        csitModules.add(machineLearning);
        csitModules.add(artificialIntelligence);
        csitModules.add(rings);
        
        // creating Course objects
        Course ece = new Course("Electronic Engineering", new LocalDate(2019,9,01), new LocalDate(2020, 5, 31));
        Course csit = new Course("Computer Science", new LocalDate(2019,9,01), new LocalDate(2020, 5, 31));
        
        // testing Course methods
        assertEquals(ece.getCourseName() ,"Electronic Engineering");
        assertEquals(csit.getStartDate() , new LocalDate(2019,9,01));
        assertEquals(ece.getEndDate() ,new LocalDate(2020, 5, 31));
        
        // adding Course objects to Course Arraylist
        ArrayList courses = new ArrayList();
        courses.add(ece);
        courses.add(csit);
        
        // adding Module objects to Course
        ece.setModules(softEngineering);
        ece.setModules(machineLearning);
        ece.setModules(digitalSignalProcessing);
        ece.setModules(telecommunications);
        
        csit.setModules(softEngineering);
        csit.setModules(machineLearning);
        csit.setModules(artificialIntelligence);
        csit.setModules(rings);
        
        assertEquals(softEngineering.getCourses(), courses);
        assertEquals(machineLearning.getCourses(), courses);
        
        // Adding Students to Course
        ece.setStudents(student1);
        ece.setStudents(student2);
        ece.setStudents(student3);
        csit.setStudents(student4);
        csit.setStudents(student5);
        csit.setStudents(student6);
        
    }
}
