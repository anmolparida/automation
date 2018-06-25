package XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		
		//Alert//
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		driver.findElement(By.xpath(".//button[contains(text(),'Try it')]")).click();
		
		if(alert.getText().contains("Hello! I am an alert box!")){
			Thread.sleep(2000);
			alert.accept();
		}
		
		//Frames//
		driver.switchTo().frame(0); // By Index
		
		driver.findElement(By.id("iframe"));
		driver.findElement(By.name("userName")).sendKeys("test");
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("iframe2"); // By Name
		driver.findElement(By.name("userName")).sendKeys("test");
		driver.switchTo().parentFrame();
		
		
	}

}
