package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tooltip {
	@Test
	public void toolTip() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
		driver.findElement(By.name("q")).sendKeys("flipkart");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		WebElement logo=driver.findElement(By.id("logo"));
		String title=logo.getAttribute("title");
		System.out.println(title);
		
		
	}
}
