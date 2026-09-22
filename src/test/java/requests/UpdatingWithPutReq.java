package requests;

import static io.restassured.RestAssured.given;

import context.ApiContext;
import io.restassured.specification.RequestSpecification;

public class UpdatingWithPutReq {

    private ApiContext apiContext;

    private RequestSpecification request = given();


    public UpdatingWithPutReq(ApiContext apiContext) {
        this.apiContext = apiContext;
    }


    public void getData() {

        request.contentType("application/json")
               .body(apiContext.getData().toString());
    }


    public void sendPutRequest() {

        apiContext.setResponse(
            request.put(
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