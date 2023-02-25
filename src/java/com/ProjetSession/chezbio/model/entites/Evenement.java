
package com.ProjetSession.chezbio.model.entites;

import java.io.Serializable;
import java.sql.Date;


/**
 *
 * @author djeai
 */
public class Evenement implements Serializable {
    
    // Déclaration des attributs
    int  Id_event;
    String nom;
    String lieux;
    Date dateDebut;
    Date dateFin ;
    String heureDebut;
    String heureFin;
    String description;
    
    
    
    
    public int  getId() {
        return Id_event;
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
        return description;
    }

    public void setId(int Id) {
        this.Id_event = Id;
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
        this.description = description;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
