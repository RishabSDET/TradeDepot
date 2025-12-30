package OTC.Automation.Framework;

import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import org.openqa.selenium.TimeoutException;

public class FunExpressDIT extends DriverClass
    {

    	@BeforeMethod
    	public void setupFx() {
    		initializeDriver();
    	}
    	    
    	@Test
    	public void Fx() throws InterruptedException {
    	driver.get("https://dit.m245.funexpress.com");

    	driver.navigate().refresh();

    	      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	      WebElement element1 = wait.until(
    	    		    ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='search']"))
    	    		); 
    	       element1.sendKeys("Stickers"); 
    	       
    	       WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	       WebElement element2 = wait3.until(
    	    		    ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"search_mini_form\"]/div/div/div[1]/button"))
    	    		); 
    	       element2.click();
    	    
    	      
    	       WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(40));

    	    // Scroll down a bit to trigger lazy loading
    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
    	    Thread.sleep(2000);

    	    // Wait for element visibility
    	    WebElement productLink2 = wait4.until(ExpectedConditions.presenceOfElementLocated(
    	        By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div/section[2]/ol/li[1]")
    	    ));
    	    productLink2.click();
    	
    	    
    	    WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(40));

    	    // Scroll down a bit to trigger lazy loading
    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
    	    Thread.sleep(2000);

    	    // Wait for element visibility
    	    WebElement productLink3 = wait5.until(ExpectedConditions.presenceOfElementLocated(
    	        By.xpath("//*[@id=\"maincontent\"]/div[3]/div/section[1]/div[5]/div/a")
    	    ));
    	    productLink3.click();
    	
    	    Thread.sleep(2000);

    	    
    	    WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(40));

    	    // Scroll down a bit to trigger lazy loading
    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
    	    Thread.sleep(2000);

    	    // Wait for element visibility
    	    WebElement productLink4 = wait6.until(ExpectedConditions.presenceOfElementLocated(
    	        By.cssSelector("div.control input#email2")
    	    ));
    	    productLink4.sendKeys("forum.parikh@encora.com");
    	
    	    
    	    WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(40));
    	    // Wait for element visibility
    	    WebElement productLink5 = wait7.until(ExpectedConditions.presenceOfElementLocated(
    	        By.cssSelector("div.control input#pass2")
    	    ));
    	    productLink5.sendKeys("Password@123");
    	
    	    
    	    WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(40));
    	    // Wait for element visibility
    	    WebElement productLink6 = wait8.until(ExpectedConditions.presenceOfElementLocated(
    	        By.cssSelector("div.primary button#send2_btn")
    	    ));
    	    productLink6.click();
    	    
    	    Thread.sleep(2000);
    	    
    	    WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(40));

    	    // Scroll down a bit to trigger lazy loading
    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 450);");
    	    Thread.sleep(2000);

    	    // Wait for element visibility
    	    WebElement productLink7 = wait9.until(ExpectedConditions.presenceOfElementLocated(
    	        By.xpath("//*[@id=\"product-addtocart-button\"]")
    	    ));
    	    productLink7.click();
    	    
    	    Thread.sleep(2000);

    	    
    	    
    	    WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(40));
    	    
    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -450);");
    	    Thread.sleep(2000);

    	    // Wait for element visibility
    	    WebElement productLink8 = wait10.until(ExpectedConditions.presenceOfElementLocated(
    	        By.xpath("//*[@id=\"html-body\"]/div[5]/header/div[2]/div[3]/a[1]")
    	    ));
    	    productLink8.click();
    	  
    	    Thread.sleep(2000);
    	    
    	    
         WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(40));
    	    
    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 450);");
    	    Thread.sleep(2000);

    	    // Wait for element visibility
    	    WebElement productLink9 = wait11.until(ExpectedConditions.presenceOfElementLocated(
    	        By.xpath("//*[@id=\"top-cart-btn-checkout\"]")
    	    ));
    	    productLink9.click();
    	    
    	    
    	    
        WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(50));
    	    
    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
    	    Thread.sleep(2000);

    	    // Wait for element visibility
    	    WebElement productLink10 = wait12.until(ExpectedConditions.presenceOfElementLocated(
    	        By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")
    	    ));
    	    productLink10.click();
    	    
    	    
  WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(50));
    	    
    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 400);");
    	    Thread.sleep(2000);

    	    // Wait for element visibility
    	    WebElement productLink11 = wait13.until(ExpectedConditions.presenceOfElementLocated(
    	        By.xpath("//*[@id=\"netterms\"]")
    	    ));
    	    productLink11.click();
    	    
    	    
 WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(40));
    	    
    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200);");
    	    Thread.sleep(2000);

    	    // Wait for element visibility
    	    WebElement productLink12 = wait14.until(ExpectedConditions.presenceOfElementLocated(
    	        By.xpath("//*[@id=\"po_number\"]")
    	    ));
    	    productLink12.sendKeys("PO726");
    	    
 WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(40));
    	    
    	  //  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200);");
    	    Thread.sleep(2000);

    	    // Wait for element visibility
    	    WebElement productLink13 = wait15.until(ExpectedConditions.presenceOfElementLocated(
    	        By.xpath("//*[@id=\"placed_by\"]")
    	    ));
    	    productLink13.sendKeys("TESTQASM112511");
  
    	  
    	    WebDriverWait wait16 = new WebDriverWait(driver, Duration.ofSeconds(40));
    	    
      	  //  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200);");
      	    Thread.sleep(2000);

      	    // Wait for element visibility
      	    WebElement productLink14 = wait16.until(ExpectedConditions.presenceOfElementLocated(
      	        By.xpath("//*[@id=\"review-buttons-container\"]/div/button")
      	    ));
      	    productLink14.click();
    	    
    	    
      	  WebDriverWait wait17 = new WebDriverWait(driver, Duration.ofSeconds(40));
  	    
      	  
      	 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
      	  
//       ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 55  0);"); 
//       Wait for loading mask to disappear
      	 wait17.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-mask")));
      	  
      	    Thread.sleep(2000);
//
//      	    // Wait for element visibility
//      	    WebElement productLink15 = wait17.until(ExpectedConditions.presenceOfElementLocated(
//      	        By.xpath("//*[@id=\"review_info\"]/div[3]/div/button") 
//      	    ));
//      	    productLink15.click();
//    	    




//          Now click the button
            WebElement placeOrderBtn = wait17.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id='review_info']/div[3]/div/button")
              ));
            placeOrderBtn.click();
//
//          WebDriverWait wait18 = new WebDriverWait(driver, Duration.ofSeconds(40));
//
//         // Success message
//         WebElement successMsg = wait18.until(ExpectedConditions.visibilityOfElementLocated(
//             By.xpath("//h1[contains(text(),'Thank you for your purchase!')]")
//         ));
//         System.out.println("Success Message: " + successMsg.getText());

//         // Order number
//         WebElement orderNumberElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
//             By.xpath("//div[@class='checkout-success']/span")
//         ));
//         String orderText = orderNumberElement.getText();
//         String orderNumber = orderText.replaceAll("[^0-9]", ""); // Extract only digits
//         System.out.println("Order Number: " + orderNumber);

    WebDriverWait wait18 = new WebDriverWait(driver, Duration.ofSeconds(60)); // Increase timeout

   try {
    // Wait for success message to appear
    WebElement successMessage = wait18.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//span[contains(text(),'Thank you for your purchase!')]")
    ));
    System.out.println("Success Message: " + successMessage.getText());
     } catch (TimeoutException e) {
    System.out.println("Success message not found within timeout. Capturing screenshot for debugging...");
    try {
    // Capture screenshot for debugging
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    // Save screenshot to a location
   Files.copy (screenshot.toPath(), Paths.get("C:\\Users\\rishab.kapania\\OneDrive - SourceMash Technologies Pvt Ltd\\Screenshots\\Success_Order_Fx.png"), StandardCopyOption.REPLACE_EXISTING); 

   System.out.println("Screenshot saved as error_screenshot.png");
   } catch (Exception ex) {
      System.out.println("Failed to capture screenshot: " + ex.getMessage());
      ex.printStackTrace();
   }
     }
     
    	}    	
    	

//    	    // Scroll into view
//    	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", productLink2);
//
//    	    // Click using JS for reliability
//    	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", productLink2); }
//    	    
//    	 
//    		
//    	}
//    	
    	
    	
    	
         @AfterMethod	
    	public void closee() {
    		driver.close();
    	}
    	
    	
    	

    }