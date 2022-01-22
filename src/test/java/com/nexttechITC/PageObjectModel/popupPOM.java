package com.nexttechITC.PageObjectModel;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class popupPOM {
	WebDriver driver;
	
	public popupPOM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	}
	
	/*By popup=By.xpath("//*[@id=\"menuitemOne_tab\"]/span[1]");
	
  
	
	public int getpopupsize(){
	return driver.findElements(popup).size();
	}
	
	public WebElement getpopup(){
	return driver.findElement(popup);
	}
	*/
	
	
	@FindBy(xpath="//*[@id=\"menuitemOne_tab\"]/span[1]")
	
      WebElement acthpexplore;
	
	public WebElement act_hpexplore(){
	return acthpexplore;
	}
	
	
	
	
	@FindBy(xpath="//*[@id=\"menuitemOne_tab_drop\"]/div[1]/ul/div[2]/div[2]/ul/a[1]/div/div/li/label")
	
	WebElement click_laptop;
	
	public WebElement clicklaptop() {
		return acthpexplore;
	}
	}
	
	
	
	
	
	
	

