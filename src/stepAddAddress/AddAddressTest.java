package stepAddAddress;
		
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

public class AddAddressTest {
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

	@And("^I enter username \"([^\"]*)\" and password \"([^\"]*)\" and login$")
	public void I_enter_username_and_password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("passwd")).sendKeys(arg2);
		driver.findElement(By.cssSelector("#SubmitLogin > span:nth-child(1)")).click();
	}

	@And("^click my addresses$")
	public void click_my_addresses() throws Throwable {
		driver.findElement(By.cssSelector("div.col-sm-6:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1) > span:nth-child(2)")).click();
	}

	@And("^click add a new address and fill the form$")
	public void click_add_a_new_address_and_fill_the_form() throws Throwable {
	    driver.findElement(By.cssSelector("a.button-medium:nth-child(1) > span:nth-child(1)")).click();
	    driver.findElement(By.id("address1")).sendKeys("ITDEL, SM RAJA");
	    driver.findElement(By.id("city")).sendKeys("Laguboti IT Del");
	    Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByValue("1");
	    driver.findElement(By.id("postcode")).sendKeys("20318");
		Select country = new Select(driver.findElement(By.id("id_country")));
		country.selectByValue("21");
	    driver.findElement(By.id("phone")).sendKeys("0614551710");
	    driver.findElement(By.id("alias")).sendKeys("My Campus");
	}

	@Then("^get notification$")
	public void get_notification() throws Throwable {
	    driver.findElement(By.id("submitAddress")).click();
	}


}
