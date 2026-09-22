package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import requests.GettingUserReq;

public class GettingUser {

    private GettingUserReq getReq;

    public GettingUser(GettingUserReq getReq) {
        this.getReq = getReq;
    }


    @Given("^I have the id of a newly created user$")
    public void gettingData() {

        // User ID is already stored in ApiContext
    }


    @When("^I send a GET request to get the user's details$")
    public void sendingGetRequest() {

        getReq.sendGetRequest();
    }


    @Then("^the user's details should be retrieved successfully with response 200$")
    public void verifyingStatus() {

        getReq.verifyStatus();
    }
}