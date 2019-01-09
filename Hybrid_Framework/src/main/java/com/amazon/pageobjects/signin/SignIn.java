package com.amazon.pageobjects.signin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.amazon.base.BaseClass;
import com.amazon.utility.SeleniumUtils;

public class SignIn extends BaseClass {
	
	@FindBy(id="nav-link-yourAccount")
	private WebElement hello_SignIn;
	
	@FindBy(partialLinkText="Sign in")
	private WebElement  signIn;
	
	@FindBy(id="ap_email")
	private WebElement  emailOrPhone;
	
	@FindBy(id="continue")
	private WebElement continueToSignIn;
	
	@FindBy(id="ap_password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement login;
	
	@FindBy(partialLinkText="Having trouble or sight impaired?")
	private WebElement having_trouble;
	
	@FindBy(id="cu-select-firstNode")
	private WebElement selectAnIssue;

	@FindBy(className="cu-contact-channel-btn-sec-enabled")
	private WebElement email;

	public SignIn() {
		PageFactory.initElements(driver, this);
	}
	
	public void signInToAmezon() {
		Actions actions=new Actions(driver);
		actions.moveToElement(hello_SignIn).build().perform();
		signIn.click();
		emailOrPhone.click();
		emailOrPhone.sendKeys("parashuramsv@gmail.com");
		continueToSignIn.click();
		password.sendKeys("p@P12345");
		login.click();
		password.sendKeys("p@P12345");
		login.click();
		having_trouble.click();
		SeleniumUtils.selectOptions(selectAnIssue, "I cannot sign into my account");
		email.click();
	}
}
