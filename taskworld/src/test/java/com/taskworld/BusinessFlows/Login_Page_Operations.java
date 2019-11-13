package com.taskworld.BusinessFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.taskworld.Locators.Login_Page_Locators;
import com.taskworld.Utilities.Constants;
import com.taskworld.Utilities.Driver_Setup;

public class Login_Page_Operations extends Driver_Setup{
	public void login() throws InterruptedException {
		
		driver.findElement(By.name(Login_Page_Locators.username_input_field())).sendKeys(Constants.username);
		driver.findElement(By.name(Login_Page_Locators.password_input_field())).sendKeys(Constants.password,Keys.ENTER);
		Thread.sleep(5000);
	}
}
