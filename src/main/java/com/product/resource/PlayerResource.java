/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.resource;


import com.product.models.Player;
import com.product.services.PlayerService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PlayerResource {
    
    PlayerService ps = new PlayerService();
    
    //Skapa en get för att få alla spelare som spelar i lag om vi har fått id från i adressen
    @GET
    public List<Player> getPlayers(@PathParam("teamId") int id){
        return ps.getPlayers(id);
    }
    
    
}
