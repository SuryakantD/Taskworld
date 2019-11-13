package com.taskworld.BusinessFlows;

import org.openqa.selenium.By;
import com.taskworld.Locators.Main_Page_Locators;
import com.taskworld.Utilities.Constants;
import com.taskworld.Utilities.Driver_Setup;



public class Main_Page_Operations extends Driver_Setup{

	public void createNewProject() throws InterruptedException {
				
		driver.findElement(By.xpath(Main_Page_Locators.new_project())).click();
		driver.findElement(By.name(Main_Page_Locators.project_name_input_field())).sendKeys(Constants.projectName);
		driver.findElement(By.xpath(Main_Page_Locators.project_description_input_field())).sendKeys(Constants.projectDescription);
		driver.findElement(By.xpath(Main_Page_Locators.project_next_button())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Main_Page_Locators.project_create_button())).click();
		
	}
	
	public void createNewTasklist() throws InterruptedException {
		
		//driver.findElement(By.xpath(Main_Page_Locators.select_new_project())).click();
		driver.findElement(By.xpath(Main_Page_Locators.enter_tasklist_name())).sendKeys(Constants.tasklistName);	// add task list name	and enter
		driver.findElement(By.xpath(Main_Page_Locators.save_tasklist_name())).click();
		Thread.sleep(2000);
	}
	
	public void createNewTask() throws InterruptedException {
		
		//driver.findElement(By.xpath(Main_Page_Locators.select_new_project())).click();  // Click on project from dashboard
		driver.findElement(By.xpath(Main_Page_Locators.tasklist_expand())).click(); // click on + icon for TaskList
		driver.findElement(By.xpath(Main_Page_Locators.add_task_name_input_field())).sendKeys(Constants.taskName);
		driver.findElement(By.xpath(Main_Page_Locators.tasklist_create_button())).click(); // click on Create button
		driver.findElement(By.xpath(Main_Page_Locators.expand_open_task_details())).click(); // open task details page
		Thread.sleep(2000);
		driver.findElement(By.xpath(Main_Page_Locators.close_open_task_details())).click(); // close open task details page
		Thread.sleep(3000);
	}
	
	public void completeOpenTask() throws InterruptedException {
				
		driver.findElement(By.xpath(Main_Page_Locators.select_checkbox_open_task())).click(); // Close task by clicking checkbox
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@data-status='hidden']/span")).click(); //expanding hidden
		driver.findElement(By.xpath(Main_Page_Locators.expand_open_task_details())).click(); // open closed task details page
		Thread.sleep(2000);
		driver.findElement(By.xpath(Main_Page_Locators.close_open_task_details())).click(); // closed task details page
	}
	
}
