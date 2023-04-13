package a_homeworks;

import base_urls.ReqresBaseUrl;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import test_data.ReqresTestData;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Hm07 extends ReqresBaseUrl {

    /*
          Given
              1) https://reqres.in/api/users
              2) {
                  "name": "morpheus",
                  "job": "leader"
                  }
          When
              I send POST Request to the Url
          Then
              Status code is 201
              And response body should be like {
                                                  "name": "morpheus",
                                                  "job": "leader",
                                                  "id": "496",
                                                  "createdAt": "2022-10-04T15:18:56.372Z"
                                                }
       */
    @Test
    public void post07() {
        //        i) Set the URL
        spec.pathParam("first", "users");

        //        ii) Set the expected data
        Map<String, String> expectedData = new ReqresTestData().expectedDataMapMethod("morpheus", "leader");

        //        Map<String,String> expectedData = new HashMap<>();
        //        expectedData.put("name","morpheus");
        //        expectedData.put("job","leader");
        //        System.out.println("expectedData = " + expectedData);

        //        iii) Send the request and get the response
        Response response = given().spec(spec).body(expectedData).when().post("/{first}");
        response.prettyPrint();

        //        iv) Do assertion (DOGRULAMA)

        Map<String, String> actualData = response.as(HashMap.class);
        System.out.println("actualData = " + actualData);

        Assert.assertEquals(201, response.getStatusCode());
        Assert.assertEquals(expectedData.get("name"), actualData.get("name"));
        Assert.assertEquals(expectedData.get("job"), actualData.get("job"));

    }
}

