package MercuryTours;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightFinder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		Generic_LogIn l = new Generic_LogIn();
		l.logIn(driver, Register.userName, Register.password); // for static class name need to be called
		
		// Click on Flights Tab 
		
		driver.findElement(By.linkText("Vacations")).click();
		driver.findElement(By.linkText("Flights")).click();
		
		Generic_RadioButton grb = new  Generic_RadioButton();
		
		//param1: tripType, param2: roundtrip/oneway
		grb.clickRadioButton(driver, "tripType", "oneway");
		
		//param1: servClass, param2: Coach/Business/First
		grb.clickRadioButton(driver, "servClass", "First");
		

		
	}
}
