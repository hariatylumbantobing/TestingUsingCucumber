package stepSendToFriend;

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

public class SendToFriendTest {
	
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

	@And("^then I click send to a friend$")
	public void then_I_click_send_to_a_friend() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement sendtofriend = wait.until(ExpectedConditions.elementToBeClickable(By.id("send_friend_button")));
		sendtofriend.click();
	}

	@Then("^I fill the form and send the catalog to friend$")
	public void I_fill_the_form_and_send_the_catalog_to_friend() throws Throwable {
	    driver.findElement(By.id("friend_name")).sendKeys("xxxuhsuh");
	    driver.findElement(By.id("friend_email")).sendKeys("xxuhsuh@okeoke.com");
	    driver.findElement(By.id("sendEmail")).click();
	}
}
