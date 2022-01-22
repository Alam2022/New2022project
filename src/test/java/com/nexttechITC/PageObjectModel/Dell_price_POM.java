package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dell_price_POM {

WebDriver driver;
	
	
	public Dell_price_POM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/a/span")
	 WebElement Deals;
	
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/ul/li[3]/a")
	WebElement Laptopdeals;
	
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/ul/li[3]/ul/li[3]/a")
	WebElement Forhome;
	
	
	
	
	@FindBy(xpath="/html/body/main/div[1]/section[2]/div[1]/div[2]/div[2]/select")
	WebElement selectsb;
	
	public WebElement Act_Deals() {
		return Deals;
	
	}
	
	public WebElement laptop_deals (){
		return Laptopdeals;
		
	}
	public WebElement Forhome (){
		return Forhome;
	}
	public WebElement select_sortby (){
		return selectsb;
		
}
	
	
}