package JUNIT_Testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class Example5 {

	@Test
	void accept()
	{
		System.setProperty("1", "john");
		Assumptions.assumeFalse("john".equals(System.getProperty("2")));
		
		 
	}

}
