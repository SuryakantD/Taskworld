package com.taskworld.Tests;


import org.testng.annotations.Test;

import com.taskworld.BusinessFlows.Main_Page_Operations;

public class CreateNewTask_Tests {

	@Test
	void createNewTask() throws InterruptedException {
		System.out.println("User will create new Task");
		Main_Page_Operations mainObj = new Main_Page_Operations();
		mainObj.createNewTask();

	
}
}