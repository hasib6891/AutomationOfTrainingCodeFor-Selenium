package PeopleNTech.Automationtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyBoard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https:www.amazon.com"); 	// this will go to this URL 
		driver.manage().window().maximize();  //this makes the page LARGER
		Actions ob=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement searchbar=driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("Computer");			//This will enter "computer"on the search bar
		Thread.sleep(2000);
		
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();	//This HIGHLIGHTS all the written WORDS on the search bar
		Thread.sleep(2000);
		
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();	//This COPY all the written WORDS on the search bar
		Thread.sleep(2000);
		
		searchbar.clear();		//This CLEAR everything from the search bar
		Thread.sleep(2000);
		
		searchbar.click();		//This will CLICK on search bar AGAIN
		Thread.sleep(2000);
		
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();	//This PASTE all the written WORDS on the search bar
		Thread.sleep(2000);
		// ob.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();		//Donot know why it does not work
		
		WebElement searchbar1=driver.findElement(By.id("twotabsearchtextbox"));
		WebDriverWait wait=new WebDriverWait(driver,100);	//EXPLICIT WAIT
		wait.until(ExpectedConditions.elementToBeClickable(searchbar1));		//This is CONDITION
		
		
	}

}
