package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import requests.CreatingUserReq;

public class CreatingUser {

    private CreatingUserReq postReq;

    public CreatingUser(CreatingUserReq postReq) {
        this.postReq = postReq;
    }


    @Given("^I have the details of a new user$")
    public void gettingData() {

        postReq.getData();
    }


    @When("^I send a POST request to create the user$")
    public void sendingPostRequest() {

        postReq.sendPostRequest();
    }


    @Then("^the user should be created successfully with status code 201$")
    public void verifyingUser() {

        postReq.verifyStatus();
        postReq.getUserId();
    }
}