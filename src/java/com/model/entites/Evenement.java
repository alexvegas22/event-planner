//hello
package com.model.entites;

import java.io.Serializable;

import java.sql.Timestamp;


/**
 *
 * @author Aimen
 */
public class Evenement implements Serializable {
    
    // Déclaration des attributs
    private int idEvent;
    private int idUser;
    private String nomEvent;
    private String lieux;
   
    private String heureDebut;
    private String heureFin;
    private String description;
    
    
    // Constructeur 

    public Evenement() {
    }

    public Evenement(int idUser, String nomEvent,String lieuxEvent, String heureDebut, String heureFin, String description) {
        this.idUser = idUser;
        this.nomEvent = nomEvent;
        this.lieux = lieuxEvent;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.description = description;
    }

    
    // Getters

    public int getIdEvent() {
        return idEvent;
    }
    public int getIdUserEvent() {
        return idUser;
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
    
    
    // Setters

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }
    public void setIdUserEvent(int idUser) {
        this.idUser = idUser;
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
    
    public String afficherTitreDesColonnes() {
        String message = "";
        message = String.format(" %-10s  %30s %15s %15s %15s %15s %45s", "Id", "IdUser", "Nom", "Lieux", "Email", "HeureDebut", "HeureFin" , "Description");
        message+="\n ----------------------------------------------------------------------------------------------------------------------------";
        return message;
    }
  
    @Override
       public String toString() {
       String message = "";
       message = String.format(" %-10d  %30s %15b %15s %15s %15s %45s ",this.idEvent,this.idUser, this.nomEvent ,this.lieux, this.heureDebut, this.heureFin, this.description); 
       return message;
    }    
    
}
