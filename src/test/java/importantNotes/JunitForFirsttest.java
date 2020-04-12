package importantNotes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitForFirsttest {
	String actual;
	String expected;
	FirstTest ft=new FirstTest();
	
	@Test
	public void test1() {
		 actual=ft.addOneNumber("Avishek");
		 expected="Avishek";
		 assertEquals(expected,actual);
	}
	
	@Test
	public void test2() {
		 
		actual= ft.takeMyDetails("Avi", 40);
		expected="Avi";
		 assertEquals(expected,actual);
		
	}

}
