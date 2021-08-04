package com.cybertek.library.step_definitions;

import com.cybertek.library.page.LibraryPage;
import com.cybertek.library.page.NavigationPage;
import com.cybertek.library.page.UsersPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Navigation_StepDefinations {
    NavigationPage navigationPage= new NavigationPage();
    UsersPage usersPage= new UsersPage();
    LibraryPage librarylogin= new LibraryPage();

    @Given("user is login as librarian")
    public void user_is_login_as_librarian() {
        String url= ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
       librarylogin.email.sendKeys("librarian11@library");
        librarylogin.password.sendKeys("I61FFPPf");
        librarylogin.signInButton.click();
    }
//    @When("librarian navigates to users page")
//    public void librarian_navigates_to_users_page() {
//        navigationPage.usersTab.click();
//    }
    @When("librarian navigates to {string} page")

    public void librarian_navigates_to_page(String link) {
        BrowserUtils.sleep(2);
        link="users";
        switch (link.toLowerCase()){
            case "users":
                navigationPage.usersTab.click();
                break;
            case "dashboard":
                navigationPage.dashBoard.click();
                break;
            case "books":
                navigationPage.books.click();
                break;
        }

    }
    @When("Show records dropdown value should be {int} by default")
    public void show_records_dropdown_value_should_be_by_default(Integer numberOfRecords) {
        Select defultValue= new Select(usersPage.showRecordsDropdown);
       String actualnumber =defultValue.getFirstSelectedOption().getText();

       Assert.assertEquals(actualnumber,numberOfRecords+"");

    }
    @Then("dropdown shows the following options:")
    public void dropdown_shows_the_following_options(List<String> expectedList) {
        Select allNums= new Select(usersPage.showRecordsDropdown);
        List <WebElement> actualList= allNums.getOptions();
        List<String > elementsText= BrowserUtils.getElementsText(actualList);
        //List<String> actualListText= new ArrayList<>();
//      for  (WebElement each: actualList){
//          actualListText.add(each.getText());
//        }
//Assert.assertEquals(expectedList,actualListText);
        Assert.assertEquals(expectedList,elementsText);
    }
}
