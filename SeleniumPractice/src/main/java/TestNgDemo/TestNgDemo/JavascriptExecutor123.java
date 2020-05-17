package TestNgDemo.TestNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutor123 {
@Test
	public void openurl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shapbnil\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://Google.com");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement ele1= driver.findElement(By.name("q"));
		//ele1.sendKeys("Selenium");
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele1);
		js.executeScript("arguments[0].value=arguments[1]", ele1,"Selenium");
		
		WebElement ele= driver.findElement(By.linkText("Gmail"));
		//ele.click();
		
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
		
		js.executeScript("arguments[0].click()", ele);
	}
}
