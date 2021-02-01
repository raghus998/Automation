package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/RS/HTMLFiles/fileupolader.html");
		driver.findElement(By.name("resumeupload")).click();
		Runtime.getRuntime().exec("D:\\Raghu\\AutoITScripts\\FileuploaderCB.exe");
		

}
}