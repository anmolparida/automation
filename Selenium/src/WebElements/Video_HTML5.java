package WebElements;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video_HTML5 {


	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		//driver.get("http://newtours.demoaut.com/");
		driver.get("https://www.w3.org/2010/05/video/mediaevents.html");	

		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript("document.getElementById(\"video\").play()");
		Thread.sleep(5000);
		js.executeScript("document.getElementById(\"video\").pause()");
		js.executeScript("document.getElementById(\"video\").currentTime+=10");
		js.executeScript("document.getElementById(\"video\").play()");
		Thread.sleep(5000);
		js.executeScript("scrollTo(0,1500)"); // 1500 is the pixel size - vertical scroll, -1500 for horizontal scroll
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // gets stored into a source file, then convert it to .jpeg or.png
		
		FileUtils.copyFile(src, new File("/Users/AnmolParida/Eclipse_Java/test.png"));
		
	}
}
