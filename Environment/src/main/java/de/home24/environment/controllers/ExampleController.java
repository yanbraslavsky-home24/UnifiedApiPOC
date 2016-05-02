package de.home24.environment.controllers;

import com.amazonaws.services.lambda.runtime.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.home24.api.endpoints.BaseEndpoint;
import de.home24.environment.emulation.AwsLambdaEmulatedContext;
import de.home24.environment.models.UserModel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * RootController Controller will process all requests and rout them to relevant Endpoint
 */
@Path("/example")
public class ExampleController extends BaseEndpoint<UserModel, UserModel> {

    //we want to see our nulls in response for debug purposes
    private final Gson gson = new GsonBuilder().serializeNulls().create();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response processRequest(@QueryParam("firstname") String firstName, @QueryParam("lastname") String lastName) {

        //Here we create the exact parameter model that we expect
        UserModel user = new UserModel(firstName, lastName);

        //now we route the request through the endpoint handle exactly as API Gateway would do it
        UserModel responseModel = handleRequest(user, new AwsLambdaEmulatedContext());

        //we are forwarding to the listener the response
        return Response.ok(gson.toJson(responseModel)).build();
    }

    @Override
    public UserModel handleRequest(UserModel request, Context context) {
        return request;
    }
}