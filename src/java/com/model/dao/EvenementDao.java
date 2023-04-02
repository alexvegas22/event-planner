/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model.dao;

import com.model.entites.Evenement;
import java.util.List;

/**
 *
 * @author Aimen
 */
public interface EvenementDao {
    List<Evenement> findAll();
    Evenement findById(int id);
    Evenement findByName(String nom);
    List<Evenement> findByHeureDebut(String heureD);
    List<Evenement> findByHeureFin(String heureF);
    List<Evenement> findByLieux(String lieux);
    boolean delete (int id);
    boolean create(Evenement event);
    boolean update(Evenement event);

    
    
}
