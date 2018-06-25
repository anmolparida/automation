package MercuryTours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic_RadioButton {

	public void clickRadioButton (WebDriver driver, String param1, String param2){

		List<WebElement> list = driver.findElements(By.name(param1));
		System.out.print("Size : " + list.size() + " >> Values : ");

		for (int i = 0; i < list.size(); i++){
			System.out.print(list.get(i).getAttribute("value") + ", ");
		} 
		System.out.println();

		for (int i = 0; i < list.size(); i++){
			if(list.get(i).getAttribute("value").equals(param2)){
				list.get(i).click();
			}		
		}	
	}
}
