package com.taskworld.Locators;

public class Main_Page_Locators {

		// TODO Auto-generated method stub
public static String new_project() {
	String new_project ="//div[@class='tw-new-project-button-box ax-new-project-button-box']";
	return new_project;
	}
public static String project_name_input_field() {
	String project_name_input_field ="project-name";
	return project_name_input_field;

	}
public static String project_description_input_field() {
	String project_description_input_field ="//input[@class='tw-form-input__input-element']";
	return project_description_input_field;

	}
public static String project_next_button() {
	String project_next_button ="//button[@class='tw-button --size-42px --padding-wide ax-new-project-choose-workflow-button']";
	return project_next_button;

	}
public static String project_create_button() {
	String project_create_button ="//button[@class='tw-button --size-42px --padding-wide ax-create-project-button']";
	return project_create_button;

	}
public static String select_new_project() {
	String select_new_project ="//header[@class='tw-project-box__header']";
	return select_new_project;

	}
public static String tasklist_expand() {
	String tasklist_expand ="//div[@class='tw-tasklist-header --expanded']/div[2]/div[2]";
	return tasklist_expand;

	}
public static String enter_tasklist_name() {
	String enter_tasklist_name ="//input[@class='tw-editable-textfield__input ax-new-tasklist-name-textfield']";
	return enter_tasklist_name;

	}
public static String save_tasklist_name() {
	String save_tasklist_name ="//div[@class='tw-scrollable-layout']";
	return save_tasklist_name;

	}

public static String tasklist_create_button() {
	String tasklist_create_button ="//div[@class='tw-task-input-panel__panel-right --narrow']/button[2]";
	return tasklist_create_button;

	}
public static String add_task_name_input_field() {
	String add_task_input_field ="//div[@class='tw-task-input-panel__input-box']/textarea";
	return add_task_input_field;

	}
public static String expand_open_task_details() {
	String expand_task_details ="//div[@class='tw-task__inner']";
	return expand_task_details;

	}
public static String close_open_task_details() {
	String close_open_task_details ="//*[@id='react']/div/section/div[1]/div/div/div[2]/div/div/section/div/div/div[1]/i";
	return close_open_task_details;

	}
public static String select_checkbox_open_task() {
	String select_checkbox_open_task ="//div[@class='tw-task-header__checkbox']/div";
	return select_checkbox_open_task;

	}
}
