package testCases;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.CheckoutPageObjects;

public class CheckOutTestCase extends CommonFunctions {
	
	File file = null;
	public void getScreenshot() throws IOException
	{
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		file = new File ("C:\\Users\\Hariharan\\Pictures\\Screenshots\\Confirmation.png");
		org.openqa.selenium.io.FileHandler.copy(source, file);
		
	}
	
	@Test
	public void checkout() throws IOException
	{
		PageFactory.initElements(driver, CheckoutPageObjects.class);
		
		CheckoutPageObjects.CheckoutButton.click();
		CheckoutPageObjects.FirstName.sendKeys("Hariharan");
		CheckoutPageObjects.LastName.sendKeys("Bala");
		CheckoutPageObjects.PostalCode.sendKeys("12345");
		
		CheckoutPageObjects.ContinueButton.click();
		getScreenshot();
		
		if(file.getName().equals("Confirmation.png"))
		{
			System.out.println("Confirmation screenshot has been taken");
		}
		else
		{
			System.out.println("Screenshot has not been taken");
		}
			
	}

}
