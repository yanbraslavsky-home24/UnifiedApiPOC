package de.home24.api.endpoints.example.model;

/**
 * Created by yan.braslavski on 4/27/16.
 */
public class MyResponse {

    private final String registeredName;
    private final String registeredLastName;


    public MyResponse(String registeredName, String registeredLastName) {
        this.registeredName = registeredName;
        this.registeredLastName = registeredLastName;
    }

}