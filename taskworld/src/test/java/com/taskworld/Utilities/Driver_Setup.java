package com.taskworld.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver_Setup {
	public static WebDriver driver;
	@BeforeSuite
	void invokeBrowser() throws InterruptedException {
		System.out.println("Driver_Setup.invokeBrowser()");
		System.setProperty("webdriver.chrome.driver", Constants.driverPath+ "chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://enterprise.taskworld.com/");
		
 
}
	@AfterSuite
	void teardown() {
		driver.close();
	}
}
