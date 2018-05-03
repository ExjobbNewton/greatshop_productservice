/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.repository;

import com.product.models.Player;
import com.product.models.Team;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author annafock
 */
public class TeamRepoFake {

    //1. Singelton - skapa ett objekt av sig själv 
    private static TeamRepoFake teamRepo;

    private List<Team> teams;

    private TeamRepoFake() {

        teams = new ArrayList();

        teams.add(new Team(1, "FC Rosengård"));
        teams.add(new Team(2, "Malmö FF"));
        teams.add(new Team(3, "Barcelona"));

        List<Player> players1 = new ArrayList();
        players1.add(new Player(1, "Lotta Schelin"));
        players1.add(new Player(2, "Anita Asante"));
        
        List<Player> players2 = new ArrayList();
        players2.add(new Player(1, "Spelare 1"));
        players2.add(new Player(2, "Spelare 2"));
        
        teams.get(0).setPlayers(players1);
        teams.get(1).setPlayers(players2);

    }

    //2. Singelton
    public static TeamRepoFake getInstance() {
        if (teamRepo == null) {
            teamRepo = new TeamRepoFake();
        }
        return teamRepo;
    }

    public List<Team> getTeams() {
        return teams;
    }
    

}
