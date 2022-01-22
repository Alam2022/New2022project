package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.Dell_price_POM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dell_price_StepsDefs {
	
	WebDriver driver;
	
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32 (2)\\chromedriver.exe");
			  driver = new ChromeDriver(); // paired value and key (the browser driver: eg. webdriver.chrome.driver and value C:\\Program Files...)
			  driver.get("https://www.dell.com/en-us");// string value in parenthesis and semicolone
			  
			  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			     
		      //how to maximize the browser
			  driver.manage().window().maximize();
	}

	@When("^user go to deals to laptop deals and click on for home to see laptop deals$")
	public void user_go_to_deals_to_laptop_deals_and_click_on_for_home_to_see_laptop_deals() throws Throwable {
		Actions act =new Actions (driver);
		Dell_price_POM obj =new Dell_price_POM(driver);
		act.moveToElement(obj.Act_Deals()).build().perform();
		obj.Act_Deals().click();
		WebDriverWait wait=new WebDriverWait(driver, 30);	
	}

	@When("^user click on sortby relevance and select lowest pricee from dropdown$")
	public void user_click_on_sortby_relevance_and_select_lowest_pricee_from_dropdown() throws Throwable {
		Actions act =new Actions (driver);
		Dell_price_POM ld=new Dell_price_POM(driver);
		act.moveToElement(ld.laptop_deals()).build().perform();
		ld.laptop_deals().click();
		//WebDriverWait wait=new WebDriverWait(driver, 30);	
	
		Dell_price_POM fh =new Dell_price_POM(driver);
		act.moveToElement(fh.Forhome()).build().perform();    //action object.moveToElement(object POM.method POM.build().perform();
		fh.Forhome().click();
	
		
		Dell_price_POM sb=new Dell_price_POM (driver);
		Select dropdown=new Select (sb.select_sortby());
		
		dropdown.selectByVisibleText("Lowest Price");
	}
	
	

	@Then("^user will be able to see low price laptops$")
	public void user_will_be_able_to_see_low_price_laptops() throws Throwable {
		
		//WebDriverWait wait=new WebDriverWait(driver, 30);	 
	}


}
