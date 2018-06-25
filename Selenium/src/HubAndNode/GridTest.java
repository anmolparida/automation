package HubAndNode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class GridTest {

	public static void main (String args[]) throws MalformedURLException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:8888/wd/hub"), DesiredCapabilities.chrome());
		
		driver.get("https://www.google.co.in");
	}
}


/*

Terminal1
apples-MacBook-Air:~ AnmolParida$ cd softwares
apples-MacBook-Air:softwares AnmolParida$ java -jar selenium-server-standalone-3.4.0.jar -role hub

Terminal2
apples-MacBook-Air:~ AnmolParida$ cd softwares
apples-MacBook-Air:softwares AnmolParida$ java -jar selenium-server-standalone-3.4.0.jar -role  node -port 8888


hub : java - jar jar_name.jar -role hub
node : java - jar jar_name.jar -role node -port 8899


"http://localhost:8888/wd/hub
http://localhost:4444/grid/console
 */
