package com.cybertek.library.page;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPage {
    public AmazonSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy( id= "twotabsearchtextbox")
    public WebElement searchBox;



    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
    public WebElement hatSelected;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='a-button a-button-dropdown a-button-small']")
    public WebElement qtyNumber;

    @FindBy(xpath = "//select[@name='quantity']")
    public WebElement qtyDropDown;

    @FindBy(xpath = "//a[@id='hlb-view-cart-announce']")
    public WebElement afterSelectedChart;

    @FindBy(xpath = "//span[@class='a-size-medium sc-number-of-items']")
    public WebElement selectedQty;

    @FindBy (xpath = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")
    public WebElement subTotalPrice;


}


