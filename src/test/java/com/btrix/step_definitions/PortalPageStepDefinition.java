package com.btrix.step_definitions;

import com.btrix.utilities.BrowserUtility;
import com.btrix.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PortalPageStepDefinition {

    Pages pages = new Pages();

    @When("click to a {string}")
    public void click_to_a(String string) {
        BrowserUtility.waitPlease(2);
        pages.loginPage().navigateToModule(string);
    }

    @Then("title of the page should be {string}")
    public void title_of_the_page_should_be(String title) {
        BrowserUtility.waitPlease(2);
        Assert.assertEquals(title,pages.loginPage().getPageTitle());
    }

}
