package requests;

import static io.restassured.RestAssured.given;

import context.ApiContext;
import io.restassured.specification.RequestSpecification;

public class GettingUserReq {

    private ApiContext apiContext;

    private RequestSpecification request = given();


    public GettingUserReq(ApiContext apiContext) {
        this.apiContext = apiContext;
    }


    public void getId() {

        if (apiContext.getUserId() == null || apiContext.getUserId().isEmpty()) {
            apiContext.setUserId("1");
        }
    }


    public void sendGetRequest() {

        apiContext.setResponse(
            request.get(
                apiContext.getBaseUrl() + "/" + apiContext.getUserId()
            )
        );
    }


    public void verifyStatus() {

        apiContext.getResponse()
                  .then()
                  .statusCode(200);
    }
}