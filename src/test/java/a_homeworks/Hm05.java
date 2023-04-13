package a_homeworks;

import base_urls.ReqresBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class Hm05 extends ReqresBaseUrl {

        /*
         Given
           https://reqres.in/api/unknown/3
         When
             User send a GET request to the URL
         Then
             HTTP Status Code should be 200
         And
             Response content type is “application/json”
         And
             Response body should be like;(Soft Assertion)
         {
         "data": {
             "id": 3,
             "name": "true red",
             "year": 2002,
             "color": "#BF1932",
             "pantone_value": "19-1664"
         },
         "support": {
             "url": "https://reqres.in/#support-heading",
             "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
         }
 }
       */

    @Test
    public void hm01() {

        // Set the url
        spec.pathParams("first", "unknown", "second", 3);

        // Set the expected data

        // Send the request and get the response
        Response response = given(spec).get("{first}/{second}");  // response obje
        response.prettyPrint();

        // Do assertion

        assertEquals(200, response.statusCode());
        assertEquals("application/json; charset=utf-8", response.contentType());

        JsonPath jsonPath = response.jsonPath();  // JsonPath uzerinden body'ye ulasmamizi saglar
        SoftAssert softAssert = new SoftAssert();  // SoftAssert testng'den geliyor

        // data kismi
        softAssert.assertEquals(jsonPath.getInt("data.id"), 3, "id did not match");
        softAssert.assertEquals(jsonPath.getString("data.name"), "true red", "name did not match");
        softAssert.assertEquals(jsonPath.getInt("data.year"), 2002, "year did not match");
        softAssert.assertEquals(jsonPath.getString("data.color"),"#BF1932" , "color did not match");
        softAssert.assertEquals(jsonPath.getString("data.pantone_value"),"19-1664" , "pantone_value did not match");


        // support kismi
        softAssert.assertEquals(jsonPath.getString("support.url"),"https://reqres.in/#support-heading" , "url did not match");
        softAssert.assertEquals(jsonPath.getString("support.text"),"To keep ReqRes free, contributions towards server costs are appreciated!" , "text did not match");
        softAssert.assertAll(); // soft assertion olmasi icin assertAll() methodu lazim.


        // shift + alt .    intellijde yaklastiriyor
        // shift + alt ,    intellijde uzaklastiriyor

    }
}
