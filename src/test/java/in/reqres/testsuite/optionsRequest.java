package in.reqres.testsuite;

import in.reqres.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class optionsRequest extends TestBase {

    @Test
    public void checkOpitons(){

        given()
                .when()
                .options("/users")
                .then()
                .log()
                .headers()
                .statusCode(204);

    }
}
