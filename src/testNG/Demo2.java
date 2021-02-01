package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 extends BaseTest{
	@Test
	public void registerUser()
	{
		Reporter.log("User Registerd",true);
	}
	@Test
	public void deleteUser()
	{
		Reporter.log("User deleted",true);
	}

}
