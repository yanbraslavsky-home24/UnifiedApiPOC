package de.home24.api.endpoints.example;

import com.amazonaws.services.lambda.runtime.Context;
import de.home24.api.endpoints.BaseEndpoint;
import de.home24.api.endpoints.example.model.MyRequest;
import de.home24.api.endpoints.example.model.MyResponse;

/**
 * Created by yan.braslavski on 4/27/16.
 */
public class ExampleEndpoint extends BaseEndpoint<MyRequest, MyResponse> {

    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
    }

    @Override
    public MyResponse handleRequest(MyRequest request, Context context) {
        String greetingString = String.format("Hello %s %s.", request.getFirstName(), request.getLastName());
        return new MyResponse(greetingString);
    }
}