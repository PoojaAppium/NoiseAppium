package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {

	 AndroidDriver<WebElement> Driver ;
		 public LoginPage(AndroidDriver<WebElement> Driver) {
			 this.Driver=Driver;
		 }
		 
		By CheckBox = By.id("com.noisefit:id/checkbox");
		By AgreeContinue = By.id("com.noisefit:id/btnAgree");
		By TermConditionTitle = By.id("com.noisefit:id/textView3");
		By II_PageTitle = By.id("com.noisefit:id/tvPrivacy");
		By HelloForm = By.id("com.noisefit:id/hello_from_");
		By III_PageTitle = By.id("com.noisefit:id/textView16");
		By Email = By.id("com.noisefit:id/vEmail");
		By IV_PageTitle = By.id("com.noisefit:id/textView");
		By EmailTextBox = By.id("com.noisefit:id/etEmailId");
		By Continue = By.id( "com.noisefit:id/bContinue");
		By Password_Text = By.id("com.noisefit:id/etPassword");
		By V_PageTitle = By.id("com.noisefit:id/textView");
		By UsePassword = By.id("com.noisefit:id/btnUsePassword");
		By Deny = By.id(  "android:id/button2");
		By HomePageAdsSlider = By.id( "com.noisefit:id/ivSliderImage");
		By PairLater = By.id(  "com.noisefit:id/bPairLater");
		
		
		

		
public void ValidatePageTitle_I(String Title) throws InterruptedException{
	
	String ActualTitle = Driver.findElement(TermConditionTitle).getText();
			Assert.assertEquals(ActualTitle, Title);
			}

		
public void AcceptTermAndCondition() throws InterruptedException{		
	Driver.findElement(CheckBox).click();	
	}

public void Submit() throws InterruptedException{
	Driver.findElement(AgreeContinue).click();	
		 }

		
public void ValidatePageTitle_II(String Title) {
	String ActualTitle = Driver.findElement(HelloForm).getText();
	Assert.assertEquals(ActualTitle, Title);
}

public void ValidatePageTitle_III(String Title) {
	String ActualTitle = Driver.findElement(III_PageTitle).getText();
	Assert.assertEquals(ActualTitle, Title);
}

public void ValidatePageTitle_IV(String Title) {
	String ActualTitle = Driver.findElement(IV_PageTitle).getText();
	Assert.assertEquals(ActualTitle, Title);
}

public void ValidatePageTitle_V(String Title) {
	String ActualTitle = Driver.findElement(V_PageTitle).getText();
	Assert.assertEquals(ActualTitle, Title);
}
 
 public void Continue() {
	 Driver.findElement(Continue).click();
 }
 
 public void ChooseEmailOption() {
	 Driver.findElement(Email).click(); 
 }
 public void EnterEmail(String EmailID) {
	 Driver.findElement(EmailTextBox).sendKeys(EmailID);; 
 }

 public void UsePasswordButton() {
	 Driver.findElement(UsePassword).click(); 
 }
 
 public void EnterPassword(String EmailID) {
	 Driver.findElement(Password_Text).sendKeys(EmailID);; 
 }
 
 public void DenyPermission() {
	 Driver.findElement(Deny).click(); 
 }
 
 public void PairLater() {
	 Driver.findElement(PairLater).click(); 
 }
 
 public void HomePageAddSlider() {
	if( Driver.findElement(HomePageAdsSlider).isDisplayed()) {
		System.out.println("Reached To HomePage");
	}
	else {
	Assert.assertTrue(false);
	}
 }
 
 public void ValidateToast(String Message) {
	 WebDriverWait waitForToast = new WebDriverWait(Driver,25);
	 waitForToast.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Toast[1]")));
	 WebElement toastMessage = Driver.findElement(By.xpath("//android.widget.Toast[1]"));
	 String toaster = toastMessage.getAttribute(Message);
	 System.out.println(toaster);
 }
 
 public void EnterOnEmailTextField() {
	Driver.findElement(EmailTextBox).sendKeys(Keys.ENTER);
 }
 
}

	
	

