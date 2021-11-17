package com.banking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageobject.LoginPage;

public class TC_login_TestCase extends Baseclass {
	
	
	@Test
	public void loginTest (){
		
		driver.get(baseURL);
		logger.info("URL is Opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		
		logger.info("Submit the button");
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else {
			Assert.assertTrue(false);
		}
		
	}

}
