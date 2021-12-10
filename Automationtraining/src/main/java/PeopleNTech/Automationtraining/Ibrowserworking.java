package PeopleNTech.Automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowserworking {

	public static void main(String[] args) throws InterruptedException {	// We wrote the "throws InterruptedException" because we wrote the "Thread.sleep(6000)"
		//Otherwise we donot need to put "throws InterruptedException"
		
		//i) How to open the browser    (interface)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https://www.amazon.com"); 	// this will go to this URL 
		Thread.sleep(6000);
		driver.manage().window().maximize();  //this makes the page LARGER
		Thread.sleep(6000);
		
		driver.navigate().refresh();   //to refresh
		Thread.sleep(6000);    //we write this line to make the website to wait for SOME SECONDS inorder to go to NEXT FUNCTION
		
		driver.navigate().back();      //to go to back
		Thread.sleep(6000);
		
		driver.navigate().forward();   //to go to forward
		Thread.sleep(6000);
		
		System.out.println(driver.getWindowHandle());	 // To switch the window
		
		System.out.println(driver.getCurrentUrl());	  // This will print the current URL to the console
		
		System.out.println(driver.getTitle());	 // This will get the "TITLE" of the page
		
		System.out.println(driver.getPageSource());	  // This gives the source of the last page loaded.

		driver.close();		//To close everything
	}

}
