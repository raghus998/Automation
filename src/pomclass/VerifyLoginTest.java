package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLoginTest {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@Test
	public void testVerifyLogin() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		LoginHRPage lp = new LoginHRPage(driver);
		lp.enterUserName("Admin");
		lp.enterPassword("admin1234");
		lp.clickOnLogin();
		Thread.sleep(3000);
		lp.enterUserName("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}

}
