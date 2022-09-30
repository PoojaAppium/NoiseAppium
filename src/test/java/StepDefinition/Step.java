package StepDefinition;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import POM.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step {
	
	public AndroidDriver<WebElement> Driver;
	 LoginPage LP;

	

	@Given("Application Launch")
	public void application_Launch() throws InterruptedException {
      LP = new LoginPage(Driver);
		
		try{		
			DesiredCapabilities DC = new DesiredCapabilities();
			DC.setCapability("PlatformVersion", "11");
			DC.setCapability("deviceName", "OnePlus Nord2 5G");
			DC.setCapability("UDID", "QOKNMJVCJFL7YPOF");
			DC.setCapability("platformName", "Android");
			DC.setCapability("appActivity", "com.noisefit.ui.SplashActivity");
			DC.setCapability("appPackage", "com.noisefit");
			DC.setCapability("automationName", "UiAutomator2");
			DC.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			DC.setCapability("noSign", true);
			DC.setCapability("autoGrantPermissions",true);
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			Driver = new AndroidDriver<WebElement>(url,DC);
			Driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS); 
			System.out.println("System Started");
			Thread.sleep(5000);
			}
			catch(Exception exe) {
				exe.printStackTrace();
			}	
		}
	

	@When("Accept Term & Condition")
	public void accept_Term_Condition() throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
		LP.AcceptTermAndCondition();
	}

	@And("Click On Submit")
	public void click_On_Submit() throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
	   LP.Submit();
		
	}
	@When("Application Open")
	public void application_Open() throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
	   System.out.println("App Launch");
	}

	
	@Then("Validate Page Title {string}")
	public void validate_Page_Title(String title) throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
		LP.ValidatePageTitle_I(title);
		
	}

//	@Then("Validate 2nd Page Title {string}")
//	public void validate_2nd_Page_Title(String string) throws InterruptedException {
//		Thread.sleep(2000);
//		 LP = new LoginPage(Driver);
//		LP.ValidatePageTitle_II(string);
//	}

	@When("Click on Continue")
	public void click_on_Continue() throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
	    LP.Continue();
	}

	@Then("Validate 3rd Page Title {string}")
	public void validate_3rd_Page_Title(String string) throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
		LP.ValidatePageTitle_III(string);
	}

	@When("Select Login as Email option")
	public void select_Login_as_Email_option() throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
	   LP.ChooseEmailOption();
	}

	@Then("Validate 4th Page Title {string}")
	public void validate_4th_Page_Title(String string) throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
		LP.ValidatePageTitle_IV(string);
	}

	@When("Enter Email ID {string}")
	public void enter_Email_ID(String string) throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
	   LP.EnterEmail(string);
	}

	@Then("Validate 5th Page Title {string}")
	public void validate_5th_Page_Title(String string) throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
		LP.ValidatePageTitle_IV(string);
	}

	@When("Click on Use Password button")
	public void click_on_Use_Password_button() throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
	    LP.UsePasswordButton();
	}

	@Then("Validate 6th Page Title {string}")
	public void validate_6th_Page_Title(String string) throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
		LP.ValidatePageTitle_IV(string);
	}

	@When("Enter Password {string}")
	public void enter_Password(String string) throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
	   LP.EnterPassword(string);
	}

	@And("Click On Continue")
	public void click_On_Continue() throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
	  LP.Continue();
	}

	@When("Deny BlueTooth")
	public void deny_BlueTooth() throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
	    LP.DenyPermission();
	}

	@When("Click on Pair Later button")
	public void click_on_Pair_Later_button() throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
	  LP.PairLater();
	}

	@Then("Validate Home Page by Slider Image")
	public void validate_Home_Page_by_Slider_Image() throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
	   LP.HomePageAddSlider();
	}

	@Then("Validate Toast message {string}")
	public void validate_Toast_message(String string) throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
	   LP.ValidateToast(string);
	}
	
	@When("Enter")
	public void enter() throws InterruptedException {
		Thread.sleep(1000);
		 LP = new LoginPage(Driver);
	    LP.EnterOnEmailTextField();
		
	}




	
	
}
