package utils;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class ObjectMapperUtils {

     // <T> T ==> Herhangi bir data tipi   <> bunun icindeki T sadece isim K M de koyabilirsin.
    // ObjectMapper().readValue(json, cls) methodu 1. parametrede aldigi String formatindaki Json datayi,
    // 2. parametrede belirtilen Java objesine cevirir.

    //This method will accept json data as String, then convert it any data type
    public static <T> T convertJsonToJavaObject(String json, Class<T> cls) {// <T>  Generic Method yani type
        try {                              // aldigi her hangi data'yi String'e cevirecek
            return new ObjectMapper().readValue(json, cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

// 10. satirda <T> yerine Object yazarsak  parantez icinde String jsondan sonrada object yazmamiz gerekecek,
// obje donerse biz yeniden onu map'e cevirmemiz gerekecek, Type Casting yapmam lazim.
// ama biz onu generic yaparsak her ne donerse o data type'inde doner. Bu ise type ile Obje arasindaki farkdir.
// Object yavastir, type casting lazim, method'lari yoktur.
