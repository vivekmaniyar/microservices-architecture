/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vivek.microprofile_client_app.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 *
 * @author vicky
 */
@RegisterRestClient(configKey = "rclient")
public interface RemoteClient {
    
    @GET
    public String get();
    
    @GET
    @Path("add/{x}/{y}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sum(@PathParam("x")Integer x,@PathParam("y")Integer y);
}
