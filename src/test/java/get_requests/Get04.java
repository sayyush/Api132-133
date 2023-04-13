package get_requests;

import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.hasSize;

public class Get04 extends JsonPlaceHolderBaseUrl {
    /*
        Given
            https://jsonplaceholder.typicode.com/todos
        When
	 	    I send a GET request to the Url
	    And
	        Accept type is “application/json”           when action kisminda yazmamiz lazim accept type'i
	    Then
	        HTTP Status Code should be 200
	    And
	        Response format should be "application/json"
	        alttaki bir body
	    And
	        There should be 200 todos // yapilacaklar listesi 200 tane olmali
	    And
	        "quis eius est sint explicabo" should be one of the todos title
	    And
	        2, 7, and 9 should be among the userIds


     */

    @Test
    public void get04() {

//       //Set the url
//        String url = "https://jsonplaceholder.typicode.com/todos";
//       Response response = given().accept(ContentType.JSON).when().get(url);
//       response.prettyPrint();

       // Yukaridakinin yerine bunu yapicaz:

        //Set the URL(endpoint)
        spec.pathParam("first", "todos");

        //Set the expected data

        //Send the request and get the response
        Response response = given().spec(spec).when().get("{first}");
        response.prettyPrint();

        //Do assertion
        response.
                then().
                statusCode(200).
                contentType(ContentType.JSON). //  There should be 200 todos
                body("id", hasSize(200),
                        "title", hasItem("quis eius est sint explicabo"),
                        "userId", hasItems(2, 7, 9));

        /*
        Bunlar Hamcrest.Mathcers library'den geliyor.
            hasSize() ==> eleman sayisini assert eder.
            hasItem() ==> contains() methodu gibi objenin icerilip icerilmedigini assert eder.
            hasItems() ==> containsAll() methodu gibi birden fazla objenin icerilip icerilmedigini assert eder.

         */







    }
}