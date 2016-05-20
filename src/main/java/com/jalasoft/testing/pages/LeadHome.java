package com.jalasoft.testing.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by ccatari on 5/16/2016.
 */
public class LeadHome extends AbstractHome {

    public NewLeadForm clickNewButton() {
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        newButton.click();
        return new NewLeadForm();
    }
}
