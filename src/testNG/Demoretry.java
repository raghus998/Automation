package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demoretry {
	@Test
	public void testA() {
		Reporter.log("TestA", true);
	}
	
	@Test(retryAnalyzer = testNG.RetryListner.class)
	public void testB()
	{
		Reporter.log("TestB",true);
		Assert.assertTrue(0>1);
	}

}
