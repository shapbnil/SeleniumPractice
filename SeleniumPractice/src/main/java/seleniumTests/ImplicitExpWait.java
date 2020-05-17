package seleniumTests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

public class ImplicitExpWait {
	@Test
	public void implicit() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.irctc.co.in/nget/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			//Explicit wait
			WebDriverWait wait=new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
			
			//Fluient wait
			Wait wait1=new FluentWait<WebDriver>(driver)
					.pollingEvery(Duration.ofSeconds(2))
					.ignoring(NoSuchFieldException.class);
			
			wait1.until(ExpectedConditions.elementToBeClickable(By.name("q")));
					}
	
	
	
}