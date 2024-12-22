package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logintest {
	WebDriver driver ;
	
	@Given("Navigate to WebSite")
	public void navigate_to_WebSite() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhishek\\OneDrive\\Desktop\\Selenium Drivers\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
	}

	@When("Entering Username and Password")
	public void entering_Username_and_Password() {
	  driver.findElement(By.id("username")).sendKeys("user@phptravels.com");
	  driver.findElement(By.id("password")).sendKeys("demouser");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() {
	   String expectedURL ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	   String acutalURL = driver.getCurrentUrl();
	   if (acutalURL.equals(expectedURL)) {
		   System.out.println("Login Successfully");
	   }
	   else {
		   System.out.println("Login UnSuccessfully");
	   }
	}
	
}
