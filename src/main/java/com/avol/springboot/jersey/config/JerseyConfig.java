package com.avol.springboot.jersey.config;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * JAX-RS configuration class, register resource (@Path) classes here.
 *
 * Created by Durga on 7/10/2015.
 */
@ApplicationPath(value = "/avol")
public class JerseyConfig extends ResourceConfig{

    public JerseyConfig() {
        packages(true, "com.avol.springboot.jersey.controller");
    }
}
