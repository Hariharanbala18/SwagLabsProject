package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageObjects {
	
	@FindBy(id = "checkout")
	public static WebElement CheckoutButton;
	
	@FindBy(id = "first-name")
	public static WebElement FirstName;
	
	@FindBy(id = "last-name")
	public static WebElement LastName;
	
	@FindBy(id = "postal-code")
	public static WebElement PostalCode;
	
	@FindBy(id = "continue")
	public static WebElement ContinueButton;
	

}
