package TestNgDemo.TestNgDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgTest2 extends Anotations{

	//@Test(dependsOnMethods = "test11")
	//@Test(priority = 1)
	//@Test(groups = "smoke,Regression")
	@Test
	public void test12() {
		driver.get("https://www.greyhound.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("username")).sendKeys("venkat");
		driver.findElement(By.name("password")).sendKeys("Venkat");
	}
	
	//@Test(groups = "Regression")
	@Test
	public void test11() {
		driver.get("https://www.greyhound.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("username")).sendKeys("venkat");
		driver.findElement(By.name("password")).sendKeys("Venkat");	
		}
}
