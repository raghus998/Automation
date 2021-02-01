package sys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		 WebElement from = driver.findElement(By.id("FromTag"));
		
		Actions act = new Actions(driver);
		act.sendKeys(from, "bhu").perform();
		Thread.sleep(8000);
		for (int i = 0; i < 5; i++) {
			act.sendKeys(Keys.DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String stmt = "return document.getElementById('FromTag').value";
		 String name = (String) js.executeScript(stmt);
		 System.out.println(name);
		 
		 
				
		

}
}