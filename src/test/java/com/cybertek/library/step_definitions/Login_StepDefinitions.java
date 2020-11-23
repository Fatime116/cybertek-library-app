package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }


    @When("User logs in as a librarian")
    public void user_logs_in_as_a_librarian() {

     /*   String lib59Username = ConfigurationReader.getProperty("lib59_username");
        String lib59Password = ConfigurationReader.getProperty("lib59_password");

        loginPage.EmailAddress.sendKeys(lib59Username);
        loginPage.Password.sendKeys(lib59Password);
        loginPage.SignIn.click();*/

        loginPage.logIn();

    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        
    }


    @When("User enters invalid credentials")
    public void userEntersInvalidCredentials() throws InterruptedException {
        loginPage.loginAttempt();
    }

    @Then("user should see an error message")
    public void userShouldSeeAnErrorMessage() {
        loginPage.invalidMessage();
    }
}
