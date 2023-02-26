//hello
package com.ProjetSession.chezbio.model.entites;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;


/**
 *
 * @author Aimen
 */
public class Evenement implements Serializable {
    
    // Déclaration des attributs
    private int idEvent;
    private String nomEvent;
    private String lieux;
    private Time heureDebut;
    private Time heureFin;
    private String description;
    
    
    // Constructeur 

    public Evenement() {
    }

    public Evenement(int idEvent) {
        this.idEvent = idEvent;
    }

    public Evenement(String nomEvent, Time heureDebut, Time heureFin, String description) {
        this.nomEvent = nomEvent;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.description = description;
    }
    
    

    public Evenement(int idEvent, String nomEvent, String lieux, Time heureDebut, Time heureFin, String description) {
        this.idEvent = idEvent;
        this.nomEvent = nomEvent;
        this.lieux = lieux;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.description = description;
    }
    
    // Getters

    public int getIdEvent() {
        return idEvent;
    }

    public String getNomEvent() {
        return nomEvent;
    }

    public String getLieux() {
        return lieux;
    }

    public Time getHeureDebut() {
        return heureDebut;
    }

    public Time getHeureFin() {
        return heureFin;
    }

    public String getDescription() {
        return description;
    }
    
    
    // Setters

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public void setNomEvent(String nomEvent) {
        this.nomEvent = nomEvent;
    }

    public void setLieux(String lieux) {
        this.lieux = lieux;
    }

    public void setHeureDebut(Time heureDebut) {
        this.heureDebut = heureDebut;
    }

    public void setHeureFin(Time heureFin) {
        this.heureFin = heureFin;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String afficherTitreDesColonnes() {
        String message = "";
        message = String.format(" %-10s  %30s %15s %15s %15s %45s", "Id", "Nom", "Lieux", "Email", "HeureDebut", "HeureFin" , "Description");
        message+="\n ----------------------------------------------------------------------------------------------------------------------------";
        return message;
    }
  
    @Override
       public String toString() {
       String message = "";
       message = String.format(" %-10d  %30s %15b %15s %15s %15s %45s ",this.idEvent,this.nomEvent ,this.lieux, this.heureDebut, this.heureFin, this.description); 
       return message;
    }
    
    
}
