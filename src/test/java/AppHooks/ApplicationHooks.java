package AppHooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import com.qa.factory.DriverFactory1;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	
	protected LoginPage loginPage;
private DriverFactory driverFactory= new DriverFactory();
private WebDriver driver;
//private ConfigReader configReader;
Properties prop;
@Before(order=0)
public void getProperty() throws IOException
{
	
	//configReader = new ConfigReader();
	prop=driverFactory.initProp();
	
	}
@Before(order=1)
public void launchBrowser() throws IOException


{
	
	
	//driverFactory= new DriverFactory();
		
	//prop=driverFactory.initProp();
	//driverFactory.initDriver(prop);
		
		driver= driverFactory.initDriver(prop);
		loginPage=new LoginPage(driver);
	
		/*
		 * String browserName= prop.getProperty("browser"); driverFactory = new
		 * DriverFactory1(); driver= driverFactory.init_diver(browserName);
		 */
	
}

@After(order=0)
public void quitBrowser(Scenario scenario) {	
	if(scenario.isFailed())
	{
		String screenshotName= scenario.getName().replaceAll(" ", "_");
		byte [] sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", screenshotName);
		
	}
//	driver.quit();
}
}
