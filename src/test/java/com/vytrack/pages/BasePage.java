package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class  BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement customersTabBtn;

    @FindBy(xpath = "(//li[@class='dropdown-menu-single-item last']//span)[3]")
    public WebElement contactsTabModule;


}
