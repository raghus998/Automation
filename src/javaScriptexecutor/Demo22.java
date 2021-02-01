package javaScriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo22 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
	/*	String stmt = "window.scrollBy(0,500)";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(stmt);
		Thread.sleep(2000);
		String stmt1 = "window.scrollBy(0,-500)";
		js.executeScript(stmt1);
		Thread.sleep(2000);
		for (int i = 0; i <= 10; i++) {
		String stmt1 = "window.scrollBy(0,50)";
		js.executeScript(stmt1);
		Thread.sleep(1000);
		}*/
		
		
		
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement java = driver.findElement(By.xpath("//td[.='Java']"));
		int y = java.getLocation().getY();
		String stmt1 = "window.scrollBy(0,"+y+")";
		js.executeScript(stmt1);
		Thread.sleep(3000);
		driver.close();

}
}