package PracticeWebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import MercuryTours.Generic_RadioButton;

public class ToolsQA_PracticeForm {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize(); // maximize window
		
		
		driver.findElement(By.name("firstname")).sendKeys("batman");
		driver.findElement(By.name("lastname")).sendKeys("gotham");
		
		Generic_RadioButton grb = new Generic_RadioButton();
		grb.clickRadioButton(driver, "sex", "male");
		grb.clickRadioButton(driver, "exp", "3");
		
		driver.findElement(By.id("exp-5")).click(); //clicking RadioButton directly with ID
		driver.findElement(By.id("datepicker")).sendKeys("18/03/2018");
		driver.findElement(By.id("profession-0")).click();
		driver.findElement(By.id("profession-1")).click();
		
		
		Actions action = new Actions(driver) ;
		WebElement x = driver.findElement(By.partialLinkText("Link Test"));
		Thread.sleep(2000);
		action.moveToElement(x).build().perform();
		action.click(x).build().perform();
		
		
		//driver.findElement(By.cssSelector(selector))
		
		
		//driver.close();
	}
}
