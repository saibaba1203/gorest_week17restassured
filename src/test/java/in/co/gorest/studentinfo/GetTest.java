package in.co.gorest.studentinfo;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class GetTest extends TestBase {

    @Test
    public void getAllNameInfo() {

        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
    }



}
