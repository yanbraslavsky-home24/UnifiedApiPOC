package de.home24.environment.models;

/**
 * Created by yan.braslavski on 5/2/16.
 */
public class UserModel {

    private final String username;
    private final String password;

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
