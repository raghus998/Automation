package javaScriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Raghu/Workspace/HTML/Dis.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String stmt = "document.getElementById('l').value='RS'";
		js.executeScript(stmt);
		Thread.sleep(3000);
		String stmt1 = "document.getElementById('l').value=' '";
		js.executeScript(stmt1);
		Thread.sleep(3000);
		String stmt3 = "document.getElementById('a').click()";
		js.executeScript(stmt3);
		Thread.sleep(3000);
		driver.close();

}
}