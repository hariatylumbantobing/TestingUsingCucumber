package stepCheckout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutTest {

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
	public void I_enter_username_and_password_and_login(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("passwd")).sendKeys(arg2);	
		driver.findElement(By.cssSelector("#SubmitLogin > span:nth-child(1)")).click();
	}

	@And("^I click home logo$")
	public void I_click_home_logo() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement header = wait.until(ExpectedConditions.elementToBeClickable(By.id("header_logo")));
		header.click();
	}

	@And("^I add product and directly go to checkout page$")
	public void I_add_product_and_directly_go_to_checkout_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement addcart = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".hovered > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > a:nth-child(1) > span:nth-child(1)")));
		addcart.click();
		WebElement proceed = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button-medium > span:nth-child(1)")));
		proceed.click();	
	}

	@And("^I proceed to checkout and agree to terms and agreement$")
	public void I_proceed_to_checout_and_agree_to_terms_and_agreement() throws Throwable {
	    driver.findElement(By.cssSelector(".standard-checkout > span:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("button.button:nth-child(4) > span:nth-child(1)")).click();
	    driver.findElement(By.id("cgv")).click();
	    driver.findElement(By.cssSelector("button.button:nth-child(4) > span:nth-child(1)")).click();
	}

	@And("^I select to pay using bank wire$")
	public void I_select_to_pay_using_bank_wire() throws Throwable {
		driver.findElement(By.className("bankwire")).click();
	}

	@Then("^I will confirm my order$")
	public void I_will_confirm_my_order() throws Throwable {
		driver.findElement(By.cssSelector("button.button-medium > span:nth-child(1)")).click();
	}
	
}
