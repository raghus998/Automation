package basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Script2  {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver ie = new FirefoxDriver();
		ie.get("https://demo.actitime.com/login.do");
		ie.manage().window().maximize();
		Thread.sleep(5000);
		ie.close();
	}

}
