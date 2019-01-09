package com.amazon.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.amazon.commondata.CommonData;

public class BaseClass {
	public static WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(@Optional String browser) {
//		if (browser.toLowerCase().equals(CommonData.CHROME)) {
			System.setProperty("webdriver.chrome.driver", CommonData.chromeDriverPath);
			driver = new ChromeDriver();
//		} else if (browser.toLowerCase().equals(CommonData.FIREFOX)) {
//			System.setProperty("webdriver.gecko.driver", CommonData.firfoxDriverPath);
//			driver = new FirefoxDriver();
//		} else if (browser.toLowerCase().equals(CommonData.IE)) {
//			System.setProperty("webdriver.ie.driver",CommonData.IEDRIVERPATH);
//			driver = new InternetExplorerDriver();
//		} else {
//			Assert.fail("No browser is matching. Please verify the browser");
//		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
