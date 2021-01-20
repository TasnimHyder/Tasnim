package webMd.PageElements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SignUpElements {


	@FindBy(id = "webmdHoverClose")
	public WebElement cookie;
	
	@FindBy(className = "reg-datepicker")
	public WebElement DOBBox;
	
	@FindBy(name="user_name")
	public WebElement emailbox;
	
	@FindBy(xpath="//*[@id=\"signupForm\"]/div/div/div[2]/div[1]/form/fieldset/div[2]/div[1]/input")
	public WebElement passwordbox;
	
	@FindBy(className="reg-datepicker")
	public WebElement BirthDate;
	
	@FindBy(xpath="//*[@id=\"signupForm\"]/div/div/div[2]/div[1]/form/fieldset/div[1]/div[2]")
	public WebElement errorMsgEmail;
	
	@FindBy(xpath="//*[@id=\"signupForm\"]/div/div/div[2]/div[1]/form/fieldset/div[2]/div[2]/span")
	public WebElement errorMsgPassw;
	
	//@FindBy(linkText="SIGN IN")
	//public WebElement SignInBtn;
	
	@FindBy(xpath="//a[@href='https://member.webmd.com/signin?appid=1&returl=https://www.webmd.com/']")
	public WebElement signInBtn;
	
	@FindAll(@FindBy (xpath="//a[@class='masthead-reg-signup']"))
	public WebElement signupLink;
	
	@FindBy(xpath="//*[@id=\"masthead\"]/div[1]/div[1]/div[3]/div[2]/div/ul/li[1]/span[1]/a")
	public WebElement profile;
	
	public static String email = "dragonwarriorstt@gmail.com";
	public static String password = "talentech123";
	public static String birthdate = "12.23.1992";
	
	
	
}

	
