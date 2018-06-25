package PracticeWebsites;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MoneyControl_MyPortfolio {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rummycircle.com");

		driver.findElement(By.id("lw_username")).sendKeys("anmolparida@gmail.com");
		driver.findElement(By.id("lw_password")).sendKeys("avagadrofx");
		driver.findElement(By.id("lw_submitbtn_span")).click();

		Thread.sleep(5000);

		// Closing intermittent Add Cash now pop up
		if(driver.findElement(By.xpath(".//img[@title='Add Cash Now']")).isDisplayed()){
			driver.findElement(By.xpath(".//img[@src='https://rcmg.in/mobile/images/close.png']")).click();
		}
		driver.findElement(By.xpath(".//span[contains(text(),'Add Cash')]")).click();

		//Implicit or Dynamic Wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		List <WebElement> add_now_list = driver.findElements(By.xpath(".//div[@class='acgtw-addcash-bouns-btn_fusion gtm acgt-addCashBtn']"));
		System.out.println("add_now_list : " + add_now_list.size());

		driver.findElements(By.xpath(".//div[@class='acgtw-addcash-bouns-btn_fusion gtm acgt-addCashBtn]")).get(3).sendKeys("25");
		//driver.findElement(By.xpath(".//div[@data-amount='']")).sendKeys("25");
		driver.findElement(By.xpath(".//div[@class='acgtw-addcash-bouns-btn_fusion gtm acgt-addCashBtn']")).click();
		driver.findElement(By.xpath(".//a[@title='PayTM Wallet']")).click();
		driver.findElement(By.id("agt-submitButtonImagePAYTM")).click();

		Thread.sleep(10000);

		//String parentHandle = driver.getWindowHandle(); // get the current window handle
		//System.out.println(parentHandle);               //Prints the parent window handle 


		//String  handle= driver.getWindowHandle();//Return a string of alphanumeric window handle
		Set <String> handles= driver.getWindowHandles();//Return a set of window handle
		String firstWinHandle = driver.getWindowHandle(); 

		for (int i = 0; i < handles.size(); i++){
			System.out.println("windows after add cash :" + handles);
		}

		for (String winHandle : driver.getWindowHandles()) { //Gets the new window handle
			System.out.println(winHandle);
			driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)  

			if (winHandle!=firstWinHandle){

				String secondWinHandle = winHandle; //Storing handle of second window handle

				driver.switchTo().window(secondWinHandle);
				driver.findElement(By.xpath(".//input[@id='mobile']")).sendKeys("9988776655");
				driver.findElement(By.xpath(".//button[@class='btn-primary-new']")).click();

			}
		}
	}
}

//Now your driver works on the current new handle
//Do some work here.
//Time to go back to parent window
//driver.close();                                 // close newly opened window when done with it
//driver.switchTo().window(parentHandle);         // switch back to the original window



//Set<String> handle= driver.getWindowHandles();//Return a set of window handle

//driver.switchTo().window("ABC");


/*
  driver.findElement(By.id(“id of the link which opens new window”)).click();


 //wait till two windows are not opened

 waitForNumberofWindowsToEqual(2);//this method is for wait

 Set handles = driver.getWindowHandles();
 firstWinHandle = driver.getWindowHandle(); 
 handles.remove(firstWinHandle);

 String winHandle=handles.iterator().next();

 if (winHandle!=firstWinHandle){

 //To retrieve the handle of second window, extracting the handle which does not match to first window handle

 secondWinHandle=winHandle; //Storing handle of second window handle

//Switch control to new window

 driver.switchTo().window(secondWinHandle);
 */



