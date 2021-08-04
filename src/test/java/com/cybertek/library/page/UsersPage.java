package com.cybertek.library.page;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
   public UsersPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement showRecordsDropdown;

   @FindBy (xpath = "//table[@class= 'table table-striped table-bordered table-hover table-header-fixed dataTable no-footer']//th")
    public WebElement tableColums;

}
