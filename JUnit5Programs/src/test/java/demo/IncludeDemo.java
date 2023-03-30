package demo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@IncludeTags("regression")

public class IncludeDemo {
	
	@Test
	@Tag("regression")
	public void methodA(TestInfo testInfo) {
		
	}
	
	@Test
	@Tag("smoke")
	public void methodB(TestInfo testInfo) {
		
	}
	
	@Test
	@Tag("regeression")
	public void methodC(TestInfo testInfo) {
		
	}
	
	

}
