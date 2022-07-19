package com.vivek.first_microprofile_app.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/example")
public class ExampleService {

    @GET
    public String get() {
        return "Hello From Microprofile App!";
    }
    
    @GET
    @Path("add/{x}/{y}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sum(@PathParam("x")Integer x,@PathParam("y")Integer y){
        Integer r = x+y;
        return r.toString();
    }

}
