package sys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpWa
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try 
		{
			wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
			System.out.println("Pass");
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		driver.findElement(By.id("logoutLink")).sendKeys(Keys.ENTER);
		driver.close();
}
}