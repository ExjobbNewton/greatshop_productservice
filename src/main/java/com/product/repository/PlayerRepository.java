/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.repository;

import com.product.models.Player;
import org.hibernate.Session;

import java.util.List;

public class PlayerRepository {

    public List<Player> getPlayers(int id) {
        Session session = HibernateUtil.getSession();
        List<Player> players = session.createCriteria(Player.class).list();

        session.close();

        return players;
    }
}
