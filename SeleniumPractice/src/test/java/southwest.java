
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class southwest {

	public static void southwestRegistration() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		DesiredCapabilities cap=new DesiredCapabilities().chrome();
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.48.1:4444/wd/hub") ,cap);


	    driver.get("https://www.southwest.com/");
	    driver.manage().window().setSize(new Dimension(1059, 1020));
	    driver.findElement(By.cssSelector(".actionable_prefix")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".actionable_prefix"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).sendKeys("venkat");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("Ratnam");

	}
	public static void main(String[] args) throws Exception {
		southwestRegistration();
	}
}
