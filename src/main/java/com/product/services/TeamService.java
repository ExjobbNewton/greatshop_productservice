/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.services;

import com.product.models.*;
import com.product.repository.*;

import java.util.List;

public class TeamService {

    TeamRepository teamRepository = new TeamRepository();

    public List<Team> getTeams() {
        return teamRepository.getTeams();
    }

    public Team getTeam(int id) {
        return teamRepository.getTeam(id);
    }

    public Team addTeam(Team team) {
        System.out.println("TeamService addTeam");
        return teamRepository.addTeam(team);
    }

    public Team updateTeam(int id, Team team) {
        return teamRepository.updateTeam(id, team);
    }

    public void removeTeam(int id) {
        teamRepository.removeTeam(id);
    }
    
    

}
