package get_requests;

import base_urls.HerOkuAppBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Get05 extends HerOkuAppBaseUrl {
    /*
       Given
           https://restful-booker.herokuapp.com/booking
       When
           User sends get request to the URL
       Then
           Status code is 200
         And
             Among the data there should be someone whose firstname is "Jane" and lastname is "Doe"
    */
    @Test
    public void get05() {
       //            base url                  parameter   query parameter starting   key    value  multiple query  key    value
     //   https://restful-booker.herokuapp.com  / booking/      ?                  firstname=Jane    &             lastname=Doe
     // ? isareti query parametrelerin basladigi yeri ifade eder.


        //Set the URL
        // https://restful-booker.herokuapp.com/booking?firstname=Jane&lastname=Doe
        spec.pathParam("first", "booking").
                queryParams("firstname", "Jane",
                        "lastname", "Doe");

        //Set the expected data

        //Send the request and get the response
        Response response = given().spec(spec).when().get("/{first}");
        response.prettyPrint();

        // B103_TR
        // Do assertion
        response.then().statusCode(200); // Status code is 200
       // Among the data there should be someone whose firstname is "Jane" and lastname is "Doe"
        assertTrue(response.asString().contains("bookingid"));


        // B132_EN
//        //Do Assertion
//        // 1st Way:
//        response.then().statusCode(200).body("",hasSize(greaterThan(0)));
//
//        // 2nd Way:
//     assertEquals(200, response.statusCode());
//
//        assertTrue(response.asString().contains("bookingid"));


    }
}
