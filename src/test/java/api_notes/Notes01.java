package api_notes;

public class Notes01 {

    /*
    ilk once url'mizi manuel postmande kontrol etmemiz lazim
    sonra extends etmemiz lazim base_url class'miza
    @Test(jUnit)
    public void name01(){}


    Tum data'larimiz Java dilinde
    Json'i api kullanir.



    De -Serialization : Json datanin Java objesine cevrilmesi.
    Serialization :  Java objesinin, Json dataya cevrilmesi.

    Serialization islemini "Api" RestAssured library yapacak.
    De -Serialization islemini biz yapicaz, karsidan gelen datayi Java'ya cevirelim ki kullanabilelim.

    2 turlu De -Serialization yapacagiz:
                                        i) Gson: Google tarafindan uretilmistir.
                                        ii) Object Mapper : En populer kullanma yontemi/ library / tool


Junit'i daha eski stabil oldugu icin kullaniyoruz.


    //            base url                       parameter   query parameter starting   key    value  multiple query  key    value
     //   https://restful-booker.herokuapp.com  / booking/      ?                  firstname=Jane    &             lastname=Doe





expected data - gonderdigimiz
actual data - response'in icinde geleen data


                                 ******  is hayatinda dikkat etmemiz gereken sey    *************

  Is hayatinda DELETE yani silmeyi test ederseniz sadece kendi olusturdugunuz data'yi  silin, baska birinin datasini silmeyin.
  Silmeyi test ediyorsaniz sadece yeniden olusturdugunuz datayi silin, var olan hazir datayi asla silmiyoruz.
  Is hayatinda ornek data uzerinden calistirirlar cunku dusunun bankada birinin hesabini sildiniz bu tehlikeli istir.
  Sistemin calisip calismadigini test etmek icin  get put post method'larda devamli yapicaz

    */


    // @ Test  Junitten import ediyoruz obur turlu calismaz cunku @Before annotation Junit testleri oncesi  calisacak



    //Groovy: Java based programming language
   // groovy language Java temelli bir programlama dilidir
  //  Java icinde var




    /*
    pojo class'in avantajlari :
    hizlidir, dinamiktir.
     */


    // Post Put yapacaksaniz "Pojo class" kullanabilirsiniz.


    // Test class'imizin icinde "Exception" olmamali, dinamik olmali her turlu datatyla calisabilmeli.

    // Api > B103 YH  9.Object Mappper 01:45 guzel soru var

// kimligi

/*
Authentication is the process of verifying who a user is.  It confirms users are who they say they are.
kimligi dogrulama
Authorization is the process of verifying what they have access to.  It gives users permission to access a resource.
yetki verecek kimligimize gore yetki alma
 */


}
