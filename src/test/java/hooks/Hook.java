package hooks;

import static io.restassured.RestAssured.given;

import context.ApiContext;
import io.cucumber.java.Before;
import io.restassured.response.Response;

public class Hook {

    private ApiContext apiContext;

    public Hook(ApiContext apiContext) {
        this.apiContext = apiContext;
    }

    @Before
    public void creatingData() {

        apiContext.getSubjectArray().put("Mathematics");
        apiContext.getSubjectArray().put("Physics");
        apiContext.getSubjectArray().put("Chemistry");

        apiContext.getData().put("name", "Groot");
        apiContext.getData().put("age", 30);
        apiContext.getData().put("grade", "BCA");
        apiContext.getData().put("subject", apiContext.getSubjectArray());

        Response response = given()
                .contentType("application/json")
                .body(apiContext.getData().toString())
                .post(apiContext.getBaseUrl());

        if (response.statusCode() == 201 || response.statusCode() == 200) {
            String userId = response.jsonPath().getString("id");
            if (userId != null && !userId.isEmpty()) {
                apiContext.setUserId(userId);
            }
        }
    }
}