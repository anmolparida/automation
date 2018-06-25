package PracticeWebsites;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasy_InputForms {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/");


		//Input Forms : Simple Form Demo
		driver.findElement(By.xpath(".//a[contains(text(),'Input Forms')]")).click();
		driver.findElement(By.xpath(".//a[contains(text(),'Simple Form Demo')]")).click();

		driver.findElement(By.xpath(".//input[@id='user-message']")).sendKeys("Anmol Parida");
		driver.findElement(By.xpath(".//button[contains(text(),'Show Message')]")).click();

		driver.findElement(By.xpath(".//input[@id='sum1']")).sendKeys("5");
		driver.findElement(By.xpath(".//input[@id='sum2']")).sendKeys("55");
		driver.findElement(By.xpath(".//button[contains(text(),'Get Total')]")).click();
		
		Thread.sleep(1000);

		//Input Forms : Checkbox Demo : Radio Buttons Demo
		driver.findElement(By.xpath(".//a[contains(text(),'Input Forms')]")).click();
		driver.findElement(By.xpath(".//a[contains(text(),'Checkbox Demo')]")).click();

		//Single CheckBox
		driver.findElement(By.xpath(".//input[@id='isAgeSelected']")).click();

		//Multiple CheckBox
		List<WebElement> cb = driver.findElements(By.xpath(".//input[@class='cb1-element']"));
		System.out.println("Size : " +cb.size());
		driver.findElements(By.xpath(".//input[@class='cb1-element']")).get(0).click();
		driver.findElements(By.xpath(".//input[@class='cb1-element']")).get(1).click();
		driver.findElements(By.xpath(".//input[@class='cb1-element']")).get(2).click();
		driver.findElements(By.xpath(".//input[@class='cb1-element']")).get(3).click();
		Thread.sleep(1000);

		//Input Forms : Radio Buttons Demo
		driver.findElement(By.xpath(".//a[contains(text(),'Input Forms')]")).click();
		driver.findElement(By.xpath(".//a[contains(text(),'Radio Buttons Demo')]")).click();
		
		// Radio Button NOT REPEATED on the Single Page
		driver.findElement(By.xpath(".//input[@value='Male']")).click();
		driver.findElement(By.xpath(".//button[contains(text(),'Get Checked value')]")).click();
		
		// Radio Button not REPEATED on the Single Page
		driver.findElement(By.xpath(".//h4//following::input[@value='Male']")).click();
		driver.findElement(By.xpath(".//input[@value='15 - 50']")).click();
		driver.findElement(By.xpath(".//button[contains(text(),'Get values')]")).click();
		
		Thread.sleep(1000);

		//Input Forms : Select Dropdown List
		driver.findElement(By.xpath(".//a[contains(text(),'Input Forms')]")).click();
		driver.findElement(By.xpath(".//a[contains(text(),'Select Dropdown List')]")).click();
		
		driver.findElement(By.xpath(".//option[@value='Wednesday']")).click();
		driver.findElement(By.xpath("//option[@value='Texas']")).click();
		
		
		
		
		
		


	}

}
