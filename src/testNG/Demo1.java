package testNG;

import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Demo1 {
	@Test()
	public void testA()
	{
		Reporter.log("hi",true);
	}
	
	@Ignore
	@Test()
	public void testB()
	{
		Reporter.log("hii",true);
	}
	

}
