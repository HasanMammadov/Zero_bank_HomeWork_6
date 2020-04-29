package com.zerobank.stepdefnitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();

    @Given("authorized user is on the login page")
    public void authorized_user_is_on_the_login_page() {
       // String Url = ConfigurationReader.getProperty("Url");
        Driver.getDriver().get(ConfigurationReader.getProperty("Url"));

    }

    @When("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {

        loginPage.login();
    }

    @Then("{string} page should be displayed")
    public void page_should_be_displayed(String string) {
        Assert.assertEquals(string,loginPage.getPageTitle());
    }

    @When("users logs with wrong {string} or {string}")
    public void users_logs_with_wrong_or(String username, String password) {
       loginPage.login(username,password);
    }

    @Then("error message {string} should be displayed.")
    public void error_message_should_be_displayed(String errorMessage) {
       Assert.assertEquals(errorMessage,loginPage.getErrorMessage());
    }









}
