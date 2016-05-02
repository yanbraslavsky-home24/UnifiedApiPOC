package de.home24.environment;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class Launcher extends ResourceConfig {

    private static final String CONTROLLERS_PACKAGE_PREFIX = ".controllers";

    public Launcher() {
        // Add a package used to scan for components.
        packages(this.getClass().getPackage().getName() + CONTROLLERS_PACKAGE_PREFIX);
    }

}
