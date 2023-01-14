package PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement mobileno;
	
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement requestOTP;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement verify;
	
	public void enterMobileNo()
	{
		mobileno.sendKeys("7823024146");
	}
	public void requestOTP()
	{
		requestOTP.click();
	}
	public void verify()
	{
		verify.click();
	}
	
	
	
	
	
	
}
