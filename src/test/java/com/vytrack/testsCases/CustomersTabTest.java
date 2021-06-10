package com.vytrack.testsCases;

import com.vytrack.pages.CustomersContactPage;
import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomersTabTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    CustomersContactPage customersContactPage = new CustomersContactPage();


    @Test
    public void customersTabTest() {

        loginPage.loginAsSalesManeger();
        BrowserUtils.waitFor(5);

//        dashBoardPage.customersTabBtn.click();
//        BrowserUtils.waitFor(2);
//        dashBoardPage.contactsTabModule.click();

        actions.moveToElement(dashBoardPage.customersTabBtn).perform();
        BrowserUtils.waitFor(2);
        actions.click(dashBoardPage.contactsTabModule).perform();
        BrowserUtils.waitFor(4);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/contact");

        BrowserUtils.waitFor(3);
        customersContactPage.email.click();
        BrowserUtils.waitFor(3);
        Assert.assertEquals(driver.getTitle(),"Mariam Brackstone - Contacts - Customers");

        BrowserUtils.waitFor(5);
        Assert.assertEquals(driver.findElement(By.className("email")).getText(),"mbrackstone9@example.com");

        BrowserUtils.waitFor(5);
        Assert.assertEquals(driver.findElement(By.className("phone")).getText(),"+18982323434");


    }


}
