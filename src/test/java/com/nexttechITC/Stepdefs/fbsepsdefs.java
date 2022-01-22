package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.FB_loginPageOModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbsepsdefs {
	WebDriver driver;
	@Given("^User visits facebook homepage$")
	public void user_visits_facebook_homepage() throws Throwable {
		System.setProperty("webdriver chrome.driver", "C:\\chromedriver_win32 (2).chrome.exe");
	driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	Thread.sleep(10000);
	}
	
	@When("^User inputs user \"([^\"]*)\" and \"([^\"]*)\" and click on login button$")
	public void user_inputs_user_and_and_click_on_login_button(String arg1, String arg2) throws Throwable {
FB_loginPageOModel usrID=new FB_loginPageOModel(driver);
				usrID.user_ID().sendKeys(arg1);
			WebDriverWait wait=new WebDriverWait(driver, 20);
				usrID.pass_word().sendKeys(arg2);
			
	}

	/*@When("^User inputs user alam\\.anft@gmail\\.com and (\\d+) and click on login button$")
	public void user_inputs_user_alam_anft_gmail_com_and_and_click_on_login_button(int arg1) throws Throwable {
FB_loginPageOModel usrID=new FB_loginPageOModel(driver);
		
		usrID.user_ID().sendKeys(arg1);    
	}
*/
	@Then("^User will be able to login to facebook$")
	public void user_will_be_able_to_login_to_facebook() throws Throwable {
	    
	}


}
