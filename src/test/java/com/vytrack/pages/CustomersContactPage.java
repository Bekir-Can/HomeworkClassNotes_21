package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersContactPage extends BasePage{

    public CustomersContactPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//td[text()='mbrackstone9@example.com']")
    public WebElement email;

    @FindBy(xpath = "email")
    public WebElement verifyEmail;

    @FindBy(xpath = "phone")
    public WebElement verifyPhone;


}
