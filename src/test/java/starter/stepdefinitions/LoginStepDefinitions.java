package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import starter.navigation.ExcelReader;
import starter.navigation.LoginPage;

public class LoginStepDefinitions {

    private LoginPage loginPage;
    private final ExcelReader excelReader = new ExcelReader();

    @Given("^I enter stored username$")
    public void i_enter_stored_username() {
        excelReader.callDefaults();
        loginPage.enterUsernameOf(excelReader.getUsername());
    }

    @Given("^I enter username of '(.*)'$")
    public void i_enter_username_string(String givenUsername) {
        loginPage.enterUsernameOf(givenUsername);
    }

    @Given("^I enter stored password$")
    public void i_enter_stored_password() {
        loginPage.enterPasswordOf(excelReader.getPassword());
    }

    @Given("^I enter password of '(.*)'$")
    public void i_enter_password_string(String givenPassword) {
        loginPage.enterPasswordOf(givenPassword);
    }

    @Given("^I click next button$")
    public void i_click_next_button() {
        loginPage.clickNextButton();
    }

    @Given("^I click authenticate log in$")
    public void i_click_authenticate_login() {
        loginPage.clickAuthenticateCredentials();
    }

    @Given("^I can see credentials error message$")
    public void i_can_see_credentials_error_message() {
        loginPage.iCanSeeCredentialsErrorMessage();
    }

}
