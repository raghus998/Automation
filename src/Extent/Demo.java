package Extent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Demo {
	@Test
	public void Demo1() throws InterruptedException
	{
		ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("report.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreport);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
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
