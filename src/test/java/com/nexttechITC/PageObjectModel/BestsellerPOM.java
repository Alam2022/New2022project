package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestsellerPOM {
WebDriver driver;

public BestsellerPOM(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}


@FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[1]")
	  WebElement click_bestseller;


@FindBy(xpath="//a[@href=\"/gp/new-releases/?ref_=nav_cs_newreleases\"]")
WebElement Click_Newrelease;

public WebElement bestseller(){
		return click_bestseller;
}
		
		public WebElement Newrelease(){
			return Click_Newrelease;
		}
		
		
		   

}
