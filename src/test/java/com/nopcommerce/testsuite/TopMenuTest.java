package com.nopcommerce.testsuite;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.ElectronicsPage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {

    ElectronicsPage electronicsPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        electronicsPage = new ElectronicsPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void verifyPageNavigation() {
        String menuName = "Electronics";
        String expectedMessage = "Electronics";
        // This method select Electronics tab on top menu
        electronicsPage.selectMenu(menuName);
        String actualMessage= electronicsPage.getElectronicsHeaderText();
        Assert.assertEquals(expectedMessage,actualMessage,"Unable to click on");
    }
}
