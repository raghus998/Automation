package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class Demo1 {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://home.redbrickhealth.com/");
		WebElement solutions = driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[@title='Solutions']"));
		Actions act = new Actions(driver);
		act.moveToElement(solutions).perform();
		driver.findElement(By.xpath("//a[.='Problems We Solve']")).click();
		Thread.sleep(5000);
		driver.close();
	}
	

}
