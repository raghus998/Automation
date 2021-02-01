package testNG;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Name {
	@Test
	public void hi() {
		Reporter.log("hi",true);
	}
	/*@Test
	public void bye() {
		Reporter.log("bye",true);
	}*/
	@AfterMethod
	public void postCondition(ITestResult res) {
		String name = res.getName();
		Reporter.log("name= "+name,true);
		int s = res.getStatus();
		Reporter.log("Ststus= "+s,true);	
	}
}
