package demolisten;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class DemoListen implements ITestListener,ISuiteListener,IInvokedMethodListener{

	@Override
	public void onFinish(ITestContext arg0) {
	Reporter.log(arg0.getName()+" test Block is finished",true);		
	}

	@Override
	public void onStart(ITestContext arg0) {
		Reporter.log(arg0.getName()+" test Block is started",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		Reporter.log(arg0.getName()+" test method is Failed.",true);
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		Reporter.log(arg0.getName()+" test method is Skipped.",true);
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		Reporter.log(arg0.getName()+" test method is Started.",true);
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		Reporter.log(arg0.getName()+" test method is Passed.",true);	
	}

	@Override
	public void onFinish(ISuite arg0) {
		Reporter.log(arg0.getName()+" test Suite is finished",true);
		
	}

	@Override
	public void onStart(ISuite arg0) {
		Reporter.log(arg0.getName()+" test Suite is started",true);
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult result) {
		Reporter.log("After Invocation of:"+method.getTestMethod().getMethodName()+ " of Class:" +result.getTestClass(),true);
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult result) {
		Reporter.log("Before invocation of :"+method.getTestMethod().getMethodName()+" of Class : "+result.getTestClass(),true);
		
	}

}
