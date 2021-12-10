package PeopleNTech.Automationtraining;

import org.testng.annotations.Test;

import PageObjectModel.Home;
import PageObjectModel.SignInPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignInAmazon {
	public WebDriver driver;
	
	@Test
	public void f() throws InterruptedException {
		Home ob= new Home(driver);
		ob.SignToClick();
		SignInPage it =new SignInPage(driver);
		
		Thread.sleep(5000);
		it.EmailFieldSendKeys();
		
		Thread.sleep(5000);
		it.ContinueButtonClick();
  }
	
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get ("https://www.amazon.com/"); 	// this will go to this URL 
		driver.manage().window().maximize();  //this makes the page LARGER
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
