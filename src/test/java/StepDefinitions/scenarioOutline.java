package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenarioOutline {
	WebDriver driver;
	@Before
	public void before() {
		System.out.println("before");
	}
		@After
		public void after() {
			System.out.println("after");	
	}
	@Given("user is on the home page")
	public void url() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/login.php");
	}
	/*@When("^user enters \"(.*)\" and \"(.*)\"$")
	public void validCredentials(String user,String pass) {
		driver.findElement(By.name("userName")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("submit")).click();
	}*/
	@When("^user enters \"(.*)\" and \"(.*)\"$")
	public void validCredentials(String u1,String p1) {
		POM_PageFctory page=new POM_PageFctory(driver);
		page.logInPage(u1, p1);
	}
	@Then("user should be able to login page")
	public void homePage() {
		driver.close();
}
}