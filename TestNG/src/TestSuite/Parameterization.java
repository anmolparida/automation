package TestSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization {

	WebDriver driver;
	
	@BeforeTest
	public void openBrowser(){
		System.out.println("openBrowser");
		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");
		driver = new ChromeDriver();

		//Implicit or Dynamic Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/gmail/");
	}
	
	@Test(dataProvider ="td1")
	public void login(String us, String ps) throws InterruptedException{
		System.out.println(us + "/" + ps);
		
		driver.findElement(By.xpath(".//input[@type = 'email']")).sendKeys(us);
		driver.findElement(By.xpath(".//span[contains(text(),'Next')]")).click();
			
		//Explicit Wait
		WebDriverWait wait = WebDriverWait(driver,10) ;
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//input[@type = 'password']"))));
		
		driver.findElement(By.xpath(".//input[@type = 'password']")).sendKeys(ps);
		driver.findElement(By.xpath(".//span[contains(text(),'Next')]")).click();
		System.out.println("Password Incorrect");
		Thread.sleep(15000);
		
		for(int i = 0 ;i < 2; i++){
		String errorMessage = driver.findElements(By.xpath(".//div[@jsname='B34EJ']")).get(i).getText();
		System.out.println( "errorMessage : " + i + " " + errorMessage);
		}
	}

	private WebDriverWait WebDriverWait(WebDriver driver2, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@DataProvider (name = "td1")
	public Object[][] testdata(){
		
		return new Object[][]{
			{"anmolparida@gmail.com","xxxxxx"}
			//{"anmolparida@gmail.com","admin"},{"user", "user"},{"abc","pqr"}
		}; // semicolon to pass 
	}
}
