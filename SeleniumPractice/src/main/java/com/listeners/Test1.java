package com.listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.listeners.ListenersTestDemo.class)
public class Test1 {
	@Test
	public void test_100() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.greyhound.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		// Enter Details
		driver.findElement(By.name("username")).sendKeys("venkat");
		driver.findElement(By.name("password")).sendKeys("Venkat");
		WebElement go=driver.findElement(By.id("rewards-login-go"));
		String text=go.getText();//Go button
		Assert.assertEquals(go.getText(), "GO");		
		Assert.assertTrue(go.isDisplayed());
		
		
		Assert.assertFalse(go.isDisplayed());
		//Assert.assertNotEquals(go.getText(), "GO");
		
		if(text.contains("GO")) {
			Assert.assertTrue(true,"Go button mateched");
		}else {
			Assert.assertFalse(true,"Go button not mateched");
		}
		
	}
}
