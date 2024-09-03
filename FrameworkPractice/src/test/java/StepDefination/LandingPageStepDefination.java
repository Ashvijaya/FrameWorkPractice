package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import locator.LandingPageLocator;

public class LandingPageStepDefination {
LandingPageLocator landingPage = new LandingPageLocator();
	
	@Given("^I am on the landing page$")
	public void verifyLandingPage() {
		landingPage.verifyLandingPage();
	}
	
	@Then("^I see the features called (.*)$")
	public void verifyFeaturesOnLandingPage(String featureName) {
		landingPage.verifyFeatures(featureName);
	}
	
	
}
