package stepChangePassword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangePasswordTest {
	WebDriver driver;
	
	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
		  
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@When("^I click sign in button$")
	public void I_click_sign_in_button() throws Throwable {
		driver.findElement(By.cssSelector(".login")).click();
	}

	@And("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void I_enter_username_and_password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("passwd")).sendKeys(arg2);	
		driver.findElement(By.cssSelector("#SubmitLogin > span:nth-child(1)")).click();
	}

	@And("^I click my personal information$")
	public void I_click_my_personal_information() throws Throwable {
		driver.findElement(By.cssSelector("div.col-sm-6:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1) > span:nth-child(2)")).click();
	}

	@And("^I fill my current password \"([^\"]*)\"$")
	public void I_fill_my_current_password(String arg1) throws Throwable {
	    driver.findElement(By.id("old_passwd")).sendKeys(arg1);
	}

	@And("^I fill my new password \"([^\"]*)\" and confimation \"([^\"]*)\" and click save$")
	public void I_fill_my_new_password_and_confimation_and_click_save(String arg1, String arg2) throws Throwable {
		   driver.findElement(By.id("passwd")).sendKeys(arg1);
		   driver.findElement(By.id("confirmation")).sendKeys(arg2);
		   driver.findElement(By.cssSelector("button.btn:nth-child(1) > span:nth-child(1)")).click();
	}

	@Then("^I get the confirmation if the password is changed$")
	public void I_get_the_confirmation_if_the_password_is_changed() throws Throwable {
	}
}
