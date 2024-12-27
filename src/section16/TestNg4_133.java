package section16;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg4_133 {

	@BeforeClass // class level
	private void BefClass() {
		System.out.println("will exec only once before any method in this class");

	}

	@AfterClass // class level
	private void AftClass() {
		System.out.println("will exec only once after exec all the methods of the class");

	}

	@Test(dataProvider = "getData")
	public void WebLoginCarLoan(String uname, String pass) {
		// selenium
		System.out.println("Web login Car");
		System.out.println(uname + " : " + pass);
	}

	@Parameters({ "carURL" }) // module level
	@BeforeMethod // Specific to class file and will exec before each and every method.
					// can be used to delete caches and cookies before any method in a class.
	private void BeforeEachTC(String url) {
		System.out.println("will exec before every test method in this class");
		System.out.println(url);

	}

	@Test(timeOut = 4000) // deliberately setting timeout before failing for a particular method which is
							// taking more time to exec.
	public void MobileLoginCarLoan() {
		// appium
		System.out.println("Mobile login Car");
	}

	@Parameters({ "URL" }) // suite level
	@BeforeSuite
	private void BfSuite(String url) {
		System.out.println("I'm number 1");
		System.out.println(url);
	}

	@Test(enabled = false) // will be skipped from the execution.
							// can be used if there's any bug in any method.
	public void MobileSigninCarLoan() {
		// appium
		System.out.println("Mobile signin Car");
	}

	@Test
	public void MobileSignoutCarLoan() {
		// appium
		System.out.println("Mobile signout Car");
	}

	@Parameters({ "carURL", "APIKey/username" })
	@Test
	public void ApiCarLoan(String url, String key) {
		// Rest API automation
		System.out.println("API login Car");
		System.out.println(url);
		System.out.println(key);
	}

	@DataProvider
	private Object[][] getData() {
		// 1st combination: username/pwd = good credit history
		// 2nd combination: username/pwd = no credit history
		// 3rd combination: username/pwd = fraudelent credit history
		Object[][] data = new Object[3][2];
		data[0][0] = "username1";
		data[0][1] = "pwd1";
		data[1][0] = "username2";
		data[1][1] = "pwd2";
		data[2][0] = "username3";
		data[2][1] = "pwd3";
		
		return data;
	}
}
