package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleartrip {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.className("nextMonth ")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("nextMonth ")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[.='December']/../../..//a[.='25']")).click();
		List<WebElement> dec = driver.findElements(By.xpath("//span[.='December']/../../..//a"));
		for(WebElement date: dec) {
			String text = date.getText();
			if(text.equalsIgnoreCase("25"))
			{
				date.click();
				break;
			}
		
			
		}
		

}
}