package org.naic.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.naic.pages.LoginTestPage;
import org.naic.utilities.ConfigurationReader;
import org.naic.utilities.Driver;

public class LoginTest {
    LoginTestPage loginTestPage = new LoginTestPage();
    @Given("User land on the public application main page")
    public void user_land_on_the_public_application_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginUrl"));
    }

    @Given("User click the login and land on the login page")
    public void user_click_the_login_and_land_on_the_login_page() {
        loginTestPage.loginLink.click();
    }

    @When("User enter invalid username and password")
    public void user_enter_invalid_username_and_password() {
        loginTestPage.usernameBox.sendKeys("invalid username");
        loginTestPage.passwordBox.sendKeys("invalid password");
    }

    @When("User click the login button")
    public void user_click_the_login_button() {
        loginTestPage.loginButton.click();
    }

    @Then("User should see {string}")
    public void user_should_see(String message) {
        Assert.assertEquals(message,loginTestPage.errorMessage.getText());
    }

}
