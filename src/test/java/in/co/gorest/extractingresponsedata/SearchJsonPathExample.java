package in.co.gorest.extractingresponsedata;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class SearchJsonPathExample {

    static ValidatableResponse response;

    @BeforeClass
    public static void loadIt() {

        RestAssured.baseURI = "https://gorest.co.in";
        RestAssured.basePath = "/public/v2";

         response = given()
                 .when()
                 .get("/users")
                 .then().statusCode(200);
    }


    // 1) Total record are 20
    @Test
    public void test001() {

        List<Integer> total_Ids = response.extract().path("id");
        int i = 0;
        do {
            i++;}
        while (i< total_Ids.size());
            System.out.println("------------------StartingTest---------------------------");
            System.out.println("Total record are  : " +i);
            System.out.println("------------------End of Test---------------------------");

        }


        @Test
        public void test002 () {


            ArrayList name = response.extract().path("findAll{it.id==2353}.name");

            System.out.println("------------------StartingTest---------------------------");
            System.out.println("The total records are : " + name);
            System.out.println("------------------End of Test---------------------------");

        }


        @Test
        public void test003 () {
        ArrayList email =response.extract().path("findAll{it.id==2341}.email");
            System.out.println("------------------StartingTest---------------------------");
            System.out.println("The email of person with id 2341 is  : " + email);
            System.out.println("------------------End of Test---------------------------");
        }


        @Test
        public void test004 () {

            ArrayList status = response.extract().path("findAll{it.status=='active'}.id");
            System.out.println("------------------StartingTest---------------------------");
            System.out.println("All Ids with active status are  : "+status);
            System.out.println("------------------End of Test---------------------------");

        }


        @Test
        public void test005 () {
         ArrayList gender = response.extract().path("findAll{it.id==2332}.gender");
            System.out.println("------------------StartingTest---------------------------");
            System.out.println("The gender of id 2332 is : "+gender);
            System.out.println("------------------End of Test---------------------------");
        }
    @Test
    public void test006 () {

        ArrayList gender = response.extract().path("findAll{it.id==2337}.gender");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The gender of id 2337 is : "+gender);
        System.out.println("------------------End of Test---------------------------");
    }


    }


