package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BurgerKingAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
													//We have to find the PATH only from WINDOWS 10 C.
		WebDriver driver = new ChromeDriver();		// Have to use CAPITAL letter only for here
		/*driver.get("https://www.bk.com/");			//This will open the page
		Thread.sleep(5000);
		driver.manage().window().maximize();		//Just MEMORISE this to make the PAGE LARGER.
		
		driver.findElement(By.linkText("Menu")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div/main/div/div/a[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/main/div/div[2]/div/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/main/div[3]/div[2]/div/div[3]/div/fieldset/div[2]/form/label[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/main/div[3]/div[2]/div/div[3]/button")).click();*/
		
		
		
		//this will go to the PAGE
		driver.get("https://www.pizzahutbd.com/");
		Thread.sleep(5000);
		//this will make the PAGE LARGER
		driver.manage().window().maximize();
		//this will close the POP-UP
		driver.findElement(By.xpath("//*[@aria-label='Close']")).click();
		Thread.sleep(2000);
		//this will click on the LOCATION
		driver.findElement(By.xpath("//*[@class='searchLocation jut_location_wrapper']")).click();
		Thread.sleep(2000);
		//this will click on the PIZZA BUTTON
		driver.findElement(By.linkText("Pizza")).click();
		Thread.sleep(9000);
		//this will click on MIDIUM
		driver.findElement(By.xpath("//*[@for='medium_size_26']")).click();
		Thread.sleep(2000);
		//this will CLICK on the ADD BUTTON
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/div[28]/form/div/div[2]/div[5]")).click();
		Thread.sleep(2000);
		//This will click on CHECKOUT BUTTON
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(2000);
		//This will ENTER the PHONE NUMBER on the SECTION
		driver.findElement(By.name("phone_number")).sendKeys("01320386162");
		Thread.sleep(2000);
		//This will click on SEND OTP
		driver.findElement(By.className("full-button center-align round")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}
