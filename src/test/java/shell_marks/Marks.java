package shell_marks;

import org.junit.Test;

public class Marks {
	String grade;
	
	public String gradefail(int marks) {
		if(marks <= 35)
			grade="fail";
		return grade ;
	}
		
		
	
	public String grade3(int marks) {
		if(marks >=36 && marks<= 50)
			grade = "3rd Class";
		return grade ;
	}
	
	public String grade2(int marks) {
		if(marks>=51 && marks<=75)
			grade = "2nd Class";
		return grade ;
		
	}
	
	public String grade1(int marks) {
		if(marks>=76 && marks<=100)
			grade = "1st class";
		return grade ;
	}
	}
	