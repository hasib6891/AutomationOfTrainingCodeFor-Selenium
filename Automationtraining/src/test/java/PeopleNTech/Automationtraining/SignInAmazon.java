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
		
		Home object1= new Home(driver);
		object1.SignToClick();
		Thread.sleep(5000);
		
		SignInPage object2 =new SignInPage(driver);
			object2.EmailFieldSendKeys();
Thread.sleep(2000);
			object2.ContinueButtonClick();
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
