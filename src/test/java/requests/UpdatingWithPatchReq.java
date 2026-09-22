package requests;

import static io.restassured.RestAssured.given;

import context.ApiContext;
import io.restassured.specification.RequestSpecification;

public class UpdatingWithPatchReq {

    private ApiContext apiContext;

    private RequestSpecification request = given();

    private int age = 45;


    public UpdatingWithPatchReq(ApiContext apiContext) {
        this.apiContext = apiContext;
    }


    public void getAge() {

        request.contentType("application/json")
               .body("{\"age\":" + age + "}");
    }


    public void sendPatchRequest() {

        apiContext.setResponse(
            request.patch(
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