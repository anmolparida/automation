package XPath;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathTypes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		//driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");

		// Type 1 //
		//TagName [@LocatorName = 'LocatorValue']//following :: Desired TagName
		//input [@name = "UserName"]//following::input
		
		driver.findElement(By.xpath(".//input[@name = 'userName']")).sendKeys("batman"); // enters value at userName
		driver.findElement(By.xpath(".//input[@name = 'userName']//following::input")).sendKeys("batman"); // enters value at password
		driver.findElement(By.xpath(".//input[@name = 'userName']//following::input[2]")).click(); // Clicks Sign-in Button
		
		//Type 2 //
		//TagName[Unique Attribute = Attribute Value]
		//input[@value = 'oneway']
		
		driver.findElement(By.xpath(".//input[@value = 'oneway']")).click();
		driver.findElement(By.xpath(".//select[@name='fromPort']//following::option[@value = 'Paris']")).click();
		//IMPORTATNT//driver.findElement(By.xpath(".//option[@value = 'Zurich']")).click(); // will not work with anotther dropdown with same value as Paris
		driver.findElement(By.xpath(".//select[@name='fromPort']//following::option[6]")).click(); // Index Starts from 1 in this Dropdown
		driver.findElement(By.xpath(".//select[@name='toPort']//following::option[5]")).click();
		
		//Type 3//
		//TagName[contains(text(),'abc')]
		
		driver.findElement(By.xpath(".//option[contains(text(),'Unified Airlines')]")).click(); 
		// partial texts can be passed, if multiple occurences then it selects the first WebElement
		
		// If all drop down values have 'Airlines' and we have to select the 3rd instance
		
		List<WebElement> list = driver.findElements(By.xpath(".//option[contains(text(),'Airlines')]")); 
		System.out.println(list.size());
		
		driver.findElements(By.xpath(".//option[contains(text(),'Airlines')]")).get(0).click();
		Thread.sleep(2000);
		driver.findElements(By.xpath(".//option[contains(text(),'Airlines')]")).get(1).click();
		Thread.sleep(2000);
		driver.findElements(By.xpath(".//option[contains(text(),'Airlines')]")).get(2).click();
		
		//Alert//
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		if(alert.getText().contains("I am Alert!")){
			Thread.sleep(2000);
			alert.accept();
		}
	}
}


