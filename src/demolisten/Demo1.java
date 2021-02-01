package demolisten;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1
{
	@Test
	public void TestA1()
	{
		Reporter.log("TestA1.... ",true);
	}
	
	@Test
	public void TestB1()
	{
		Reporter.log("TestB1.... ",true);
		Assert.fail();
	}
	@Test
	public void testC1()
	{
		Reporter.log("TestC1()..........",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "testC1")
	public void testD1()
	{
		Reporter.log("TestD1()..........",true);
	}

}
