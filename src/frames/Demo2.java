package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/Raghu/Workspace/HTML/Page1f.html");	
		driver.findElement(By.id("fn")).sendKeys("raghu");
		driver.switchTo().frame(0);
		driver.findElement(By.id("mn")).sendKeys("s");
		driver.switchTo().frame(0);
		driver.findElement(By.id("a")).sendKeys("18+");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("j")).sendKeys("IPS");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ln")).sendKeys("N");
		Thread.sleep(5000);
		driver.close();
		
	}
}
