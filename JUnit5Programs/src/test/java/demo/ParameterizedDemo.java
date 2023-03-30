package demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedDemo {
	
	@ParameterizedTest
	@ValueSource(ints = {1,20,300})
	public void testValueSource(int i) {
		System.out.println(i);
	}

}
