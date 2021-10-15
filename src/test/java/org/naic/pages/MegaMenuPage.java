package org.naic.pages;

import org.naic.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class MegaMenuPage {
    public MegaMenuPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Mega Menu']/..")
    public WebElement menuBar;

    @FindBy(xpath = "//*[.='Mega Menu']/following-sibling::ul/li/a")
    public List<WebElement> megaMenuLinks;
}
