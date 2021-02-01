package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Raghu\\Workspace\\Automation\\drivers\\geckodriver.exe");
		FirefoxDriver fr = new FirefoxDriver();
		Thread.sleep(5000);
		fr.close();
	}

}
