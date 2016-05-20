package com.jalasoft.testing.pages;

import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ccatari on 5/20/2016.
 */
public class Privacy extends AbstractBasePage{
    @FindBy(css = ".cell-content > h3")
    private WebElement titleText;
    private LinkedList<String> windowsList;

    public Privacy() {
        Set<String> windows = driver.getWindowHandles();
        windowsList = new LinkedList<String>(windows);
        driver.switchTo().window(windowsList.getLast());
    }
    public String getTitleText(){
        return titleText.getText();
    }
    public void switchToParent(){
        driver.close();
        driver.switchTo().window(windowsList.getFirst());
    }
}
