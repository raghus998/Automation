package demolisten;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(value = demolisten.DemoListen.class)
public class Demo 
{
	@Test
	public void testA()
	{
		Reporter.log("TestA()..........",true);
	}
	
	@Test
	public void testB()
	{
		Reporter.log("TestB()..........",true);
	}

	
	@Test
	public void testC()
	{
		Reporter.log("TestC()..........",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "testC")
	public void testD()
	{
		Reporter.log("TestD()..........",true);
	}
}
