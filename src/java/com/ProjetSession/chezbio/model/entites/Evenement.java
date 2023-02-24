
package com.ProjetSession.chezbio.model.entites;

import java.io.Serializable;


/**
 *
 * @author djeai
 */
public class Evenement implements Serializable {
    
    // Déclaration des attributs
    String Id;
    String nom;
    String lieux;
    String heureDebut;
    String heureFin;
    String Description;
    
    
    

    public String getId() {
        return Id;
    }

    public String getNom() {
        return nom;
    }

    public String getLieux() {
        return lieux;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public String getDescription() {
        return Description;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLieux(String lieux) {
        this.lieux = lieux;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
