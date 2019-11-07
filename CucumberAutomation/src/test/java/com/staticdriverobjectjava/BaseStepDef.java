package com.staticdriverobjectjava;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class BaseStepDef {
	
	private static boolean startBrowser = false;
	protected static WebDriver driver;
	
	
	public static WebDriver getDriver() {  
		if(driver==null){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\32489\\Documents\\Training\\TrainingContent\\SeleniumJars_Software\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		return driver;
	}
    
	
	
}
