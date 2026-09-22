package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import requests.UpdatingWithPutReq;

public class UpdateWithPut {

    private UpdatingWithPutReq putReq;

    public UpdateWithPut(UpdatingWithPutReq putReq) {
        this.putReq = putReq;
    }


    @Given("^I have the updated subject and the other details of a user$")
    public void gettingData() {

        putReq.getData();
    }


    @When("^I send a PUT request to update the user's subject$")
    public void sendingPutRequest() {

        putReq.sendPutRequest();
    }


    @Then("^the user's subject should be updated successfully with status code 200$")
    public void verifyingUser() {

        putReq.verifyStatus();
    }
}