package pomclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumLinksPage {
	
	@FindBy(xpath = "//a")
	private List<WebElement> allLinks;
	
	public SeleniumLinksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getLinks()
	{
		int count = allLinks.size();
		System.out.println(count);
		for (WebElement link : allLinks) {
			String text = link.getText();
			System.out.println(text);
			
		}
	}

}
