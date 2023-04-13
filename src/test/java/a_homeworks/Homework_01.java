//package a_homeworks;
//
//public class Homework_01 {

    // 24.03.23
//Homework1:

   /*
        Given
            https://reqres.in/api/users/3
        When
            User sends a GET Request to the url
        Then
            HTTP Status Code should be 200
        And
            Content Type should be JSON
        And
            Status Line should be HTTP/1.1 200 OK
     */

//    @Test
//    public void get01(){
//
//        String url = "https://reqres.in/api/users/3";
//        Response response = given().when().get(url);
//        //response.prettyPrint();
//
//        response.
//                then().
//                statusCode(200).
//                contentType(ContentType.JSON).statusLine("HTTP/1.1 200 OK");
//
//    }}



////Homework2:

    /*
        Given
            https://reqres.in/api/users/23
        When
            User send a GET Request to the url
        Then
            HTTP Status code should be 404
        And
            Status Line should be HTTP/1.1 404 Not Found
        And
            Server is "cloudflare"
        And
            Response body should be empty

     */
//
//
//    @Test
//    public void get02(){
//        //Set the url
//        spec.pathParams("first","users","second",23);
//
//        //Set the expected data
//
//        //Send the request and get the response
//        Response response = given().spec(spec).when().get("/{first}/{second}");
//        response.prettyPrint();
//
//
//        response.
//                then().
//                statusCode(404).
//                statusLine("HTTP/1.1 404 Not Found").
//                header("Server","cloudflare").
//                body("", anEmptyMap());//This is no key value pair in the response body. So it is an empty map.
//
//    }
//

//Homework3:
    /*
       Given
           https://reqres.in/api/users/2
       When
           User send GET Request to the URL
       Then
           HTTP Status Code should be 200
       And
           Response format should be “application/json”
       And
           “email” is “janet.weaver@reqres.in”,
       And
           “first_name” is "Janet"
       And
           “last_name” is "Weaver"
       And
           "text" is "To keep ReqRes free, contributions towards server costs are appreciated!"
    */


//    @Test
//    public void get03(){
//
//        spec.pathParams("first","users","second",2);
//        Response response = given().spec(spec).when().get("/{first}/{second}");
//        response.prettyPrint();
//
//        response.
//                then().
//                statusCode(200).
//                contentType(ContentType.JSON).
//                body("data.email",equalTo("janet.weaver@reqres.in"),
//                        "data.first_name",equalTo("Janet"),"data.last_name",equalTo("Weaver"),
//                        "support.text",equalTo("To keep ReqRes free, contributions towards server costs are appreciated!"));
//    }
//
//
////Homework4:
//
//
 /*
        Given
            https://restful-booker.herokuapp.com/booking?firstname=Brandon&lastname=Wilson
        When
            User sends get request to the URL
        Then
            Status code is 200
        And
            Among the data there should be someone whose firstname is "Brandon" and lastname is "Wilson"

 */

//
//    @Test
//    public void get04(){
//
////        Given
////        https://restful-booker.herokuapp.com/booking?firstname=Brandon&lastname=Wilson
//
//        spec.pathParam("first","booking").
//                queryParams("firstname","Brandon","lastname","Wilson");
//
////        When
////        User sends get request to the URL
//        Response response = given().spec(spec).when().get("/{first}");
//        response.prettyPrint();
//
////        Then
////        Status code is 200
//        Assert.assertEquals(200,response.getStatusCode());
//
////        And
////        Among the data there should be someone whose firstname is "Brandon" and lastname is "Wilson"
//        Assert.assertTrue(response.asString().contains("bookingid"));
//
//    }
//
//
////Homework5:
//
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
//    @Test
//    public void get05(){
//
//        spec.pathParams("first","unknown","second",3);
//        Response response = given().spec(spec).when().get("/{first}/{second}");
//        response.prettyPrint();
//
//        JsonPath json = response.jsonPath();
//        SoftAssert softAssert = new SoftAssert();
//
//        softAssert.assertEquals(json.getString("data.name"),"true red","Name did not match");
//        softAssert.assertEquals(json.getInt("data.year"),2002,"Year did not match");
//        softAssert.assertEquals(json.getString("data.color"),"#BF1932","Color did not match");
//        softAssert.assertEquals(json.getString("data.pantone_value"),"19-1664","pantone_value did not match");
//        softAssert.assertEquals(json.getInt("data.id"),3,"Id did not match");
//
//        softAssert.assertAll();
//
//    }
//
//}
