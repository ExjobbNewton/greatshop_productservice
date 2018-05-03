/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.resource;

import com.product.models.Team;
import com.product.services.TeamService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/teams") //Vi behöver berätta att den här är sökvägen /teams
@Produces(MediaType.APPLICATION_JSON)//Talar om att det finns metoder ska producera någonting, och vilken datatyp de har (kan också skrivas innan ensklida metoder)
@Consumes(MediaType.APPLICATION_JSON)//Detta gör att http kommer leta efter en post-metod
public class TeamResource {

    TeamService teamService = new TeamService();

    @GET
    public List<Team> getTeams() {
        System.out.println("step 1. Team Resource getTeams, storlek ");
        //Skicka förfrågan till service som ska göra saker åt oss
        
        return teamService.getTeams();
    }

    @GET
    @Path("/{teamId}") //Talar om att det är en inparameter som visar vart adressen ska leda. Den letar efter fortsättning och lägger in den här
    public Team getTeam(@PathParam("teamId") int id) { //Detta är alltså ett argument, talar om att argumentet ska komma från adressen
        return teamService.getTeam(id);
    }

    @POST //Producerar ett objekt (team - return) och konsumerar ett objekt (team - inargumentet)
    public Team addTeam(Team team) {
        System.out.println("TeamResource addTeam");
        return teamService.addTeam(team);
    }

    @PUT //Använder både produces och consumes
    @Path("/{teamId}")
    public Team updateTeam(@PathParam("teamId") int id, Team team) {

        return teamService.updateTeam(id, team);              
    }

    @DELETE
    @Path("/{teamId}")
    public void removeTeam(@PathParam("teamId") int id) {
        teamService.removeTeam(id);
    }
  
    @Path("/{teamId}/players") //Returnerar players som hör till det valda teamet
    public PlayerResource player() {
        return new PlayerResource();
    }
}
