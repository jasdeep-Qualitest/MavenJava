package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class achieveLogin_POM {

//    
//	WebDriver driver =null;
//
//	@Given("Browser is open")
//	public void browser_is_open() {
//		String projectPath= System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",projectPath +"/src/test/resources/drivers/chromedriver.exe");
//		driver =new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//	}
//
//	@And("navigate to Achiev page")
//	public void navigate_to_achiev_page() {
//		driver.navigate().to("https://int-achieve-courseware-frontend.mldev.cloud/");
//	}
//
//	@When("use click on sign in button")
//	public void use_click_on_sign_in_button() {
//		
//		driver.getPageSource().contains("SIGN IN");
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//		driver.findElement(By.linkText("SIGN IN")).click();
//	}
//
//	@And("^user enter (.*) and (.*)$")
//	public void user_enter_username_and_password(String username, String password) {
//		
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//		loginPage login =new loginPage(driver);
//		
//		login.enterUsername(username);
//		login.enterPassword(password);
//
//	}
//
//	@And("click on signin button")
//	public void click_on_signin_button() {
//		loginPage login =new loginPage(driver);
//		login.clickSingIn();
//	}
//
//	@Then("user is navigated on Achieve Home Page")
//	public void user_is_navigated_on_achieve_home_page() throws InterruptedException {
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//		loginPage login =new loginPage(driver);
//		login.verifyThatUserIsLoggedIn();
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//		
//	}
//



}
