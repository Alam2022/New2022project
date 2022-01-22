package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.hpexplore;
import com.nexttechITC.PageObjectModel.popupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hp_explore {
	
	
	WebDriver driver;
	@Given("^user visits Hp homepage$")
	
	
	public void user_visits_Hp_homepage() throws Throwable {
		
		System.setProperty("webdriver chrome.driver", "C:\\chromedriver_win32 (2).chrome.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.hp.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//WebDriverWait wait=new WebDriverWait(WebDriverReference, TimeOut)
	  //Thread.sleep(20000); 
	}
	
	@When("^user go to  Explore$")
	public void user_go_to_Explore() throws Throwable {
	  
		
	/*popupPOM p= new popupPOM(driver);
		
		 if(p.getpopupsize()>0)
		 {
		 p.getpopup().click();
		 }
		*/
		
		//driver.switchTo().alert().accept();
	//Thread.sleep(5000);	 
		//hpexplore clkexplore=new hpexplore(driver);
		//clkexplore.act_hpexplore().click();
		
	}

	@When("^User click to Laptops$")
	public void user_click_to_Laptops() throws Throwable {
	 Actions act=new Actions(driver); 
	 hpexplore obj=new hpexplore(driver);
	 act.moveToElement(obj.act_hpexplore()).build().perform();;
	//WebDriverWait wait=new WebDriverWait(driver, 20);
	 
	 
	}

	@Then("^user able to see lapop computers$")
	public void user_able_to_see_lapop_computers() throws Throwable {
		hpexplore clk=new hpexplore(driver);
		clk.click_laptop();
	
	}


}
