package PeopleNTech.Automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowserworking {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//i) How to open the browser    (interface)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com"); 
		driver.manage().window().maximize();  //this makes the page LARGER
		Thread.sleep(6000);
		driver.navigate().refresh();   //to refresh
		Thread.sleep(6000);    //we write this line to make the website to wait for SOME SECONDS inorder to go to NEXT FUNCTION
		driver.navigate().back();      //to go to back
		Thread.sleep(6000);
		driver.navigate().forward();   //to go to forward
		Thread.sleep(6000);
		
		String windowhandel = driver.getWindowHandle();	 //To switch the window
		System.out.println(windowhandel);
		
		String urlofbrowser= driver.getCurrentUrl();	//This will print the current URL to the console
		System.out.println(urlofbrowser);
		
		driver.close();		//To close everything
	}

}
