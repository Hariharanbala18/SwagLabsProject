package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPageObjects {
	
	@FindBy(className = "summary_subtotal_label")
	public static WebElement ItemTotal;
	@FindBy(className = "summary_tax_label")
	public static WebElement Tax;
	@FindBy(className = "summary_total_label")
	public static WebElement Total;
	@FindBy(id = "finish")
	public static WebElement finishButton;

}
