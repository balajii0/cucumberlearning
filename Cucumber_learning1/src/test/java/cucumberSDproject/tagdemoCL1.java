package cucumberSDproject;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;

public class tagdemoCL1 {

	ChromeDriver driver;

	@Given("this is Scenario1")
	public void this_is_scenario1() {
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("User is on login page");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Given("this is Scenario2")
	public void this_is_scenario2() {
	}

	@Given("this is Scenario3")
	public void this_is_scenario3() {
	}
}
