package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 extends BaseTest{
	@Test(priority=1,groups="one")
	public void testA()
	{
		Reporter.log("TestA()",true);
	}

}
