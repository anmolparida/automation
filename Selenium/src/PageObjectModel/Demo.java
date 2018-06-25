package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");

		//LogIn
		driver.findElement(By.name(ObjectRepository.Login_UserName)).sendKeys("batman");
		driver.findElement(By.name(ObjectRepository.Login_Password)).sendKeys("batman");
		driver.findElement(By.name("login")).click();

	}

}