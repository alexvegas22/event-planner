
package com.ProjetSession.chezbio.model.entites;

import java.io.Serializable;


/**
 *
 * @author djeai
 */
public class Evenement implements Serializable {
    
    // Déclaration des attributs
    int idEvent;
    String nomEvent;
    String lieux;
    String heureDebut;
    String heureFin;
    String description;
    
    
    

    public int getIdEvent() {
        return idEvent;
    }

    public String getNomEvent() {
        return nomEvent;
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

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public void setNomEvent(String nomEvent) {
        this.nomEvent = nomEvent;
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

    public void setDescription(String description) {
        this.description = description;
    }
    
}
