package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
    @Given("^User is on landing page$")
    public void userIsOnLandingPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userLoginIntoApplicationWithAndPassword(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Home page is populated$")
    public void homePageIsPopulated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cardsDisplayedAre(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

}
