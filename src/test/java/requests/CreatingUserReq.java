package requests;

import static io.restassured.RestAssured.given;

import context.ApiContext;
import io.restassured.specification.RequestSpecification;

public class CreatingUserReq {

    private ApiContext apiContext;

    private RequestSpecification request = given();


    public CreatingUserReq(ApiContext apiContext) {
        this.apiContext = apiContext;
    }


    public void getData() {

        request.contentType("application/json")
               .body(apiContext.getData().toString());
    }


    public void sendPostRequest() {

        apiContext.setResponse(
            request.post(apiContext.getBaseUrl())
        );
    }


    public void verifyStatus() {

        apiContext.getResponse()
                  .then()
                  .statusCode(201);
    }


    public void getUserId() {

        String id = apiContext.getResponse().jsonPath().getString("id");

        apiContext.setUserId(id);
    }
}