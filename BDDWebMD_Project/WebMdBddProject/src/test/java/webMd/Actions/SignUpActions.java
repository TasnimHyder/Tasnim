package webMd.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import webMd.PageElements.SignUpElements;
import webMd.Utilities.SetUpDrivers;

public class SignUpActions {

	SignUpElements signingUp;
	
	public SignUpActions() {
		this.signingUp = new SignUpElements();
		
		PageFactory.initElements(SetUpDrivers.chromeDriver, signingUp);
	}
	
	public void getWebMdHomePage () {
		SetUpDrivers.setUpChromeDriver();
		SetUpDrivers.chromeDriver.get("https://www.webmd.com/");
		SetUpDrivers.chromeDriver.manage().window().maximize();
	//	SetUpDrivers.chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	public void closingCookie() {
		signingUp.cookie.click();
		
	}
	
	public void clickSignIn() {
		signingUp.signInBtn.click();
		
	}
	
	public void clickSignUp() {
		signingUp.signupLink.click();
		
	}
	
	public boolean verifyHomePage() {
		boolean bool = false;
		
		System.out.println(SetUpDrivers.chromeDriver.getTitle());
		
		if(SetUpDrivers.chromeDriver.getTitle().contains("WebMd")) {
			bool = true;
			
		}
		return bool;
	
	}
		
	public void entersEmail(String email) {
		signingUp.emailbox.sendKeys(email);
	}
	
	public void entersPassword(String password) {
		signingUp.passwordbox.sendKeys(password);
	}
	
	public void entersBirthDate(String birthdate) {
		signingUp.DOBBox.sendKeys(birthdate);
	}
	
	public boolean verifyErrorMsg() {
		boolean bool = false;
		if(signingUp.errorMsgEmail.isDisplayed()) {
			bool = true;
		}
		return bool;
		
	}
	
	public boolean verifySignUpBtn() {
		boolean bool = false;
		if(signingUp.profile.isDisplayed()) {
			bool = true;
		}
		return bool;
	}
	
	public boolean verifySignUpPageLink() {
		boolean bool = false;
		if(SetUpDrivers.chromeDriver.getCurrentUrl().contains("https://member.webmd.com/signin?appid=1&returl=https://www.webmd.com/"))
			bool = true;
		return bool;
	}
	
}
