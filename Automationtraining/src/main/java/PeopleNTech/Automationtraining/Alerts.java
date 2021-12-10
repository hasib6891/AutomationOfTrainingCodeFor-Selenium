package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https://demoqa.com/alerts"); 	// this will go to this URL 
		driver.manage().window().maximize();  //this makes the page LARGER
		
		WebElement alert= driver.findElement(By.id("alertButton"));
		alert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement alerts= driver.findElement(By.id("confirmButton"));
		alerts.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement alertss= driver.findElement(By.id("confirmButton"));
		alertss.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		
		
		
		
		
		
	}


}
