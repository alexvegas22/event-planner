/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProjetSession.chezbio.Dao.Utilisateur;

import com.ProjetSession.chezbio.model.entites.Utilisateur;
import java.util.List;

/**
 *
 * @author djeai
 */
public interface UtilisateurDao {
    List<Utilisateur> findAll();
    Utilisateur findById(String id);
    Utilisateur findByName(String nom);
    Utilisateur findByEmail(String email);
    Utilisateur existsByEmailAndPassword(String email, String motDePasse);
    boolean delete(int id);
    boolean create(Utilisateur utilisateur);
    boolean update(Utilisateur utilisateur);
}
