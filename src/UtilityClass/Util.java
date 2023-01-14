package UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	
	public static void implicitWait(WebDriver driver , int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public static void screenShot(WebDriver driver) throws IOException
	{
		
		Date date = new Date();
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-DD-hh-mm-ss");
		String currentDate = f.format(date);
		System.out.println(currentDate);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Pushkraj\\eclipse-workspace\\ChromeDriverEXE\\Screenshots.jpg"+currentDate);
		FileHandler.copy(source, dest);
	
	}
	
	public static WebElement waitUntilLoad(WebDriver driver , String abc)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(abc)));
		return ele;
	}
	
	public static void readDataExcell(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream(".xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("sheet1");
		String data = sheet.getRow(0).getCell(0).getStringCellValue();
	}
	
	

}
