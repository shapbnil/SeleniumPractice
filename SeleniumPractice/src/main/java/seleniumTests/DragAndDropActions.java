package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropActions {

	@Test
	public void DragAndDrop() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		WebElement source_5000 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement target_Amount = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement source_Bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement target_Account = driver.findElement(By.xpath("//li[@class='placeholder']"));

		Actions action = new Actions(driver);
		action.dragAndDrop(source_5000, target_Amount);
		Thread.sleep(4000);
		action.dragAndDrop(source_Bank, target_Account);
		action.build().perform();
	}
}
