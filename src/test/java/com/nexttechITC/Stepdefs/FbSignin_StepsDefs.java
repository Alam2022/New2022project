package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageObjectModel.FbSignup_POM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbSignin_StepsDefs {
	WebDriver driver;
	
	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		System.setProperty("webdriver chrome.driver", "C:\\chromedriver_win32 (2).chrome.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");
	}

	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		FbSignup_POM se1=new FbSignup_POM (driver);
		Select dropdown =new Select (se1.click_month);
													//dropdown.selectByValue("6");
		dropdown.selectByIndex(5);
		
		Select dropdown1 =new Select (se1.click_day);
		dropdown1.selectByValue("6");
		
		
		Select dropdown2= new Select (se1.click_year);
		dropdown2.selectByVisibleText("2000");
	}
		
		
	

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
	    
	}


}
