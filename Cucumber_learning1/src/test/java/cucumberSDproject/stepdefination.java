package cucumberSDproject;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefination {

	ChromeDriver driver;

	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("User is on login page");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters password")
	public void user_enters_password() {

	}

	@And("click on login button")
	public void click_on_login_button() {

	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {

	}

}
