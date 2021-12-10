package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https://www.expedia.com/"); 	// this will go to this URL 
		driver.manage().window().maximize();  //this makes the page LARGER
		
		//This will Click on FLIGHTS
		WebElement flights= driver.findElement(By.xpath("//*[text()='Flights']"));
		flights.click();
		Thread.sleep(2000);
		
		//This will click on ONE-WAY
		driver.findElement(By.linkText("One-way")).click();
		Thread.sleep(2000);
		
		//This will click on LEAVING FROM
		driver.findElement(By.xpath("//button[@aria-label='Leaving from']")).click();
		Thread.sleep(2000);
		
		//This will ENter DHAKA on the bar
		driver.findElement(By.id("location-field-leg1-origin")).sendKeys("Dhaka");
		
		//This will click on GOING TO
		driver.findElement(By.xpath("//*[@title='Going to']")).click();
		Thread.sleep(2000);
		
		//This will ENTER LAX on the bar
		driver.findElement(By.id("location-field-leg1-destination")).click();
		Thread.sleep(2000);
		
		//This will click on Departing
		driver.findElement(By.xpath("//div[@class='uitk-field has-floatedLabel-label has-icon has-placeholder']")).click();
		Thread.sleep(2000);
		
		//This will SELECT the DATE
		driver.findElement(By.xpath("//button[@aria-label='Jan 26, 2022']")).click();
		Thread.sleep(5000);
		
		//This will CLICK on DONE
		driver.findElement(By.xpath("//div[@class='uitk-flex uitk-date-picker-menu-footer']")).click();		//Donot know why it Doesnot work
		Thread.sleep(2000);
		
		//This will click on SEARCH BUTTON
		driver.findElement(By.xpath("//*[@data-testid='submit-button']")).click();
		Thread.sleep(2000);
		
		
		
		
		
	}

}
