package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.Scanner;

public class Methods {
	public static void main(String[] args) throws InterruptedException {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a Browser name IE/Cr/Fr");
		String browser = Sc.next();
		WebDriver driver =null;
		if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		else if(browser.equalsIgnoreCase("cr"))
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver  = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.flipcart.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().to("http://www.emids.com");
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().to("http://www.seleniumhq.com");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
	}

}
