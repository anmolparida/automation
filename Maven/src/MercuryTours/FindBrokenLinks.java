package MercuryTours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");

		//Generic_LogIn l = new Generic_LogIn();
		//l.logIn(driver, Register.userName, Register.password); // for static class name need to be called

		List <WebElement> alllinks = driver.findElements(By.tagName("a"));

		for (int i = 0; i < alllinks.size(); i++ ){
			System.out.println(alllinks.get(i).getText() + " : " +  alllinks.get(i).getAttribute("href"));
		}	
		
		//Dropdown/List
		//driver.findElement(By.name("photo")).sendKeys(arg0);
	}
}
