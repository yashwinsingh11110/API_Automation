package requests;

import static io.restassured.RestAssured.given;

import context.ApiContext;
import io.restassured.specification.RequestSpecification;

public class DeletingUserReq {

    private ApiContext apiContext;

    private RequestSpecification request = given();


    public DeletingUserReq(ApiContext apiContext) {
        this.apiContext = apiContext;
    }


    public void sendDeleteRequest() {

        apiContext.setResponse(
            request.delete(
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