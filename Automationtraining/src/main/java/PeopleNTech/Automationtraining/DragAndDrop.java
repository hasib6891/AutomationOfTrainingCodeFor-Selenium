package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https://jqueryui.com/droppable"); 	// this will go to this URL 
		driver.manage().window().maximize();  //this makes the page LARGER
		Actions ob=new Actions(driver);
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);	//This will let get INSIDE OF THE IFRAME
		
		WebElement dragged=driver.findElement(By.id("draggable"));
		Thread.sleep(1000);
		WebElement drropable=driver.findElement(By.id("droppable"));
		ob.dragAndDrop(dragged, drropable).build().perform();
		
		//System.out.println(driver.findElements(By.tagName("Iframe")).size());	//This tells us how many IFRAME we have inside the page.
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();	//This lets us move back to the PARENT FRAME
		WebElement sizeds=driver.findElement(By.linkText("Resizable"));
		sizeds.click();
		
	}

}
