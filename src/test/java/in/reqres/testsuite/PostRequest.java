package in.reqres.testsuite;

import in.reqres.pojo.Pojo;
import in.reqres.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class PostRequest extends TestBase {

    @Test
    public void createNewUser() {

        Pojo pojo = new Pojo();
        pojo.setName("xerxes");
        pojo.setJob("theKing");
        pojo.setEmail("xerxes@theking.com");
        pojo.setPassword("kill");

        given()
                .log()
                .body()
                .when()
                .body(pojo)
                .post("/users")
                .then()
                .log().body()
                .statusCode(201);
    }

    @Test
    public void registerSuccessful() {

        Pojo pojo = new Pojo();


        pojo.setEmail("shivagyan@yahoo.com");
        pojo.setPassword("shiva123");

        given()
                .log()
                .body()
                .when()
                .body(pojo)
                .post("/api/register")
                .then()
                .log().body()
                .statusCode(201);
    }

    @Test
    public void registerUnsuccessful(){

        Pojo pojo = new Pojo();
        pojo.setName("mahakal");
        pojo.setJob("vinash");
        pojo.setEmail("anantnag@yahoo.com");
        pojo.setPassword("ganga");

        given()
                .log()
                .body()
                .when()
                .body(pojo)
                .post("/api/register")
                .then()
                .log().body()
                .statusCode(201);
    }
    @Test
    public void loginSuccessful(){

        Pojo pojo = new Pojo();
        pojo.setName("amrut");
        pojo.setJob("devraj");
        pojo.setEmail("anantahf@yahoo.com");
        pojo.setPassword("asdddfffa");

        given()
                .log()
                .body()
                .when()
                .body(pojo)
                .post("/api/login")
                .then()
                .log().body()
                .statusCode(201);

    }
    @Test
    public void loginUnsuccessful(){

        Pojo pojo = new Pojo();
        pojo.setEmail("anantanaga@yahoo.com");
        given()
                .log()
                .body()
                .when()
                .body(pojo)
                .post("/api/login")
                .then()
                .log().status()
                .log().body()
                .statusCode(400);
    }

}
