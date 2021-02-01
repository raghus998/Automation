package selectclass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Collections2;

public class ListBoxM3 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///D:/Raghu/Workspace/HTML/ListBoxM.html");
		WebElement hotel = driver.findElement(By.id("slv"));
		Select sel = new Select(hotel);
		ArrayList<String> allText = new ArrayList<String>();
		List<WebElement> alloptions = sel.getOptions();
		int count = alloptions.size();
		for (int i = 0; i < count; i++) 
		{
			WebElement options = alloptions.get(i);
			String text = options.getText();
			allText.add(text);
		}
		//ArrayList<String> allTextCopy = new ArrayList<>(allText);
		Collections.sort(allText);
		/*if(allText.equals(allTextCopy))
		{
			System.out.println("Sorted");
		}
		else
		{
			System.out.println("Not Sorted");
		}*/
		for (int i = 0; i < allText.size(); i++) 
		{
			String text = allText.get(i);
			System.out.println(text);
			
		}
		/*for (String text : allText) {
			System.out.println(text);
			
		}*/
		driver.close();
	
	}
		
}
