package com.taskworld.Tests;


import org.testng.annotations.Test;

import com.taskworld.BusinessFlows.Login_Page_Operations;

public class Login_Page_Tests {

	@Test
	void login() throws InterruptedException {
		System.out.println("User will Login to System");
		Login_Page_Operations loginObj = new Login_Page_Operations();
				loginObj.login();
	
	
}
}