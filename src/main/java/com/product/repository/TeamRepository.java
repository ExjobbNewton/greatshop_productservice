/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.repository;

import com.product.models.*;
import org.hibernate.Session;

import java.util.List;


public class TeamRepository {
    
    public List<Team> getTeams(){
        Session session = HibernateUtil.getSession();
        List<Team> teams = session.createCriteria(Team.class).list();
        
        //Hämtar objekt av players till varje team
        for (int i = 0; i < teams.size(); i++){
            teams.get(i).getPlayers().size(); //Behöver vara size även om det är listan vi vill åt
        }
        
        session.close();
        
        return teams;              
    }
    
    public Team addTeam(Team team){
        System.out.println("TeamRepository addTeam");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(team);
        session.getTransaction().commit();
        session.close();
        return team;       
    }
    
    public Team getTeam(int id){
        Session session = HibernateUtil.getSession();
        Team team = (Team)session.get(Team.class, id);     
        team.getPlayers().size(); //Behöver anropa size även om det är själva listan jag vill åt
        System.out.println("spelarna");
        session.close();
        
        return team;     
    }
    
    public Team removeTeam(int id){
        Session session = HibernateUtil.getSession();
        session.beginTransaction(); //Sätter igång transaction - alltså genomför bara om allt körs, annars inget
        Team team = new Team();
        team.setId(id);
        session.delete(team);
        session.getTransaction().commit(); //Avslutar transaction
        session.close();

        return team;       
    }
    
    public Team updateTeam(int id, Team team){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Team newTeam = (Team)session.get(Team.class, id);
        newTeam.setName(team.getName());
        session.update(newTeam);       
        session.getTransaction().commit(); //Avslutar transaction
        session.close();
        
        return team;            
    }
    
    
}
