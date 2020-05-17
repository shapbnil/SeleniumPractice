package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class HeadLessBrowser {
	@Test
	public void headLessBrowser() {
		
		WebDriver driver=null;
		System.setProperty("phantomjs.binary.path", "./drivers\\phantomjs.exe");
		driver = new PhantomJSDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();


		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		}

}
