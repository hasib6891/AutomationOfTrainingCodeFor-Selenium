package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome {	// 1ST Create a CLASS NAME according to the WEBPAGE
	WebDriver driver;		//2ND write WebDriver driver;
	
public AmazonHome(WebDriver driver) {	//3rd Create a METHODNAME() same as CLASS NAME
	this.driver=driver;					//4TH write  this.driver=driver;
	PageFactory.initElements(driver, this);		//5th write pagefactory and import it
	
	}	

	@FindBy(id="nav-link-accountList-nav-line-1")	//6th use @findby(Xpath) and import it
	WebElement SignIn;				//7th write webelement()
	
public void ClickOnSignIn() {	//8th create a separate METHOD 
	SignIn.click();			//Now use the [click or send keys accordingly]
	
	}	
	//FOLLOW THIS SAME STEPS FOR EVERY NEW PAGE
}
