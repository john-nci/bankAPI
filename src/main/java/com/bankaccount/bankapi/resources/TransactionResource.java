/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bankaccount.bankapi.resources;

/**
 *
 * @author JMcN
 * TransactionResource.java
 */

import com.bankaccount.bankapi.model.Transaction;
import com.bankaccount.bankapi.services.TransactionService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/transaction")
public class TransactionResource {
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_XML)
    
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)

}
