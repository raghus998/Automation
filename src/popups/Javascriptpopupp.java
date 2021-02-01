package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptpopupp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/Raghu/Workspace/HTML/popup1.html");
		//driver.findElement(By.id("c")).click();
		//Alert a = driver.switchTo().alert();
		//String text = a.getText();
		//System.out.println(text);
		//a.accept();
		//a.dismiss();
		driver.findElement(By.id("p")).click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.sendKeys(text);
		a.accept();
	}
}
