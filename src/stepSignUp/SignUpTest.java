package stepSignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpTest {

	WebDriver driver;
	
	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() {
		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
		  
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@When("^I click sign in button$")
	public void I_click_sign_in_button() throws Throwable {
		driver.findElement(By.cssSelector(".login")).click();
	}

	@And("^I fill email \"([^\"]*)\" to register new account$")
	public void I_fill_email_to_register_new_account(String arg1) throws Throwable {
		driver.findElement(By.id("email_create")).sendKeys(arg1);
	}

	@And("^I click the create an account button$")
	public void I_click_the_create_an_account_button() throws Throwable {
		driver.findElement(By.id("SubmitCreate")).click();
	}

	@And("^I click the gender$")
	public void I_click_the_gender() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement selectGender = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
		selectGender.click();
	}

	@And("^I fill \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_fill_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("customer_firstname")).sendKeys(arg1);
		driver.findElement(By.id("customer_lastname")).sendKeys(arg2);
	}

	@And("^Password \"([^\"]*)\"$")
	public void Password(String arg1) throws Throwable {
		driver.findElement(By.id("passwd")).sendKeys(arg1);
	}

	@And("^Choose all the dropdown$")
	public void Choose_all_the_dropdown() throws Throwable {
		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByValue("2");
		Select months = new Select(driver.findElement(By.id("months")));
		months.selectByValue("5");
		Select years = new Select(driver.findElement(By.id("years")));
		years.selectByValue("2001");
	}

	@And("^I fill the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_fill_the_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("firstname")).sendKeys("");
		driver.findElement(By.id("lastname")).sendKeys("");
	}

	@And("^I fill \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and select \"([^\"]*)\"$")
	public void I_fill_and_select(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		driver.findElement(By.id("company")).sendKeys(arg1);
		driver.findElement(By.id("address1")).sendKeys(arg2);
		driver.findElement(By.id("city")).sendKeys(arg3);
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByValue(arg4);
	}

	@And("^I fill \"([^\"]*)\"$")
	public void I_fill(String arg1) throws Throwable {
		driver.findElement(By.id("postcode")).sendKeys(arg1);
	}

	@And("^I register \"([^\"]*)\" and/or \"([^\"]*)\"$")
	public void I_register_and_or(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("phone")).sendKeys(arg1);
		driver.findElement(By.id("phone_mobile")).sendKeys(arg2);
	}

	@Then("^I get message")
	public void I_get_message() throws Throwable {
//		driver.findElement(By.id("submitAccount")).click();
	}

}
