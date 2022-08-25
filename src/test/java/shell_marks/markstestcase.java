package shell_marks;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.After;
import org.junit.Test;
public class markstestcase {
	Marks mark;
	@Before
	public void thisIsBeforeAnnotation() {
		mark = new Marks();
		
	}

	@Test
	public void validategradefail() {
		String expectedResult= "fail";
		String actualResult = mark.gradefail(10);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	
	@Test
	public void validategrade3() {
		String expectedResult= "3rd Grade";
		String actualResult = mark.gradefail(40);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void validategrade2() {
		String expectedResult= "2nd Grade";
		String actualResult = mark.gradefail(60);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void validategrade1() {
		String expectedResult= "1st grade";
		String actualResult = mark.gradefail(80);
		Assert.assertEquals(expectedResult, actualResult);
	}
	@After
	public void tearDown() {
		System.out.println("Testcase is completed");
	}
	
}
