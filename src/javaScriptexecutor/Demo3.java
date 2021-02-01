package javaScriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		WebElement java = driver.findElement(By.xpath("//td[.='Java']"));
		int y = java.getLocation().getY();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		String scroll = "window.scrollBy(0,"+y+")";
		j.executeScript(scroll);

}
}
