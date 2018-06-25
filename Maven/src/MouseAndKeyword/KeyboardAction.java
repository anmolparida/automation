package MouseAndKeyword;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {


	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		//debounce - press and release the keyboard
		
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.linkText("REGISTER"))).build().perform();
		Robot  robot = new Robot();
		
		for(int i = 0; i < 3; i++){
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);	
			Thread.sleep(1000);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	//Libraries to Explore - JNDI & JNA & SIKULI
	

}