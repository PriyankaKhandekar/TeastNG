package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {
	
	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pushkraj\\\\eclipse-workspace\\\\ChromeDriverEXE\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();
		return driver;
	}

}
