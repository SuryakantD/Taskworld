package com.taskworld.Tests;


import org.testng.annotations.Test;

import com.taskworld.BusinessFlows.Main_Page_Operations;

public class CompleteOpenTask_Tests {

	@Test
	void completeOpenTask() throws InterruptedException {
		System.out.println("User will mark task as complete");
		Main_Page_Operations mainObj = new Main_Page_Operations();
		mainObj.completeOpenTask();

	
}
}