package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.com/automation-practice-table/");

		WebElement tbody = driver.findElement(By.xpath(".//table[@class='tsc_table_s13']/tbody"));

		List <WebElement> trows = tbody.findElements(By.tagName("tr"));
		List <WebElement> theader = tbody.findElements(By.tagName("th"));

		for (int i = 0 ; i < trows.size(); i++){
			List <WebElement> tcells = trows.get(i).findElements(By.tagName("td"));
			System.out.print(theader.get(i).getText() + " : ");
			for(int j = 0; j < tcells.size(); j++){
				System.out.print(tcells.get(j).getText() + " ");
			}
			System.out.println();
		}
	}
}
