/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service;

import com.model.dao.EvenementDaoImpl;
import com.model.entites.Evenement;
import java.util.List;

/**
 *
 * @author djeai
 */
public class EvenementService {
    
    private List<Evenement> listeEvenements;
    Evenement evenement = null;
    EvenementDaoImpl dao= new EvenementDaoImpl();
    boolean retour = false;
    
    public List<Evenement> afficherLesEvenement() {
        listeEvenements = dao.findAll();
        return listeEvenements;
    }
        public Evenement chercherEvenementParID(int id) {
       evenement = dao.findById(id);
        return evenement;
    }
    
    public List<Evenement> chercherEvenementParUserID(int id) {
       listeEvenements = dao.findByIdUser(id);
        return listeEvenements;
    }
    
    public Evenement chercherUnEvenementParNom(String nom) {
       evenement = dao.findByName(nom);
        return evenement;
    }
    
    public List<Evenement> chercherEvenementParRequete(String nom){
        listeEvenements = dao.eventSearch(nom);
        return listeEvenements; 
    }
    
    public List<Evenement> chercherEvenementParHeureDebut(String heureD){
        listeEvenements = dao.findByHeureDebut(heureD);
        return listeEvenements;
    }
    
    public List<Evenement> chercherEvenementsParHeureFin(String heureF){
        listeEvenements = dao.findByHeureFin(heureF);
        return listeEvenements;
    }
    
    public List<Evenement> chercherUnEvenementparLieux(String lieux){
        listeEvenements = dao.findByLieux(lieux);
        return listeEvenements;
    }
    
    public boolean supprimerUnEvenement(int id){
           if(dao.delete(id)){
            retour = true;
          }
    return retour;
    }
    
    public boolean ajouterUnEvenement(Evenement evenement){
           if(dao.create(evenement)){
            retour = true;
          }
    return retour;
    }
    
    public boolean modifierUnEvenement(Evenement evenement){
           if(dao.update(evenement)){
            retour = true;
          }
    return retour;
    }
 
}
