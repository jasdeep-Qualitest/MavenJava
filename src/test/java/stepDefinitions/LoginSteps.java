package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
		
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
		System.out.println("User enters the username and password");
		
	}

	@And("click on the sign in button")
	public void click_on_the_sign_in_button() {
		System.out.println("click on the sign in button");
		
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() {
		System.out.println("user navigated to the home page");
		
	}


}
