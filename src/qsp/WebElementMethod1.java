package qsp;

import java.security.Key;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod1
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/RS/HTML_Files/WebElementMethods.html");
		WebElement fname = driver.findElement(By.id("fn"));
		WebElement lname = driver.findElement(By.id("ln"));
		fname.sendKeys("Raghu");
		fname.sendKeys(Keys.CONTROL+"ac");
		lname.sendKeys(Keys.CONTROL+"v");
		lname.clear();
		fname.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
	
		
	}

}
