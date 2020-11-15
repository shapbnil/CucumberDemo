package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Common;

public class LoginPage extends Common{

	//WebDriver driver;
	By txt_username =By.xpath("//*[@class='_2zrpKA _1dBPDZ']");
	By txt_PWD= By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']");
	By btn_Submit= By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']");
	
	
	
	public void performLogin(WebDriver driver,String userName,String pwd) throws InterruptedException {
		enterText(driver, txt_username, userName);
		enterText(driver, txt_PWD, pwd);
		 Thread.sleep(3000);
		clickObj(driver, btn_Submit);
	}
}
