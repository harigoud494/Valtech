package com.stepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberRunner.AbstractMain;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class HomePageStepDef extends AbstractMain{
	String BASEURL="https://www.valtech.com/";
	@Given("^I am in home page$")
    public void i_am_in_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(BASEURL);
		driver.manage().window().maximize();
       
    }

    @Then("^I should see \"([^\"]*)\" section should be disply$")
    public void i_should_see_something_section_should_be_disply(String expectedSection) throws Throwable {
    	assertThat("Latest Section is not present", homePage.isLatestNewsSectionDisplayed().contains(expectedSection));
    }
    
    @When("^I select \"([^\"]*)\" from Top Nav$")
    public void i_select_something_from_top_nav(String topNavItemName) throws Throwable {
       homePage.selectTopNavItem(topNavItemName);
    }

   

}
