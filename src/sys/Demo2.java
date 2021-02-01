package sys;

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
		Thread.sleep(2000);
	//	String stmt = "window.scrollBy(0,5000)";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String stmt = "window.scrollBy(0,5000)";

		js.executeScript(stmt);

}
}