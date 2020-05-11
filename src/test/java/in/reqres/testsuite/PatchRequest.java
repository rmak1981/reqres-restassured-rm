package in.reqres.testsuite;

import in.reqres.pojo.Pojo;
import in.reqres.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class PatchRequest extends TestBase {

    @Test
    public void updateUserEmail(){

        Pojo pojo = new Pojo();

        pojo.setEmail("mrutunjay@asur.com");

        given()
                .log()
                .body()
                .when()
                .patch("/users/9")
                .then()
                .log().body()
                .statusCode(200);
    }
}
