package webMd.StepDef;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webMd.Actions.SignUpActions;

public class SignUpStepDef {
	
	SignUpActions actions = new SignUpActions();

	@Given("I land on the WebMD homepage")
	public void i_land_on_the_WebMD_homepage() {
		actions.getWebMdHomePage();
		actions.closingCookie();
		Assert.assertEquals(actions.verifyHomePage(), true);
		
	}

	@Given("I click on sign in")
	public void i_click_on_sign_in() {
		actions.clickSignIn();
		
	}

	@Given("I click on sign up")
	public void i_click_on_sign_up() {
		actions.clickSignUp();
		
	}

	@Given("I will be able to launch the WebMD Sign up page")
	public void i_will_be_able_to_launch_the_WebMD_Sign_up_page() {
		boolean SignUpPage = actions.verifyHomePage();
		Assert.assertEquals(SignUpPage, true);

	}

	@When("I enter correct email {string}")
	public void i_enter_correct_email(String email) {
		actions.entersEmail(email);

	}

	@When("I enter correct password {string}")
	public void i_enter_correct_password(String password) {
		actions.entersPassword(password);
		
	}

	@When("I enter correct date of birth {string}")
	public void i_enter_correct_date_of_birth(String birthdate) {
		actions.entersBirthDate(birthdate);
		
	}

	@Then("I should be able to sign up")
	public void i_should_be_able_to_sign_up() {
		Assert.assertEquals(actions.verifySignUpPageLink(), true);
		
	}

	
}
