package dynamicScreenShots;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListeners extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Case executed successfully",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log(failedMethod+"This is the failed method of test case");
		failedMethod(failedMethod);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Case skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Test Case started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Test Case finished",true);
	}
  
  
}
