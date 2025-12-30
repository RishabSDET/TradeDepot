package OTC.Automation.Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmileMakersUSDIT extends DriverClass{
	 WebDriverWait wait;
	@BeforeMethod
	public void invokebrowser() {
		
		initializeDriver();
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	
	
	@Test
	
	public void Regression_SM_US_DIT() throws InterruptedException {
		
		driver.get("https://smca-m244-uat.smilemakers.com/");
		 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
 	    Thread.sleep(2000); 
		WebElement accountLoginDrpDwn = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div/div/div/section[3]/div[2]/div[3]/p/a")));
		accountLoginDrpDwn.click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
		
		
		WebElement productCardClick = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"amasty-shopby-product-list\"]/div[2]/ol/li[1]/div/a")));
		productCardClick.click();
		
		Thread.sleep(2000); 
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
		
		WebElement pdpQtyField = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"qty\"]")));
		pdpQtyField.sendKeys(Keys.CONTROL + "a");
		pdpQtyField.sendKeys(Keys.BACK_SPACE);
		pdpQtyField.sendKeys("3");
		WebElement boxBtn = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"option-label-configuration-252-item-2861\"]")));
		boxBtn.click();
		WebElement addToCart = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-addtocart-button\"]")));
		addToCart.click();
		Thread.sleep(2000);    
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
		
		By cartIcon = By.cssSelector("a.action.showcart, a.action.header-link.glyphicon-shopping-cart");
		By minicartPanel = By.cssSelector("div.block-minicart, div.minicart-wrapper.active");
		WebElement cart = wait.until(
			       ExpectedConditions.presenceOfElementLocated(cartIcon));
			       //cart.click();
		
		//EnsureElement is in view 
		((JavascriptExecutor) driver)
		.executeScript("arguments[0].scrollIntoView({ block:'center' });", cart);
		
		//HoverOnly
		Actions actions = new Actions (driver);
		actions.moveToElement(cart).pause(Duration.ofMillis(400)).perform();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(minicartPanel));  
		
		Thread.sleep(3000);    
		WebElement viewShoppingCart = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[6]/div/a/span")));
		viewShoppingCart.click();
		
		//*[@id="minicart-content-wrapper"]/div[2]/div[6]/div/a/span
		
		Thread.sleep(3000);    
		WebElement shoppingCartQtyFld = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[3]/div/div/label"))));
		shoppingCartQtyFld.sendKeys(Keys.CONTROL + "a"); 
		shoppingCartQtyFld.sendKeys(Keys.BACK_SPACE);
		shoppingCartQtyFld.sendKeys("8");
		shoppingCartQtyFld.sendKeys(Keys.TAB);
		Thread.sleep(3000);    
		WebElement updateShoppingCartBtn = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"form-validate\"]/div[2]/button[1]")))); 
		
		updateShoppingCartBtn.click();
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250);");
		
//		WebElement enterPromoCodeFld = wait.until(
//			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"coupon_code\"]")))); 
//		
//		enterPromoCodeFld.sendKeys("SMSITE10");
//		
//		WebElement applyPromotionBtn = wait.until(
//			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"discount-coupon-form\"]/div/div[2]/div")))); 
//		
//		applyPromotionBtn.click();
		
		Thread.sleep(3000); 
		
		 
		WebElement proceedCheckOutBtn = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/ul/li/button")))); 
		
		proceedCheckOutBtn.click();
		
		Thread.sleep(3000); 
		
		
		WebElement emailAddressField = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"customer-email\"]")))); 
		
		emailAddressField.sendKeys("rishabkapania@sourcemash.com");
		
		
		WebElement passwordField = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"pass\"]")))); 
		
		passwordField.sendKeys("Password@123");
		
		WebElement loginBtn = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"send2\"]")))); 
		
		loginBtn.click();
		
		Thread.sleep(3000); 
		
		
		WebElement shoppingCartQtyFld2 = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[3]/div/div/label"))));
		shoppingCartQtyFld2.sendKeys(Keys.CONTROL + "a"); 
		shoppingCartQtyFld2.sendKeys(Keys.BACK_SPACE);
		shoppingCartQtyFld2.sendKeys("8");
		shoppingCartQtyFld2.sendKeys(Keys.TAB);
		Thread.sleep(3000); 
		
		WebElement updateShoppingCartBtn2 = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"form-validate\"]/div[2]/button[2]")))); 
		
		updateShoppingCartBtn2.click();
		
		Thread.sleep(5000); 
		   
		//Proceed To Checkout

		WebElement proceedToCheckOutBtn = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/ul/li/button")))); 
		
		proceedToCheckOutBtn.click();
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
		Thread.sleep(3000);     
		WebElement shippingMethodBtn = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"s_method_sooryenshipping_5\"]")))); 
		
		shippingMethodBtn.click();
		
		Thread.sleep(3000);     
		
		WebElement onAccountInvoiceBtn = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"onaccount\"]")))); 
		
		onAccountInvoiceBtn.click();  
		Thread.sleep(3000);     
		WebElement onAccountInvoiceFiled = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"onaccount_po_number\"]")))); 
		
		onAccountInvoiceFiled.sendKeys("SMQA171220251");
		Thread.sleep(3000);     
		

		WebElement placeOrderBtn = wait.until(
			       ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"checkout\"]/div[5]/div[3]/div/div[4]/div/div[1]/button")))); 
		
			    		   placeOrderBtn.click();		  
			    		   Thread.sleep(9000); 
			    		   
	    // Wait for success page
			    		   wait.until(ExpectedConditions.urlContains("success"));
		//Verify Thankyou Text
			    		   WebElement thankYouText = wait.until(
			    				   ExpectedConditions.visibilityOfElementLocated(
			    						   By.xpath ("//*[@id=\"maincontent\"]/div[2]/h1/span")));
//		WebElement thankYouText = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/h1/span"));
		String actualText = thankYouText.getText();   
		
		if (actualText.equalsIgnoreCase("Thank You For Your Purchase!")) {
			System.out.println("Thank You text has been verified!");
		}
		else {
			System.out.println("Thank You text not matched!"+ actualText);
			
		}
		
		    
		Thread.sleep(6000); 
		
		
		
		
		
		
		////*[@id="onaccount_po_number"]
		
		
	}
	@AfterMethod
	  
	public void closebrowser() {
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
