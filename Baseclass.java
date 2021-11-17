package com.banking.testcases;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Baseclass {
	public String baseURL = "http://demo.guru99.com/V4/";
	public String username = "mngr354807";
	public String password ="qEhYgan";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\372262\\workspace\\Testing\\BankingFramework\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
		logger =Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
		
		
	}
	
	

}
