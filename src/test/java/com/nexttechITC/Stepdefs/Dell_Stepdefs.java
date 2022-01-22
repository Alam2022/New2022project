package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.Dell_POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dell_Stepdefs {
	
	WebDriver driver;
	
	@Given("^User visit Dell homepage$")
	public void user_visit_Dell_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver = new ChromeDriver(); // paired value and key (the browser driver: eg. webdriver.chrome.driver and value C:\\Program Files...)
		  driver.get("https://www.dell.com/en-us");// string value in parenthesis and semicolone
		  
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		     
	      //how to maximize the browser
		  driver.manage().window().maximize();
	}

	@When("^when user click search box and Put \"([^\"]*)\"$")
	public void when_user_click_search_box_and_Put(String arg1) throws Throwable {
	 
		Dell_POM clksearch=new Dell_POM(driver);
		clksearch.Dellsearch().click();
		clksearch.Dellsearch().sendKeys(arg1);
		
	}

	@Then("^User will be able to see iphones$")
	public void user_will_be_able_to_see_iphones() throws Throwable {
	 
	}


}
