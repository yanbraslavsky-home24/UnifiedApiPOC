package de.home24.api.endpoints.example.model;

/**
 * Created by yan.braslavski on 4/27/16.
 */
public class MyResponse {
    String greetings;

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    public MyResponse(String greetings) {
        this.greetings = greetings;
    }

    public MyResponse() {
    }
}