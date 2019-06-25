package acom.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addcustomer {
	static WebDriver driver;
	
	@Given("User is in telecom homepage")
	public void user_is_in_telecom_homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sivapriya\\eclipse-workspace\\online\\lib\\chromedriver.exe");
		   driver= new ChromeDriver();
		    driver.get("https://demo.guru99.com/telecom/");
	    
	}

	@Given("user click on add customer")
	public void user_click_on_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("user is filling the details")
	public void user_is_filling_the_details() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys("sivapriya");
	    driver.findElement(By.id("lname")).sendKeys("botla");
	    driver.findElement(By.id("email")).sendKeys("sivapriya3793@gmail.com");
	    driver.findElement(By.name("addr")).sendKeys("nlr");
	    driver.findElement(By.name("telephoneno")).sendKeys("12345678");
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("user should get customer id")
	public void user_should_get_customer_id() {
		driver.findElement(By.xpath("(//td[@align='center'])[2]"));
	   
	}


}
