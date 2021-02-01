package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script4 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Dimension d = new Dimension(200, 200);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p = new Point(250, 250);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://demo.stqatools.com/Alerts.php");
		driver.navigate().refresh();
		driver.navigate().to("https://arc.emids.com/login");
		driver.navigate().back();
		driver.navigate().forward();
		

}
}