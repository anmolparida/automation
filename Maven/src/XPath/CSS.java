package XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");

		//[Type1] Tagname#idValue : input#datepicker
		//[Type1] Tagname#classValue : input#hasDatepicker
		//[Type1] Tagname#idValue : [type = 'text']
		//[Type1] Tagname#classvalue : [id = 'datepicker']



	}
}