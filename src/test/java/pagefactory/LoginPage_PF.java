package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	WebDriver driver;
	public LoginPage_PF(WebDriver  driver) {
		this.driver=driver;
	    PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="username")
	WebElement txt_username;

	@FindBy(id="password")
	WebElement txt_password;

	@FindBy(id="signin")
	WebElement btn_signin;
	
	@FindBy(linkText = "SIGN IN")
	WebElement btn_launchSignInPage;
	
	@FindBy(xpath  = "//div[text()='Invalid username or password']")
	WebElement invalidCredsErrorMessage;
	
	public void enterUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) {
	    txt_password.sendKeys(password);

	}
	public void clickSingIn() {
	 	btn_signin.click();

	}
	
	public void launchSignInPage() {
		btn_launchSignInPage.click();
		
	}
	
	public void verifynvalidCredsErrorMessage() {
		invalidCredsErrorMessage.isDisplayed();

	}
	

}
