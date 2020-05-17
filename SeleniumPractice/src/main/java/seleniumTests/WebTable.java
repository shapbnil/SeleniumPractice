package seleniumTests;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Date: 4/6/2020 Monday
public class WebTable {

	@Test
	public void getTableData() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();	
		
		WebElement table=driver.findElement(By.xpath("//table[@class='dataTable']"));
		int rows=table.findElements(By.tagName("tr")).size();
		
		int columns=table.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td")).size();
		
				
		List<WebElement> lst_Rows= table.findElements(By.tagName("tr"));
		
		for(int i=0;i<lst_Rows.size();i++) {
			List<WebElement> lst_Columns=lst_Rows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<lst_Columns.size();j++) {
					System.out.print(lst_Columns.get(j).getText()+" ");
					
				
				
				  if(lst_Columns.get(j).getText().equals("NCC")) {
				  lst_Columns.get(j).findElement(By.tagName("a")).click();
				  
				  Thread.sleep(10000);
				  break;
				  }
				 
				 
				}
				System.out.println();
		}
	}
	
}
