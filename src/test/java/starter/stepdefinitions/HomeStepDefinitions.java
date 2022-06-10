package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import starter.navigation.HomePage;

public class HomeStepDefinitions {

    private HomePage homePage;

    @Given("^I go to yahoo.com$")
    public void i_open_the_home_page() {
        homePage.openPage();
    }

    @Given("^I go to bookmarked finance page$")
    public void i_open_the_marketplace_calendar() {
        homePage.openMarketPlaceCalendar();
    }

    @Given("^I click accept all$")
    public void i_click_accept_all() {
        homePage.clickAcceptAll();
    }

    @Given("^I click login from the nav bar$")
    public void i_login_navbar() {
        homePage.clickLoginNavbar();
    }

    @Given("^I click finance from the nav bar$")
    public void i_click_finance_navbar() {
        homePage.clickFinanceNavbar();
    }

}