package section16;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg2_132 { // running Test suite using xml file

	@Test(groups= {"Smoke"})
	public void Demo3() {
		System.out.println("take care");
	}
	
	
	@BeforeTest	// used if want to cleanup data from database or run any prerequisite test before main TCs etc.
	public void prerequisite() {
		System.out.println("will execute before any test");
	}
}
