package com.taskworld.Tests;


import org.testng.annotations.Test;

import com.taskworld.BusinessFlows.Main_Page_Operations;

public class CreateNewTasklist_Tests {

	@Test
	void createNewTasklist() throws InterruptedException {
		System.out.println("User will create newTasklist ");
		Main_Page_Operations mainObj = new Main_Page_Operations();
		mainObj.createNewTasklist();

	
}
}