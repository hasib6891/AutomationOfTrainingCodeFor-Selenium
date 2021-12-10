package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				//i) How to open the browser    (interface)
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get ("https://www.amazon.com"); 	// this will go to this URL 
				driver.manage().window().maximize();  //this makes the page LARGER
				
	WebElement SearchIcon= driver.findElement(By.id("nav-search-submit-button"));
	SearchIcon.click();
	Thread.sleep(2000);
	
	WebElement TodaysDeal= driver.findElement(By.linkText("Today's Deals"));	//we will know it is a link if the sentence starts with "href". Then in the box just write the "ELEMENT NAME"
	TodaysDeal.click();
	Thread.sleep(2000);
	
	WebElement CoustomerService= driver.findElement(By.partialLinkText("Customer")); 	//For the partiallink we just ENTER little bit OF THE link.
	CoustomerService.click();
	Thread.sleep(2000);
	
	WebElement searchfield= driver.findElement(By.name("field-keywords"));
	searchfield.sendKeys("computer");
	//searchfield.click();
	
	
	
	
	}

}
