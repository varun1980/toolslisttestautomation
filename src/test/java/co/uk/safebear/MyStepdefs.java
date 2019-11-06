package co.uk.safebear;

import co.uk.safebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {

    WebDriver browser;

    @Before
    public void setUp (){
        browser= Driver.getDriver();
        browser.navigate().to(Driver.getUrl());
    }

    @After
    public void tearDown(){
        browser.quit();
    }

    @When("The driver enters username {string} and password {string}")
    public void the_driver_enters_username_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("The driver is successfully logged in")
    public void the_driver_is_successfully_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
