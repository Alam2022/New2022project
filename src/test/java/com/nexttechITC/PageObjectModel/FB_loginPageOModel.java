package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_loginPageOModel {

	WebDriver driver;
	public FB_loginPageOModel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath ="//*[@id=\"email\"]")
			WebElement UserID;
		

		@FindBy(xpath="//*[@id=\"pass\"]")
				WebElement pass;

public WebElement user_ID() {
	return UserID;
	
}
	
	public WebElement pass_word() {
		return pass;
	}
		
		
}
