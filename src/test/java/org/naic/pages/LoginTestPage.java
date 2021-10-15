package org.naic.pages;

import org.naic.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTestPage {
    public LoginTestPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login-link")
    public WebElement loginLink;

    @FindBy(id = "INT_USERNAME")
    public WebElement usernameBox;

    @FindBy(id = "INT_PASSWORD")
    public WebElement passwordBox;

    @FindBy(id = "INT_LOGIN_BTN")
    public WebElement loginButton;

    @FindBy(xpath = "//*[.='Login failed, please try again.']")
    public WebElement errorMessage;
}
