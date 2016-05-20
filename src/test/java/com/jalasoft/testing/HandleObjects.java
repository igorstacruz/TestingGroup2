package com.jalasoft.testing;

import com.jalasoft.testing.pages.CampaignDetail;
import com.jalasoft.testing.pages.CampaignHome;
import com.jalasoft.testing.pages.LeadHome;
import com.jalasoft.testing.pages.Login;
import com.jalasoft.testing.pages.MainContainer;
import com.jalasoft.testing.pages.NewCampaignForm;
import com.jalasoft.testing.pages.NewLeadForm;
import com.jalasoft.testing.pages.TabBar;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Igor Santa Cruz on 5/16/2016.
 */

public class HandleObjects {

    private MainContainer mainContainer;

    private TabBar tabBar;

    @BeforeClass
    public void setUp() {
        Login login = new Login();
        mainContainer = login.loginAs("igorsant@cruz.com", "sasori97");
    }

    @BeforeMethod
    public void beforeMethod() {
        tabBar = mainContainer.goToTabBar();
    }

    @Test
    public void testCreateCampaign() {
        String expectedCampaignName = "New Campaign 00001";
        String expectedCampaignType = "Telemarketing";
        String expectedCampaignStatus = "In Progress";
        String expectedCampaignStartDate = "5/9/2016";
        String expectedCampaignEndDate = "5/13/2016";
        String expectedCampaignExpectedRev = "950";
        String expectedCampaignBudgetedCost = "800";
        String expectedCampaignActualCost = "500";
        String expectedCampaignResponse = "50.00";
        String expectedCampaignNumSent = "2";
        String expectedCampaignDescription = "Test Campaign of Telemarketing type";

        CampaignHome campaignHome = tabBar.clickCampaignsTab();
        NewCampaignForm newCampaignForm = campaignHome.clickNewButton();
        newCampaignForm.setCampaignNameTextField(expectedCampaignName);
        newCampaignForm.checkCampaignActiveCheckbox();
        newCampaignForm.selectTypeCombobox(expectedCampaignType);
        newCampaignForm.selectStatusCombobox(expectedCampaignStatus);
        newCampaignForm.setStartDateTextField(expectedCampaignStartDate);
        newCampaignForm.setEndDateTextField(expectedCampaignEndDate);
        newCampaignForm.setExpectedRevTextField(expectedCampaignExpectedRev);
        newCampaignForm.setBudgetedCostTextField(expectedCampaignBudgetedCost);
        newCampaignForm.setActualCostTextField(expectedCampaignActualCost);
        newCampaignForm.setExpectedResponseTextField(expectedCampaignResponse);
        newCampaignForm.setNumSentTextField(expectedCampaignNumSent);
        newCampaignForm.setDescriptionTextField(expectedCampaignDescription);

        CampaignDetail campaignDetail = newCampaignForm.clickSaveButton();

        Assert.assertEquals(campaignDetail.getCampaignName(),
                expectedCampaignName + " [View Hierarchy]");
        Assert.assertEquals(campaignDetail.getCampaignActive(), "Checked");
        Assert.assertEquals(campaignDetail.getCampaignType(), expectedCampaignType);
        Assert.assertEquals(campaignDetail.getCampaignStatus(), expectedCampaignStatus);
        Assert.assertEquals(campaignDetail.getCampaignStartDate(), expectedCampaignStartDate);
        Assert.assertEquals(campaignDetail.getCampaignEndDate(), expectedCampaignEndDate);
        Assert.assertEquals(campaignDetail.getCampaignExpectedRev(),
                "$" + expectedCampaignExpectedRev);
        Assert.assertEquals(campaignDetail.getCampaignBudgetedCost(),
                "$" + expectedCampaignBudgetedCost);
        Assert.assertEquals(campaignDetail.getCampaignActualCost(),
                "$" + expectedCampaignActualCost);
        Assert.assertEquals(campaignDetail.getCampaignExpectedResponse(),
                expectedCampaignResponse + "%");
        Assert.assertEquals(campaignDetail.getCampaignNumSent(), expectedCampaignNumSent);
        Assert.assertEquals(campaignDetail.getCampaignDescription(), expectedCampaignDescription);
    }

    @Test
    public void testCreateLead() {
        String expectedLeadFirstName = "Jhon";
        String expectedLeadSalutation = "Mr.";
        String expectedLeadLastName = "Doe";
        String expectedLeadCompany = "MyCompany";
        String expectedLeadTitle = "Eng.";
        String expectedLeadSource = "Web";
        String expectedLeadIndustry = "Energy";
        String expectedLeadAnnualRev = "500";
        String expectedLeadPhone = "4444444";
        String expectedLeadStatus = "Working - Contacted";
        String expectedLeadRating = "Hot";
        String expectedLeadStreet = "Av. First";
        String expectedLeadCity = "LAX";
        String expectedLeadCountry = "USA";
        String expectedLeadProductInterest = "GC1000 series";

        LeadHome leadHome = tabBar.clickLeadsTab();
        NewLeadForm newLeadForm = leadHome.clickNewButton();
        newLeadForm.setFisrtNameTextField(expectedLeadFirstName);
        newLeadForm.setLeadNameTextField(expectedLeadName);

        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getLeadName() + " [View Hierarchy]",
                expectedLeadName);
    }
}