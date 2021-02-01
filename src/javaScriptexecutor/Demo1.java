package javaScriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Raghu/Workspace/HTML/javaScipt1.html");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		String stmt = "document.getElementById('n').value='RS'";
		j.executeScript(stmt);
		Thread.sleep(3000);
		String stmt1 = "document.getElementById('n').value=' '";
		j.executeScript(stmt1);
		String stmt2 = "document.getElementById('q').click()";
		j.executeScript(stmt2);
		
		
	}

}
