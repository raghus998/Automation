package selectclass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxM5 {
		
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		int count1 = 0;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///D:/Raghu/Workspace/HTML/ListBoxM.html");
		WebElement hotel = driver.findElement(By.id("slv"));
		Select sel = new Select(hotel);
		List<WebElement> alloptions = sel.getOptions();
		ArrayList<String> allText = new ArrayList<>();
		int count = alloptions.size();
		for (int i = 0; i < count; i++)
		{
			WebElement options = alloptions.get(i);
			String text = options.getText();
			if(text.equals("Dosa"))
			{
				count1++;
			}
			allText.add(text);
		}
		HashSet<String> allTextCopy = new HashSet<>(allText);
		if(allText.size()==allTextCopy.size())
		{
			System.out.println("The List Not dupicates");
		}
		else
		{
			System.out.println("The List Duplicates");
		}
		if(allText.contains("Dosaaaaaaaaaaa"))
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
		if(count1>1)
		{
			System.out.println("Element is Duplicate");
		}
		else
		{
			System.out.println("Element is not Duplicate");
		}
		driver.close();
}
}
