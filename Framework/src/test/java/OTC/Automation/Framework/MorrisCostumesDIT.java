package OTC.Automation.Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

     public class MorrisCostumesDIT extends DriverClass {
    	 WebDriverWait wait;
    @BeforeMethod

    public void invokebrowser() {
    	
	    initializeDriver();
	    wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        }
    
    
    
   
    @Test
    
    public void Regression_MC_DIT() throws InterruptedException {
    	driver.get("https://dit.m245.morriscostumes.com/");
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	WebElement searchBox = wait.until(
	    		    ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='search']"))
	    		); 
	       searchBox.sendKeys("Masks"); 
	       
	       
	    	WebElement searchButton = wait.until(
	       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"search_mini_form\"]/div/div/div[1]/button")));
	    	searchButton.click();
	    	Thread.sleep(2000);
	    	 // Scroll down a bit to trigger lazy loading
    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
    	    Thread.sleep(2000); 
	    	WebElement productCard = wait.until(
	    	 ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, 'mabzus106')]")));
	    	 productCard.click();
	    	    Thread.sleep(2000); 
	    	  
	    	    WebElement logintoViewPriceBtn = wait.until(
	    		    	 ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/section[1]/div[5]/div/a")));
	    	    logintoViewPriceBtn.click();
	    	    
	    	    // Scroll down a bit to trigger lazy loading
	    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
	    	    Thread.sleep(2000);       
	    	    
	    	    Thread.sleep(2000);  
	    	    WebElement emailField = wait.until(
	    		    	 ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"email2\"]")));
	    	    emailField.sendKeys("forum.parikh@encora.com");
	    	    
	    	    WebElement passwordField = wait.until(
	    		    	 ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pass2\"]")));
	    	    passwordField.sendKeys("Password@123");
	    	    
	    	    WebElement logInBtn = wait.until(
	    		    	 ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-form-registered\"]/fieldset/div[5]/div[1]")));
	    	    logInBtn.click();
	    	  
	    	    // Scroll down a bit to trigger lazy loading
	    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
	    	    WebElement addToCartBtn = wait.until(
	    	 	       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"qty\"]")));
	    	    addToCartBtn.click();
	    	    Thread.sleep(3000);  
	    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -500);");
	    	    Thread.sleep(3000);  

	    	    
	    	    WebElement miniCart = wait.until(
		    	 	       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"html-body\"]/div[5]/header/div[2]/div[3]/a[1]")));
		    	    miniCart.click();
		    	Thread.sleep(3000);  
		    	 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 450);");
	    	    
		    	WebElement viewAndEditCartBtn = wait.until(
		    	 	       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span")));
		    	viewAndEditCartBtn.click();
		    	  
		    	WebElement proceedToCheckout = wait.until(
		    	 	       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div/ul/li/button")));
		    	proceedToCheckout.click();
		    	
		    	Thread.sleep(3000);  
		    	 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
		    	WebElement nextBtn = wait.until(
		    	 	       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div")));
		    	nextBtn.click();
		    	
		    	 
		    	WebElement billMyAccountBtn = wait.until(
		    	 	       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"netterms\"]")));
		    	billMyAccountBtn.click();   
		    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 450);");
		    	
		    	WebElement purchaseOrderField = wait.until(
		    	 	       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"payment_form_netterms\"]/div[1]/div")));
		    	purchaseOrderField.sendKeys("PO12883"); 
		    	
		    	WebElement orderPlacedBy = wait.until(
		    	 	       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"payment_form_netterms\"]/div[2]/div")));
		    	orderPlacedBy.sendKeys("TestQASM912251"); 
		    	
		    	
		    	
		    	WebElement continueCheckout = wait.until(
		    	 	       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"review-buttons-container\"]/div")));
		    	continueCheckout.click(); 
	    	      
	    	  
	    	//  
	    	    
	    	    
	    	    
    }        
	
    @AfterMethod
    
    public void closebrowser() {
    	driver.close();
    }
       }
