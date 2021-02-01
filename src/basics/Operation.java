package basics;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.chrome.ChromeDriver;

public class Operation {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// To open the Browser
		ChromeDriver cr  = new ChromeDriver();
		Thread.sleep(5000);
		
		/*To Resize the Browser
		Dimension d = new Dimension(200,200);
		cr.manage().window().setSize(d);
		
		
		//Move the browser
		Point p = new Point(300,200);
		cr.manage().window().setPosition(p);*/
		
		//Maximize the Browser
		cr.manage().window().maximize();
	}

}
