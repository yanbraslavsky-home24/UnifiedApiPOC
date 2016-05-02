package de.home24.environment;

import de.home24.api.endpoints.pdp.PdpEndpoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.InetAddress;

/**
 * Created by yan.braslavski on 4/28/16.
 */

public class MainServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String responseString = "Server is running on : " + InetAddress.getLocalHost().getHostAddress();
        resp.getOutputStream().write(responseString.getBytes());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        //user requests the server with his user ID
//        String payload = req.getParameter("payload");
//
//        if (payload == null) {
//            resp.getOutputStream().write("payload is required !".getBytes());
//            return;
//        }
        String responseString = "Server is running on : " + InetAddress.getLocalHost().getHostAddress();
        resp.getOutputStream().write(responseString.getBytes());

        PdpEndpoint endpoint = new PdpEndpoint();
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String responseString = "Server is running on : " + InetAddress.getLocalHost().getHostAddress();
        resp.getOutputStream().write(responseString.getBytes());
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String responseString = "Server is running on : " + InetAddress.getLocalHost().getHostAddress();
        resp.getOutputStream().write(responseString.getBytes());
    }

}