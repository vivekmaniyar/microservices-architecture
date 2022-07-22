package com.vivek.first_microprofile_app.service;

import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/example")
public class ExampleService {
    
    @Inject microprofilebean mb;

    @RolesAllowed("chief")
    @GET
    public String get() {
        return "Hello From Microprofile App!";
    }
    
    @RolesAllowed("chief")
    @GET
    @Path("add/{x}/{y}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sum(@PathParam("x")Integer x,@PathParam("y")Integer y){
        Integer r = x+y;
        return r.toString();
    }
    
    @RolesAllowed("chief")
    @GET
    @Path("getallstates")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<TblState> getAllStates(){
        return mb.getAllStates();
    }

}
