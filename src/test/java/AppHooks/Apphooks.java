package AppHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory1;
import com.qa.util.ConfigReader;

import io.cucumber.java.Before;

public class Apphooks {
	
	private DriverFactory1 driverFactory1;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	
	@Before(order =0)
	public void getProperty()
	{
		configReader= new ConfigReader();
		prop=configReader.init_prop();
	}
	@Before(order=1)
	public void launchBrowser() {
		
		String browserName=prop.getProperty("browser");
		driverFactory1= new DriverFactory1();
		driverFactory1.init_driver(browserName);
		
		
		
	}

}
