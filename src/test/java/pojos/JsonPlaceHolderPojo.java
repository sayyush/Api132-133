package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)


/*
Pojo is a class which contains
To create a POJO(Plain Old Java Object) Class do the followings  (pojo is more secure, fast)
       1)private variables
       2)Constructor with all parameters   ==> Generate ==> constructor ==> empty
       3)Constructor without parameter
       4)Getters and Setters   okumamiz ve degistirmemiz icin
       5)toString() method
 */

public class JsonPlaceHolderPojo {   // default constructor
/*
 {
                                  "userId": 55,
                                  "title": "Tidy your room",
                                  "completed": false,
                                 }
 */
    private Integer userId;        // encapsulation datamiz daha guvenli
    private String title;
    private Boolean completed;

    public JsonPlaceHolderPojo() {
    }  // Default Constructor without parameter bunu de- serilization islemini yapabilmemiz icin lazim.

    public JsonPlaceHolderPojo(Integer userId, String title, Boolean completed) {
        this.userId = userId;
        this.title = title;
        this.completed = completed;
    }  // Constructor with all parameters

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "JsonPlaceHolderPojo{" +
                "userId=" + userId +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';

        // toString() method  bu class'i komple okuyabilmemiz icin.
    }
}

