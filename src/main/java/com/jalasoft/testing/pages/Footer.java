package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ccatari on 5/20/2016.
 */
public class Footer extends AbstractBasePage {
    @FindBy(xpath="//a[contains(@href,'privacy.jsp')]")
    private WebElement privateLink;

    public Privacy clickPrivacyLink(){
        privateLink.click();
        return new Privacy();
    }
}
