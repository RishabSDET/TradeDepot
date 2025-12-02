package OTC.Automation.Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class McDITLogin extends DriverClass {
	
	@BeforeMethod
	public void setupp() {
		initializeDriver();
	}
	
	@Test
	public void testit() throws InterruptedException {
	driver.get("https://tradedepot.co.nz/");

	driver.navigate().refresh();

	      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	       WebElement element1 = wait.until(
	    		    ExpectedConditions.elementToBeClickable(By.id("search_query_new"))
	    		);

		// Now type fresh text
	    		element1.sendKeys("Air Fryers");
	    		element1.submit();
	      WebElement productcards1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.mr-productCard-detailsContainer a.mr-productCard-title[href*='vogue-air-oven-12l']")));
	      productcards1.click();
	      
	    //*[@id="form-action-addToCart"]
	      
	      WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
	      
	    WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.mrPdp-addToCart-container input#form-action-addToCart")));
	    element2.click();   
	    Thread.sleep(3000);
	    WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));  
	    WebElement element3 = wait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.additional-buttons a.checkout-btn")));
	    element3.click();
	    Thread.sleep(3000);

		
	}
	
     @AfterMethod	
	public void closee() {
		driver.close();
	}
	
	
	

}
