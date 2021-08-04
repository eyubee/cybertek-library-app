package com.cybertek.library.step_definitions;

import com.cybertek.library.page.AmazonSearchPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class Searching_OnAmazonDefinations {
AmazonSearchPage amazonSearch= new AmazonSearchPage();
    @When("user is on Amazon.com")
    public void user_is_on_amazon_com() {
        Driver.getDriver().get("https://www.amazon.com");

    }

    @When("user search for hats for men")
    public void user_search_for_hats_for_men() {
        amazonSearch.searchBox.sendKeys("hats for men"+ Keys.ENTER);
        amazonSearch.hatSelected.click();

    }
    @Then("user selects a hat and added two hats in the cart")
    public void user_selects_a_hat_and_added_hats_in_the_cart() {
        amazonSearch.qtyNumber.click();
        Select hatNumber= new Select(amazonSearch.qtyDropDown);
        hatNumber.selectByIndex(1);
        amazonSearch.addToCartButton.click();
        amazonSearch.afterSelectedChart.click();
        Assert.assertTrue(amazonSearch.selectedQty.getText().contains("2 items"));
     String expectedPrice= "27.80";
     String actualPrice= amazonSearch.subTotalPrice.getText().substring(1);
     Assert.assertEquals("price isn't the same",expectedPrice, actualPrice);

    }

    @Then("user  selects a hat and added one hat in the cart")
    public void user_selects_a_hat_and_added_one_hat_in_the_cart() {
        amazonSearch.qtyNumber.click();
        Select hatNumber= new Select(amazonSearch.qtyDropDown);
        hatNumber.selectByIndex(0);
        amazonSearch.addToCartButton.click();
        amazonSearch.afterSelectedChart.click();
        Assert.assertTrue(amazonSearch.selectedQty.getText().contains("1 item"));
        String expectedPrice= "13.90";
        String actualPrice= amazonSearch.subTotalPrice.getText().substring(1);
        Assert.assertEquals("price isn't the same",expectedPrice, actualPrice);
    }
@After
    public void tearDown(){
        Driver.closeDriver();
}
}
