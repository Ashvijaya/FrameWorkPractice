package Utility;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class baseClass {
	
	
	WebDriverFactory webDriverFactory= new WebDriverFactory();
	
	//Start When test case Start
	@Before
	public void launchSession() throws IOException
	{
		DriverFactory.getInstance().setWebDriver(webDriverFactory.getWebDriverSession());
		DriverFactory.getInstance().getWebDriver().manage().window().maximize();
		DriverFactory.getInstance().getWebDriver().get(AppProperties.getProperty("siteUrl","C:\\Users\\Hello\\eclipse-workspace\\FrameworkPractice\\src\\test\\resources\\test.properties"));
		
		Logs.getLog().getLogger().info("launchSession is success");
	}
	
	//Start When test case end
	@After
	public void closeSession(Scenario scenario )
	{
				
		if(scenario.isFailed())
		{
			WebDriver currentDriver=DriverFactory.getInstance().getWebDriver();
			
		byte[]	screanshot=((TakesScreenshot)currentDriver).getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(screanshot,"image/png",scenario.getName());
		
		Logs.getLog().getLogger().info("Sceenshort is Captured");
		}

		DriverFactory.getInstance().closeBrowser();
	Logs.getLog().getLogger().info("closeSession is Sucess");
	}


}
