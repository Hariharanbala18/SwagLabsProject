package testCases;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.SortingSelecting;


public class SelectTestCase extends CommonFunctions {
	
	public void SelectDropDown()
	{
		Select select = new Select(SortingSelecting.selectButton);
		select.selectByIndex(2);
	}

	@Test
	public void AddToCart() throws IOException
	{
		PageFactory.initElements(driver, SortingSelecting.class);
		SelectDropDown();
		SortingSelecting.product1.click();
		SortingSelecting.AddtoCart.click();
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File file = new File("C:\\Users\\Hariharan\\Desktop\\TestImage.png");
		org.openqa.selenium.io.FileHandler.copy(source, file);
		
		if(file.getName().equals("TestImage.png"))
		{
			System.out.println("Cart Screenhot has been captured");
		}
		else
		{
			System.out.println("The image has not been taken, please check");
		}
	}
	}
