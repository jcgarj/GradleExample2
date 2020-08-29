import org.junit.Test;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.junit.Assert.*;
import static io.restassured.RestAssured.*;


public class apiTest {

    @Test
    public void coranavirus(){
        RestAssured.baseURI = String.format("https://api.quarantine.country/api/v1/summary/latest");

        Response response= given()
                .header("Accept", "Aplication/json")
                .log().all()
                .get();

        assertEquals(200,response.getStatusCode());

        String body = response.getBody().asString();
        System.out.println("Body Response" + body);

    }
}
