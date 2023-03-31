package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage {

    @FindBy(xpath = "//button[text()='Overview']")
    public WebElement overviewPageSubTitle;


    public void navigateUserProfileTabs(String tabName) {
        WebElement profileTab = Driver.get().findElement(By.xpath("//li//button[text()='" + tabName + "']"));
        BrowserUtils.clickWithJS(profileTab);
    }

    public String addedEducationName(String schoolName) {
        return Driver.get().findElement(By.xpath("//span[text()='" + schoolName + "']")).getText();
    }

    public String addedExperienceName(String jobTitle) {
        return Driver.get().findElement(By.xpath("//span[text()='" + jobTitle + "']")).getText();
    }

    public void deleteEducation(String schoolName) {

        WebElement deleteIcon = Driver.get().findElement(By.xpath("//span[text()='" + schoolName + "']/ancestor::tr//a"));
        BrowserUtils.waitForClickablility(deleteIcon, 5);
        BrowserUtils.clickWithJS(deleteIcon);
        Alert alert = Driver.get().switchTo().alert();
        alert.accept();
    }

    public void assertProfileTabs(String profileTabButton) {
        WebElement addExperienceBtn = Driver.get().findElement(By.xpath("//div/button[text()='" + profileTabButton + "']"));
        BrowserUtils.waitForVisibility(addExperienceBtn,5);
        String actualText = addExperienceBtn.getText();
        Assert.assertEquals(profileTabButton, actualText);
    }

}
