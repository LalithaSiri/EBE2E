package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory1 {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public WebDriver init_driver(String browser) {

		System.out.println("Browser value" + browser);

		if (browser.equals("chrome")) {
			tlDriver.set(new ChromeDriver());
		}
		/*
		 * else if(browser.equals("edge")) {
		 * 
		 * WebDriverManager.edgedriver().setup(); tlDriver.set(new EdgeDriver());
		 * 
		 * } else if(browser.equals("firefox")) {
		 * 
		 * WebDriverManager.firefoxdriver().setup(); tlDriver.set(new FirefoxDriver());
		 * 
		 * }
		 */
		else {
			System.out.println("Please pass pass correct browser");
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();

		// return getDriver();
	}

	public static synchronized WebDriver getDriver() {

		return tlDriver.get();
	}
}
