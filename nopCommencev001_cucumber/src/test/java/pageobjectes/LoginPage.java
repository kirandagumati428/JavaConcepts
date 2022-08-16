package pageobjectes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this );
	}
	
	@FindBy(id="Email")
	WebElement txtemail;
	
	@FindBy(id ="Password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement btnLogin;
	
	@FindBy(li='Logout']")
	WebElement clickLogout;
	
	
	public void setUserName(String uname) {
		txtemail.clear();
		txtemail.sendKeys(uname);
	}

	public void setPassword(String upassword) {
		txtpassword.clear();
		txtpassword.sendKeys(upassword);
	}
	public void btnLogin() {
		btnLogin.click();
	}

	public void clickLogout() {
		clickLogout.click();
	}
	
		
	}
	
	
	
	

