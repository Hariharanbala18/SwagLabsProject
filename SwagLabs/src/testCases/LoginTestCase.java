package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.LoginPageObject;

public class LoginTestCase extends CommonFunctions {
	
	@Test
	public void Login()
	{
		PageFactory.initElements(driver, LoginPageObject.class);
		
		LoginPageObject.username.sendKeys("standard_user");
		LoginPageObject.password.sendKeys("secret_sauce");
		LoginPageObject.LoginButton.click();
	}

}
