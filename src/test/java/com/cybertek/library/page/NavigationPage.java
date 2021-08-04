package com.cybertek.library.page;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage {
    public NavigationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersTab;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashBoard;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement books;

}
