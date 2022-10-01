package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	
	public static WebDriver driver = null;
	static Properties properties = null;
	public Properties loadPropertyFile() throws IOException
	{
	
	FileInputStream file = new FileInputStream("config.prop");
	properties = new Properties();
	properties.load(file);
	return properties;
	}
	
	@BeforeSuite
	public void openGoogle() throws IOException
	{
		loadPropertyFile();
		String browser = properties.getProperty("Browser");
		String URL = properties.getProperty("url");
		String Location = properties.getProperty("Driverlocation");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", Location);
			driver = new ChromeDriver();
		}
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}

	@AfterSuite
	public void tearDown()
	{
		//driver.quit();
	}
}
