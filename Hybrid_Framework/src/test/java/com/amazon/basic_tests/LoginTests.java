package com.amazon.basic_tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amazon.base.BaseClass;
import com.amazon.pageobjects.signin.SignIn;
import com.amazon.utility.PropertiesFileUtils;

public class LoginTests extends BaseClass {
	@Test
	public void loginTest() throws IOException {
		driver.get(PropertiesFileUtils.getValue("url"));
		SignIn signIn=new SignIn();
		signIn.signInToAmezon();
	}
}
