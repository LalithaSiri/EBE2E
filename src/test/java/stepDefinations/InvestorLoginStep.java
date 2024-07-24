package stepDefinations;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertTrue;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import com.qa.factory.DriverFactory1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvestorLoginStep  {
	
	//Properties prop=new DriverFactory1().initProp();
	//WebDriver driver= new DriverFactory1().initDriver(prop);
	private LoginPage loginPage= new LoginPage( DriverFactory1.getDriver());
	String lable;
	
	
	
	@Given("user is on Investor Login page")
	public void user_is_on_investor_login_page() {
		DriverFactory1.getDriver().get("https://qa-sponsor.equitybrix.net/");
	}
	@Given("wait for page to load")
	public void wait_for_page_to_load()  {
	   
		try {
			loginPage.wait_for_page_to_Load(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		 lable= loginPage.getLoginFormLabel();
		
	}

	@Then("form lable should be {string}")
	public void form_lable_should_be(String expectedTile) {
		Assert.assertEquals(expectedTile, lable);
	}

	@Then("Forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.isForgotLinkPresent());
	}
	
	@When("enter username {string}")
	public void enter_username(String string) {
		loginPage.enterUserName(string);
		
	}

	@When("enter password {string}")
	public void enter_password(String string) {
		loginPage.enterPassWord(string);
	}

	@Then("click on Sign in button")
	public void click_on_sign_in_button() {
		loginPage.clickSignin();
	}



}
