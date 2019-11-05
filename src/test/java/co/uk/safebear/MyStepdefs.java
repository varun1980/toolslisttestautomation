package co.uk.safebear;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

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
