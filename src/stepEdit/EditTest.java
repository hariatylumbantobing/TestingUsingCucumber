package stepEdit;

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

public class EditTest {

	WebDriver driver;
	
	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
		  
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@When("^I goes to the specified link$")
	public void I_goes_to_the_specified_link() throws Throwable {
		driver.get("http://automationpractice.com/index.php?id_product=1&controller=product#/size-s/color-orange");
	}

	@And("^I change the value of the quantity \"([^\"]*)\"$")
	public void I_change_the_value_of_the_quantity(String arg1) throws Throwable {
		driver.findElement(By.id("quantity_wanted")).clear();
		driver.findElement(By.id("quantity_wanted")).sendKeys(arg1);
	}

	@And("^I press Add to cart$")
	public void I_press_Add_to_cart() throws Throwable {
		driver.findElement(By.cssSelector("button.exclusive > span:nth-child(1)")).click();
	}

	@Then("^I get the value I wanted to cart$")
	public void I_get_the_value_I_wanted_to_cart() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		if(driver.findElements(By.cssSelector(".fancybox-item")).size() != 0) {
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".fancybox-item")));
			element.click();
		}else {
			WebElement cross = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cross")));			
			cross.click();
		}
	}
	
}
