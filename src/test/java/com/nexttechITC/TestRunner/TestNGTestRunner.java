package com.nexttechITC.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestRunner {
	@CucumberOptions (
			   
			   features = {"Features"},
			   glue = {"com.nexttechITC.Stepdefs"}
			   
			   )
	// Test r class: extends to execute the code
//	Parent class helps to execute
	 //annotation cucumber options
	//it will hit testNG first.
	
	public class TestRunner extends AbstractTestNGCucumberTests{}
	
		
}
      // amazon search execute--->testNG first--->>test runner class----->>features are connected to Test Run Class ----Execute--come back test NG ---Amazon ------>
        //