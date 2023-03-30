
package demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

public class RepeatedTestDemo {
	
	//@RepeatedTest(5)
	//public void demo() {
	//	System.out.println("Hello");
	//}
	
	@RepeatedTest(value=5, name="{displayName} {CurrentRepetition}/{totalRepetitions}")
	@DisplayName("Execution")
	public void demo(TestInfo testinfo) {
		System.out.println(testinfo.getDisplayName());
		
		
	}

}
