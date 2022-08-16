package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageobjectes.LoginPage;


@SuppressWarnings("deprecation")
public class Steps {
	public WebDriver driver;//gobal variable
	public LoginPage lp;//gobal variable

@Given("User Lunch Chrome Broswer")
public void user_Lunch_Chrome_Broswer()  {
  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
  driver=new ChromeDriver();//driver alse we need to initate
	lp=new LoginPage(driver);//driver is a patemet //we need to initate loginpage//lp object we can acess the the loginpage
}

@When("User Opens {string}")
public void user_Opens_URL(String url)  {
    driver.get(url);
}

@When("User enters Email as {string} and Password as {string}")
public void user_enters_Email_as_and_Password_as(String email,String password)  {
	  lp.setUserName(email);//call methods in loginpade
	  lp.setPassword(password);//call the methods in loginpage
}

@When("Click on Login")
public void click_on_Login(){
	lp.btnLogin();
}

@Then("Page Tittle Should be {string}")
public void page_Tittle_Should_be(String title)  {
   if(driver.getPageSource().contains("login was unsucessfully")) {
	   driver.close();
	   Assert.assertTrue(false);
   }
	   else {
		  Assert.assertEquals(title, driver.getTitle());
		   }
}

@When("User Click on Logout link")
public void user_Click_on_Logout_link() throws InterruptedException{
    lp.clickLogout();
    Thread.sleep(3000);
}

@Then("Close the broswer")
public void close_the_broswer()  {
	  driver.quit();
}


}
