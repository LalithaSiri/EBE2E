package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	protected By FormLabel =By.xpath("//form[@aria-label='Sign in with your email address']");
	protected By Email= By.xpath("//input[@id='email']");
	protected By Password= By.xpath("//input[@id='password']");
	protected By Submit= By.xpath("//button[@id='next']");
	protected By forgotPassword = By.id("forgotPassword");
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public String getLoginFormLabel() {
		return driver.findElement(Email).getText();
	}
	
	public void enterUserName(String email) {
		
		driver.findElement(Email) .sendKeys(email);
				
	}
	
	public void enterPassWord(String password) {
		driver.findElement(Password).sendKeys(password);
			
	}
	
	public void clickSignin() {
		driver.findElement(Submit).click();
	}
	
	public boolean isForgotLinkPresent() {
		return driver.findElement(forgotPassword).isDisplayed();
	}

	public void wait_for_page_to_Load(int i) throws InterruptedException {
		Thread.sleep(i);
	}

}
