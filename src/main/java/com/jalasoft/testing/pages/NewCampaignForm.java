package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class NewCampaignForm extends AbstractBasePage {

    @FindBy(id = "cpn1")
    private WebElement campaignNameTextField;

    @FindBy(name = "save")
    private WebElement saveButton;

    @FindBy(id = "cpn16")
    private WebElement activeCheckBox;
    @FindBy(id="cpn2")
    private WebElement type;
    @FindBy(id="cpn3")
    private WebElement status;
    @FindBy(id="cpn5")
    private WebElement startDate;
    @FindBy(id="cpn6")
    private WebElement endDate;
    @FindBy(id="cpn8")
    private WebElement revenueTextField;
    @FindBy(id="cpn9")
    private WebElement badgetCostTextFIeld;
    @FindBy(id="cpn10")
    private WebElement actualCostTextField;
    @FindBy(id="cpn11")
    private WebElement expectedResponseTextField;
    @FindBy(id="cpn13")
    private WebElement numSentTExtField;
    @FindBy(id="Parent")
    private WebElement parentCampaign;
    @FindBy(id="cpn4")
    private WebElement detailsTextField;


    public void setCampaignNameTextField(String campaignName) {
        wait.until(ExpectedConditions.visibilityOf(campaignNameTextField));
        campaignNameTextField.clear();
        campaignNameTextField.sendKeys(campaignName);
    }

    public CampaignDetail clickSaveButton() {
        saveButton.click();
        return new CampaignDetail();
    }

    public void setActiveCheckBox(boolean activeCheckBox) {
        if(activeCheckBox) {
            this.activeCheckBox.click();
        }
    }

    public void setType(String type) {
        Select typeSelect = new Select(this.type);
        typeSelect.selectByVisibleText(type);
    }

    public void setStatus(String status) {
        Select statusSelect = new Select(this.status);
        statusSelect.selectByVisibleText(status);
    }

    public void setStartDate(String startDate) {
        wait.until(ExpectedConditions.visibilityOf(this.startDate));
        this.startDate.clear();
        this.startDate.sendKeys(startDate);
    }
    public void setEndDate(String endDate) {
        wait.until(ExpectedConditions.visibilityOf(this.endDate));
        this.endDate.clear();
        this.endDate.sendKeys(endDate);
    }

    public void setRevenueTextField(String revenueTextField) {
        wait.until(ExpectedConditions.visibilityOf(this.revenueTextField));
        this.revenueTextField.clear();
        this.revenueTextField.sendKeys(revenueTextField);
    }

    public void setBadgetCostTextFIeld(String badgetCostTextFIeld) {
        wait.until(ExpectedConditions.visibilityOf(this.badgetCostTextFIeld));
        this.badgetCostTextFIeld.clear();
        this.badgetCostTextFIeld.sendKeys(badgetCostTextFIeld);
    }


    public void setActualCostTextField(String actualCostTextField) {
        wait.until(ExpectedConditions.visibilityOf(this.actualCostTextField));
        this.actualCostTextField.clear();
        this.actualCostTextField.sendKeys(actualCostTextField);
    }

    public void setExpectedResponseTextField(String expectedResponseTextField) {
        wait.until(ExpectedConditions.visibilityOf(this.expectedResponseTextField));
        this.expectedResponseTextField.clear();
        this.expectedResponseTextField.sendKeys(expectedResponseTextField);
    }

    public void setNumSentTextField(String numSentTExtField) {
        wait.until(ExpectedConditions.visibilityOf(this.numSentTExtField));
        this.numSentTExtField.clear();
        this.numSentTExtField.sendKeys(numSentTExtField);
    }

    public void setParentCampaign(String parentCampaign) {
        wait.until(ExpectedConditions.visibilityOf(this.parentCampaign));
        this.parentCampaign.clear();
        this.parentCampaign.sendKeys(parentCampaign);
    }

    public void setDetailsTextField(String detailsTextField) {
        wait.until(ExpectedConditions.visibilityOf(this.detailsTextField));
        this.detailsTextField.clear();
        this.detailsTextField.sendKeys(detailsTextField);
    }
}
