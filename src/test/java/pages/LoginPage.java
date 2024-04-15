package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By txt_username = By.id("username");
	By txt_password = By.id("password");
	By btn_signin = By.id("signin");
	By coursesTabLabel = By.cssSelector("[aria-label='COURSES']");


	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}


	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);

	}
	public void clickSingIn() {
		driver.findElement(btn_signin).click();

	}
	public void verifyThatUserIsLoggedIn() {
		System.out.println(driver.findElement(coursesTabLabel).isDisplayed());

	}

	public void loginAchieve(String username , String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_signin).click();
	}

}
