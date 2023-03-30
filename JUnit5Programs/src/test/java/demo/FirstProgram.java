package demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FirstProgram {
	
	@BeforeAll
	public static void setup() {
		System.out.println("Hello");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	@Disabled
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test3");
	}
	
	@AfterAll
	public static void tear() {
		System.out.println("Good bye");
	}

}
