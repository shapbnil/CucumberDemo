package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import utility.Common;

public class HomePage {

	By valid= By.xpath("//*[@class='_2aUbKa']");
	
	public void validatePage(WebDriver driver) throws InterruptedException {
		
		String title=driver.getTitle();
        System.out.println("current page Title"+"  " + title);
        
        Common co=new Common();
        String output=co.getText(driver, valid);
        
        Thread.sleep(3000);
      
        Assert.assertEquals("Ratnam",output);
    	    }
 	    }

