package stepDefinitions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {

	WebDriver driver =null;

	@Given("browser is open")
	public void browser_is_open() {
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath +"/src/test/resources/drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}

	@And("user is on google page")
	public void user_is_on_google_page() {
		driver.navigate().to("https://www.google.co.in/");
		

	}

	@When("user emters a text in search box")
	public void user_emters_a_text_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Cricbuzz");

	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	

	}

	@Then("user is navigate to search Results")
	public void user_is_navigate_to_search_results() {
		driver.getPageSource().contains("Cricbuzz.com");
		driver.close();

	}

}
