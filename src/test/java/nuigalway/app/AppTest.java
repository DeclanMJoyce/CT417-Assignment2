package test.java.nuigalway.app;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import main.java.nuigalway.app.Module;
import main.java.nuigalway.app.ProgrammingClass;
import main.java.nuigalway.app.Student;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	Student student1 =  new Student("James", "21", "15/04/1998", "16384703", "ECE");
    	student1.setUsername();
        assertEquals(student1.getUsername() ,"James21");
        
        
    }
}
