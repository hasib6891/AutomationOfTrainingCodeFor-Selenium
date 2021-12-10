package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PizzaHut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\PeopleNTech\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		//We have to find the PATH only from WINDOWS 10 C.
		WebDriver driver = new ChromeDriver();
		//step1: open pizzahut url and maximize it
        driver.get("https://pizzahut.com");
        driver.manage().window().maximize();
        //Thread.sleep(1000);
        
        //step2: find the "FIND DEALS" button and then click on it
        driver.findElement(By.xpath("//*[text()=\"FIND DEALS\"]")).click();
        //Thread.sleep(1000);
        
        //step3: click on the GPS button
        driver.findElement(By.xpath("//*[text()=\"Use GPS\"]")).click();
        //Thread.sleep(3000);
        
        //step4: allow using GPS (we skip this as it's already accessing my gps)
        
        //step5: select the first restaurant
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[4]/div/div[1]/div/div/div/div[3]/div[2]/div/button/span/span[1]")).click();        
        
        //step6: click on the close button
        driver.findElement(By.xpath("//a[@id=\"modal-button-CLOSE\"]")).click();
        
        //step7: add triple... in the order
        driver.findElement(By.xpath("//a[@id=\"ato-triple-treat-box--3-courses-1-festive-box\"]")).click();
        
        //step8: select the one with two 1-topping pizza
        driver.findElement(By.id("ato-triple-treat-box-with-two-1topping-pizzas")).click();
        
        //step9: click on the original pan option
        driver.findElement(By.xpath("//span[@id=\"option-P\"]")).click();
        
        //step10: change the sauce and select extra
        driver.findElement(By.xpath("//a[@id=\"edit-Sauce\"]")).click();
        driver.findElement(By.xpath("//span[@id=\"option-GL\"]")).click();
        driver.findElement(By.xpath("//span[@id=\"Sauce-Extra\"]")).click();

      //step11: continue to toppings
        driver.findElement(By.xpath("//span[text()=\"Continue To Toppings\"]")).click();
        
        //step12: add beef to the toppings
        driver.findElement(By.xpath("//span[text()=\"See more \"][1]")).click();
        driver.findElement(By.xpath("//span[text()=\"Beef\"]")).click();
        
        //step13: click on the continue button and choose extra cheese
        driver.findElement(By.xpath("//a[@id=\"pb-primary-cta-deal\"]")).click();
        driver.findElement(By.xpath("//a[@data-ng-bind-html=\"button.confirm\"]")).click();
        
        //step14: Choose ahnd... for the second pizza
        driver.findElement(By.xpath("//span[@id=\"option-H\"]")).click();
        
        //step15: click on continue and select mushroom
        driver.findElement(By.xpath("//span[text()=\"TOPPINGS\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"Mushrooms\"]")).click();
        
        //step16: click on the continue and then click on the "no thanks'
        driver.findElement(By.xpath("//a[@id=\"pb-primary-cta-deal\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"No thanks\"]")).click();
        
        //step 17: add cheese sticks to the order
        driver.findElement(By.id("ato-cheese-sticks")).click();
 
      //step18: add cinnabon
        driver.findElement(By.id("ato-cinnabon-mini-rolls")).click();
        
        //step19: click on view order
        driver.findElement(By.id("view-order-top-upsell")).click();
        
        //step20: hover on menu and select drinks
        Actions ob = new Actions(driver);
        ob.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-element\"]"))).build().perform();
        driver.findElement(By.xpath("//a[@id=\"lg-nav-drinks\"]")).click();
        
        //step21: select a 2litre pepsi        
        Select ob2 = new Select(driver.findElement(By.id("size-pepsi")));
        ob2.selectByValue("R");
        driver.findElement(By.xpath("//a[@id=\"ato-pepsi\"]")).click();
        
        //step22: change to delivery
        driver.findElement(By.xpath("//div[@id=\"localization-detail\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"PROCEED\"]")).click();
        driver.findElement(By.xpath("//div[text()=\"DELIVERY\"]")).click();
        
        //step23: input the delivery address
        driver.findElement(By.id("w2-address")).sendKeys("8133 Leesburg Pike");
        driver.findElement(By.id("w2-address2")).sendKeys("Suite220");
        driver.findElement(By.id("w2-city")).sendKeys("Vienna");
        driver.findElement(By.id("w2-state")).sendKeys("VA");
        driver.findElement(By.id("w2-zip")).sendKeys("22182");
        driver.findElement(By.xpath("//span[text()=\"Search\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root jss19 MuiButton-contained MuiButton-fullWidth\"]")).click();
		
	}

}
