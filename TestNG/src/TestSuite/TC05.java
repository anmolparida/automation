package TestSuite;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class TC05 {

	WebDriver driver;

	@BeforeTest (groups = {"admin", "user"})
	public void openBrowser(){
		System.out.println("openBrowser");
		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");
		driver = new ChromeDriver();

		//Implicit or Dynamic Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("<<Before Every Method>>");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("<<After Every Method>>");
	}
	
	@Test (priority = 1, groups = {"admin", "user"})
	public void login(){
		System.out.println("Method: login");
		//LogIn
		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();
	}

	@Test(priority = 2, groups = {"admin"})
	public void clickRadios(){
		System.out.println("Method: clickRadios");
		driver.findElement(By.xpath(".//*[@value='oneway']")).click();
		;
	}
	
	@Test(priority = 3, groups = {"user,admin"})
	public void clickDropdown(){
		System.out.println("Method: clickDropdown");
		driver.findElement(By.xpath(".//option[contains(text(),'Unified Airlines')]")).click();
	}


	@AfterTest (groups = {"user,admin"})
	public void closeDriver(){
		driver.close();
	}
}
