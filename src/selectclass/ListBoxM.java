package selectclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxM {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/Raghu/Workspace/HTML/ListBoxM.html");
		WebElement hotel = driver.findElement(By.id("slv"));
		Select sel = new Select(hotel);
		sel.selectByIndex(2);
		Thread.sleep(5);
		sel.selectByIndex(3);
		sel.selectByVisibleText("Idly");
		sel.deselectByIndex(3);
		sel.deselectAll();
		if(sel.isMultiple())
		{
			System.out.println("The List box is Multiselect");
		}
		else
		{
			System.out.println("The List biox is Singleselect");
		}
	}

}
