package javaScriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
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
		driver.get("https://www.seleniumhq.org/download/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		for (int i = 0; i < 10; i++) {
			String Down = "window.scrollBy(0,50)";
			j.executeScript(Down);
			Thread.sleep(1000);
		}
		/*String Down = "window.scrollBy(0,1000)";
		j.executeScript(Down);
		String Up = "window.scrollBy(0,-1000)";
		j.executeScript(Up);*/
		
	}
}
