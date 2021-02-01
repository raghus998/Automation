package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hacker_Rank {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hackerrank.com/");
		driver.findElement(By.id("menu-item-907")).click();
		driver.findElement(By.className("fl-button-text")).click();
		driver.findElement(By.xpath("//input[@id='input-1']")).sendKeys("raghus998@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-2']")).sendKeys("raghus998");
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]]")).click();	
	}

}
