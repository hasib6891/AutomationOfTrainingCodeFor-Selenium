package PeopleNTech.Automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args ) {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\git\\repository\\Automationtraining\\src\\Drivers\\chromedriver.exe");
    	// 1st have to write "webdriver.chrome.driver" 2nd we have to write the "PATH".
    	//THIS WILL LET THE "CHROME DRIVER" TO GET STARTED
    	
    	WebDriver driver = new ChromeDriver();		//2nd we have to make the OBJECT. 									//This will make the DRIVER to OPEN
		driver.manage().window().maximize();  		//this makes the page LARGER
		driver.get ("https://www.amazon.com");
		driver.navigate().to("https://google.com");		//This will take us to a NEW PAGE.
		driver.navigate().back();					//This will take us to the PREVIOUS PAGE
		driver.navigate().forward();				//This will take us to the NEXT PAGE
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    }
}
