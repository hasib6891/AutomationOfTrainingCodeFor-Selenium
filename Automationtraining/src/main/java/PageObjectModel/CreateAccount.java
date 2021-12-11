package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	WebDriver driver;
	
public CreateAccount(WebDriver driver)	{
	this.driver= driver;
PageFactory.initElements(driver, this);	
	
	}
@FindBy(id="ap_customer_name")
WebElement YourName;	
	
@FindBy(id="ap_email")
WebElement NewEmail;

@FindBy(id="ap_password")
WebElement password;

@FindBy(id="ap_password_check")
WebElement ReEnterPassword;

@FindBy(id="a-autoid-0")
WebElement CreateNewAccount;

public void YourNameM() {
	YourName.sendKeys("Hasibur Howlader");

	}

public void NewEmailM() {
	NewEmail.sendKeys("hasiburhowlader@yahoo.com");

	}

public void passwordM() {
	password.sendKeys("Hrh1990@");

	}

public void ReEnterPasswordM() {
	ReEnterPassword.sendKeys("Hrh1990@");

	}

public void CreateNewAccountM() {
	CreateNewAccount.click();

	}

}
