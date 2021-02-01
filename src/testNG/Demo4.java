package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 extends BaseTest {
	@Test(priority=2,groups="one")
	public void testB()
	{
		Reporter.log("TestB()",true);
	}
	@Test(priority=3,groups="one")
	public void testC()
	{
		Reporter.log("TestC()",true);
	}

}
