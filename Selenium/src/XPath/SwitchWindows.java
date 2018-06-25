package XPath;


import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		//Thread.sleep(2000);
		
		String parenWin = driver.getWindowHandle();
		System.out.println("parenWin : " + parenWin);
		
		//driver.findElement(By.xpath(".//button[contains(text(),'New Browser Window']")).click();
		driver.findElement(By.xpath(".//button[@id='button1']")).click();
		
		Set <String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		
		
		for(String temp : allWin){
			
			if(!temp.equals(parenWin)){
				driver.switchTo().window(temp);
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parenWin);
	}
}
