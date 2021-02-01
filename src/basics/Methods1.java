package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		
		 driver.get("http://www.google.com");
		 String title = driver.getTitle();
		 System.out.println("Title :"+title);
		 
		  String url = driver.getCurrentUrl();
		  System.out.println("URL:"+url);
		  driver.close();
	}
}
