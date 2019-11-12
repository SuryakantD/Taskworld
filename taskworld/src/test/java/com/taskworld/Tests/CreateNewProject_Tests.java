package com.taskworld.Tests;


import org.testng.annotations.Test;

import com.taskworld.BusinessFlows.Main_Page_Operations;

public class CreateNewProject_Tests {

	@Test
	void createNewProject() throws InterruptedException {
		System.out.println("User will create new Project after login");
		Main_Page_Operations mainObj = new Main_Page_Operations();
		mainObj.createNewProject();

	
}
}