package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHRPage {
	
	@FindBy(id = "txtUsername")
	private WebElement UnTb;
	
	@FindBy(id="txtPassword")
	private WebElement PwTb;
	
	@FindBy(id="btnLogin")
	private WebElement LogBt;
	
	
	
	
	public LoginHRPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUserName(String un)
	{
		UnTb.sendKeys(un);
	}
	public void enterPassword(String pw)
	{
		PwTb.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		LogBt.click();
	}
}
