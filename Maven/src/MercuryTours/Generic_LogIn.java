package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Generic_LogIn {


	public void logIn (WebDriver driver,String userName, String Password){

		driver.get("http://newtours.demoaut.com/");

		//LogIn
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
	}
}
