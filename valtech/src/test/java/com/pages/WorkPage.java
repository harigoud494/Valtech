package com.pages;

import org.openqa.selenium.By;

import com.cucumberRunner.AbstractMain;

public class WorkPage extends AbstractMain {
	private static By PAGE_NAME=By.cssSelector("h1");
	public String isWorkPageDisplayed(){
		return driver.findElement(PAGE_NAME).getText();
	}

}
