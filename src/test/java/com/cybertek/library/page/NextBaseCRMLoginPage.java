package com.cybertek.library.page;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextBaseCRMLoginPage {
   public  NextBaseCRMLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="//input[@name='USER_LOGIN']")
    public WebElement nextBaseUserNameTab;

    @FindBy(xpath ="//input[@name='USER_PASSWORD']")
   public  WebElement nextBasePasswordTab;

    @FindBy(xpath ="//input[@type='submit']")
   public WebElement nextBaseLogInTab;
}
