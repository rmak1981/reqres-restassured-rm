package in.reqres.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/*
 * Ravi's Creation
 * Date of Creation 10-05-2020
 */
public class TestBase {

    @BeforeClass
    public static void inIt(){

        RestAssured.baseURI = "https://reqres.in/api";

    }
}
