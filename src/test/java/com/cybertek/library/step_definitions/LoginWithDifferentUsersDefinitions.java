package com.cybertek.library.step_definitions;

import com.cybertek.library.page.LibraryPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithDifferentUsersDefinitions {
    LibraryPage login= new LibraryPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String url= ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
    }

    @When("user eneters {string} in the username box")
    public void user_eneters_in_the_username_box(String email) {

        login.email.sendKeys(email);

    }
    @When("use enters {string} in the password box")
    public void use_enters_in_the_password_box(String password) {
        login.password.sendKeys(password);

    }
    @When("user clicks sign in button")
    public void user_clicks_sign_in_button() {
        login.signInButton.click();
    }


    @Then("user should be able to see {string}")
    public void user_should_be_able_to_see(String name) {
        BrowserUtils.sleep(10);
        String actualName= login.userID.getText();
        Assert.assertTrue(actualName.contains(name));
        BrowserUtils.sleep(10);
    }




}
