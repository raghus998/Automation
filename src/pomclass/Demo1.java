package pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demo1 {
	private WebElement UnTb;
	private WebElement PwTb;
	private WebElement LogBt;
	public Demo1(WebDriver driver) {
		UnTb =  driver.findElement(By.id("txtUsername"));
		PwTb =  driver.findElement(By.id("txtPassword"));
		LogBt = driver.findElement(By.id("btnLogin"));
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
