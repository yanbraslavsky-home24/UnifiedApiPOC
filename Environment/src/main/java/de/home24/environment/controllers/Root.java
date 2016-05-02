package de.home24.environment.controllers;

import com.google.gson.Gson;
import de.home24.environment.models.UserModel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Root Controller will process all requests and rout them to relevant Endpoint
 */
@Path("/")
public class Root {

    @GET
    @Produces("application/json")
    public Response processRequest() {
        UserModel user = new UserModel("Yan", "Braslavsky");
        Gson gson = new Gson();
        return Response.ok(gson.toJson(user)).build();
    }

}
