package demo;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SecondProgram {

	
	@Test
	public void assertionsDemo() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 5;
		int val2 = 6;
		
		String[] expectedArray = {"one","two","three"};
		String[] resultArray = {"one","two","three"};
		
		//Check that two objects are equal
		assertEquals(str1,str2);
		
		//Check that a condition is true
		assertTrue(val1<val2);
		
		//Check that a condition is false
		assertFalse(val1>val2);
		
		//Check if two objects in null
		assertNull(str3);
		
		//Check if two objects references point to the same object
		assertSame(str4, str5);
		
		//Check whether two arrays are equal to each other
		assertArrayEquals(expectedArray, resultArray);
		
		
		
		
		
	}
	
}
