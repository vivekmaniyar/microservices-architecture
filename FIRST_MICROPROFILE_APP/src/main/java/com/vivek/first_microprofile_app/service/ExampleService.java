package com.vivek.first_microprofile_app.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/example")
public class ExampleService {

    @GET
    public String get() {
        return "Hello World!";
    }

}
