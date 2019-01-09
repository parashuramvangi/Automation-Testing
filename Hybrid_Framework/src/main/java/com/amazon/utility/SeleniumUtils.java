package com.amazon.utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtils {

	public void captureScreenshot() {
		System.setProperty("webdriver.chrome.driver", "path of chromeDriver");
		WebDriver driver=new ChromeDriver();
		driver.get("www.google.com");
		File file=new File("");
		file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}
	
	public static void selectOptions(WebElement ele, String option) {
		Select select=new Select(ele);
		select.selectByVisibleText(option);
		
	}	
}
