package MouseAndKeyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseAction {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		/*
		driver.get("http://newtours.demoaut.com/");
		Actions action = new Actions(driver) ;
		WebElement x = driver.findElement(By.linkText("REGISTER"));
		action.contextClick(x).build().perform(); // build().perform() is mandatory for these actions
		 */


		driver.get("https://jqueryui.com/menu/");
		driver.switchTo().frame(0);

		/*
		// Drag & Drop [WORKING]
		Actions action = new Actions(driver) ;
		//WebElement x = driver.findElement(By.linkText("Droppable"));
		//action.click(x).build().perform();

		WebElement source = driver.findElement(By.xpath(".//div[@id='draggable']"));
		WebElement source = driver.findElement(By.xpath(".//*contains(Text())'Drag me to my target']"));
		WebElement destination = driver.findElement(By.xpath(".//div[@id='droppable']"));
		action.dragAndDrop(source,destination).build().perform();

		 */

		//Mouse Navigation

		Actions action = new Actions(driver) ;

		WebElement x = driver.findElement(By.xpath(".//*[@id='ui-id-9']"));
		WebElement y = driver.findElement(By.xpath(".//*[@id='ui-id-10']"));
		WebElement z = driver.findElement(By.xpath(".//*[@id='ui-id-11']"));
		
		action.moveToElement(x).build().perform();
		Thread.sleep(1000);
		
		action.moveToElement(y).build().perform();
		Thread.sleep(1000);
		
		action.moveToElement(z).build().perform();
		Thread.sleep(1000);
		z.click();

	}
}