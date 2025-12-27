package practisejava;
import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
class JavaAnnotation{
	
	
WebDriver driver;

	
@BeforeClass
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
    driver = new ChromeDriver()
	driver.manage().window().maximize();
	}

@Test
public void login()
{
	  driver.get("https://www.google.com");
      System.out.println("Page Title is: " + driver.getTitle());
}

@AfterClass

public void teardown() {
    driver.quit();
}


	
}
