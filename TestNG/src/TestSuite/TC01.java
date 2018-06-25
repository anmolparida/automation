package TestSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01 {

	// No main method for this scenario
	// if we dont mention the priority the tests are run alphabetically 
	// with priority it runs on priority lowest to highest

	//annotations : 
	//@Test(priority = 1) 
	//@BeforeTest  - Does not appear on the Report
	//@AfterTest - Does not appear on the Report
	//@BeforeMethod
	//@AfterMethod

	WebDriver driver;

	@BeforeTest
	public void openBrowser(){
		System.out.println("openBrowser");
		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");
		driver = new ChromeDriver();

		//Implicit or Dnamic Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}


	@Test (priority = 1)
	public void login(){
		System.out.println("login");
		//LogIn
		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();
	}

	@Test(priority = 1)
	public void clickRadios(){
		System.out.println("clickRadios");
		driver.findElement(By.xpath(".//*[@value='oneway']")).click();
		;
	}


	@AfterTest
	public void closeDriver(){
		driver.close();
	}
}
