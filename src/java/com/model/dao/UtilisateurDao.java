
package com.model.dao;

import com.model.entites.Utilisateur;
import java.util.List;

/**
 *
 * @author Aimen
 * 
 */
public interface UtilisateurDao {
    List<Utilisateur> findAll();
    List<Utilisateur> findSearch(String nom);
    Utilisateur findById(int id);
    Utilisateur findByName(String nom);
    Utilisateur findByEmail(String email);
    Utilisateur existsByEmailAndPassword(String email, String motDePasse);
    boolean delete(int id);
    boolean create(Utilisateur utilisateur);
    boolean update(Utilisateur utilisateur);
}
