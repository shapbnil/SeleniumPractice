package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesDemo {
	@Test
	public void frames() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.softwaretestinghelp.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//frame id
			WebElement frame=driver.findElement(By.id("aswift_0"));
			driver.switchTo().frame(frame);
			//clicking inside the frame
			driver.findElement(By.id("content")).click();
			//Switch to parent
			driver.switchTo().defaultContent();
			driver.close();
	}
	
}
