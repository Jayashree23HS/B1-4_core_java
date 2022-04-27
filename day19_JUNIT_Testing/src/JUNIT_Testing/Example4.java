package JUNIT_Testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;

class Example4 {
	@AfterAll   
	static void display()
	{
		System.out.println("hey");
	}
	@Test
	void display1()
	{
		System.out.println("john");
	
	}

}
