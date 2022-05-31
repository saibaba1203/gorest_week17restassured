package in.co.gorest.studentinfo;

import in.co.gorest.model.GorestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class CreateNewUser extends TestBase {

    @Test
    public void createNewUser() {



        GorestPojo gorestPojo = new GorestPojo();
        gorestPojo.setName("Geetha Ramakrishna");
        gorestPojo.setGender("female");
        gorestPojo.setEmail("geetha.krishna@15c.com");
        gorestPojo.setStatus("active");


//                String payload = "{\n" +
//                "    \"firstName\": \"alpha\",\n" +
//                "    \"lastName\": \"beta\",\n" +
//                "    \"email\": \"opotaossabla@gmail.com\",\n" +
//                "    \"programme\": \"covid\",\n" +
//                "    \"cources\": [\n" +
//                "        \"Accounting\",\n" +
//                "        \"Statistics\"\n" +
//                "    ]\n" +
//                "}\n";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization","Bearer 4e5353d5bc214f629cd5338c069b9d9c0feffc16a023ae6f19554a35dd64b25d")
                .body(gorestPojo)
                .post();
        response.then().statusCode(201);
        response.prettyPrint();



    }
}
