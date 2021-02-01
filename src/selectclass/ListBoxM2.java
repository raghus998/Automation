package selectclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxM2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///D:/Raghu/Workspace/HTML/ListBoxM.html");
		WebElement hotel = driver.findElement(By.id("slv"));
		Select sel = new Select(hotel);
		List<WebElement> alloptions = sel.getOptions();
		int count = alloptions.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		for (int i = 0; i < count; i++) {
			WebElement options = alloptions.get(i);
			String text = options.getText();
			System.out.println(text);
			
		}
		driver.close();
	}

}
