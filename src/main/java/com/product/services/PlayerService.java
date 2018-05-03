/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.services;

import com.product.models.*;
import com.product.repository.*;

import java.util.List;

/**
 *
 * @author annafock
 */
public class PlayerService {

    PlayerRepository playerRepository = new PlayerRepository();
    
    //Skapa objekt av TeamService för att kunna använda metoder här
    //men egentligen ska vi undvika att skapa objekt av modellklasser i modellklasser
    //för klasserna ska inte vara beroende av varandra
    TeamService ts = new TeamService();
    
    public List<Player> getPlayers(int id) {
    
      return ts.getTeam(id).getPlayers();  

        
    }
}
