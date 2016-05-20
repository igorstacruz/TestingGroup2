package com.jalasoft.testing;

import com.jalasoft.testing.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by ccatari on 5/18/2016.
 */
public class HandleObjects {
    private MainContainer mainContainer;
    private TabBar tabBar;
    @BeforeClass
    public void setUp(){
        Login login = new Login();
        mainContainer = login.loginAs("ekans.c.a@gmail.com","p4ssw0rd!");
    }
    @BeforeMethod
    public void beforeMethod(){tabBar = mainContainer.goToTabBar();}

    @Test
    public void testLogin() {
        String expectedCampaignName = "New Campaign 00001";

        /*Login login = new Login();
        MainContainer mainContainer =
                login.loginAs("ekans.c.a@gmail.com", "p4ssw0rd!");*/

        //TabBar tabBar = mainContainer.goToTabBar();

        CampaignHome campaignHome = tabBar.clickCampaignsTab();
        NewCampaignForm newCampaignForm = campaignHome.clickNewButton();
        newCampaignForm.setCampaignNameTextField(expectedCampaignName);
        newCampaignForm.setActiveCheckBox(true);
        newCampaignForm.setType("Telemarketing");
        newCampaignForm.setStatus("In Progress");
        newCampaignForm.setStartDate("04/05/2016");
        newCampaignForm.setEndDate("31/05/2016");
        newCampaignForm.setRevenueTextField("100");
        newCampaignForm.setBadgetCostTextFIeld("90");
        newCampaignForm.setActualCostTextField("70.1");
        newCampaignForm.setExpectedResponseTextField("10.0");
        newCampaignForm.setNumSentTextField("10");
        //newCampaignForm.setParentCampaign("New Campaign 00001");
        newCampaignForm.setDetailsTextField("T\ne\ns\nt");
        CampaignDetail campaignDetail = newCampaignForm.clickSaveButton();

        Assert.assertEquals(campaignDetail.getCampaignName(),
                expectedCampaignName + " [View Hierarchy]");
    }
    @Test
    public void testPrivacyLink(){
        Footer footer = mainContainer.goToFooter();
        Privacy privacy = footer.clickPrivacyLink();
        Assert.assertEquals(privacy.getTitleText(),"Privacy Statements");

    }
}
