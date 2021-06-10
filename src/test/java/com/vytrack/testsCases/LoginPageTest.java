package com.vytrack.testsCases;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginTest = new LoginPage();

    @Test
    public void loginTest(){

        loginTest.loginAsSalesManeger();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(driver.getTitle(),"Dashboard");

    }

    @Test
    public void loginAsStoreManeger(){

        loginTest.loginAsStoreManeger();
    }
}
