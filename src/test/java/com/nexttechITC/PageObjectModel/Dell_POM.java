package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dell_POM {
	
	WebDriver driver;
	
	public Dell_POM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	
	
@FindBy(id="mh-search-input")
WebElement Dell_search;



public WebElement Dellsearch() {
	return Dell_search;
}


}


