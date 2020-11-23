package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.HomePage;
import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RecordStepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @When("User logs in with email and password")
    public void user_logs_in_with_email_and_password() {
     loginPage.logIn();
    }

    @Then("User see number of {string}")
    public void user_see_number_of(String records) throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickRecord(records);
    }

    @Then("{string} numbers the same as {string}")
    public void numbersTheSameAs(String actual, String expected) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(actual.contains(expected));
        Driver.closeDriver();
    }
}
