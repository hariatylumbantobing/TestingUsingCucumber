package stepWishList;

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

public class WishListTest {
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

	@And("^I click logo$")
	public void I_click_logo() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement header = wait.until(ExpectedConditions.elementToBeClickable(By.id("header_logo")));
		header.click();
	}

	@And("^I click more on a dress$")
	public void I_click_more_on_a_dress() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement more = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#homefeatured > li:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > a:nth-child(2) > span:nth-child(1)")));
		more.click();
	}

	@Then("^then I click add to wishlist and get message$")
	public void then_I_click_add_to_wishlist_and_get_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement wishlist = wait.until(ExpectedConditions.elementToBeClickable(By.id("wishlist_button")));
		wishlist.click();
	}
}
