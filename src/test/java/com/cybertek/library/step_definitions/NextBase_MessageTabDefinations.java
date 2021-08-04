package com.cybertek.library.step_definitions;

import com.cybertek.library.page.NextBaseCRMLoginPage;
import com.cybertek.library.page.NextBaseMessageTabPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class NextBase_MessageTabDefinations {
    NextBaseCRMLoginPage  loginPage= new NextBaseCRMLoginPage();
    NextBaseMessageTabPage messageTabPage= new NextBaseMessageTabPage();
    @Given("user is on NextBase CRM homepage")
    public void user_is_on_next_base_crm_homepage() {
        String url= "https://login.nextbasecrm.com/auth/?login=yes&backurl=%2Fstream%2F";
        Driver.getDriver().get(url);
     loginPage.nextBaseUserNameTab.sendKeys("hr19@cybertekschool.com");
     loginPage.nextBasePasswordTab.sendKeys("UserUser");
     loginPage.nextBaseLogInTab.click();
    }

    @When("user clicks the message tab")
    public void user_clicks_the_message_tab() {
        messageTabPage.messageTab.click();

    }
    @When("user creates message")
    public void user_creates_message() {

        Driver.getDriver().switchTo().frame(messageTabPage.messageIframe);
messageTabPage.messageBody.sendKeys("message tab Testing for message sending ");
    }
    @Then("user should be able to send message")
    public void user_should_be_able_to_send_message() {
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().defaultContent();
        BrowserUtils.sleep(2);
        messageTabPage.sendButton.click();
        BrowserUtils.sleep(2);

    }

}
