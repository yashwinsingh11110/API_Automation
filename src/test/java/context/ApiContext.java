package context;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.response.Response;

public class ApiContext {

    private String baseURL = "http://localhost:3000/students";
    private JSONArray subjectArray = new JSONArray();
    private JSONObject request = new JSONObject();
    private Response response;
    private String userId;


    public ApiContext() {

        subjectArray.put("Mathematics");
        subjectArray.put("Physics");
        subjectArray.put("Chemistry");

        request.put("name", "Groot");
        request.put("age", 30);
        request.put("grade", "BCA");
        request.put("subject", subjectArray);
    }


    public void setResponse(Response resp) {
        response = resp;
    }

    public Response getResponse() {
        return response;
    }


    public String getBaseUrl() {
        return baseURL;
    }


    public JSONArray getSubjectArray() {
        return subjectArray;
    }


    public JSONObject getData() {
        return request;
    }


    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}