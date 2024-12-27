package section16;

import org.testng.annotations.Test;

public class TestNg3_133 {

	@Test
	public void WebLoginHomeLoan() {
		// selenium
		System.out.println("Web login home");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan() {
		// appium
		System.out.println("Mobile login home");
	}
	
	@Test
	public void LoginApiHomeLoan() {
		// Rest API automation
		System.out.println("API login home");
	}
}
