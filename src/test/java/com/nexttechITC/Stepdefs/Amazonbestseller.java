package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.BestsellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonbestseller {
	WebDriver driver;

@Given("^user visits Amazon homepage$")
public void user_visits_Amazon_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver(); // paired value and key (the browser driver: eg. webdriver.chrome.driver and value C:\\Program Files...)
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.com/");// string value in parenthesis and semicolone
}

@When("^user clicks on Best seller$")
public void user_clicks_on_Best_seller() throws Throwable {
	BestsellerPOM bestsell=new BestsellerPOM(driver);
	bestsell.bestseller().click();
	bestsell.Newrelease().click();
}

@Then("^user should be able to redirect to the Best Seller Page$")
public void user_should_be_able_to_redirect_to_the_Best_Seller_Page() throws Throwable {
    
}
	
	


}
