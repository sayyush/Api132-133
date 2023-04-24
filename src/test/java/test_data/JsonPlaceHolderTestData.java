package test_data;

import java.util.HashMap;
import java.util.Map;

public class JsonPlaceHolderTestData {

    /*
      Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("userId", 21);
        expectedData.put("title", "Wash the dishes");
        expectedData.put("completed", false);
        System.out.println("expectedData = " + expectedData);
     */

    //This method will create a map for payload

    public Map<String, Object> expectedDataMapMethod(Integer userId, String title, Boolean completed) {
        // Return type
        Map<String, Object> expectedData = new HashMap<>();
        if(userId !=null){
            expectedData.put("userId",userId);
        }
        if(title !=null){
            expectedData.put("title",title);
        }
        if(completed !=null){
            expectedData.put("completed",completed);
        }

        return expectedData;
    }
        // primitve'ler null deger kabul etmez o yuzden Wrapper class kullaniyoruz yukarida 18. satirda
}