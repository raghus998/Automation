package basics;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class General {
	public static void main(String[] args)  throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name CB/IE/FF");
		 String browser =sc.next();
		 WebDriver driver = null;
		 if(browser.equalsIgnoreCase("ie"))
		 {
			 System.setProperty("webdriver.ie.driver","D:\\Raghu\\Workspace\\Automation\\drivers\\IEDriverServer.exe" );
			 driver = new InternetExplorerDriver();
		 }
		 else if(browser.equalsIgnoreCase("cb"))
		 {
			 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("ff"))
		 {
			 System.setProperty("webdriver.grcko.driver", "./drivers/geckodriver.exe");
			 driver = new FirefoxDriver();
		 }
		 driver.manage().window().maximize();
		 driver.get("https://www.youtube.com/watch?v=xzXb9Qsbq");
		 String title = driver.getTitle();
		 System.out.println("Title of the Current url is: = "+title);
		 String Currenturl= driver.getCurrentUrl();
		 System.out.println("Url of the current Webpage is  = "+Currenturl);
		 driver.navigate().to("https://www.hackerrank.com/");
		 String title1 = driver.getTitle();
		 System.out.println("Title of the Current url is: = "+title1);
		 String Currenturl1= driver.getCurrentUrl();
		 System.out.println("Url of the current Webpage is  = "+Currenturl1);
		 Thread.sleep(2000);
		 driver.close();
		
	}

}
