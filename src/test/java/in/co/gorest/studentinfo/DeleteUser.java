package in.co.gorest.studentinfo;


import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteUser extends TestBase {
    @Test
    public void deletUser() {
        Response response = given()

                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 5a08acd60a4f9f76dd28e583fa505a76eeaa98e3da1658ee53c924cac7b1d8d1")

                .when()
                .delete("/users/3828");
        response.then().statusCode(204);
        response.prettyPrint();
    }
}
