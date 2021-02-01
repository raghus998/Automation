package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Demo1 d1 = new Demo1(driver);
		d1.enterUserName("Admin");
		d1.enterPassword("admin1234");
		d1.clickOnLogin();
		Thread.sleep(3000);
		d1.enterUserName("Admin");
		d1.enterPassword("admin123");
		d1.clickOnLogin();
		
	}
	

}
