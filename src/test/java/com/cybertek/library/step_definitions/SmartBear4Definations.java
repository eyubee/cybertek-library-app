package com.cybertek.library.step_definitions;

import com.cybertek.library.page.SmartBearPage;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class SmartBear4Definations {
    SmartBearPage smartBear= new SmartBearPage();
    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        String url= "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Default.aspx";
        Driver.getDriver().get(url);
        smartBear.username.sendKeys("Tester");
        smartBear.password.sendKeys("test");
        smartBear.loginButton.click();

    }

    @When("User selects “FamilyAlbum” from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
        smartBear.order.click();
        Select productSelect= new Select(smartBear.familyAlbum);
        productSelect.selectByVisibleText("FamilyAlbum");

    }
    @When("User enters “{int}” to quantity")
    public void user_enters_to_quantity(Integer int1) {



    }
    @When("User enters “John Wick” to costumer name")
    public void user_enters_john_wick_to_costumer_name() {

    }
    @When("User enters “Kinzie Ave” to street")
    public void user_enters_kinzie_ave_to_street() {

    }
    @When("User enters “Chicago” to city")
    public void user_enters_chicago_to_city() {

    }
    @When("User enters “IL” to state")
    public void user_enters_il_to_state() {

    }
    @When("User enters “{int}” to zip")
    public void user_enters_to_zip(Integer int1) {

    }
    @When("User selects cardType as card type")
    public void user_selects_card_type_as_card_type() {

    }
    @When("User enters “{int}” to card number")
    public void user_enters_to_card_number(Integer int1) {

    }
    @When("User enters  “{int} {int}” to expiration date")
    public void user_enters_to_expiration_date(Integer int1, Integer int2) {

    }
    @Then("User verifies “John Wick” is in the list")
    public void user_verifies_john_wick_is_in_the_list() {

    }


}
