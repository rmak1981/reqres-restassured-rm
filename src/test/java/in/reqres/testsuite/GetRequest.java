package in.reqres.testsuite;

import in.reqres.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

/*
 * Ravi's Creation
 * Date of Creation 10-05-2020
 */
public class GetRequest extends TestBase {

    @Test

    public void getUserList(){

        given()
                .log()
                .body()
                .param("page","2")
                .when()
                .get("/users")
                .then().body("ad.company",equalTo("StatusCode Weekly"))
                .log().body()
                .statusCode(200);

    }
    @Test
    public void getSingleUser(){

        given()
                .param("page","2")
                .when()
                .get("/users/7")
                .then().body("data.first_name",equalTo("Michael"))
                .log().body()
                .statusCode(200);
    }
    @Test
    public void getUserNotFound(){

        given()
                .when()
                .get("/users/23")
                .then()
                .body(equalTo("{}"))
                //.log().all()
                .statusCode(404);

    }
}
