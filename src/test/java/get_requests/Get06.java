package get_requests;

import base_urls.HerOkuAppBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Get06 extends HerOkuAppBaseUrl {
    /*
        Given
            https://restful-booker.herokuapp.com/booking/37
        When
            User send a GET request to the URL
        Then
            HTTP Status Code should be 200
        And
            Response content type is “application/json”
        And
            Response body should be like;
                {
                    "firstname": "Jane",
                    "lastname": "Doe",
                    "totalprice": 111,
                    "depositpaid": true,
                    "bookingdates": {
                        "checkin": "2018-01-01",
                        "checkout": "2019-01-01"
                    },
                    "additionalneeds": "Breakfast"
                }
     */
    @Test
    public void get06() {
        //Set the URL
        spec.pathParams("first", "booking", "second", 37);

        //  Set the expected data

        //Send the request and get the response
        Response response = given(spec).when().get("/{first}/{second}");
        response.prettyPrint();

        //Do assertion
        //1st Way:
        response.
                then().
                statusCode(200).
                contentType(ContentType.JSON).
                body("firstname", equalTo("Sally"),
                        "lastname", equalTo("Brown"),
                        "totalprice", equalTo(111),
                        "depositpaid", equalTo(true),
                        "bookingdates.checkin", equalTo("2013-02-23"),
                        "bookingdates.checkout", equalTo("2014-10-23"),
                        "additionalneeds", equalTo("Breakfast"));

        //2nd Way: We will use JsonPath class
        JsonPath jsonPath = response.jsonPath();//We can extract(cikarmak) the data from body to outside with JsonPath

//        //Hard Assertion  is the common popular one
//        assertEquals("John", jsonPath.getString("firstname"));
//        assertEquals("Smith", jsonPath.getString("lastname"));
//        assertEquals(111, jsonPath.getInt("totalprice"));
//        assertTrue(jsonPath.getBoolean("depositpaid"));
//        assertEquals("2018-01-01", jsonPath.getString("bookingdates.checkin"));
//        assertEquals("2019-01-01", jsonPath.getString("bookingdates.checkout"));
//        assertEquals("Breakfast", jsonPath.getString("additionalneeds"));
//
        //3.Way : Test NG (testing framework) Soft Assertion
        //To do Soft Assertion follow these 3 steps:

        //1st Step: Create SoftAssert object
        SoftAssert softAssert = new SoftAssert();

        //2nd Step: Do assertion by using SoftAssert object
        softAssert.assertEquals(jsonPath.getString("firstname"), "Sally", "firstname did NOT match");
        softAssert.assertEquals(jsonPath.getString("lastname"), "Brown", "lastname did NOT match");
        softAssert.assertEquals(jsonPath.getInt("totalprice"), 111, "totalprice did NOT match");
        softAssert.assertEquals(jsonPath.getBoolean("depositpaid"), true, "depositpaid did NOT match");
        softAssert.assertEquals(jsonPath.getString("bookingdates.checkin"), "2013-02-23", "checkin did NOT match");
        softAssert.assertEquals(jsonPath.getString("bookingdates.checkout"), "2014-10-23", "checkout did NOT match");
        softAssert.assertEquals(jsonPath.getString("additionalneeds"), "Breakfast", "additionalneeds did NOT match");

        //3rd Step: Use assertAll() method.   assertAll() diyerek dogrulamayi kontrol et. Aksi takdirde test hep "PASS" olur.
        softAssert.assertAll();

        /*
            //3.Way : Test NG Soft Assertion   yapmak icin pom.xml'e alttakini yapistirmamiz lazim.
         <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.1.0</version>
        </dependency>
         */


    }
}
