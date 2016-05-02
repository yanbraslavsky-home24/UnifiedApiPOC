package de.home24.environment;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by yan.braslavski on 4/28/16.
 */
public class Main {
    public static final String DEBUG_PORT = "8090";

    //test change
    public static void main(String[] args) throws Exception {
        String port = System.getenv("PORT");
        if (port == null)
            port = DEBUG_PORT;

        Server server = new Server(Integer.valueOf(port));
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new MainServlet()), "/*");

        //TODO : Routing can be done here ...
        //Therefore we need to find all the endpoints (using reflection)
        //and add generate servlets for each ...

//        // Add a websocket to a specific path spec
//        ServletHolder holder = new ServletHolder("ws-endpoint", WsServlet.class);
//        context.addServlet(holder, "/socket/*");

        server.start();
        server.join();
    }
}
