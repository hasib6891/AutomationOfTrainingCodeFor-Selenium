package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//i) How to open the browser    (interface)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https://www.facebook.com"); 	// this will go to this URL 
		driver.manage().window().maximize();  //this makes the page LARGER
		
	WebElement username= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")); 	//Right click on the code, then go to COPY, Then COPY FULL XPATH. Then PASTE it on ECLLIPSE.
	username.sendKeys("Hasibur");	
	
	WebElement password= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
	password.sendKeys("Howlader");
	
	WebElement login= driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
	login.click();
	
	WebElement forgotp= driver.findElement(By.xpath("//a[text()='Forgotten password?'"));
	forgotp.click();
	
	
	
	}

}
