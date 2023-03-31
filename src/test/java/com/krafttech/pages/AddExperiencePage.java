package com.krafttech.pages;

import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddExperiencePage extends BasePage {

    @FindBy(xpath = "//li/button[text()='Add Experience']")
    public WebElement addExperiencePageSubTitle;

    @FindBy(xpath = "//div/button[text()='Add Experience']")
    public WebElement addExperienceBtn;

    public void addExperienceMtd() {
        Actions actions = new Actions(Driver.get());
        WebElement checkBox = Driver.get().findElement(By.cssSelector("input#currentexp"));
        WebElement jobTitle = Driver.get().findElement(By.cssSelector("input#job"));

        actions.click(jobTitle)
                .sendKeys("QA Intern" + Keys.TAB)
                .sendKeys("KraftTech" + Keys.TAB)
                .sendKeys("İstanbul" + Keys.TAB)
                .sendKeys("11122020" + Keys.TAB)
              //  .click(checkBox)
                .sendKeys(Keys.TAB)
                .sendKeys("12122022"+Keys.TAB)
                .sendKeys("what a nice intern days" + Keys.TAB + Keys.ENTER).perform();
    }

    public void addExperienceWithParameterMtd(String jobTitle,String company,String location,String fromDate,String toDate,String jobDescription) {
        Actions actions = new Actions(Driver.get());

        WebElement jobTitleElement = Driver.get().findElement(By.cssSelector("input#job"));

        actions.click(jobTitleElement)
                .sendKeys(jobTitle + Keys.TAB)
                .sendKeys(company + Keys.TAB)
                .sendKeys(location + Keys.TAB)
                .sendKeys(fromDate + Keys.TAB)
                //  .click(checkBox)
                .sendKeys(Keys.TAB)
                .sendKeys(toDate+Keys.TAB)
                .sendKeys(jobDescription + Keys.TAB + Keys.ENTER).perform();
    }
}
