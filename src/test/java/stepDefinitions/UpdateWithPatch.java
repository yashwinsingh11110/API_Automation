package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import requests.UpdatingWithPatchReq;

public class UpdateWithPatch {

    private UpdatingWithPatchReq patchReq;

    public UpdateWithPatch(UpdatingWithPatchReq patchReq) {
        this.patchReq = patchReq;
    }


    @Given("^I have the updated age of a user$")
    public void gettingNewAge() {

        patchReq.getAge();
    }


    @When("^I send a PATCH request to update the user's age$")
    public void sendingPatchRequest() {

        patchReq.sendPatchRequest();
    }


    @Then("^the user's age should be updated successfully with status code 200$")
    public void verifyingUser() {

        patchReq.verifyStatus();
    }
}