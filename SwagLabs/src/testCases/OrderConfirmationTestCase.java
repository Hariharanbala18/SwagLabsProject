package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.OrderConfirmationPageObjects;

public class OrderConfirmationTestCase extends CommonFunctions {
	@Test
	public void orderConfirmation()
	{
		PageFactory.initElements(driver, OrderConfirmationPageObjects.class);
		System.out.println(OrderConfirmationPageObjects.ItemTotal.getText());
		System.out.println(OrderConfirmationPageObjects.Tax.getText());
		System.out.println(OrderConfirmationPageObjects.Total.getText());
		OrderConfirmationPageObjects.finishButton.click();
	}

}
