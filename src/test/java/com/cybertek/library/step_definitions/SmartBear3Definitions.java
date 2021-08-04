package com.cybertek.library.step_definitions;

import com.cybertek.library.page.SmartBearPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SmartBear3Definitions {
    SmartBearPage smartBear= new SmartBearPage();
    @Given("user is logged into SmartBear Tester account and is on order page")
    public void user_is_logged_into_smart_bear_tester_account_and_is_on_order_page() {
String url= "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Default.aspx";
        Driver.getDriver().get(url);
        smartBear.username.sendKeys("Tester");
        smartBear.password.sendKeys("test");
        smartBear.loginButton.click();

    }

    @When("user select FamilyAlbum from product dropdown")
    public void user_select_family_album_from_product_dropdown() {
        smartBear.order.click();
        Select productSelect= new Select(smartBear.familyAlbum);
        productSelect.selectByVisibleText("FamilyAlbum");

    }
    @When("user enters {string} to quantity")
    public void user_enters_to_quantity(String quantity) {
smartBear.quantity.sendKeys(quantity);

    }
    @When("user enters {string} to consumer name")
    public void user_enters_to_consumer_name(String name) {
        smartBear.customerName.sendKeys(name);

    }
    @When("user enters {string} to street")
    public void user_enters_to_street(String address) {
        smartBear.street.sendKeys(address);

    }
    @When("user enters {string} city")
    public void user_enters_city(String city) {
smartBear.city.sendKeys(city);
    }
    @When("user enters {string} to state")
    public void user_enters_to_state(String state) {
        smartBear.state.sendKeys(state);

    }
    @When("user enters {string}")
    public void user_enters(String zip) {
        smartBear.zip.sendKeys(zip);

    }
    @When("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {
       smartBear.cardType.click();
    }
    @When("user enters {string} to card number")
    public void user_enters_to_card_number(String creditCard) {
        smartBear.cardNumber.sendKeys(creditCard);

    }
    @When("user enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expirationDate) {
        smartBear.expirationDate.sendKeys(expirationDate);

    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
smartBear.processButton.click();

    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expectedName) {
        smartBear.viewAllOrders.click();
        BrowserUtils.sleep(3);
        String actualName= smartBear.currentName.getText();
        Assert.assertEquals(expectedName,actualName);

    }
}
