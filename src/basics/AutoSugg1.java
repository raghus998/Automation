package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");
		Thread.sleep(3000);
		String xp = "//span[contains(text(),'qspiders')]";
		List<WebElement> allsug = driver.findElements(By.xpath(xp));
		System.out.println(allsug.size());
		int count = allsug.size();
		
		for (int i = 0; i < count; i++) {
			WebElement sug = allsug.get(i);
			String text = sug.getText();
			System.out.println(text);
		}
		allsug.get(count-3).click();
		//driver.close();

}
}