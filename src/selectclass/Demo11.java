package selectclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo11 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///D:/Raghu/Workspace/HTML/ListBoxM.html");
		WebElement hotel = driver.findElement(By.id("slv"));
		Select sel = new Select(hotel);
		sel.selectByIndex(3);
		//sel.deselectByIndex(3);
		sel.selectByVisibleText("dosa");
		sel.selectByIndex(1);
		List<WebElement> allSelectedoptions = sel.getAllSelectedOptions();
		for (WebElement option  : allSelectedoptions)
		{
			String text = option.getText();
			System.out.println(text);
		}
		List<WebElement> alloptions = sel.getOptions();
		int count = alloptions.size();
		System.out.println("Total no of Elements : "+count);
		System.out.println("The all options are.........");
		for (WebElement option : alloptions) 
		{
			String text = option.getText();
			System.out.println(text);
			
		}
		
		
	}

}
