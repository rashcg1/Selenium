package testchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Chrome.driver",
		         "C:\\SeleniumDrivers\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://www.newtours.demoaut.com/index.php");
		WebElement search=cd.findElementByName("userName");
		search.sendKeys(new String[] {"flash"});
		
	}

}
