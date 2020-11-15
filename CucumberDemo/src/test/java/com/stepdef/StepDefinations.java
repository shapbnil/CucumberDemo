 package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;
import utility.Common;

public class StepDefinations {

	WebDriver driver;
	 Common co=new Common();
	 
	 @Given("^launch browser$")
	    public void launch_browser() throws Throwable {
		 
		 driver=co.launchBrowser();
	
	    }
	 
	@Given("^Launch browser and navigurl$")
    public void launch_browser_and_navigurl() throws Throwable {
		co.openUrl(driver);
    }

    @When("^Enter user name and password$")
    public void enter_user_name_and_password() throws Throwable {
        
    	
    	LoginPage lp=new LoginPage();
    	lp.performLogin(driver, "rathnam.b7@gmail.com", "Venkat@1989");
    	
    }

    @Then("^validate login screen$")
    public void validate_login_screen() throws Throwable {

    	HomePage hp=new HomePage();
    	hp.validatePage(driver);
    	
    	
    	
      
    }
    @Then("close browser")
    public void close_browser() {
       co.tearDown(driver);
    }
}
