package OTC.Automation.Framework;


import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class AppTest extends DriverClass {
	
	@BeforeMethod
	public void setup() {
	  initializeDriver(); 	
	
	}
	
	@Test
	public void Testit() throws InterruptedException {
		driver.get("https://sm-m244-uat.smilemakers.com/customer/account/login/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rishabkapania@sourcemash.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Password@123");
	    
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).isDisplayed();
		
		//driver.switchTo().frame("frameName"); // or use index
//      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//      WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("search")));
//      searchBox.click();


     


      // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     //  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"search\\\"]")));
       //element.click();
		
	}

	@AfterMethod
	public void closeit()
	{
		driver.close();
	}
}
