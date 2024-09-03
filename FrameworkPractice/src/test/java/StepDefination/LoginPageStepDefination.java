package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import locator.LandingPageLocator;
import locator.LoginPageLocator;

public class LoginPageStepDefination {

	LoginPageLocator LoginPage = new LoginPageLocator();
	LandingPageLocator landingPage = new LandingPageLocator();
	
	
	@Given ("^I click Login$")
	public void verifyFeaturesOnLandingPage() {
		landingPage.clickLoginButton();
	}
	@And("^I enter username as (.*)$")
	public void enteruserName(String username) {
		LoginPage.enterUsername(username);
		
	}
	@And("^I enter password as (.*)$")
	public void enterPassword(String username) {
		LoginPage.enterPassword(username);
	}
	@And("^I click on login button$")
	public void clickLoginButton() {
	LoginPage.clickLoginButton();
		
	}
	//@Then("^I verify that invalid email address error message is shown to the user$")
	//public void validateInvalidEmailErrorMessage() {
//		LoginPage.verifyInvalidEmailMessage();
	//}
	
}
