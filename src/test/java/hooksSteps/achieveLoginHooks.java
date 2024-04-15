package hooksSteps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pagefactory.DashBoardPage;
import pagefactory.LoginPage_PF;

public class achieveLoginHooks {

	WebDriver driver =null;
	LoginPage_PF login;
	DashBoardPage dashboard;

	@Before
	public void browserSetup() {
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath +"/src/test/resources/drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		System.out.println("---Browser is launched---");
	}

	@After
	public void teardown() {
		driver =new ChromeDriver();
		driver.close();
		driver.quit();
		System.out.println("Driver is closed");

	}


	@Given("navigate to Achiev page")
	public void navigate_to_achiev_page() {
		driver.navigate().to("https://int-achieve-courseware-frontend.mldev.cloud/");
	}
	@And("use click on sign in button")
	public void use_click_on_sign_in_button() {
		driver.getPageSource().contains("SIGN IN");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		login=new LoginPage_PF(driver);
		login.launchSignInPage();
	}
	@When("^user enter valid (.*) and (.*)$")
	public void user_enter_valid_username_and_password(String username, String password) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		login=new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	}
	@When("^user enter invalid (.*) and (.*)$")
	public void user_enter_invalid_username_and_password(String username, String password) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		login=new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("click on signin button")
	public void click_on_signin_button() {
		login=new LoginPage_PF(driver);
		login.clickSingIn();
	}
	@Then("user is navigated on Achieve Home Page")
	public void user_is_navigated_on_achieve_home_page() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		Thread.sleep(10000);
		dashboard = new DashBoardPage(driver);
		dashboard.verifyThatUserIsLoggedIn();
		driver.quit();
	}
	@Then("verify invalid creds error message")
	public void verify_invalid_creds_error_message() throws InterruptedException
	{
		login=new LoginPage_PF(driver);
		Thread.sleep(2000);
		login.verifynvalidCredsErrorMessage();
	}


}
