package testchrome;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver",
		         "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		*driver.get("http://newtours.demoaut.com/");
		*String browsertitle= driver.getTitle();
		*System.out.println("The browser title is "+browsertitle);
		*String currentUrl=driver.getCurrentUrl();
		*System.out.println("The currenturl is "+currentUrl);
		*String pagesource= driver.getPageSource();
		*System.out.println("The pagesource of the browser is "+pagesource);
		*driver.close();*/
		
		
		URL url= new URL("https:\\www.google.com");
		driver.navigate().to(url);
		driver.navigate().to("http://www.gmail.com");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		}
}

/*Alternate for webdriver
 *Navigation */

