package demo;

import org.junit.jupiter.api.Test;

public class TestInterfaces {
	
	@Test
	public void testBehaviour() {
		// WebDriver driver = new ChromeDriver();
		// Interface object = new ImplementingCLass();
		
		Behaviour tiger = new Tiger();
		tiger.eat();
		tiger.sleep();
		tiger.run();
		tiger.fly();
		
		Behaviour ant = new Ant();
		ant.eat();
		ant.sleep();
		ant.run();
		ant.fly();
		}
	
	

}
