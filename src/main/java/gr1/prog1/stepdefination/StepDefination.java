package gr1.prog1.stepdefination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {
		public WebDriver driver;
		
	@When("^click  on sign in link")
	public void click_on_sign_in_link() throws Throwable{
		System.out.println("closing driver");
		
		driver.close();

	}
	
	@Given("^navigate to utest url$")
	public void navigate_to_utest_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("navigate");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://google.com");

	}

}
