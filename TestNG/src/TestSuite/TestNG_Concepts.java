package TestSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG_Concepts {

	/*
	Junit : Java framework
	Nunit : .Net framework

	Vrification : Yes or No
	Assertion : Stops the Code

	TestNG
	- Open test framework
	- classification of test cases
	- control test flow
	- Generates Report(Live)
	- Annotation Based Framework


	How to install TestNG
	- Help > Install New Software 
	> Workwith > Add
	> Name : TestNG(aanything)
	> Location : beust.com/eclipse


	 */
	public static void main(String args[]){
		
		System.setProperty("webdriver.chrome.driver", "/Users/AnmolParida/Softwares/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

	}
}
