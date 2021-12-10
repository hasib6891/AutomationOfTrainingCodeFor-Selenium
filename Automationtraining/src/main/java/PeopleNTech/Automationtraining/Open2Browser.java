package PeopleNTech.Automationtraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Open2Browser {
public static WebDriver drive;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https:www.amazon.com"); 	// this will go to this URL 
		driver.manage().window().maximize();  //this makes the page LARGER
		Actions ob=new Actions(driver);
		
		WebElement books=driver.findElement(By.linkText("Kindle Books"));
		ob.keyDown(Keys.SHIFT).build().perform();
		books.click();
		
		Thread.sleep(2000);
		
		ob.keyUp(Keys.SHIFT).build().perform();
		
		String current=driver.getWindowHandle();
		System.out.println(current);		//getting the SESSION ID for parent window
		
		Set<String> windowhandles= driver.getWindowHandles();		//Here we r IMPOTING SET
		Iterator<String> iterators= windowhandles.iterator();
		
		String parentwindowhandle=iterators.next();
		String childwindowhandle=iterators.next();
		
		System.out.println("This is parent window="+parentwindowhandle);
		System.out.println("This is child window="+childwindowhandle);
		
		driver.switchTo().window(childwindowhandle);
		Thread.sleep(5000);
		
		WebElement exclusive=driver.findElement(By.linkText("Kindle Exclusives"));
		exclusive.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
