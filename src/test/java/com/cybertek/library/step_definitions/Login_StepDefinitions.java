package com.cybertek.library.step_definitions;

import com.cybertek.library.page.LibraryPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;

public class Login_StepDefinitions {
LibraryPage libraryPage= new LibraryPage();

    @Given("user is login as a librarian")
    public void user_is_login_as_a_librarian() {
        String url= ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
    }
    @When("user enters the username {string}")
    public void user_enters_the_username(String userName) {
     userName="librarian11@library";
     libraryPage.email.sendKeys(userName);
    }
    @When("user enters the password {string}")
    public void user_enters_the_password(String password) {
       password= "I61FFPPf";
       libraryPage.password.sendKeys(password);
    }
    @When("click the sign in button")
    public void click_the_sign_in_button() throws InterruptedException {
        libraryPage.signInButton.click();
        Thread.sleep(1000);
    }
    @Then("user will see the librarian page displayed")
    public void user_will_see_the_librarian_page_displayed() {
        String librarianTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(librarianTitle.contains("Library"));
        Assert.assertTrue(libraryPage.userID.getText().contains("Librarian"));
    }
    @When("user enters the  {string} and {string}")
    public void user_enters_the_and(String userName, String password) {
        userName="librarian11@library";
        password= "I61FFPPf";
        libraryPage.email.sendKeys(userName);
        libraryPage.password.sendKeys(password);
        libraryPage.signInButton.click();
    }

    @Then("users page should display {string}")
    public void users_page_should_display(String expectedUserID) throws InterruptedException {
        Thread.sleep(1000);
        String actualUserID= libraryPage.userID.getText();
        expectedUserID="Librarian 11";
        System.out.println(expectedUserID);
        System.out.println(actualUserID);
        Assert.assertTrue(actualUserID.contains(expectedUserID));

    }

    @Given("user is login as a student")
    public void user_is_login_as_a_student() {
        String url= ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
    }
    @When("user enters the student email {string}")
    public void user_enters_the_student_email(String userName) {
        userName="student11@library";
        libraryPage.email.sendKeys(userName);
    }
    @When("user enters the student password {string}")
    public void user_enters_the_student_password(String password) {
        password= "tScBPCUr";
        libraryPage.password.sendKeys(password);
    }

    @Then("user will see the student page displayed")
    public void user_will_see_the_student_page_displayed() {
//        String librarianTitle= Driver.getDriver().getTitle();
//        Assert.assertTrue(librarianTitle.contains("Library"));
        Assert.assertTrue(libraryPage.userID.getText().contains("Student"));

    }


@AfterClass
public void tear_down(){
    Driver.closeDriver();
}









    @When("user login as librarian")
    public void user_login_as_librarian() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("librarian homepage is displayed")
    public void librarian_homepage_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user login as student")
    public void user_login_as_student() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("student homepage is displayed")
    public void student_homepage_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
