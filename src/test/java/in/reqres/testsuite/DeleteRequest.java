package in.reqres.testsuite;

import in.reqres.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 * Ravi's Creation
 * Date of Creation 10-05-2020
 */
public class DeleteRequest extends TestBase {
    @Test
    public void deleteUser(){
        given()
                .log()
                .body()
                .when()
                .delete("/users/9")
                .then()
                .log()
                .status()
                .statusCode(204);
    }
}
