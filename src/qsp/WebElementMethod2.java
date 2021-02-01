package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod2
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/RS/HTML_Files/GandF.html");
		driver.manage().window().maximize();
		WebElement facebook = driver.findElement(By.linkText("facebook"));
		String tag = facebook.getTagName();
		String text = facebook.getText();
		String colour = facebook.getCssValue("Color");
		String font = facebook.getCssValue("font-style");
		String BC = facebook.getAttribute("background");
		System.out.println("TagName = "+tag);
		System.out.println("Name = "+text);
		System.out.println("Colour ="+colour);
		System.out.println("Font_style = "+font);
		System.out.println("BC = "+BC);
		Dimension size = facebook.getSize();
		int h = size.getHeight();
		int w = size.getWidth();
		System.out.println("Hight of an element is ="+h);
		System.out.println("Width of an element is ="+w);
		Point l = facebook.getLocation();
		int x = l.getX();
		int y = l.getY();
		System.out.println("x location of element ="+x);
		System.out.println("Y location of an element ="+y);
		driver.close();
		
		
		
	}

}
