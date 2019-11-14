package com.taskworld.BusinessFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.taskworld.Locators.Main_Page_Locators;
import com.taskworld.Utilities.Constants;
import com.taskworld.Utilities.Driver_Setup;



public class Main_Page_Operations extends Driver_Setup{
	
	WebDriverWait wait = new WebDriverWait (driver, 30);

	public void createNewProject() throws InterruptedException {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Main_Page_Locators.new_project()))).click();
		driver.findElement(By.name(Main_Page_Locators.project_name_input_field())).sendKeys(Constants.projectName);
		driver.findElement(By.xpath(Main_Page_Locators.project_description_input_field())).sendKeys(Constants.projectDescription);
		driver.findElement(By.xpath(Main_Page_Locators.project_next_button())).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Main_Page_Locators.project_create_button()))).click();
		
	}
	
	public void createNewTasklist() throws InterruptedException {
		
		driver.findElement(By.xpath(Main_Page_Locators.enter_tasklist_name())).sendKeys(Constants.tasklistName);	// add task list name	and enter
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Main_Page_Locators.save_tasklist_name()))).click();

	}
	
	public void createNewTask() throws InterruptedException {
		
		driver.findElement(By.xpath(Main_Page_Locators.tasklist_expand())).click(); // click on + icon for TaskList
		driver.findElement(By.xpath(Main_Page_Locators.add_task_name_input_field())).sendKeys(Constants.taskName);
		driver.findElement(By.xpath(Main_Page_Locators.tasklist_create_button())).click(); // click on Create button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Main_Page_Locators.expand_open_task_details()))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Main_Page_Locators.close_open_task_details()))).click();
		
	}
	
	public void completeOpenTask() throws InterruptedException {
				
		driver.findElement(By.xpath(Main_Page_Locators.select_checkbox_open_task())).click(); // Close task by clicking checkbox
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Main_Page_Locators.expand_open_task_details()))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Main_Page_Locators.close_open_task_details()))).click();
	}
	
}
