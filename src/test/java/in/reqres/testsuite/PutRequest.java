package in.reqres.testsuite;

import in.reqres.pojo.Pojo;
import in.reqres.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class PutRequest extends TestBase {

@Test
    public void updateUser(){

    Pojo pojo = new Pojo();

    pojo.setName("Mrutyunjay");
    pojo.setJob("Assassination");

    given()
            .log()
            .body()
            .when()
            .body(pojo)
            .put("/users/7")
            .then()
            //.body("data.first_name", equalTo("Mrutyunjay"))
            .log().body()
            .statusCode(200);
}
}
