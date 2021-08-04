package com.cybertek.library.page;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TemplatePage {
    TemplatePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
