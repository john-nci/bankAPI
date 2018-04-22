/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bankaccount.bankapi.resources;

/**
 *
 * @author JMcN
 * AccountResource.java
 */
import com.bankaccount.bankapi.model.Account;
import com.bankaccount.bankapi.services.AccountService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/account")
public class AccountResource {
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_XML)
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)

}
