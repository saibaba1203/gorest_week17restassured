package in.co.gorest.studentinfo;


import in.co.gorest.model.GorestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchUserDetails extends TestBase {
    @Test
    public void patchUserDetails(){
        GorestPojo gorestPojo = new GorestPojo();
        gorestPojo.setName("David Miller");
        gorestPojo.setGender("male");
        gorestPojo.setEmail("david_Miller@gmail.com");
        gorestPojo.setStatus("active");

        Response response =
                given()
                        .header("Content-Type","application/json")
                        .header("Authorization", "Bearer 5a08acd60a4f9f76dd28e583fa505a76eeaa98e3da1658ee53c924cac7b1d8d1")
                        .body(gorestPojo)
                        .when()
                        .patch("/users/3829");
        response.then().statusCode(200);
        response.prettyPrint();

    }


}
