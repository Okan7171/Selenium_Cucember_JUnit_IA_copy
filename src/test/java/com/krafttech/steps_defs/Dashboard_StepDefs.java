package com.krafttech.steps_defs;

import com.krafttech.pages.DashboardPage;
import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Dashboard_StepDefs {
    DashboardPage dashboardPage=new DashboardPage();
    @Then("The user should be able to login successfully")
    public void the_user_should_be_able_to_login_successfully() {
        Assert.assertEquals("should be same",ConfigurationReader.get("userName"),dashboardPage.userName.getText());
    }

    @Then("The user should be able to see userName: {string}")
    public void theUserShouldBeAbleToSeeUserName(String expectedUserName) {
        String actualUserName = dashboardPage.userName.getText();
        Assert.assertEquals("should be same",expectedUserName,actualUserName);
    }

    @When("The user navigate to {string} and {string}")
    public void theUserNavigateToAnd(String tabName, String module) {
        dashboardPage.navigateTabAndModule(tabName,module);
    }


    @And("The user should be able to see all tabs that shown on the dashborad page")
    public void theUserShouldBeAbleToSeeAllTabsThatShownOnTheDashboradPage(List<String> expectedTabNames) {
        List<String> actualTabNames = BrowserUtils.getElementsText(dashboardPage.tabNames);
        Assert.assertEquals(expectedTabNames,actualTabNames);

    }
}
