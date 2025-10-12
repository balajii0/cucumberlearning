package Automation_learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listwebelements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();

		// Find all checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		System.out.println("Total checkboxes: " + checkboxes.size());

		// Loop through each checkbox and click if not selected
		for (WebElement checkbox : checkboxes) {
			if (!checkbox.isSelected()) {
				checkbox.click();
				System.out.println("Checkbox selected!");
			} else {
				System.out.println("Already selected");
			}
		}

		Thread.sleep(2000);
		driver.quit();
	}
}
