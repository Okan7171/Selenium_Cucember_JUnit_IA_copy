package com.krafttech.steps_defs;

import com.krafttech.pages.AddEducationPage;
import com.krafttech.pages.OverviewPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MyProfile_StepDefs {
    OverviewPage overviewPage = new OverviewPage();
    AddEducationPage addEducationPage = new AddEducationPage();

    @Then("The user should be able to see overview page")
    public void theUserShouldBeAbleToSeeOverviewPage() {
        Assert.assertTrue(overviewPage.overviewPageSubTitle.isDisplayed());
    }

    @When("The user navigate to profile tab: {string}")
    public void theUserNavigateToProfileTab(String tabName) {
        overviewPage.navigateUserProfileTabs(tabName);
    }

    @Then("The user should be able to see {string} button")
    public void theUserShouldBeAbleToSeeButton(String buttonName) {
        BrowserUtils.waitForVisibility(addEducationPage.addEducationBtn, 5);
        Assert.assertTrue(addEducationPage.addEducationBtn.isDisplayed());

    }

    @When("The user fill the form with followings : {string},{string},{string},{string},{string},{string}")
    public void theUserFillTheFormWithFollowings(String schoolName, String degree, String study, String fromDate, String toDate, String programDescription) {
        addEducationPage.addEducation(schoolName, degree, study, fromDate, toDate, programDescription);
    }

    @Then("The user should see added record with: {string}")
    public void theUserShouldSeeAddedRecordWith(String expectedSchoolName) {
        String actualSchoolName = overviewPage.addedEducationName(expectedSchoolName);
        Assert.assertEquals(expectedSchoolName, actualSchoolName);
    }

    @And("The user should be able to delete last added record with : {string}")
    public void theUserShouldBeAbleToDeleteLastAddedRecordWith(String schoolName) {
        // overviewPage.deleteEducation(schoolName);
    }

    @When("The user fill the form with following list")
    public void theUserFillTheFormWithFollowingList(List<String> educationInfos) {
        addEducationPage.addEducation(educationInfos.get(0), educationInfos.get(1), educationInfos.get(2), educationInfos.get(3),
                educationInfos.get(4), educationInfos.get(5));

    }
}
