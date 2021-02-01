package popups;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivdionpopup1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat s1 = new SimpleDateFormat("MMMM");
		String month = s1.format(date);
		SimpleDateFormat s2 = new SimpleDateFormat("d");
		String day = s2.format(date);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//span[.='"+month+"']/../../..//a[.='"+day+"']")).click();
	}
}
