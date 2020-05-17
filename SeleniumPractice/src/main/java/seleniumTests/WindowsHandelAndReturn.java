               package seleniumTests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class WindowsHandelAndReturn {


@Test
	public void WindowsHandel() throws Exception {	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shapbnil\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement electronics= driver.findElement(By.xpath("(//*[contains(text(),'Electronics')])[2]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(electronics);
		
		action.build().perform();
		Thread.sleep(3000);
		WebElement samsung= driver.findElement(By.linkText("Samsung"));
		samsung.click();
		
		Thread.sleep(5000);
		String parent = driver.getWindowHandle();
		String child=null;
		driver.findElement(By.xpath("//*[contains(text(),'Samsung Galaxy')]")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		for(String window : windows) {
			if(!window.equals(parent)) {
				child =window;
			}
		}
		
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();
		
		
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		String expected_title = "Shopping Cart | Flipkart.com";
		Assert.assertEquals(expected_title, title);
		//System.out.println("Test Completed");
			//logs	
				//String text=driver.findElement(By.xpath("//*[text()='My Cart (1)']")).getText();
		
		Thread.sleep(5000);
		
		
		driver.switchTo().window(parent);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
}
