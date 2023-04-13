package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderBaseUrl {

    protected RequestSpecification spec; // variable  // talebimi spesifik(belirli ozel belli kesin) hale getiricem.
 // "RequestSpecification (interface) spec" ilk basta bu default / NULL oluyor.
    // Altta spec'e degerini atiyacak          Interface'lerde contractor olmaz.
    @Before  // Junit  //This method will run before each @Test methods. Her test methodundan once calisir.
    public void setUp() {

        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri("https://jsonplaceholder.typicode.com").build();

    }
}
