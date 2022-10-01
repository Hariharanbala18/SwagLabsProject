package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortingSelecting {
	
	@FindBy(className = "product_sort_container")
	public static WebElement selectButton;
	
	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	public static WebElement product1;
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	public static WebElement AddtoCart;
}
