package com.stepdef;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utility.Common;

public class Step3 {
	
	WebDriver driver=null;
	Common co=new Common();
	
	@Given("user is already in login Page")
	public void user_is_already_in_login_Page() {
	    
	    driver= co.launchBrowser();
	    
	    co.openUrl(driver);
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) throws InterruptedException {
		LoginPage lp=new LoginPage();
		lp.performLogin(driver, string, string2);
	}

	@Then("After login close the browser")
	public void after_login_close_the_browser() {
		 
	    co.tearDown(driver);
	    

	}
}
