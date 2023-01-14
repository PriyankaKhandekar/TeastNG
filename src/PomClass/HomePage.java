package PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath="//input[@name='q']")
	private WebElement searchField;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	
	public void searchField()
	{
		searchField.sendKeys("");
	}
	public void button()
	{
		searchButton.click();
	}
}
