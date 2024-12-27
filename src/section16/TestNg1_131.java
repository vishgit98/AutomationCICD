package section16;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNg1_131 { // Running test cases in TestNG with out Java compiler

	@AfterTest // will execute at the end of a particular module.
				// Generally used to delete cookies, stop process, read reports etc.
	private void lastExecution() {
		System.out.println("will exec last");

	}

	@Test(groups= {"Smoke"})
	public void Demo() { // any method annotated as @Test is treated as test case
		System.out.println("hello");
	}
	
	@AfterSuite
	private void AfLast() {
		System.out.println("will exec at the end of Suite");

	}

	@Test
	public void Demo2() { // can trigger multiple TCs in a single class
		System.out.println("bye");
	}
}
