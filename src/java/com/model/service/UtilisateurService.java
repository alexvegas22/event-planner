/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model.service;

import com.model.dao.UtilisateurImpDao;
import com.model.entites.Utilisateur;
import java.util.List;

/**
 *
 * @author Djemaoune Aimen
 */
public class UtilisateurService {
    
    private List<Utilisateur> listeUtilisateurs;
    Utilisateur utilisateur = null;
    UtilisateurImpDao dao = new UtilisateurImpDao();
    boolean retour = false;
    
    public List<Utilisateur> afficherLesUtilisateurs() {
        listeUtilisateurs = dao.findAll();
        return listeUtilisateurs;
    }
    
    public Utilisateur chercherUtilisateurParID(int id) {
       utilisateur = dao.findById(id);
        return utilisateur;
    }
    
    public Utilisateur chercherUtilisateurParNom(String nom) {
       utilisateur = dao.findByName(nom);
        return utilisateur;
    }
    
    public Utilisateur chercherUtilisateurParEmail(String email) {
       utilisateur = dao.findByEmail(email);
        return utilisateur;
    }
    
    public Utilisateur verifierEmailMotDePasse(String email, String motDePasse) {
          utilisateur = dao.existsByEmailAndPassword(email, motDePasse);
          
        return utilisateur;
    }
    
    public boolean supprimerUnUtilisateur(int id){
           if(dao.delete(id)){
            retour = true;
          }
    return retour;
    }
    
    public boolean ajouterUnUtilisateur(Utilisateur utilisateur){
           if(dao.create(utilisateur)){
            retour = true;
          }
    return retour;
    }
    
    public boolean modifierUnUtilisateur(Utilisateur utilisateur){
           if(dao.update(utilisateur)){
            retour = true;
          }
    return retour;
}
}
