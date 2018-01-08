package testchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		         "C:\\SeleniumDrivers\\chromedriver.exe");
		System.out.println("Execution Started");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com/");
		WebElement srch= wd.findElement(By.id("lst-ib"));
		srch.sendKeys("amazon");
		srch.submit();
		WebElement am = wd.findElement(By.linkText("Amazon.com: Online Shopping for Electronics, Apparel, Computers ..."));
		am.click();
		WebElement ser = wd.findElement(By.id("twotabsearchtextbox"));
		ser.sendKeys("Iphone");
		ser.submit();
//		System.out.println("Execution Fine");
		WebElement TxtBoxContent =wd.findElement(By.linkText("Apple iPhone 6 Unlocked Smartphone, 16 GB (Gold) (Certified Refurbished)"));
//		System.out.println("Execution Not Fine");
//		WebElement TxtBoxContent = driver.findElement(By.id(WebelementID));
//		TxtBoxContent.getText();
		System.out.println("Printing "+TxtBoxContent.getText());
		wd.quit();
		
		

	}

}
