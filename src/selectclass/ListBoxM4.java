package selectclass;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.HashAttributeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxM4 {
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
		//HashSet<String> allText = new HashSet<>();
		TreeSet<String> allText = new TreeSet<>();
		for (int i = 0; i < count; i++)
		{
			WebElement options = alloptions.get(i);
			String text = options.getText();
			allText.add(text);
		}
		for (String text1: allText) {
			System.out.println(text1);
		}
		driver.close();

}
}
