package locator;


import org.openqa.selenium.By;
import org.junit.Assert;
import Utility.WebDriverAction;

public class LandingPageLocator extends WebDriverAction{
	
	private By login=By.xpath("//a[@href='/login']");
	private By Create=By.xpath("//a[@href='/create']");
	private By Upload=By.xpath("//a[@href='/upload']");
	private By Artists=By.xpath("//a[@href='/artists']");
	
	public void clickLoginButton() {
		waitUntilElementToBeClickable(login).click();
	}

	
	public void verifyLandingPage() {
	Assert.assertEquals(getCurrentUrl(), "https://giphy.com/");
	}
	public void verifyFeatures(String featureName) {
		Assert.assertTrue(waitUntilVisibilityOfElement(getFeatureByName(featureName)).isDisplayed());
	}

	public By getFeatureByName(String featureName) {
  
		switch(featureName) {

		case "Login":
			return login;

		case "Create":
			return Create;

		case "Upload":
			return Upload;

		case "Artists":
			return Artists;
		default: return null;
		}

	}
	
}
