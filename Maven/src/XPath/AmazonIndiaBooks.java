
package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIndiaBooks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		driver.findElement(By.xpath(".//input[@name= 'field-keywords']")).sendKeys("Books");

		driver.findElement(By.xpath(".//input[@value= 'Go']")).click();
		
		
		List<WebElement> listBook_Name = driver.findElements(By.xpath(".//h2"));
	//	List<WebElement> listBook_Price = driver.findElement(By.xpath(".//class[contains(text(),'currencyINR')]")));
		
		
		
		//System.out.println("No of Reults: " + listBook_Price.size());
		for (int i = 0; i < listBook_Name.size(); i++){
			System.out.println(listBook_Name.get(i).getAttribute("data-attribute"));
		}
		
		
		
		
		
	}

}


