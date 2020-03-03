package stepLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;
	
	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable{
		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
	  
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}
	
	@When("^I click sign in button$")
	public void I_click_sign_in_button() throws Throwable{
		driver.findElement(By.cssSelector(".login")).click();
	}
	
	@And("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void I_enter_valid_username_and_valid_password(String username, String password) throws Throwable{
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("passwd")).sendKeys(password);
	}
	
	@Then("^I get message$")
	public void I_get_message() throws Throwable{
		driver.findElement(By.cssSelector("#SubmitLogin > span:nth-child(1)")).click();
	}
}
