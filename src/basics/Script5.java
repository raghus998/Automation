package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Script5
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		InternetExplorerDriver cr = new InternetExplorerDriver();
		cr.get("https://www.google.com/");
		cr.findElement(By.name("q")).sendKeys("RRB");
		Thread.sleep(2000);
		cr.close();

}
}