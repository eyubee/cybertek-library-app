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
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class UsersPage_TabelDefinitions {
    LibraryPage librarylogin= new LibraryPage();
    UsersPage usersPage= new UsersPage();
    NavigationPage navigationPage= new NavigationPage();
    @Given("I am login as a librarian")
    public void i_am_login_as_a_librarian() {
        String url= ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
        librarylogin.email.sendKeys("librarian11@library");
        librarylogin.password.sendKeys("I61FFPPf");
        librarylogin.signInButton.click();
    }

    @When("User navigated to users page")
    public void user_navigated_to_users_page() {
     navigationPage.usersTab.click();
    }
    @Then("users should find the following columns:")
    public void users_should_find_the_following_columns(List<String> expectedTableColumns) {
//        Select colums= new Select(usersPage.tableColums);
        List <WebElement> actualColumns= Driver.getDriver().findElements(By.xpath("//table[@class= 'table table-striped table-bordered table-hover table-header-fixed dataTable no-footer']//th"));
        List<String>  actualColumnsText= BrowserUtils.getElementsText(actualColumns);
        Assert.assertEquals(expectedTableColumns,actualColumnsText);

    }

}
