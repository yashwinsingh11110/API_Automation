package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import requests.DeletingUserReq;

public class DeleteUser {

    private DeletingUserReq deleteReq;

    public DeleteUser(DeletingUserReq deleteReq) {
        this.deleteReq = deleteReq;
    }


    @Given("^I have the user's id$")
    public void gettingUserId() {

        // User ID is already stored in ApiContext
    }


    @When("^I send a DELETE request$")
    public void sendingDeleteRequest() {

        deleteReq.sendDeleteRequest();
    }


    @Then("^the user should be deleted successfully$")
    public void verifyingUser() {

        deleteReq.verifyStatus();
    }


    @Then("^the response status code should be 200$")
    public void verifyingStatus() {

        deleteReq.verifyStatus();
    }
}