package locator;

import org.junit.Assert;
import org.openqa.selenium.By;

import Utility.WebDriverAction;

public class LoginPageLocator extends WebDriverAction {

	private By login=By.xpath("//a[@href='/login']");
	private By userName = By.name("email");
	private By passWord = By.name("password");
	private By loginButton=By.xpath("//button[@type=\"submit\"]");
	//private By invalidEmailErrorMessage = By.id("username-note");


	public void verifyFeatures(By login) {
		Assert.assertTrue(waitUntilVisibilityOfElement(login).isDisplayed());
	}
	
	public void enterUsername(String username)
	{
		waitUntilVisibilityOfElement(userName).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		waitUntilVisibilityOfElement(passWord).sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		waitUntilElementToBeClickable(loginButton).click();
	}
//	public void verifyInvalidEmailMessage()
	//{
	//	Assert.assertTrue(waitUntilVisibilityOfElement(invalidEmailErrorMessage).isDisplayed());
//	}
}
