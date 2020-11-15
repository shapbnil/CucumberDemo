package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	WebDriver driver;
	String browser = "chrome";

	public WebDriver launchBrowser() {
		try {
			if (browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe");
				driver = new EdgeDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				System.out.println("Successfully lunch Browser");
			}

			
		} catch (Exception e) {
			System.out.println("failure to lunch Browser");
		}
		return driver;
	}

	public void openUrl(WebDriver driver) {

		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void enterText(WebDriver driver, By by, String text) {
		driver.findElement(by).sendKeys(text);
	}

	public void clickObj(WebDriver driver, By by) {
		driver.findElement(by).click();
	}

	public String getText(WebDriver driver, By by) {
		return driver.findElement(by).getText();
	}

	public void tearDown(WebDriver driver) {
		driver.close();
	}
}
