package test_data;

import java.util.HashMap;
import java.util.Map;
    public class ReqresTestData  {

        //This method will create a map for payload
        public Map<String, String> expectedDataMapMethod( String name,String job) {
            Map<String, String> expectedData = new HashMap<>();
            if(name !=null){
                expectedData.put("name",name);
            }
            if(job !=null){
                expectedData.put("job",job);
            }

            return expectedData;
        }

    }

