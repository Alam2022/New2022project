package com.nexttechITC.PageObjectModel;

import java.lang.reflect.Method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hpexplore {
	WebDriver driver;
	
	public hpexplore(WebDriver driver) throws InterruptedException {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	Thread.sleep(10000);
	}
	

	@FindBy(xpath="//*[@id=\"menuitemOne_tab\"]/span[1]")
	
      WebElement acthpexplore;
	////*[@id="onetrust-accept-btn-handler"]
	@FindBy(xpath="/html/body/script[1]")
	WebElement clicklaptops;
	
	
	public WebElement act_hpexplore(){
	return acthpexplore;
	}
		
	public WebElement click_laptop() {
	return clicklaptops;

}

	
	}
	
	
	
	
	
	
	
	
	

