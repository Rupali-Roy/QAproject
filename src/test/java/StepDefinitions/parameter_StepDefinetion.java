/*package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class parameter_StepDefinetion {
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
	@When("^user enters \"(.*)\" and \"(.*)\"$")
	public void validCredentials(String user,String pass) {
		driver.findElement(By.name("userName")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("submit")).click();
	}
	/*@Then("user should be able to login page")
	public void homePage() {
		driver.close();
		
	}*/
	/*@When("user enters Invalid credentials")
	public void InvalidCredentials() {
		driver.findElement(By.name("userName")).sendKeys("1");
		driver.findElement(By.name("password")).sendKeys("Ru");
		driver.findElement(By.name("submit")).click();
	}

@Then("user should be able to login page")
public void homePage() {
	driver.close();
}
	@Then("user should not be able to login page")
	public void should_not_homePage() {
		WebElement ele=driver.findElement(By.tagName("span"));
		System.out.println(ele.getText());
		driver.close();
		
	}


}*/



