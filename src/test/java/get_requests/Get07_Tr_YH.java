package get_requests;

import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Get07_Tr_YH extends JsonPlaceHolderBaseUrl {

     /*      Groovy language kullandik
        Given
	   	    https://jsonplaceholder.typicode.com/todos
		When
			 I send GET Request to the URL
		Then
			 1)Status code is 200
			 2)Print all ids greater than 190 on the console
			   Assert that there are 10 ids greater than 190
			 3)Print all userIds whose ids are less than 5 on the console
			   Assert that the number of userIds whose ids are less than 5 is 4
			 4)Print all titles whose ids are less than 5
			   Assert that "delectus aut autem" is one of the titles whose id is less than 5
     */

    @Test
    public void get07_Tr() {

        // Set the url
        spec.pathParam("first", "todos");

        // Set the expected data

        // Send the request and get the response
        Response response = given().spec(spec).get("/{first}");
        response.prettyPrint();


        // Do assertion
       // Recommended Way
        assertEquals(200, response.statusCode()); // Status code is 200
        JsonPath jsonPath = response.jsonPath(); // Print all ids greater than 190 on the console

        List<Integer> intListGroovy = jsonPath.getList("findAll{it.id>190}.id");//Groovy: Java based programming language
        System.out.println("intListGroovy = " + intListGroovy);                      // groovy language Java temelli bir programlama dilidir
        assertEquals(10, intListGroovy.size());


//        3)Print all userIds whose ids are less than 5 on the console
        List<Integer> userIdList = jsonPath.getList("findAll{it.id<5}.userId");
        System.out.println("userIdList = " + userIdList);
//        Assert that the number of userIds whose ids are less than 5 is 4
        assertEquals(4, userIdList.size());


//        4)Print all titles whose ids are less than 5
        List<String> titleList = jsonPath.getList("findAll{it.id<5}.title");
        System.out.println("titleList = " + titleList);
//        Assert that "delectus aut autem" is one of the titles whose id is less than 5
        assertTrue(titleList.contains("delectus aut autem"));











    }

}
