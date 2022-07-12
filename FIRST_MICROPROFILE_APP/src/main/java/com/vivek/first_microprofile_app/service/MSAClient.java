/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vivek.first_microprofile_app.service;

import javax.ws.rs.GET;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 *
 * @author vicky
 */
@RegisterRestClient(configKey = "myclient")
public interface MSAClient {
    
    @GET
    public String get();
}
