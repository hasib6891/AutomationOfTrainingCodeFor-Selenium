package PeopleNTech.Automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel.AmazonHome;
import PageObjectModel.AmazonSignIn;
import PageObjectModel.CreateAccount;

public class AmazonTest {
	WebDriver driver;
	@Test

public void Test() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https:www.amazon.com"); 	// this will go to this URL 
		driver.manage().window().maximize();  //this makes the page LARGER
	
AmazonHome object1 = new AmazonHome(driver);		//Here we r IMPORTING the class AmazonHome [To get access to METHODS from that page]
	object1.ClickOnSignIn();				//Here we r calling METHODS
Thread.sleep(2000);	
	
AmazonSignIn object2 = new AmazonSignIn(driver);	//Here we r IMPORTING the class AmazonSignIn [To get access to METHODS from that page]//
	object2.UserName();
Thread.sleep(2000);	
	//object2.Continue1();    //We are commenting this because we want to click on CREATE A NEW ACCOUNT
	object2.CreateNewAccount();

CreateAccount object3 = new CreateAccount(driver);
	object3.YourNameM();
	object3.NewEmailM();
	object3.passwordM();
	object3.ReEnterPasswordM();
	object3.CreateNewAccountM();
	
	}	
	
}
