package PracticeWebsites;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RummyCircle_BuyCoins {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");

		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(".//strong[contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath(".//a[class='gblock']")).click();









	}
}