package com.pages;

import org.openqa.selenium.By;

import com.cucumberRunner.AbstractMain;

public class AboutPage extends AbstractMain {
	private static By PAGE_NAME=By.cssSelector("h1");
	public String isAboutPageDisplayed(){
		return driver.findElement(PAGE_NAME).getText();
	}
public void selectValTechOfficeOption(){
	driver.findElement(By.linkText("Valtech Offices")).click();
	
}
public int countValTechOffices(){
	return driver.findElements(By.cssSelector(".office__header")).size();
}
}