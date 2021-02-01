package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInMainClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		LoginHRPage lg = new LoginHRPage(driver);
		lg.enterUserName("Admin");
		lg.enterPassword("admin1234");
		lg.clickOnLogin();
		Thread.sleep(2000);
		lg.enterUserName("Admin");
		lg.enterPassword("admin123");
		lg.clickOnLogin();
	}
}
