package com.pages;

import org.openqa.selenium.By;

import com.cucumberRunner.AbstractMain;

public class HomePage extends AbstractMain{
	private static final By LATEST_NEWS_SECTION=By.cssSelector(".block-header__heading");
	private static By topNavItem(String topNavItemName) {

		return By.xpath("//span[contains(text(),'"+topNavItemName+"')]/../..//a");
	}
	public String isLatestNewsSectionDisplayed(){
	 return	driver.findElement(LATEST_NEWS_SECTION).getText();
		
	}
	public void selectTopNavItem(String topNavItemName){
		driver.findElement(topNavItem(topNavItemName)).click();
		
	}

}
