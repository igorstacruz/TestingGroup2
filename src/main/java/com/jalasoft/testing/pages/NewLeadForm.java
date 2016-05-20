package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by ccatari on 5/18/2016.
 */
public class NewLeadForm extends AbstractBasePage{
    @FindBy(id = "name_salutationlea2")
    private WebElement gender;

    @FindBy(id = "name_firstlea2")
    private WebElement firstName;

    @FindBy(name = "save")
    private WebElement saveButton;

    public void setGender(String genderValue) {
        wait.until(ExpectedConditions.elementToBeSelected(gender));
        Select genderSelectField = new Select(gender);
        genderSelectField.selectByValue(genderValue);
    }
    public void setFirstName(String firstNameValue){
        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.clear();
        firstName.sendKeys(firstNameValue);
    }

    public void setLastName(String lastNameValue){
        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.clear();
        firstName.sendKeys(lastNameValue);
    }


    public CampaignDetail clickSaveButton() {
        saveButton.click();
        return new CampaignDetail();
    }
}
