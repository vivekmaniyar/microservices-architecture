/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vivek.microprofile_client_app.service;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 *
 * @author vicky
 */
@RegisterRestClient(configKey = "rclient")
public interface RemoteClient {
    
    @ClientHeaderParam(name = "authorization",value ="{generateJWTToken}")
    @RolesAllowed("chief")
    @GET
    public String get();
    
    @ClientHeaderParam(name = "authorization",value="{generateJWTToken}")
    @RolesAllowed("chief")
    @GET
    @Path("add/{x}/{y}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sum(@PathParam("x")Integer x,@PathParam("y")Integer y);
    
    default String generateJWTToken()
    {
        Config config = ConfigProvider.getConfig();
        String token = config.getValue("jwt-string", String.class);
        String authtoken = "Bearer " + token;
        return authtoken;
    }
}
