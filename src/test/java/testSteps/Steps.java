package testSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps {
	public ChromeDriver driver;
	@Given("Open the browser")
	public void openTheBrowser() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver74.exe");
		driver = new ChromeDriver();
	}

	@Given("Maximize the browser")
	public void maximizeTheBrowser() {
	   driver.manage().window().maximize();
	}

	@Given("Set Timeouts")
	public void setTimeOuts() {
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Given("Open the URL")
	public void openTheURL() {
	   driver.get("https://www.facebook.com/");
	}

	@Given("Provide username as (.*)")
	public void provideUsername(String uname) {
		driver.findElementById("email").sendKeys(uname);
	  
	}

	@Given("Provide password as (.*)") 
	public void providePassword(String pwd) {
	   driver.findElementById("pass").sendKeys(pwd);
	}

	@Given("Click login")
	public void clickLogin() {
	   driver.findElementById("loginbutton").click();
	}

	@Then("Verify sucessful login")
	public void verifySucessfulLogin()  {
	 driver.getTitle();

	    
	}

	@But("Verify Unsucessful login")
	public void verifyUnsucessfulLogin() {
		 String title = driver.getTitle();
		    if(title.contains("Log in"))
		    	System.out.println("Unsucessful Login");
	   
	}
	
}
