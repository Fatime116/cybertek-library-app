package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class InvalidLoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }

    @When("User logs in as a student")
    public void user_logs_in_as_a_student_with_invalid_password() throws InterruptedException {
loginPage.loginAttempt();

}

    @Then("User should not be able to log in")
    public void userShouldNotBeAbleToLogIn() {
    }
}

