package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Register {

	static String userName = "batman";
	static String eMail = userName;
	static String password = "batman";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		// Open the URL
		driver.get("http://newtours.demoaut.com/");

		
		//Contact Information
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("ANMOL");
		driver.findElement(By.name("lastName")).sendKeys("PARIDA");
		driver.findElement(By.name("phone")).sendKeys("9975076130");
		driver.findElement(By.name("userName")).sendKeys(userName);

		//Mailing Information
		driver.findElement(By.name("address1")).sendKeys("B-702, Alacrity");
		driver.findElement(By.name("address2")).sendKeys("Baner");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		//driver.findElement(By.name("country")).sendKeys("India");
		
		//User Information
		driver.findElement(By.name("email")).sendKeys(eMail);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(password);
		driver.findElement(By.name("register")).click();
		
		driver.close();
		
	}
}
