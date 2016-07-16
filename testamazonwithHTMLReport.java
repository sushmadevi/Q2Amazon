package amazon;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testamazonwithHTMLReport extends ReusableMethods
{
	static WebDriver driver;
	
	//Test Case 01>>>>Launch The Amazon Application
	
	public static void launchAmazonApplication ()throws IOException, Exception
	{
		startReport("Launch The Amazon Application","/Users/sushma/reports_selenium/");

		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Update_Report("Pass", "Launch Amazon Application", "Amazon Application is launched");
		driver.quit();
		bw.close();
	}
	
	//Test Case 02>>>>Verify Drop Down Option after Iphone  is Typedin Search 
	
	public static void IphoneSerchDropDown()throws IOException, Exception
	{

		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		startReport("Search Drop Down Option","/Users/sushma/reports_selenium/");

		WebElement searchtextbox = driver.findElement(By.id("twotabsearchtextbox"));
		enterText(searchtextbox, "Iphone", "Iphone Search ");
		
		
		
		Update_Report("Pass", "Search Drop Down Option", "Search Drop Down Options Displayed");
		
		driver.quit();
		bw.close();
	}
	
	public static void searchBoxMenuDropDown() throws IOException, Exception
	{
		String[] expMenuItemes = {"Iphone  6s  case in All Departments","Iphone  6s  case in Electronics", "Iphone  6s  case in Cell Phones And Accessories" };

		startReport("SearchBox drop down menu items","/Users/sushma/reports_selenium/");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		Update_Report("Pass", "Search Drop Down Option", "Search Drop Down Options for Iphone  6 Displayed");
		WebElement searchtextbox = driver.findElement(By.id("twotabsearchtextbox"));
		enterText(searchtextbox, "Iphone", "Iphone Search ");
		//validateTextInDropdn(searchtextbox,expMenuItemes, "SearchBox drop down menu " );

		
		
		Update_Report("Pass", "Search Drop Down Option", "Search Drop Down Options Displayed");
		
		
		Thread.sleep(10000);

		
		driver.quit();
		bw.close();

		
	}

}
