package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	public WebDriver getWebDriverSession()
	{
		WebDriver driver=null;
		
		String browserName = AppProperties.getProperty("browser","src/test/resources/test.properties");
		try {
			
		
		if(browserName !=null)
		{
			if(browserName.equalsIgnoreCase("chrom"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("Firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("Edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			else
			{
				Logs.getLog().getLogger().info("Invalid BrowserName : "+browserName);
			}
		}
		}catch(Exception e)
		{
			Logs.getLog().getLogger().info("Invalid BrowserName :"+browserName);
		}
		Logs.getLog().getLogger().info("GetWebDriverSession is Sucess");
		return driver;
	}
	

}
