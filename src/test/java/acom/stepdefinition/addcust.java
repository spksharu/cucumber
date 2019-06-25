package acom.stepdefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addcust {
	static WebDriver driver;
	
	@Given("User was in telecom homepage")
	public void user_was_in_telecom_homepage() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sivapriya\\eclipse-workspace\\online\\lib\\chromedriver.exe");
		   driver= new ChromeDriver();
		    driver.get("https://demo.guru99.com/telecom/");
	}

	@Given("user clicking on add customer")
	public void user_clicking_on_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("user was filling all the details")
	public void user_was_filling_all_the_details(io.cucumber.datatable.DataTable cust) {
		Map<String, String> smap= cust.asMap(String.class, String.class);
		System.out.println(smap);
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(smap.get("Fname"));
	    driver.findElement(By.id("lname")).sendKeys(smap.get("lname"));
	    driver.findElement(By.id("email")).sendKeys(smap.get("mail"));
	    driver.findElement(By.name("addr")).sendKeys(smap.get("address"));
	    driver.findElement(By.name("telephoneno")).sendKeys(smap.get("mobile"));
	    
	}

	@When("user clicking on submit button")
	public void user_clicking_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should get the customer id")
	public void user_should_get_the_customer_id() {
		driver.findElement(By.xpath("(//td[@align='center'])[2]"));

	}



}
