package demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsDemo {

	@Test
	public void test1() {
		//assertTrue("abc".contains("a"));
		Assumptions.assumeTrue("abc".contains("z"));
		System.out.println("Hello");
	}
}
