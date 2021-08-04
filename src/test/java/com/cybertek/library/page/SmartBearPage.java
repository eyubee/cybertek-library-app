package com.cybertek.library.page;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {
    public SmartBearPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (name ="ctl00$MainContent$username")
    public WebElement username;

    @FindBy (name ="ctl00$MainContent$password")
    public WebElement password;

    @FindBy (name ="ctl00$MainContent$login_button")
    public WebElement loginButton;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement order;

    @FindBy(xpath = "//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")
    public WebElement familyAlbum;

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtQuantity")
    public WebElement quantity;

    @FindBy(name ="ctl00$MainContent$fmwOrder$txtName")
    public WebElement customerName;

    @FindBy (name ="ctl00$MainContent$fmwOrder$TextBox2")
    public WebElement street;

    @FindBy(name= "ctl00$MainContent$fmwOrder$TextBox3")
    public WebElement city;

    @FindBy(name= "ctl00$MainContent$fmwOrder$TextBox4")
    public WebElement state;

    @FindBy(name= "ctl00$MainContent$fmwOrder$TextBox5")
    public WebElement zip;

    @FindBy(id= "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement cardType;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox6")
    public WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expirationDate;

    @FindBy(id= "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy (xpath = "//a[.='View all orders']")
    public WebElement viewAllOrders;

    @FindBy(xpath = "//table[@class='SampleTable']//td[.='John Wick']")
    public WebElement currentName;


}
