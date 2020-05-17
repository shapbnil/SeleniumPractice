package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	
	@Test
	public void MouseAction() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		WebElement electronics = driver.findElement(By.xpath("(//*[contains(text(),'Electronics')])[2]"));

		Actions action = new Actions(driver);
		action.moveToElement(electronics);

		action.build().perform();
		Thread.sleep(3000);
		
		WebElement samsung = driver.findElement(By.linkText("Samsung"));
		samsung.click();
	}
}
