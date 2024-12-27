package section16;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Listeners listens to Test and redirect to particular method/block acc. to our requirements if any test pass/fails.
// ITestListener: it's an interface which have all the methods for testng Listeners.
// have to tell "testng.xml" file where exactly Listeners class is located.

public class Listeners_143 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Successfully executed listeners Pass code..!!" + result.getName()); // prints method name.	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// screenshot code if any test fails.

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
