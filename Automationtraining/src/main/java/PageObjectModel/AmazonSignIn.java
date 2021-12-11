package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignIn {
	WebDriver driver;
	
public AmazonSignIn(WebDriver driver) {	
	this.driver = driver;
	PageFactory.initElements(driver, this);

	}	
	
@FindBy(id="ap_email")
	WebElement Email;

// @FindBy(id="continue")
	// WebElement Continue;

@FindBy(id="auth-create-account-link")
	WebElement CreateAccount;

public void UserName() {
	Email.sendKeys("hasiburhowlader@yahoo.com");
	
	}

public void Continue1() {
	Continue.click();

	}
	
public void CreateNewAccount() {
	CreateAccount.click();
	
	}	

}

