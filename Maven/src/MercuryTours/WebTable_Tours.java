package MercuryTours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Tours {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		// Open the URL
		driver.get("http://newtours.demoaut.com/");

		//LogIn
		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();

		//Flight Details

		driver.findElement(By.xpath(".//input[@value = 'roundtrip']")).click();
		driver.findElement(By.xpath(".//option[@value = '2']")).click();
		driver.findElement(By.xpath(".//input[@value = 'roundtrip']")).click();
		driver.findElement(By.xpath(".//select[@name = 'fromPort']//following::option[@value = 'Paris']")).click();
		driver.findElement(By.xpath(".//select[@name = 'fromMonth']//following::option[@value = '5']")).click();
		driver.findElement(By.xpath(".//select[@name = 'fromDay']//following::option[@value = '5']")).click();
		driver.findElement(By.xpath(".//select[@name = 'toPort']//following::option[@value = 'London']")).click();
		driver.findElement(By.xpath(".//select[@name = 'toMonth']//following::option[@value = '5']")).click();
		driver.findElement(By.xpath(".//select[@name = 'toDay']//following::option[@value = '22']")).click();

		//Preferences
		driver.findElement(By.xpath(".//input[@value = 'Business']")).click();
		driver.findElement(By.xpath(".//option[contains(text(),'Unified Airlines')]")).click();
		driver.findElement(By.xpath(".//input[@name = 'findFlights']")).click();

		//Select Flights

		WebElement tbody = driver.findElement(By.xpath(".//form[@name='results']/tbody"));

		List <WebElement> trows = tbody.findElements(By.tagName("tr"));
		List <WebElement> theader = tbody.findElements(By.tagName("th"));

		for (int i = 0 ; i < trows.size(); i++){
			List <WebElement> tcells = trows.get(i).findElements(By.tagName("td"));
			System.out.print(theader.get(i).getText() + " : ");
			for(int j = 0; j < tcells.size(); j++){
				System.out.println(tcells.get(j).getText());
				if(tcells.get(j).getText().contains("Pangaea Airlines 362")){
					tcells.get(j-1).click();
				}
				if(tcells.get(j).getText().contains("Pangaea Airlines 632")){
					tcells.get(j-1).click();
				}
				System.out.println();
			}
		}
	}
}