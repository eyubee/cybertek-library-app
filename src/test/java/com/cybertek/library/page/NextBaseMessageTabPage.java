package com.cybertek.library.page;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextBaseMessageTabPage {
    public NextBaseMessageTabPage(){
        PageFactory.initElements(Driver.getDriver(), this );
    }

    @FindBy (xpath = "//span[@class='feed-add-post-form-link feed-add-post-form-link-active']")
    public WebElement messageTab;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBody;

    @FindBy(xpath ="//iframe[@class='bx-editor-iframe']")
    public WebElement messageIframe;

    @FindBy(xpath ="//div[@class='feed-buttons-block']//*[.='Send']" )
    public WebElement sendButton;

    @FindBy(xpath ="//div[@class='feed-buttons-block']//*[.='Cancel']" )
    public WebElement cancelButton;

    @FindBy(xpath ="//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']" )
    public WebElement attacheLinkButton;

    @FindBy(id= "linkidPostFormLHE_blogPostForm-text")
    public WebElement attachTextLink;

    @FindBy(id= "linkidPostFormLHE_blogPostForm-href")
    public WebElement attachLinkLink;

}

