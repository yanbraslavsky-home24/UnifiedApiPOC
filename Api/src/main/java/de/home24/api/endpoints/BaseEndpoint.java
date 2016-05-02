package de.home24.api.endpoints;

import com.amazonaws.services.lambda.runtime.RequestHandler;


/**
 * Created by yan.braslavski on 4/28/16.
 */
public abstract class BaseEndpoint<Request,Response> implements RequestHandler<Request, Response> {

}