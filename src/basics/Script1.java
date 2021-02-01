package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver cr = new ChromeDriver();
		cr.get("https://www.google.com/");
		cr.findElement(By.name("q")).sendKeys("RRB");
		Thread.sleep(2000);
		cr.close();
	}

}