package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class POM_PageFctory {
	

	

	
	 WebDriver driver;
	 
	 By user=By.name("userName");
	 By pass= By.name("password");
	 By sub= By.name("submit");
	 
	 public void logInPage(String u1, String p1) {
		 driver.findElement(user).sendKeys(u1);
		 driver.findElement(pass).sendKeys(p1);
		 driver.findElement(sub).click();
	 }
	 
	 public POM_PageFctory(WebDriver driver) {
		 this.driver=driver;
	 }
	 
	}

