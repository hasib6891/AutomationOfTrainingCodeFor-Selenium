package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https://www.facebook.com"); 	// this will go to this URL 
		driver.manage().window().maximize();  //this makes the page LARGER
		
		WebElement CreateAnAccount= driver.findElement(By.xpath("//*[text()='Create New Account']"));
		CreateAnAccount.click();
		Thread.sleep(2000);
		
		WebElement MOB= driver.findElement(By.name("birthday_month"));
		Select obj = new Select(MOB);
		obj.selectByValue("12");
		
		WebElement DOB= driver.findElement(By.name("birthday_day"));
		Select object = new Select(DOB);
		object.selectByVisibleText("1");
		
		WebElement YOB = driver.findElement(By.name("birthday_year"));
		Select ob = new Select(YOB);
		ob.selectByVisibleText("1996");
		
		WebElement gender = driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		gender.click();
		
	
		
	}

}
