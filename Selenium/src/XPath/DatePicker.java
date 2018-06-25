package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");

		//Thread.sleep(2000);

		driver.switchTo().frame(0);
		//driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath(".//input[@id='datepicker']")).click();

		String vMonth = driver.findElement(By.xpath(".//span[@class='ui-datepicker-month']")).getText();
		System.out.println( "vMonth : " + vMonth);

		String vYear = driver.findElement(By.xpath(".//span[@class='ui-datepicker-year']")).getText();
		System.out.println( "vYear : " + vYear);

		while ( ! (vYear.contentEquals("2018") && vMonth.contentEquals("August"))){
			driver.findElement(By.xpath(".//a[@class='ui-datepicker-next ui-corner-all']")).click();		
		}

		driver.findElement(By.xpath(".//a[contains(text(),'18')]")).click();	
	}

}
